package model;

public class ProdutoModel {
    private int id;
    private String descricao;
    private float estoque;
    private float precoCusto;
    private float precoVenda;
    private StatusModel status;//não pegar só id
    public ProdutoModel() {
        id=0;
        descricao = new String();//autoboxing (instancia ao atribuir o primeiro valor)
        estoque = 0;
        precoCusto = 0;
        precoVenda = 0;
        status = new StatusModel();//null (obrigatório inicializar no construtor)
    }
    public ProdutoModel(int id, String descricao, float estoque, float precoCusto, float precoVenda,
            StatusModel status) {
        this.id = id;
        this.descricao = descricao;
        this.estoque = estoque;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getEstoque() {
        return estoque;
    }
    public void setEstoque(float estoque) {
        this.estoque = estoque;
    }
    public float getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }
    public float getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }
    public StatusModel getStatus() {
        return status;
    }
    public void setStatus(StatusModel status) {
        this.status = status;
    }
    
    
}
