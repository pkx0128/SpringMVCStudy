package com.pankx.test;

import com.pankx.dao.AccountDAO;
import com.pankx.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 测试MyBatis
 */
public class TestMyBatis {
    /**
     * 测试查询
     * @throws IOException
     */
    @Test
    public void run1() throws IOException {
//        加载配置文件
      InputStream inputStream =  Resources.getResourceAsStream("sqlMapConfig.xml");
//        创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//       使用factory获取sqlsession对象
        SqlSession sqlSession = factory.openSession();
//        获取代理对象
        AccountDAO accountDAO = sqlSession.getMapper(AccountDAO.class);
//        执行查询所有的方法
        List<Account> accounts = accountDAO.findAll();
        for(Account account: accounts){
            System.out.println(account);
        }
//        关闭资源
        sqlSession.close();
        inputStream.close();
    }

    /**
     * 测试保存
     * 在做增、删、改的时候需要手动提交事务
     */
    @Test
    public void run2() throws IOException {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取sqlsession对象
        SqlSession session = sqlSessionFactory.openSession();
        //获取代理对象
        AccountDAO accountDAO = session.getMapper(AccountDAO.class);
        //创建Account对象并设置相应属性值
        Account account = new Account();
        account.setName("hij");
        account.setMoney(1111d);
        //执行方法
        accountDAO.saveAccount(account);
        //提交事务
        session.commit();
        //关闭资源
        session.close();
        inputStream.close();
    }
}
