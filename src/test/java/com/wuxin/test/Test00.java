package com.wuxin.test;

import com.wuxin.aopService.AopService;
import com.wuxin.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Tanoty
 * @version 1.0
 * @date 2021/3/17 15:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class Test00 {
//    public static void main(String[] args) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        StudentService as = (StudentService) ac.getBean("studentService");
//        as.hear();
//    }
    @Autowired
    private StudentService studentService;
    @Test
    public void Test01(){
        studentService.hear();
    }
}

