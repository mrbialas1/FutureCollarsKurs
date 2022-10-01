package com.futurecollars.lesson11.exercise5;

public interface CurrencyExchangeRate {
    double getBuyRate(Currency currency);

    double getSellRate(Currency currency);
}
