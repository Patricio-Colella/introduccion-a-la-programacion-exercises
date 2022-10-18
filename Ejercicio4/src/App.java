import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("/-----clase cliente------/");        
        System.out.println("DATOS DEL CLIENTE"); 
        System.out.print("INGRESE EL NOMBRE DEL CLIENTE: "); 
        String nombre_cliente = sc.nextLine(); 
        System.out.print("INGRESE EL TELEFONO DEL CLIENTE: "); 
        int telefono_cliente = Integer.parseInt(sc.nextLine()); 
        System.out.print("INGRESE EL EDAD DEL CLIENTE: "); 
        int edad_cliente = Integer.parseInt(sc.nextLine()); 
        System.out.print("INGRESE EL CREDITO DEL CLIENTE: "); 
        int credito_cliente = Integer.parseInt(sc.nextLine()); 
        System.out.println("/-----clase trabajador------/");        
        System.out.println("DATOS DEL TRABAJADOR A CARGO DEL CLIENTE"); 
        System.out.print("INGRESE EL NOMBRE DEL TRABAJADOR: "); 
        String nombre_trabajador = sc.nextLine(); 
        System.out.print("INGRESE EL TELEFONO DEL TRABAJADOR: "); 
        int telefono_trabajador = Integer.parseInt(sc.nextLine()); 
        System.out.print("INGRESE EL EDAD DEL TRABAJADOR: "); 
        int edad_trabajador = Integer.parseInt(sc.nextLine()); 
        System.out.print("INGRESE EL SALARIO DEL TRABAJADOR: "); 
        int salario_trabajador = Integer.parseInt(sc.nextLine()); 

        Cliente cliente = new Cliente(nombre_cliente, telefono_cliente, edad_cliente, credito_cliente);
        Trabajador trabajador = new Trabajador(nombre_trabajador, telefono_trabajador, edad_trabajador, salario_trabajador);

        System.out.println("---------Cliente:");
        System.out.println("-nombre: "+cliente.nombre);
        System.out.println("-telefono: "+cliente.nombre);
        System.out.println("-edad: "+cliente.edad);
        System.out.println("-credito: "+cliente.credito);
        System.out.println("\n---------Empleador:");
        System.out.println("-nombre: "+trabajador.nombre);
        System.out.println("-telefono: "+trabajador.nombre);
        System.out.println("-edad: "+trabajador.edad);
        System.out.println("-credito: "+trabajador.salario);
        sc.close();
    }
    static class Persona{
        String nombre;
        int telefono;
        int edad;
        public Persona(String nombre,int telefono,int edad){
            this.nombre=nombre;
            this.telefono=telefono;
            this.edad=edad;
        }
    }
    static class Cliente extends Persona{
        int credito;
        public Cliente(String nombre,int telefono,int edad,int credito){
            super(nombre, telefono, edad);
            this.credito=credito;
        }
    }
    static class Trabajador extends Persona{
        int salario;
        public Trabajador(String nombre,int telefono,int edad,int salario){
            super(nombre, telefono, edad);
            this.salario=salario;
        }
    }
}
