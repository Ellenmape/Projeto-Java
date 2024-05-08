package ecommerce.model;

public class EcommerceProdutos extends Ecommerce {
	
	private int idProduto;

	public EcommerceProdutos(String produto, String cliente, String email, String telefone, int pedido, int codigoItem,
			float valor) {
		super(produto, cliente, email, telefone, pedido, codigoItem, valor);
		}

	public EcommerceProdutos(String produto, String cliente, String email, String telefone, int pedido, int codigoItem,
			float valor, int idProduto) {
		super(produto, cliente, email, telefone, pedido, codigoItem, valor);
		this.idProduto = idProduto;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("\nProduto selecionado: " + idProduto);		
		}

}
