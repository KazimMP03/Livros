package Livros;

import java.util.ArrayList;
import java.util.List;

class Alunos extends Usuarios {
    protected static final int maxLivros = 15;
    private List<Livro> livrosEmprestados;
    private String ra;
    
    public Alunos(String nome, int idade, String email, String ra) {
        super(nome, idade, email);
        this.ra = ra;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivros(Livro livro) {
        if (livrosEmprestados.size() > maxLivros) {
            System.out.println(getNome()+", atingiu o limite máximo de livros emprestados.");
        } else {
            System.out.println("Livro emprestado com sucesso.");
            livrosEmprestados.add(livro);
        }
    }

    public void devolverLivros(Livro livro) {
        if (livrosEmprestados.isEmpty()) {
            System.out.println(getNome()+", não tem livros para devolver.");
        } else {
            System.out.println("Livro do(a) aluno(a) "+getNome()+" devolvido com sucesso.");
            livrosEmprestados.remove(livro);    
        }
    }

    public void listaLivros() {
        System.out.println("Livros emprestados por "+getNome()+":");
        for(Livro livro : livrosEmprestados) {
            System.out.println(livro.getTitulo());
        }
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}
