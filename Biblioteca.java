package Livros;

public class Biblioteca {
    public static void main(String[] args) {
        Alunos aluno = new Alunos("Caio", 19, "caiomp10@gmail.com", "11940385156");
        Livro livro1 = new Livro("Harry Potter", "JK Rowling", 1997);
        Livro livro2 = new Livro("A Guerra dos Tronos", "George R. R. Martin", 1996);
        Livro livro3 = new Livro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 1954);

        aluno.emprestarLivros(livro1);
        aluno.emprestarLivros(livro2);
        aluno.emprestarLivros(livro3);
        aluno.listaLivros();
    }
}
