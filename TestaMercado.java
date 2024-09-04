package br.com.Mercado.Livre;


public class TestaMercado {

	
static Produto[] listaProduto= new Produto[10];

		public static void main(String[] args) throws PrecoInvalidoException {
			while (true) {
				menu();
			}
		}
		
		public static void menu() throws PrecoInvalidoException {
			System.out.println("Bem Vindo ao mercado Livre");
			int opcao = Teclado.lerInteiro("1-Cadastrar Produto \n2-Alterar Preco \n3-Excluir Produto \n4-Consultar todos os Produtos \n5-Sair");
			switch (opcao) {
			case 1:
				cadastrar();
				break;
			case 2:
				altere();
				break;
			case 3:
				excluir();
				break;
			case 4:
				consultar();
				break;
			case 5:
				System.out.println("Logout");
				System.exit(0);
				break;
			}
		}
		
		public static void cadastrar()throws PrecoInvalidoException {
			
			
			try {
				ProdutoFisico prodfis =null;
				ProdutoOnline prodon =null;
			String nome = Teclado.lerString("Titulo:");
			Double preco = Teclado.lerDouble("Preço:");
			int tipoProd = Teclado.lerInteiro("Tipo de produto: 1- Produto Físico 2- Produto Online");
			if (tipoProd == 1) {
				
				 prodfis = new ProdutoFisico(nome, preco);
				 for (int i = 0; i < listaProduto.length; i++) {
						if(listaProduto[i] == null) {
							listaProduto[i] = prodfis;
							break;
						}
					}
					
			} else {
				
				 prodon= new ProdutoOnline(nome, preco);
				 for (int i = 0; i < listaProduto.length; i++) {
						if(listaProduto[i] == null) {
							listaProduto[i] = prodon;
							break;
							
						}
					}
					
			}
			
			} catch(PrecoInvalidoException e) {
				System.out.println("erro"+ e.getMessage()) ;
			}
		}
		
			public static void altere() throws PrecoInvalidoException {
				String nome = Teclado.lerString("Nome do Produto");
				
				for (int i = 0; i < listaProduto.length; i++) {
					if(listaProduto[i] != null && listaProduto[i].getNome().equals(nome)) {
						Double preco = Teclado.lerDouble("Digite o Novo Preço:");
					
						
						if(listaProduto[i] instanceof ProdutoFisico) {
							listaProduto[i] = new ProdutoFisico(nome,preco);
						} else {
							listaProduto[i] = new ProdutoOnline(nome,preco);
						}
						break;
					}else {
						System.out.println("nao tem produto cadastrado");
						break;
					}
				
				
					
				
			}
			
	
			}
			public static void excluir() {
				String nome = Teclado.lerString("Nome do Produto");
				for (int i = 0; i < listaProduto.length; i++) {
					if(listaProduto[i] != null && listaProduto[i].getNome().equals(nome)) {
						listaProduto[i]=null;
				}
					}
				
			}
		public static void consultar() {
			for (int i = 0; i < listaProduto.length; i++) {
				
					if(listaProduto[i]!=null&&listaProduto[i] instanceof ProdutoFisico) {
						ProdutoFisico prod = (ProdutoFisico)listaProduto[i];
						System.out.println(prod.exibirDetalhe());
					}if(listaProduto[i]!=null&&listaProduto[i] instanceof ProdutoOnline ) {
						ProdutoOnline prod = (ProdutoOnline)listaProduto[i];
						System.out.println(prod.exibirDetalhe());
						
					}
					
				}
				
			
			
			}
			
		
			
}
