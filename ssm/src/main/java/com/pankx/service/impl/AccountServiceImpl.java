package com.pankx.service.impl;

import com.pankx.domain.Account;
import com.pankx.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有方法执行了。。。");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存方法执行了。。。。。");
    }
}
