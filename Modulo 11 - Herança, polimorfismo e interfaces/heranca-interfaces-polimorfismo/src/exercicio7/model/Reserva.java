package exercicio7.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void reservar() {
        System.out.println("Reserva realizada!");
    }

    public void reservar(LocalDate dtReserva) {

        System.out.println("Reserva realizada para o dia " + dtReserva.format(formatter));

    }

    public void reservar(LocalDate dtReserva, int quantidade) {

        System.out.println("Reserva realizada para o dia "
                + dtReserva.format(formatter)
                + " para "
                + quantidade
                + " pessoas");
    }

}
