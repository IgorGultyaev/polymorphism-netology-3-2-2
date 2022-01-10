package com.company;

import com.company.TaxType;

import java.math.BigDecimal;

class IncomeTaxType extends TaxType {
    // TODO Подоходный налог, = 13%
    @Override
    public BigDecimal calculateTaxFor (BigDecimal amount){
        return calculateTaxFromIntToBD(amount, 13);
    }
}
