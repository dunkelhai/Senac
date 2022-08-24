package model.services;

import java.security.InvalidParameterException;

public class UsailInterestService implements InterestService{
    private double interestRate;

    public UsailInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return 0;
    }

}
