/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CRUD;
import java.io.IOException;
import java.util.ArrayList;
import model.ProductosTerminados;

/**
 *
 * @author Yoandry
 */
public class Gestion_ProductosTerminados extends javax.swing.JFrame {

    Object [][] lista;
    
    public Gestion_ProductosTerminados() {
        initComponents();
        ArrayList<ProductosTerminados> pt = new ArrayList<>();
        
        try{
            pt = CRUD.readFileTextT();
        
        lista = new Object[pt.size()][5];
        for(int i=0;i<pt.size();i++){
            lista[i][0]=pt.get(i).getNombreB();
            lista[i][1]=pt.get(i).getCantEstibas();
            lista[i][2]=pt.get(i).getCantTrabajadores();
            lista[i][3]=pt.get(i).getTipoMP();
            lista[i][4]=pt.get(i).getCantidadPT();

        }
        
        tablaPT.setModel(new javax.swing.table.DefaultTableModel(lista, new String [] {"Nombre", "cantEstibas", "cantTrabajadores", "Tipo", "cantProductosTerminados"}));
       
    }
    
    catch(IOException | ClassNotFoundException ex){
    
}
    this.setTitle("Gestión de Productos Terminados");        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPT = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaPT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "cantEstibas", "cantTrabajadores", "Tipo", "cantProductosTerminados"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPT);
        if (tablaPT.getColumnModel().getColumnCount() > 0) {
            tablaPT.getColumnModel().getColumn(0).setResizable(false);
            tablaPT.getColumnModel().getColumn(1).setResizable(false);
            tablaPT.getColumnModel().getColumn(2).setResizable(false);
            tablaPT.getColumnModel().getColumn(3).setResizable(false);
            tablaPT.getColumnModel().getColumn(4).setResizable(false);
        }

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0));
        jMenuItem1.setText("Volver");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Guardar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Inicial i = new Inicial();
        i.setVisible(true);
        i.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ArrayList<ProductosTerminados> pt = new ArrayList<>();        
           
            
        for(int i=0;i<tablaPT.getRowCount();i++){
            String nombreB = (String)tablaPT.getValueAt(i, 0);
            int cantEstibas = (Integer)tablaPT.getValueAt(i, 1);
            int cantTrabajadores = (Integer)tablaPT.getValueAt(i, 2);      
            String tipoMP = (String)tablaPT.getValueAt(i, 3);      
            int cantProductosTerminados = (Integer)tablaPT.getValueAt(i, 4);      
                            
            pt.add(new ProductosTerminados(nombreB,cantEstibas,cantTrabajadores,tipoMP,cantProductosTerminados));
       
            }
                
        try{
            CRUD.writeFileTextT(pt);
        }
        catch (Exception ex){
            
        }         
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPT;
    // End of variables declaration//GEN-END:variables
}
