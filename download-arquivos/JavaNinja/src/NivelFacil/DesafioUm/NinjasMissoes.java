package NivelFacil.DesafioUm;

public class NinjasMissoes {
    public static void main(String[] args) {

        /* Ninja 1 */
        String nome1 = "Naruto";
        short idade1 = 16;
        String miss1 = "Derrotar o Zabuza";
        char dificul1 = 'C';
        /*--------------------------------------*/

        /* Ninja 2 */
        String nome2 = "Rock Lee";
        short idade2 = 15;
        String miss2 = "Treinar com pesos no corpo";
        char dificul2 = 'D';
        /*--------------------------------------*/

        /* Ninja 3 */
        String nome3 = "Kakashi";
        short idade3 = 24;
        String miss3 = "Protejer a aldeia do Orochimaru";
        char dificul3 = 'A';
        /*--------------------------------------*/

        /*Verificar missões...*/

        // Ninja 1
        if (dificul1 == 'C' && idade1 >= 15){
            System.out.println("O ninja " + nome1 + " Concluiu a missão: " + miss1);
        } else {
            System.out.println("O ninja " + nome1 + " Falhou a missão: " + miss1);
        }

        // Ninja 2
        System.out.println("----                                                     ////");
        if (dificul2 == 'D' && idade2 < 16){
            System.out.println("O ninja " + nome2 + " Falhou a missão: " + miss2);
        } else {
            System.out.println("O ninja " + nome2 + " Concluiu a missão: " + miss2);
        }

        // Ninja 3
        System.out.println("----                                                     ////");
        if (dificul3 == 'A' && idade3 >= 22){
            System.out.println("O ninja " + nome3 + " Concluiu a missão: " + miss3);
        } else {
            System.out.println("O ninja " + nome3 + " Falhou a missão: " + miss3);
        }
        /*--------------------------------------*/
    }
}

/*Saída Terminal:
 *
 * O ninja Naruto Concluiu a missão: Derrotar o Zabuza
 * ----                                                       ///
 * O ninja Rock Lee Falhou a missão: Treinar com pesos no corpo
 * ----                                                       ///
 * O ninja Kakashi Concluiu a missão: Protejer a aldeia do Orochimaru 
 *
 * */