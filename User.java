package com.example.demo.entity;

public class User {
    // 私有属性：用户名、用户ID、年龄
    private String name;
    private Long id;
    private Integer age;

    // 无参构造方法：Spring解析JSON时必须有，否则会报错
    public User() {
    }

    // 全参构造方法：方便手动创建User对象
    public User(String name, Long id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // Getter方法：获取属性值
    public String getName() {
        return name;
    }

    // Setter方法：为属性赋值
    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
