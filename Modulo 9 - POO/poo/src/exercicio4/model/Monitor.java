package exercicio4.model;

public class Monitor {

    private String local;
    private double temperatura;

    public Monitor(String local, double temperatura) {
        this.local = local;
        this.temperatura = temperatura;
    }

    public String getLocal() {
        return local;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void monitorando() {

        System.out.printf("""
                Sensor no local: %s
                Temperatura: %.2f
                """, local, temperatura);
        if (this.temperatura > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }

}
