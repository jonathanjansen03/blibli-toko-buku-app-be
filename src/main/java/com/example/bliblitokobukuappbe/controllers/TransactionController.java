package com.example.bliblitokobukuappbe.controllers;

import com.example.bliblitokobukuappbe.dtos.TransactionDTO;
import com.example.bliblitokobukuappbe.models.Transaction;
import com.example.bliblitokobukuappbe.services.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("gdn-bookstore-api/transactions")
@CrossOrigin(origins = "http://localhost:3000")
public class TransactionController {

    private TransactionService transactionService;

    @GetMapping
    public List<Transaction> getTransactions() {
        return transactionService.getTransactions();
    }

    @GetMapping("/report")
    public List<Transaction> getMonthlyReport(@RequestParam int month, @RequestParam int year){
        return  transactionService.getMonthlyReport(month, year);
    }

    @PostMapping(
            path = "/insert",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public void insertTransaction(@RequestBody TransactionDTO transactionDTO) {
        transactionService.insertTransaction(transactionDTO);
    }

    @PutMapping(
            path = "/update/{transactionId}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public void updateTransaction(@RequestBody Transaction transaction, @PathVariable String transactionId) {
        transactionService.updateTransaction(transactionId, transaction);
    }

    @DeleteMapping(
            path = "/delete/{transactionId}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public void deleteTransaction(@PathVariable String transactionId) {
        transactionService.deleteTransaction(transactionId);
    }

    @GetMapping(
            path="/{transactionId}"
    )
    public Transaction findTransactionById(@PathVariable String transactionId) {
        return transactionService.findTransactionById(transactionId);
    }

}
