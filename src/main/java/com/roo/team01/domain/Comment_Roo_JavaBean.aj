// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.roo.team01.domain;

import com.roo.team01.domain.Comment;
import com.roo.team01.domain.Post;

privileged aspect Comment_Roo_JavaBean {
    
    public String Comment.getText() {
        return this.text;
    }
    
    public void Comment.setText(String text) {
        this.text = text;
    }
    
    public String Comment.getUsers() {
        return this.users;
    }
    
    public void Comment.setUsers(String users) {
        this.users = users;
    }
    
    public Post Comment.getPost() {
        return this.post;
    }
    
    public void Comment.setPost(Post post) {
        this.post = post;
    }
    
}
