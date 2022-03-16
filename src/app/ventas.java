package app;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ventas extends javax.swing.JFrame {

    public ventas() throws SQLException {
        initComponents();
        txtId.setVisible(false);
        txtPrecio.setVisible(false);
        cargaSelectProductos();
    }
    
    int fila = 0;
    double total = 0.00;
    Connection con=conexion.getConexion();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductosVentas = new javax.swing.JTable();
        btnPagar = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Producto");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Cantidad");

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });

        jTableProductosVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "PRODUCTO", "CANTIDAD", "PRECIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProductosVentas);

        btnPagar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Total: $");

        txtEliminar.setText("Eliminar");
        txtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEliminar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(151, 151, 151)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(287, 287, 287)
                            .addComponent(btnPagar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEliminar)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagar)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (!"".equals(txtCantidad.getText())) {
                try {

                    double precio = Double.parseDouble(txtPrecio.getText());
                    int cantidad = Integer.parseInt(txtCantidad.getText());
                    int existencias = 0;

                    con = conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("SELECT existencias FROM productos WHERE codigo=? ");
                    ResultSet resultado = ps.executeQuery();

                    if (resultado.next()) {
                        existencias = resultado.getInt("existencias");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro producto");
                        return;
                    }

                    if (existencias >= cantidad) {
                        DefaultTableModel temp = (DefaultTableModel) jTableProductosVentas.getModel();
                        temp.addRow(new Object[1]);
                        int columna = 0;
                       
                        jTableProductosVentas.setValueAt(txtCantidad.getText(), fila, columna);
                        columna++;
                        double importe = precio * cantidad;
                        jTableProductosVentas.setValueAt(importe, fila, columna);

                        fila++;
                        limpiarCajas();
                        actualizaPago();
                        //txtCodigo.requestFocusInWindow();

                    } else {
                        JOptionPane.showMessageDialog(null, "No hay existencias suficientes");
                    }
                    
                    con.close();
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
        }
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed

        DefaultTableModel temp = (DefaultTableModel) jTableProductosVentas.getModel();
        
        int prueba2=jTableProductosVentas.getSelectedRow();
        
        Vector prueba=temp.getDataVector().get(prueba2);
        
        String prueba1=prueba.get(0).toString();
        
        
        temp.removeRow(jTableProductosVentas.getSelectedRow());
        
        
//        try {
//            eliminarProductos(prueba1);
//        } catch (SQLException ex) {
//            Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
//        }
        

    }//GEN-LAST:event_txtEliminarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        if (fila == 0) {
            JOptionPane.showMessageDialog(null, "No hay articulos en la venta");
        } else {

            try {

                int idVenta = 0;

                con = conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("INSERT INTO ventas (total, fecha) VALUES (?,NOW())", Statement.RETURN_GENERATED_KEYS);
                ps.setDouble(1, total);

                
                ps.executeUpdate();

                ResultSet resultado = ps.getGeneratedKeys();
                resultado.next();
                idVenta = resultado.getInt(1);

                if (idVenta == 0) {
                    JOptionPane.showMessageDialog(null, "Error al guardar venta");
                    return;
                }

                agregaProductos(idVenta);

                limpiarCajas();
                limpiaTabla();
                total = 0.00;
                txtTotal.setText("0.00");

                JOptionPane.showMessageDialog(null, "Venta completa");

                con.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
           try {
            DefaultTableModel modelo = new DefaultTableModel();
            jTableProductosVentas.setModel(modelo);

            con = conexion.getConexion();
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT codigo, nombre,existencias,precio FROM productos");
            ResultSet resultado = ps.executeQuery();
            ResultSetMetaData rsmta = resultado.getMetaData();

            int columnas = rsmta.getColumnCount();

            modelo.addColumn("codigo");
            modelo.addColumn("nombre");
            modelo.addColumn("cantidad");
            modelo.addColumn("precio");

            int[] anchos = {20, 100, 150, 0};

            for (int a = 0; a < jTableProductosVentas.getColumnCount(); a++) {
                System.out.println(a);
                jTableProductosVentas.getColumnModel().getColumn(a).setPreferredWidth(anchos[a]);
            }

            while (resultado.next()) {

                Object[] filas = new Object[columnas];
                for (int b = 0; b < columnas; b++) {
                    filas[b] = resultado.getObject(b + 1);
                }

                modelo.addRow(filas);
            }
            
            actualizaPago();
            
            con.close();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void limpiarCajas() {
        txtId.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
    }

    private void actualizaPago() {
        total = 0.00;

        int numeroFilas = jTableProductosVentas.getRowCount();

        for (int a = 0; a < numeroFilas; a++) {
            total = total + Double.parseDouble(String.valueOf(jTableProductosVentas.getModel().getValueAt(a, 3)));
        }
        txtTotal.setText(String.format("%.2f", total));
    }

    private void agregaProductos(int idVenta) {

        double precio;
        int id, cantidad;
        String codigo, nombre;
        int filasT = jTableProductosVentas.getRowCount();

        con = conexion.getConexion();

        for (int b = 0; b < filasT; b++) {
            codigo = (String) jTableProductosVentas.getValueAt(b, 0);
            try {
                PreparedStatement ps = con.prepareStatement("SELECT id, nombre, precio FROM productos WHERE codigo=? ");
                ps.setString(1, codigo);
                ResultSet resultado = ps.executeQuery();

                while (resultado.next()) {
                    id = Integer.parseInt(resultado.getString("id"));
                    nombre = resultado.getString("nombre");
                    precio = resultado.getDouble("precio");

                    cantidad = Integer.parseInt(jTableProductosVentas.getValueAt(b, 2).toString());

                    PreparedStatement psI = con.prepareStatement("INSERT INTO detalle_venta_producto (id_venta, id_producto, nombre, precio, cantidad) VALUES (?,?,?,?,?)");
                    psI.setInt(1, idVenta);
                    psI.setInt(2, id);
                    psI.setString(3, nombre);
                    psI.setDouble(4, precio);
                    psI.setInt(5, cantidad);
                    psI.executeUpdate();

                    PreparedStatement psU = con.prepareStatement("UPDATE productos SET existencias = (existencias-?) WHERE id=?");
                    psU.setInt(1, cantidad);
                    psU.setInt(2, id);
                    psU.executeUpdate();
                }
                
                con.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    private void limpiaTabla() {
        DefaultTableModel temp = (DefaultTableModel) jTableProductosVentas.getModel();
        int filas = jTableProductosVentas.getRowCount();

        for (int a = 0; filas > a; a++) {
            temp.removeRow(0);
        }

    }
    
    private void cargaSelectProductos() throws SQLException {
        con = conexion.getConexion();
        ResultSet rs;
        PreparedStatement ps;
        String sqlquery ="SELECT nombre FROM productos";
        jComboBox1.addItem("-- Seleccione una opcion --");
        try{
          ps= con.prepareStatement(sqlquery);
          rs = ps.executeQuery();
            while(rs.next()){
                String nombreProducto = rs.getString("nombre");
                jComboBox1.addItem(nombreProducto);
            }
            con.close();
        }catch(Exception e){e.printStackTrace();
            System.out.println(e.toString());
        }finally{
            con.close();
        }
    }     
    
    private void eliminarProductos(String idProducto) throws SQLException {
        con = conexion.getConexion();
        ResultSet rs;
        PreparedStatement ps;
        String sqlquery ="delete from productos where codigo="+idProducto;
        try{
          ps = con.prepareStatement(sqlquery);
          ps.executeUpdate();
          
          con.close();
        }catch(Exception e){e.printStackTrace();
            System.out.println(e.toString());
        }finally{
            con.close();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ventas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ventas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductosVentas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JButton txtEliminar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
