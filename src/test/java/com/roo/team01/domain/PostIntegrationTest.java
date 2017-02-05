package com.roo.team01.domain;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;
import org.junit.Assert;

@RooIntegrationTest(entity = Post.class)
public class PostIntegrationTest {

    @Test
    public void testtruepost() {
    	Post po = new Post();
    	po.setText("posts");
    	po.setUsers("you");
    	po.persist();
    }
    @Test
    public void testfailpost1() {
    	Post po = new Post();
    	po.setText(null);
    	po.setUsers("you");

    	try{
    		po.persist();

    	Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){}	
    }
    @Test
    public void testfailpost2() {
    	Post po = new Post();
    	po.setText("pose");
    	po.setUsers(null);

    	try{
    		po.persist();

    	Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){}	
    }
}
