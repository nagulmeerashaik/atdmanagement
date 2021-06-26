package com.clg.atdmanagement.services;

import com.clg.atdmanagement.beans.Account;
import com.clg.atdmanagement.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account getAccountById(int id){
        return accountRepository.findById(id).get();
    }

    public List<Account> getAllAccounts(){
        List<Account> accounts = new ArrayList<>();
        accountRepository.findAll().forEach(account -> accounts.add(account));
        return accounts;
    }
    public void saveAccount(Account account){
        accountRepository.save(account);
    }

    public void saveAccounts(List<Account> accounts){
        accountRepository.saveAll(accounts);
    }

    public void deleteAccount(int id){
        accountRepository.deleteById(id);
    }

}
