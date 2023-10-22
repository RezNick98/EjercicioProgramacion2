package Ejercicio3;

import Ejercicio3.Filtro.Filtro;

public abstract class ElementoElectoral {

    /*Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
    porcentaje de votos recibidos por un candidato particular.*/
    public abstract int getCantVotosPorFiltro(Filtro f);
    /*Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
porcentaje de votos en blanco recibidos. */
    

    /*Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer el
porcentaje de votos que se emitieron entre las 10:00 y las 11:00. (La clase LocalDate
implementa la interface Comparable) */

/*Dada una mesa, un establecimiento educativo, un barrio o una localidad, conocer la
cantidad total de votos que se emitieron. */
    public abstract int getCantTotalDeVotos();
/*Obtener un listado de todos los candidatos que se presentan a la elección, ordenado
por partido político si son del mismo partido ordenarlos por agrupación; y si son de la
misma agrupación ordenarlos por nombre. */
    
}
