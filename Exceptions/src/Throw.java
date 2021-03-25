import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;

public class Throw {
    public static FileInputStream test(String Name) throws FileNotFoundException {
        FileInputStream testStream = new FileInputStream(Name);
        System.out.println("created file");
        return testStream;
    }

    public static FileInputStream test2(String Name) throws Exception {
        FileInputStream testStream = null;
        try {
            testStream = new FileInputStream(Name);
        } catch (FileNotFoundException e) {
            throw new Exception("El documento no existe");

        } finally {
            System.out.println("manejo de documentos finalizado");
        }
        return testStream;
    }
    public static  void test3(int a, int b) throws ArithmeticException{
        int j;
        try{
            j=a/b;
        }catch(ArithmeticException e){
            throw new ArithmeticException("error:divisor equals 0");
        }
    }
    public static void test4() throws  SQLException{
        try {
            String connectionUrl = "jdbc:sqlserver://;database=DB_Name;integratedSecurity=true;";
            Connection conect = DriverManager.getConnection(connectionUrl);
            System.out.println("Conectado.");
        }
        catch (SQLException e)
        {
            throw new SQLException("Conexion no permitida");
        }
    }
}