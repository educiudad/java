package java_curso;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // numeros inteiros
        // byte => 8 bits -128 a 127
        // short => 16 bits -32.768 a 32.767
        // int => 32 bits
        // long => 64bits

        //numeros decimais
        //float => 32bits poucos numeros depois da virgula
        //duble => 64 bits mais numeros

        //chair => representar um unico caracteri
        //boolean => true or false
        byte b = 100;
        short s = 10000;
        //int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Eduardo";
        boolean bool = true;

        int[] colecaoDeInteiros = {1, 2, 3, 4, 5, 6};
        int[] meusNUmeros = new int[10];



        if (str == "Eduardo") {
            System.out.println("verdadeiro");
        } else if (str == "Fernanda"){
            System.out.println("Fernanda");
        }
        else {
            System.out.println("erro");
        }

        System.out.println(colecaoDeInteiros[args.length]
        );

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Joao");


        System.out.println(nomes.get(0));

        nomes.remove("Joao");
        System.out.println(nomes.get(0));

        for(int i = 0; i <nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        for(String nome : nomes){
            System.out.println(nome);
        }

        int contador = 0;
        while(contador < 10 ){
            System.out.println("estou no while");
            contador++;
        }

        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meuDouble = meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        String minhaString = String.valueOf(meuDouble);



        Carro meuCarro = new Carro ("fusca");
        Carro meuCarro1 = new Carro("bmw");
        Carro meuCarro2 = new Carro("fusca");

        meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();
    }
}

class Carro {

    String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
        
    }

    public void acelerar(){
        System.out.println("acelerando" + this.modelo);
    }
}





