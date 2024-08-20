package main.java.com.example.account.repository;

import main.java.com.example.account.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
    // Méthodes personnalisées si nécessaire
}
