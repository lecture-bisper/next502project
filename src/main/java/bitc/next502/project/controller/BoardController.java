package bitc.next502.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

  @GetMapping("/board/write")
  public String boardWrite() {
    return "게시판 글쓰기 페이지";
  }
}
