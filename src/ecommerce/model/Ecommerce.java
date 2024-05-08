package ecommerce.model;

public abstract class Ecommerce {
	private String produto;
	private String cliente;
	private String email;
	private String telefone;
	private int pedido;
	private int codigoItem;
	private float valor;
	
	public Ecommerce(String produto, String cliente, String email, String telefone, int pedido, int codigoItem,
			float valor) {
		super();
		this.produto = produto;
		this.cliente = cliente;
		this.email = email;
		this.telefone = telefone;
		this.pedido = pedido;
		this.codigoItem = codigoItem;
		this.valor = valor;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getPedido() {
		return pedido;
	}
	public void setPedido(int pedido) {
		this.pedido = pedido;
	}
	public int getCodigoItem() {
		return codigoItem;
	}
	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void visualizar() {

		}
		
}
