package com.pankx.service.impl;

import com.pankx.dao.AccountDAO;
import com.pankx.domain.Account;
import com.pankx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDAO accountDAO;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有方法执行了。。。");
//        List <Account> lists = accountDAO.findAll();
//        for (Account list : lists){
//            System.out.println(list);
//        }
        return accountDAO.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层保存方法执行了。。。。。");
    }
}
