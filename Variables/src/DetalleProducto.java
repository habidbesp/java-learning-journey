public class DetalleProducto {
    public static void main(String[] args) {

        System.out.println("*** Tienda en Línea (Detalle Producto)");
        String nombreProducto = "Cartera";
        double precioProducto = 50.78;
        int cantidadDisponible = 20;
        boolean isAvailable = true;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isAvailable = " + isAvailable);

        nombreProducto = "Cartera aterciopelada";
        precioProducto = 45.80;
        cantidadDisponible = 0;
        isAvailable = false;

        System.out.println();

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("isAvailable = " + isAvailable);
    }
}
