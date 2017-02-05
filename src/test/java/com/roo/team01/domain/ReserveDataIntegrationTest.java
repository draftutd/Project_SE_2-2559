package com.roo.team01.domain;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = ReserveData.class)
public class ReserveDataIntegrationTest {

    @Test
    public void CaseSuccess() {

    	ReserveData r = new ReserveData();
    		r.setAmount(10);
    		r.persist();
    }

     @Test
    public void CaseAmountLessOne() {

    	ReserveData r = new ReserveData();
    		r.setAmount(-1);
    		
    		try{
    			r.persist();
    			Assert.fail();
    		}catch(javax.validation.ConstraintViolationException e){

    		}
    }

     @Test
    public void CaseAmountNull() {

    	ReserveData r = new ReserveData();
    		r.setAmount(null);
    		
    		try{
    			r.persist();
    			Assert.fail();
    		}catch(javax.validation.ConstraintViolationException e){

    		}
    }
}
