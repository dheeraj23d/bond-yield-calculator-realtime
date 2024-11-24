package com.dheeraj.bond_yield_calc;

public class Bond {
    private double faceValue;
    private double couponRate;
    private double price;
    private int daysToMaturity;
    private double yield;
    private String name;

    // Constructor, getters, and setters
    Bond(double faceValue, double couponRate, double price, int daysToMaturity){
        this.faceValue=faceValue;
        this.couponRate=couponRate;
        this.price=price;
        this.daysToMaturity = daysToMaturity;
    }

    public double calculateYield() {
        double annualCoupon = faceValue * couponRate;
        double yearsToMaturity = (double) daysToMaturity/365;
        double yield = (annualCoupon + (faceValue - price) / yearsToMaturity) / ((faceValue + price) / 2);
        this.yield=yield;
        return yield;
    }

    public void setYield(double v) {
        this.yield=v;
    }

    public double getYield() {
        return this.yield;
    }
}
