package com.hakurei.springboot.Service;

import com.hakurei.springboot.dao.CommentRepository;
import com.hakurei.springboot.dao.MainContentRepository;
import com.hakurei.springboot.dao.SummaryRepository;
import com.hakurei.springboot.entity.Comment;
import com.hakurei.springboot.entity.MainContent;
import com.hakurei.springboot.entity.Summary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    List summaryList =new ArrayList<Summary>();

    String contentTitle;
    @RequestMapping("/Summary")
    @ResponseBody
    public  List  addSummary()
    {

        summaryList= (List) summaryRepository.findAll();
        return summaryList;

    }
    @RequestMapping("GetContentTitle")
    @ResponseBody
    public void contentTitle( @RequestBody MainContent  parms ) {

        contentTitle=parms.getTitle().trim();
    }
    @RequestMapping("/MainContent")
    @ResponseBody
    public MainContent mainContent()
    {


        return mainContentRepository.findByName(contentTitle);
    }

    @RequestMapping("/AddComment")
    public String  AddComment(Comment parm) {
        Comment new_comment = new Comment();
        new_comment.setBelong(contentTitle);
        new_comment.setNickname(parm.getNickname());
        new_comment.setContent(parm.getContent());
        new_comment.setDate(getNowDateShort());
        commentRepository.save(new_comment);
        return "ftlIndex";


    }
    @RequestMapping("/ShowComment")
    @ResponseBody
    public List showComment()
    {

        return commentRepository.findAllByBelong(contentTitle);
    }

    @RequestMapping("/AddContent")
    @ResponseBody
    public void AddContent(){
        MainContent test = new MainContent();
        test.setTitle("博丽神社--巫女的住所");
        test.setDescription("描博丽神社（はくれいじんじゃ，Hakurei Jinja）是系列作品《东方project》中幻想乡内的场景，首次出现在《东方红魔乡》ED。是主人公之一博丽灵梦的家");
        test.setMainContent("幻想乡最东边的一座神社，在博丽大结界的边缘上，在外界也可看见的一座空的神社，因灵梦对人类和妖怪公平对待,成了妖怪的集中地，可找到很多外界的物品。\n" +
                "除了是现灵梦的住处和工作场所外，同时也是维持隔绝幻想乡与外界的「博丽大结界」的重要建筑。同时，也是幻想乡的正式入口，博丽神社建立在外面世界和幻想乡之间，双方能够通过博丽神社往来。\n" +
                "不过，普通人无法往来两个世界。\n" +
                "拥有幻想乡常识的人类只能去幻想乡的博丽神社，拥有外面常识的人类只能去外面的博丽神社。\n" +
                "据说外面的博丽神社是个孤寂、无人造访的小神社。\n" +
                "在大结界张开之前，虽然神社也是没什么人到访，但不像现在这么严重。据说自结界张开之后，外面的神社再无人打理过。\n" +
                "博丽神社存在的目的就是为了维持和管理结界，保养则是由八云紫完成，旧作中的魅魔自称是博丽神社的神，香霖堂里提到博丽神社曾被恶灵占据过，推测可能为魅魔。三月精当中，博丽灵梦给神社添加了一颗被雷闪中的一棵树作为神。\n" +
                "东方求闻史纪\n" +
                "危险程度：低\n" +
                "可能遭遇的妖怪：没有……理应是\n" +
                "博丽神社是座落在幻想乡东方尽头，唯一的一间神社。神社存在于外面世界和幻想乡之间的境界（*1）。在神社中能一览幻想乡，是个赏樱的名景点。\n" +
                "神社内住着解决异变的专家，博丽之巫女。她会在神社中守护幻想乡，发生异变后马上出动，解决事件。最近则是刚解决了红雾异变。\n" +
                "　　本来神社是没有妖怪的，最近传闻这里成了妖怪的巢穴，人们都无法接近了。神社向人们保证，在神社内人类不会被妖怪袭击，但是在神社和村庄之间存在着险恶的兽道，神社无法保证途中的安全，所以一直影响着想上门参拜的人。\n" +
                "　　其他特征还有神社附近容易拾到外面世界的东西，发现从外面世界误闯进来的人。这些外来人，多数是被妖怪发现吃掉，若运气好找到神社，就能平安无事地回家（*2）。\n" +
                "　　外面世界的东西都是不可思议的，极受人类和妖怪欢迎。所以神社附近有好多收藏家。只是收集来的东西多数不知道怎么去用。 [5] \n" +
                "　　（*1）正确地说，不在幻想乡内。\n" +
                "　　（*2）最近有不少人不想回去，这时会安排他们住在村庄。\n" +
                "东方文花帖（书籍）\n" +
                "幻想乡风景指南\n" +
                "　　博丽神社\n" +
                "　　博丽神社坐落于远离人烟的深山之中，地处幻想乡与外界的边境之处。是幻想乡中唯一的有人的神社。然而，虽然这个神社的有些地方是和幻想乡相连的，但严格的说来它并不属于幻想乡。同样也不属于外界。说起来也是处于边境线上。\n" +
                "春天樱花盛开，吸引着很多人。但从住在这里的巫女的性格来看，这个神社中应该聚集了很多的妖怪和魑魅魍魉，好像总有什么聚集在这里的样子。也有这个缘故，基本少有人造访这个神社。巫女这种吸引人的性格也吸引来了妖怪，但人却望而止步，真是件讽刺的事情啊。\n" +
                "当然，对我们妖怪而言没有比这里更适合落脚的地方了。这里正好还有很强的人类，因此住在这里也很有意思。而且这个神社也只有处于幻想乡和外界的边境这一个作用了。不再是祭祀神灵之地，因此即使害怕神圣之物的种族也可以随意待在这里。\n" +
                "拜访神社的时候，不需要香钱，只要带些吃的或者酒就可以。那样的话，巫女就会边发牢骚边借给你樱花树下的地方吧。无论什么时候都会有人在，所以想要一个人安静的喝点酒的时候就不太合适了。\n" +
                "在幻想乡像现在这样与外界完全隔绝之前，博丽神社就已经存在了。但我记得那时候并不如现在这般光鲜，只是个看起来没什么用的褪色的小小神社。恐怕在外界看来博丽神社还依然是那个褪色的小小神社吧。也许来访的妖怪们也一边享受着这光鲜的神社，一边怀念着那时候的记忆吧。 [6]  [6] \n" +
                "（射命丸 文）");
        Summary test1 =new Summary();
        test1.setTitle(test.getTitle());
        test1.setBrief(test.getMainContent().substring(0,30));
        test1.setClassification("杂谈");
        test1.setDate(getNowDateShort());
        summaryRepository.save(test1);
        mainContentRepository.save(test);
    }

    public String getNowDateShort() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);

        return dateString;

    }
}
