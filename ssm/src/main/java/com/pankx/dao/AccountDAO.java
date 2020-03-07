package com.pankx.dao;


import com.pankx.domain.Account;

import java.util.List;

/**
 * 账号Dao
 * mybatis可以只写接，不用写接实现类
 */
public interface AccountDAO {

    //查询所有
    public List<Account> findAll();
    //保存账号信息
    public void saveAccount();
}
