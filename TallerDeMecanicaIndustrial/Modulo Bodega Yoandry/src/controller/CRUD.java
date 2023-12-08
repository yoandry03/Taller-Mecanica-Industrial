package controller;

import java.io.*;
import java.util.ArrayList;
import model.Gerente;
import model.MateriaPrima1;
import model.MateriaPrima2;
import model.ProductosTerminados;
import model.Proveedor;

    public class CRUD {
    
        public static ArrayList<Gerente> readFileTextG() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("gerente.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Gerente> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Gerente nuevo = (Gerente)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextG(ArrayList<Gerente>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("gerente.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
        
        
        
        
         public static ArrayList<MateriaPrima1> readFileTextM() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("mp1.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<MateriaPrima1> clientes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                MateriaPrima1 nuevo = (MateriaPrima1)entradaObjetos.readObject();
                clientes.add(nuevo);
                
            }
            
            return clientes;
        }
        
        public static void writeFileTextM(ArrayList<MateriaPrima1>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("mp1.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
        
        
        
        
         public static ArrayList<MateriaPrima2> readFileTextP() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("mp2.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<MateriaPrima2> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                MateriaPrima2 nuevo = (MateriaPrima2)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextP(ArrayList<MateriaPrima2>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("mp2.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos);
            
            int cantidad = participantes.size();
            
            salidaObjetos.writeInt(cantidad);
            
            for(int i=0;i<cantidad;i++){
                
                salidaObjetos.writeObject(participantes.get(i));
                
            }
            
            salidaObjetos.flush();
            salidaObjetos.close();
            
        }
        
        
        
        
         public static ArrayList<Proveedor> readFileTextProveedor() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("proveedor.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Proveedor> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Proveedor nuevo = (Proveedor)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextProveedor(ArrayList<Proveedor>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("proveedor.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
        
        
        
        
         public static ArrayList<ProductosTerminados> readFileTextT() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("pt.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<ProductosTerminados> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                ProductosTerminados nuevo = (ProductosTerminados)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextT(ArrayList<ProductosTerminados>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("pt.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
        
    }