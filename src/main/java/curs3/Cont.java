package curs3;

public class Cont {
    private double contBancar;

    public void setContBancar(double contBancar) {
        this.contBancar = contBancar;
    }

    public double getContBancar() {
        return contBancar;
    }

    public void depunere(int suma){
        contBancar+=suma;
    }

    public void retragereNumerar(int suma) {
        if (contBancar > 0) {
            if (contBancar >= suma) {
                double temp = contBancar;
                contBancar = (temp - suma);
            } else {
                System.out.println("alege o suma mai mica");
            }
        } else {
            System.out.println("nu sunt suficienti bani, cont pe 0");
        }
    }}
