package demo.ssm.web;

import demo.ssm.pojo.User;
import demo.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/user")
@SessionAttributes(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String findUser(Model model, User user) {
        User login = userService.findUser(user);
        if (login == null) {
            model.addAttribute("msg", "密码或用户名错误");
            return "login";
        }
        model.addAttribute("user", user);
        return "index";
    }
}
