public class ReglasNombresVariables {
    // psvm
    public static void main(String[] args) {
        // Reglas nombres variables
        String nombreCompleto = "Habid Espinosa"; // Correcto, y buenas prácticas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Habid Espinosa 2"; // no aplica las buenas practicas (camelCase)
        System.out.println("NombreCompleto = " + NombreCompleto);
        // String nombre-cliente = "Juan"; // incorrecto - error

        String nombre_cliente = "Juan - snacke case"; // es válido, pero no es una buena practica
        String _apellido = "Pérez"; // Válido y buenas prácticas
        String $apellido = "Juárez"; // Válido y buenas prácticas
        int totPts = 10; // Válido pero no aplica buenas prácticas
        int totalPiezas = 10; // Válido y aplica buenas prácticas
        boolean casado = true; // Válida pero especificar
        boolean esCasado = true; // Válido y buenas practicas
        boolean isMaried = true; // Válido y buenas practicas - si estamos trabajando en Inglés
        boolean tieneSaldo = true; // Válido y buenas practicas
        boolean hasBalance = true; //Válido y buenas practicas - si estamos trabajando en Inglés
    }
}
