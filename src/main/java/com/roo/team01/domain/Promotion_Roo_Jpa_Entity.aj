// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.roo.team01.domain;

import com.roo.team01.domain.Promotion;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Promotion_Roo_Jpa_Entity {
    
    declare @type: Promotion: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Promotion.id;
    
    @Version
    @Column(name = "version")
    private Integer Promotion.version;
    
    public Long Promotion.getId() {
        return this.id;
    }
    
    public void Promotion.setId(Long id) {
        this.id = id;
    }
    
    public Integer Promotion.getVersion() {
        return this.version;
    }
    
    public void Promotion.setVersion(Integer version) {
        this.version = version;
    }
    
}
