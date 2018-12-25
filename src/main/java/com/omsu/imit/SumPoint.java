package com.omsu.imit;

public class SumPoint<T extends IFunction> implements IFanctional<T>{
    double a;
    double b;

    public SumPoint(double a, double b) {

        if(a > b) throw new IllegalArgumentException("Некорректный отрезок!");
        this.a = a;
        this.b = b;
    }

    public double decideFanctional(IFunction fun) {
        double res=0;
        res+=fun.decideFunction(a);
        res+=fun.decideFunction(b);
        res+=fun.decideFunction((b+a)/2);
        return res;
    }
}
