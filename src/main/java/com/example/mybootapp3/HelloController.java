package com.example.mybootapp3;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
* Hello world!
*/
@RestController
public class HelloController {

        @RequestMapping("/taro")
        public String miyagi() {
            return "Taro desu!";
        
        }
        
}
