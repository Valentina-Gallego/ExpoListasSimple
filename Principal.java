import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ObjDato> lista = new ArrayList<>();
        ListaSimple metodos = new ListaSimple();
        boolean seguir = true;

        while (seguir) {
            System.out.println("\n===== LISTA SIMPLE =====");
            System.out.println("1) Agregar elementos");
            System.out.println("2) Mostrar lista");
            System.out.println("3) Eliminar elemento");
            System.out.println("4) Salir");
            System.out.print("Opción: ");

            switch (sc.nextInt()) {
                case 1:
                    lista = metodos.llenar(lista, sc);
                    break;
                case 2:
                    metodos.mostrar(lista);
                    break;
                case 3:
                    metodos.eliminar(lista, sc);
                    break;
                case 4:
                    System.out.println("Hasta luego.");
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}
