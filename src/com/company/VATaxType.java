package com.company;

class VATaxType extends TaxType{
    //TODO НДС, = 18%
    @Override
    public double calculateTaxFor(double amount){
        return amount/100*18;
    }
}
