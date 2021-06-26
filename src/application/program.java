package application;

import uitilities.product;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //N VEZES VAI PERDI PRODUTO(NOME, PRECO)
        int n = sc.nextInt();
        sc.nextInt();//comsumir o enter gerado

        //INTACIA DE UM VETOR EM TIPO REFERENCIA
        product[] vetor = new product[n];//<tipoVetroDaClasse[]> <nome> = novo <vetroDaClasse[associa com]>
        //vetor do tipo referenca ou seja esta em nulo na memoria Heap
        //isso significa que tera que instanciar um objeto para cada vetro criado que o mesmo apontara para o objeto


        //CADA CONTAGEM(0<N;0++) DO FOR LER O PRODUTO, INTACIA OS OBJETOS E QUARDA NAS POSISSOES DO VETROR
        for (int i = 0; i < n; i++) {//contagem de 0 a n
            String nome = sc.nextLine();//contagem de 0 ao n
            double price = sc.nextDouble();//contagem de 0 ao n
            vetor[i] = new product(nome, price);//intacia um novo produto e vetro vai capiturando os objetos
        }//tudo na contagem do 'i' do 0 ao n. vetor[0 ao n]

        //MEDIA DOS PREÇOS E FUNCAO VETOR.LENGTH
        double somaDosPrecos = 0.0;
        for (int i = 0; i < vetor.length; i++) {//vetro.length=n; ta fazendo papel do 'n'
                                                // pois o length e o propio tamanho do vetro que 'n'
            somaDosPrecos += vetor[i].getPreco();
        }
        double media = somaDosPrecos / vetor.length;
        System.out.printf("PREÇO MÉDIO = %.2f%n", media);
    }


}

