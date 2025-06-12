package entitie;

public class ValidacaoServico {

    public boolean validarProduto(ProdutoEntity produto) {
        return !produto.getNome().equals("");
    }
}
