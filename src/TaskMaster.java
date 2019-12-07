
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class TaskMaster extends javax.swing.JFrame {

    ArrayList<Task> list;
    ListIterator<Task> li;
    int curtaskvar, tottaskvar;
    Task t;

    public TaskMaster() {
        initComponents();
        list = new ArrayList();
        li = list.listIterator();
        curtaskvar = 1;

        li.add(new Task("Homework", "Math, pages 12-19"));
        li.add(new Task("Groceries", "Bread, Milk Eggs"));
        li.add(new Task("Chores", "Laundry, Clean Driveway"));
        tottaskvar = list.size();
        while (li.hasPrevious()) {
            t = (Task) li.previous();
        }

        curtask.setText("Current Task: " + curtaskvar);
        tottask.setText("Total Task: " + tottaskvar);
        txtname.setText(t.getName());
        txtdesc.setText(t.getDesc());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdesc = new javax.swing.JTextArea();
        txtname = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        curtask = new javax.swing.JLabel();
        tottask = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        verlast = new javax.swing.JButton();
        last = new javax.swing.JButton();
        up = new javax.swing.JButton();
        verup = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        showall = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        replace = new javax.swing.JMenuItem();
        remove = new javax.swing.JMenuItem();
        restore = new javax.swing.JMenuItem();
        next = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        before = new javax.swing.JMenuItem();
        after = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Description:");

        txtdesc.setColumns(20);
        txtdesc.setRows(5);
        jScrollPane1.setViewportView(txtdesc);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        curtask.setText("Current Taks : 0");

        tottask.setText("Total Tasks: 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(curtask)
                .addGap(37, 37, 37)
                .addComponent(tottask, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(curtask, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(tottask))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        verlast.setText("|<");
        verlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verlastActionPerformed(evt);
            }
        });

        last.setText("<");
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });

        up.setText(">");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        verup.setText(">|");
        verup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verlast)
                .addGap(29, 29, 29)
                .addComponent(last)
                .addGap(79, 79, 79)
                .addComponent(up)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verup)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verlast)
                    .addComponent(last)
                    .addComponent(up)
                    .addComponent(verup))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        showall.setText("Show All");
        showall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showallActionPerformed(evt);
            }
        });
        jMenu1.add(showall);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        replace.setText("Replace This As Current Task");
        replace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceActionPerformed(evt);
            }
        });
        jMenu2.add(replace);

        remove.setText("Remove Current Task");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jMenu2.add(remove);

        restore.setText("Restore Current Task");
        restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreActionPerformed(evt);
            }
        });
        jMenu2.add(restore);

        next.setText("Clear Screen");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jMenu2.add(next);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        before.setText("Before Current Task");
        before.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beforeActionPerformed(evt);
            }
        });
        jMenu3.add(before);

        after.setText("After Current Task");
        after.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afterActionPerformed(evt);
            }
        });
        jMenu3.add(after);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void afterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afterActionPerformed
        String nm = txtname.getText();
        String d = txtdesc.getText();
        Task t = new Task(nm, d);
        if (t.validate() == false) {
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        if (tottaskvar > 0) {
            li.next();
        }

        li.add(t);
        li.previous();
        curtaskvar++;
        tottaskvar++;
        curtask.setText("Current Task: " + curtaskvar);
        tottask.setText("Total Task: " + tottaskvar);
        JOptionPane.showMessageDialog(this, "Task Added");

    }//GEN-LAST:event_afterActionPerformed

    private void verlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verlastActionPerformed
        if (curtaskvar == 1) {
            return;
        }
        while (li.hasPrevious()) {
            li.previous();
        }
        li.next();
        t = (Task) li.previous();
        curtaskvar = 1;
        curtask.setText("Current Task: " + curtaskvar);
        txtname.setText("" + t.getName());
        txtdesc.setText("" + t.getDesc());

    }//GEN-LAST:event_verlastActionPerformed

    private void showallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showallActionPerformed
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            t = (Task) list.get(i);
            result += "TASK " + (i + 1) + ":\n" + t.toString() + "\n";
        }
        JOptionPane.showMessageDialog(this, result);
    }//GEN-LAST:event_showallActionPerformed

    private void restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreActionPerformed
        li.next();
        t = (Task) li.previous();
        txtname.setText("" + t.getName());
        txtdesc.setText("" + t.getDesc());
    }//GEN-LAST:event_restoreActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        if (curtaskvar == tottaskvar) {
            return;
        }
        li.next();
        li.next();
        t = (Task) li.previous();
        curtaskvar += 1;
        curtask.setText("Current Task: " + curtaskvar);
        txtname.setText("" + t.getName());
        txtdesc.setText("" + t.getDesc());
    }//GEN-LAST:event_upActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
        if (curtaskvar == 1) {
            return;
        }
        t = (Task) li.previous();
        curtaskvar -= 1;
        curtask.setText("Current Task: " + curtaskvar);
        txtname.setText("" + t.getName());
        txtdesc.setText("" + t.getDesc());
    }//GEN-LAST:event_lastActionPerformed

    private void verupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verupActionPerformed
        if (curtaskvar == tottaskvar) {
            return;
        }
        while (li.hasNext()) {
            li.next();
        }
        t = (Task) li.previous();
        curtaskvar = tottaskvar;
        curtask.setText("Current Task: " + curtaskvar);
        txtname.setText("" + t.getName());
        txtdesc.setText("" + t.getDesc());
    }//GEN-LAST:event_verupActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        if (tottaskvar == 0) {
            return;
        }
        li.next();
        li.remove();
        tottaskvar -= 1;
        if (tottaskvar == 0) {
            txtname.setText("");
            txtdesc.setText("");
            curtaskvar = 0;
        }
        if (tottaskvar == 1) {
            if (li.hasNext()) {
                li.next();
                t = (Task) li.previous();
                txtname.setText("" + t.getName());
                txtdesc.setText("" + t.getDesc());
            } else if (li.hasPrevious()) {
                t = (Task) li.previous();
                txtname.setText("" + t.getName());
                txtdesc.setText("" + t.getDesc());
            }
        }
        if (tottaskvar > 1) {
            if (curtaskvar == 0) {
                li.next();
                t = (Task) li.previous();
                txtname.setText("" + t.getName());
                txtdesc.setText("" + t.getDesc());
            }
            else {
                t = (Task) li.previous();
                txtname.setText("" + t.getName());
                txtdesc.setText("" + t.getDesc());
            }
        }
    }//GEN-LAST:event_removeActionPerformed

    private void replaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceActionPerformed
        String tempname = txtname.getText();
        String tempdesc = txtdesc.getText();
        li.next();
        li.previous();
        t = new Task(tempname, tempdesc);
        li.set(t);

    }//GEN-LAST:event_replaceActionPerformed

    private void beforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beforeActionPerformed
        String nm = txtname.getText();
        String d = txtdesc.getText();
        Task t = new Task(nm, d);
        if (t.validate() == false) {
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        if (tottaskvar > 0) {
            li.add(t);
            curtaskvar--;
            tottaskvar++;
            curtask.setText("Current Task: " + curtaskvar);
            tottask.setText("Total Task: " + tottaskvar);
            JOptionPane.showMessageDialog(this, "Task Added");
        }


    }//GEN-LAST:event_beforeActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        txtname.setText("");
        txtdesc.setText("");
    }//GEN-LAST:event_nextActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem after;
    private javax.swing.JMenuItem before;
    private javax.swing.JLabel curtask;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton last;
    private javax.swing.JMenuItem next;
    private javax.swing.JMenuItem remove;
    private javax.swing.JMenuItem replace;
    private javax.swing.JMenuItem restore;
    private javax.swing.JMenuItem showall;
    private javax.swing.JLabel tottask;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtname;
    private javax.swing.JButton up;
    private javax.swing.JButton verlast;
    private javax.swing.JButton verup;
    // End of variables declaration//GEN-END:variables
}
