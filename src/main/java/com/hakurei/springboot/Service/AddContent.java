package com.hakurei.springboot.Service;

import com.hakurei.springboot.dao.CommentRepository;
import com.hakurei.springboot.dao.MainContentRepository;
import com.hakurei.springboot.dao.NoticeRepository;
import com.hakurei.springboot.dao.SummaryRepository;
import com.hakurei.springboot.entity.MainContent;
import com.hakurei.springboot.entity.Notice;
import com.hakurei.springboot.entity.Summary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
@Controller
public class AddContent {


    @Autowired
    SummaryRepository summaryRepository;
    @Autowired
    MainContentRepository mainContentRepository;
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    NoticeRepository noticeRepository;

    @RequestMapping("/AddContent")
    public String addContent(MainContent Article, String classification){
        /*添加文章主体内容*/
        MainContent newArticle = new MainContent();

        newArticle.setTitle(Article.getTitle());
        newArticle.setDescription(Article.getDescription());
        String str= Article.getContent();
        newArticle.setContent(Article.getContent().replaceAll("\n","<br>"));
        mainContentRepository.save(newArticle);
        /*添加概述内容*/

        Summary newSummary= new Summary();
        newSummary.setDate(getNowDateShort());
        newSummary.setBrief(newArticle.getDescription());
        newSummary.setTitle(newArticle.getTitle());
        newSummary.setClassification(classification);
        summaryRepository.save(newSummary);
        return "ftlIndex";

    }

    public String getNowDateShort() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);

        return dateString;

    }


}
