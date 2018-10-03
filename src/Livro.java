
public class Livro extends Produto {
	
	private String autor;
	
	public Livro(String nomeLoja, double preco, String descricao, String autor) {
		super(nomeLoja, preco, descricao, produtoInformatica);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getDescricao() {
		return produtoInformatica;
	}


}
