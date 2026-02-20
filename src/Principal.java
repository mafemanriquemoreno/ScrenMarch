public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Spider-man: no way home";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.DuracionEnMinutos = 148;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(8.2);
        miPelicula.evalua(9);

        System.out.println("Suma de las evaluciones: "+  miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println("Total de evaluaciones de la pelicula: " + miPelicula.totalDeLasEvaluaciones);
        System.out.println("La media en calificaciones de la pelicula es es de : "+ miPelicula.calculaMedia());


        System.out.println("");

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1999;
        otraPelicula.DuracionEnMinutos = 120;

        otraPelicula.muestraFichaTecnica();

        otraPelicula.evalua(8.2);
        otraPelicula.evalua(8);
        otraPelicula.evalua(10);
        otraPelicula.evalua(7.8);

        System.out.println("Suma de las evaluciones: " + otraPelicula.sumaDeLasEvaluaciones);
        System.out.println("Total de evaluaciones de la pelicula: " + otraPelicula.totalDeLasEvaluaciones);
        System.out.println("La media en calificaciones de la pelicula es es de : "+ otraPelicula.calculaMedia());
    }
}
