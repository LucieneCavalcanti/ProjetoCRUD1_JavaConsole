package data;
import java.sql.Connection;
public class Conexao {
    private Connection conexao;
    public Connection getConexao(){
        return conexao;
    }
    public Conexao(){
        String url="jdbc:sqlserver://LAB01-MAQ18:1433;databaseName=bdJava;trustServerCertificate=true;encript=false";
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String usuario="aluno";
        String senha="dbo";
    }
}
