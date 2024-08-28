package data;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexao {
    private Connection conexao;
    public Connection getConexao(){
        return conexao;
    }
    public Conexao() throws Exception{
        //String url="jdbc:sqlserver://LAB01-MAQ18:1433;databaseName=bdJava;trustServerCertificate=true;encript=false";
        String url="jdbc:mysql://localhost:3306/bdJava?zeroDateTimeBehavior=CONVERT_TO_NULL";
        //String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String driver="com.mysql.cj.jdbc.Driver";
        String usuario="root";//"aluno";
        String senha="%Fatecrp!";//"dbo";
        Class.forName(driver);
        conexao = DriverManager.getConnection
        (url, usuario, senha);
    }
}
