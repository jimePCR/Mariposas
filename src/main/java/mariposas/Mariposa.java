package mariposas;

public class Mariposa {
    String nombre;
    String familia;
    String subfamilia;
    String genero;
    String imagen;
    public Mariposa(String nombre,String familia,String subfamilia,String genero,String imagen){
        this.nombre = nombre;
        this.familia = familia;
        this.subfamilia = subfamilia;
        this.genero = genero;
        this.imagen = imagen;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getSubfamilia() {
        return subfamilia;
    }

    public void setSubfamilia(String subfamilia) {
        this.subfamilia = subfamilia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Mariposa{" + "nombre=" + nombre + ", familia=" + familia + ", subfamilia=" + subfamilia + ", genero=" + genero + ", imagen=" + imagen + '}';
    }

    
}