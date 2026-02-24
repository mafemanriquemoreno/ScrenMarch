import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;
import com.aluracursos.screenmatch.modelos.Episodios;
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

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1999);
        otraPelicula.setDuracionEnMinutos(130);
        otraPelicula.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo estimado apra ver tus titulos favoritos: " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(miPelicula);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.getNombre("Origenes");
        episodios.setSerie(casaDragon);
        episodios.setTotalVisualizaciones(75);

        filtroRecomendaciones.filtra(episodios);
    }
}
