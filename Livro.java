package Exercicio7;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int numeroDePaginas;

    public Livro(String autor,String titulo, String isbn, int numeroDePaginas){
        this.autor=autor;
        this.titulo=titulo;
        this.isbn=isbn;
        this.numeroDePaginas=numeroDePaginas;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String toString(){
        return " O livro com título " + this.getTitulo() + " e ISBN nº " + this.getIsbn() +" com autor "+ this.getAutor()+" tem "+ this.getNumeroDePaginas()+ " páginas";
    }
}

