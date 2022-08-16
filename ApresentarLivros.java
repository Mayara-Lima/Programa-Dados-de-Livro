package Exercicio7;

public class ApresentarLivros {
    public static void main(String[] args) {
    Livro obra1 = new Livro("Lucas Pimenta Júdice e Erik Fontenele Nybo", "Direito Das Startups",
            "978-85-362-5580-4", 190);
    Livro obra2 = new Livro("Tallis Gomes", "Nada Easy", "978-85-452-0181-6", 192);
    System.out.println(obra1.toString());
    System.out.println(obra2.toString());
    if (obra1.getNumeroDePaginas() > obra2.getNumeroDePaginas()) {
        System.out.println("O Livro "+obra1.getTitulo() + " tem mais páginas");
    } else {
        System.out.println(" O Livro "+obra2.getTitulo() + " tem mais páginas");
    }
}
}
