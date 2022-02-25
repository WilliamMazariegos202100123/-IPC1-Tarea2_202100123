
public class PantallaSecundaria extends javax.swing.JFrame {

    public PantallaSecundaria() {
        initComponents();
        setTitle("Datos de Estudiante");
        setLocationRelativeTo(null);
        setResizable(false);
        name21.setVisible(false);
        name22.setVisible(false);
        ap21.setVisible(false);    
        ap22.setVisible(false);
        w2.setVisible(false);
        ipc.setVisible(false);    
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        name11 = new javax.swing.JLabel();
        name12 = new javax.swing.JLabel();
        ap11 = new javax.swing.JLabel();
        ap12 = new javax.swing.JLabel();
        id11 = new javax.swing.JLabel();
        id12 = new javax.swing.JLabel();
        name21 = new javax.swing.JLabel();
        name22 = new javax.swing.JLabel();
        ap21 = new javax.swing.JLabel();
        ap22 = new javax.swing.JLabel();
        ipc = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        w = new javax.swing.JLabel();
        w2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name11.setFont(new java.awt.Font("Berlin Sans FB", 3, 28)); // NOI18N
        name11.setForeground(new java.awt.Color(255, 255, 0));
        name11.setText("Nombre:");
        jPanel1.add(name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 150, -1));

        name12.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        name12.setForeground(new java.awt.Color(255, 255, 255));
        name12.setText("William ");
        jPanel1.add(name12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 190, 50));

        ap11.setFont(new java.awt.Font("Berlin Sans FB", 3, 28)); // NOI18N
        ap11.setForeground(new java.awt.Color(255, 255, 0));
        ap11.setText("Apellido:");
        jPanel1.add(ap11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 140, -1));

        ap12.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        ap12.setForeground(new java.awt.Color(255, 255, 255));
        ap12.setText("Mazariegos");
        jPanel1.add(ap12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 250, 50));

        id11.setFont(new java.awt.Font("Berlin Sans FB", 3, 28)); // NOI18N
        id11.setForeground(new java.awt.Color(255, 255, 0));
        id11.setText("Carné:");
        jPanel1.add(id11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 140, -1));

        id12.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        id12.setForeground(new java.awt.Color(255, 255, 255));
        id12.setText("202100123");
        jPanel1.add(id12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 250, 50));

        name21.setFont(new java.awt.Font("Berlin Sans FB", 3, 28)); // NOI18N
        name21.setForeground(new java.awt.Color(255, 255, 0));
        name21.setText("Nombres:");
        jPanel1.add(name21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 150, -1));

        name22.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        name22.setForeground(new java.awt.Color(255, 255, 255));
        name22.setText("William Adolfo ");
        jPanel1.add(name22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 330, 50));

        ap21.setFont(new java.awt.Font("Berlin Sans FB", 3, 28)); // NOI18N
        ap21.setForeground(new java.awt.Color(255, 255, 0));
        ap21.setText("Apellidos:");
        jPanel1.add(ap21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 140, -1));

        ap22.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        ap22.setForeground(new java.awt.Color(255, 255, 255));
        ap22.setText("Mazariegos García");
        jPanel1.add(ap22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 350, 50));

        ipc.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        ipc.setForeground(new java.awt.Color(255, 255, 255));
        ipc.setText("IPC1");
        jPanel1.add(ipc, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        combobox.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Datos Estándar", "Datos Completos", " " }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });
        jPanel1.add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 360, 60));

        w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w.png"))); // NOI18N
        jPanel1.add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        w2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/w2.png"))); // NOI18N
        jPanel1.add(w2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        int seleccion=combobox.getSelectedIndex();
        if(seleccion==0){
            name11.setVisible(true);
            name12.setVisible(true);
            ap11.setVisible(true);
            ap12.setVisible(true);
            id11.setVisible(true);
            id12.setVisible(true);
            w.setVisible(true);
            name21.setVisible(false);
            name22.setVisible(false);
            ap21.setVisible(false);
            ap22.setVisible(false);
            w2.setVisible(false);
            ipc.setVisible(false);
        }
        if(seleccion==1){
            name11.setVisible(false);
            name12.setVisible(false);
            ap11.setVisible(false);
            ap12.setVisible(false);
            id11.setVisible(false);
            id12.setVisible(false);
            w.setVisible(false);
            name21.setVisible(true);
            name22.setVisible(true);
            ap21.setVisible(true);
            ap22.setVisible(true);
            w2.setVisible(true);
            id11.setVisible(true);
            id12.setVisible(true);
            ipc.setVisible(true);
        }
    }//GEN-LAST:event_comboboxActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ap11;
    private javax.swing.JLabel ap12;
    private javax.swing.JLabel ap21;
    private javax.swing.JLabel ap22;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JLabel id11;
    private javax.swing.JLabel id12;
    private javax.swing.JLabel ipc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name11;
    private javax.swing.JLabel name12;
    private javax.swing.JLabel name21;
    private javax.swing.JLabel name22;
    private javax.swing.JLabel w;
    private javax.swing.JLabel w2;
    // End of variables declaration//GEN-END:variables
}
