package entitie;

public class ProdutoEntity {

    private int id;
    private String nome;
    private double preco;

    public ProdutoEntity() {

    }

    public ProdutoEntity(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
