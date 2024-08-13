package data;

import java.util.ArrayList;

import model.StatusModel;

public class StatusData implements CRUD{

    @Override
    public boolean incluir(StatusModel obj) throws Exception {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean excluir(int id) throws Exception {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean atualizar(StatusModel obj) throws Exception {
        // TODO Auto-generated method stub
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
