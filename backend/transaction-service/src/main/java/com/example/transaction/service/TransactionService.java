package com.example.transaction.service;

import com.example.transaction.model.Transaction;
import com.example.transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    // Créer une nouvelle transaction
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    // Récupérer une transaction par ID
    public Optional<Transaction> getTransactionById(String id) {
        return transactionRepository.findById(id);
    }

    // Récupérer toutes les transactions
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    // Mettre à jour une transaction
    public Transaction updateTransaction(String id, Transaction transactionDetails) {
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));
        
        transaction.setAccountNumber(transactionDetails.getAccountNumber());
        transaction.setAmount(transactionDetails.getAmount());
        transaction.setType(transactionDetails.getType());
        transaction.setDescription(transactionDetails.getDescription());
        transaction.setStatus(transactionDetails.getStatus());

        return transactionRepository.save(transaction);
    }

    // Supprimer une transaction
    public void deleteTransaction(String id) {
        transactionRepository.deleteById(id);
    }
}
