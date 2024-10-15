public class Constantes {
    // es como const en JS
    public static void main(String[] args) {
        System.out.println("*** Constantes en Java ***");
        final var DIAS_SEMANA = 7;
        System.out.println("DIAS_SEMANA = " + DIAS_SEMANA);
        // DIAS_SEMANA = 8 // error, no se puede reescribir
        final var PI = 3.1416;
        System.out.println("PI = " + PI);
        System.out.println("Math.PI = " + Math.PI);
        final var MENSAJE_BIENVENIDO = "Bienvenido a la Universidad Java";
        System.out.println("MENSAJE_BIENVENIDO = " + MENSAJE_BIENVENIDO);
        final var SEGUNDOS_POR_MINUTO = 60;
        System.out.println("SEGUNDOS_POR_MINUTO = " + SEGUNDOS_POR_MINUTO);
    }
}
