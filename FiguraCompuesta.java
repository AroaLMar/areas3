package com.company;

public class FiguraCompuesta implements Figura {


    private final Figura[] figuras;

    public Rectangulo[] getFigura;
    public FiguraCompuesta Rectangulo;

    public FiguraCompuesta(Figura[] figuras) {

        this.figuras = figuras;
    }


    @Override
    public double area() {
        double result=0.0;

        for(int i=0;i<figuras.length;i++){

            result+=figuras[i].area();
        }
        return result;
    }

    @Override
    public double perimetro() {

        double result=0.0;

        for(int i=0;i<figuras.length;i++){

            result+=figuras[i].perimetro();
        }
        return result;

    }

    public Figura[] getFiguras() {
        return figuras;
    }


}
