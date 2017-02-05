package com.roo.team01.domain;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

import static org.junit.Assert.fail;

import org.junit.Assert;

@RooIntegrationTest(entity = Stock_bill.class)
public class Stock_billIntegrationTest {

    @Test
    public void testadddata() {
    	Stock_bill sb1 = new Stock_bill();
    	sb1.setProduct_name("iphone");
    	sb1.setProduct_num(20);
    	sb1.setAllproduct_price("60000");
    	sb1.setDate_pro("27012560");
    	sb1.persist();
    	Assert.assertTrue("succrd", true);
   }

@Test
public void testnullname() {
	Stock_bill sb1 = new Stock_bill();
	sb1.setProduct_name(null);
	sb1.setProduct_num(20);
	sb1.setAllproduct_price("60000");
	sb1.setDate_pro("27012560");
	try{
		sb1.persist();
		Assert.fail();
	}catch(javax.validation.ConstraintViolationException e){
		}
	}

@Test
public void testnullnum() {
	Stock_bill sb1 = new Stock_bill();
	sb1.setProduct_name("iphone");
	sb1.setProduct_num(null);
	sb1.setAllproduct_price("60000");
	sb1.setDate_pro("27012560");
	try{
	sb1.persist();
	Assert.fail();
	}catch(javax.validation.ConstraintViolationException e){
		
	}
}



}
