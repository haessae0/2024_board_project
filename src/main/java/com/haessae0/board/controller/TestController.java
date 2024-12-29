package com.haessae0.board.controller;

import com.haessae0.board.dto.BoardPost;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @GetMapping("/board")
    public String boardList(Model model) {
        List<BoardPost> posts = new ArrayList<>();
        posts.add(new BoardPost(1L, "첫 번째 게시글", "홍길동", "2024-04-01"));
        posts.add(new BoardPost(2L, "두 번째 게시글", "김철수", "2024-04-02"));
        posts.add(new BoardPost(3L, "세 번째 게시글", "이영희", "2024-04-03"));
        posts.add(new BoardPost(4L, "네 번째 게시글", "박민수", "2024-04-03"));

        model.addAttribute("boardList", posts);
        return "board/list";
    }
}
