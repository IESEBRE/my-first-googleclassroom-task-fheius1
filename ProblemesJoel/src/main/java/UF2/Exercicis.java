package UF2;


public class Exercicis {


    public static void main(String[] args) {

        System.out.println(buscaCadena("Hola molt bones", "m", 3));




    }

    //Exercici 4
    public static String insertaCadena(String primer, String segon, int numero) {
        //Tractament dels casos especials
        if (primer == null) return segon;
        if (segon == null) return primer;
        if (numero < 0) numero = 0;
        if (numero > primer.length()) numero = primer.length();

        String trosDavant = primer.substring(0, numero);
        String trosDarrera = primer.substring(numero);

        return trosDavant + segon + trosDarrera;
    }

    //Exercici 6


    //Exercici 7
    public static String subcadena(String cadena, int ini, int fi) {
        //Tractament dels casos especials
        if (cadena == null) return null;
        if (ini < 0) ini = 0;
        if (fi <= 0 || ini >= cadena.length() || ini >= fi) return "";
        if (fi > cadena.length()) fi = cadena.length();

        return cadena.substring(ini, fi);
    }


    //Exercici 13
    //De dalt cap a baix
    public static int numvector(int[] num) {

        //Cas especial
        if (num==null || num.length==0 ) return 0;

        boolean negatiu= (num[0]<0);

        int potencia = (int) Math.pow(10.0, num.length - 1);
        int resultat = 0;
        for (int i = 0; i < num.length; i++) {
            if (i==0 && num[0]<0) resultat = num[i] * potencia*-1;
            else resultat = num[i] * potencia;
            potencia = potencia / 10;
        }
        if (num[0]<0) resultat*=-1;
        return resultat;
    }

    /* De baix cap a dalt
     int potencia= 10;
        int resultat=0;
        for (int i = num.length-1; i >= 0 ; i++) {
            resultat=+num[i]*potencia;
            potencia= potencia*10;
        }

     */


    //Exercici 8
    public static int[] vectorDigits(int num) {

        int[] resultat = new int[Integer.toString(num).length()]; //Crear lo vector
        //resultat= new int[(num+"").length()]; Manera mes curta de crear lo vector

        for (int i = resultat.length-1; i >= 0 ; i++) {
            resultat[i]= num % 10;
            num= num /10;

        }
        return resultat;
    }


    //Exercici 11
    public static int buscaCadena(String text, String subcadena, int num){

        //Casos especials
        if (text == null || subcadena == null) return -1;
        if (num < 0) num = 0;
        if (subcadena.isEmpty()) return (num<text.length()?num:text.length());
        if (num >= text.length()) return -1;
        if (subcadena.length() > text.length()) return -1;


        //Casos de parada
        for (int i = num; i + subcadena.length() < text.length(); i++) {
            //Comprovar si la primera lletra del segon text coinxideix amb la i-esima del primer
            if (text.substring(i, i + subcadena.length()).equals(subcadena)) return i;

        }


        return -1;
        //return text.indexOf(subcadena,num);
        /*Versio1

        //Casos especials
        if (text == null || subcadena == null) return -1;
        if (num < 0) num = 0;
        if (subcadena.isEmpty()){
            if (num >= text.length()) return text.length();
            else return num;
        }
        if (num >= text.length()) return -1;
        if (subcadena.length() > text.length()) return -1;
        for (int i = num; i < text.length(); i++) {
            if (text.substring(i, i + subcadena.length()).equals(subcadena)) return i;
        }



         */
    }




    //Fer lo mateix pero que sigui en string , es a dir sense operacions matematiques, utilizant metodes com Integer, CharAt, etc..
    public static int[] vectordigits2(int num) {
        //Comprovar si el numero es negatiu
        boolean negatiu= num<0;
        if (negatiu) num*=-1;


        //Passem el parametre a STRING
        String text = Integer.toString(num);
        int resultat [] = new int[text.length()];

        for (int i = 0; i < text.length(); i++) {
            resultat[i]=(char)text.charAt(i)-'0';
        }

        if (negatiu) num*=-1;

        return resultat;
    }


    //Exercici 17
    public static int[] tractaParametres(int ... num) {

        //Casos especial
        if (num == null || num.length==0 ) return null;

        int suma, max, min;
        suma= max = min = num [0];

        for (int i = 1; i < num.length; i++) {
            suma+=num[i];
            if (num[i]>= max) max= num[i];
            if (num[i]<= min) min= num[i];
        }

        return new int[]{suma, num.length, max, min};

    }


    //Exercici 29
    public static int mcdRecursiu(int a, int b) {

        if (a==b) return a;
        if (a>b) return mcdRecursiu(a-b,b);

        return mcdRecursiu(a, b-a);

    }

    //Exercici 30
    public static int sumaNaturals(int n) {

        if (n==0) return 0;
        if (n<0) return -1;

        //Cas recursiu
        return  n+sumaNaturals(n-1);

    }

    //Exercici 31
    public static double potenciaRec(double base, int exponent) {

        if (exponent==0) return 1;

        //Casos recursius
        if (exponent>0) return base*potenciaRec(base, exponent-1);
        return 1 / potenciaRec(base, -exponent); // o exponent * -1


    }

    //Exercici 33
    public static int nombreCombinatoriRec(int n , int m) {

        //Casos parada
        if (n<m) return -1;
        if (n==m || m==0) return 1;

        //Casos recursius
        return nombreCombinatoriRec(n-1, m-1)+nombreCombinatoriRec(n-1,m);


    }

    //Exercici 23
    public static int factorial(int n)  {

        if (n==0) return 0;
        if (n<0) return 1;
        return n*factorial(n-1);

    }


    //Exercic 32
    public static int fibonaci(int n) {
        //Casos parada
        if (n<0) return -1;
        if (n==0 || n==1) return n;

        //Cas recursiu
        return fibonaci(n-1 + fibonaci(n-2));

    }

    public static int fibonaci2(int n){
        //Casos parada
        if (n<0) return -1;
        if (n==0 || n==1) return n;

        long primer=0;
        long segon=1;
        while (n>2){

            //Calvular nous primer i segon
            long temp= primer;
            primer=segon;
            segon=segon+temp;

            //Decrement la n per evitar bucle infinit
            n--;

        }

        return 0;

    }


    public static double potenciaE (int x){

        double resultat=1;
        if (x==0) return resultat;

        for (int i = 1; i < 10; i++) {
            resultat+= potenciaRec(x,i)/factorial(i);

        }

        return 0;

    }

    //Exercici 36

    /*public static double seguentPrimer (int n){

        while (true){
            n++;
            if ()
        }

    }*/


    //Exercici 39
    public static boolean diaseguent (int dia, int mes, int any){
        if (dia<1 || dia>31) return false;

        if (mes<1 || mes>12) return false;



        return true;
    }


    //Exercici 40

    public static int[] diferenciadies(int dia, int mes, int any) {

        return new int[]{0};

    }


    //Exercici



}