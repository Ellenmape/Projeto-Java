package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.EcommerceController;
import ecommerce.model.Ecommerce;
import ecommerce.model.EcommerceProdutos;
import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {

		EcommerceController ecommerce = new EcommerceController();

		Scanner scanner = new Scanner(System.in);

		String produto, cor;
		int opcao;
		int codigoItem = 0;

		//ecommerce.listaProdutos();

		while (true) {

			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                JAVA ELETRO                          ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Item                        ");
			System.out.println("            2 - Listar Itens               	         ");
			System.out.println("            3 - Buscar Código do Item                ");
			System.out.println("            4 - Atualizar Dados de Cadastro          ");
			System.out.println("            5 - Excluir Item                         ");
			System.out.println("            6 - Formas de Pagamento                  ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				scanner.nextLine();
				opcao = 0;
			}

			if (opcao == 7) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nJAVA ELETRO - A gente descomplica tecnologia pra você!");
				sobre();
				scanner.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Cadastro de Produto\n\n");
				scanner.nextLine();
				
				codigoItem++;	
				System.out.println("o valor atual de codigo item é" + codigoItem);
				System.out.println("Digite o nome do produto a ser cadastrado: ");
				produto = scanner.nextLine();
				System.out.println("Digite a cor do produto: ");
				cor = scanner.nextLine();
				ecommerce.cadastrar(new EcommerceProdutos(produto, cor, codigoItem));				
				keyPress();
				break;
			case 2:
				System.out.println("\nListar todos os produtos");
				ecommerce.listaProdutos();
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar código do produto - por número\n\n");
				System.out.println("Buscar Produto pelo codigo ID");
				codigoItem = scanner.nextInt();
				ecommerce.procurarPorCodigo(codigoItem);

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados do produto\n\n");
				System.out.println("Digite o código do produto: ");
				codigoItem = scanner.nextInt();

				var buscaProduto = ecommerce.buscarNaCollection(codigoItem);
				
				if (buscaProduto != null) {
				System.out.println("Produto encontrado: " + buscaProduto.getProduto());
			    
			    System.out.println("Digite o novo nome do produto: ");
			    produto = scanner.nextLine();

			    System.out.println("Digite a nova cor: ");
			    cor = scanner.nextLine();

			    buscaProduto.setProduto(produto);
			    buscaProduto.setCor(cor);

			    System.out.println("Produto atualizado com sucesso!");
			}else {
			    System.out.println("Produto não encontrado.");
			}	
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Excluir Item\n\n");
				System.out.println("Digite o número do ID do Produto que deseja excluir: ");
				codigoItem = scanner.nextInt();
				ecommerce.deletar(codigoItem);
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Consultar formas de pagamento:\n");
				System.out.println("Cartão de crédito, cartão de débito e PIX");
						
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);

				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Ellen Silva");
		System.out.println("Generation Brasil - ellen.silva@genstudents.org");
		System.out.println("github.com/ellenmape");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}

	}

}
