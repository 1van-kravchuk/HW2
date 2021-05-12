package com.company;

public class Fractions {
    private long numerF;
    private long numerS;
    private short denumerF;
    private short denumerS;

    public Fractions(long numerF, int denumerF, long numerS, int denumerS) {
        if (denumerF == 0 && denumerS == 0) {
            System.out.println("Fraction si not correct");
        } else
            this.numerF = numerF;
            this.denumerF = (short) denumerF;
            this.numerS = numerS;
            this.denumerS = (short) denumerS;
    }
        public void add(){
        long ansU = numerF*denumerS+numerS*denumerF;
        int ansD = denumerF*denumerS;
            System.out.println("addition of "+numerF+"/"+denumerF+" + "+numerS+"/"+denumerS+" = "+ansU+"/"+ansD);
        }
    public void sub(){
        long ansU = numerF*denumerS-numerS*denumerF;
        int ansD = denumerF*denumerS;
        System.out.println("subtraction of "+numerF+"/"+denumerF+" - "+numerS+"/"+denumerS+" = "+ansU+"/"+ansD);
    }
    public void mult(){
        long ansU = numerF*numerS;
        int ansD = denumerF*denumerS;
        System.out.println("multiplication of "+numerF+"/"+denumerF+" * "+numerS+"/"+denumerS+" = "+ansU+"/"+ansD);
    }
    public void div(){
        long ansU = numerF*denumerS;
        int ansD = (int) (denumerF*numerS);
        System.out.println("dividing of "+numerF+"/"+denumerF+" / "+numerS+"/"+denumerS+" = "+ansU+"/"+ansD);
    }
}
