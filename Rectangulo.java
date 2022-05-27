package com.company;

public class Rectangulo implements Figura{

    private double base;
    private double altura;

    public double getAltura() {

        return altura;
    }



    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimetro() {
        return base * 2.0 + altura * 2.0;
    }

}
