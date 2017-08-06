package Prova_28_11_16;

// Nome: Ronye do Lago Cornetti Rocha
// RA: 77495

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Teste {
    
    public static void main(String[] args) {
        
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        ArrayList<Professor> professores = new ArrayList<Professor>();
        Curso curso = null;
        Professor professor = null;
        Aluno aluno = null;
        String escolha = "";
        int numero;
        
        do {
            
            //Menu
            escolha = JOptionPane.showInputDialog("Escolha uma opção: " + 
                    "\n1. Cadastro de Aluno" +
                    "\n2. Cadastro de Professor" +
                    "\n3. Cadastro de Curso" +
                    "\n4. Associar Curso com Professor" +
                    "\n5. Associar Curso com Aluno" +
                    "\n6. Listar todos os cursos cadastrados mostrando" +
                    " os alunos e professores desses cursos" +
                    "\n7. Sair");
            
            // Cadastro de Aluno
            if (escolha.equals("1")) {
                
                int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula:"));
                aluno = new Aluno(matricula);
                aluno.setNome(JOptionPane.showInputDialog("Nome do Aluno:"));
                alunos.add(aluno);
            }
            
            // Cadastro de Professor
            else if (escolha.equals("2")) {
                
                professor = new Professor();
                professor.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número do Professor:")));
                professor.setNome(JOptionPane.showInputDialog("Nome do Professor:"));
                professores.add(professor);
            }
            
            // Cadastro de Curso
            else if (escolha.equals("3")) {
                
                curso = new Curso();
                curso.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código do Curso:")));
                curso.setNome(JOptionPane.showInputDialog("Nome do Curso: "));
                cursos.add(curso);
            }
            
            // Associar Curso com Professor
            else if (escolha.equals("4")) {
                
                professor = null;
                numero = Integer.parseInt(JOptionPane.showInputDialog("Número do Professor:"));
                
                for (Professor prof : professores) {
                    if (prof.getNumero() == numero) {
                        professor = prof;
                        break;
                    }
                }
                
                numero = Integer.parseInt(JOptionPane.showInputDialog("Código do Curso:"));
                
                for (Curso c : cursos) {
                    if (c.getCodigo() == numero) {
                        curso = c;
                        break;
                    }
                }
                
                if (professor != null && curso != null) {
                    professor.addCurso(curso);
                    curso.addProfessor(professor);
                }
            }
                
            // Associar Curso com Aluno
            else if (escolha.equals("5")) {

                aluno = null;
                numero = Integer.parseInt(JOptionPane.showInputDialog("Matrícula do Aluno:"));

                for (Aluno a : alunos) {
                    if (a.getMatricula() == numero) {
                        aluno = a;
                        break;
                    }
                }

                curso = null;
                numero = Integer.parseInt(JOptionPane.showInputDialog("Código do Curso:"));

                for (Curso c : cursos) {
                    if (c.getCodigo() == numero) {
                        curso = c;
                        break;
                    }
                }

                if (curso != null && aluno != null) {
                    curso.addAluno(aluno);
                    aluno.setCurso(curso);
                }
            }
                
            // Listar todos os cursos cadastrados mostrando os 
            // alunos e professores desses cursos
            else if (escolha.equals("6")) {

                System.out.println("---Tödos os Cursos---");

                for (Curso c : cursos) {
                    System.out.println(c);
                }
            }         
                
            // Sair
            else if (escolha.equals("7")) {
                break;
            }
            
        } while (true);
    }
}
