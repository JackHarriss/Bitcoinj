package com.example.bitcoinj;

import com.example.bitcoinj.model.TransferBalance;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;

@RestController("/balance")
@AllArgsConstructor
public class BalanceController {

    @Autowired
    private BitcoinService bitcoinService;

    @GetMapping("/{accountId}")

    public BigDecimal getBalance(@PathVariable Long accountId) {
        return bitcoinService.getBalance(accountId);

    }
    @PostMapping("/add")
    public BigDecimal addMoney(@RequestBody TransferBalance transferBalance) {
        return bitcoinService.addMoney(transferBalance.getTo(), transferBalance.getAmount());
    }

    @PostMapping("/transfer")
    public void transfer(@RequestBody TransferBalance transferBalance) {

        bitcoinService.makeTransfer(transferBalance);
    }
}
