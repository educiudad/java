package java_curso;

public class carro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("fusca");
        Carro meuCarro1 = new Carro("Sandero");
        Carro meuCarro2 = new Carro("BMW");

        String result = meuCarro1.acelerar();
        meuCarro2.acelerar();
        meuCarro1.acelerar();

        System.out.println("Carro acelerado com sucesso");
    }
}
