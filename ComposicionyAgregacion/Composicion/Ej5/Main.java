package ComposicionyAgregacion.Composicion.Ej5;

public class Main {
    public static void main(String[] args) {
        Equipo miEquipo = new Equipo("Los Cracks FC");

        miEquipo.agregarJugador(new Portero("Juan Pérez", 1, "Atajadas Felinas"));
        miEquipo.agregarJugador(new Defensa("Carlos Torres", 4, "Marcaje Hombre a Hombre"));
        miEquipo.agregarJugador(new Mediocampista("Luis Ramírez", 8, "Pases Láser"));
        miEquipo.agregarJugador(new Delantero("Andrés Gómez", 9, "Goles de Chilena"));

        miEquipo.mostrarEquipo();
    }
}
