package com.android.pastr.pastr;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Julia.hermann93 on 2017.06.17..
 */

public class LoginActivityTest {

    @Test
    public void testEmailNotValidWithoutAt(){
        LoginActivity loginActivity = new LoginActivity();
        Assert.assertFalse(loginActivity.isEmailValid("juliagmail.com"));
    }

    @Test
    public void testEmailValidWithAt(){
        LoginActivity loginActivity = new LoginActivity();
        Assert.assertTrue(loginActivity.isEmailValid("@"));
    }

}
