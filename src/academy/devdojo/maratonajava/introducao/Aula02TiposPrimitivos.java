package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, long, boolean
        int idade = 10;
        int casting = (int) 100000000000L; // nao é uma tecnica muito boa, melhor trocar o tipo da variavel
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;
        char caracteres = '\u0041';
        //String é uma classe, nao é um tipo primitivo, por isso é maiusculo.
        String nome = "Goku";
        // no java10 foi introduzido o var, mas estamos usando o 8.
        // var nome2 = "Vegeta";

        System.out.println("A idade é "+ idade + " anos");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(caracteres);
        System.out.println(casting);
        System.out.println("Oi meu nome é " + nome);
    }

}
