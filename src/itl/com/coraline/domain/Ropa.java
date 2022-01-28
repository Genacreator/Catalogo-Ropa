package itl.com.coraline.domain;

public class Ropa {
    private String nombre;
    
    public Ropa(){
        
    }
    public Ropa(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
}
