package com.example.ecommercebackend.controller;

import com.example.ecommercebackend.model.Transaction;
import com.example.ecommercebackend.repository.TransactionRepository;
import com.example.ecommercebackend.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<Transaction>> getAllTransaction(){
        List<Transaction> transactions = transactionService.getAllTransaction();
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable Long id){
        Transaction transaction = transactionService.getTransactionById(id);
        return new ResponseEntity<>(transaction,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction){
        Transaction newTransaction = transactionService.saveTransaction(transaction);
        return new ResponseEntity<>(newTransaction,HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteTransaction(@PathVariable Long id){
        transactionService.deleteTransaction(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
