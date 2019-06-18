package com.gfa.DiApp.service;

import com.gfa.DiApp.Printer;
import org.springframework.beans.factory.annotation.Autowired;

//place for @Service
public class MyColorBlue implements MyColor {

    @Autowired
    Printer myPrinter;

    @Override
    public void printColor() {
        myPrinter.log("It is blue in color!");
    }
}