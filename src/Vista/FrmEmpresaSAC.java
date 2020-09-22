package Vista;

import Control.RegistroDePersonal;
import Modelo.PersonalDelEmpresa;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Stuwar Giron Garcia
 */
public final class FrmEmpresaSAC extends javax.swing.JFrame {

    RegistroDePersonal rp = new RegistroDePersonal(); //Llamamos a la clase de registro personal
    DefaultTableModel modelo = new DefaultTableModel();
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    PersonalDelEmpresa p = new PersonalDelEmpresa();

    public FrmEmpresaSAC() {
        initComponents();
        this.setTitle("Registro de la Empresa SAC");
        this.setLocationRelativeTo(null);
        tablapersonal.setModel(modelo);
        //Creamos las colummnas de nuesttra tabla
        this.modelo.addColumn("Codigo");
        this.modelo.addColumn("Nombre");
        this.modelo.addColumn("Apellido");
        this.modelo.addColumn("Sexo");
        this.modelo.addColumn("Edad");
        this.modelo.addColumn("Estado civil");
        this.modelo.addColumn("Area");
        this.modelo.addColumn("fecha de ingreso");
        //Cambiar el icono del progrmaa
        setIconImage(new ImageIcon(getClass().getResource("/Img/Logo-removebg-preview.png")).getImage());

        listar();
//        SumaEdad();
        SumaEdad(); // EDADES
        MinMax();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboEstadoCivl = new javax.swing.JComboBox<>();
        cboArea = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        datofecha = new com.toedter.calendar.JDateChooser();
        btnagregar = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        cboSexo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapersonal = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtTotalPersonal = new javax.swing.JTextField();
        txaCalculos = new javax.swing.JTextArea();
        txaresumen = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel1.setText("Codigo: ");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel2.setText("Nombre: ");

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel4.setText("Apellido: ");

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel3.setText("Edad: ");

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel5.setText("Estado Civil:");

        cboEstadoCivl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "Soltero(a)", "Casado(a)", "Viudo(a)", " " }));

        cboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "Contabilidad", "Finanzas", " " }));

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel6.setText("Area:");

        jLabel7.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel7.setText("Fecha Ingreso: ");

        btnagregar.setBackground(new java.awt.Color(96, 225, 254));
        btnagregar.setForeground(new java.awt.Color(52, 52, 52));
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnlistar.setBackground(new java.awt.Color(96, 225, 254));
        btnlistar.setForeground(new java.awt.Color(52, 52, 52));
        btnlistar.setText("Listar");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        btnnuevo.setBackground(new java.awt.Color(96, 225, 254));
        btnnuevo.setForeground(new java.awt.Color(52, 52, 52));
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "Hombre", "Mujer", "Otro", " " }));

        jLabel8.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel8.setText("Sexo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datofecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(74, 74, 74)
                                .addComponent(cboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cboEstadoCivl, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(68, 68, 68)
                                .addComponent(cboArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(14, 14, 14)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(36, 36, 36)
                                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4))
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5))
                    .addComponent(cboEstadoCivl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(datofecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        tablapersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablapersonal);

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTotalPersonal.setEditable(false);
        txtTotalPersonal.setBackground(new java.awt.Color(153, 255, 255));
        txtTotalPersonal.setBorder(null);
        jPanel3.add(txtTotalPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 760, 36));

        txaCalculos.setEditable(false);
        txaCalculos.setBackground(new java.awt.Color(153, 255, 255));
        txaCalculos.setColumns(20);
        txaCalculos.setRows(5);
        txaCalculos.setBorder(null);
        jPanel3.add(txaCalculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 760, 36));

        txaresumen.setEditable(false);
        txaresumen.setBackground(new java.awt.Color(153, 255, 255));
        txaresumen.setColumns(20);
        txaresumen.setRows(5);
        txaresumen.setBorder(null);
        jPanel3.add(txaresumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 760, 36));
        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 780, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 0, -1, 519));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        PersonalDelEmpresa objP = new PersonalDelEmpresa(txtcodigo.getText(), txtnombre.getText(), txtapellido.getText(),
                cboSexo.getSelectedItem().toString(), Integer.parseInt(txtedad.getText()), cboEstadoCivl.getSelectedItem().toString(), cboArea.getSelectedItem().toString(), df.format(datofecha.getDate()));

        try {
            rp.agregar(objP);
            listar();
        } catch (IOException e) {
        }
        ContarVocalesyConsonantes();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        listar();
    }//GEN-LAST:event_btnlistarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        txtcodigo.setText(null);
        txtnombre.setText(null);
        txtapellido.setText(null);
        cboSexo.setSelectedIndex(0);
        txtedad.setText(null);
        cboEstadoCivl.setSelectedIndex(0);
        cboArea.setSelectedIndex(0);
        datofecha.setCalendar(null);
        txtcodigo.requestFocus();
    }//GEN-LAST:event_btnnuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEmpresaSAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmpresaSAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmpresaSAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmpresaSAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmpresaSAC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> cboArea;
    private javax.swing.JComboBox<String> cboEstadoCivl;
    private javax.swing.JComboBox<String> cboSexo;
    private com.toedter.calendar.JDateChooser datofecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablapersonal;
    private javax.swing.JTextArea txaCalculos;
    private javax.swing.JTextArea txaresumen;
    private javax.swing.JTextField txtTotalPersonal;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

    private void listar() {
        modelo.setRowCount(0);
        try {
            rp.leer();
            for (PersonalDelEmpresa p : rp.lista) {
                Object[] fila = {p.getCodigo(), p.getNombre(), p.getApellido(), p.getSexo(),
                    p.getEdad(), p.getEstadoCivil(), p.getArea(), p.getFechaIngreso()};
                modelo.addRow(fila);
            }
        } catch (IOException e) {
        }
    }

    public static Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

    public void ContarVocalesyConsonantes() {
        String palabra = txtnombre.getText() + txtapellido.getText() + cboSexo.getSelectedItem().toString() + cboEstadoCivl.getSelectedItem().toString() + cboArea.getSelectedItem().toString(); //Obtiene los datos ingresados
        int contador1 = 0, contador2 = 0, consonate; //Declaramos las variables
        for (int i = 0; i < palabra.length(); i++) { // Obtiene la longitud de la palabra ingresada
            contador1++;
        }
        for (int i = 0; i < palabra.length(); i++) {
            if ((palabra.charAt(i) == 'a') || (palabra.charAt(i) == 'e') || (palabra.charAt(i) == 'i')
                    || //Condicion que evalua la cadena ingresada de las siguientes vocales
                    (palabra.charAt(i) == 'o') || (palabra.charAt(i) == 'u')) {
                contador2++;
            }
        }
        consonate = contador1 - contador2; // Resta de las variables 
        txaresumen.setText("Las palabras: " + palabra + " contiene " + contador2 + " vocales"
                + " y   " + consonate + " consonantes");
    }

    public void SumaEdad() {
        int n1 = 0;
        int suma_Total = 0;
        for (int i = 0; i < tablapersonal.getRowCount(); i++) {
            n1 = Integer.parseInt(tablapersonal.getValueAt(i, 4).toString());
            suma_Total += n1;
        }

        txtTotalPersonal.setText("La suma de edades es de: " + suma_Total);
    }

    void MinMax() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < tablapersonal.getRowCount(); i++) {
            list.add(Integer.parseInt(tablapersonal.getValueAt(i, 4).toString()));
        }
        int max = Collections.max(list);
        int min= Collections.min(list);
        
        txaCalculos.setText("La edad maxima es: "+Integer.toString(max) + " y " +
                ""+"La edad minima es: "+Integer.toString(min));
    }

}
