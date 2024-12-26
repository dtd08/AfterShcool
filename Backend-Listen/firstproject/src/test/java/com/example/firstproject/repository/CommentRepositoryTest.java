package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import com.example.firstproject.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest // JPA와 연동한 테스트
class CommentRepositoryTest {

    @Autowired CommentRepository commentRepository;

    @Test
    @DisplayName("특정 게시글의 모든 댓글 조회") // 테스트 결과 명칭 변경
    void findByArticleId() {
        /* Case1: 4번 게시글의 모든 댓글 조회 */
        {
            // 입력 데이터 준비
            Long articleId = 4L;

            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상
            Article article = new Article(articleId, "당신의 인생 영화는?", "댓글 ㄱ"); // 오타 없게 주의
            
            Comment a = new Comment(1L, article, "Park", "굳 윌 헌팅");
            Comment b = new Comment(2L, article, "Kim", "아이 엠 샘");
            Comment c = new Comment(3L, article, "Choi", "쇼생크 탈출");

            List<Comment> expected = Arrays.asList(a,b,c);

            // 검증
            assertEquals(expected.toString(), comments.toString());

        } // {}로 한 메소드에 여러 케이스를 테스트 가능

        /* Case2: 1번 게시글(댓글이 없는 게시글) 조회 */
        {
            // 입력 데이터 준비
            Long articleId = 1L;

            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상
            Article article = new Article(articleId, "rkrkrkrk", "11111");

            List<Comment> expected = Arrays.asList();

            // 검증
            assertEquals(expected.toString(), comments.toString(), "1번 글은 댓글 없음.");
        }

        /* Case3: 9번 게시글의 모든 댓글 조회 */
        {
            // 입력 데이터 준비
            Long articleId = 1L;

            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상
            Article article = new Article(articleId, "rkrkrkrk", "11111");

            List<Comment> expected = Arrays.asList();

            // 검증
            assertEquals(expected.toString(), comments.toString(), "1번 글은 댓글 없음.");
        }

        /* Case4: 999번 게시글의 모든 댓글 조회 */
        {
            // 입력 데이터 준비
            Long articleId = 1L;

            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상
            Article article = new Article(articleId, "rkrkrkrk", "11111");

            List<Comment> expected = Arrays.asList();

            // 검증
            assertEquals(expected.toString(), comments.toString(), "1번 글은 댓글 없음.");
        }

        /* Case5: -1번 게시글의 모든 댓글 조회 */
        {
            // 입력 데이터 준비
            Long articleId = 1L;

            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상
            Article article = new Article(articleId, "rkrkrkrk", "11111");

            List<Comment> expected = Arrays.asList();

            // 검증
            assertEquals(expected.toString(), comments.toString(), "1번 글은 댓글 없음.");
        }
    }

    @Test
    @DisplayName("특정 닉네임의 모든 댓글 조회")
    void findByNickname() {
        /* Case1: "Park"의 모든 댓글 조회 */
        {
            // 입력 데이터를 준비
            String nickname = "Park";

            // 실제 수행
            List<Comment> comments = commentRepository.findByNickname(nickname);

            // 예상
            Comment a = new Comment(1L, new Article(4L, "당신의 인생 영화는?", "댓글 ㄱ"), nickname, "굳 윌 헌팅");
            Comment b = new Comment(4L, new Article(5L, "당신의 소울 푸드는?", "댓글 ㄱㄱ"), nickname, "치킨");
            Comment c = new Comment(7L, new Article(6L, "당신의 취미는?", "댓글 ㄱㄱㄱ"), nickname, "조깅");

            List<Comment> expected = Arrays.asList(a,b,c);

            // 검증
            assertEquals(expected.toString(), comments.toString(), "Park의 모든 댓글 출력");
        }

        /* Case2: "Kim"의 모든 댓글 조회 */
        {
            // 입력 데이터를 준비
            String nickname = "Kim";

            // 실제 수행


            // 예상


            // 검증

        }

        /* Case3: null의 모든 댓글 조회 */
        {
            // 입력 데이터를 준비


            // 실제 수행


            // 예상


            // 검증

        }

        /* Case4: ""의 모든 댓글 조회 */
        {
            // 입력 데이터를 준비


            // 실제 수행


            // 예상


            // 검증

        }

        /* Case5: "?@!#~"의 모든 댓글 조회 */
        {
            // 입력 데이터를 준비


            // 실제 수행


            // 예상


            // 검증

        }
    }
}