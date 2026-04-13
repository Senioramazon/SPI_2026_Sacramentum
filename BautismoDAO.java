import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BautismoDAO {

    public void registrarBautismo(Bautismo bautismo) {
        String sql = "INSERT INTO bautismos (nombre_bautizado, fecha_nacimiento, fecha_bautismo, nombre_padre, nombre_madre, ministro, tomo, folio) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, bautismo.getNombreBautizado());
            ps.setDate(2, bautismo.getFechaNacimiento());
            ps.setDate(3, bautismo.getFechaBautismo());
            ps.setString(4, bautismo.getNombrePadre());
            ps.setString(5, bautismo.getNombreMadre());
            ps.setString(6, bautismo.getMinistro());
            ps.setInt(7, bautismo.getTomo());
            ps.setInt(8, bautismo.getFolio());
            
            ps.executeUpdate();
            System.out.println("Bautismo registrado con éxito.");
            
        } catch (SQLException e) {
            System.err.println("Error al registrar: " + e.getMessage());
        }
    }

    public void buscarPorNombre(String nombre) {
        String sql = "SELECT * FROM bautismos WHERE nombre_bautizado LIKE ?";
        
        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();
            
            System.out.println("\n--- Resultados de Búsqueda ---");
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre_bautizado") +
                                   " | Fecha: " + rs.getDate("fecha_bautismo") +
                                   " | Tomo: " + rs.getInt("tomo") + 
                                   " | Folio: " + rs.getInt("folio"));
            }
            
        } catch (SQLException e) {
            System.err.println("Error en la búsqueda: " + e.getMessage());
        }
    }
}
