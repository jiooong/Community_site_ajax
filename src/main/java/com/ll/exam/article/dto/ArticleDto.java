package com.ll.exam.article.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//mapper가 작동을 하려면 문자열을 가지고 객체를 생성해야 합니다. 즉 객체를 하나하나 조립을 해야되는데 이 때 기본 생성자를 가지고 합니다.
//기본 생성자를 만들 때 NoArgsConstructor, 즉 기본생성자가 있어야 합니다.
//만약 기본 생성자가 밖에서 쓰이는걸 꺼리면
public class ArticleDto {
    private long id;
    private String title;
    private String body;
}
