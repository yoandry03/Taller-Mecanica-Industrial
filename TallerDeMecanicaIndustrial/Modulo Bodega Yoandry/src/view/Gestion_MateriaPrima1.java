/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CRUD;
import java.io.IOException;
import java.util.ArrayList;
import model.MateriaPrima1;

/**
 *
 * @author Yoandry
 */
public class Gestion_MateriaPrima1 extends javax.swing.JFrame {

    Object [][] lista;
    
    public Gestion_MateriaPrima1() {
        initComponents();
        
        ArrayList<MateriaPrima1> mp1 = new ArrayList<>();
        
        try{
            mp1 = CRUD.readFileTextM();
        
        lista = new Object[mp1.size()][4];
        for(int i=0;i<mp1.size();i++){
            lista[i][0]=mp1.get(i).getNombreB();
            lista[i][1]=mp1.get(i).getCantEstibas();
            lista[i][2]=mp1.get(i).getCantTrabajadores();
            lista[i][3]=mp1.get(i).getTipoMP();
        }
        
        tablaMP1.setModel(new javax.swing.table.DefaultTableModel(lista, new String [] {"Nombre", "cantEstibas", "cantTrabajadores", "Tipo"}));
       
    }
    
    catch(IOException | ClassNotFoundException ex){
    
}
    this.setTitle("Gestión de Materia Prima 1");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMP1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaMP1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaMP1);
        if (tablaMP1.getColumnModel().getColumnCount() > 0) {
            tablaMP1.getColumnModel().getColumn(0).setResizable(false);
            tablaMP1.getColumnModel().getColumn(1).setResizable(false);
            tablaMP1.getColumnModel().getColumn(2).setResizable(false);
            tablaMP1.getColumnModel().getColumn(3).setResizable(false);
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
        ArrayList<MateriaPrima1> mp1 = new ArrayList<>();        
           
            
        for(int i=0;i<tablaMP1.getRowCount();i++){
            String nombreB = (String)tablaMP1.getValueAt(i, 0);
            int cantEstibas = (Integer)tablaMP1.getValueAt(i, 1);
            int cantTrabajadores = (Integer)tablaMP1.getValueAt(i, 2);      
            String tipoMP = (String)tablaMP1.getValueAt(i, 3);      
                            
            mp1.add(new MateriaPrima1(nombreB,cantEstibas,cantTrabajadores,tipoMP));
       
            }
                
        try{
            CRUD.writeFileTextM(mp1);
        }
        catch (Exception ex){
            
        }              // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMP1;
    // End of variables declaration//GEN-END:variables
}
