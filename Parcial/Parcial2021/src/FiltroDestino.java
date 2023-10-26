public class FiltroDestino extends Filtro{
    private String destinoABuscar;

    @Override
    public boolean cumple(PaqueteSimple paquete) {
        return paquete.getCiudadDestino().equals(destinoABuscar);
    }
}
