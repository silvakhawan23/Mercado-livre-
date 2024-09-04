package br.com.Mercado.Livre;

public class ProdutoOnline extends Produto implements Desconto {
	public ProdutoOnline(String nome, Double preco) throws PrecoInvalidoException {
		super(nome, preco);
		
	}

	public Double calcular() {
		return aplicarDesconto()*1.50;
		
	}

	@Override
	public String exibirDetalhe() {
		return "ProdutoOnline [Preço final de venda =" + calcular() + ", nome =" + getNome() + ", Preço=" + getPreco()
				+ "]";
	}

	@Override
	public Double aplicarDesconto() {
		// TODO Auto-generated method stub
		return super.getPreco() *0.95 ;
	}


}
