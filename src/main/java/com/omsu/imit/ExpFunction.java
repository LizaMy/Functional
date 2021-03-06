package com.omsu.imit;

public class ExpFunction implements IFunction {
    private double borderA;
    private double borderB;
    private double[] param = new double[2];
    public ExpFunction(double a,double b,double borderA,double borderB){
        if(borderA > borderB) throw new IllegalArgumentException("Некорректный отрезок!");
        this.borderA = borderA;
        this.borderB = borderB;
        param[0]=a;
        param[1]=b;
    }
    public double decideFunction(double x){
        if(x<borderA || x>borderB) throw new IllegalArgumentException("Функция не определена!");
        return param[0]*Math.exp(x)+param[1];
    }
    public double getBorderA(){
        return borderA;
    }
    public double getBorderB(){
        return borderB;
    }
}
