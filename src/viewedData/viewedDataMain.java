package viewedData;

public class viewedDataMain {
    /*Para este primer ejercicio tendréis que realizar lo siguiente:
    Crea un proyecto de Java desde 0
    Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
    Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto
    en las sesiones.
    Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.*/

    public static void main(String[] args) {

        imprimir();

    }

    public static void imprimir(){

        //enteros
        byte byteVariable = 4;
        System.out.println("This is a byte Variable --> " + byteVariable);
        short shortVariable = 69;
        System.out.println("This is a short Variable --> "+shortVariable);
        int intVariable3 = 29;
        System.out.println("This is a int Variable --> "+intVariable3);
        long longVariable = 1234567890;
        System.out.println("This is a long Variable --> "+longVariable);

        //decimales
        float floatVariable = 5.5f;
        System.out.println("This is a float Variable --> "+floatVariable);
        double doubleVariable = 10.5d;
        System.out.println("This is a double Variable --> "+doubleVariable);
        double doubleVariable2 = 49.99;
        System.out.println("This is a double Variable --> "+doubleVariable2);

        //booleano
        boolean falseBooleanVariable = false;
        System.out.println("This is a false boolean Variable --> "+falseBooleanVariable);
        boolean TrueBooleanVariable = true;
        System.out.println("This is a true boolean Variable --> "+TrueBooleanVariable);

        //texto
        char charVariable = 'a';
        System.out.println("This is a char Variable --> "+charVariable);
        String StringVariable = "Hi, I'm Yenny Taborda From Colombia. Mi phone number is 3023259903";
        System.out.println("This is a String Variable -> "+ "'"+ StringVariable +"'");
    }
}
