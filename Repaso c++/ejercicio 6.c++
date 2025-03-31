#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

struct Equipo {
    string nombreE;
    vector<char>histo;
    int golesf= 0;
    int golesc= 0;
    int puntos=0;
    int posicion= 0; 
};

struct Fecha{
    int dia;
    int mes;
    int ani;
};

struct Partido{
    Equipo local;
    int golesL= 0;
    Equipo visitante;
    int golesV= 0;
    Fecha fechas;
};

void ingresar(vector<Equipo> &equipos){
    Equipo aux;
    int basta= 0;
    while(basta != -1){
        cout << "Ingresar nombre del equipo: " << endl;
        cin>> aux.nombreE;
        cout << "Ingresar goles a favor del equipo: " << endl;
        cin>> aux.golesf;
        cout << "Ingresar goles en contra del equipo: " << endl;
        cin>> aux.golesc;
        equipos.push_back(aux);
        cout << "Ingresar -1 si quiere terminar de ingresar equipos: " << endl;
        cin>> basta;
    }
}

void registrar(vector<Equipo> &equipos, vector<Partido>&partidos){
    Partido aux3;
    string basta;
    while(basta != "Basta" or basta != "basta"){
        cout << "Ingresar nombre del equipo local: " << endl;
        cin>> aux3.local.nombreE;
        cout << "Ingresar goles del equipo local: " << endl;
        cin>> aux3.golesL;
        cout << "Ingresar nombre del equipo visitante: " << endl;
        cin>> aux3.visitante.nombreE;
        cout << "Ingresar goles del equipo visitnate: " << endl;
        cin>> aux3.golesV;
        cout << "Ingresar dia del partido: " << endl;
        cin>> aux3.fechas.dia;
        cout << "Ingresar mes del partido: " << endl;
        cin>> aux3.fechas.mes;
        cout << "Ingresar anio del partido: " << endl;
        cin>> aux3.fechas.ani;
        for (int i = 0; i < equipos.size(); i++){
            if (equipos[i].nombreE == aux3.local.nombreE){
                equipos[i].golesf= equipos[i].golesf + aux3.golesL;
                equipos[i].golesc= equipos[i].golesc + aux3.golesV;
                if (aux3.golesL- aux3.golesV <= -1){
                    equipos[i].histo[i]= 'D';
                }
                else if (aux3.golesL- aux3.golesV == 0){
                    equipos[i].histo[i]= 'E';
                    equipos[i].puntos= equipos[i].puntos + 1;
                }
                else if (aux3.golesL- aux3.golesV >= 1){
                    equipos[i].histo[i]= 'V';
                    equipos[i].puntos= equipos[i].puntos + 3;
                }
            }
            else if (equipos[i].nombreE == aux3.visitante.nombreE){
                equipos[i].golesf= equipos[i].golesf + aux3.golesV;
                equipos[i].golesc= equipos[i].golesc + aux3.golesL;
                if (aux3.golesL- aux3.golesV <= -1){
                    equipos[i].histo[i]= 'V';
                    equipos[i].puntos= equipos[i].puntos + 3;
                }
                else if (aux3.golesL- aux3.golesV == 0){
                    equipos[i].histo[i]= 'E';
                    equipos[i].puntos= equipos[i].puntos + 1;
                }
                else if (aux3.golesL- aux3.golesV >= 1){
                    equipos[i].histo[i]= 'D';
                }
            }
        }
        partidos.push_back(aux3);
        cout << "Ingresar basta si quiere terminar de ingresar partidos: " << endl;
        cin  >> basta;
    }
}

void mostrar(vector<Partido>partidos){
    string equipo1;
    string equipo2;
    cout << "Ingresar nombre del equipo local: " << endl;
    cin>> equipo1;
    cout << "Ingresar nombre del equipo visitante: " << endl;
    cin>> equipo2;
    for (int i = 0; i < partidos.size(); i++){
        if (equipo1 == partidos[i].local.nombreE and equipo2 == partidos[i].visitante.nombreE){
            cout<<"Equipo local: "<<partidos[i].local.nombreE<<endl;
            cout<<"Goles: "<<partidos[i].golesL<<endl;
            cout<<"Equipo vistante: "<<partidos[i].visitante.nombreE<<endl;
            cout<<"Goles: "<<partidos[i].golesV<<endl;
            cout<<"Fecha del partido: "<<partidos[i].fechas.dia<<"/"<<partidos[i].fechas.mes<<"/"<<partidos[i].fechas.ani<<endl;
        }
    }
}

void mostrart(){

}

void ingresarmax(vector<Equipo> &equipos){
    Equipo aux;
    while(equipos.size()!= 23){
        cout << "ingresar nombre del equipo: " << endl;
        cin>> aux.nombreE;
        cout << "ingresar goles a favor del equipo: " << endl;
        cin>> aux.golesf;
        cout << "ingresar goles en contra del equipo: " << endl;
        cin>> aux.golesc;
        equipos.push_back(aux);
    }
}

int main(){
    vector<Equipo> equipos;
    vector<Partido>partidos;
    int whiles= 0;
    while(whiles != 6){
        cout<<"Ingrese 1 si quiere ingresar equipos"<<endl;
        cout<<"Ingrese 2 si quiere registrar un partido"<<endl;
        cout<<"Ingrese 3 si quiere ver un partido en especifico"<<endl;
        cout<<"Ingrese 4 si quiere ver la tabla de posiciones"<<endl;
        cout<<"Ingrese 6 si quiere finalizar el programa"<<endl;
        cout<<"Ingrese 5 si quiere ingresar equipos con un maximo de 24"<<endl;
        cin >>whiles;
        if (whiles == 1){
            ingresar(equipos);
        }
        else if (whiles == 2){
            registrar(equipos, partidos);
        }
        else if (whiles == 3){
            mostrar(partidos);
        }
        else if (whiles == 4){
            mostrart();
        }
        else if (whiles == 5){
            ingresarmax(equipos);
        }
    }
}
