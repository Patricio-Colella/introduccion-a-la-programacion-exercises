public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("/-------------------/");
        System.out.println("//parte 1");
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        System.out.println(sumaTriple(n1,n2,n3));
        System.out.println("/-------------------/");
        System.out.println("//parte 2");

        Coche miCoche = new Coche();
        
        System.out.println("cant Puertas: " + miCoche.puertas);
        miCoche.administar_puertas(2);
        System.out.println("cant Puertas nuevas: " +miCoche.puertas);
        System.out.println("/-------------------/");
    }

    public static int sumaTriple (int n1 ,int n2,int n3){
        return n1+n2+n3;
    }

    /**
     * Coche
     */
    static class Coche {
        int puertas = 4;

        public void administar_puertas(int cant) {
            this.puertas=this.puertas + cant;
        }
        
    }
}
