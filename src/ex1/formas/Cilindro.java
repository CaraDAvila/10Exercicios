package ex1.formas;

import ex1.Ponto;

public class Cilindro extends Forma implements Volume {
    double raio;
    double altura;
    Ponto ponto;

    public Cilindro(double raio, double altura, Ponto ponto) {
        this.raio = raio;
        this.altura = altura;
        this.ponto = ponto;
    }

    public double calcularArea() {
        double area;
        return area = 2 * Math.PI * raio * (raio + altura);

    }

    public double calcularVolume() {
        double volume;
        return volume = Math.PI * Math.pow(raio, 2) * altura;
    }

    public String toString() {
        return "Cilindro{" +
                "raio=" + raio +
                ", altura=" + altura +
                ", ponto=" + ponto +
                '}';


        //String x = "";
        //        x += "Raio: " + raio + "\n";
        //        x += ponto.toString();
        //        return x;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

}
