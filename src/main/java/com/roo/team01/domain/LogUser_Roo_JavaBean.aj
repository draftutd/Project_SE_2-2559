// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.roo.team01.domain;

import com.roo.team01.domain.LogUser;
import com.roo.team01.domain.LogUserRole;
import java.util.Set;

privileged aspect LogUser_Roo_JavaBean {
    
    public String LogUser.getUsername() {
        return this.username;
    }
    
    public void LogUser.setUsername(String username) {
        this.username = username;
    }
    
    public String LogUser.getPassword() {
        return this.password;
    }
    
    public void LogUser.setPassword(String password) {
        this.password = password;
    }
    
    public String LogUser.getFirstname() {
        return this.firstname;
    }
    
    public void LogUser.setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String LogUser.getLastname() {
        return this.lastname;
    }
    
    public void LogUser.setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String LogUser.getPhone() {
        return this.phone;
    }
    
    public void LogUser.setPhone(String phone) {
        this.phone = phone;
    }
    
    public String LogUser.getAddress() {
        return this.address;
    }
    
    public void LogUser.setAddress(String address) {
        this.address = address;
    }
    
    public Set<LogUserRole> LogUser.getRoles() {
        return this.roles;
    }
    
    public void LogUser.setRoles(Set<LogUserRole> roles) {
        this.roles = roles;
    }
    
    public Boolean LogUser.getEnabled() {
        return this.enabled;
    }
    
    public void LogUser.setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
}
