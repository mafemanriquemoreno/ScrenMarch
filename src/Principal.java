import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Spider-man no way home");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(140);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(8.2);
        miPelicula.evalua(9);
        System.out.println("Total de evaluaciones de la pelicula: " + miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media de evaluaciones: "+ miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("Casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(2);
        casaDragon.setMinutosPorEpisodios(55);
        casaDragon.setEpisodiosPorTemporada(10);
        System.out.println(casaDragon.getDuracionEnMinutos());
        casaDragon.muestraFichaTecnica();







//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 1999;
//        otraPelicula.duracionEnMinutos = 120;
//
//        otraPelicula.muestraFichaTecnica();
//        System.out.println("Total de evaluaciones de la pelicula: " + otraPelicula.getTotalDeLasEvaluaciones());
//        System.out.println("La media en calificaciones de la pelicula es es de : "+ otraPelicula.calculaMedia());
    }
}
