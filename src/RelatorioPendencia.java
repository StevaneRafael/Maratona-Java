/*
Exercício 1: Crie um algoritmo que possua variáveis para salvar os seguintes dados:
Nome, Endereço e Telefone de uma pessoa.
Imprima essas variáveis da seguinte forma:
O <nome> domiciliado no <endereço> e telefone<telefone> não possui nenhum tipo de
pendência.

 */
public class RelatorioPendencia {
    public static void main(String[] args) {
        String nome = "Goku";
        String endereco = "439 East Distric";
        String telefone = "(11)1234-5689";

        System.out.println("O " + nome + " domiciliado no endereço " +
                endereco + " e telefone " + telefone + " não possui pendências.");
    }
}
