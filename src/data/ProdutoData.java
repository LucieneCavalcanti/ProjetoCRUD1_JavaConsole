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
        ps.setString(1,st.getDescricao());
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

}
