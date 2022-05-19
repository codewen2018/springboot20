package com.pt.pojo;

import javax.persistence.*;

@Entity
public class User {

    @Id   //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)      //自动增长
    private Integer id;
    private String  username;
    private String password;
    @Column(name = "my_age")//    myAge====>my_age
    private Integer myAge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMyAge() {
        return myAge;
    }

    public void setMyAge(Integer myAge) {
        this.myAge = myAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", myAge=" + myAge +
                '}';
    }
}
