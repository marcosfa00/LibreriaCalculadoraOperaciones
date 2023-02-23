import com.marcosfa.entradasalida.EntradaSalida;

/**
 * rama Main
 */
public class Main {
    /**
     * Aquí ponemos a prueba los metodos de la clase operacionesbáscias
     * @param args Argumentos que le pasamos al "Method" main
     */
    public static void main(String[] args) {
        int opcion;
        Float numero1, numero2;
        Float resultado;

        opcion = EntradaSalida.EmtradaInt("1 --> Hacer suma\n2 --> Hacer resta\n3 --> Hacer multiplicación\n4 --> Hacer división\n5 --> Saír do programa");
        numero1 = EntradaSalida.EntradaFloat("Teclee o primer número da operación");
        numero2 = EntradaSalida.EntradaFloat("Teclee o segundo número da operación");
        if(numero1 == null || numero2==null){
            EntradaSalida.salida("Tiene que ser un número, no una letra", EntradaSalida.SALIDA_CONSOLA);
        }
        else {
            if (opcion > 0 && opcion < 5) {
                resultado = OperacionesBasicas.realizar(opcion, numero1, numero2);
                if (Float.isNaN(resultado)) {
                    EntradaSalida.salida("Error", EntradaSalida.SALIDA_CONSOLA);
                } else {
                    EntradaSalida.salida(("O resultado da operación é " + resultado), EntradaSalida.SALIDA_VENTANA);
                }
            }
        }
    }
}