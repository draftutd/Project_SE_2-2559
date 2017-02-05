package com.roo.team01.domain;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = Ordered.class)
public class OrderedIntegrationTest {

    @Test
    public void testOrderedTrue() {
    	Ordered o = new Ordered();
    	o.setNum(2);
    	o.persist();
    }
    @Test
    public void testOrderedNumNull() {
    	Ordered o = new Ordered();
    	o.setNum(null);
    	
    	try{
    		o.persist();
    		Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    }
    @Test
    public void testOrderedLessThanOne() {
    	Ordered o = new Ordered();
    	o.setNum(0);
 
    	try{
    		o.persist();
    		Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    }
}
