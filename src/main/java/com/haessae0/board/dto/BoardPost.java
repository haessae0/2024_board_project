package com.haessae0.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class BoardPost {
    private Long id;
    private String title;
    private String author;
    private String createdAt;
}
