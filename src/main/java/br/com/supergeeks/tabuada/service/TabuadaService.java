package br.com.supergeeks.tabuada.service;


public class TabuadaService{
    public static String gerarTabuada(int numero, int limite){
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= limite; i++){
            resultado.append(String.format("%d x %d = %d%n", numero, i, numero*i));
        }

        return resultado.toString();
    }
}