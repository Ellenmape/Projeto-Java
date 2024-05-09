package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Ecommerce;
import ecommerce.model.EcommerceProdutos;
import ecommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {
	private ArrayList<Ecommerce> listarProdutos = new ArrayList<Ecommerce>();
	int codigoItem = 0;
	int codigo = 0;
	
	public void procurarPorCodigo(int codigoItem) {
		var codigo = buscarNaCollection(codigoItem);

		if (codigo != null)
			codigo.visualizar();
		else
			System.out.println("\nProduto ID: " + codigoItem + " não foi encontrada!");
	}	

	public void listaProdutos() {
		for (var item : listarProdutos) {
			 item.visualizar();
		}

	}

	@Override
	public void cadastrar(Ecommerce produto) {
		listarProdutos.add(produto);
		System.out.println("\nO produto número: " + produto.getCodigoItem() + " foi criada com sucesso!");
	}

	@Override
	public void atualizar(Ecommerce produto) {
		var buscaProduto = buscarNaCollection(produto.getCodigoItem());
		if (buscaProduto != null) {
			listarProdutos.set(listarProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nProduto código: " + produto.getProduto() + " foi atualizada com sucesso!");
		} else
			System.out.println("\nProduto código: " + produto.getProduto() + " não foi encontrado");
		
	}

	@Override
	public void deletar(int codigoItem) {
		var produto = buscarNaCollection(codigoItem);

		if (produto != null) {
			if (listarProdutos.remove(produto) == true);
				System.out.println("\nProduto código: " + produto.getCodigoItem() + "foi deletado com sucesso!");
		} else
			System.out.println("\nProduto código: " + produto.getCodigoItem() + "não foi encontrado!");
	}

	public int gerarcodigoItem() {
		return ++codigo;
	}
	
	public Ecommerce buscarNaCollection(int codigoItem) {
	    for (var produto : listarProdutos){
	        if (produto.getCodigoItem() == codigoItem) { 
	            return produto;
	        }
	    }
	    return null;
	}

	@Override
	public int gerarCodigo() {
		// TODO Auto-generated method stub
		return 0;
	}


}

