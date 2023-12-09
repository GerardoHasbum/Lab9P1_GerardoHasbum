/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab9p1_gerardohasbum;

import javax.swing.JOptionPane;

/**
 *
 * @author ghasb
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Gusanito = new javax.swing.JButton();
        Menu = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        Gusanito.setBackground(new java.awt.Color(102, 204, 255));
        Gusanito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Gusanito.setForeground(new java.awt.Color(0, 0, 0));
        Gusanito.setText("Gusanito");
        Gusanito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GusanitoActionPerformed(evt);
            }
        });

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Menu.setForeground(new java.awt.Color(0, 0, 0));
        Menu.setText("Menu");

        Salir.setBackground(new java.awt.Color(102, 204, 255));
        Salir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(Menu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Gusanito, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Menu)
                .addGap(36, 36, 36)
                .addComponent(Gusanito, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void GusanitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GusanitoActionPerformed
        setVisible(false);
        Gusanito gus = new Gusanito();
        gus.instrucciones.clear();
        gus.dims();
        int x = gus.dimx;
        int y = gus.dimy;
        //validacion anti salirse de los parametros permitidos
        while (x < 4 || x > 10 || y < 4 || y > 10) {
            gus.dims_inc();
            gus.dims();
            x = gus.dimx;
            y = gus.dimy;
        }
        char[][] tablero = new char[x][y];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
            }
        }
        int Jugx = gus.RanJugx();
        int Jugy = gus.RanJugy();
        tablero[Jugx][Jugy] = 'S';//Coloca el gusanito
        int Manx = gus.RanManx();
        int Many = gus.RanMany();
        while (tablero[Manx][Many] == 'S') {//valida que la manzana no aparezca encima de el gusanito
            Manx = gus.RanManx();
            Many = gus.RanMany();
        }
        tablero[Manx][Many] = 'O';
        int ObsCont = gus.ranObs();
        for (int i = 0; i < ObsCont; i++) {
            int Obsx = gus.RanObsx();
            int Obsy = gus.RanObsy();
            while (tablero[Obsx][Obsy] == 'S' || tablero[Obsx][Obsy] == 'O' || tablero[Obsx][Obsy] == '#') {//Valida que los obstaculos no aparezcan encima de la manzana, gusanito u otros obstaculos
                Obsx = gus.RanObsx();
                Obsy = gus.RanObsy();
            }
            tablero[Obsx][Obsy] = '#';
        }
        gus.PrintMat(tablero);
        boolean seleccion = false;
        while (seleccion == false) {
            int opcion = gus.OpcionJOP(tablero);
            if (opcion == 1) {
                gus.DarInstruccion(tablero);
            } else {
                seleccion = true;
                break;
            }
        }
        gus.PrintArr(gus.instrucciones);
        int[] movx = new int[gus.instrucciones.size()];
        int[] movy = new int[gus.instrucciones.size()];
        int newposx = 0, newposy = 0;
        int opcion_sale = 0;
        int cont_pos = 0;
        int contx = 0;
        int conty = 0;
        while (cont_pos > -1 && cont_pos < gus.instrucciones.size()) {
            System.out.println("a");

            String temp = gus.instrucciones.get(cont_pos);
            temp.toUpperCase();
            if (temp.contains("UP")) {
                System.out.println("b");
                movx[contx] = (int) (temp.charAt(0)) - 48;
                newposx = Jugx - movx[contx];
                contx++;

            } else if (temp.contains("DN")) {
                System.out.println("c");
                movx[contx] = (int) (temp.charAt(0)) - 48;
                newposx = Jugx + movx[contx];
                contx++;

            } else if (temp.contains("RT")) {
                System.out.println("d");
                movy[conty] = (int) (temp.charAt(0)) - 48;
                newposy = Jugy + movy[conty];
                conty++;

            } else if (temp.contains("LT")) {
                System.out.println("e");
                movy[conty] = (int) (temp.charAt(0)) - 48;
                newposy = Jugy - movy[conty];
                conty++;

            }

            if (newposx < 0) {
                System.out.println("f");
                opcion_sale = gus.JoPsale(tablero);
            } else if (newposx > tablero.length - 1) {
                System.out.println("g");
                opcion_sale = gus.JoPsale(tablero);
            } else if (newposy < 0) {
                System.out.println("h");
                opcion_sale = gus.JoPsale(tablero);
            } else if (newposy > tablero[0].length - 1) {
                System.out.println("i");
                opcion_sale = gus.JoPsale(tablero);
            } else {
                if (newposx > 0) {
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            tablero[newposx][j]='S';
                            tablero[Jugx][Jugy]=' ';
                        }
                    }
                }
                opcion_sale = gus.JoPnosale(tablero);
            }

            if (opcion_sale == 1) {
                cont_pos++;
                if (cont_pos >= gus.instrucciones.size()) {
                    JOptionPane.showMessageDialog(null, "No hay mas pasos");
                    cont_pos--;
                    if (cont_pos <= contx) {
                        contx--;
                    } else if (cont_pos <= conty) {
                        conty--;
                    }
                }
            } else if (opcion_sale == 2) {
                cont_pos--;
                if (cont_pos <= 0) {
                    JOptionPane.showMessageDialog(null, "No hay mas pasos");
                    cont_pos++;
                    if (cont_pos <= contx) {
                        contx--;
                    } else if (cont_pos <= conty) {
                        conty--;
                    }
                }
            } else if (opcion_sale == 3) {
                cont_pos = gus.JoPBuscar();
                if (cont_pos <= 0) {
                    JOptionPane.showMessageDialog(null, "No hay mas pasos");
                    cont_pos = 0;
                    if (cont_pos <= contx) {
                        contx--;
                    } else if (cont_pos < conty) {
                        conty--;
                    }
                } else if (cont_pos >= gus.instrucciones.size()) {
                    JOptionPane.showMessageDialog(null, "No hay mas pasos");
                    cont_pos = 0;
                    if (cont_pos <= contx) {
                        contx--;
                    } else if (cont_pos <= conty) {
                        conty--;
                    }
                }
            } else if (opcion_sale == 4) {
                setVisible(true);
                break;
            }

        }

    }//GEN-LAST:event_GusanitoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gusanito;
    private javax.swing.JLabel Menu;
    private javax.swing.JButton Salir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}