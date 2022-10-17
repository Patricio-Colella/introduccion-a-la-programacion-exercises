import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese su edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("ingrese su correo: ");
        String correo = sc.nextLine();
        Persona user = new Persona();
        user.setEdad(edad);
        user.setNombre(nombre);
        user.setCorreo(correo);
        System.out.println("nombre: "+user.getNombre());
        System.out.println("edad: "+user.getEdad());
        System.out.println("correo: "+user.getCorreo());
        sc.close();
    }

    static class Persona {
        private int edad;
        private String nombre;
        private String correo;
        
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
        public void setCorreo(String correo){
            this.correo=correo;
        }
        public String getCorreo(){
            return this.correo;
        }
        
    }
}

