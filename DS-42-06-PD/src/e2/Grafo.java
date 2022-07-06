package e2;


public class Grafo {

    private Algoritmo algoritmo = null;

    Grafo(){}

    public Algoritmo getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo){
        if(algoritmo.equals("Dependencia Fuerte")){
            this.algoritmo = new DependenciaFuerte();
        }
        else if(algoritmo.equals("Dependencia Debil")){
            this.algoritmo = new DependenciaDebil();
        }
        else if(algoritmo.equals("Orden Jerarquico")){
            this.algoritmo = new OrdenJerarquico();
        }
        else{
            throw new IllegalArgumentException("No se indico un algoritmo valido");
        }
    }
}