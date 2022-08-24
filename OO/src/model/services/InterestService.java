package model.services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();
    default double payment(double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Meses precisam ser maiores que zero");
        }
        return amount * Math.pow(1.0 + getInterestRate()/100, months);
    }
}
