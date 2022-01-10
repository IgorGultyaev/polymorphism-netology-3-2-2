package com.company;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();

        Bill[] payments = new Bill[] {
                // TODO создать платежи с различным типами налогообложения
                new Bill(10_000, new TaxType(),taxService),
                new Bill(150_000, new VATaxType(),taxService),
                new Bill(300_000, new ProgressiveTaxType(), taxService),
                new Bill(500_000, new IncomeTaxType(), taxService)
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
