package com.pankx.service;

import com.pankx.domain.Account;

import java.util.List;

/**
 * 账号Service接口
 */
public interface AccountService {
    //查询所有
    public List<Account> findAll();
    //保存账号
    public void saveAccount(Account account);
}
