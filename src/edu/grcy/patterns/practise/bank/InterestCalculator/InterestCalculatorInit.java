package edu.grcy.patterns.practise.bank.InterestCalculator;

public class InterestCalculatorInit {

    public void interestCalculatorInit() {
        DefaultInterestCalculator defaultInterestCalculator = DefaultInterestCalculator.getDEFAULT_INTEREST_CALCULATOR();
        defaultInterestCalculator.setFactor(1);
        defaultInterestCalculator.setConstant(1);

        VipInterestCalculator vipInterestCalculator = VipInterestCalculator.getVIP_INTEREST_CALCULATOR();
        vipInterestCalculator.setFactor(1);
        vipInterestCalculator.setConstant(2);
        vipInterestCalculator.setVipBonus(2);

    }
}
