package com.futurecollars.lesson11.exercise5;

public class CurrencyCalculator {
    private final CurrencyExchangeRate currencyExchangeRate;

    public CurrencyCalculator(CurrencyExchangeRate currencyExchangeRate) {
        this.currencyExchangeRate = currencyExchangeRate;
    }

    public double calculateExchange(double amount, Currency outputCurrency) {
        double exchangeRate = currencyExchangeRate.getBuyRate(outputCurrency);
        return amount * exchangeRate;
    }
}
