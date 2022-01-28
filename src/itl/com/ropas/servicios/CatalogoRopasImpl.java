package itl.com.ropas.servicios;

import itl.com.coraline.datos.AccesoDatosImpl;
import itl.com.coraline.datos.IAccesoDatos;
import itl.com.coraline.domain.Ropa;
import itl.com.coraline.excepciones.AccesoDatosEx;
import itl.com.coraline.excepciones.LecturaDatosEx;

public class CatalogoRopasImpl implements ICatalogoRopas{
    
    final private IAccesoDatos datos;

    public CatalogoRopasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarRopa(String nombreRopa) {
        Ropa ropa = new Ropa(nombreRopa);
        boolean anexar = false;
        try { 
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(ropa, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarRopas() {
        try {
            var ropas = this.datos.listar(NOMBRE_RECURSO);
            for(var ropa: ropas){
                System.out.println("ropa = " + ropa);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error acceso datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarRopa(String buscar) {
        try {
            String resultado = null;
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error acceso datos");
            ex.printStackTrace(System.out);
        }
        System.out.println("buscar = " + buscar);
    }

    @Override
    public void iniciarCatalogoRopas() {
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            }
            else{
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de ropa");
            ex.printStackTrace(System.out);
        }
    }
    


}
