package br.com.Mercado.Livre;

public abstract class Produto {
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) throws PrecoInvalidoException  {
		super();
		this.nome = nome;
		setPreco(preco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) throws PrecoInvalidoException{
		if(preco<0.0) {
			throw new PrecoInvalidoException("Digite valores acima de 0 para preços");
		}
		this.preco = preco;
	}

	public abstract String exibirDetalhe() ;
	

	public abstract Double calcular() ;
		
	
	
	

}
