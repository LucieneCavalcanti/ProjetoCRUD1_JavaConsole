package data;

import java.sql.PreparedStatement;

import model.ProdutoModel;
import model.StatusModel;

public class ProdutoData extends Conexao implements CRUD{

    public ProdutoData() throws Exception {
        super();
    }

    @Override
    public boolean incluir(Object obj) throws Exception {
        String sql="insert into tbprodutos (descricao,quantidade,
        precocusto,precovenda, idstatus) values (?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ProdutoModel objProduto = new ProdutoModel();
        if(obj instanceof ProdutoModel)
            objProduto = (ProdutoModel)obj;
        ps.setString(1,objProduto.getDescricao());
        ps.setFloat(2, objProduto.getEstoque());
        ps.setFloat(3, objProduto.getPrecoCusto());
        ps.setFloat(4, objProduto.getPrecoVenda());
        ps.setInt(5,objProduto.getStatus().getId());
        if(ps.executeUpdate()>0) return true;
        else return false;
    }

    @Override
    public boolean excluir(int id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public boolean atualizar(Object obj) throws Exception {
        String sql="update tbprodutos set descricao=?,quantidade=?,
        precocusto=?,precovenda=?, idstatus=? where id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ProdutoModel objProduto = new ProdutoModel();
        if(obj instanceof ProdutoModel)
            objProduto = (ProdutoModel)obj;
        ps.setString(1,objProduto.getDescricao());
        ps.setFloat(2, objProduto.getEstoque());
        ps.setFloat(3, objProduto.getPrecoCusto());
        ps.setFloat(4, objProduto.getPrecoVenda());
        ps.setInt(5,objProduto.getStatus().getId());
        ps.setInt(6,objProduto.getId());
        if(ps.executeUpdate()>0) return true;
        else return false;
    }

}
