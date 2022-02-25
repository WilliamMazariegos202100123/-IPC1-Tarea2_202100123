
import javax.swing.JOptionPane;

public class PantallaPrincipal extends javax.swing.JFrame {
        int contador=3;
        String nombre1="William";
        String password="202100123";
    public PantallaPrincipal() {
        initComponents();
        setTitle("Pantalla de Login");
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        login_box = new javax.swing.JTextField();
        password_box = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        limpiarbt = new javax.swing.JButton();
        entrarbt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_box.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        login_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login_box.setToolTipText("");
        login_box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                login_boxKeyTyped(evt);
            }
        });
        jPanel1.add(login_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 290, 40));

        password_box.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        password_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                password_boxKeyTyped(evt);
            }
        });
        jPanel1.add(password_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 290, 40));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 3, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 140, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 3, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Login");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 90, -1));

        limpiarbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiar.png"))); // NOI18N
        limpiarbt.setBorder(null);
        limpiarbt.setBorderPainted(false);
        limpiarbt.setContentAreaFilled(false);
        limpiarbt.setFocusPainted(false);
        limpiarbt.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiar2.png"))); // NOI18N
        limpiarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarbtActionPerformed(evt);
            }
        });
        jPanel1.add(limpiarbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, -1, -1));

        entrarbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entrar.png"))); // NOI18N
        entrarbt.setBorder(null);
        entrarbt.setBorderPainted(false);
        entrarbt.setContentAreaFilled(false);
        entrarbt.setFocusPainted(false);
        entrarbt.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/entrar2.png"))); // NOI18N
        entrarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarbtActionPerformed(evt);
            }
        });
        jPanel1.add(entrarbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
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
    PantallaSecundaria PantallaSecundaria=new PantallaSecundaria();
    private void entrarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarbtActionPerformed
        String condicionlogin=login_box.getText();
        char[] condicionpass=password_box.getPassword();
        String pass = new String(condicionpass);
        
        if(condicionlogin.equals(nombre1) && pass.equals(password)){
           PantallaSecundaria.setVisible(true);
           this.setVisible(false);
           JOptionPane.showMessageDialog(null, "Estos son los datos del Usuario","Bienvenido :D",JOptionPane.INFORMATION_MESSAGE, null);
       }else{
            JOptionPane.showMessageDialog(null, "El nombre de Usuario o Contraseña son Incorrectos","¡ERROR!",JOptionPane.INFORMATION_MESSAGE, null);
            if(contador==0){
                JOptionPane.showMessageDialog(null, "Lo sentimos, no puede ingresar","BYE",JOptionPane.WARNING_MESSAGE, null);
                this.dispose();
                PantallaSecundaria.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Tiene "+contador+" intentos para que el programa se cierre","¡Contador de Intentos!",JOptionPane.INFORMATION_MESSAGE, null);
                contador=contador-1;
                login_box.setText("");
                password_box.setText("");
             }
        }
        
            
    }//GEN-LAST:event_entrarbtActionPerformed

    private void password_boxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_boxKeyTyped
        char tecla= evt.getKeyChar();
        if(tecla<'0' || tecla>'9') evt.consume();
    }//GEN-LAST:event_password_boxKeyTyped

    private void login_boxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_boxKeyTyped
        char tecla= evt.getKeyChar();
        if((tecla<'a' || tecla>'z') && (tecla<'A' || tecla>'Z')) evt.consume();
    }//GEN-LAST:event_login_boxKeyTyped

    private void limpiarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtActionPerformed
        login_box.setText("");
        password_box.setText("");
    }//GEN-LAST:event_limpiarbtActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrarbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiarbt;
    private javax.swing.JTextField login_box;
    private javax.swing.JPasswordField password_box;
    // End of variables declaration//GEN-END:variables
}
