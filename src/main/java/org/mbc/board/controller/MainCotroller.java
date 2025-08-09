package org.mbc.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainCotroller {

    @GetMapping("/")
    public String root111(){
        return "redirect:/board/list";
    }
}
