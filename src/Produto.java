
public class Produto {

	String nomeLoja;
	double preco;
	String descricao;
	static String produtoInformatica;
	
	public Produto (String nomeLoja, double preco, String descricao, String produtoInformatica) {
		this.nomeLoja = nomeLoja;
		this.preco = preco;
		this.descricao = descricao;
		Produto.produtoInformatica = produtoInformatica;
	}
	
	public String getNomeLoja() {
		return nomeLoja;
	}
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return produtoInformatica;
	}
	
}
