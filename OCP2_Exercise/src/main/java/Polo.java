/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rosso
 */
public class Polo extends CarExtras {

    private int year;
    private String colour;
    private double price;
    private int mileage;

    public Polo(boolean carbonpack,int wheelsize,boolean driveAssist,String Makepackage,
            int year, String colour, double price, int mileage) {
        super(carbonpack,wheelsize,driveAssist,Makepackage);
        this.price = price;
        this.colour = colour;
        this.mileage = mileage;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
