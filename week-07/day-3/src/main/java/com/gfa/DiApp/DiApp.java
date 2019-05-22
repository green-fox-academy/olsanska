package com.gfa.DiApp;
import com.gfa.DiApp.service.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApp implements CommandLineRunner {

    @Autowired
    Printer myPrinter;

    @Autowired
    MyColor myColor;

    public static void main(String[] args) {
        SpringApplication.run(DiApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        myColor.printColor();
    }
}