package bitc.next502.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

  @GetMapping("/auth/login")
  public String login() {
    return "login 페이지";
  }
}















