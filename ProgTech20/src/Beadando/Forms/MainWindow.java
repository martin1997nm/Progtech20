
package Beadando.Forms;

import Beadando.Elektromos.TeslaModel3Gyar;
import Beadando.Elektromos.TeslaGyar;
import Beadando.BelsoEgesu.ToyotaCelicaTSGyar;
import Beadando.BelsoEgesu.ToyotaGyar;
import Beadando.Car;
import Beadando.Factory;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class MainWindow extends javax.swing.JFrame {

    DefaultListModel<String> model;
    int producedCar;
    
  
    public MainWindow() {
        
        model = new DefaultListModel<>();
        jList1 = new JList(model);
        
        initComponents();
        producedCar = 0;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        countProduce = new javax.swing.JTextField();
        delayProduce = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        typeProduce = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        madeProduce = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(model);
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        countProduce.setPreferredSize(new java.awt.Dimension(140, 20));

        delayProduce.setPreferredSize(new java.awt.Dimension(140, 20));

        jButton1.setText("Gyártás indítása");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setText("Legyártani kívánt autók száma");

        jLabel2.setText("késleltetés miliszekundumban");

        jLabel3.setText("Mit gyártson?");

        typeProduce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tesla Model 3", "Tesla Model 3 Performance", "Toyota Celica", "Toyota Celica TS" }));
        typeProduce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeProduceActionPerformed(evt);
            }
        });

        jLabel4.setText("Legyártot példányok:");

        madeProduce.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(madeProduce)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countProduce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(delayProduce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(typeProduce, 0, 1, Short.MAX_VALUE))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countProduce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeProduce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delayProduce, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(madeProduce))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.getAccessibleContext().setAccessibleName("Delay between creating one (in milliseconds)");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
        
        final int produceDelay = delayProduce.getText() != "" ? Integer.parseInt(delayProduce.getText()) : 0;
        final int produceCount = countProduce.getText() != "" ? Integer.parseInt(countProduce.getText()) : 0;
        final int produceType = typeProduce.getSelectedIndex();
           
        if(produceDelay > 0 && produceCount > 0) {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {

                int amount = produceCount;
                Factory factory = null;            

                @Override
                public void run() {

                    switch(produceType) {
                        case 0: factory = new TeslaGyar(); break;
                        case 1: factory = new TeslaModel3Gyar(); break;
                        case 2: factory = new ToyotaGyar(); break;
                        case 3: factory = new ToyotaCelicaTSGyar(); break;
                    }

                    if(factory != null && amount >= 1) {
                        Car newCar = factory.Make();
                        model.add(0, producedCar+". "+newCar.Info());

                        producedCar++;
                        madeProduce.setText(Integer.toString(producedCar));

                        amount--;
                    } else {
                        timer.cancel();
                    }
                }
            }, produceDelay, produceDelay);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void typeProduceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeProduceActionPerformed
       
    }//GEN-LAST:event_typeProduceActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField countProduce;
    private javax.swing.JTextField delayProduce;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel madeProduce;
    private javax.swing.JComboBox<String> typeProduce;
    // End of variables declaration//GEN-END:variables
}
