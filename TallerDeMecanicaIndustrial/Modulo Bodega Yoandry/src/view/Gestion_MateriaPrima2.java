/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CRUD;
import java.io.IOException;
import java.util.ArrayList;
import model.MateriaPrima2;

/**
 *
 * @author Yoandry
 */
public class Gestion_MateriaPrima2 extends javax.swing.JFrame {

    Object [][] lista;
    
    public Gestion_MateriaPrima2() {
        initComponents();
        
        ArrayList<MateriaPrima2> mp2 = new ArrayList<>();
        
        try{
            mp2 = CRUD.readFileTextP();
        
        lista = new Object[mp2.size()][4];
        for(int i=0;i<mp2.size();i++){
            lista[i][0]=mp2.get(i).getNombreB();
            lista[i][1]=mp2.get(i).getCantEstibas();
            lista[i][2]=mp2.get(i).getCantTrabajadores();
            lista[i][3]=mp2.get(i).getTipoMP();
        }
        
        tablaMP2.setModel(new javax.swing.table.DefaultTableModel(lista, new String [] {"Nombre", "cantEstibas", "cantTrabajadores", "Tipo"}));
       
    }
    
    catch(IOException | ClassNotFoundException ex){
    
}
    this.setTitle("Gestión de Materia Prima 2");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMP2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaMP2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "cantEstibas", "cantTrabajadores", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMP2);
        if (tablaMP2.getColumnModel().getColumnCount() > 0) {
            tablaMP2.getColumnModel().getColumn(0).setResizable(false);
            tablaMP2.getColumnModel().getColumn(1).setResizable(false);
            tablaMP2.getColumnModel().getColumn(2).setResizable(false);
            tablaMP2.getColumnModel().getColumn(3).setResizable(false);
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
        ArrayList<MateriaPrima2> mp2 = new ArrayList<>();        
           
            
        for(int i=0;i<tablaMP2.getRowCount();i++){
            String nombreB = (String)tablaMP2.getValueAt(i, 0);
            int cantEstibas = (Integer)tablaMP2.getValueAt(i, 1);
            int cantTrabajadores = (Integer)tablaMP2.getValueAt(i, 2);      
            String tipoMP = (String)tablaMP2.getValueAt(i, 3);      
                            
            mp2.add(new MateriaPrima2(nombreB,cantEstibas,cantTrabajadores,tipoMP));
       
            }
                
        try{
            CRUD.writeFileTextP(mp2);
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
    private javax.swing.JTable tablaMP2;
    // End of variables declaration//GEN-END:variables
}
