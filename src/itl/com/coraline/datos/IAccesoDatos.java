package itl.com.coraline.datos;

import itl.com.coraline.domain.Ropa;
import itl.com.coraline.excepciones.*;
import java.util.List;

public interface IAccesoDatos {

    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Ropa> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Ropa ropa, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
