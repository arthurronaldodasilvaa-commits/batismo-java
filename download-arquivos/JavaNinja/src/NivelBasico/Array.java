package NivelBasico;

public class Array {
    public static void main(String[] args) {

        String[] ninja = new String[5];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        // Redeclarar
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikazi";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        // System.out.println(ninja[2]);

        // For para listar array

        int h = 0;

        for (int i = 0; i < ninja.length; i++) {
            h++;
            System.out.println("O " + h + "° Hokage é: " + ninja[i]);
        }

        System.out.println("---------------\n");

        h = 0;
        for (String s : ninja) {
            h++;
            System.out.println("O " + h + "° Hokage é: " + s);
        }

    }
}