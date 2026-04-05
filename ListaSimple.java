
import java.util.ArrayList;
import java.util.Scanner;

public class ListaSimple {

    public ArrayList<ObjDato> llenar(ArrayList<ObjDato> lista, Scanner sc) {
        boolean seguir = true;
        while (seguir) {
            ObjDato o = new ObjDato();
            System.out.print("Ingrese un número: ");
            o.setNumero(sc.nextInt());
            lista.add(o);
            System.out.println("¿Desea agregar otro? 1) Sí  2) No");
            if (sc.nextInt() == 2)
                seguir = false;
        }
        return lista;
    }

    public void mostrar(ArrayList<ObjDato> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.println("Lista:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("  [" + i + "] = " + lista.get(i).getNumero());
        }
    }

public void eliminar(ArrayList<ObjDato> lista, Scanner sc) {
    if (lista.isEmpty()) {
        System.out.println("La lista está vacía.");
        return;
    }

    System.out.print("¿Qué número desea eliminar? ");
    int dato = sc.nextInt();

    for (int i = 0; i < lista.size(); i++) {
        if (lista.get(i).getNumero() == dato) {
            lista.remove(i);
            System.out.println("Elemento " + dato + " eliminado.");
            return;
        }
    }

    System.out.println("Elemento no encontrado.");
}

}
