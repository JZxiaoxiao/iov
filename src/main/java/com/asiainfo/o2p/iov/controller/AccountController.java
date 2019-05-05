package com.asiainfo.o2p.iov.controller;

import com.asiainfo.o2p.iov.dao.dto.Account;
import com.asiainfo.o2p.iov.service.business.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    //@RequestMapping("/account/{id}")
    @RequestMapping("show")
    //public String selectAccount(@PathVariable int id){
    public String selectAccount(){
        try {
            Account account = accountService.selectAccount(1);
            return account.getName();
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    @RequestMapping("save")
    //public String selectAccount(@PathVariable int id){
    public String saveAccount(){
        try {
            Account account =new Account();
            account.setAge(32);
            account.setCreateDate(new Date());
            account.setName("laowang");
            if(accountService.saveAccount(account) == 1){
                return "true";
            }else{
                return "false";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "false";
        }
    }

    @RequestMapping("delete")
    //public String selectAccount(@PathVariable int id){
    public String deleteAccount(){
        try {
            if(accountService.deleteAccount(2) == 1){
                return "true";
            }else{
                return "false";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "false";
        }
    }

    @RequestMapping("update")
    //public String selectAccount(@PathVariable int id){
    public String updateAccount(){
        Account account =new Account();
        account.setItemID(3);
        account.setAge(22);
        account.setCreateDate(new Date());
        account.setName("laowang1");
        try {
            if(accountService.updateAccount(account) == 1){
                return "true";
            }else{
                return "false";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "false";
        }
    }

}
