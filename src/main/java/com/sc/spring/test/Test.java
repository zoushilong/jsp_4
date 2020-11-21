package com.sc.spring.test;

import com.sc.spring.dao.MongoDBDao;
import com.sc.spring.entity.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 类名：Test
 * 描述：一段话描述类的信息
 * 作者：邹世龙
 * 日期：2020/11/2 19:07
 * 版本：V1.0
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        MongoDBDao mongoDBDao= (MongoDBDao)applicationContext.getBean("mongoDBDao");
        List<Book> list = mongoDBDao.select();

        for (Book book : list) {
            System.out.println(book);
        }
    }
}
