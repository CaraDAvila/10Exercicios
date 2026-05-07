package ex1;

import ex1.formas.Cilindro;
import ex1.formas.Circulo;
import ex1.formas.Forma;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> forma = new LinkedList<>();

        forma.add(new Circulo(5, new Ponto(0, 0)));
        forma.add(new Circulo(1.5, new Ponto(2, 3)));
        forma.add(new Circulo(10, new Ponto(-4, 7)));

        forma.add(new Cilindro(5, 10, new Ponto(0, 0)));
        forma.add(new Cilindro(3, 7.5, new Ponto(1, 1)));
        forma.add(new Cilindro(8, 2, new Ponto(2, -3)));

        print(forma);

    }

    private static void print(List<Forma> forma) {
        for (Forma lista : forma) {
            System.out.println(lista);
            System.out.println("Area: " + lista.calcularArea());
            System.out.println("Volume: " + lista.calcularVolume());
            System.out.println();
        }
    }
}
