package nsaug25;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

public class AV_mainpage extends javax.swing.JFrame implements Runnable {

    public AV_mainpage() {
        initComponents();
        shortListDB = new ArrayList();
        shortListDB = DBpartition.getShort();
        longListDB = new ArrayList();
        longListDB = DBpartition.getLong();


        getFileClassC ogfc = new getFileClassC();
        Thread ulc = new Thread(ogfc);

        getFileClassD ogfd = new getFileClassD();
        Thread uld = new Thread(ogfd);

        getFileClassE ogfe = new getFileClassE();
        Thread ule = new Thread(ogfe);




        ulc.start();
        uld.start();
        ule.start();


//          int checkbox=Option.a;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        scan_ = new javax.swing.JButton();
        Quarantine_ = new javax.swing.JButton();
        Option_ = new javax.swing.JButton();
        UpdateSignature_ = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Start_Buttton_ = new javax.swing.JButton();
        PauseButton_ = new javax.swing.JButton();
        Browse_ = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jButton10 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(94, 135, 200));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(93, 135, 199));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(null);

        scan_.setText("Scan");
        scan_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scan_ActionPerformed(evt);
            }
        });
        jPanel1.add(scan_);
        scan_.setBounds(41, 71, 120, 23);

        Quarantine_.setText("Quarantine");
        Quarantine_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quarantine_ActionPerformed(evt);
            }
        });
        jPanel1.add(Quarantine_);
        Quarantine_.setBounds(41, 180, 120, 23);

        Option_.setText("Option");
        Option_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option_ActionPerformed(evt);
            }
        });
        jPanel1.add(Option_);
        Option_.setBounds(41, 292, 120, 23);

        UpdateSignature_.setText("Update Signature");
        UpdateSignature_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateSignature_ActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateSignature_);
        UpdateSignature_.setBounds(44, 391, 117, 23);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(30, 240, 200, 480);

        jPanel3.setBackground(new java.awt.Color(93, 135, 199));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(null);
        jPanel2.add(jPanel3);
        jPanel3.setBounds(260, 100, 970, 110);

        jPanel7.setBackground(new java.awt.Color(93, 135, 199));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel7.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(93, 135, 199));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Scanning Status"));
        jPanel5.setLayout(null);

        jLabel1.setText("Scanned Files    (s)        :");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(15, 51, 170, 14);

        jLabel2.setText("Object Detected             :");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(15, 76, 170, 14);

        jLabel5.setText(" 0");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(230, 50, 60, 14);

        jLabel6.setText("0");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(230, 70, 100, 14);

        jLabel8.setText("0");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(232, 30, 390, 15);

        jLabel3.setText("Files                              :");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(29, 30, 170, 14);

        jPanel7.add(jPanel5);
        jPanel5.setBounds(54, 186, 880, 120);

        jPanel6.setBackground(new java.awt.Color(93, 135, 199));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Manuval Scan"));
        jPanel6.setLayout(null);

        Start_Buttton_.setText("Start");
        Start_Buttton_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_Buttton_ActionPerformed(evt);
            }
        });
        jPanel6.add(Start_Buttton_);
        Start_Buttton_.setBounds(147, 40, 130, 23);

        PauseButton_.setText("Pause");
        PauseButton_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseButton_ActionPerformed(evt);
            }
        });
        jPanel6.add(PauseButton_);
        PauseButton_.setBounds(291, 40, 120, 23);

        Browse_.setText("Browse");
        Browse_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse_ActionPerformed(evt);
            }
        });
        jPanel6.add(Browse_);
        Browse_.setBounds(610, 30, 220, 50);

        jButton1.setText("Resume");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);
        jButton1.setBounds(430, 40, 100, 23);

        jPanel7.add(jPanel6);
        jPanel6.setBounds(54, 323, 883, 109);

        jPanel4.setBackground(new java.awt.Color(93, 135, 199));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jButton9.setText("Object Name");

        ta1.setBackground(new java.awt.Color(93, 135, 199));
        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        jButton10.setText("Directory Location");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanel4);
        jPanel4.setBounds(54, 29, 883, 118);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(260, 240, 970, 480);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1410, 780);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Log File");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Scan");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Scan File");
        jMenu2.add(jMenuItem3);

        jMenuItem9.setText("Manuval scan");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Process");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Show Process");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("window");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("System config");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Task manager");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Register ");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);
        jMenu4.add(jSeparator2);

        jMenuItem8.setText("Control panel");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Browse_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse_ActionPerformed
        // TODO add your handling code here:
//        Browse();
        manuvalScan objs = new manuvalScan();
//   objs.scan();
        objs.setVisible(true);
		//objs.setSize(400,400);

    }//GEN-LAST:event_Browse_ActionPerformed

    public void Browse() {
        FileDialog fd = new FileDialog(this);
        fd.setVisible(true);
        String s1 = fd.getDirectory();
//        String s2=fd.getFile();
        String s3 = s1;
    }

    private void UpdateSignature_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateSignature_ActionPerformed
        // TODO add your handling code here:
        fr();
    }//GEN-LAST:event_UpdateSignature_ActionPerformed

    private void Option_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option_ActionPerformed
        // TODO add your handling code here:
        Option ob1 = new Option();
        ob1.setVisible(true);
    }//GEN-LAST:event_Option_ActionPerformed

    private void scan_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scan_ActionPerformed
        // TODO add your handling code here:

        scanServer();
    }//GEN-LAST:event_scan_ActionPerformed

    public void scanServer() {
        int checkbox = Option.a;
        System.out.println("Ck val:" + checkbox);
        try {
            final Collection<File> all = new ArrayList<File>();
            addFilesRecursively(new File("d:\\server"), all);
//         shortListDB=new ArrayList();
//         shortListDB=DBpartition.getShort();
//         longListDB=new ArrayList();
//         longListDB=DBpartition.getLong();
            infectFIles = new ArrayList();
//            Thread.sleep(500);


            String buff = null;
            Iterator itr = all.iterator();
            String fname = "";
            int mid;


            while (itr.hasNext()) {
                Thread.sleep(10);
                fs = (File) itr.next();
                ta1.append(fs + "\n");
                jLabel8.setText(fs + "");
                tfile = fs.getAbsoluteFile();
                buff = tfile.getName();
                if (buff.contains(".")) {
                    mid = buff.lastIndexOf(".");
                    fname = buff.substring(0, mid);
                    fileLen = fname.length();
                    if (fileLen <= 20) {
//
                        if (shortListDB.contains(fname)) {
                            vf++;
                            infectFIles.add(fname);


                            try {
                                FileInputStream fis = new FileInputStream(fs);
                                System.out.println("Fs: " + fs);
                                byte buffer[] = new byte[fis.available()];
                                fis.read(buffer);
                                String fc = new String(buffer);
                                fis.close();
//                                    int checkbox=Option.a;
                                if (checkbox == 1) {
                                    // FileOutputStream fos=new FileOutputStream("D:\\cb\\"+buff);
                                    FileOutputStream fos = new FileOutputStream("D:\\RECYCLER\\" + buff);

                                    fos.write(buffer);
                                    System.out.println("Before delete");

                                    fos.close();

                                    if (fs.delete()) {
                                        System.out.println("file is deleted");
                                    } else {
                                        System.out.println("else");
                                    }
                                    System.out.println("After delete");

                                } else {
                                    FileOutputStream fos = new FileOutputStream("D:\\Quarantine\\" + buff);
                                    fos.write(buffer);

                                    System.out.println("Before delete");

                                    fos.close();

                                    if (fs.delete()) {
                                        System.out.println("file is deleted");
                                    } else {
                                        System.out.println("else");
                                    }
                                    System.out.println("After delete");
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
//
                        if (longListDB.contains(fname)) {
                            vf++;
                            infectFIles.add(fname);
                            try {
                                FileInputStream fis = new FileInputStream(fs);
                                System.out.println("Fs: " + fs);
                                byte buffer[] = new byte[fis.available()];
                                fis.read(buffer);
                                String fc = new String(buffer);
                                fis.close();

                                if (checkbox == 1) {
                                    //FileOutputStream fos=new FileOutputStream("D:\\cb\\"+buff);
                                    FileOutputStream fos = new FileOutputStream("D:\\RECYCLER\\" + buff);
                                    fos.write(buffer);
                                    System.out.println("Before delete");

                                    fos.close();

                                    if (fs.delete()) {
                                        System.out.println("file is deleted");
                                    } else {
                                        System.out.println("else");
                                    }
                                    System.out.println("After delete");

                                } else {
                                    FileOutputStream fos = new FileOutputStream("D:\\Quarantine\\" + buff);
                                    fos.write(buffer);


                                    System.out.println("Before delete");


                                    fos.close();

                                    if (fs.delete()) {
                                        System.out.println("file is deleted");
                                    } else {
                                        System.out.println("else");
                                    }
                                    System.out.println("After delete");
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                    }
//
                }
                fileCount++;
                jLabel6.setText(vf + "");

                jLabel5.setText(fileCount + "");

            }





            System.out.println("Infected files::" + vf);
            JOptionPane.showMessageDialog(rootPane, "NUMBER VIRUS FOUND:" + vf);
            if (vf != 0) //       JOptionPane.showMessageDialog(rootPane,"NUMBER VIRUS FOUND:"+vf );
            {
                if (checkbox == 1) {
                    JOptionPane.showMessageDialog(rootPane, " VIRUS ARE SAFELY DELETED");
                } else {
                    JOptionPane.showMessageDialog(rootPane, " VIRUS ARE SAFELY MOVED TO QUARANTINE");
                }
            }
            vf = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }




        File directory = new File("D:\\Server");

// Get all files in directory

//                                                                                            File[] files = directory.listFiles();
//                                                                                      for (File file : files)
//                                                                                       {
//                                                                                            // Delete each file
//
//                                                                                            if (!file.delete())
//                                                                                            {
//                                                                                            // Failed to delete file
//
//                                                                                            System.out.println("Failed to delete "+file);
//                                                                                        }
//                                                                                                    }
        Iterator infectItr = infectFIles.iterator();
        while (infectItr.hasNext()) {
            String IF = (String) infectItr.next();
//          System.out.println(IF);
//          ta1.append(fs+"\n");
        }
        System.out.println("vf before if:" + vf);
//      if(vf!=0)
////       JOptionPane.showMessageDialog(rootPane,"NUMBER VIRUS FOUND:"+vf );
//      JOptionPane.showMessageDialog(rootPane," VIRUS ARE SAFELY MOVED TO QUARANTINE");
        System.out.println("----------------------------------------------------------------------------------------");


    }
    int fileLen;
    int vf = 0;
    File tfile, fs;

    public void getFileDiva() {
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


    public void findMatch() {
//        Set s=map.entrySet();
        Iterator itr = addVnToList.iterator();
        while (itr.hasNext()) {
            File vn = (File) itr.next();
            CheckMethod(vn);

        }
        JOptionPane.showMessageDialog(rootPane, " No of files Infected:" + countVal);

    }

    public void CheckMethod(File file) {
        File fileVar = file;
        Iterator itr = fileInServerList.iterator();
        while (itr.hasNext()) {
            File tempFile = (File) itr.next();
            if (tempFile == fileVar) {
                countVal++;
            }
        }


    }

    private void Quarantine_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quarantine_ActionPerformed
        // TODO add your handling code here:
        Qurantine objQ = new Qurantine();
        objQ.Qt();
        objQ.setVisible(true);


    }//GEN-LAST:event_Quarantine_ActionPerformed

    public void sysconfig() {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("msconfig");
            p.waitFor();
        } catch (Exception e) {
            System.out.print("Fail to Open Notepad Opened");
        }
        System.out.print("Notepad Closed" + p.exitValue());

    }

    public void TaskManager() {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("taskmgr");
            p.waitFor();
        } catch (Exception e) {
            System.out.print("Fail to Open Notepad Opened");
        }
        System.out.print("Notepad Closed" + p.exitValue());

    }

    public void Register() {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("regedit");
            p.waitFor();
        } catch (Exception e) {
            System.out.print("Fail to Open Notepad Opened");
        }
        System.out.print("Notepad Closed" + p.exitValue());

    }

    public void Controlpanel() {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("control panel");
            p.waitFor();
        } catch (Exception e) {
            System.out.print("Fail to Open Notepad Opened");
        }
        System.out.print("Notepad Closed" + p.exitValue());

    }

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
//        // TODO add your handling code here:
//
//
//     List<String> processes = listRunningProcesses();
//	String result = "";
//
//	// display the result
//	Iterator<String> it = processes.iterator();
//	int i = 0;
//				while (it.hasNext())
//					{
//					result += it.next() +",";
//					i++;
//						if (i==10)
//							{
//									result += "\n";
//									i = 0;
//							}
//					}
//            JOptionPane.showMessageDialog("Running processes :\n " + result+"\n Total No of Processes: \n"+ processes.size());
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        // Controlpanel();
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:

        Register();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:

        TaskManager();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:

        //  console();
        sysconfig();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:

        Controlpanel();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        scanServer();
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:

        manuvalScan objs = new manuvalScan();
//   objs.scan();
        objs.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
//        note();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        note();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void Start_Buttton_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start_Buttton_ActionPerformed
        // TODO add your handling code here:

        // th=new Thread(this);
        th.start();


    }//GEN-LAST:event_Start_Buttton_ActionPerformed

    private void PauseButton_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseButton_ActionPerformed
        // TODO add your handling code here:

        try {
            // Thread.sleep(5000);
            //Thread.yield();
            th.suspend();
            //Thread.currentThread().sleep(5000);
            //Thread.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PauseButton_ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // th.notify();
        th.resume();
    }//GEN-LAST:event_jButton1ActionPerformed

    private static void addFilesRecursively(File file, Collection<File> all) {

        final File[] children = file.listFiles();
        if (children != null) {
            for (File child : children) {
                all.add(child);
                // Thread.sleep(1000);
                //System.out.println(all);
                addFilesRecursively(child, all);
                //fileCount++;
            }
        }
    }

    public void run() {

        while (true) {
            try {
                final Collection<File> all = new ArrayList<File>();
                addFilesRecursively(new File("d:\\server"), all);
//        
                infectFIles = new ArrayList();
                String buff = null;
                Iterator itr = all.iterator();
                String fname = "";
                int mid;
                while (itr.hasNext()) {
                    Thread.sleep(10);
                    fs = (File) itr.next();
                    ta1.append(fs + "\n");
                    jLabel8.setText(fs + "");
                    tfile = fs.getAbsoluteFile();
                    buff = tfile.getName();
                    if (buff.contains(".")) {
                        mid = buff.lastIndexOf(".");
                        fname = buff.substring(0, mid);
                        fileLen = fname.length();
                        if (fileLen <= 20) {
//
                            if (shortListDB.contains(fname)) {
                                vf++;

                                infectFIles.add(fname);

                                try {
                                    FileInputStream fis = new FileInputStream(fs);
                                    byte buffer[] = new byte[fis.available()];
                                    fis.read(buffer);
                                    String fc = new String(buffer);
                                    FileOutputStream fos = new FileOutputStream("D:\\Quarantine\\" + buff);
                                    fos.write(buffer);

                                    fis.close();
                                    fos.close();
                                    fs.delete();

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                inf();
//
                            }
                        } else {
//
                            if (longListDB.contains(fname)) {
                                vf++;
                                infectFIles.add(fname);
                                try {
//
                                    FileInputStream fis = new FileInputStream(fs);
                                    byte buffer[] = new byte[fis.available()];
                                    fis.read(buffer);
                                    String fc = new String(buffer);
                                    FileOutputStream fos = new FileOutputStream("D:\\Quarantine\\" + buff);
//
                                    fos.write(buffer);


                                    fis.close();
                                    fos.close();
                                    fs.delete();

                                } catch (Exception e) {
                                    e.printStackTrace();

                                }
                                inf();

                            }
//
                        }
                        fileCount++;
                        jLabel6.setText(vf + "");

                        jLabel5.setText(fileCount + "");

                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            Iterator infectItr = infectFIles.iterator();
            while (infectItr.hasNext()) {
                String IF = (String) infectItr.next();
//          
            }
//       
            vf = 0;
        }
//        
    }

    public void inf() {
        JOptionPane.showMessageDialog(rootPane, "VIrus found");
        JOptionPane.showMessageDialog(rootPane, "Infected files are move to Quarantine");
    }

    public void note() {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
//            p=r.exec("D:\\LogDetails.txt");
//            runtime.exec("notepad.exe D:\\fileTest.txt");
            p = r.exec("notepad.exe D:\\LogDetails.txt");
            System.out.println("Notepad open");
            p.waitFor();
        } catch (Exception e)
        {
            System.out.print("Fail to Open Notepad Opened");
        }
        System.out.print("Notepad Closed" + p.exitValue());

    }

    public void folder() {
        f = new File("D:\\Quarantine");
        f.mkdir();
    }

    public void fr() {
        FileDialog fd = new FileDialog(this);
        fd.setVisible(true);
        String s1 = fd.getDirectory();
        String s2 = fd.getFile();
        String s3 = s1 + s2;

        try {

            BufferedReader br = new BufferedReader(new FileReader(s3));
            while ((str = br.readLine()) != null) {
                sessionid = str;
                defaultBytes = sessionid.getBytes();
                MessageDigest algorithm = MessageDigest.getInstance("MD5");
                algorithm.reset();
                algorithm.update(defaultBytes);
                byte messageDigest[] = algorithm.digest();

                StringBuffer hexString = new StringBuffer();
                for (int i1 = 0; i1 < messageDigest.length; i1++) {
                    hexString.append(Integer.toHexString(0xFF & messageDigest[i1]));
                }
                String foo = messageDigest.toString();
                sessionid = hexString + "";
                flag = hexString.toString();
                int lenStr = str.length();
                System.out.println(lenStr);
                if (lenStr <= 20) {

                    DBpartition.updateShort(str, flag);
                } else {
                    DBpartition.updateLong(str, flag);
                }
                c++;
            }



        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void crFile() {
//    File fileObj=new File("D:\\Log.txt");
        try {
//     File fileObj=new File();
            File fileObj = new File("D:\\Log.txt");

            FileWriter fw = new FileWriter(fileObj);
            String d = "Antivirus ";
            fw.write(d);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void notepadOpen() {
        try {
            File file = new File("D:\\LogDetails.txt");
//    file.open();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void notepad() {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\LogDetails.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            String newLine = System.getProperty("line.separator");
            osw.write(newLine);
            osw.write("*********************");
            osw.write(newLine);
            osw.write("Log Details");
            osw.write(newLine);
//      osw.write(newLine);

            osw.write("Antivirus Scanning");
            osw.write(newLine);
            osw.write("*********************");
            osw.write(newLine);
            osw.write(" Date \t Time");
            osw.write(newLine);
//    osw.write();
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat objdate = new SimpleDateFormat("dd-MM-yyy hh:mm:ss");
            SimpleDateFormat o=new SimpleDateFormat();
            String datenow = objdate.format(cal.getTime());
            osw.write(datenow);
            osw.write(newLine);
            osw.write("--------------------------------------------------------------------------------------------------------------------------------");
            osw.write(newLine);
//            osw.write("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            osw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void desigh() {
        setSize(1980, 1000);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AV_mainpage obj1 = new AV_mainpage();
                obj1.desigh();
                obj1.folder();
                obj1.crFile();
                obj1.setVisible(true);
                obj1.notepad();
            }
        });
    }

//    class getFileClass implements Runnable
//    {
//        //static final Collection<File> all22 = new ArrayList<File>();
//        //File file;
//        public void run()
//        {
//
//            String cc="C:\\";
//         String cd="D:\\";
//         String ce="E:\\";
//            System.out.println("In side Thread 2");
//            //addFilesRecursivelyA(file, all);
//            addFilesRecursivelyA(new File(cc+"\\"), allc22);
//             //addFilesRecursivelyA(new File(cd+"\\"), all22);
//              //addFilesRecursivelyA(new File(ce+"\\"), all22);
//
//            System.out.println("Run finished");
//
//
//        }
//
//             public  void addFilesRecursivelyA(File file, Collection<File> allc22)
//                {
//                    System.out.println("in side Thread 2 in side method");
//                final File[] children = file.listFiles();
//                if (children != null)
//                {
//                    for (File child : children)
//                    {
//                        allc22.add(child);
//                        //System.out.println("Inside forloop");
//                        addFilesRecursively(child, allc22);
//                    }
//                }
//                    //System.out.println("ALl:"+all22);
//                }
//        }
    class getFileClassC implements Runnable {
        //static final Collection<File> all22 = new ArrayList<File>();
        //File file;

        public void run() {

            String ff = "F:\\";
            String cd = "D:\\";
            String ce = "E:\\";
            System.out.println("In side Thread F");
            //addFilesRecursivelyA(file, all);
            addFilesRecursivelyA(new File(ff + "\\"), allc22);
            //addFilesRecursivelyA(new File(cd+"\\"), all22);
            //addFilesRecursivelyA(new File(ce+"\\"), all22);

            System.out.println("   F    Run finished");


        }

        public void addFilesRecursivelyA(File file, Collection<File> allc22) {
            System.out.println("in side Thread F in side method");
            final File[] children = file.listFiles();
            if (children != null) {
                for (File child : children) {
                    allc22.add(child);
                    //System.out.println("Inside forloop");
                    addFilesRecursively(child, allc22);
                    //System.out.println("cccc");
                }
            }
            //System.out.println("ALl:"+all22);
        }
    }

    class getFileClassD implements Runnable {
        //static final Collection<File> all22 = new ArrayList<File>();
        //File file;

        public void run() {

            String cc = "C:\\";
            String cd = "D:\\";
            String ce = "E:\\";
            System.out.println("In side Thread D");
            //addFilesRecursivelyA(file, all);
            addFilesRecursivelyA(new File(cd + "\\"), allD22);
            //addFilesRecursivelyA(new File(cd+"\\"), all22);
            //addFilesRecursivelyA(new File(ce+"\\"), all22);

            System.out.println("   D         Run finished");


        }

        public void addFilesRecursivelyA(File file, Collection<File> allD22) {
            System.out.println("in side Thread D in side method");
            final File[] children = file.listFiles();
            if (children != null) {

                for (File child : children) {
                    allD22.add(child);
                    //System.out.println("Inside forloop");
                    addFilesRecursively(child, allD22);
                    //System.out.println("DDD");
                }
            }
            //System.out.println("ALl:"+all22);
        }
    }

    class getFileClassE implements Runnable {
        //static final Collection<File> all22 = new ArrayList<File>();
        //File file;

        public void run() {

            String cc = "C:\\";
            String cd = "D:\\";
            String ce = "E:\\";
            System.out.println("In side Thread E");
            //addFilesRecursivelyA(file, all);
            addFilesRecursivelyA(new File(ce + "\\"), allE22);
            //addFilesRecursivelyA(new File(cd+"\\"), all22);
            //addFilesRecursivelyA(new File(ce+"\\"), all22);

            System.out.println("        E      Run finished");


        }

        public void addFilesRecursivelyA(File file, Collection<File> allE22) {
            System.out.println("in side Thread E in side method");
            final File[] children = file.listFiles();
            if (children != null) {
                for (File child : children) {
                    allE22.add(child);
                    //System.out.println("Inside forloop");
                    addFilesRecursively(child, allE22);
                    // System.out.println("EEE");
                }
            }
            //System.out.println("ALl:"+all22);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse_;
    private javax.swing.JButton Option_;
    private javax.swing.JButton PauseButton_;
    private javax.swing.JButton Quarantine_;
    private javax.swing.JButton Start_Buttton_;
    private javax.swing.JButton UpdateSignature_;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JButton scan_;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables
    byte b1[];
    String str;
    List li = new ArrayList();
    String sessionid;
    byte[] defaultBytes;
    static String flag;
    int c = 0, pb = 0, countVal = 0;
    static int fileCount = 0, detected = 0, cleared = 0;
    // Thread th;
    Thread th = new Thread(this);
    int tr = 0;
    File f;
    final Collection<File> all = new ArrayList<File>();
    Map map;
    List fileInServerList;
//      final Collection all = new ArrayList();
    List addVnToList;
    //// new
    static List shortListDB;
    static List longListDB;
    List infectFIles;
    static final Collection<File> all2 = new ArrayList<File>();
    static final Collection<File> allc22 = new ArrayList<File>();
    static final Collection<File> allD22 = new ArrayList<File>();
    static final Collection<File> allE22 = new ArrayList<File>();
    File file;
}
