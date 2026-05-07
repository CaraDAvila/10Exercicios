package ex1;

public class Ponto {
    private int cordX;
    private int cordY;

    public Ponto(int cordX, int cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "cordX=" + cordX +
                ", cordY=" + cordY +
                '}';
    }

    public int getCordX() {
        return cordX;
    }

    public void setCordX(int cordX) {
        this.cordX = cordX;
    }

    public int getCordY() {
        return cordY;
    }

    public void setCordY(int cordY) {
        this.cordY = cordY;
    }
}
