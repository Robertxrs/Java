package application;

import entitie.MensagemServico;
import entitie.ProdutoEntity;
import entitie.ProdutoController;
import entitie.ProdutoValidationException;
import entitie.ValidacaoServico;

public class Program {

    public static void main(String[] args) {
        ProdutoEntity produto = new ProdutoEntity(1, "Refrigerante", 10.90);
        ValidacaoServico validacaoServico = new ValidacaoServico();
        MensagemServico mensagemService = new MensagemServico();
        ProdutoController produtoController = new ProdutoController(validacaoServico, mensagemService);

        try {
            produtoController.salvarProduto(produto);
            System.out.println("\nPRODUTO");
            System.out.println("ID: " + produto.getId());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor: " + produto.getPreco());
        } catch (ProdutoValidationException e) {
            System.out.println(e.getMensagem());
        }
    }

}
