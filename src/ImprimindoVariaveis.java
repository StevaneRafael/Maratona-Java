public class ImprimindoVariaveis {
    public static void main(String[] args){
        int idade = 10;
        double salarioDouble = 3000;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 1000l;
        char caractere = '\u0041'; //2 bytes - ver tabela unicode
        String nome = "Rafael";

        System.out.println( nome +" de idade: " + idade);
    }
}

