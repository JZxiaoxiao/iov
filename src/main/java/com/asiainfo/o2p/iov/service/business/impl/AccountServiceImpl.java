package com.asiainfo.o2p.iov.service.business.impl;


import com.asiainfo.o2p.iov.dao.mapper.AccountMapper;
import com.asiainfo.o2p.iov.dao.dto.Account;
import com.asiainfo.o2p.iov.service.business.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account selectAccount(int itemID) throws Exception{
        return accountMapper.selectAccount(itemID);
    }

    @Override
    public Integer saveAccount(Account account) throws Exception {
        return accountMapper.saveAccount(account);
    }

    @Override
    public Integer deleteAccount(int itemID) throws Exception {
        return accountMapper.deleteAccount(itemID);
    }

    @Override
    public Integer updateAccount(Account account) throws Exception {
        return accountMapper.updateAccount(account);
    }
}
