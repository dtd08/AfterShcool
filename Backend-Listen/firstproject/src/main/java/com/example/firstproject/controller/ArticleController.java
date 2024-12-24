package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@Slf4j // 로깅 어노테이션
public class ArticleController {

    @Autowired  // 스프링부트가 미리 생성해놓은 객체를 가져다가 자동으로 연결함
    private ArticleRepository articleRepository;

    @GetMapping("/article/new")
    public String newArticleForm() {
        return "article/new";
    }

    @PostMapping("/article/create")
    public String createArticle(ArticleForm form) {
        log.info(form.toString());
        System.out.println(form.toString());

        // 1. dto 객체를 entity로 변환
        Article article = form.toEntity();
        log.info(article.toString());
        //System.out.println(article.toString());

        // 2. repository에게 entity를 db 안에 저장하도록 명령
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        //System.out.println(saved.toString());

        return "redirect:/article/" + saved.getId();
    }

    @GetMapping("/article/{id}")
    public String show(@PathVariable Long id, Model model) {
        log.info("id = " + id);
        
        // 1. id로 데이터를 가져옴 => repository 활용!
        Article articleEntity = articleRepository.findById(id).orElse(null);
        
        // 2. 가져온 데이터를 모델에 등록
        model.addAttribute("article", articleEntity);

        // 3. 보여줄 페이지 설정
        return "article/show";
    }

    @GetMapping("articles")
    public String index(Model model) {
        // 1. 모든 Article 가져오기
        List<Article> articleEntityList = articleRepository.findAll();

        // 2. 가져온 Article 묶음을 View로 전달
        model.addAttribute("articleList", articleEntityList);

        // 3. 보여줄 페이지 설정
        return "/article/index";
    }

    @GetMapping("/article/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        // 1. 수정할 데이터 가져오기
        Article articleEntity = articleRepository.findById(id).orElse(null);

        // 2. 모델에 데이터 등록
        model.addAttribute("article", articleEntity);

        // 3. 뷰 페이지 설정
        return "article/edit";
    }

    @PostMapping("/article/update")
    public String update(ArticleForm form) {
        log.info(form.toString());

        // 1. DTO -> Entity 변환
        Article articleEntity = form.toEntity();
        log.info(articleEntity.toString());

        // 2. Entity를 DB로 저장
        // 2-1. DB에서 기존 데이터를 가져옴
        Article target = articleRepository.findById(articleEntity.getId()).orElse(null);

        // 2-2. 기존 데이터가 존재할 시 값을 갱신
        if (target != null) {
            articleRepository.save(articleEntity);
        }

        // 3. 수정 결과 페이지로 redirect
        return "redirect:/article/" + articleEntity.getId();
    }

    @GetMapping("/article/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes rttr) {
        log.info("삭제 요청이 들어왔습니다.");

        // 1. 삭제 대상 가져오기
        Article target = articleRepository.findById(id).orElse(null);

        // 2. 대상 삭제 처리
        if (target != null) {
            articleRepository.delete(target);
            rttr.addFlashAttribute("msg", "삭제가 완료되었습니다.");  // 메모리를 아주 잠깐 사용하다가 삭제시키는 메소드 (변수처럼 메모리 사용 x)

        }

        // 3. 결과 데이터로 redirect
        return "redirect:/articles";
    }

}
