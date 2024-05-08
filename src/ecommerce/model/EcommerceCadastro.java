package ecommerce.model;

public class EcommerceCadastro extends Ecommerce {
	
	private String idCadastro;
	
	public EcommerceCadastro(String produto, String cliente, String email, String telefone, int pedido, int codigoItem,
			float valor) {
		super(produto, cliente, email, telefone, pedido, codigoItem, valor);
	}

	public EcommerceCadastro(String produto, String cliente, String email, String telefone, int pedido, int codigoItem,
			float valor, String idCadastro) {
		super(produto, cliente, email, telefone, pedido, codigoItem, valor);
		this.idCadastro = idCadastro;
	}

	public String getIdCadastro() {
		return idCadastro;
	}

	public void setIdCadastro(String idCadastro) {
		this.idCadastro = idCadastro;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Cadastro: " + idCadastro);		
		}
}
