package org.sang.sendmail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendmailApplicationTests {

    @Autowired
    MailService mailService;

    @Test
    public void sendMailWithImg() {
        mailService.sendMailWithImg("1510161612@qq.com",
                "584991843@qq.com",
                "测试邮件主题(图片)",
                "<div>hello,这是一封带图片资源的邮件：" +
                        "这是图片1：<div><img src='cid:p01'/></div>" +
                        "这是图片2：<div><img src='cid:p02'/></div>" +
                        "</div>",
                new String[]{"C:\\Users\\sang\\Pictures\\picpick\\p1.png",
                        "C:\\Users\\sang\\Pictures\\picpick\\p2.png"},
                new String[]{"p01", "p02"});
    }

    @Test
    public void sendAttachFileMail() {
        mailService.sendAttachFileMail("1510161612@qq.com",
                "584991843@qq.com",
                "测试邮件主题",
                "测试邮件内容",
                new File("E:\\邮件附件.docx"));
    }

    @Test
    public void sendSimpleMail() {
        mailService.sendSimpleMail("1510161612@qq.com",
                "584991843@qq.com",
                "1470249098@qq.com",
                "测试邮件主题",
                "测试邮件内容");
    }

    @Autowired
    TemplateEngine templateEngine;
    @Test
    public void sendHtmlMailThymeleaf() {
        Context ctx = new Context();
        ctx.setVariable("username", "sang");
        ctx.setVariable("gender", "男");
        String mail = templateEngine.process("mailtemplate.html", ctx);
        mailService.sendHtmlMail("1510161612@qq.com",
                "584991843@qq.com",
                "测试邮件主题",
                mail);
    }

    @Test
    public void sendHtmlMail2() {
//        try {
//            Configuration configuration =
//                    new Configuration(Configuration.VERSION_2_3_0);
//            ClassLoader loader = SendmailApplication.class.getClassLoader();
//            configuration
//            .setClassLoaderForTemplateLoading(loader,"ftl");
//            Template template = configuration.getTemplate("mailtemplate.ftl");
//            StringWriter mail = new StringWriter();
//            User user = new User();
//            user.setGender("男");
//            user.setUsername("江南一点雨");
//            template.process(user, mail);
//            mailService.sendHtmlMail("1510161612@qq.com",
//                    "584991843@qq.com",
//                    "测试邮件主题",
//                    mail.toString());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

}
