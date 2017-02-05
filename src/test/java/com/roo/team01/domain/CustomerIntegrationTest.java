package com.roo.team01.domain;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;


@RooIntegrationTest(entity = Customer.class)
public class CustomerIntegrationTest {

    @Test
    public void testMarkerMethod() {
    	Customer c1 = new Customer();
    	c1.setUserName("dow");
    	c1.setPassword("123456");
    	c1.setPhone("123456789");
    	c1.setAddress("korat");
    	c1.persist();
    }
    
    @Test
    public void testNotname() {
    	Customer c1 = new Customer();
    	c1.setUserName(null);
    	c1.setPassword("123456");
    	c1.setPhone("123456789");
    	c1.setAddress("korat");
    	try{
    		c1.persist();
    		Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    }
    	@Test
        public void testNotPassWord() {
        	Customer c1 = new Customer();
        	c1.setUserName("dow");
        	c1.setPassword(null);
        	c1.setPhone("123456789");
        	c1.setAddress("korat");
        	try{
        		c1.persist();
        		Assert.fail();
        	}catch(javax.validation.ConstraintViolationException e){}
        	
        }
        	
        	 @Test
        	    public void testNotphone() {
        	    	Customer c1 = new Customer();
        	    	c1.setUserName("dow");
        	    	c1.setPassword("123456");
        	    	c1.setPhone("123545");
        	    	c1.setAddress("korat");
        	    
        	    	try{
        	    		c1.persist();
        	    		Assert.fail();
        	    	}catch(javax.validation.ConstraintViolationException e){}
        	    	
        	    }
        	 @Test
     	    public void testNotAddress() {
     	    	Customer c1 = new Customer();
     	    	c1.setUserName("dow");
     	    	c1.setPassword("123456");
     	    	c1.setPhone("123456789");
     	    	c1.setAddress(null);
     	    	try{
     	    		c1.persist();
     	    		Assert.fail();
     	    	}catch(javax.validation.ConstraintViolationException e){}
     	    	
     	    }	    	
        
    	
    }

