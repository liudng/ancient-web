package ancient.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Liu Dng
 * @version 1.0.0, 12/17/2020
 * @since 1.0.0
 */
@Controller
@RequestMapping(path = "")
public class SpringController {

    @GetMapping(path = "/world")
    public String world() {
        return "world";
    }

    @GetMapping(path = "/json")
    @ResponseBody
    public String json() {
        return "{\"id\":2}";
    }
}
