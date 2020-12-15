package One.mian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class TestController {

    @GetMapping("/test")
    public String Test(){
        return "Hello,SpringCloud for TestA";
    }

}
