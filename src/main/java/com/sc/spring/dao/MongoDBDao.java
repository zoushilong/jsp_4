package com.sc.spring.dao;

import com.sc.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 类名：MongoDBDao
 * 描述：一段话描述类的信息
 * 作者：邹世龙
 * 日期：2020/11/11 23:18
 * 版本：V1.0
 */
@Repository //仓库注释，注册bean对象，对象名称默认改为类首字母小写
public class MongoDBDao {

    @Autowired
    MongoTemplate mongoTemplate;

    public List<Book> select(){
        List<Book> list =(List<Book>) mongoTemplate.findAll(Book.class,"mycol");

        return list;
    }


}
