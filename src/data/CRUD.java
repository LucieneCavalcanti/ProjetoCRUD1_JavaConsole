package data;

import java.util.ArrayList;

import model.StatusModel;

public interface CRUD {
public boolean incluir(StatusModel obj)
throws Exception;
public boolean excluir(int id) throws Exception;
public boolean atualizar(StatusModel obj) throws Exception;
public ArrayList<StatusModel> pesquisar
(String pesquisa) throws Exception;
public StatusModel pesquisar(int id) throws Exception;

}
