package data;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.PessoaModel;

public class PessoaData extends Conexao implements CRUD{
    public PessoaData() throws Exception {}
    @Override
    public boolean incluir(Object obj) throws Exception {
        String sql="insert into tbpessoas (nome,email,senha,telefone,endereco) values (?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        PessoaModel p = new PessoaModel();
        if(obj instanceof PessoaModel)
            p = (PessoaModel)obj;
        ps.setString(1,p.getNome());
        ps.setString(2,p.getEmail());
        ps.setString(3,p.getSenha());
        ps.setString(4,p.getTelefone());
        ps.setString(5,p.getEndereco());
        if(ps.executeUpdate()>0) return true;
        else return false;
    }
    @Override
    public boolean excluir(int id) throws Exception {
        String sql="delete from tbstatus where id= ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,id);
        if(ps.executeUpdate()>0) return true;
        else return false;
    }
    @Override
    public boolean atualizar(Object obj) throws Exception {
        String sql="update tbstatus set descricao=? where id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        // ps.setString(1,obj.getDescricao());
        // ps.setInt(2,obj.getId());
        if(ps.executeUpdate()>0) return true;
        else return false;
    }

    @Override
    public ArrayList<Object> pesquisar(String pesquisa) throws Exception {
        // TODO Auto-generated method stub
        ArrayList<Object> dados = new ArrayList<>();
        return dados;
    }

    @Override
    public Object pesquisar(int id) throws Exception {
        // TODO Auto-generated method stub
        Object obj = new Object();
        return obj;
    }

}
