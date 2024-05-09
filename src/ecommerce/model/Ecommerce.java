package ecommerce.model;

public abstract class Ecommerce {
	private String produto;
	private String cor;
	private int codigoItem;
	
	
	public Ecommerce(String produto, String cor, int codigoItem) {
		super();
		this.produto = produto;
		this.cor = cor;
		this.codigoItem = codigoItem;
	}


	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getCodigoItem() {
		return codigoItem;
	}


	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}

	public void visualizar(){
		System.out.println("**************************");
		System.out.println("Produto: " + this.produto);
		System.out.println("Cor: " + this.cor);
		System.out.println("Código: " + this.codigoItem);	    
		}
		
}
