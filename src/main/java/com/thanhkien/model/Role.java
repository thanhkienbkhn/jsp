package com.thanhkien.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(final Integer roleId) {
        this.roleId = roleId;
    }

    @Column(name = "name")
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<UserModel> userList;

    public List<UserModel> getUserList() {
        return userList;
    }

    public void setUserList(final List<UserModel> userList) {
        this.userList = userList;
    }
}
