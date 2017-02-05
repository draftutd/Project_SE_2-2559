package com.roo.team01.domain;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = Promotion.class)
public class PromotionIntegrationTest {

    @Test
    public void testMarkerMethod() {
    	Promotion p1 = new Promotion();
    	p1.setName("iphone7");
    	p1.setDetail("sale product");
    	p1.setDiscount("sale");
    	p1.persist();
    }
    
    @Test
    public void testNotname() {
    	Promotion p1 = new Promotion();
    	p1.setName(null);
    	p1.setDetail("sale product");
    	p1.setDiscount("sale");
    	try{
    	p1.persist();
    	Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){}
    }
    
}
