package itl.com.coraline.presentacion;

import itl.com.ropas.servicios.*;
import java.util.Scanner;

public class CatalogoRopasPresentacion {
    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoRopas catalogo = new CatalogoRopasImpl();
        
        while(opcion != 0){
            System.out.println("Elige una opcion: \n"
                    + "1. Iniciar catalogo Ropa\n"
                    + "2. Agregar ropa\n"
                    + "3. Listar ropa\n"
                    + "4. Buscar ropa\n"
                    + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch(opcion){
                case 1:
                    catalogo.iniciarCatalogoRopas();
                    break;
                case 2:
                    System.out.println("Introduce la prenda que deseas");
                    var nombreRopa = scanner.nextLine();
                    catalogo.agregarRopa(nombreRopa);
                    break;
                case 3:
                    catalogo.listarRopas();
                    break;
                case 4:
                    System.out.println("Introduce una prende a buscar");
                    var buscar = scanner.nextLine();
                    catalogo.buscarRopa(buscar);
                    break;
                case 0:
                    System.out.println("Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        }
    }
}
