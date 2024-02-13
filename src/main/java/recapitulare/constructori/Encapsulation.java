package recapitulare.constructori;

public class Encapsulation {
    public int varsta;
    private String nume;
    private String prenume;
    private String cnp;

    public Encapsulation(String nume, String prenume, String cnp, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.varsta = varsta;
    }

    public String getCnp() {
        return cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }


    public void displayNume() {
        System.out.println(nume);
    }


    public void datePersoana() {
        System.out.println("nume: " +nume+ "," + "prenume: " + prenume +  "," + cnp + ","
                + "varsta: " + varsta);
    }
}
