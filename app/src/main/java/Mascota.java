public class Mascota {
    private String nombre;
    private String raza;
    private int foto;
    private int numFav;

    public Mascota(String nombre, String raza, int foto, int numFav) {
        this.nombre = nombre;
        this.raza = raza;
        this.foto = foto;
        this.numFav = numFav;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getNumFav() {
        return numFav;
    }

    public void setNumFav(int numFav) {
        this.numFav = numFav;
    }
}
