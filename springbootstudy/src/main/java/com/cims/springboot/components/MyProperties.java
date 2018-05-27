package com.cims.springboot.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author kwliu
 * @Description
 * @Date 2018/5/27
 * @Modified
 */
@Component
public class MyProperties {
    @Value("${com.cims.name}")
    private String name;
    @Value("${com.cims.title}")
    private String title;
    @Value("${com.cims.desc}")
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
