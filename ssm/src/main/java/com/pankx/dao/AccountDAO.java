package com.pankx.dao;


import com.pankx.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 账号Dao
 * mybatis可以只写接，不用写接实现类
 */
public interface AccountDAO {

    //查询所有
    @Select("SELECT * FROM account")
    public List<Account> findAll();
    //保存账号信息
    @Insert("INSERT INTO account (name,money) VALUES(#{name},#{money})")
    public void saveAccount(Account account);
}
