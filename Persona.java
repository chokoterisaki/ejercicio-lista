import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Persona {
    String nombre;
    LocalDate FechaN;
    private DateTimeFormatter format;

    public int edad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(FechaN, fechaActual);
        return periodo.getYears();
    }

    public Persona(String nombre, String fechaN) {
        format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.nombre = nombre;
        this.FechaN = LocalDate.parse(fechaN, format);
    }
}