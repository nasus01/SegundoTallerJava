package main;
import javax.swing.JOptionPane;

public class Main {
    public static  void  main(String[] args){

        boolean accion = true;
        while (accion == true) {

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja una opcion\n\n 1.Obtener Numero fivonacci\n 2.Calculos Matematicos\n 3.salir"));
            switch (opcion) {
                case 1:
                    String cant_terminos = JOptionPane.showInputDialog("Introduzca la cantidad de terminos que desea");
                    int num_terminos = Integer.parseInt(cant_terminos);
                    int a = 0, b = 1, c, suma = 1;
                    System.out.println(a + "\n" + b);

                    for (int i = 2; i <= num_terminos; i++) {
                        c = a + b;
                        System.out.println(c + "\t");
                        suma += c;
                        a = b;
                        b = c;
                    }
                    JOptionPane.showMessageDialog(null, "La sumatoria es: " + suma);
                    break;
                case 2:
                    int menu2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la actividad:" + "\n1 - Calcular factorial de un número"
                            + "\n2 - Obtener el promedio de n datos"
                            + "\n3 - Para un grupo de n estudiantes, mostrar cuantos aprobaron y reprobaron el curso."
                            + "\n4 - Regresar"));
                    switch (menu2) {
                        case 1:
                            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
                            double aux = 1;
                            for (int i = 2; i <= num; i++) {
                                aux *= i;

                            }
                            JOptionPane.showMessageDialog(null, "El factorial de " + num + " es: " + aux);
                            break;
                        case 2:
                            double promedio = 0;
                            int numero;
                            int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Cantidad De Notas Para Calcular El Promedio"));
                            for (int i = 1; i <= cant; i++) {
                                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota: " + (i)));
                                promedio = promedio + numero;
                            }

                            JOptionPane.showMessageDialog(null, "El promedio es: " + promedio / cant);

                            break;
                        case 3:

                            int c1;
                            int c2;
                            int c3;
                            int prom;
                            JOptionPane.showMessageDialog(null, "solo Apruevas si tu promedio es mas de 70 ");
                            c1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa La Calificacion 1 :  "));
                            c2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa La Calificacion 2 :  "));
                            c3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa La Calificacion 3 :  "));
                            prom = (c1 + c2 + c3) / 3;
                            JOptionPane.showMessageDialog(null, "Promedio Final es =" + prom);
                            if (prom < 69) {
                                JOptionPane.showMessageDialog(null, "Esta Reprobado");
                            } else {
                                JOptionPane.showMessageDialog(null, "Esta Aprobado");
                            }

                            break;

                        case 4:
                            JOptionPane.showConfirmDialog(null, " Desea Regresar", "mensaje", JOptionPane.YES_NO_OPTION);
                            break;
                        default:
                          break;
                    }

                    break;
                default:
                    break;
            }
            int respuesta = JOptionPane.showConfirmDialog(null, "Volver?", "mensaje", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_NO_OPTION) {
                accion = true;
            } else if (respuesta == JOptionPane.NO_OPTION) {
                accion = false;

            }

        }

    }





    }

