package com.roo.team01.domain;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;
import org.junit.Assert;

@RooIntegrationTest(entity = Payment.class)
public class PaymentIntegrationTest {

    @Test
    public void testtruepayment() {
    	Payment p = new Payment();
    	p.setAccount("ktb");
    	p.setDates("20/01/60");
    	p.setTimes("22.22");
    	p.setAmount(270.0f);
    	p.persist();
    }

     @Test
    public void testfailpayment1() {
    	Payment p = new Payment();
    	p.setAccount(null);
    	p.setDates("20/01/60");
    	p.setTimes("22.22");
    	p.setAmount(270.0f);
    	try{
    		p.persist();
    	Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){}
    	
    }

     @Test
    public void testfailpayment2() {
    	Payment p = new Payment();
    	p.setAccount("ktb");
    	p.setDates(null);
    	p.setTimes("22.22");
    	p.setAmount(270.0f);
    	try{
    		p.persist();
    	Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){}
    	
    }
     @Test
    public void testfailpayment3() {
    	Payment p = new Payment();
    	p.setAccount("ktb");
    	p.setDates("20/01/60");
    	p.setTimes(null);
    	p.setAmount(270.0f);
    	try{
    		p.persist();
    	Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){}
    	
    }
     @Test
    public void testfailpayment4() {
    	Payment p = new Payment();
    	p.setAccount("ktb");
    	p.setDates("20/01/60");
    	p.setTimes("22.22");
    	p.setAmount(null);
    	
    	try{
    		p.persist();
    	Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){}
    }

}
