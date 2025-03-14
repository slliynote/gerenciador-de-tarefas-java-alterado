import java.util.ArrayList;

import java.util.Scanner;


public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listaN = new ArrayList<>();
        ArrayList<String> listagem = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();



        Scanner nome = new Scanner(System.in);
        int num;


        do {

            System.out.println("digite uma terefa : ");
            System.out.println("digite um prezo: ");
            System.out.println("liste 5 tarefas  ");
            System.out.println("alterar status de tarefa. ");
            System.out.println("remova uma tarefa. ");
            System.out.println("sair... ");


            System.out.print("escolha uma ação: ");
            num = nome.nextInt();


            if (num == 1) {
                System.out.print(" digite uma tarefa: ");
                Scanner nome1 = new Scanner(System.in);
                String num2 = nome1.next();
                lista.add(num2);

                System.out.print("adicione um status: ");
                Scanner nome7 = new Scanner(System.in);
                String num6 = nome7.next();
                status.add(num6);
                listaN.add("");

            } else if (num == 2) {
                System.out.print("escreva uma tarefa: ");
                Scanner nome2 = new Scanner(System.in);
                String num3 = nome2.next();
                lista.add(num3);

                System.out.print("digite um prazo: ");
                Scanner nome3 = new Scanner(System.in);
                String num4 = nome3.next();
                listaN.add(num4);

                System.out.print("adicione um status: ");
                Scanner nome7 = new Scanner(System.in);
                String num6 = nome7.next();
                status.add(num6);


            } else if (num == 3) {

                System.out.println("liste 5 tarefas: ");

                for(int i = 0; i < 5; i++) {
                    Scanner nome7 = new Scanner(System.in);
                    String num6 = nome7.next();
                    listagem.add(num6);

                }

            } else if (num == 4) {
                System.out.print("indice do status: ");
                Scanner nome7 = new Scanner(System.in);
                double num6 = nome7.nextDouble();

                System.out.print("digite o novo status: ");
                Scanner nome0 = new Scanner(System.in);
                String num8 = nome0.next();

                for (double i = 0; i < status.size(); i++) {
                    if(i == num6 - 1 ){
                        status.set((int)i,num8);
                    }
                }
            }
            else if(num == 5){
                System.out.print("indice da tarefa a ser excluida: ");
                Scanner nome7 = new Scanner(System.in);
                double num6 = nome7.nextDouble();

                for (double i = 0; i < status.size(); i++) {
                    if(i == num6 - 1 ){
                        lista.remove((int)num6 -1);
                        status.remove((int)num6 -1);
                        listaN.remove((int)num6 -1);
                    }
                }

            }
            else{
                System.out.println("nenhuma das opções foi selecionada!");
            }
        }while (num != 6) ;

    }



