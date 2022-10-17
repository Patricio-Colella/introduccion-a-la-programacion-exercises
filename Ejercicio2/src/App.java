import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("//if");
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa un numero para condicion if: ");
        int numeroif = Integer.parseInt(sc.nextLine());
        if(numeroif>0){
            System.out.println("numeroif:" + numeroif + " mayor a 0");    
        }else if(numeroif<0){
            System.out.println("numeroif:" + numeroif + " menor que 0");    
        }else{
            System.out.println("numeroif:" + numeroif + " igual a 0");    
        }
        System.out.println("/------------------------------------------/");

        System.out.println("//while");
        System.out.print("ingresa un numero para condicion while: ");
        int numeroWhile = Integer.parseInt(sc.nextLine());
        while(numeroWhile<3){
            System.out.println("numeroWhile: " + numeroWhile);    
            numeroWhile++;
        }
        System.out.println("/------------------------------------------/");

        System.out.println("//do while");
        do{
            System.out.println("puse un while(false),por lo tanto se ejecuta una sola vez");    
        }while(false);
        System.out.println("/------------------------------------------/");

        System.out.println("//for");
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("numeroFor: " + numeroFor);  
        }
        System.out.println("/------------------------------------------/");


        System.out.println("//switch");
        System.out.print("ingresa una estacion para condicion switch: ");
        String estacion = sc.nextLine();
        switch(estacion){
            case "verano":{
                System.out.println("hace mucho calor");
                break;
            }
            case "primavera":{
                System.out.println("crecen las flores");
                break;
            }
            case "otoño":{
                System.out.println("se caen las hojas");
                break;
            }
            case "invierno":{
                System.out.println("hace frio");
                break;
            }
            default:{
                System.out.println("no es una estacion");
            }
        }
        System.out.print("/------------------------------------------/");
        
        sc.close();
    }
}
