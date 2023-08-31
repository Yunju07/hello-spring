package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")        // localhost:8080 => 처음 화면 의미
    public String home(){
        return "home";      // resources 폴더 하위 중에서 home.html 과 연결
    }
}
