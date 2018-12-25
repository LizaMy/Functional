package com.omsu.imit;

public class IntegrateFuction <T extends IFunction> implements IFanctional<T> {
    double a;
    double b;
   // double a1, b1, borderA1, borderB1;


    public IntegrateFuction(double a, double b) {
      //  LineEquation li = new LineEquation (a1, b1, borderA1, borderB1);
      // if(a1 < borderA1 || b1 > borderB1) throw new IllegalArgumentException("Ошибка");
        if(a > b) throw new IllegalArgumentException("Некорректный отрезок!");
        this.a = a;
        this.b = b;
    }

    public double decideFanctional(IFunction fun) {
        double res=0;
        int n = 1000;
        double h = (b-a)/n;
        for(int i=0; i<n; i++){
            res += fun.decideFunction(a + h * (i + 0.5));
        }
        res*=h;
        return res;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }

    }

