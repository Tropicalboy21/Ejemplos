public class Ventas {
    public static double ventaMayor(double arr[]) {
        double max = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] >= max)
                max = arr[i];

        return max;
    }

    public static int mesMayor(double[] ventas, double max) {
        for (int i = 0; i < ventas.length; i++) {
            if (max == ventas[i]) {
                return i;
            }
        }
        return -1;
    }

    public static double suma(double[] arreglo) {
        double suma = 0;
        for (double dato : arreglo) {
            suma += dato;
        }
        return suma;
    }

    public static void main(String[] args) {
        double mayorVenta;
        String mayorMes;
        int mes;
        double promedio;

        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };
        double[] ventas = new double[12];

        for (int i = 0; i < meses.length; i++) {
            ventas[i] = Utils.leerDoble("\nDigite las ventas del mes " + meses[i] + ": ");
        }

        mayorVenta = ventaMayor(ventas);
        mes = mesMayor(ventas, ventaMayor(ventas));
        mayorMes = meses[mes];
        promedio = suma(ventas) / 12;

        System.out.println("El promedio de ventas de todo el año es : " + promedio);

        System.out.println("\nEl mes con mayores ventas fue " + mayorMes + " con un total de ₡" + mayorVenta
                + " Colones en ingresos.");
    }
}
