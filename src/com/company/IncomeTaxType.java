package com.company;

class IncomeTaxType extends TaxType{
    // TODO Подоходный налог, = 13%
    @Override
    public double calculateTaxFor (double amount){
        return amount/100*13;
    }
}
