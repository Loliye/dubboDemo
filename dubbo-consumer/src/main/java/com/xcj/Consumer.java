package com.xcj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer
{
    public static void main(String[]args) throws IOException
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DubboService dubboService = (DubboService) context.getBean("dubboService");
        System.out.println("consumer started");
        System.out.println(dubboService.getMessage("hello dubbo!"));
        System.in.read();

    }
}
