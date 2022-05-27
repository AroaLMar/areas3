package com.company;


public class Main {


    public static void main(String[] args) {


        FiguraCompuesta figuras=new FiguraCompuesta(new Figura[]{new Semicirculo(2),new Rectangulo(4,2),new Semicirculo(2)});



        double area= figuras.area();
        System.out.println("El area total de la figura es: "+area+ " cm2");
        double perimetroCoincidente=2*((Rectangulo)figuras.getFiguras()[1]).getAltura();
        double perimetro= figuras.perimetro()-perimetroCoincidente;
        System.out.println("El perimetro total de la figura es: "+perimetro+ " cm");

    }



    }
