package com.company;

public class ProgressiveTaxType extends TaxType{
    //TODO Прогрессивный налог, до 100 тысяч = 10%, больше 100 тысяч = 15% (ProgressiveTaxType)
    @Override
    public double calculateTaxFor(double amount){
        return amount<=100_000 ? amount/100*10 : amount/100*15;
    }
}
