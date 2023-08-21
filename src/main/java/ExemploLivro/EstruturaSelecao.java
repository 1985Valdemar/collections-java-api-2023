package main.java.ExemploLivro;

public class EstruturaSelecao {
    public static void main(String[] args) {
        //se a nota do aluno for maior ou =90
        //IMPRIMIR = A
        //se a nota do aluno for maior ou =80
        //IMPRIMIR = B

        notaAluno(60);

    }

    public static int notaAluno( int valor1) {


        if (valor1 >= 90) {//se nota
            System.out.println("A");
        } else {//seNão
            if (valor1 >= 80)//se nota
                System.out.println("B");
        }

        return valor1;
    }
}