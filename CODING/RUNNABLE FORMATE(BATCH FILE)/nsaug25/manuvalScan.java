

package nsaug25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;


public class manuvalScan extends javax.swing.JFrame implements Runnable {

    int fileLen;
    int vf=0;
    File tfile,fs;
    static List shortListDB;
    static List longListDB;
    List infectFIles;
    Map fileTrans;
    File frf;
    Collection<File> dec20c = new ArrayList<File>();
     Collection<File> dec20d = new ArrayList<File>();
      Collection<File> dec20e = new ArrayList<File>();

    public manuvalScan()
            
    {
        initComponents();
        System.out.println("Man start 1");
         shortListDB=new ArrayList();
         shortListDB=DBpartition.getShort();
         //System.out.println("sp:"+shortListDB);
         longListDB=new ArrayList();
         longListDB=DBpartition.getLong();
         System.out.println("Man start 2");

//         final Collection<File> all = new ArrayList<File>();
//        //addFilesRecursively(new File("d:\\server"), all);    Dec 20
//        addFilesRecursively(new File(gsi+"\\"), all);
         String cc="F:\\";
         String cd="D:\\";
         String ce="E:\\";

         //addFilesRecursively(new File(cc+"\\"), all);
         //addFilesRecursively(new File(cd+"\\"), all);
         //addFilesRecursively(new File(ce+"\\"), all);


         File rf[]=File.listRoots();
         String v="C:\\";
//         Object oo[];
//         oo=rf;
//         String gf[]=(String[]) oo;

//         for(int i=0;i<rf.length;i++)
//         {
//             if(rf.equals("A:/"))
//             {
//                 combo1.addItem("A:");
//
//             }
//             else
//             {
//                 System.out.println("NOt");
//             }
//            // combo1.addItem(rf[i]);
//         }

//         for(int i=0;i<gf.length;i++)
//         {
//             gf=gf[i].split("\"");
//             System.out.println("AA:"+gf[i]);
//         }


//         Collection<File> dec20 = new ArrayList<File>();
            dec20c=AV_mainpage.allc22;
            dec20d=AV_mainpage.allD22;
            dec20e=AV_mainpage.allE22;

            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//            Iterator di=dec20.iterator();
//            while(di.hasNext())
//            {
//
//            }
            //System.out.println(dec20);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");



        jLabel7.setVisible(false);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        combo1 = new javax.swing.JComboBox();
        Scan_Button = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(93, 135, 199));

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manual Scan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(93, 135, 199));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(93, 135, 199));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "F:", "D:", "E:" }));

        Scan_Button.setText("Scan");
        Scan_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scan_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Scan_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(Scan_Button)
                .addGap(36, 36, 36))
        );

        jPanel5.setBackground(new java.awt.Color(93, 135, 199));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Refresh");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButton4)
                .addGap(113, 113, 113))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(93, 135, 199));

        jLabel2.setText("Files            :");

        jLabel1.setText("0");

        jLabel3.setText("No of Files  :");

        jLabel5.setText("Deteceted :");

        jLabel4.setText("0");

        jLabel6.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

//        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("D:/Documents and Settings/SPIRO12/Desktop/FULL BACKUP TO DIVA/ITJNS04/CODING/RUNNABLE FORMATE(BATCH FILE)/nsaug25/image/srchanim.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1001, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(459, 459, 459))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(1068, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(639, 639, 639))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(684, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Scan_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scan_ButtonActionPerformed
        // TODO add your handling code here:
        image++;


         gsi= (String) combo1.getSelectedItem();
        // frf=(File) combo1.getSelectedItem();
//         String sf="";
//        if(frf.equals("A:\\"))
//                 {
//                    sf="A:\\";
//                     System.out.println("sfff:"+sf);
//                 }


        System.out.println(gsi);
        scan();
//        methodScan();
//        JOptionPane.showMessageDialog(rootPane,"NUMBER VIRUS FOUND:"+vf );
//      JOptionPane.showMessageDialog(rootPane," VIRUS ARE SAFELY MOVED TO QUARANTINE");
        if(image>=1)
        {
            jLabel7.setVisible(true);
        }
        
    }//GEN-LAST:event_Scan_ButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        Qurantine obj1=new Qurantine();
        obj1.Qt();
        obj1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

public void run()
 {
    if(gsi.equals("C:"))
    {

           try
        {
               System.out.println("scan waiting");
       final Collection<File> all = new ArrayList<File>();
      
            System.out.println("Scan started");
       
         infectFIles=new ArrayList();
          fileTrans=new TreeMap();
           InputStream inStream = null;
           OutputStream outStream = null;
//            
            Iterator itrdec20=dec20c.iterator();
             String buff=null;
             String getFile=null;            
             String fname="";
             int mid;            
             while(itrdec20.hasNext())
            {
                  Thread.sleep(1);                
                    fs=(File) itrdec20.next();
                    jLabel1.setText(fs+"");
                  tfile=fs.getAbsoluteFile();
                  buff=tfile.getName();
                  if(buff.contains("."))
                  {
                    mid= buff.lastIndexOf(".");
                    if(mid!=0)
                    {
                    fname=buff.substring(0,mid);
                    fileLen=fname.length();
                      if(fileLen<=20)
                        {
                             if(shortListDB.contains(fname))
                             {
                                 vf++;
                                 infectFIles.add(fname);
                                 System.out.println("file Name:"+buff);
                                                                    try
                                                                    {
                                                                     FileInputStream fis=new FileInputStream(fs);
                                                                     byte buffer[]=new byte[fis.available()];
                                                                     fis.read(buffer);
                                                                     String fc=new String(buffer);
//
                                                                     FileOutputStream fos=new FileOutputStream("D:\\Quarantine\\"+buff);
//
                                                                     fos.write(buffer);
                                                                      fis.close();
                                                                      fos.close();
                                                                      fs.delete();
                                                                    }
                                                                    catch(Exception e)
                                                                    {
                                                                        e.printStackTrace();
                                                                    }

                             }
                        }
                        else
                        {
//
                             if(longListDB.contains(fname))
                             {
                                 vf++;
                                  infectFIles.add(fname);
                                   System.out.println("file Name:"+buff);
                                   try
                                                                    {
//
                                                                    FileInputStream fis=new FileInputStream(fs);
                                                                     byte buffer[]=new byte[fis.available()];
                                                                     fis.read(buffer);
                                                                     String fc=new String(buffer);
                                                                     FileOutputStream fos=new FileOutputStream("D:\\Quarantine\\"+buff);
//
                                                                     fos.write(buffer);
                                                                     fis.close();
                                                                     fos.close();
                                                                     fs.delete();
//
                                                                     }
                                                                    catch(Exception e)
                                                                    {
                                                                        e.printStackTrace();
                                                                    }
                             }

                        }
                }
//
                  }
                    fileCount++;
                      jLabel6.setText(vf+"");
                     jLabel4.setText(fileCount+"");
             }
             System.out.println("Infected files::"+vf);
            JOptionPane.showMessageDialog(rootPane,"NUMBER VIRUS FOUND:"+vf );
             vf=0;

        }
      catch(Exception e)
      {
        e.printStackTrace();
      }
                                                                                                        image=0;
                                                                                                        if(image==0)
                                                                                                        {
                                                                                                            jLabel7.setVisible(false);
                                                                                                        }
      Iterator infectItr=infectFIles.iterator();
      while(infectItr.hasNext())
      {
          String IF=(String) infectItr.next();
          System.out.println(IF);
      }
      JOptionPane.showMessageDialog(rootPane," VIRUS ARE SAFELY MOVED TO QUARANTINE");
      System.out.println("----------------------------------------------------------------------------------------");
    }


     else if(gsi.equals("D:"))
    {

           try
        {
               System.out.println("scan waiting");
       final Collection<File> all = new ArrayList<File>();

            System.out.println("Scan started");

         infectFIles=new ArrayList();
          fileTrans=new TreeMap();
           InputStream inStream = null;
           OutputStream outStream = null;
//
            Iterator itrdec20=dec20d.iterator();
             String buff=null;
             String getFile=null;
             String fname="";
             int mid;
             while(itrdec20.hasNext())
            {
                  Thread.sleep(1);
                    fs=(File) itrdec20.next();
                    jLabel1.setText(fs+"");
                  tfile=fs.getAbsoluteFile();
                  buff=tfile.getName();
                  if(buff.contains("."))
                  {
                    mid= buff.lastIndexOf(".");
                    if(mid!=0)
                    {
                    fname=buff.substring(0,mid);
                    fileLen=fname.length();
                      if(fileLen<=20)
                        {
                             if(shortListDB.contains(fname))
                             {
                                 vf++;
                                 infectFIles.add(fname);
                                 System.out.println("file Name:"+buff);
                                                                    try
                                                                    {
                                                                     FileInputStream fis=new FileInputStream(fs);
                                                                     byte buffer[]=new byte[fis.available()];
                                                                     fis.read(buffer);
                                                                     String fc=new String(buffer);
//
                                                                     FileOutputStream fos=new FileOutputStream("D:\\Quarantine\\"+buff);
//
                                                                     fos.write(buffer);
                                                                      fis.close();
                                                                      fos.close();
                                                                      fs.delete();
                                                                    }
                                                                    catch(Exception e)
                                                                    {
                                                                        e.printStackTrace();
                                                                    }

                             }
                        }
                        else
                        {
//
                             if(longListDB.contains(fname))
                             {
                                 vf++;
                                  infectFIles.add(fname);
                                   System.out.println("file Name:"+buff);
                                   try
                                                                    {
//
                                                                    FileInputStream fis=new FileInputStream(fs);
                                                                     byte buffer[]=new byte[fis.available()];
                                                                     fis.read(buffer);
                                                                     String fc=new String(buffer);
                                                                     FileOutputStream fos=new FileOutputStream("D:\\Quarantine\\"+buff);
//
                                                                     fos.write(buffer);
                                                                     fis.close();
                                                                     fos.close();
                                                                     fs.delete();
//
                                                                     }
                                                                    catch(Exception e)
                                                                    {
                                                                        e.printStackTrace();
                                                                    }
                             }

                        }
                }
//
                  }
                    fileCount++;
                      jLabel6.setText(vf+"");
                     jLabel4.setText(fileCount+"");
             }
             System.out.println("Infected files::"+vf);
            JOptionPane.showMessageDialog(rootPane,"NUMBER VIRUS FOUND:"+vf );
             vf=0;

        }
      catch(Exception e)
      {
        e.printStackTrace();
      }
                                                                                                        image=0;
                                                                                                        if(image==0)
                                                                                                        {
                                                                                                            jLabel7.setVisible(false);
                                                                                                        }
      Iterator infectItr=infectFIles.iterator();
      while(infectItr.hasNext())
      {
          String IF=(String) infectItr.next();
          System.out.println(IF);
      }
      JOptionPane.showMessageDialog(rootPane," VIRUS ARE SAFELY MOVED TO QUARANTINE");
      System.out.println("----------------------------------------------------------------------------------------");
    }


    if(gsi.equals("E:"))
    {

           try
        {
               System.out.println("scan waiting");
       final Collection<File> all = new ArrayList<File>();

            System.out.println("Scan started");

         infectFIles=new ArrayList();
          fileTrans=new TreeMap();
           InputStream inStream = null;
           OutputStream outStream = null;
//
            Iterator itrdec20=dec20e.iterator();
             String buff=null;
             String getFile=null;
             String fname="";
             int mid;
             while(itrdec20.hasNext())
            {
                  Thread.sleep(1);
                    fs=(File) itrdec20.next();
                    jLabel1.setText(fs+"");
                  tfile=fs.getAbsoluteFile();
                  buff=tfile.getName();
                  if(buff.contains("."))
                  {
                    mid= buff.lastIndexOf(".");
                    if(mid!=0)
                    {
                    fname=buff.substring(0,mid);
                    fileLen=fname.length();
                      if(fileLen<=20)
                        {
                             if(shortListDB.contains(fname))
                             {
                                 vf++;
                                 infectFIles.add(fname);
                                 System.out.println("file Name:"+buff);
                                                                    try
                                                                    {
                                                                     FileInputStream fis=new FileInputStream(fs);
                                                                     byte buffer[]=new byte[fis.available()];
                                                                     fis.read(buffer);
                                                                     String fc=new String(buffer);
//
                                                                     FileOutputStream fos=new FileOutputStream("D:\\Quarantine\\"+buff);
//
                                                                     fos.write(buffer);
                                                                      fis.close();
                                                                      fos.close();
                                                                      fs.delete();
                                                                    }
                                                                    catch(Exception e)
                                                                    {
                                                                        e.printStackTrace();
                                                                    }

                             }
                        }
                        else
                        {
//
                             if(longListDB.contains(fname))
                             {
                                 vf++;
                                  infectFIles.add(fname);
                                   System.out.println("file Name:"+buff);
                                   try
                                                                    {
//
                                                                    FileInputStream fis=new FileInputStream(fs);
                                                                     byte buffer[]=new byte[fis.available()];
                                                                     fis.read(buffer);
                                                                     String fc=new String(buffer);
                                                                     FileOutputStream fos=new FileOutputStream("D:\\Quarantine\\"+buff);
//
                                                                     fos.write(buffer);
                                                                     fis.close();
                                                                     fos.close();
                                                                     fs.delete();
//
                                                                     }
                                                                    catch(Exception e)
                                                                    {
                                                                        e.printStackTrace();
                                                                    }
                             }

                        }
                }
//
                  }
                    fileCount++;
                      jLabel6.setText(vf+"");
                     jLabel4.setText(fileCount+"");
             }
             System.out.println("Infected files::"+vf);
            JOptionPane.showMessageDialog(rootPane,"NUMBER VIRUS FOUND:"+vf );
             vf=0;

        }
      catch(Exception e)
      {
        e.printStackTrace();
      }
                                                                                                        image=0;
                                                                                                        if(image==0)
                                                                                                        {
                                                                                                            jLabel7.setVisible(false);
                                                                                                        }
      Iterator infectItr=infectFIles.iterator();
      while(infectItr.hasNext())
      {
          String IF=(String) infectItr.next();
          System.out.println(IF);
      }
      JOptionPane.showMessageDialog(rootPane," VIRUS ARE SAFELY MOVED TO QUARANTINE");
      System.out.println("----------------------------------------------------------------------------------------");
    }







    }
    

 private static void addFilesRecursively(File file, Collection<File> all)
    {
     
    final File[] children = file.listFiles();
    if (children != null)
    {
        for (File child : children)
        {
            all.add(child);
           // Thread.sleep(1000);
            //System.out.println(all);
            addFilesRecursively(child, all);
            //fileCount++;
        }
    }
        }


   public long BH(String str)
   {
      int b     = 378551;
      int a     = 63689;
      long hash = 0;

      for(int i = 0; i < str.length(); i++)
      {
         hash = hash * a + str.charAt(i);
         a    = a * b;
      }

      return hash;
   }



   public long BH2(String str)
   {
      long hash = 1315423911;

      for(int i = 0; i < str.length(); i++)
      {
         hash ^= ((hash << 5) + str.charAt(i) + (hash >> 2));
      }

      return hash;
   }



   public long BH3(String str)
   {
      long BitsInUnsignedInt = (long)(4 * 8);
      long ThreeQuarters     = (long)((BitsInUnsignedInt  * 3) / 4);
      long OneEighth         = (long)(BitsInUnsignedInt / 8);
      long HighBits          = (long)(0xFFFFFFFF) << (BitsInUnsignedInt - OneEighth);
      long hash              = 0;
      long test              = 0;

      for(int i = 0; i < str.length(); i++)
      {
         hash = (hash << OneEighth) + str.charAt(i);

         if((test = hash & HighBits)  != 0)
         {
            hash = (( hash ^ (test >> ThreeQuarters)) & (~HighBits));
         }
      }

      return hash;
   }



   public long AC(String str)
   {
      long hash = 0;
      long x    = 0;

      for(int i = 0; i < str.length(); i++)
      {
         hash = (hash << 4) + str.charAt(i);

         if((x = hash & 0xF0000000L) != 0)
         {
            hash ^= (x >> 24);
         }
         hash &= ~x;
      }

      return hash;
   }



   public long AC1(String str)
   {
      long seed = 131; // 31 131 1313 13131 131313 etc..
      long hash = 0;

      for(int i = 0; i < str.length(); i++)
      {
         hash = (hash * seed) + str.charAt(i);
      }

      return hash;
   }



   public long AC2(String str)
   {
      long hash = 0;

      for(int i = 0; i < str.length(); i++)
      {
         hash = str.charAt(i) + (hash << 6) + (hash << 16) - hash;
      }

      return hash;
   }



   public long DJBHash(String str)
   {
      long hash = 5381;

      for(int i = 0; i < str.length(); i++)
      {
         hash = ((hash << 5) + hash) + str.charAt(i);
      }

      return hash;
   }



   public long DEKHash(String str)
   {
      long hash = str.length();

      for(int i = 0; i < str.length(); i++)
      {
         hash = ((hash << 5) ^ (hash >> 27)) ^ str.charAt(i);
      }

      return hash;
   }



   public long BPHash(String str)
   {
      long hash = 0;

      for(int i = 0; i < str.length(); i++)
      {
         hash = hash << 7 ^ str.charAt(i);
      }

      return hash;
   }



   public long FNVHash(String str)
   {
      long fnv_prime = 0x811C9DC5;
      long hash = 0;

      for(int i = 0; i < str.length(); i++)
      {
      hash *= fnv_prime;
      hash ^= str.charAt(i);
      }

      return hash;
   }



   public long APHash(String str)
   {
      long hash = 0xAAAAAAAA;

      for(int i = 0; i < str.length(); i++)
      {
         if ((i & 1) == 0)
         {
            hash ^= ((hash << 7) ^ str.charAt(i) * (hash >> 3));
         }
         else
         {
            hash ^= (~((hash << 11) + str.charAt(i) ^ (hash >> 5)));
         }
      }

      return hash;
   }


public static void im()
    {

//    if(image==0)
    {
    jLabel7.setVisible(false);
    }
    }

//public void virusDisp()
//    {
//     JOptionPane.showMessageDialog(rootPane,"NUMBER VIRUS FOUND:"+vf );
//      JOptionPane.showMessageDialog(rootPane," VIRUS ARE SAFELY MOVED TO QUARANTINE");
//    }



public void scan()
    {
    th=new Thread(this);
    th.start();
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//               manuvalScan obj= new manuvalScan();
//               obj.scan();
               
//               obj.setVisible(true);
//               obj.im();
                manuvalScan.im();
                manuvalScan obj1=new manuvalScan();
//                obj1.virusDisp();
               

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Scan_Button;
    private javax.swing.JComboBox combo1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables

    Thread th;
     File f;
     String gsi;
     final Collection<File> all = new ArrayList<File>();
//     File fs;
     int fileCount=0;
     static int image=0;

}
