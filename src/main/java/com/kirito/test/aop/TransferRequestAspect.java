package com.kirito.test.aop;

import com.kirito.test.utils.AuthUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Map;

@Aspect
@Component
public class TransferRequestAspect {

    // 定义切点，让所有有@LimitRequest注解的方法都执行切面方法
    @Pointcut("@annotation(transferRequest)")
    public void executeService(TransferRequest transferRequest) {
    }

    @After("executeService(transferRequest)")
    public void after(JoinPoint joinPoint, TransferRequest transferRequest) {
        System.out.println("transferRequest.url() = " + transferRequest.url());
        Map<String, String> headers = AuthUtil.getHeaders();
        //TODO 这里已经获取headers了，发送个请求即可
        System.out.println("代码执行完了");
    }

}
