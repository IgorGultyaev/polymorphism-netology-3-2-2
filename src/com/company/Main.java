package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                // TODO создать платежи с различным типами налогообложения
                new Bill(new BigDecimal(5_000), new TaxType(),taxService),
                new Bill(new BigDecimal(10_453), new VATaxType(),taxService),
                new Bill(new BigDecimal(99_436), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal(121_345), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal(532_443), new IncomeTaxType(), taxService)
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
