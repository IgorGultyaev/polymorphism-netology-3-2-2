package com.company;

import java.math.BigDecimal;

class TaxType {
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return new BigDecimal(0.0);
    }
    protected BigDecimal calculateTaxFromIntToBD(BigDecimal amount, int percent){
        return (amount.divide(new BigDecimal(100))).multiply(new BigDecimal(percent)).setScale(2);
    }
}