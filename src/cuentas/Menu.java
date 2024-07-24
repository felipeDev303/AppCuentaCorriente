package cuentas;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<CuentaCorriente> cuentas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void programa() {
        int opcion = -1;
        while (opcion != 0) {
            mostrarMenu();
            opcion = elegirOpcion();
            ejecutarOpcion(opcion);
        }
    }

    private void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Agregar nueva cuenta");
        System.out.println("2. Revisar cuentas existentes");
        System.out.println("3. Abonar dinero a una cuenta");
        System.out.println("4. Cargar dinero de una cuenta");
        System.out.println("0. Salir");
    }

    private int elegirOpcion() {
        System.out.print("Opción: ");
        return scanner.nextInt();
    }

    private void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                agregarCuenta();
                break;
            case 2:
                revisarCuentas();
                break;
            case 3:
                abonarDinero();
                break;
            case 4:
                cargarDinero();
                break;
            case 0:
                System.out.println("Hasta pronto.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private void agregarCuenta() {
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el titular de la cuenta: ");
        String titular = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial (o presione enter para omitir): ");
        String saldoStr = scanner.nextLine();
        if (saldoStr.isEmpty()) {
            cuentas.add(new CuentaCorriente(titular));
        } else {
            int saldo = Integer.parseInt(saldoStr);
            cuentas.add(new CuentaCorriente(titular, saldo));
        }
        System.out.println("Cuenta agregada exitosamente.");
    }

    private void revisarCuentas() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas disponibles.");
        } else {
            for (CuentaCorriente cuenta : cuentas) {
                System.out.println(cuenta);
            }
        }
    }

    private void abonarDinero() {
        System.out.print("Ingrese el número de la cuenta a abonar: ");
        int numeroCuenta = scanner.nextInt();
        CuentaCorriente cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            System.out.print("Ingrese la cantidad a abonar: ");
            int cantidad = scanner.nextInt();
            cuenta.abonar(cantidad);
            System.out.println("Cantidad abonada exitosamente.");
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }

    private void cargarDinero() {
        System.out.print("Ingrese el número de la cuenta a cargar: ");
        int numeroCuenta = scanner.nextInt();
        CuentaCorriente cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            System.out.print("Ingrese la cantidad a cargar: ");
            int cantidad = scanner.nextInt();
            cuenta.cargar(cantidad);
            System.out.println("Cantidad cargada exitosamente.");
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }

    private CuentaCorriente buscarCuenta(int numeroCuenta) {
        for (CuentaCorriente cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                return cuenta;
            }
        }
        return null;
    }
}
