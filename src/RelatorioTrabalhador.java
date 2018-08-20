/*
Exercício 2
Crie um algoritmo que possua as variáveis nome,salario, sexo (M ou F), idade  e estado civil
Imprima da seguinte forma:
O trabalhador(a) <nome> do sexo <sexo>, idade <idade>, estado civil <estado civil> e <salario>
encontra-se empregado neste estabelecimento;
*/
public class RelatorioTrabalhador {
    public static void main(String[] args){
        String nome = "José da Silva";
        double salario = 1350;
        String sexo = "M";
        int idade = 34;
        String estadoCivil = "Casado";

        System.out.println("O trabalhador(a) " + nome + ", do sexo " + sexo + ", da idade de " + idade +
                ", estado cívil " + estadoCivil + ", e do salário " + salario + "encontra-se empregado " +
                "neste estabelecimento");
    }
}
