package com.vip.study.practice.java8;


import com.vip.study.practice.util.JavaFeatureUtility;
import org.junit.Assert;
import org.junit.Test;

public class LambdaExpressionTest {

    private final LambdaExpression lambdaExpression = new LambdaExpression();

    @Test
    public void findFirst() {
        String data = lambdaExpression.findFirst(JavaFeatureUtility.asList("s1", "s2", "s3"), "s1");
        Assert.assertEquals("s1", data);
        data = lambdaExpression.findFirst(JavaFeatureUtility.asList("s1", "s2", "s3"), "s5");
        Assert.assertNull(data);
    }
}