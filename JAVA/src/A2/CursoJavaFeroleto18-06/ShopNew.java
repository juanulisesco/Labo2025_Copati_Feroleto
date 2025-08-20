/*package objetos;
import personas.Customer;
import objetos.Clothing;
public class Shop

{
        public static void main(String[] args) {

            double tax = 0.2;

            double total = 0.0;

            Clothing item1 = new Clothing("Campera azul", 20.9, 'm');

            Clothing item2 = new Clothing("Remera fuxia", 10.5, 's');

            Clothing item4 = new Clothing("Pantalon violeta", 15.5, 's');

            Clothing[] items = {item1, item2,new Clothing ("Bufanda rosa", 29.9, 's'), item4};

            Customer c1 = new Customer("Rosa",3, 's');

            c1.setName("Rosa");

            c1.setSize('s');

            System.out.println("Hola"+c1.getName());

            System.out.println("Precio minimo"+Clothing.min_price);

            //System.out.println("Los datos del iteam 1 son:"+" "+item1.getDescription()+" "+ item1.getPrice()+ " "+item1.getSize());

            //System.out.println("Los datos del iteam 2 son:"+" "+item2.getDescription()+" "+ item2.getPrice()+ " "+item2.getSize());

            //total = ((item2.getPrice()*2)+item1.getPrice())*(1+tax);

            int mesurement = 3;

            c1.setSize(mesurement);

            //switch(mesurement){

              //  case 1,2,3:
                //    c1.setSize('s');
                  //  break;

                //case 4, 5, 6:

                  //  c1.setSize('m');
                   // break;

                //case 7, 8 ,9:

                  //  c1.setSize('l');
                  //  break;

               // default:

                 //   c1.setSize('x');

            //}
           
        c1.addItems(items);

            System.out.println("El total es="+ c1.getTotalClothingCost());
        }
}
*/