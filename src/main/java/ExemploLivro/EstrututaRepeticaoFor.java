package main.java.ExemploLivro;

//ESTRUTURA DE REPETICAO FOR = para = ENQUANTO SIMPLIFICADO


public class EstrututaRepeticaoFor {
    public static void main(String[] args) {
        //cc=1 = cambalhota em 1

        //cc<=4 = enquanto for menor ou igual 4 realiza cambalhota

        //cc++ = incremento para somar Mais 1

        //("Cambalhota " + cc );// + cc = concatenar para somar 1,2,3,4

        for (int cc=1; cc<=4; cc++){
            System.out.println("Cambalhota " + cc );//concatenar para somar 1,2,3,4
        }
        /* PODERIA SER ESCRITO COM WHILE = ENQUANTO NORMAL
        *int cc=0
        * while (cc<=4){
        * System.out.println("Cambalhota ");
        * cc++;
        * }
        * */

        //contagem com enclemento 2
        for (int cd=0; cd<=10; cd+=2){
            System.out.println(cd);
        }

    }
}
