/*
 * Created by jondhc on 21-01-18
 */

import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Color;

public class Interfaz extends Frame implements View {

    //Etiquetas
    Label etiquetaFecha;
    Label etiquetaHora;
    Label etiquetaCantidad;
    Label etiquetaConcepto;
    Label etiquetaCategoria;
    Label etiquetaTotal;
    Label etiquetaCantidadTotal;

    //Campos de texto
    TextField campoFecha;
    TextField campoHora;
    TextField campoCantidad;
    TextField campoConcepto;
    TextField campoCategoria;

    //Botones
    Button botonRegistrarIngreso;
    Button botonRegistrarGasto;
    Button botonModificar;
    Button botonEliminar;
    Button botonAnterior;
    Button botonSiguiente;
    Button botonReporte;
    Button botonLimpiar;
    Button botonOrdenar;
    Button botonGuardar;

    ////////////////////////////////

    final int anchuraInterfaz;
    final int alturaInterfaz;

    public Interfaz(){

        //Color
        Color color;
        int rInterfaz;
        int gInterfaz;
        int bInterfaz;

        //Limites
        int posicionXInterfaz;
        int posicionYInterfaz;


        //Titulo
        String tituloInterfaz;


        ////////////////////////////////

        //Limites
        posicionXInterfaz = 20;
        posicionYInterfaz = 40;
        anchuraInterfaz = 250;
        alturaInterfaz = 300;

        //Titulo
        tituloInterfaz = "ProFinance";

        //Color
        rInterfaz = 255;
        gInterfaz = 255;
        bInterfaz = 255;


        ////////////////////////////////

        setTitle(tituloInterfaz);
        setBounds(posicionXInterfaz, posicionYInterfaz, anchuraInterfaz, alturaInterfaz);
        color = new Color(rInterfaz, gInterfaz, bInterfaz);
        setBackground(color);
        setLayout(null);
        construyeComponentes();


    } //end Interfaz


    public void construyeComponentes(){

        int anchoEstandarEtiqueta = (anchuraInterfaz / 2) - 4;
        int altoEstandarEtiqueta = 20;
        int anchoEstandarCampo = (anchuraInterfaz / 2) - 2;
        int altoEstandarCampo = 20;
        int anchoEstandarBoton = (anchuraInterfaz / 2) - 4;
        int altoEstandarBoton = 20;

        /*Botones
        BotonRegistrarIngreso
        BotonRegistrarGasto
        BotonModificar
        BotonEliminar
        BotonAnterior
        BotonSiguiente
        */

        ////////////////////////////////

        String strBotonRegistrarIngreso;
        String strBotonRegistrarGasto;
        String strBotonModificar;
        String strBotonEliminar;
        String strBotonAnterior;
        String strBotonSiguiente;
        String strBotonReporte;
        String strBotonLimpiar;
        String strBotonOrdenar;
        String strBotonGuardar;

        ////////////////////////////////

        strBotonRegistrarIngreso = "Registrar Ingreso";
        strBotonRegistrarGasto = "Registrar Gasto";
        strBotonModificar = "Modificar";
        strBotonEliminar = "Eliminar";
        strBotonAnterior = "Anterior";
        strBotonSiguiente = "Siguiente";
        strBotonReporte = "Reporte";
        strBotonLimpiar = "Limpiar";
        strBotonOrdenar = "Ordenar";
        strBotonGuardar = "Guardar";

        ////////////////////////////////

        botonRegistrarIngreso = new Button(strBotonRegistrarIngreso);
        botonRegistrarGasto = new Button(strBotonRegistrarGasto);
        botonModificar = new Button(strBotonModificar);
        botonEliminar = new Button(strBotonEliminar);
        botonAnterior = new Button(strBotonAnterior);
        botonSiguiente = new Button(strBotonSiguiente);
        botonReporte = new Button(strBotonReporte);
        botonLimpiar = new Button(strBotonLimpiar);
        botonOrdenar = new Button(strBotonOrdenar);
        botonGuardar = new Button(strBotonGuardar);


        ////////////////////////////////

        int xBotonRegistrarIngreso = 4;
        int yBotonRegistrarIngreso = (alturaInterfaz / 12) * 6;
        int wBotonRegistrarIngreso = anchoEstandarBoton;
        int hBotonRegistrarIngreso = altoEstandarBoton;

        int xBotonRegistrarGasto = (anchuraInterfaz / 2) - 2;
        int yBotonRegistrarGasto = (alturaInterfaz / 12) * 6;
        int wBotonRegistrarGasto = anchoEstandarBoton;
        int hBotonRegistrarGasto = altoEstandarBoton;

        int xBotonModificar = 4;
        int yBotonModificar = (alturaInterfaz / 12) * 8;
        int wBotonModificar = anchoEstandarBoton;
        int hBotonModificar = altoEstandarBoton;

        int xBotonEliminar = (anchuraInterfaz / 2) - 2;
        int yBotonEliminar = (alturaInterfaz / 12) * 8;
        int wBotonEliminar = anchoEstandarBoton;
        int hBotonEliminar = altoEstandarBoton;

        int xBotonAnterior = 4;
        int yBotonAnterior = (alturaInterfaz / 12) * 9;
        int wBotonAnterior = anchoEstandarBoton;
        int hBotonAnterior = altoEstandarBoton;

        int xBotonSiguiente = (anchuraInterfaz / 2) - 2;
        int yBotonSiguiente = (alturaInterfaz / 12) * 9;
        int wBotonSiguiente = anchoEstandarBoton;
        int hBotonSiguiente = altoEstandarBoton;

        int xBotonReporte = 4;
        int yBotonReporte = (alturaInterfaz/12)*10;
        int wBotonReporte = anchoEstandarBoton;
        int hBotonReporte = altoEstandarBoton;

        int xBotonLimpiar = (anchuraInterfaz/2) - 2;
        int yBotonLimpiar = (alturaInterfaz/12)*10;
        int wBotonLimpiar = anchoEstandarBoton;
        int hBotonLimpiar = altoEstandarBoton;

        int xBotonOrdenar = 4;
        int yBotonOrdenar = (alturaInterfaz/12)*11;
        int wBotonOrdenar = anchoEstandarBoton;
        int hBotonOrdenar = altoEstandarBoton;

        int xBotonGuardar = (anchuraInterfaz/2) - 2;
        int yBotonGuardar = (alturaInterfaz/12)*11;
        int wBotonGuardar = anchoEstandarBoton;
        int hBotonGuardar = altoEstandarBoton;

        ////////////////////////////////

        botonRegistrarIngreso.setBounds(xBotonRegistrarIngreso, yBotonRegistrarIngreso, wBotonRegistrarIngreso, hBotonRegistrarIngreso);
        botonRegistrarGasto.setBounds(xBotonRegistrarGasto, yBotonRegistrarGasto, wBotonRegistrarGasto, hBotonRegistrarGasto);
        botonModificar.setBounds(xBotonModificar, yBotonModificar, wBotonModificar, hBotonModificar);
        botonEliminar.setBounds(xBotonEliminar, yBotonEliminar, wBotonEliminar, hBotonEliminar);
        botonAnterior.setBounds(xBotonAnterior, yBotonAnterior, wBotonAnterior, hBotonAnterior);
        botonSiguiente.setBounds(xBotonSiguiente, yBotonSiguiente, wBotonSiguiente, hBotonSiguiente);
        botonReporte.setBounds(xBotonReporte, yBotonReporte, wBotonReporte, hBotonReporte);
        botonLimpiar.setBounds(xBotonLimpiar, yBotonLimpiar, wBotonLimpiar, hBotonLimpiar);
        botonOrdenar.setBounds(xBotonOrdenar, yBotonOrdenar, wBotonOrdenar, hBotonOrdenar);
        botonGuardar.setBounds(xBotonGuardar, yBotonGuardar, wBotonGuardar, hBotonGuardar);

        ////////////////////////////////

        add(botonRegistrarIngreso);
        add(botonRegistrarGasto);
        add(botonModificar);
        add(botonEliminar);
        add(botonAnterior);
        add(botonSiguiente);
        add(botonReporte);
        add(botonLimpiar);
        add(botonOrdenar);
        add(botonGuardar);

        ////////////////////////////////////////////////////////////////

        /* Campos de texto
        CampoFecha
        CampoHora
        CampoCantidad
        CampoConcepto
        CampoCategoria
        */

        ////////////////////////////////

        campoFecha = new TextField();
        campoHora = new TextField();
        campoCantidad = new TextField();
        campoConcepto = new TextField();
        campoCategoria = new TextField();

        ////////////////////////////////

        int xCampoFecha = (anchuraInterfaz / 2) - 2;
        int yCampoFecha = (alturaInterfaz / 12) * 1;
        int wCampoFecha = anchoEstandarCampo;
        int hCampoFecha = altoEstandarCampo;

        int xCampoHora = (anchuraInterfaz / 2) - 2;
        int yCampoHora = (alturaInterfaz / 12) * 2;
        int wCampoHora = anchoEstandarCampo;
        int hCampoHora = altoEstandarCampo;

        int xCampoCantidad = (anchuraInterfaz / 2) - 2;
        int yCampoCantidad = (alturaInterfaz / 12) * 3;
        int wCampoCantidad = anchoEstandarCampo;
        int hCampoCantidad = altoEstandarCampo;

        int xCampoConcepto = (anchuraInterfaz / 2) - 2;
        int yCampoConcepto = (alturaInterfaz / 12) * 4;
        int wCampoConcepto = anchoEstandarCampo;
        int hCampoConcepto = altoEstandarCampo;

        int xCampoCategoria = (anchuraInterfaz / 2) - 2;
        int yCampoCategoria = (alturaInterfaz / 12) * 5;
        int wCampoCategoria = anchoEstandarCampo;
        int hCampoCategoria = altoEstandarCampo;

        ////////////////////////////////

        campoFecha.setBounds(xCampoFecha, yCampoFecha, wCampoFecha, hCampoFecha);
        campoHora.setBounds(xCampoHora, yCampoHora, wCampoHora, hCampoHora);
        campoCantidad.setBounds(xCampoCantidad, yCampoCantidad, wCampoCantidad, hCampoCantidad);
        campoConcepto.setBounds(xCampoConcepto, yCampoConcepto, wCampoConcepto, hCampoConcepto);
        campoCategoria.setBounds(xCampoCategoria, yCampoCategoria, wCampoCategoria, hCampoCategoria);

        ////////////////////////////////

        add(campoFecha);
        add(campoHora);
        add(campoCantidad);
        add(campoConcepto);
        add(campoCategoria);

        ////////////////////////////////////////////////////////////////

        /*Etiquetas
        EtiquetaFecha
        EtiquetaHora
        EtiquetaCantidad
        EtiquetaConcepto
        EtiquetaCategoria
        EtiquetaTotal
        EtiquetaCantidadTotal
        */

        ////////////////////////////////

        String strEtiquetaFecha = "Fecha";
        String strEtiquetaHora = "Hora";
        String strEtiquetaCantidad = "Cantidad";
        String strEtiquetaConcepto = "Concepto";
        String strEtiquetaCategoria = "Categoría";
        String strEtiquetaTotal = "Total";
        String strEtiquetaCantidadTotal  = "$";

        ////////////////////////////////

        etiquetaFecha = new Label(strEtiquetaFecha);
        etiquetaHora = new Label(strEtiquetaHora);
        etiquetaCantidad = new Label(strEtiquetaCantidad);
        etiquetaConcepto = new Label(strEtiquetaConcepto);
        etiquetaCategoria = new Label(strEtiquetaCategoria);
        etiquetaTotal = new Label(strEtiquetaTotal);
        etiquetaCantidadTotal = new Label(strEtiquetaCantidadTotal);

        ////////////////////////////////

        int xEtiquetaFecha = 4;
        int yEtiquetaFecha = (alturaInterfaz / 12) * 1;
        int wEtiquetaFecha = anchoEstandarEtiqueta;
        int hEtiquetaFecha = altoEstandarEtiqueta;

        int xEtiquetaHora = 4;
        int yEtiquetaHora = (alturaInterfaz / 12) * 2;
        int wEtiquetaHora = anchoEstandarEtiqueta;
        int hEtiquetaHora = altoEstandarEtiqueta;

        int xEtiquetaCantidad = 4;
        int yEtiquetaCantidad = (alturaInterfaz / 12) * 3;
        int wEtiquetaCantidad = anchoEstandarEtiqueta;
        int hEtiquetaCantidad = altoEstandarEtiqueta;

        int xEtiquetaConcepto = 4;
        int yEtiquetaConcepto = (alturaInterfaz / 12) * 4;
        int wEtiquetaConcepto = anchoEstandarEtiqueta;
        int hEtiquetaConcepto = altoEstandarEtiqueta;

        int xEtiquetaCategoria = 4;
        int yEtiquetaCategoria = (alturaInterfaz / 12) * 5;
        int wEtiquetaCategoria = anchoEstandarEtiqueta;
        int hEtiquetaCategoria = altoEstandarEtiqueta;

        int xEtiquetaTotal = 4;
        int yEtiquetaTotal = (alturaInterfaz / 12) * 7;
        int wEtiquetaTotal = anchoEstandarEtiqueta;
        int hEtiquetaTotal = altoEstandarEtiqueta;

        int xEtiquetaCantidadTotal = anchuraInterfaz / 2;
        int yEtiquetaCantidadTotal = (alturaInterfaz / 12) * 7;
        int wEtiquetaCantidadTotal = anchoEstandarEtiqueta;
        int hEtiquetaCantidadTotal = altoEstandarEtiqueta;

        ////////////////////////////////

        etiquetaFecha.setBounds(xEtiquetaFecha, yEtiquetaFecha, wEtiquetaFecha, hEtiquetaFecha);
        etiquetaHora.setBounds(xEtiquetaHora, yEtiquetaHora, wEtiquetaHora, hEtiquetaHora);
        etiquetaCantidad.setBounds(xEtiquetaCantidad, yEtiquetaCantidad, wEtiquetaCantidad, hEtiquetaCantidad);
        etiquetaConcepto.setBounds(xEtiquetaConcepto, yEtiquetaConcepto, wEtiquetaConcepto, hEtiquetaConcepto);
        etiquetaCategoria.setBounds(xEtiquetaCategoria, yEtiquetaCategoria, wEtiquetaCategoria, hEtiquetaCategoria);
        etiquetaTotal.setBounds(xEtiquetaTotal, yEtiquetaTotal, wEtiquetaTotal, hEtiquetaTotal);
        etiquetaCantidadTotal.setBounds(xEtiquetaCantidadTotal, yEtiquetaCantidadTotal, wEtiquetaCantidadTotal, hEtiquetaCantidadTotal);

        ////////////////////////////////

        add(etiquetaFecha);
        add(etiquetaHora);
        add(etiquetaCantidad);
        add(etiquetaConcepto);
        add(etiquetaCategoria);
        add(etiquetaTotal);
        add(etiquetaCantidadTotal);

    } //end construyeComponentes

    public void setActionListener(Controller controller) {

        botonRegistrarIngreso.addActionListener(controller);
        botonRegistrarGasto.addActionListener(controller);
        botonModificar.addActionListener(controller);
        botonEliminar.addActionListener(controller);
        botonAnterior.addActionListener(controller);
        botonSiguiente.addActionListener(controller);
        botonReporte.addActionListener(controller);
        botonLimpiar.addActionListener(controller);
        botonOrdenar.addActionListener(controller);
        botonGuardar.addActionListener(controller);

    } //end setActionListener

    public void inicia(){
        setVisible(true);
        setResizable(false);
    } //end inicia
} //end Interfaz
