package com.qcj;

import org.junit.Test;

/**
 * maven：junit测试
 */
public class TestHelloWorld {
    @Test
    public void test(){
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.sayHi("zs"));
    }
}
