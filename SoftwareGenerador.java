

package softwareinformaticou2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALEXIS
 */
public class SoftwareGenerador extends javax.swing.JFrame {
    
    double[] valores = new double[100];
    double[] valoresCu = new double[valores.length];
    int [] total= new int[1];
    JFileChooser seleccion=new JFileChooser();
    File archivo;
    FileInputStream entrada;
    DefaultTableModel model_tabla;
    
    
    /**
     * Creates new form SoftwareGenerador
     */
    public SoftwareGenerador() {
        initComponents();
        model_tabla = new DefaultTableModel();
        model_tabla.addColumn("Datos");
        this.tablaResultados.setModel(model_tabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        ExtraerArchivo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SumaT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DatosT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Confiabilidad = new javax.swing.JComboBox<>();
        independencia = new javax.swing.JButton();
        resulIndependencia = new javax.swing.JTextField();
        resulVarianza = new javax.swing.JTextField();
        resulMedia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ValorE = new javax.swing.JTextField();
        IndepeOno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        varianzaResul = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        jLabel1.setText("PRUEBA DE CORRIDAS ARRIBA Y ABAJO");

        ExtraerArchivo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ExtraerArchivo.setText("Extraer Archivo");
        ExtraerArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtraerArchivoActionPerformed(evt);
            }
        });

        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaResultados);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SUMA TOTAL:");

        SumaT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("N° DATOS");

        DatosT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("NIVEL DE CONFIABILIDAD");

        Confiabilidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Confiabilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "90", "95", "99" }));
        Confiabilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiabilidadActionPerformed(evt);
            }
        });

        independencia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        independencia.setText("CALCULO INDEPENDENCIA");
        independencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                independenciaActionPerformed(evt);
            }
        });

        resulIndependencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        resulVarianza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        resulMedia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("ESTADISTICO");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("VALOR ESPERADO");

        ValorE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        IndepeOno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("VARIANZA");

        varianzaResul.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("MEDIA");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("VARIANZA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(DatosT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ExtraerArchivo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resulIndependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(IndepeOno))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ValorE, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                            .addComponent(resulVarianza)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(resulMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(varianzaResul, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Confiabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(independencia)
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SumaT)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61))))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExtraerArchivo)
                    .addComponent(jLabel8)
                    .addComponent(resulIndependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DatosT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SumaT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(independencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Confiabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resulMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varianzaResul, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addComponent(IndepeOno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(ValorE, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resulVarianza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(145, 145, 145))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExtraerArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtraerArchivoActionPerformed
        // TODO add your handling code here:
        if(seleccion.showDialog(null, "Abrir")==JFileChooser.APPROVE_OPTION){
            archivo=seleccion.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith("txt")){
                    String documento=ExtraerArchivo(archivo);
                    jTextArea1.setText(documento);
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }
        }
        
    }//GEN-LAST:event_ExtraerArchivoActionPerformed

    private void ConfiabilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiabilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfiabilidadActionPerformed

    private void independenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_independenciaActionPerformed
        // TODO add your handling code here:
        Integer nivel;
        int datosObt;
        datosObt = Integer.parseInt(DatosT.getText());
        nivel = Integer.parseInt((String) Confiabilidad.getSelectedItem());
        int longi = datosObt-1;
        int[] Secuencia = new int[longi];
        int conta=0, si=1, an=0,aum=0, anterior=0, siguiente=1;
        while(conta!=longi){
              if(valores[si]<= valores[an]){
                  Secuencia[conta]=0;
              }else if(valores[conta+1]> valores[conta]){
                  Secuencia[conta]=1;
              }
              conta++;
              an++;
              si++;
              
            }
        int a=0;
       while(a!=longi){
           if(siguiente>=longi){
               if(Secuencia[anterior]==Secuencia[siguiente-2]){
                   aum++;
               }else aum++;
               
           }else{
              if(Secuencia[anterior]==Secuencia[siguiente]){    
                  siguiente++;
                  anterior++;
              }else{
                  siguiente++;
                  anterior++;
                  aum++;
              }}
              a++;
            }
       //Calculo de la media del Conjunto
       Double calculoMedia, calculoVarianza, sumat=0.0,totalsu=0.0;
        for (int i = 0; i < total[0]; i++) {
            sumat+=valores[i];  
        }
        calculoMedia = sumat/total[0];
        resulMedia.setText(String.format("%.2f",calculoMedia));
        
        //Calculo de la Varianza del Conjunto
        for (int i = 0; i < total[0]; i++) {
            valoresCu[i]=Math.pow(valores[i], 2);
            totalsu+=valoresCu[i];
        }
        calculoVarianza=totalsu/total[0];
        varianzaResul.setText(String.format("%.2f",calculoVarianza));
        
        
        if(nivel == 90){
                Double valorE, varianza,estadistico;
                valorE = (((2*datosObt)-1)/3.0);
                varianza = ((16*datosObt-29)/90.0);
                estadistico = (aum-valorE)/Math.sqrt(varianza);
                if(estadistico <1.635){
                IndepeOno.setText("LOS NUMEROS DEL CONJUNTO SON INDEPENDIENTES");
                }else IndepeOno.setText("LOS NUMEROS DEL CONJUNTO NO SON INDEPENDIENTES");
                //String indepe = Double.toString(estadistico);
                
                resulIndependencia.setText(String.format("%.3f",Math.abs(estadistico)));
                ValorE.setText(String.format("%.2f",valorE));
                resulVarianza.setText(String.format("%.2f",varianza));
                
                
                
        }else if(nivel == 95){
                Double valorE, varianza,estadistico;
                valorE = (((2*datosObt)-1)/3.0);
                varianza = ((16*datosObt-29)/90.0);
                System.out.println(aum);
                estadistico = (aum-valorE)/Math.sqrt(varianza);
                if(estadistico <1.96){
                IndepeOno.setText("LOS NUMEROS DEL CONJUNTO SON INDEPENDIENTES");
                }else IndepeOno.setText("LOS NUMEROS DEL CONJUNTO NO SON INDEPENDIENTES");
                
                resulIndependencia.setText(String.format("%.3f",Math.abs(estadistico)));
                ValorE.setText(String.format("%.2f",valorE));
                resulVarianza.setText(String.format("%.2f",varianza));
                
                
                
        }else {
                Double valorE, varianza,estadistico;
                valorE = (((2*datosObt)-1)/3.0);
                varianza = ((16*datosObt-29)/90.0);
                estadistico = (aum-valorE)/Math.sqrt(varianza);
                if(estadistico <2.575){
                    IndepeOno.setText("LOS NUMEROS DEL CONJUNTO SON INDEPENDIENTES");
                }else IndepeOno.setText("LOS NUMEROS DEL CONJUNTO NO SON INDEPENDIENTES");
                
                resulIndependencia.setText(String.format("%.3f",Math.abs(estadistico)));
                ValorE.setText(String.format("%.2f",valorE));
                resulVarianza.setText(String.format("%.2f",varianza));
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_independenciaActionPerformed

    
    public String ExtraerArchivo(File archivo){
        String documento="";
        String document="";
        Double sumar,sumand = 0.0;
        int suma=0;
        
        try{
            entrada=new FileInputStream(archivo);
            String ascci;
            BufferedReader br = new BufferedReader(new InputStreamReader(entrada));
            while((ascci=br.readLine())!=null){
                String caracter=(String)ascci;
                documento=caracter;
                sumar = Double.parseDouble(documento);
                valores[suma] = sumar;
                sumand += sumar;
                String[]info=new String[1];
                info[0]=documento;
                model_tabla.addRow(info);
                suma++;
                
            }
            br.close();
        } catch (Exception e) {
        }
        try{
            entrada=new FileInputStream(archivo);
            int ascci;
            while((ascci=entrada.read())!=-1){
                char caracter=(char)ascci;
                document+=caracter;
            }
        } catch (Exception e) {
        }
        total[0]=suma;
        SumaT.setText(String.format("%.2f",sumand));
        String sumado = Integer.toString(suma);
        DatosT.setText(sumado);
        return document;
        
    }
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
            java.util.logging.Logger.getLogger(SoftwareGenerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoftwareGenerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoftwareGenerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoftwareGenerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoftwareGenerador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Confiabilidad;
    private javax.swing.JTextField DatosT;
    private javax.swing.JButton ExtraerArchivo;
    private javax.swing.JTextField IndepeOno;
    private javax.swing.JTextField SumaT;
    private javax.swing.JTextField ValorE;
    private javax.swing.JButton independencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField resulIndependencia;
    private javax.swing.JTextField resulMedia;
    private javax.swing.JTextField resulVarianza;
    private javax.swing.JTable tablaResultados;
    private javax.swing.JTextField varianzaResul;
    // End of variables declaration//GEN-END:variables
}
