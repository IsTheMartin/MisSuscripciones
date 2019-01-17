package com.mcuadrada.missuscripciones.Models;

import java.util.Date;

public class Suscription {

    private String title;
    private double price;
    private int frecuency;
    private Date paymentDay;
    //private Duration
    private boolean remind;
    private int color;

    public Suscription() {
    }

    public Suscription(String title, double price, int frecuency, Date paymentDay, boolean remind,
                       int color) {
        this.title = title;
        this.price = price;
        this.frecuency = frecuency;
        this.paymentDay = paymentDay;
        this.remind = remind;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFrecuency() {
        return frecuency;
    }

    public void setFrecuency(int frecuency) {
        this.frecuency = frecuency;
    }

    public Date getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(Date paymentDay) {
        this.paymentDay = paymentDay;
    }

    public boolean isRemind() {
        return remind;
    }

    public void setRemind(boolean remind) {
        this.remind = remind;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
