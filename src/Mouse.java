
public class Mouse extends Produto {
	
	private String tipo;

	public Mouse(String nomeLoja, double preco, String descricao, String tipo) {
		super(nomeLoja, preco, descricao,produtoInformatica);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDescricao() {
		return produtoInformatica;
	}

	
	


	

}
