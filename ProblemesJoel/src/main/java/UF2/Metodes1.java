package UF2;

class Exercici4 {

    public static void main(String[] args) {
        System.out.println(insertaCadena(null, null, 2));
        System.out.println(insertaCadena("1234", null, -2));
        System.out.println(insertaCadena(null, "56", -2));
        System.out.println(insertaCadena("1234", "56", -2));
        System.out.println(insertaCadena("1234", "56", -2));
        System.out.println(insertaCadena("1234", "56", -2));

    }

    public static String insertaCadena(String primer, String segon, int numero) {
        //Tractament dels casos especials
        //if (primer==null && segon==null) return null;
        if (primer == null) return segon;
        if (segon == null) return primer;
        if (numero < 0) numero = 0;
        if (numero > primer.length()) numero = primer.length();

        String trosDavant = primer.substring(0, numero);
        String trosDarrera = primer.substring(numero);


        return trosDavant + segon + trosDarrera;

    }
}
