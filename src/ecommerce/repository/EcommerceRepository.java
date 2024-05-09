package ecommerce.repository;

import ecommerce.model.Ecommerce;

public interface EcommerceRepository {
	
	public void procurarPorCodigo(int codigoItem);
	public void listaProdutos();
	public void cadastrar(Ecommerce produto);
	public void atualizar(Ecommerce produto);
		
	public void deletar(int codigoItem);
	int gerarCodigo();

}
