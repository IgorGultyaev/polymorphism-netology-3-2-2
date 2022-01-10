package com.company;

import com.company.TaxType;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    //TODO Прогрессивный налог, до 100 тысяч = 10%, больше 100 тысяч = 15% (ProgressiveTaxType)
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount){
        return (amount.compareTo(new BigDecimal(100_000))==1) ?
                calculateTaxFromIntToBD(amount,15)
                :
                calculateTaxFromIntToBD(amount,10);
    }
}