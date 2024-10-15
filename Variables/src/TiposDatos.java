public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java (Primitivos)

        // tipo | tamaño(bits) | Rango

        // Enteros (valor por default es 0)
        // byte | 8 bits | -128 a 127
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);

        // short | 16 bits | -32,768 a 32,767
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);

        // int | 32 bits | -2^31 a 2^31-1 (tipo default - predeterminado)
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);

        // long | 64 bits | -2^63 a 2^63-1
        long tipoLong = 987654321098765432L; // L o l para indicar que es un tipo long
        System.out.println("tipoLong = " + tipoLong);


        // Punto Flotante (valor por default es 0.0)
        // float | 32 bits | Números decimales de menor precisión
        float tipoFloat = 3.14F; // F o f para indicar tipo float
        System.out.println("tipoFloat = " + tipoFloat);

        // double | 64 bits | Números decimales de mayor precisión (tipo default - predeterminado)
        double tipoDouble =3.1415; // 3.1415D - D o d para indicar tipo double (Opcional)
        System.out.println("tipoDouble = " + tipoDouble);


        // Caracter (valor default '\u0000')
        // char | 16 bits | Un único carácter Unicode
        // Ravisar caracteres del juego unicode
        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);


        // Booleano (valor default - false)
        // true - false
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (tipos referencia)
        String nombre = null; // valor por default
        System.out.println("nombre = " + nombre);
        nombre = "Juan Pérez";
        System.out.println("nombre = " + nombre);

    }
}
