/*package Curso;

public class Customer {
    String nombre;
    String talle;

    private Clothing[] items;

    public Customer(String nombre, int tamanio){
        this.nombre = nombre;
        setTalle(tamanio);
    }

    public void addItems(Clothing[] someItems){
        items = someItems;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost(){
        for (Clothing item: items){
//            if (c1.talle.equals(item.talle)){
                total= total + item.precio;
//                System.out.println("Item: " + item.descripcion + "," + item.precio + "," + item.talle);
 //               total= total + total * impuesto;
 //               if(total > 15){
 //                   break;
 //               }
            //}
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTalle() {
        return talle;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public void setTalle(int tamanio) {
        switch (tamanio){
            case 1: case 2: case 3:
                setTalle("S");
                break;

            case 4: case 5: case 6:
                setTalle("M");
                break;

            case 7: case 8: case 9:
                setTalle("L");
                break;

            default:
                setTalle("X");
        }
    }

}
*/