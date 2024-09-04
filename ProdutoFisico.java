package br.com.Mercado.Livre;

public class ProdutoFisico extends Produto implements Desconto {
	
	public ProdutoFisico(String nome, Double preco) throws PrecoInvalidoException {
		super(nome, preco);
		
	}

	public Double calcular() {
		return aplicarDesconto() * 1.40;
		
	}

	@Override
	public String exibirDetalhe() {
		return "ProdutoFisico [Preço final de venda =" + calcular() + ", nome do produto=" + getNome() + ", preço do produto=" + getPreco()
				+ "]";
	}

	@Override
	public Double aplicarDesconto() {
	
		return this.getPreco() * 0.90;
	}

}
