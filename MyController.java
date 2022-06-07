

package com.example.springdc23.Controller;
import org.springframework.stereotype.Controller;
import org.springframework. web.bind.annotation.GetMapping;

@Controller

public class MyController {
    @GetMapping("/aboutus")
    public String openHome() {
        return "aboutus";
    }

    @GetMapping("/news")
    public String openNews() {
        return "news";
    }
}
