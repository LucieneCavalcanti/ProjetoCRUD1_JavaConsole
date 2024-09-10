package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import model.StatusModel;

public class StatusData extends Conexao implements CRUD{
    public StatusData() throws Exception {}
    @Override
    public boolean incluir(Object obj) throws Exception {
        String sql="insert into tbstatus (descricao) values (?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        StatusModel st = new StatusModel();
        if(obj instanceof StatusModel)
            st = (StatusModel)obj;
        ps.setString(1,st.getDescricao());
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
        StatusModel st = new StatusModel();
        if(obj instanceof StatusModel)
            st = (StatusModel)obj;
        ps.setString(1,st.getDescricao());
        ps.setInt(2,st.getId());
        if(ps.executeUpdate()>0) return true;
        else return false;
    }


    public ArrayList<StatusModel> pesquisar(String pesquisa) throws Exception {
        // TODO Auto-generated method stub
        ArrayList<StatusModel> dados = new ArrayList<>();
        String sql="Select * from tbStatus where descricao like ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, pesquisa+"%");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            StatusModel obj = new StatusModel(rs.getInt("id"),
            rs.getString("descricao"));
            dados.add(obj);
        }
        return dados;
    }

    public StatusModel pesquisar(int id) throws Exception {
        // TODO Auto-generated method stub
        StatusModel obj = new StatusModel();
        return obj;
    }

}
