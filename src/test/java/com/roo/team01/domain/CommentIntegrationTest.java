package com.roo.team01.domain;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;
import org.junit.Assert;

@RooIntegrationTest(entity = Comment.class)
public class CommentIntegrationTest {

    @Test
    public void testMarkerMethod() {
    	Comment co = new Comment();
    	co.setText("i love you");
    	co.setUsers("good");
    	co.persist();
    }
    @Test
    public void testfailcomment1() {
    	Comment co = new Comment();
    	co.setText(null);
    	co.setUsers("good");

    	try{
    		co.persist();

    	Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){}	
    }
    @Test
    public void testfailcomment2() {
    	Comment co = new Comment();
    	co.setText("i love you");
    	co.setUsers(null);

    	try{
    		co.persist();

    	Assert.fail();
    	}catch(javax.validation.ConstraintViolationException e){}	
    }
}
