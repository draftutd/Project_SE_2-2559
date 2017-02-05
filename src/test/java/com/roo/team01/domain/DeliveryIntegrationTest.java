package com.roo.team01.domain;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;


@RooIntegrationTest(entity = Delivery.class)
public class DeliveryIntegrationTest {

    @Test
    public void testMarkerMethod() {
    	Delivery d1 = new Delivery();
    	d1.setNote("test");
    	d1.persist();
    	
    }
    @Test
    public void testfail() {
    	Delivery d1 = new Delivery();
    	d1.setNote(null);
    	try{
    		d1.persist();
    		Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){
    		
    	}
    	
    	
    }
}
