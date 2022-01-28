package itl.com.ropas.servicios;

public interface ICatalogoRopas {
    
    String NOMBRE_RECURSO = "ropas.txt";
    
    void agregarRopa(String nombreRopa);
    
    void listarRopas();
    
    void buscarRopa(String buscar);
    
    void iniciarCatalogoRopas();
}
