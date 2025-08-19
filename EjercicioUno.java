package laboratorio_1;

public class EjercicioUno {
    public class Main {

    public static void main(String[] args) {
        int[] numeros = {10, 25, 32, 45, 18};
        int buscado = 115;
        boolean encontrado=false;

        for (int numero: numeros){
            if(numero==buscado){
                encontrado=true;
                break;
            }
        } 
        if(encontrado){
            System.out.println("El numero "+ buscado+" esta en el array.");
        }
        else{
                System.out.println("El numero "+ buscado+" NO esta en el array.");
        }
    }
}
    
}
