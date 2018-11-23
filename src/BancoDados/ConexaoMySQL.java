package BancoDados;

//Classes necessárias para uso de Banco de dados //
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

  
//Início da classe de conexão//
public class ConexaoMySQL {
    public static String status = "Desconectado";
    
    public ConexaoMySQL() {
 
    }
  
    // Método de Conexão
    public static java.sql.Connection getConexaoMySQL() {
	Connection connection = null;          //atributo do tipo Connection

	try {
	// Carregando o JDBC Driver padrão
            String driverName = "com.mysql.cj.jdbc.Driver";                        
            Class.forName(driverName);

	// Configurando a nossa conexão com um banco de dados
            String serverName = "localhost";    //caminho do servidor do BD
            String mydatabase ="projeto_jogo";        //nome do seu banco de dados
            //String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String url = String.format("jdbc:mysql://%s/%s?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",serverName,mydatabase);
            String username = "root";        //nome de um usuário de seu BD      
            String password = "root";      //sua senha de acesso
            connection = DriverManager.getConnection(url, username, password);
			
            //Testa sua conexão//  
            if (connection != null) 
            	status = ("Conectado");
            else
            	status = ("Não foi possivel realizar conexão");
				
            return connection;

	} catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver especificado nao foi encontrado.\nErro: " + e);
            return null;
	} catch (SQLException e) { //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.\nErro: " + e);
            return null;
	}
    }
        
    //Método que retorna o status da sua conexão
    public static String statusConnection(){
        return status;
    }
    
   
   //Método que fecha sua conexão//
    public static boolean FecharConexao()
	{
        try {     
            ConexaoMySQL.getConexaoMySQL().close();
            status = "Desconectado";
            return true;	
			
        } catch (SQLException e){
            status = "Erro ao desconectar; erro: " + e;
            return false;
        } 
    }
 
    
   //Método que reinicia sua conexão//
    public java.sql.Connection ReiniciarConexao()
	{
        FecharConexao();
        return ConexaoMySQL.getConexaoMySQL();
    }
}
