package com.company;

public class Money {
    private long hryvna;
    private byte kop;

    @Override
    public String toString() {
        return (kop < 10) ? (hryvna + ",0" + kop) : (hryvna + "," + kop);
    }

    public Money(long hryvna, int kop) {
        this.hryvna = hryvna;
        this.kop = (byte) kop;
    }

    public Money addUAH(Money money2) {
        long hrn = this.hryvna + money2.hryvna;
        byte kp = (byte) (this.kop + money2.kop);
        if (kp > 100) {
            hrn++;
            kp -= 100;
        }
        return new Money(hrn, kp);
    }

    public Money subUAH(Money money2) {
        long hrn = this.hryvna - money2.hryvna;
        byte kp = (byte) (this.kop - money2.kop);
        if (kp < 0) {
            hrn--;
            kp += 100;
        }
        return new Money(hrn, kp);
    }
}



