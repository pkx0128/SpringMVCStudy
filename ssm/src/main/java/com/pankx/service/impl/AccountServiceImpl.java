package com.pankx.service.impl;

import com.pankx.domain.Account;
import com.pankx.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询执行了。。。");
        return null;
    }

    @Override
    public void saveAccount() {
        System.out.println("业务层保存方法执行了。。。。。");
    }
}
