package data;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.StatusModel;

public class StatusData extends Conexao implements CRUD{

    @Override
    public boolean incluir(StatusModel obj) throws Exception {
        String sql="insert into tbstatus (descricao) 
        values (?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getDescricao());
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
    public boolean atualizar(StatusModel obj) throws Exception {
        String sql="update tbstatus set descricao=? where id=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getDescricao());
        ps.setInt(2,obj.getId());
        if(ps.executeUpdate()>0) return true;
        else return false;
        return true;    
    }

    @Override
    public ArrayList<StatusModel> pesquisar(String pesquisa) throws Exception {
        // TODO Auto-generated method stub
        ArrayList<StatusModel> dados = new ArrayList<>();
        return dados;
    }

    @Override
    public StatusModel pesquisar(int id) throws Exception {
        // TODO Auto-generated method stub
        StatusModel obj = new StatusModel();
        return obj;
    }

}
