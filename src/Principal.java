import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarConversion consulta = new ConsultarConversion();
        int opcion = 0;
        String menu = """
                __________________________________________________
                Bienvenido a la conversión de moneda
                1) Dólar          => Peso Méxicano
                2) Peso Méxicano  => Dólar
                3) Real brasileño => Dólar
                4) Dólar          => Real Brasileño 
                5) Dólar          => Peso colombiano 
                6) Peso colombiano=> Dólar 
                7) Salir
                __________________________________________________
                """;
        while (opcion != 7) {
            System.out.println(menu);
            System.out.println(" Elija una opción válida");
            opcion = lectura.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escriba la cantidad a convertir : ");
                    try {
                        var cantidadDeConversion = lectura.nextDouble();
                        String conversionCode = "USD";
                        String conversionResult = "MXN";
                        Conversion conversion = consulta.realizaConversion(cantidadDeConversion, conversionCode, conversionResult);
                        System.out.println("EL valor de " + cantidadDeConversion + " " + conversionCode +
                                " corresponde el valor de " + conversion.conversion_result()
                                + " " + conversionResult);

                    } catch (Exception e) {
                        System.out.println("Conversión no realizada ");
                    }
                    break;
                case 2:
                    System.out.println("Escriba la cantidad a convertir : ");
                    try {
                        var cantidadDeConversion = lectura.nextDouble();
                        String conversionCode = "MXN";
                        String conversionResult = "USD";
                        Conversion conversion = consulta.realizaConversion(cantidadDeConversion, conversionCode, conversionResult);
                        System.out.println("EL valor de " + cantidadDeConversion + " " + conversionCode +
                                " corresponde el valor de " + conversion.conversion_result()
                                + " " + conversionResult);

                    } catch (Exception e) {
                        System.out.println("Conversión no realizada ");
                    }
                    break;
                case 3:
                    System.out.println("Escriba la cantidad a convertir : ");
                    try {
                        var cantidadDeConversion = lectura.nextDouble();
                        String conversionCode = "BRL";
                        String conversionResult = "USD";
                        Conversion conversion = consulta.realizaConversion(cantidadDeConversion, conversionCode, conversionResult);
                        System.out.println("EL valor de " + cantidadDeConversion + " " + conversionCode +
                                " corresponde el valor de " + conversion.conversion_result()
                                + " " + conversionResult);
                    } catch (Exception e) {
                        System.out.println("Conversión no realizada ");
                    }
                    break;
                case 4:
                    System.out.println("Escriba la cantidad a convertir : ");
                    try {
                        var cantidadDeConversion = lectura.nextDouble();
                        String conversionCode = "USD";
                        String conversionResult = "BRL";
                        Conversion conversion = consulta.realizaConversion(cantidadDeConversion, conversionCode, conversionResult);
                        System.out.println("EL valor de " + cantidadDeConversion + " " + conversionCode +
                                " corresponde el valor de " + conversion.conversion_result()
                                + " " + conversionResult);

                    } catch (Exception e) {
                        System.out.println("Conversión no realizada ");
                    }
                    break;
                case 5:
                    System.out.println("Escriba la cantidad a convertir : ");
                    try {
                        var cantidadDeConversion = lectura.nextDouble();
                        String conversionCode = "USD";
                        String conversionResult = "COP";
                        Conversion conversion = consulta.realizaConversion(cantidadDeConversion, conversionCode, conversionResult);
                        System.out.println("EL valor de " + cantidadDeConversion + " " + conversionCode +
                                " corresponde el valor de " + conversion.conversion_result()
                                + " " + conversionResult);
                    } catch (Exception e) {
                        System.out.println("Conversión no realizada ");
                    }
                    break;
                case 6:
                    System.out.println("Escriba la cantidad a convertir : ");
                    try {
                        var cantidadDeConversion = lectura.nextDouble();
                        String conversionCode = "COP";
                        String conversionResult = "USD";
                        Conversion conversion = consulta.realizaConversion(cantidadDeConversion, conversionCode, conversionResult);
                        System.out.println("EL valor de " + cantidadDeConversion + " " + conversionCode +
                                " corresponde el valor de " + conversion.conversion_result()
                                + " " + conversionResult);

                    } catch (Exception e) {
                        System.out.println("Conversión no realizada ");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");

            }

        }

    }
}