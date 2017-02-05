package com.roo.team01.domain;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;
import org.junit.Assert;

@RooIntegrationTest(entity = Product.class)
public class ProductIntegrationTest {

    @Test
    public void testTrueProduct() {
    	Product p = new Product();
    	p.setName("test");
    	p.setPrice(10.2f);
    	p.setAmount(10);
    	p.persist();
    }
    @Test
    public void testNameNull() {
    	Product p = new Product();
    	p.setName(null);
    	p.setPrice(10.2f);
    	p.setAmount(10);
    	try{
    		p.persist();
    		Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){

    	}
    }
    @Test
    public void testPriceNull() {
    	Product p = new Product();
    	p.setName("test");
    	p.setPrice(null);
    	p.setAmount(10);
    	try{
    		p.persist();
    		Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){

    	}
    }
    @Test
    public void testAmountNull() {
    	Product p = new Product();
    	p.setName("test");
    	p.setPrice(10.2f);
    	p.setAmount(null);
    	try{
    		p.persist();
    		Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){

    	}
    }
    @Test
    public void testAmountlessThanZero() {
    	Product p = new Product();
    	p.setName("test");
    	p.setPrice(10.2f);
    	p.setAmount(-1);
    	try{
    		p.persist();
    		Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){

    	}
    }
}
