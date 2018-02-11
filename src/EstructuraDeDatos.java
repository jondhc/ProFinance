import java.util.Collections;
import java.util.LinkedList;

public class EstructuraDeDatos extends LinkedList<Movimiento> implements Model {

    SequentialFile repositorio;

    public EstructuraDeDatos() {
        cargaDatosDelRepositorioALaEstructura();
    } //end EstructuraDeDatos

    public void cargaDatosDelRepositorioALaEstructura() {
        int numeroDeLineas;
        int numeroDeRegistros;
        int i;

        Movimiento dato;
        char tipo;
        String fecha;
        String hora;
        double cantidad;
        String concepto;
        String categoria;

        repositorio = new SequentialFile("Users/jondhc/Documents/Java/Patrones de diseño de software/ProFinanceV2/src", "registro", "txt");
        repositorio.open();
        numeroDeLineas = repositorio.getNumberOfLines();
        numeroDeRegistros = numeroDeLineas / 6;
        i = 0;
        while (i < numeroDeRegistros) {

            tipo = repositorio.readChar();
            fecha = repositorio.readString();
            hora = repositorio.readString();
            cantidad = repositorio.readDouble();
            concepto = repositorio.readString();
            categoria = repositorio.readString();

            dato = new Movimiento();

            dato.setTipo(tipo);
            dato.setFecha(fecha);
            dato.setHora(hora);
            dato.setCantidad(cantidad);
            dato.setConcepto(concepto);
            dato.setCategoria(categoria);

            add(dato);

            i = i + 1;

        } //end while

    } //end cargaDatosDelRepositorioALaEstructura

    public void salvaDatosDeLaEstructuraAlRepositorio() {
        int i;
        char tipo;
        String fecha;
        String hora;
        double cantidad;
        String concepto;
        String categoria;

        repositorio = new SequentialFile("Users/jondhc/Documents/Java/Patrones de diseño de software/ProFinanceV2/src", "registro", "txt");
        repositorio.create();
        i = 0;
        while (i < size()) {

            tipo = get(i).getTipo();
            fecha = get(i).getFecha();
            hora = get(i).getHora();
            cantidad = get(i).getCantidad();
            concepto = get(i).getConcepto();
            categoria = get(i).getCategoria();

            repositorio.writeChar(tipo);
            repositorio.writeString(fecha);
            repositorio.writeString(hora);
            repositorio.writeDouble(cantidad);
            repositorio.writeString(concepto);
            repositorio.writeString(categoria);

            i = i + 1;
        } //end while

    } //end salvaDatosDeLaEstructuraAlRepositorio

    public void agregaDatosALaEstructura(int indice, Object unMovimiento) {
        Movimiento dato;
        dato = (Movimiento) unMovimiento;
        add(indice, dato);
    } //end agregaDatosALaEstructura

    public void modificaDatosEnLaEstructura(int indice, Object unMovimiento) {
        Movimiento dato;
        dato = (Movimiento) unMovimiento;
        remove(indice);
        add(indice, dato);
    } //end modificaDatosEnLaEstructura

    public void eliminaDatosDeLaEstructura(int indice) {
        if (indice < size() && indice >= 0) {
            remove(indice);
        } //end if
    } //end eliminaDatosDeLaEstructura

    public void ordenaLaEstructura() {
        Collections.sort(this);
    }

    public double procesa(int indice) {
        Movimiento dato;
        char tipo;
        Double cantidad;

        dato = get(indice);
        tipo = dato.getTipo();
        cantidad = dato.getCantidad();
        if (tipo == 'G') {
            cantidad = (cantidad * cantidad) * -1;
        } //end if
        dato.setCantidad(cantidad);
        return cantidad;
    } //end procesa

    public boolean hayDatos() {
        if (size() > 0) {
            return true;
        } //end if
        else {
            return false;
        } //end else
    } //end hayDatos

} //End EstructuraDeDatos
