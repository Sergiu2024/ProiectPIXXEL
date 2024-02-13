package Auto;

public abstract class Vehicule {
    private String producator;
    private String model;
    private int anul;
    private String tipCombustibil;
    private double eficientaCombustibil;

    public Vehicule(String producator, String model, int anul, String tipCombustibil, double eficientaCombustibil) {
        this.producator = producator;
        this.model = model;
        this.anul = anul;
        this.tipCombustibil = tipCombustibil;
        this.eficientaCombustibil = eficientaCombustibil;
}

public String getProducator() {
    return producator;
}

public String getModel() {
    return model;
}

public int getAnul() {
    return anul;
}

public String getTipCombustibil() {
    return tipCombustibil;
}

public double getEficientaCombustibil() {
    return eficientaCombustibil;
}

public abstract double calculeazaEficientaCombuatibil();

public abstract double calculeazaDistantaParcursa();

public abstract double getVitezaMaxima();
}
