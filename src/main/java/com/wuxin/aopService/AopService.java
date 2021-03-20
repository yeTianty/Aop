package com.wuxin.aopService;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Tanoty
 * @version 1.0
 * @date 2021/3/17 15:10
 */
@Component
@Aspect
public class AopService {
    @Pointcut("execution(* com.wuxin.service.*.*(..))")
    public void say(){

    }
    /*@Before("say()")
    public void printBefore(){
        System.out.println("全体集合Before");
    }

    @After("say()")
    public void printAfter() {
        System.out.println("结束战斗After");
    }*/
    @Around("say()")
    public void printAround(ProceedingJoinPoint p){
        System.out.println("Around");

        try {
            Object[] args = p.getArgs();
            Object proced = p.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            System.out.println("finally");
        }

    }
}
