package com.example.firstproject.service;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest  // 스프링부트와 연동한 통합 테스트 수행
class ArticleServiceTest {

    @Autowired
    ArticleService articleService;

    @Test
    void index() {
        // 예상
        Article a = new Article(1L, "rkrkrkrk", "11111");
        Article b = new Article(2L, "sksksksk", "22222");
        Article c = new Article(3L, "ekekekek", "33333");

        List<Article> expected = new ArrayList<Article>(Arrays.asList(a,b,c));

        // 실제
        List<Article> articles = articleService.index();

        // 비교
        assertEquals(expected.toString(), articles.toString()); // 예상값(앞)과 실제값(뒤)를 비교해주는 JUnit의 메소드
    }

    @Test
    void show_success() { // 성공을 유도한 테스트
        // 존재하는 id 입력
        // 예상
        Long id = 1L;
        Article expected = new Article(id, "rkrkrkrk", "11111");

        // 실제
        Article article = articleService.show(id);

        // 비교
        assertEquals(expected.toString(), article.toString());
    }

    @Test
    void show_fail() { // 실패를 유도한 테스트
        // 존재하지 않는 id 입력
        // 예상
        Long id = -1L;
        Article expected = null; // 서비스에서 가져오는 id가 존재하지 않을 경우에 null을 반환하기로 했음

        // 실제
        Article article = articleService.show(id);

        // 비교
        assertEquals(expected, article);
    }

    @Test
    @Transactional
    void create_success() {
        // title과 content만 있는 dto 입력
        // 예상
        String title = "fkfkfkfk";
        String content = "44444";
        ArticleForm dto = new ArticleForm(null, title, content);

        Article expected = new Article(4L, title, content);

        // 실제
        Article article = articleService.create(dto);

        // 비교
        assertEquals(expected.toString(), article.toString());
    }

    @Test
    @Transactional
    void create_fail() {
        // id가 포함된 dto 입력 (업데이트 방지)
        // 예상
        String title = "fkfkfkfk";
        String content = "44444";
        ArticleForm dto = new ArticleForm(4L, title, content);

        Article expected = null;

        // 실제
        Article article = articleService.create(dto);

        // 비교
        assertEquals(expected, article);
    }

    @Test
    @Transactional
    void update_success() {
        // 존재하는 id와 title, content가 있는 dto 입력
        // 예상
        Long id = 1L;
        String title = "가가가가";
        String content = "일일일일일";
        ArticleForm dto = new ArticleForm(id, title, content);

        Article expected = new Article(id, title, content);

        // 실제
        Article article = articleService.update(id, dto);
        
        // 비교
        assertEquals(expected.toString(), article.toString());
    }

    @Test
    @Transactional
    void update_success_title() {
        // 존재하는 id와 title만 있는 dto 입력
        // 예상
        Long id = 1L;
        String title = "가가가가";
        String content = null;
        ArticleForm dto = new ArticleForm(id, title, content);

        Article expected = new Article(id, title, "11111");

        // 실제
        Article article = articleService.update(id, dto);

        // 비교
        assertEquals(expected.toString(), article.toString());
    }

    @Test
    @Transactional
    void update_fail() {
        // 존재하지 않는 id의 dto 입력
        // 예상
        Long id = -1L;
        ArticleForm dto = new ArticleForm(id, "가가가가", null);

        Article expected = null;

        // 실제
        Article article = articleService.update(id, dto);

        // 비교
        assertEquals(expected, article);
    }

    @Test
    @Transactional
    void delete_success() {
        // 존재하는 id 입력
        // 예상
        Long id = 1L;
        Article expected = new Article(id, "rkrkrkrk", "11111");

        // 실제
        Article article = articleService.delete(id);

        // 비교
        assertEquals(expected.toString(), article.toString());
    }

    @Test
    @Transactional
    void delete_fail() {
        // 존재하지 않는 id 입력
        // 예상
        Long id = -1L;
        Article expected = null;

        // 실제
        Article article = articleService.delete(id);

        // 비교
        assertEquals(expected, article);
    }
}