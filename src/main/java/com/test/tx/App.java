package com.test.tx;

import com.test.tx.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext context;
    public static void main( String[] args )
    {
        context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.transfer("欧阳","阳祥伟",5000);
    }
}
