package ex1.formas;

import ex1.Ponto;

public class Circulo {
    private double raio;
    private Ponto ponto;

    public Circulo(double raio, Ponto ponto) {
        this.raio = raio;
        this.ponto = ponto;
    }

    public double calcularArea(double area) {
        return area = Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        String x = "";
        x += "Raio: " + raio + "\n";
        x += ponto.toString();
        return x;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }
}
