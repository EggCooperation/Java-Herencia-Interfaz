package hoteles.entidades;

public class Hotel3 extends Hotel2 {

    protected boolean aireAcondicionado = true;
    protected boolean bar = true;

    public Hotel3(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones);
    }

}
