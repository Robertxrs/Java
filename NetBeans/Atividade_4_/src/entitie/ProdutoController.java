package entitie;

public class ProdutoController{

    private ValidacaoServico validacaoServico;
    private MensagemServico mensagemServico;

    public ProdutoController(ValidacaoServico validacaoServico, MensagemServico mensagemServico) {
        this.validacaoServico = validacaoServico;
        this.mensagemServico = mensagemServico;
    }

    public void salvarProduto(ProdutoEntity produto) throws ProdutoValidationException {
        if (validacaoServico.validarProduto(produto)) {
            mensagemServico.enviarMensagem("Produto salvo com sucesso");
        } else {
            throw new ProdutoValidationException("Erro ao salvar produto");
        }
    }
}
