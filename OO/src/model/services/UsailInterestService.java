package model.services;

import java.security.InvalidParameterException;

public class UsailInterestService {
    private double interestRate;

    public UsailInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double payment(double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Meses precisam ser maiores que zero");
        }
        return amount * Math.pow(1.0 + interestRate/100, months);
    }
}
