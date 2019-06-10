package com.example.demo;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    private String content;
    private Date date;
    //省略getter/setter

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", date=" + date +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
