import java.sql.Date;

public class Bautismo {
    private int idBautismo;
    private String nombreBautizado;
    private Date fechaNacimiento;
    private Date fechaBautismo;
    private String nombrePadre;
    private String nombreMadre;
    private String ministro;
    private int tomo;
    private int folio;

    // Constructor vacío
    public Bautismo() {}

    // Constructor con parámetros
    public Bautismo(String nombreBautizado, Date fechaNacimiento, Date fechaBautismo, 
                    String nombrePadre, String nombreMadre, String ministro, int tomo, int folio) {
        this.nombreBautizado = nombreBautizado;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaBautismo = fechaBautismo;
        this.nombrePadre = nombrePadre;
        this.nombreMadre = nombreMadre;
        this.ministro = ministro;
        this.tomo = tomo;
        this.folio = folio;
    }

    // Getters y Setters (simplificados para el ejemplo, debes generar todos en tu IDE)
    public String getNombreBautizado() { return nombreBautizado; }
    public Date getFechaBautismo() { return fechaBautismo; }
    public int getTomo() { return tomo; }
    public int getFolio() { return folio; }
    
    // ... Generar el resto de getters y setters ...
}
