import com.sun.source.tree.ReturnTree;

public class Pelicula {
   String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeEvaluaciones;
    int totalDeLasEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: "+ nombre);
        System.out.println("Su fecha de lanzamiento es: "+ fechaDeLanzamiento);
        System.out.println("Duracion en minutos: "+ duracionEnMinutos + " minutos.");
    }

    void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia(){
        if (totalDeLasEvaluaciones == 0) {
            return 0;
        }
        return sumaDeEvaluaciones / totalDeLasEvaluaciones;
    }


}

