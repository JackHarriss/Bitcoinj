package com.example.bitcoinj;

import com.example.bitcoinj.model.TransferBalance;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class BitcoinService {

    private final BalanceRepository repository;

    public BigDecimal getBalance(Long accountId) {
        BigDecimal balance = repository.getBalanceForId(accountId);
        if (balance == null) {
            throw new IllegalArgumentException();
        }
        return balance;
    }

            public BigDecimal addMoney (Long to, BigDecimal amount){
                return null;
            }

            public void makeTransfer (TransferBalance transferBalance){
            }
    }

