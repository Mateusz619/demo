package pl.mateusz.demo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AsService {
//    @Before("execution(* TestServ.create(String, int)) and args(typ, quantity))")
//    public void before1(JoinPoint joinPoint, String typ, int quantity){
//        System.out.println("Run before1: " + joinPoint.getSignature());
//        System.out.println(typ + " , " + quantity);
//    }
//    @Before("execution(* TestServ.create(int)) and args(quantity))")
//    public void before2(JoinPoint joinPoint, int quantity){
//        System.out.println("Run before2:" + joinPoint.getSignature());
//        System.out.println(quantity);
//    }
//
//    @Before("execution(* TestServ.create(String, int)) and args(typ, quantity))")
//    public void around1(ProceedingJoinPoint proceedingJoinPoint, String typ, int quantity){
//        System.out.println("Run around1: " + proceedingJoinPoint);
//        System.out.println(typ + " , " + quantity);
//        try{
//            proceedingJoinPoint.proceed();
//        } catch (Throwable throwable){
//            throwable.printStackTrace();
//        }
//        System.out.println("Run around1: " + proceedingJoinPoint);
//        System.out.println(typ + " , " + quantity);
//    }
//
//    @Before("execution(* TestServ.create(String, int)) and args(typ, quantity))")
//    public void after1(JoinPoint joinPoint, String typ, int quantity){
//        System.out.println("Run after: " + joinPoint.getSignature());
//        System.out.println(typ + " , " + quantity);
//    }
}
