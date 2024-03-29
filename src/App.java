import java.util.Scanner;
import java.util.Random;
public class App {

    static String[] proteina = {"Pollo Gratinado","Albondiggas de carne,", "Lomo de cerdo"};
    static String[] carbohidrato = {"Arroz Blanco", "Yuca cocida","Spaguetti"};
    static String[] ensalada = {"Remolacha,cebolla y cilantro", "Lechuga, zanahoria y queso costeño rayado","Tomate, cebolla y pimenton"};
    static int respuesta;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Cual es tú nombre");
        String nombre = sc.nextLine();
        System.out.println();
        System.out.println("BIENVENIDO "+ nombre);
        System.out.println();
        System.out.println("A continuación te sugiero un menú para el día de hoy, recuerda que si no tienes algún ingrediente puedo darte otro menú");
        System.out.println();
        do 
        {System.out.println("- "+ proteina[rand.nextInt(2)]);
        System.out.println();
        System.out.println("- "+ carbohidrato[rand.nextInt(2)]);
        System.out.println();
        System.out.println("- "+ ensalada[rand.nextInt(2)]);
        System.out.println();
        System.out.println("¿¿¿Quieres otro menú??? 1 para SI o 0 para NO");
        respuesta = sc.nextInt();
    }
       while (respuesta > 0);

       }
    
    public class Menu {
    String proteina = "";
    String carbohidrato = "";
    String ensalada = "";




    public static void getMenu(){};

    }
    public class dPollo extends Menu {

    }}


