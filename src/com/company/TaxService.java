package com.company;

import java.math.BigDecimal;

class TaxService {
    public void payOut(BigDecimal taxAmount) {
       // System.out.format("Уплачен налог в размере %.2f%n", taxAmount.toString());
        System.out.println(taxAmount.toString());
    }
}
