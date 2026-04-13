import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    // Ajusta tu usuario y contraseña de MySQL aquí
    private static final String URL = "jdbc:mysql://localhost:3306/sacramentum_db";
    private static final String USER = "root"; 
    private static final String PASSWORD = "root"; 

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos Sacramentum.");
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return conexion;
    }
}
