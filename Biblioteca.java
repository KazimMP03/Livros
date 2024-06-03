package Livros;

public class Biblioteca {
    public static void main(String[] args) {
        Alunos aluno = new Alunos("Caio", 19, "caiomp10@gmail.com", "11940385156");
        Livro livro1 = new Livro("Harry Potter", "JK Rowling", 1997);

        aluno.emprestarLivros(livro1);
        aluno.listaLivros();
    }
}
