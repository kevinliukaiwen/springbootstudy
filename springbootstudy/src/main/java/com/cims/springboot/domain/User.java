package com.cims.springboot.domain;

/**
 * @Author kwliu
 * @Description
 * @Date 2018/5/31
 * @Modified
 */
public class User {
    private Long uid;
    private String name;
    private Integer age;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
