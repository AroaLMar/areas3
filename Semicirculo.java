package com.company;

public class Semicirculo extends Circulo{

    public Semicirculo(int diametro){

        super(diametro);
    }

    @Override
    public double area() {
        return super.area()/2;
    }

    @Override
    public double perimetro() {
        return super.perimetro()/2;
    }

}
