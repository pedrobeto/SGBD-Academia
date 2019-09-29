package View;

import Control.DesktopInstrutorControl;
import Control.DesktopSecretariaControl;
import Model.Aluno;
import Model.Exercicio;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import Model.Aluno;
import View.DesktopInstrutor;
import View.DesktopSecretaria;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import util.Conexao;
import java.util.*;
import javax.swing.SwingConstants;

public class DesktopInstrutor extends javax.swing.JFrame {
    
    private final DesktopInstrutorControl controller;

    public DesktopInstrutor() {
        initComponents();
         jDesktopPaneSecretaria.setVisible(true);
         jInternalFrameConsultaAluno.setVisible(false);
         controller = new DesktopInstrutorControl(this);
         jInternalFrameMontarTreino.setVisible(false);

                 

         
    }

    public JButton getjButtonBuscarAluno() {
        return jButtonBuscarAluno;
    }

    public void setjButtonBuscarAluno(JButton jButtonBuscarAluno) {
        this.jButtonBuscarAluno = jButtonBuscarAluno;
    }

    public JButton getjButtonFecharConsultaAluno() {
        return jButtonFecharConsultaAluno;
    }

    public void setjButtonFecharConsultaAluno(JButton jButtonFecharConsultaAluno) {
        this.jButtonFecharConsultaAluno = jButtonFecharConsultaAluno;
    }

    public JButton getjButtonMostrarTodosAlunos() {
        return jButtonMostrarTodosAlunos;
    }

    public void setjButtonMostrarTodosAlunos(JButton jButtonMostrarTodosAlunos) {
        this.jButtonMostrarTodosAlunos = jButtonMostrarTodosAlunos;
    }

    public JComboBox<String> getjComboBox4() {
        return jComboBox4;
    }

    public void setjComboBox4(JComboBox<String> jComboBox4) {
        this.jComboBox4 = jComboBox4;
    }

    public JDesktopPane getjDesktopPaneSecretaria() {
        return jDesktopPaneSecretaria;
    }

    public void setjDesktopPaneSecretaria(JDesktopPane jDesktopPaneSecretaria) {
        this.jDesktopPaneSecretaria = jDesktopPaneSecretaria;
    }

    public JInternalFrame getjInternalFrameConsultaAluno() {
        return jInternalFrameConsultaAluno;
    }

    public void setjInternalFrameConsultaAluno(JInternalFrame jInternalFrameConsultaAluno) {
        this.jInternalFrameConsultaAluno = jInternalFrameConsultaAluno;
    }

    public JInternalFrame getjInternalFrameMontarTreino() {
        return jInternalFrameMontarTreino;
    }

    public void setjInternalFrameMontarTreino(JInternalFrame jInternalFrameMontarTreino) {
        this.jInternalFrameMontarTreino = jInternalFrameMontarTreino;
    }

    public JLabel getjLabelDesktopBackground() {
        return jLabelDesktopBackground;
    }

    public void setjLabelDesktopBackground(JLabel jLabelDesktopBackground) {
        this.jLabelDesktopBackground = jLabelDesktopBackground;
    }

    public JLabel getjLabelNomeBuscaAluno() {
        return jLabelNomeBuscaAluno;
    }

    public void setjLabelNomeBuscaAluno(JLabel jLabelNomeBuscaAluno) {
        this.jLabelNomeBuscaAluno = jLabelNomeBuscaAluno;
    }

    public JList<String> getjList1() {
        return jList1;
    }

    public void setjList1(JList<String> jList1) {
        this.jList1 = jList1;
    }

    public JMenu getjMenuAlunos() {
        return jMenuAlunos;
    }

    public void setjMenuAlunos(JMenu jMenuAlunos) {
        this.jMenuAlunos = jMenuAlunos;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JMenu getjMenuInstrutores() {
        return jMenuInstrutores;
    }

    public void setjMenuInstrutores(JMenu jMenuInstrutores) {
        this.jMenuInstrutores = jMenuInstrutores;
    }

    public JMenuItem getjMenuItemConsultaAluno() {
        return jMenuItemConsultaAluno;
    }

    public void setjMenuItemConsultaAluno(JMenuItem jMenuItemConsultaAluno) {
        this.jMenuItemConsultaAluno = jMenuItemConsultaAluno;
    }

    public JMenuItem getjMenuItemMontarTreino() {
        return jMenuItemMontarTreino;
    }

    public void setjMenuItemMontarTreino(JMenuItem jMenuItemMontarTreino) {
        this.jMenuItemMontarTreino = jMenuItemMontarTreino;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JTable getjTableConsultaAluno() {
        return jTableConsultaAluno;
    }

    public void setjTableConsultaAluno(JTable jTableConsultaAluno) {
        this.jTableConsultaAluno = jTableConsultaAluno;
    }

    public JTextField getjTextFieldBuscaAluno() {
        return jTextFieldBuscaAluno;
    }

    public void setjTextFieldBuscaAluno(JTextField jTextFieldBuscaAluno) {
        this.jTextFieldBuscaAluno = jTextFieldBuscaAluno;
    }

    public JToggleButton getjToggleButton1() {
        return jToggleButton1;
    }

    public void setjToggleButton1(JToggleButton jToggleButton1) {
        this.jToggleButton1 = jToggleButton1;
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jDesktopPaneSecretaria = new javax.swing.JDesktopPane();
        jInternalFrameConsultaAluno = new javax.swing.JInternalFrame();
        jLabelNomeBuscaAluno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaAluno = new javax.swing.JTable();
        jTextFieldBuscaAluno = new javax.swing.JTextField();
        jButtonBuscarAluno = new javax.swing.JButton();
        jButtonMostrarTodosAlunos = new javax.swing.JButton();
        jButtonFecharConsultaAluno = new javax.swing.JButton();
        jInternalFrameMontarTreino = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jButtonRemove = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jTextFieldMatriculaAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonClose = new javax.swing.JButton();
        jLabelDesktopBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlunos = new javax.swing.JMenu();
        jMenuItemConsultaAluno = new javax.swing.JMenuItem();
        jMenuInstrutores = new javax.swing.JMenu();
        jMenuItemMontarTreino = new javax.swing.JMenuItem();

        jToggleButton1.setText("jToggleButton1");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FitLife Academia - Instrutor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrameConsultaAluno.setTitle("Consultar meus alunos");
        jInternalFrameConsultaAluno.setVisible(true);
        jInternalFrameConsultaAluno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNomeBuscaAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelNomeBuscaAluno.setText("Nome:");
        jInternalFrameConsultaAluno.getContentPane().add(jLabelNomeBuscaAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 50, -1));

        jTableConsultaAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTableConsultaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Idade", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableConsultaAluno);

        jInternalFrameConsultaAluno.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 670, 170));

        jTextFieldBuscaAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jInternalFrameConsultaAluno.getContentPane().add(jTextFieldBuscaAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 370, 30));

        jButtonBuscarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/search.png"))); // NOI18N
        jButtonBuscarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAlunoActionPerformed(evt);
            }
        });
        jInternalFrameConsultaAluno.getContentPane().add(jButtonBuscarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 40, 30));

        jButtonMostrarTodosAlunos.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jButtonMostrarTodosAlunos.setText("Exibir todos");
        jButtonMostrarTodosAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTodosAlunosActionPerformed(evt);
            }
        });
        jInternalFrameConsultaAluno.getContentPane().add(jButtonMostrarTodosAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 110, 30));

        jButtonFecharConsultaAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jButtonFecharConsultaAluno.setText("Fechar");
        jButtonFecharConsultaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharConsultaAlunoActionPerformed(evt);
            }
        });
        jInternalFrameConsultaAluno.getContentPane().add(jButtonFecharConsultaAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 110, 30));

        jDesktopPaneSecretaria.add(jInternalFrameConsultaAluno);
        jInternalFrameConsultaAluno.setBounds(20, 20, 710, 450);

        jInternalFrameMontarTreino.setTitle("Consultar aluno");
        jInternalFrameMontarTreino.setVisible(true);
        jInternalFrameMontarTreino.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setViewportView(jList1);

        jInternalFrameMontarTreino.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, 370));

        jScrollPane4.setViewportView(jList3);

        jInternalFrameMontarTreino.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 250, 370));

        jButtonRemove.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jButtonRemove.setText("Remover");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });
        jInternalFrameMontarTreino.getContentPane().add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 110, 30));

        jButtonAdd.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jButtonAdd.setText("Adicionar ->");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jInternalFrameMontarTreino.getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 110, 30));

        jButtonSave.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jButtonSave.setText("Salvar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jInternalFrameMontarTreino.getContentPane().add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 110, 30));

        jTextFieldMatriculaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatriculaAlunoActionPerformed(evt);
            }
        });
        jInternalFrameMontarTreino.getContentPane().add(jTextFieldMatriculaAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 120, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Matricula do Aluno:");
        jInternalFrameMontarTreino.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, 20));

        jButtonClose.setText("Fechar");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        jInternalFrameMontarTreino.getContentPane().add(jButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jDesktopPaneSecretaria.add(jInternalFrameMontarTreino);
        jInternalFrameMontarTreino.setBounds(10, 10, 710, 450);

        jLabelDesktopBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/backgroundDesktop1.png"))); // NOI18N
        jDesktopPaneSecretaria.add(jLabelDesktopBackground);
        jLabelDesktopBackground.setBounds(-15, 0, 970, 568);

        getContentPane().add(jDesktopPaneSecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 550));

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenuAlunos.setText("Alunos");

        jMenuItemConsultaAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/search.png"))); // NOI18N
        jMenuItemConsultaAluno.setText("Consulta");
        jMenuItemConsultaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaAlunoActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemConsultaAluno);

        jMenuBar1.add(jMenuAlunos);

        jMenuInstrutores.setText("Treinos");

        jMenuItemMontarTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/treino.png"))); // NOI18N
        jMenuItemMontarTreino.setText("Montar novo");
        jMenuItemMontarTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMontarTreinoActionPerformed(evt);
            }
        });
        jMenuInstrutores.add(jMenuItemMontarTreino);

        jMenuBar1.add(jMenuInstrutores);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemConsultaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaAlunoActionPerformed
        jInternalFrameConsultaAluno.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultaAlunoActionPerformed

    private void jButtonMostrarTodosAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTodosAlunosActionPerformed
        readJTable();
    }//GEN-LAST:event_jButtonMostrarTodosAlunosActionPerformed

    private void jButtonFecharConsultaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharConsultaAlunoActionPerformed
        jInternalFrameConsultaAluno.setVisible(false);
    }//GEN-LAST:event_jButtonFecharConsultaAlunoActionPerformed

    private void jMenuItemMontarTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMontarTreinoActionPerformed
        jInternalFrameMontarTreino.setVisible(true);
        loadJList();
    }//GEN-LAST:event_jMenuItemMontarTreinoActionPerformed

    private void jButtonBuscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAlunoActionPerformed
        readSpecificJTable();
    }//GEN-LAST:event_jButtonBuscarAlunoActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        if(jList3.getSelectedIndex()!=-1){
            removerElemento();
        } else {
            JOptionPane.showMessageDialog(null, "Nada selecionado!");
        }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    public ArrayList<String> selecionaTodos(){
        int tamanhoLista = jList3.getModel().getSize();
        ArrayList listaCompleta = new ArrayList();
        for (int i=0; i < tamanhoLista; i++){
            listaCompleta.add(jList3.getModel().getElementAt(i));
        }
        return listaCompleta;
    }
    
    
   
    
    
    
    
    DefaultListModel DLM2 = new DefaultListModel();
    
    
    public void adicionarElemento(){
        DLM2.addElement(jList1.getSelectedValue());
        jList3.setModel(DLM2);
        //ArrayList<> listaNova = new ArrayList<>;
    }
    
    public void removerElemento(){
        DLM2.remove(jList3.getSelectedIndex());
        jList3.setModel(DLM2);
    }

    public DefaultListModel getDLM2() {
        return DLM2;
    }

    public void setDLM2(DefaultListModel DLM2) {
        this.DLM2 = DLM2;
    }

    public JButton getjButtonAdd() {
        return jButtonAdd;
    }

    public void setjButtonAdd(JButton jButtonAdd) {
        this.jButtonAdd = jButtonAdd;
    }

    public JButton getjButtonRemove() {
        return jButtonRemove;
    }

    public void setjButtonRemove(JButton jButtonRemove) {
        this.jButtonRemove = jButtonRemove;
    }

    public JButton getjButtonSave() {
        return jButtonSave;
    }

    public void setjButtonSave(JButton jButtonSave) {
        this.jButtonSave = jButtonSave;
    }


    public JList<String> getjList3() {
        return jList3;
    }

    public void setjList3(JList<String> jList3) {
        this.jList3 = jList3;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public JTextField getjTextFieldMatriculaAluno() {
        return jTextFieldMatriculaAluno;
    }

    public void setjTextFieldMatriculaAluno(JTextField jTextFieldMatriculaAluno) {
        this.jTextFieldMatriculaAluno = jTextFieldMatriculaAluno;
    }
    
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        adicionarElemento();  
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
       System.out.println("TESTANDOOOOOO");
       ArrayList<String> lista = selecionaTodos();
       for(int x = 0; x<lista.size(); x++){
           System.out.println(lista.get(x));
       }
       int treinoPadrao = controller.cadastrarNovoTreino();
       //System.out.println("to aqui olha " + treinoPadrao);
       for(int i = 0; i < lista.size(); i++){
           //System.out.println("entrei no for");
           String novoExercicio = lista.get(i);
           controller.cadastrarNovaFicha(treinoPadrao, controller.recuperarExercicio(novoExercicio));
       }
       JOptionPane.showMessageDialog(null, "Treino cadastrado com sucesso para o respectivo aluno!");
       jTextFieldMatriculaAluno.setText("");
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTextFieldMatriculaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatriculaAlunoActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        jInternalFrameMontarTreino.setVisible(false);
    }//GEN-LAST:event_jButtonCloseActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DesktopInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesktopInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesktopInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesktopInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesktopInstrutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBuscarAluno;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonFecharConsultaAluno;
    private javax.swing.JButton jButtonMostrarTodosAlunos;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JDesktopPane jDesktopPaneSecretaria;
    private javax.swing.JInternalFrame jInternalFrameConsultaAluno;
    private javax.swing.JInternalFrame jInternalFrameMontarTreino;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDesktopBackground;
    private javax.swing.JLabel jLabelNomeBuscaAluno;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList3;
    private javax.swing.JMenu jMenuAlunos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInstrutores;
    private javax.swing.JMenuItem jMenuItemConsultaAluno;
    private javax.swing.JMenuItem jMenuItemMontarTreino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableConsultaAluno;
    private javax.swing.JTextField jTextFieldBuscaAluno;
    private javax.swing.JTextField jTextFieldMatriculaAluno;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    private void readSpecificJTable() {
        Aluno aluno = null;
            if(controller.selecionarAluno()!=null){
                aluno = controller.selecionarAluno();
            }
            else {
                controller.alertaUsuario("Erro na busca!");
                return;
            }
            
            DefaultTableModel modelo = (DefaultTableModel) jTableConsultaAluno.getModel();
            modelo.setRowCount(0);
            modelo.addRow(new String[]{
            aluno.getNome(),
            String.valueOf(aluno.getIdade()),
            aluno.getSexo(),
            });
    }

    private void readJTable() {
       ArrayList<Aluno> lista = controller.selecionarTodosAlunos();
            DefaultTableModel modelo = (DefaultTableModel) jTableConsultaAluno.getModel();
            modelo.setRowCount(0);
            if(!lista.isEmpty()){
                for(Aluno aluno: lista){
                    modelo.addRow(new String[]{
                        aluno.getNome(),
                        String.valueOf(aluno.getIdade()),
                        aluno.getSexo(),
                    });
                }
            }
    }
    
    private void loadJList() {
       Conexao c = new Conexao();
       ArrayList<Exercicio> lista = new ArrayList<Exercicio>();
       String sql = "select * from exercicio";
       DefaultListModel DLM = new DefaultListModel();
       System.out.println("right here");
       
       try{
            PreparedStatement sentenca = c.con.prepareStatement(sql);
            ResultSet rs = sentenca.executeQuery();
            System.out.println("right here");
            while(rs.next()){
                //Exercicio novoE = new Exercicio();
                //novoE.setId(rs.getInt("id"));
                //novoE.setNome(rs.getString("nome"));
                //lista.add(novoE);
                DLM.addElement(rs.getString("nome"));
            }
            jList1.setModel(DLM);
            
            c.desconectar();
        }catch(SQLException erro){
            System.out.println("Erro na sentença: "+ erro.getMessage());
        }
            
    }

    


}
