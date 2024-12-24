package com.example.firstproject.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // RestAPI의 역할을 하는 컨트롤러  // 뷰를 반환하는 일반 컨트롤러와 달리 JSON 데이터를 반환함
public class FirstApiController {

    @GetMapping("api/hello")
    public String hello() {
        return "hello world!";
    }
}
