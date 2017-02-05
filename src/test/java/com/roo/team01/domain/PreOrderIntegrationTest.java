package com.roo.team01.domain;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = PreOrder.class)
public class PreOrderIntegrationTest {

    @Test
    public void CaseSuccess() {
    	PreOrder p = new PreOrder();
    	p.setName("Pizza");
    	p.setAmount(2);
    	p.persist();
    }

  @Test
    public void CaseName_and_Amount_Null() {
    	PreOrder p = new PreOrder();
    	p.setName(null);
    	p.setAmount(null);
    	
    	try{
	   p.persist();
	   Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){

    	}
    }
}
