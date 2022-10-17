import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese su edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("ingrese su telefono: ");
        String telefono = sc.nextLine();
        Persona user = new Persona();
        user.setEdad(edad);
        user.setNombre(nombre);
        user.setTelefono(telefono);
        System.out.println("nombre: "+user.getNombre());
        System.out.println("edad: "+user.getEdad());
        System.out.println("telefono: "+user.getTelefono());
        sc.close();
    }

    static class Persona {
        private int edad;
        private String nombre;
        private String telefono;
        
        public void setEdad(int edad){
            this.edad=edad;
        }
        public int getEdad(){
            return this.edad;
        }
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        public String getNombre(){
            return this.nombre;
        }
        public void setTelefono(String telefono){
            this.telefono=telefono;
        }
        public String getTelefono(){
            return this.telefono;
        }
        
    }
}

