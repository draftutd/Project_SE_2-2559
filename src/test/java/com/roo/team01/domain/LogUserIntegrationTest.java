package com.roo.team01.domain;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = LogUser.class)
public class LogUserIntegrationTest {

    @Test
    public void testLogUser() {
    	LogUser u = new LogUser();
    	u.setUsername("test");
    	u.setPassword("1234");
    	u.setFirstname("test");
    	u.setLastname("test");
    	u.setAddress("test");
    	u.persist();
    }
    @Test
    public void testUsernameNull() {
    	LogUser u = new LogUser();
    	u.setUsername(null);
    	u.setPassword("1234");
    	u.setFirstname("test");
    	u.setLastname("test");
    	u.setAddress("test");
    	
    	try{
    		u.persist();
    		Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    }
    @Test
    public void testPasswordNull() {
    	LogUser u = new LogUser();
    	u.setUsername("test");
    	u.setPassword(null);
    	u.setFirstname("test");
    	u.setLastname("test");
    	u.setAddress("test");
    	
    	try{
    		u.persist();
    		Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    }
    @Test
    public void testFirstnameNull() {
    	LogUser u = new LogUser();
    	u.setUsername("test");
    	u.setPassword("1234");
    	u.setFirstname(null);
    	u.setLastname("test");
    	u.setAddress("test");
    	
    	try{
    		u.persist();
    		Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    }
    @Test
    public void testLastnameNull() {
    	LogUser u = new LogUser();
    	u.setUsername("test");
    	u.setPassword("1234");
    	u.setFirstname("test");
    	u.setLastname(null);
    	u.setAddress("test");
    	
    	try{
    		u.persist();
    		Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    }
    @Test
    public void testAdressNull() {
    	LogUser u = new LogUser();
    	u.setUsername("test");
    	u.setPassword("1234");
    	u.setFirstname("test");
    	u.setLastname("test");
    	u.setAddress(null);
    	
    	try{
    		u.persist();
    		Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    }
}
