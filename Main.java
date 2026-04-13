import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        BautismoDAO dao = new BautismoDAO();

        // 1. Crear un nuevo registro de prueba
        Bautismo nuevoBautismo = new Bautismo(
            "Juan Pérez",
            Date.valueOf("2023-05-15"),
            Date.valueOf("2023-10-20"),
            "Carlos Pérez",
            "María López",
            "Padre Francisco",
            12,
            45
        );

        // 2. Ejecutar Caso de Uso 01: Registrar
        System.out.println("Iniciando registro...");
        dao.registrarBautismo(nuevoBautismo);

        // 3. Ejecutar Caso de Uso 02: Buscar
        System.out.println("Buscando a 'Juan'...");
        dao.buscarPorNombre("Juan");
    }
}
