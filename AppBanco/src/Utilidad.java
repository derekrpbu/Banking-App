
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Extremetech
 */
public class Utilidad {

    public static ArrayList<Cuenta> readFile(String fileName) {

        //Creamos ArrayList(permite guardar Objetos)
        ArrayList<Cuenta> cuentas = new ArrayList<>();

        try {
            FileReader fr = new FileReader(fileName);

            //FileReader como argumento
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] cuentaActual = line.split("<>");
                String numeroCuenta = cuentaActual[0];
                String duenioCuenta = cuentaActual[1];
                String fechaApertura = cuentaActual[2];
                double balance = Double.parseDouble(cuentaActual[3]);

                //Crear Cuenta
                Cuenta acc = new Cuenta(numeroCuenta, duenioCuenta, fechaApertura, balance);

                //Agregamos Cuenta a ArrayList
                cuentas.add(acc);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return cuentas;
    }

    public static void writeFile(ArrayList<Cuenta> cuentas, String fileName) {

        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Cuenta a : cuentas) {
                bw.write(a.getNumeroCuenta() + "<>" + a.getDuenioCuenta() + "<>" + a.getFechaApertura() + "<>" + String.valueOf(a.getBalance()) + "\n");
            }
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
