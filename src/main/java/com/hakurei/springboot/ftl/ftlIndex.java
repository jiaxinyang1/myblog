package com.hakurei.springboot.ftl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ftlIndex {
    @RequestMapping("/ftlIndex")
    public String ftlIndex()
    {
        return "ftlIndex";
    }

    @RequestMapping("/ftlContent")
    public String ftlContent(){
        return "content";
    }
}
