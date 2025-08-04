package br.com.josemar.apresentacaojvm;

import java.util.Scanner;

import br.com.josemar.apresentacaojvmmodel.Pessoa;




public class Main {
    private static void gerenciarMemomria() {
        int x = 4;
        int y = x;

        System.out.println(x);
        System.out.println(y);
        System.out.println("------------------------");
        System.out.println(x == y);
        System.out.println("========Pessoa =======");
        Pessoa p = new Pessoa(1, "Josimar");
        System.out.println(p);
        Pessoa p2 = new Pessoa(2, "Eric");
        System.out.println(p2);
        //System.out.println(p2 == p);
        //p2.setNome("Eric");
       // System.out.println(p2);
        System.out.println(p == p2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;

        System.out.println("Gerenciamento de memória");

        System.out.println("Escolhe a opção desejada");
        op = input.nextInt();
        switch (op) {
            case 1:
            gerenciarMemomria();     
                break;
        
            default:
                break;
        }
    }
    
}