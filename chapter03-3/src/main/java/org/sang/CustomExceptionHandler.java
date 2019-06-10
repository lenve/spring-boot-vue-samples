package org.sang;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * Created by sang on 2018/7/10.
 */
@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ModelAndView uploadException(MaxUploadSizeExceededException e) throws IOException {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "上传文件大小超出限制!");
        mv.setViewName("error");
        return mv;
    }

    @ExceptionHandler(Exception.class)
    public void myexce(Exception e) {
        System.out.println("myexce>>>"+e.getMessage());
    }
}
