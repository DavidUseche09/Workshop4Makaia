import javax.imageio.stream.FileCacheImageOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opc = 0;
        Capitan capitan1 = new Capitan();
        Yate yate1 = new Yate();
        Velero velero1 = new Velero();

        do {
            System.out.println("-------------------------------------------------------------");
        System.out.println("****Bienvenido al mejor alquiler de embarcaciones del mundo!****");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Que desea hacer? | Ingrese numero segun opcion: " + "\n" + "NOTA: Este programa solo ingresa una persona a la vez! 0_0");
            System.out.println("0. Salir del programa :(");
            System.out.println("1. Crear Capitan ");
            System.out.println("2. Crear embarcacion ");
            System.out.println("3. Ver detalles del pedido ");
            opc = read.nextInt();

            switch (opc){
            case 0:
            System.out.println("Muchas gracias por utilizar nuestro Software.");
            System.out.println("Esperamos que vuelva pronto :) ");
            System.out.println(".....Fin del programa.....");
                    break;
            case 1:
            System.out.println("....Creacion de CAPITAN....");
            System.out.println("Ingrese el Nombre/ Apellido/ Matricula de navegacion: ");
                System.out.println("Ingrese el nombre del capitan: ");
                capitan1.setNombre(read.next());
                System.out.println("Ingrese el apellido del capitan: ");
                capitan1.setApellido(read.next());
                System.out.println("Ingrese la matricula de navegacion: ");
                capitan1.setMatriculaNavegacion(read.next());
                System.out.println("Capitan Creado exitosamente!");
            System.out.println("Datos capitan: " + " |Nombre: " + capitan1.getNombre()+ " |Apellido: " + capitan1.getApellido() + " |NumeroMatricula: " + capitan1.getMatriculaNavegacion());
                    break;

            case 2:
            System.out.println("....Creacion de EMBARCACION....");
            System.out.println("Seleccione que tipo de embarcacion desea usar (1. Yate/ 2.Velero): ");
            int choice = read.nextInt();

            if (choice == 1){
                System.out.println("Ingrese: Precio/ Year de fabricacion/ Longitud/ Cantidad de camarotes: ");
                System.out.println("Ingrese el precio base del Yate: ");
                yate1.setPrecioBase(read.nextInt());
                System.out.println("Ingrese el year de fabricacion: ");
                yate1.setAnnioFabricacion(read.nextInt());
                System.out.println("Ingrese la longitud del Yate: ");
                yate1.setEslora(read.nextInt());
                System.out.println("Ingrese la cantidad de camarotes: ");
                yate1.setCantidadCamarotes(read.nextInt());
                System.out.println("Yate creado existosamente!"+ "\n");
                System.out.println("Datos embarcacion: " + "Precio Inicial: " + yate1.getPrecioBase() + " |Year de fabricacion: " + yate1.getAnnioFabricacion() + " |Longitud: " + yate1.getEslora() + "m |Cantidad de camarotes: " + yate1.getCantidadCamarotes());
                if (yate1.validar(yate1.getCantidadCamarotes())){
                    System.out.println("*****!Su yate es lujoso!*****");
                }else {
                    System.out.println("****!Su yate es estandar!*****");
                }
                System.out.println("Monto de alquiler del velero: $" + yate1.calcularMontoAlquiler());
            }
            if (choice == 2) {
                System.out.println("Ingrese: Precio/ Year de fabricacion/ Longitud/ Cantidad de camarotes: ");
                System.out.println("Ingrese el precio base del Velero: ");
                velero1.setPrecioBase(read.nextInt());
                System.out.println("Ingrese el year de fabricacion: ");
                velero1.setAnnioFabricacion(read.nextInt());
                System.out.println("Ingrese la longitud del Yate: ");
                velero1.setEslora(read.nextInt());
                System.out.println("Ingrese la cantidad de mastiles: ");
                velero1.setCantidadMastiles(read.nextInt());
                System.out.println("Velero creado existosamente!" + "\n");
                System.out.println("Datos embarcacion: " + "Precio Inicial: " + velero1.getPrecioBase() + " |Year de fabricacion: " + velero1.getAnnioFabricacion() + " |Longitud: " + velero1.getEslora() + "m |Cantidad de camarotes: " + velero1.getCantidadMastiles());
                if (velero1.validar(velero1.getCantidadMastiles())) {
                    System.out.println("*****!Su velero es grande!*****");
                } else {
                    System.out.println("*****!Su velero es estandar!*****");
                }
                System.out.println("Monto de alquiler del velero: $" + velero1.calcularMontoAlquiler());
                }       break;

            case 3:
                System.out.println("******DETALLES COMPLETOS******");
                System.out.println("Datos capitan: " + " |Nombre: " + capitan1.getNombre()+ " |Apellido: " + capitan1.getApellido() + " |NumeroMatricula: " + capitan1.getMatriculaNavegacion());
                System.out.println("Datos embarcacion: " + "|Precio Final: " + yate1.calcularMontoAlquiler() + " |Year de fabricacion: " + yate1.getAnnioFabricacion() + " |Longitud: " + yate1.getEslora() + "m |Cantidad de camarotes: " + yate1.getCantidadCamarotes() + " |Es Lujoso?: " + yate1.validar(yate1.getCantidadCamarotes()));
                System.out.println("Datos embarcacion: " + "|Precio Final: " + velero1.calcularMontoAlquiler() + " |Year de fabricacion: " + velero1.getAnnioFabricacion() + " |Longitud: " + velero1.getEslora() + "m |Cantidad de camarotes: " + velero1.getCantidadMastiles() + " |Es Grande?: " + velero1.validar(velero1.getCantidadMastiles()));
                         break;
            }
        } while(opc != 0);
    }
}