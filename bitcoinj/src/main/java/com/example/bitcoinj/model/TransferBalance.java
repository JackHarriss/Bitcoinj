package com.example.bitcoinj.model;


import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Data
public class TransferBalance {

    private Long from;
    private Long to;
    private BigDecimal amount;


}
