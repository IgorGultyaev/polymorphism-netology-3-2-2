package com.company;

import com.company.TaxType;

import java.math.BigDecimal;

class VATaxType extends TaxType {
    //TODO НДС, = 18%
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return calculateTaxFromIntToBD(amount, 18);
    }
}
