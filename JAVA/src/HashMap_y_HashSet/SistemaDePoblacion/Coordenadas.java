package HashMap_y_HashSet.SistemaDePoblacion;

public class Coordenadas {
    private int latitud;
    private int longitud;

    public Coordenadas(int latitud, int longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void Limite(int longitud, int latitud){

        if(longitud<=180 && longitud>= -180){
            System.out.println("No se puede aceptar la longitud");
        }
        if(latitud<=90 && latitud>= -90){
            System.out.println("No se puede aceptar la longitud");
        }

    }
}
