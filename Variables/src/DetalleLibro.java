public class DetalleLibro {
    public static void main(String[] args) {
        // Detalle de un libro

        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        // Imprimir
        System.out.println(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);

        // Modificar titulo del libro
        tituloLibro = "El Señor de los Anillos";
        System.out.println(tituloLibro);
    }
}
