package com.company;

public class Circulo implements Figura {

    private double diametro;

    public Circulo(int diametro) {
        this.diametro=diametro;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow((diametro/2), 2);

    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * (diametro/2);
    }
}
