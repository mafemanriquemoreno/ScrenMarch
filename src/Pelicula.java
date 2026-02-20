public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int DuracionEnMinutos;
    boolean incluidoEnElPlan;
    float sumaDeEvaluaciones;
    int totalDeLasEvaluaciones;
    double sumaDeLasEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: "+ nombre);
        System.out.println("Su fecha de lanzamiento es: "+ fechaDeLanzamiento);
        System.out.println("Duracion en minutos: "+ DuracionEnMinutos + " minutos.");
        System.out.println("");

    }

    void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeEvaluaciones/totalDeLasEvaluaciones;

    }


}

