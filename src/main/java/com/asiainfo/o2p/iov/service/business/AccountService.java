package com.asiainfo.o2p.iov.service.business;

import com.asiainfo.o2p.iov.dao.dto.Account;

public interface AccountService {
    Account selectAccount(int itemID) throws Exception;
    Integer saveAccount(Account account) throws Exception;
    Integer deleteAccount(int itemID) throws Exception;
    Integer updateAccount(Account account) throws Exception;
}
