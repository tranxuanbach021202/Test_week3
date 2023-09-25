package com.example;

public class Charging {
    public String checkCharging(double p) {
        if (p < 0 ) {
            return "Input khong hop le";
        } else if(p>= 0 && p <60 ) {
            return "Sac nhanh";
        } else if (p >= 60 && p < 100) {
            return "Sac thuong";
        } else if( p == 100){
            return "Tu dong ngat sac";
        } else if (p > 100) {
            return "Input khong hop le";
        }
        return "Input khong hop le";
    }
}
