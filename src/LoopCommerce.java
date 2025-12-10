import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopCommerce {
    public static void main(String[] args) {
        //Productos y precios
        String[] productos = {"Arroz","Fideos","Huevos","Leche","Cereal"};
        int[] precios = {200,250,300,100,150};
        int subtotal = 0;
        int opcion;

        Scanner scan = new Scanner(System.in);

        do {
            //Menú
            System.out.println("");
            System.out.println("------Menú------");
            System.out.println("1. Listar productos");
            System.out.println("2. Agregar productos al carrito");
            System.out.println("3. Mostrar monto carrito");
            System.out.println("4. Checkout");
            System.out.println("0. Salir");
            System.out.print("Ingrese el número de la opción: ");
            opcion = scan.nextInt();
            System.out.println("");

            if (opcion == 1) {
                //Ejercicio 1
                int index = 1;

                for (String prod : productos) {
                    System.out.println(index + " - " + prod + ": $" + precios[index - 1]);
                    index++;
                }
            } else if (opcion == 2) {
                System.out.println("------Lista de productos------");
                //Imprime los productos y su precio
                for (int i = 0; i < productos.length; i++) {
                    System.out.println(i + 1 + ".- " + productos[i] + " - $" + precios[i]);
                }
                ;
                //Solicitar elección:
                System.out.print(">Seleccione el producto a comprar por su número: ");
                int prodElegido = scan.nextInt() - 1;
                //Solicita cantidad:
                System.out.print("Ingrese la cantidad de " + productos[prodElegido] + "(s) a agregar al carrito: ");
                int cantidad = scan.nextInt();

                while (cantidad >= 1) {
                    System.out.println("Se ha seleccionado el producto: " + productos[prodElegido] +
                            " ($" + precios[prodElegido] + ") x " + cantidad);
                    subtotal = subtotal + precios[prodElegido] * cantidad;
                    System.out.println("Subtotal: " + subtotal);
                    System.out.print("Quiere agregar más? Ingrese el producto (ingrese 0 para salir): ");
                    prodElegido = scan.nextInt();
                    if (prodElegido == 0) {
                        break;
                    } else {
                        prodElegido = prodElegido - 1;
                    }
                    System.out.print("Ingrese cantidad de " + productos[prodElegido] + "(s) (0 para salir): ");
                    cantidad = scan.nextInt();
                }
                /*System.out.println("***Programa terminado***");
                System.out.println("Total:" + subtotal);*/
            } else if (opcion == 3) {
                System.out.println("--------------------------");
                System.out.println("Total carrito: " + subtotal);
                System.out.println("--------------------------");
            } else if (opcion == 0) {
                System.out.println("***Saliendo del programa***");
            } else if (opcion == 4) {
                String[] mensajes = new String[]{"Validando stock...","Stock disponible ✅",
                        "Procesando pago...","Pago aceptado!. Se realizará el envío a su dirección"};
                for (int i = 0; i < mensajes.length; i++) {
                    if(i!=1){
                        System.out.println(mensajes[i]);
                    }
                    //Espera falsa
                    try{
                        Thread.sleep(2000);     //1  segundo
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    if(i==0){
                        System.out.println(mensajes[i+1]);
                    }
                }
            } else {
                System.out.println("Opción no válida");
            }
        }
        while(opcion>0);
    }
}

//https://righteous-baron-17e.notion.site/LOOPCOMMERCE-E-Commerce-Console-Simulator-2c54db47a2558085bbd4d51c135a6eac#2c54db47a25580de8611ca5d2599d65f