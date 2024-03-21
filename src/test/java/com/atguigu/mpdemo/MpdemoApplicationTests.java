package com.atguigu.mpdemo;

import com.atguigu.mpdemo.entity.User;
import com.atguigu.mpdemo.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;
import java.util.List;

@SpringBootTest
class MpdemoApplicationTests {
@Autowired
private UserMapper userMapper;
    @Test
    void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
        users.forEach(System.out::println);
        /*for (User list:users) {
            System.out.println(list);
        }*/
      /*  Iterator iterator = users.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
    }
    @Test
     void addUser(){
        User user = new User();
        user.setAge(18);
        user.setEmail("xinxin@qq.com");
        user.setName("xinxin");
         int insert = userMapper.insert(user);
         System.out.println("insert"+insert);
     }
     @Test
    void testPage(){
        Page<User> page = new Page<User>(1,3);
        userMapper.selectPage(page,null);
         System.out.println(page.getCurrent());
         System.out.println(page.getRecords());//每页数据list集合
         System.out.println(page.getSize());//每页显示记录数
         System.out.println(page.getPages());//总页数
         System.out.println(page.getTotal());//总记录数
         System.out.println(page.hasNext());//下一页
         System.out.println(page.hasPrevious());//上一页
     }
}
