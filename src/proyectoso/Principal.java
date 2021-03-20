
package proyectoso;

import proyectoso.Escritorio;
import proyectoso.Inicio;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.netbeans.NativeInterfaceNetBeansHandler;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Usuario
 */
public class Principal{

    
    public static void main(String[] args) {
        NativeInterface.initialize ();
      NativeInterface.open (); 

         JFrame.setDefaultLookAndFeelDecorated(true);

    JDialog.setDefaultLookAndFeelDecorated(true);
         SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenGraphiteGlassSkin");
         SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceWrapperTheme");
      

      
        UIManager.put(SubstanceLookAndFeel.BUTTON_NO_MIN_SIZE_PROPERTY, Boolean.TRUE);
       Inicio empezar= new Inicio();
        empezar.setVisible(true);

        
    }
}
