/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Scanner text = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        Scanner ender = new Scanner(System.in);

        System.out.println("\t Bem vindo ao cadastro! \n");
        System.out.println("digite uma op��o:\n[0]- aluno\n[1]- professor\n:");
        int valor = number.nextInt();

        switch (valor) {
            case 0:
                //aluno
                System.out.println("digite o nome do aluno :\n");
                a1.setNome(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o rg do aluno :\n");
                a1.setRg(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o cpf do aluno :\n");
                a1.setCpf(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o registro do aluno do aluno :\n");
                a1.setRegistroAluno(number.nextInt());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a nota do vestibular do aluno :\n");
                a1.setNotaVestibular(number.nextFloat());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o curso do aluno :\n");
                a1.setCurso(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a data matricula do aluno :\n");
                a1.setDataMatricula(text.nextLine());

                System.out.println("-----------------------------------------------------");

                System.out.println("digite o endere�o do aluno :\n");
                a1.setEndereco(ender.nextLine());

                System.out.println("-----------------------------------------------------");

                System.out.println("\t - Dados do Aluno RA n�: " + a1.getRegistroAluno() + "-\n");
                System.out.println(a1.retornaDadosAluno());

                break;

            case 1:
                System.out.println("digite o nome do professor :\n");
                p1.setNome(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o rg do professor :\n");
                p1.setRg(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o cpf do professor :\n");
                p1.setCpf(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a matricula do professor :\n");
                p1.setMatriculaProfessor(number.nextInt());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a data admissao do professor :\n");
                p1.setDataAdmissao(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o salario horista do professor :\n");
                p1.setSalarioHorista(number.nextDouble());

                System.out.println("-----------------------------------------------------");
                System.out.println("digite o endere�o do professor :\n");
                p1.setEndereco(ender.nextLine());

                System.out.println("-----------------------------------------------------");
                System.out.println("\t - Dados do Professor matricula n�: " + p1.getMatriculaProfessor() + "-\n");
                System.out.println(p1.retornaDadosProfessor());
                break;
                
            default:
                System.out.println("valor nao existente!");
                //tratativa de erro
              
        }
        
        text.close();
        number.close();
        ender.close();
    }

}
