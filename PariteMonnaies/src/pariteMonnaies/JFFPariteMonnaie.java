/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pariteMonnaies;

import javax.swing.DefaultComboBoxModel;
import metier.Monnaie;
import metier.MonnaiesGerees;
import util.AccesAPI;

/**
 *
 * @author stagiaire
 */
public class JFFPariteMonnaie extends javax.swing.JFrame {

    /**
     * Creates new form JFFPariteMonnaie
     */
    public JFFPariteMonnaie() {
        initComponents();
        initMonnaies();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JFLabel = new javax.swing.JLabel();
        JFLabel1 = new javax.swing.JLabel();
        JFListe = new javax.swing.JComboBox<>();
        JFLabel3 = new javax.swing.JLabel();
        JFListe2 = new javax.swing.JComboBox<>();
        JFBouton = new javax.swing.JButton();
        JFLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JFTexte = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parité entre 2 monnaies");

        JFLabel.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        JFLabel.setText("Recherche du Taux de Parité entre 2 monnaies");

        JFLabel1.setText("Monnaie d'origine :");

        JFListe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JFLabel3.setText("Monnaie de destination: ");

        JFListe2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JFBouton.setText("Rechercher");
        JFBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFBoutonActionPerformed(evt);
            }
        });

        JFLabel4.setText("Parité: ");

        jScrollPane1.setViewportView(JFTexte);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(JFLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(JFLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JFListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(JFLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JFListe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(JFBouton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(JFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(JFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JFLabel1)
                    .addComponent(JFListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFLabel3)
                    .addComponent(JFListe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(JFBouton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JFLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JFBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFBoutonActionPerformed
        int ind1 = JFListe.getSelectedIndex();
        int ind2 = JFListe2.getSelectedIndex();

        String[] monnaiesSelect = {mesMonnaies.getLesMonnaies().get(ind1).getAbreviation(),
            mesMonnaies.getLesMonnaies().get(ind2).getAbreviation()};

        AccesAPI monAccesAPI = new AccesAPI("http://currencies.apps.grandtrunk.net/getlatest", monnaiesSelect);
        if (!monAccesAPI.getReponse().get(0).equals("false")) {
            JFTexte.setText("Un " + listeMonnaies[ind1] + " vaut " + monAccesAPI.getReponse().get(0) + " " + listeMonnaies[ind2]);
       } else {
           JFTexte.setText("Non trouvé");
        }
    }//GEN-LAST:event_JFBoutonActionPerformed

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
            java.util.logging.Logger.getLogger(JFFPariteMonnaie.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFFPariteMonnaie.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFFPariteMonnaie.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFFPariteMonnaie.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFFPariteMonnaie().setVisible(true);
            }
        });
    }
    private void initMonnaies(){
        mesMonnaies = new MonnaiesGerees ();
        listeMonnaies = new String[mesMonnaies.getLesMonnaies().size()];
        int i = 0;
        for (Monnaie uneMonnaie : mesMonnaies.getLesMonnaies()){
            listeMonnaies[i]=uneMonnaie.getLibelle();
            i++;
        }
        JFListe.setModel(new DefaultComboBoxModel(listeMonnaies));
        JFListe.setSelectedIndex(0);
        
        JFListe2.setModel(new DefaultComboBoxModel(listeMonnaies));
        JFListe2.setSelectedIndex(1);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JFBouton;
    private javax.swing.JLabel JFLabel;
    private javax.swing.JLabel JFLabel1;
    private javax.swing.JLabel JFLabel3;
    private javax.swing.JLabel JFLabel4;
    private javax.swing.JComboBox<String> JFListe;
    private javax.swing.JComboBox<String> JFListe2;
    private javax.swing.JTextPane JFTexte;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
MonnaiesGerees mesMonnaies; // Les monnaies gérées
String[] listeMonnaies; // Libellés des monnaies
}
