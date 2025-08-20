/*package Curso;

public class ShopApp {
    public static void main(String[] args) {

        double impuesto = 0.02;
        double total = 0.0;

        Customer c1 = new Customer("Jorge", "S");
        //c1.nombre= "Jorge";
       // c1.talle= "S";


        Clothing item1= new Clothing("Pantalon jean fuxia", 2000.0, "M");
        Clothing item2= new Clothing("Pantalon jean Vermelho", 1000.0, "S");

        Clothing[] items = {item1, item2, new Clothing("Alfombra dorada", 2000.0, "M"), new Clothing("Madera de roble oscuro", 4000.0, "S")};

        //System.out.println("Item 1: " + item1.descripcion + "," + item1.precio + "," + item1.talle);
        //System.out.println("Item 2: " + item2.descripcion + "," + item2.precio + "," + item2.talle);

        // total = (item1.precio + (item2.precio * 2)) * (1 + tax);

        System.out.println("Total: " + total);

        int tamanio= 3;

        c1.addItems(items);
       // c1.setTalle(tamanio);

        System.out.println("Customer: " + c1.getNombre() + "," + c1.getTalle() + "," + c1.getTotalClothingCost());

        for (Clothing item: c1.getItems()){
            System.out.println("Items: " + item.getDescripcion());
        }
    }
}
*/