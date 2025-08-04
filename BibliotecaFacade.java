public class BibliotecaFacade {
    private Catalogo catalogo;
    private Emprestimo emprestimo;
    private Usuario usuario;

    public BibliotecaFacade() {
        catalogo = new Catalogo();
        emprestimo = new Emprestimo();
        usuario = new Usuario();
    }

    public void buscarLivro(String titulo) {
        catalogo.buscarLivro(titulo);
    }

    public void realizarEmprestimo(String nomeUsuario, String livro) {
        usuario.verificarUsuario(nomeUsuario);
        emprestimo.emprestarLivro(livro);
    }
}
