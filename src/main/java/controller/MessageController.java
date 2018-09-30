package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("")
class MessageController{
    private static Logger logger = Logger.getLogger(MessageController.class);

    @RequestMapping("/action/postdata")
    @ResponseBody
    public String postData(HttpServletRequest request) {

        return "success";
    }

}