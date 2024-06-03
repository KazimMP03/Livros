package Livros;

import java.util.ArrayList;
import java.util.List;

class Professores extends Usuarios {
    protected static final int maxLivros = 15;
    private List<Livro> livrosEmprestados;
    private int id;
    
    public Professores(String nome, int idade, String email, int id) {
        super(nome, idade, email);
        this.id = id;
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
            System.out.println("Livro devolvido com sucesso.");
            livrosEmprestados.remove(livro);    
        }
    }

    public void listaLivros() {
        System.out.println("Livros emprestados por "+getNome()+":");
        for(Livro livro : livrosEmprestados) {
            System.out.println(livro.getTitulo());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
