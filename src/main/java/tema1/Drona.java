package tema1;

public interface Drona {
    String TIP_ALIMENTARE = "Electrica";

    String getModel();

    void setModel(String model);

    void porneste();

    void opreste();
}
