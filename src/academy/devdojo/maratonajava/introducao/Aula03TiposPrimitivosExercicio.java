package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario> na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Carlos Pacheco";
        String endereco = "Rua Carioba, 356";
        double salario = 5431.12;
        String dataRecebimentoSalario = "05.02.2025";
        String relatorio =  "Eu " + nome + ", morando no endereço " + endereco + " " +
                "confirmo que recebi o salario de " + salario + " na data " + dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
