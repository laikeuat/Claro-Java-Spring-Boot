package edu.camila.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Camila Fernanda";
        String segundoNome = "Carvalho";
        String nomeCompleto = gerarNomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String gerarNomeCompleto(String primeiroNome, String segundoNome){
        String  nomeCompleto = " Olá " + primeiroNome + " " + segundoNome;
        return nomeCompleto;
    }
}