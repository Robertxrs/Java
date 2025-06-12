package entitie;

public class ProdutoValidationException extends Exception {

    private String mensagem;

    public ProdutoValidationException(String mensagem) {
        super(mensagem);

    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
