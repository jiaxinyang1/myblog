package com.hakurei.springboot.ftl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ftlIndex {
    @RequestMapping("/")
    public String ftlIndex()
    {
        return "index.html";
    }

    @RequestMapping("/ftlContent")
    public String ftlContent(){
        return "content";
    }

    @RequestMapping("/AddArticle")
    public String ftlArticle(){return "AddContent";}
}
