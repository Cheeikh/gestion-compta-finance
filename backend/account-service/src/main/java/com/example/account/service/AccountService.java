package main.java.com.example.account.service;

import main.java.com.example.account.model.Account;
import main.java.com.example.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(String id) {
        return accountRepository.findById(id).orElse(null);
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(String id, Account account) {
        Account existingAccount = accountRepository.findById(id).orElse(null);
        if (existingAccount != null) {
            existingAccount.setAccountNumber(account.getAccountNumber());
            existingAccount.setOwnerName(account.getOwnerName());
            existingAccount.setEmail(account.getEmail());
            existingAccount.setBalance(account.getBalance());
            return accountRepository.save(existingAccount);
        }
        return null;
    }

    public void deleteAccount(String id) {
        accountRepository.deleteById(id);
    }
}
