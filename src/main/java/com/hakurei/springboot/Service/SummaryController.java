package com.hakurei.springboot.Service;

import com.hakurei.springboot.dao.SummaryRepository;
import com.hakurei.springboot.entity.Summary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class SummaryController {

    @Autowired
    SummaryRepository   summaryRepository;
    List summaryList =new ArrayList<Summary>();
    @RequestMapping("/Summary")
    @ResponseBody
    public  List  addSummary()
    {

        summaryList= (List) summaryRepository.findAll();
        return summaryList;

    }
    public String getNowDateShort() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);

        return dateString;

    }
}
