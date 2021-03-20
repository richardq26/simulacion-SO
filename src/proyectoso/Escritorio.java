/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso;


import proyectoso.mipanel;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.edisoncor.gui.panel.PanelAvatarChooser;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.edisoncor.gui.util.Avatar;
import org.jvnet.substance.SubstanceLookAndFeel;



public class Escritorio extends javax.swing.JFrame {
 public Image imagenfondo;
 public URL fondo;
  int pregunta;

    public Escritorio() {
        initComponents();
        
        llenarmenu();
       JFrame.setDefaultLookAndFeelDecorated(true); 
       JDialog.setDefaultLookAndFeelDecorated(true);
       
       SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenGraphiteGlassSkin");
         SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceWrapperTheme");
       

      this.setSize(new Dimension(1600,800));
//     
        UIManager.put(SubstanceLookAndFeel.BUTTON_NO_MIN_SIZE_PROPERTY, Boolean.TRUE);
        
        //this.setExtendedState(Escritorio.MAXIMIZED_BOTH);
        
        menu.setVisible(false);
         reloj.setVisible(false);
           computer.setVisible(false);
         
        fecha.setText(fechaactual());
        hora1.setText(horaactual());
        hora2.setText(horaactual());

      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personalizar = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Temas = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        howl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        panelTranslucido1 = new org.edisoncor.gui.panel.PanelTranslucido();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        pantalla = new javax.swing.JPanel();
        panelRound1 = new org.edisoncor.gui.panel.PanelRound();
        buttonAqua1 = new org.edisoncor.gui.button.ButtonAqua();
        jPanel4 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        hora1 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        buttonTask2 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask3 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask4 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask5 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask1 = new org.edisoncor.gui.button.ButtonTask();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        reloj = new org.edisoncor.gui.panel.PanelRound();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        clockFace1 = new org.edisoncor.gui.varios.ClockFace();
        hora2 = new javax.swing.JLabel();
        computer = new org.edisoncor.gui.panel.PanelAvatarChooser();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        jMenuItem1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panta.png"))); // NOI18N
        jMenuItem1.setText("Personalizar Fondo Pantalla");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        personalizar.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jMenuItem2.setText("Nueva Carpeta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        personalizar.add(jMenuItem2);

        Temas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 200, 170));

        howl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                howlMouseClicked(evt);
            }
        });
        howl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/howl3.jpg"))); // NOI18N
        howl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 170));

        jPanel2.add(howl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 200, 170));

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/howl4.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 170));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 200, 170));

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/howl5.jpg"))); // NOI18N
        jLabel5.setText("jLabel3");
        jPanel6.add(jLabel5);

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 200, 170));
        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 200, 170));
        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 200, 170));

        panelTranslucido1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Haga clic en una imagen para convertirla en fondo de escritorio");
        panelTranslucido1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Elejir el fondo de escritorio");
        panelTranslucido1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(panelTranslucido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 60));

        Temas.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 470));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 610));
        setPreferredSize(new java.awt.Dimension(1200, 610));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setMinimumSize(new java.awt.Dimension(1200, 610));

        pantalla.setComponentPopupMenu(personalizar);
        pantalla.setMinimumSize(new java.awt.Dimension(1290, 610));
        pantalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pantallaMouseClicked(evt);
            }
        });
        pantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setColorPrimario(new java.awt.Color(0, 0, 0));
        panelRound1.setColorSecundario(new java.awt.Color(0, 102, 0));
        panelRound1.setGradiente(org.edisoncor.gui.panel.Panel.Gradiente.CENTRAL);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAqua1.setBackground(new java.awt.Color(0, 51, 102));
        buttonAqua1.setForeground(new java.awt.Color(0, 0, 0));
        buttonAqua1.setText("INICIO");
        buttonAqua1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonAqua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAqua1ActionPerformed(evt);
            }
        });
        panelRound1.add(buttonAqua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setOpaque(false);
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, 20));

        hora1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hora1.setForeground(new java.awt.Color(255, 255, 255));
        hora1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.add(hora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 70, 20));

        panelRound1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 160, 40));

        pantalla.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1370, 60));

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 4, true));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Manager.png"))); // NOI18N
        menu.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 90, 80));

        buttonTask2.setForeground(new java.awt.Color(255, 51, 51));
        buttonTask2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/client.png"))); // NOI18N
        buttonTask2.setText("Usuario");
        buttonTask2.setCategoryFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonTask2.setDescription(" ");
        buttonTask2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        menu.add(buttonTask2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 130, 50));

        buttonTask3.setForeground(new java.awt.Color(255, 51, 51));
        buttonTask3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guía (Copiar).png"))); // NOI18N
        buttonTask3.setText("Documentos");
        buttonTask3.setCategoryFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonTask3.setDescription(" ");
        buttonTask3.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        menu.add(buttonTask3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 140, 50));

        buttonTask4.setForeground(new java.awt.Color(255, 51, 51));
        buttonTask4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Gamer.png"))); // NOI18N
        buttonTask4.setText("Juegos");
        buttonTask4.setCategoryFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonTask4.setDescription(" ");
        buttonTask4.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        buttonTask4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask4ActionPerformed(evt);
            }
        });
        menu.add(buttonTask4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 140, 50));

        buttonTask5.setForeground(new java.awt.Color(255, 51, 51));
        buttonTask5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/desktopcomputers.png"))); // NOI18N
        buttonTask5.setText("Equipo");
        buttonTask5.setCategoryFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonTask5.setDescription(" ");
        buttonTask5.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        buttonTask5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask5ActionPerformed(evt);
            }
        });
        menu.add(buttonTask5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 140, 50));

        buttonTask1.setForeground(new java.awt.Color(255, 51, 51));
        buttonTask1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings.png"))); // NOI18N
        buttonTask1.setText("Panel de Control");
        buttonTask1.setCategoryFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonTask1.setDescription(" ");
        buttonTask1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        buttonTask1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask1ActionPerformed(evt);
            }
        });
        menu.add(buttonTask1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 170, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diseño.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        menu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 190, 480));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chrome.png"))); // NOI18N
        jButton2.setText("Navegador");
        jButton2.setActionCommand(" Navegador");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 60));

        pantalla.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 430, 500));

        reloj.setColorSecundario(new java.awt.Color(255, 255, 204));
        reloj.setGradiente(org.edisoncor.gui.panel.Panel.Gradiente.AQUA);
        reloj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        reloj.add(jCalendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        reloj.add(clockFace1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        hora2.setBackground(new java.awt.Color(255, 255, 255));
        hora2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hora2.setForeground(new java.awt.Color(255, 255, 255));
        reloj.add(hora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 100, 20));

        pantalla.add(reloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 420, 250));

        computer.setColorPrimario(new java.awt.Color(0, 153, 153));
        computer.setGradiente(org.edisoncor.gui.panel.Panel.Gradiente.CIRCULAR);
        pantalla.add(computer, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 80, 360, 240));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Down.png"))); // NOI18N
        jButton1.setText("ACCIONES DE APAGADO");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pantalla.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 230, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Google_Chrome.png"))); // NOI18N
        jButton3.setText("Chrome");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pantalla.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 190, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/howl2.jpg"))); // NOI18N
        back.setMinimumSize(new java.awt.Dimension(2000, 768));
        back.setPreferredSize(new java.awt.Dimension(2000, 768));
        pantalla.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 5000, -1));

        jDesktopPane1.add(pantalla);
        pantalla.setBounds(0, -30, 1700, 800);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pantallaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pantallaMouseClicked
        menu.setVisible(false);
         reloj.setVisible(false);
          computer.setVisible(false);
    }//GEN-LAST:event_pantallaMouseClicked
private static Image loadImage(String fileName) {
        try {
            return ImageIO.read(Escritorio.class.getResource(fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    private void buttonTask5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTask5ActionPerformed

    private void buttonTask1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTask1ActionPerformed
private void eventoClicked(java.awt.event.MouseEvent evt) {                 
   String cadena =    computer.getSelectedtitulo();
   String respuesta = "No hay respuesta";
      switch (cadena){
         case "Apagar":
            pregunta=JOptionPane.showConfirmDialog(null, "Desea apagar la computadora?","Apagar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(pregunta==JOptionPane.YES_OPTION){
            this.dispose(); // se cierra el menu principal
           
            System.exit(0);
        }
            respuesta = "";
            break;

      }
     
}
    private void buttonAqua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAqua1ActionPerformed
        menu.setVisible(true);

    }//GEN-LAST:event_buttonAqua1ActionPerformed
public void llenarmenu(){

    List<Avatar> avatars = new ArrayList<Avatar>();
    avatars.add(new Avatar("Apagar", loadImage("/Imagenes/exittt.png")));
    avatars.add(new Avatar("Reiniciar", loadImage("/Imagenes/reset.png")));
    avatars.add(new Avatar("Cerrar Sesion", loadImage("/Imagenes/session.png")));
    avatars.add(new Avatar("Cambiar Usuario", loadImage("/Imagenes/mmv.png")));
    avatars.add(new Avatar("Bloquear", loadImage("/Imagenes/block.png")));
    computer.setAvatars(avatars);
  computer.addMouseListener(new java.awt.event.MouseAdapter() {
           @Override
   public void mouseClicked(java.awt.event.MouseEvent evt) {
      eventoClicked(evt);
     
   }
});
   
    
}

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened
public static String horaactual(){
    Date hora= new Date();
  DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
    return hourFormat.format(hora);
    


}
   
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated
public static String fechaactual(){
    Date fecha= new Date();
    SimpleDateFormat formatofecha= new SimpleDateFormat("yyyy/MM/dd");
    return formatofecha.format(fecha);
    


}
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 this.Temas.setSize(750,490);
        this.Temas.setLocationRelativeTo(null);
        Temas.setVisible(true);        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void howlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_howlMouseClicked
                   
//        fondo= this.getClass().getResource("/Imagenes/calaveras.jpg");  
//        imagenfondo= new ImageIcon(fondo).getImage();
        String path ="/Imagenes/howl3.jpg";  
        URL url = this.getClass().getResource(path);  
        ImageIcon icon = new ImageIcon(url);  
        back.setIcon(icon);  
        
//       back.setIcon(new ImageIcon(getClass().getResource("/Imagenes/calveras.jpg")));
    }//GEN-LAST:event_howlMouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        String path ="/Imagenes/howl4.jpg";  
        URL url = this.getClass().getResource(path);  
        ImageIcon icon = new ImageIcon(url);  
        back.setIcon(icon);  
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        reloj.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       computer.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void buttonTask4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTask4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        new navegador().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new navegador().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        String path ="/Imagenes/howl5.jpg";  
        URL url = this.getClass().getResource(path);  
        ImageIcon icon = new ImageIcon(url);  
        back.setIcon(icon);  
    }//GEN-LAST:event_jPanel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
      NativeInterface.initialize ();
      NativeInterface.open (); //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Temas;
    private javax.swing.JLabel back;
    private org.edisoncor.gui.button.ButtonAqua buttonAqua1;
    private org.edisoncor.gui.button.ButtonTask buttonTask1;
    private org.edisoncor.gui.button.ButtonTask buttonTask2;
    private org.edisoncor.gui.button.ButtonTask buttonTask3;
    private org.edisoncor.gui.button.ButtonTask buttonTask4;
    private org.edisoncor.gui.button.ButtonTask buttonTask5;
    private org.edisoncor.gui.varios.ClockFace clockFace1;
    private org.edisoncor.gui.panel.PanelAvatarChooser computer;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora1;
    private javax.swing.JLabel hora2;
    private javax.swing.JPanel howl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel menu;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelRound panelRound1;
    private org.edisoncor.gui.panel.PanelTranslucido panelTranslucido1;
    private javax.swing.JPanel pantalla;
    private javax.swing.JPopupMenu personalizar;
    private org.edisoncor.gui.panel.PanelRound reloj;
    // End of variables declaration//GEN-END:variables
}
