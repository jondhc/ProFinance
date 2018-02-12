import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class CSVReport extends LinkedList<Movimiento> {

    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final LinkedList<Movimiento> movimientos = new LinkedList<Movimiento>();

    //CSV file header
    private static final String FILE_HEADER = "Tipo, Fecha, Hora, Cantidad, Concepto, Categoria";

    public static void writeCsvFile(String fileName) {

        //Create new students objects
        Movimiento movimiento1 = new Movimiento();
        movimiento1.setTipo('G');
        movimiento1.setFecha("11/02/18");
        movimiento1.setHora("14:35");
        movimiento1.setCantidad(-30.5);
        movimiento1.setConcepto("Chocolate");
        movimiento1.setCategoria("Alimentos");
        movimientos.add(movimiento1);

        Movimiento movimiento2 = new Movimiento();
        movimiento2.setTipo('G');
        movimiento2.setFecha("12/01/18");
        movimiento2.setHora("10:25");
        movimiento2.setCantidad(-300.0);
        movimiento2.setConcepto("Pago Netflix");
        movimiento2.setCategoria("Entretenimiento");
        movimientos.add(movimiento2);

        Movimiento movimiento3 = new Movimiento();
        movimiento3.setTipo('I');
        movimiento3.setFecha("11/02/18");
        movimiento3.setHora("14:37");
        movimiento3.setCantidad(12.5);
        movimiento3.setConcepto("Cobro");
        movimiento3.setCategoria("Prestamos");
        movimientos.add(movimiento3);

        Movimiento movimiento4 = new Movimiento();
        movimiento4.setTipo('I');
        movimiento4.setFecha("10/02/18");
        movimiento4.setHora("13:50");
        movimiento4.setCantidad(35.5);
        movimiento4.setConcepto("Cobro");
        movimiento4.setCategoria("Prestamos");
        movimientos.add(movimiento4);

        //Create a new list of student objects

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);

            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);
            int i = 0;
            //Write a new student object list to the CSV file
            while (i < movimientos.size()) {
                Double objetoDouble;
                String cantidad;
                objetoDouble = movimientos.get(i).getCantidad();
                cantidad = objetoDouble.toString();

                fileWriter.append(movimientos.get(i).getTipo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(movimientos.get(i).getFecha());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(movimientos.get(i).getHora());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(cantidad);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(movimientos.get(i).getConcepto());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(movimientos.get(i).getCategoria());
                fileWriter.append(NEW_LINE_SEPARATOR);

                i = i + 1;
            } //end while

            System.out.println("CSV file was created successfully in the parent directory");

        } //end try
        catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } //end catch
        finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        } //end finally
    } //end writeCVSFile

    public static void generarReporte() {
        CSVReport.writeCsvFile("reporte.csv");
    } //end generarReporte
} //end CSVReport
