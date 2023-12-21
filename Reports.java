
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thinkpad
 */
public class Reports extends javax.swing.JFrame {

    /**
     * Creates new form Reports
     */
     ArrayList<Medicine> allMedicine = new ArrayList<>();
     ArrayList<Billinginfo> Allrecord = new ArrayList<>();
     
    ArrayList<patient> allpatient = new ArrayList<>();
    
    public Reports() {
        initComponents();
        ReadAllPdata();
        ReadAllMdata();
        ReadAllRdata();
    }
    void ReadAllPdata(){
        try {
            File pfile= new File("pdata.txt");
            Scanner scanner = new Scanner(pfile);
            
            while(scanner.hasNextLine()){
                
                String data = scanner.nextLine();
                
                String[] curData = data.split(";");
                patient patient = new patient();
                patient.setID(Integer.parseInt(curData[0]));
                
                patient.setName(curData[1]);
                
                patient.setAge(Integer.parseInt(curData[2]));
                
                patient.setGender(curData[3]);
                 
                patient.setAddress(curData[4]);
                patient.setContact(curData[5]);
                
                allpatient.add(patient);
                
                
            }
            scanner.close();
        } catch (Exception e) {
        }
    }
    
    void ReadAllMdata(){
        try {
            File pfile= new File("mdata.txt");
            Scanner scanner = new Scanner(pfile);
            
            while(scanner.hasNextLine()){
                
                String data = scanner.nextLine();
                
                String[] curData = data.split(";");
                Medicine medicine = new Medicine();
                medicine.setId(Integer.parseInt(curData[0]));
                
                medicine.setName(curData[1]);
                
                medicine.setSellingprice(Integer.parseInt(curData[2]));
                
                medicine.setBuyingprice(Integer.parseInt(curData[3]));
                 
                medicine.setQuantity(Integer.parseInt(curData[4]));
                medicine.setDescription(curData[5]);
                
                allMedicine.add(medicine);
                
                
            }
            scanner.close();
        } catch (Exception e) {
        }
    }
    
    void ReadAllRdata(){
        try {
            File mfile= new File("record.txt");
            Scanner scanner = new Scanner(mfile);
            
            while(scanner.hasNextLine()){
                
                String data = scanner.nextLine();
                
                String[] curData = data.split(";");
                Billinginfo record = new Billinginfo();
                record.setPatientID(Integer.parseInt(curData[0]));
                record.setFee(Integer.parseInt(curData[1]));
                record.setRecommendation(curData[2]);
                
                
                
                record.setDate(curData[3]);
                
                String[] mlist = curData[4].split(";");
                
                for(int i=0;i<mlist.length-1;i++){
                    record.setMedicineID(Integer.parseInt(mlist[i]));
                }
                
                Allrecord.add(record);
                
                
            }
            scanner.close();
        } catch (Exception e) {
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        precord = new javax.swing.JTextArea();
        getrecord = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Reports");

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        precord.setColumns(20);
        precord.setRows(5);
        jScrollPane1.setViewportView(precord);

        getrecord.setText("Get Record");
        getrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getrecordActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter ID");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getrecord)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)
                        .addGap(126, 126, 126)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(getrecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    
    patient getpData(int cid){
        for(int i=0;i<allpatient.size();i++){
            if(allpatient.get(i).getID()== cid){
                return allpatient.get(i);
            }
        }
        
        return null;
    }
    
    Medicine getMData(int cid){
        for(int i=0;i<allMedicine.size();i++){
            if(allMedicine.get(i).getId()== cid){
                return allMedicine.get(i);
            }
        }
        
        return null;
    }
    private void getrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getrecordActionPerformed
        // TODO add your handling code here:
        
        if(id.getText().equals("")){
            JOptionPane.showMessageDialog(null, "please enter ID");
        }
        else{
            for(int i=0;i<Allrecord.size();i++){
                if(Allrecord.get(i).getPatientID()==Integer.parseInt(id.getText())){
                    precord.append("patient info\n");
                    patient patient = getpData(Allrecord.get(i).getPatientID());
                    precord.append("patient name "+patient.getName()+"\n");
                    precord.append("patient contact "+patient.getContact()+"\n");
                    precord.append("\n All Recommended Medicine");
                    
                    ArrayList<Integer> temp= Allrecord.get(i).getMedicineID();
                    for(int j=0;j<temp.size();j++){
                        Medicine medicine = getMData(temp.get(j));
                        
                        precord.append(medicine.getName()+"\n");
                    }
                    precord.append("\n Date"+Allrecord.get(i).getDate());
                    precord.append("\n Recommendation"+Allrecord.get(i).getRecommendation());
                    precord.append("\n**************************************************************\n");
                    
                }
            }
        }
        
    }//GEN-LAST:event_getrecordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new Home_page().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton getrecord;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea precord;
    // End of variables declaration//GEN-END:variables
}
