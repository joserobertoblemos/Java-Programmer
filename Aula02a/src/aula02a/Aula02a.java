/**
 * Nesse Programa vamos estudar os tipos de "cast" para conversão de tipos primitivos
 */
package aula02a;

public class Aula02a {

    public static void main(String[] args) {
     byte num1 = 100;
     short num2 = num1;
     
     System.out.println("Byte: " + num1);
     System.out.println("Short: " + num2);
     System.out.println("=".repeat(40));
     
     short num3 = 1000;
     byte num4 = (byte) num3;                           //cast para converter short para byte
     
     System.out.println("Short: " + num3);          
     System.out.println("byte: " + num4);
     System.out.println("-24 porque 1000 nao cabe num byte, entao converte pra binario para aproximar");
     
     int num5 = 30000;
     short num6 = (short) num5;
     
     System.out.println("int: " + num5);
     System.out.println("short: " + num6);
     System.out.println("=".repeat(40));
     
     long num7 = 2_000_000_000L;
     int num8 = (int) num7;
     
     System.out.println("long: " + num7);
     System.out.println("int: " + num8);
     System.out.println("=".repeat(40));
     
     float num9 = 123.45f;
     double num10 = num9;
     
     System.out.println("float: " + num9);
     System.out.println("double: " + num10);
     System.out.println("=".repeat(40));
     
     double num11 = 0.123456789;
     float num12 = (float) num11;
     
     System.out.println("double: " + num11);
     System.out.println("float: " + num12);
     System.out.println("=".repeat(40));
     
     double num13 = 10.99;
     int num14 = (int) num13;
     
     System.out.println("double: " + num13);
     System.out.println("int: " + num14);
     System.out.println("int nao arredonda, ele corta.");
     System.out.println("=".repeat(40));
     
     int num15 = 123;
     double num16 = num15;
     
     System.out.println("int: " + num15);
     System.out.println("double: " + num16);
     System.out.println("=".repeat(40));
     
     
     
    }
    
}
