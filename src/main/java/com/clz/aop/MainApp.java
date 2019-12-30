package com.clz.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    /**
     * 测试Spring 中基于 AOP 的 XML架构
     */
    @Test
    public void testAspectJ() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }

    /**
     * 测试Spring中基于 AOP 的 XML架构
     */
    @Test
    public void testAspectJAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
