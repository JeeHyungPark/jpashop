package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // url
    public String hello(Model model){ // model에다가 데이터를 실어서 Controller에서 data를 view로 넘길 수 있다.
        model.addAttribute("data", "hello!!!"); // 'data'라는 키 값의 데이터에 'hello!!!'라는 value를 넣음
        return "hello"; // return 화면 이름 (html 파일 이름)
    }
}
