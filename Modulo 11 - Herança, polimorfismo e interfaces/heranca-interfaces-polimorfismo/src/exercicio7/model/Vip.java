package exercicio7.model;

public class Vip extends Reserva {

    @Override
    public void reservar() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }
}
