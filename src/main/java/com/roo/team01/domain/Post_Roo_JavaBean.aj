// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.roo.team01.domain;

import com.roo.team01.domain.Post;

privileged aspect Post_Roo_JavaBean {
    
    public String Post.getText() {
        return this.text;
    }
    
    public void Post.setText(String text) {
        this.text = text;
    }
    
    public String Post.getUsers() {
        return this.users;
    }
    
    public void Post.setUsers(String users) {
        this.users = users;
    }
    
}
