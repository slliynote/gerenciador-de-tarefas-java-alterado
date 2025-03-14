package org.projetoJavaPolimofismo.tarefas;

import java.util.ArrayList;
import java.util.Scanner;

abstract class TarefaAbstrata {

    ArrayList<String> lista = new ArrayList<>();
    ArrayList<String> listaN = new ArrayList<>();
    ArrayList<String> listagem = new ArrayList<>();
    ArrayList<String> status = new ArrayList<>();

    Scanner nome = new Scanner(System.in);

    public static void menuStatico(){};

    public static void menu(){};

    public static void ObterAcao(){};

    public static void ObterTarefa(){};

    public static void Obterindice(){};

    public static void ObternovoStatus(){};

    public static void mudaStatus(){};

    public static void Obterprazo(){};

    public static void ObtertarefaParaRemover(){};

    public static void listar(){};

    public static void adicionaNaLista(){};



}
