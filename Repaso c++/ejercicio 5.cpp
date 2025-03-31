#include <iostream>
#include <string>
#include<vector>
#include <algorithm>
using namespace std;


struct Producto {
    string nombre;      
    bool promocion;     
    int ventas;         
    int precio;       
    string categoria;   
};

struct fecha{
    int dia;
    int mes;
    int ani;
};

struct Pedido {
    string nombreC;      
    Producto carrito;     
    int Cantidad;         
    fecha date;       
    int total;   
};

void mirar(vector<Producto> menu){
    for (int i = 0; i < menu.size(); i++){
        cout<<menu[i].nombre<<endl;
        cout<<menu[i].precio<<endl;
        cout<<menu[i].promocion<<endl;
        cout<<menu[i].categoria<<endl;
        cout<<menu[i].ventas<<endl;
    }
}

void pedir(vector<Producto> menu, vector<Pedido> &Pedidos){
    string whiles2;
    Pedido pediras;
    string nameP;
    while (whiles2 != "no" or whiles2 != "No"){
        cout<<"Ingrese el nombre del cliente: "<<endl;
        cin >>pediras.nombreC;
        cout<<"Ingrese el dia del anio: "<<endl;
        cin >>pediras.date.dia;
        cout<<"Ingrese el mes del anio: "<<endl;
        cin >>pediras.date.mes;
        cout<<"Ingrese el anio actual: "<<endl;
        cin >>pediras.date.ani;
        cout<<"Ingrese el Producto que desea: "<<endl;
        cin >>nameP;
        for (int w = 0; w < menu.size(); w++){
            if (nameP== menu[w].nombre){
                pediras.carrito= menu[w];
            }
        }    
        cout<<"Ingrese la cantidad del producto pedido: "<<endl;
        cin >> pediras.Cantidad;
        pediras.total= pediras.carrito.precio * pediras.Cantidad;
        if (pediras.carrito.promocion= true){
            pediras.total= pediras.total- pediras.total * 20 /100;    
        }
        Pedidos.push_back(pediras);
        cout<<"Quiere seguir pidiendo productos?"<<endl;    
        cin >>whiles2;
    }
}

void ver(vector<Pedido> &Pedidos){
    string namec;
    cout<<"Ingrese el nombre del ciente que quiere ver el pedido: "<<endl;
    cin >>namec;
    for (int i = 0; i < Pedidos.size(); i++){
        if(Pedidos[i].nombreC== namec){
            cout<<Pedidos[i].nombreC<<endl;
            cout<<Pedidos[i].carrito.nombre<<endl;
            cout<<Pedidos[i].Cantidad<<endl;
            cout<<Pedidos[i].date.dia<<"/"<<Pedidos[i].date.mes<<"/"<<Pedidos[i].date.ani<<endl;
            cout<<Pedidos[i].total<<endl;
        }
    }
    
}

void mirarprod(vector<Pedido> Pedidos){
    vector<Pedido> aux;
    for (int i = 0; i < Pedidos.size(); i++){
        aux.push_back(Pedidos[i]);    
    }
}

int main() {
    int whiles= 0;
    vector<Pedido> Pedidos;
    vector<Producto> menu = {
        {"Big Mac", true, 150, 5, "Hamburguesa"},
        {"Cuarto de Libra", false, 120, 4, "Hamburguesa"},
        {"McPollo", true, 200, 3, "Hamburguesa"},
        {"McNuggets", false, 180, 3, "Extra"},
        {"Coca-Cola", false, 300, 1, "Bebida"},
        {"Sprite", false, 250, 1, "Bebida"},
        {"Fanta", true, 230, 1, "Bebida"},
        {"Agua", false, 100, 1, "Bebida"},
        {"McFlurry", true, 140, 2, "Postre"},
        {"Sundae", false, 160, 2, "Postre"},
        {"Apple Pie", false, 130, 1, "Postre"},
        {"Café", true, 90, 2, "Bebida Caliente"},
        {"McMuffin", true, 110, 3, "Desayuno"},
        {"Egg McMuffin", false, 80, 3, "Desayuno"},
        {"Hash Browns", false, 95, 1, "Extra"},
        {"McWrap", true, 105, 4, "Wraps"},
        {"Café con Leche", true, 115, 2, "Bebida Caliente"},
        {"Triple Cheeseburger", false, 75, 6, "Hamburguesa"},
        {"Shakes", true, 50, 3, "Bebida"},
        {"McChicken", false, 160, 4, "Hamburguesa"}
    };
    while(whiles != 5){
        cout<<"Ingrese 1 si quiere mirar los productos en venta"<<endl;
        cout<<"Ingrese 2 si quiere hacer el pedido"<<endl;
        cout<<"Ingrese 3 si quiere ver un pedido especifico"<<endl;
        cout<<"Ingrese 4 si quiere mirar todos los productos ordenados"<<endl;
        cout<<"Ingrese 5 si quiere finalizar el programa"<<endl;
        cin >>whiles;
        if (whiles == 1){
            mirar(menu);
        }
        else if (whiles == 2){
            pedir(menu, Pedidos);
        }
        else if (whiles == 3){
            ver(Pedidos);
        }
        else if (whiles == 4){
            mirarprod(Pedidos);
        }
    };
}
