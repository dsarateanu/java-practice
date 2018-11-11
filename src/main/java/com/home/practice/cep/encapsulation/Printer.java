package com.home.practice.cep.encapsulation;

public class Printer {

    private double tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(double tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberOfPagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplexPrinter) {
            pagesToPrint = (pages / 2) + (pages % 2);
        }
        this.numberOfPagesPrinted += pagesToPrint;
        this.tonerLevel -= 0.01 * numberOfPagesPrinted;
        System.out.println("Printed pages");
        return pagesToPrint;
    }

    public double addToner(int tonerAmout) {
        if (tonerAmout > 0 && tonerAmout <= 100) {
            if (this.tonerLevel + tonerAmout > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmout;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int getNumberOfPagesPrinted(){
        return this.numberOfPagesPrinted;
    }

}
