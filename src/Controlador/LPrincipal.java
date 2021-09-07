
package Controlador;

import vistas.FrmLogin;
import vistas.MDIPrincipal;
import java.sql.Connection;
import javax.swing.JFrame;

public class LPrincipal {
    public static void main(String[]args){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
        //MDIPrincipal miPrincipal = new MDIPrincipal();
        //miPrincipal.setLocationRelativeTo(null);
        FrmLogin miLogin = new FrmLogin();
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
    
}
