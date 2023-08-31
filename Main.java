package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        kuvvet(1000,4);
        kuvvet(1000,5);


    }

    public static void kuvvet(int girilenSayi, int us){

        for (int i = 1; i<= girilenSayi; i*=us){
            if (i==1){
                continue;
            }
            System.out.println(i);
        }
    }


}


