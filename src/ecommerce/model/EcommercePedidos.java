package ecommerce.model;

public class EcommercePedidos extends Ecommerce {
	
	private int idPedido;

	public EcommercePedidos(String produto, String cliente, String email, String telefone, int pedido, int codigoItem,
			float valor) {
		super(produto, cliente, email, telefone, pedido, codigoItem, valor);
		}

	public EcommercePedidos(String produto, String cliente, String email, String telefone, int pedido, int codigoItem,
			float valor, int idPedido) {
		super(produto, cliente, email, telefone, pedido, codigoItem, valor);
		this.idPedido = idPedido;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("\nSeu número de pedido é: " + idPedido);		
		}

}
