package raskit.blogspot.spring.hello.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = { "/", "/home"})
    public ModelAndView indexAction() {
        return new ModelAndView("index");
    }
}
