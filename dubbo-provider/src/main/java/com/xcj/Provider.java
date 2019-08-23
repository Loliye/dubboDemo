package com.xcj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider
{
    public static void main(String []args) throws IOException
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        System.out.println(context.getDisplayName()+":here");
        context.start();
        System.out.println("provider1 started!");
        System.in.read();
    }
}
