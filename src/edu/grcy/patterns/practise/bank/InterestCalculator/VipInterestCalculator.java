package edu.grcy.patterns.practise.bank.InterestCalculator;

public class VipInterestCalculator implements InterestCalculator{
    private static VipInterestCalculator VIP_INTEREST_CALCULATOR = new VipInterestCalculator();

    private int factor;
    private int constant;
    private int vipBonus;
    private int baseInterest;

    private VipInterestCalculator(){
        baseInterest=1;
    }

    public static VipInterestCalculator getVIP_INTEREST_CALCULATOR() {
        System.out.println("Wybrano "+VipInterestCalculator.class.getSimpleName());
        return VIP_INTEREST_CALCULATOR;
    }

    @Override
    public int countInterest(int capitalBalance) {
        return Math.round(capitalBalance * (baseInterest * factor + constant + vipBonus) / 100);
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    public int getConstant() {
        return constant;
    }

    public void setConstant(int constant) {
        this.constant = constant;
    }

    public int getVipBonus() {
        return vipBonus;
    }

    public void setVipBonus(int vipBonus) {
        this.vipBonus = vipBonus;
    }
}
