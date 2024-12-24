package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id // primary key와 같음
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 기본기를 갖고 알아서 지정해줌
    private Long id;

    @ManyToOne // 관계 설정  // 해당 댓글 엔티티 여러개가 하나의 Article에 연관됨. 즉 다대일관계임
    @JoinColumn(name="article_id")  // "articleId" 컬럼에 Article의 대표값 지정 (조인을 위한 컬럼)
    private Article article;

    private String nickname;

    private String body;
}
