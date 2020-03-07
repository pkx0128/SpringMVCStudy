package com.pankx.service;

import com.pankx.domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有
    public List<Account> findAll();
    //保存账号
    public void saveAccount();
}
