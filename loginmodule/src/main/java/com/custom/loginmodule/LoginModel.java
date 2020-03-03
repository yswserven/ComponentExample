package com.custom.loginmodule;

/**
 * Created by: Ysw on 2020/3/1.
 */
public class LoginModel {
    private String name;
    private String age;

    public LoginModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "LoginModel{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
