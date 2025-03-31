#include <iostream>
#include <vector>
using namespace std;

struct fecha{
    int dia;
    int mes;
    int año;
};

struct paciente{
    string nombre;
    int edad;
    int num_historial; 
    fecha cita;
};

void carga(vector<paciente> &pacientes, paciente aux){
    int whiles=0;
    int numhist= 0;
    int ifs= 0;  
    int auxa= 0;
    while (whiles != -1){
        cout<<"Ingrese numero de historial: "<<endl;
        cin >>auxa;
        for (int w = 0; w<=pacientes.size(); w++){
            if (pacientes[w].num_historial!= auxa){
                aux.num_historial= auxa;
                cout<<"Ingresar el nombre del paciente: "<<endl;
                cin >>aux.nombre;
                cout<<"Ingrese edad del paciente: "<<endl;
                cin >>aux.edad;
                cout<<"Ingrese dia de la cita: "<<endl;
                cin >>aux.cita.dia;
                cout<<"Ingrese mes de la cita: "<<endl;
                cin >>aux.cita.mes;
                cout<<"Ingrese año de la cita: "<<endl;
                cin >>aux.cita.año;
                pacientes.push_back(aux);
                cout<<"Ingrese -1 si quiere terminar de ingresar pedidos: "<<endl;
                cin >>whiles;
                w= pacientes.size();
            }
        }
    }
        
};

void cancela(vector<paciente> pacientes, int cance){
    pacientes.erase(pacientes.begin() + cance);
    cout<<"---------------------------------------"<<endl;
};

void mostrarcit(vector<paciente> pacientes){
    int diax;
    int mesx;
    int añox;
    cout<<"Ingrese el dia en el que quiere ver que citas hay: "<<endl;
    cin >> diax;
    cout<<"Ingrese el mes en el que quiere ver que citas hay: "<<endl;
    cin >> mesx;
    cout<<"Ingrese el año en el que quiere ver que citas hay: "<<endl;
    cin >> añox;
    cout<<"---------------------------------------"<<endl;
    for(int i=0; i<pacientes.size(); i++){
        if (pacientes[i].cita.dia== diax and pacientes[i].cita.mes== mesx and pacientes[i].cita.año== añox){
            cout<<pacientes[i].num_historial<<endl;
            cout<<pacientes[i].nombre<<endl;    
        }
    cout<<"---------------------------------------"<<endl;    
    }
    
};

void mostrarpac(vector<paciente> pacientes){
    int numaux= 0;
    cout<<"Ingrese el numero de historial clinica que quiere revisar: "<<endl;
    cin >>numaux;
    cout<<"---------------------------------------"<<endl;
    for(int i=0; i<pacientes.size(); i++){
        if (pacientes[i].num_historial== numaux){
            cout<<pacientes[i].num_historial<<endl;
            cout<<pacientes[i].nombre<<endl;
            cout<<pacientes[i].edad<<endl;
            cout<<"Dia de la reserva hecha: "<<pacientes[i].cita.dia<<endl;
            cout<<"Mes de la reserva hecha: "<<pacientes[i].cita.mes<<endl;
            cout<<"Año de la reserva hecha: "<<pacientes[i].cita.año<<endl;    
        }
    cout<<"---------------------------------------"<<endl;    
    }
    
};

int main(){
    paciente aux;
    vector<paciente> pacientes;
    int numero= 0;
    while(numero!= 5){
        cout<< "Escriba 1 si quiere cargar un paciente nuevo"<<endl;
        cout<< "Escriba 2 si quiere cancelar una cita"<<endl;
        cout<< "Escriba 3 si quiere ver las citas en un cierto dia"<<endl;
        cout<< "Escriba 4 si quiere ver el historial clinico de un paciente"<<endl;
        cout<< "Escriba 5 si quiere detener el programa"<<endl;
        cin >>numero;
        if(numero== 1){
            carga(pacientes, aux);
        }
        else if(numero== 2){
            int cance= 0;
            cout<<"---------------------------------------"<<endl;
            cout<<"Ingrese el numero de historial clinica que desea eliminar: "<<endl;
            cin >>cance;
            cancela(pacientes, cance);
        }
        else if(numero== 3){
            mostrarcit(pacientes);
        }
        else if(numero== 4){
            mostrarpac(pacientes);
        }

    }
}
