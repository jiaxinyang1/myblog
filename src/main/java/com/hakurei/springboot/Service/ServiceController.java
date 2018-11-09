package com.hakurei.springboot.Service;

import com.hakurei.springboot.dao.CommentRepository;
import com.hakurei.springboot.dao.MainContentRepository;
import com.hakurei.springboot.dao.NoticeRepository;
import com.hakurei.springboot.dao.SummaryRepository;
import com.hakurei.springboot.entity.Comment;
import com.hakurei.springboot.entity.MainContent;
import com.hakurei.springboot.entity.Notice;
import com.hakurei.springboot.entity.Summary;
import com.hakurei.springboot.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Controller
public class ServiceController {

    @Autowired
    SummaryRepository   summaryRepository;
    @Autowired
    MainContentRepository mainContentRepository;
    @Autowired
    CommentRepository   commentRepository;
    @Autowired
    NoticeRepository  noticeRepository;
    /*显示摘要页*/
    @RequestMapping("/Summary")
    @ResponseBody
    public  List  addSummary()
    {
        return  (List)  summaryRepository.findAll();
    }


    /*按id查找文章*/
    @RequestMapping("/Detail")
    @ResponseBody
    public  MainContent mainContent( String id){
        return mainContentRepository.findById(Integer.parseInt(id));
    }

    /*添加评论*/
    @RequestMapping("/addComment")
    @ResponseBody
    public void addComment(@RequestBody Comment parm ) {
        Comment new_comment = new Comment();
        new_comment.setBelong(parm.getBelong());
        new_comment.setNickname(parm.getNickname());
        new_comment.setContent(parm.getContent());
        new_comment.setDate(getNowDateShort());
        commentRepository.save(new_comment);
    }

    /*添加文章*/
    @RequestMapping("/addArticle")
    @ResponseBody
    public  void addArticle(@RequestBody MainContent parm){

        /*添加文章主题内容*/
        MainContent newArticle=new MainContent();
        newArticle.setTitle(parm.getTitle());
        newArticle.setDescription(parm.getDescription());
        newArticle.setContent(parm.getContent());
        mainContentRepository.save(newArticle);
        /*添加摘要*/
        Summary newSummary= new Summary();
        newSummary.setDate(getNowDateShort());
        newSummary.setBrief(newArticle.getDescription());
        newSummary.setTitle(newArticle.getTitle());
       // newSummary.setClassification(classification);
        summaryRepository.save(newSummary);


    }

    /*上传图片*/
    @RequestMapping("/upload")
    @ResponseBody
    public String uploadImage(@RequestParam("file") MultipartFile file, HttpServletRequest request){

        String contentTpye =file.getContentType();
        String fileName=file.getOriginalFilename();
        System.out.println(fileName);
        String filePath="target/classes/static/image/";
        try{
            FileUtil.uploadFile(file.getBytes(),filePath,fileName);
        } catch (Exception e)
        {

        }

        String path="http://www.hakureireimu.cn/"+fileName;
        String url="{\"file\":\""+path+"\"}";

        return url;
    }
    /*添加公告*/
    @RequestMapping("/addNotice")
    @ResponseBody
    public  void addNotice(@RequestBody Notice notice){
        Notice newNotice =new Notice();
        newNotice.setDate(getNowDateShort());
        newNotice.setContent(notice.getContent());
        noticeRepository.save(newNotice);

    }

    /*按id查找评论*/
    @RequestMapping("/comment")
    @ResponseBody
    public List comment(String title){
    return  commentRepository.findAllByBelong(title);
    }



    /*侧边近期文章列表*/
    @RequestMapping("/Recently")
    @ResponseBody
    public List getRecentlyArticles() {
        List buffer=(List) summaryRepository.findAll();
        List result = new ArrayList<Summary>();
        for (int i=0;i<5&&i<buffer.size();i++)
        {
            result.add(buffer.get(buffer.size()-1-i));
        }


        return result;

    }
    /*侧边栏公告栏*/
    @RequestMapping("/Notice")
    @ResponseBody
    public List getNotice(){

        return (List) noticeRepository.findAll();
    }

    public String getNowDateShort() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);

        return dateString;

    }
}
