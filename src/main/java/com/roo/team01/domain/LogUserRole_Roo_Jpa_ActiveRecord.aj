// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.roo.team01.domain;

import com.roo.team01.domain.LogUserRole;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect LogUserRole_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager LogUserRole.entityManager;
    
    public static final List<String> LogUserRole.fieldNames4OrderClauseFilter = java.util.Arrays.asList("roleName");
    
    public static final EntityManager LogUserRole.entityManager() {
        EntityManager em = new LogUserRole().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long LogUserRole.countLogUserRoles() {
        return entityManager().createQuery("SELECT COUNT(o) FROM LogUserRole o", Long.class).getSingleResult();
    }
    
    public static List<LogUserRole> LogUserRole.findAllLogUserRoles() {
        return entityManager().createQuery("SELECT o FROM LogUserRole o", LogUserRole.class).getResultList();
    }
    
    public static List<LogUserRole> LogUserRole.findAllLogUserRoles(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM LogUserRole o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, LogUserRole.class).getResultList();
    }
    
    public static LogUserRole LogUserRole.findLogUserRole(Long id) {
        if (id == null) return null;
        return entityManager().find(LogUserRole.class, id);
    }
    
    public static List<LogUserRole> LogUserRole.findLogUserRoleEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM LogUserRole o", LogUserRole.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<LogUserRole> LogUserRole.findLogUserRoleEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM LogUserRole o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, LogUserRole.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void LogUserRole.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void LogUserRole.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            LogUserRole attached = LogUserRole.findLogUserRole(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void LogUserRole.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void LogUserRole.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public LogUserRole LogUserRole.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        LogUserRole merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
