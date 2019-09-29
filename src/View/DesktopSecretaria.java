package View;

import Control.DesktopSecretariaControl;
import Model.Aluno;
import Model.Instrutor;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

public class DesktopSecretaria extends javax.swing.JFrame {

    private final DesktopSecretariaControl controller;

    
    public DesktopSecretaria() {
        initComponents();
        jDesktopPaneSecretaria.setVisible(true);
        jInternalFrameCadastroAluno.setVisible(false);
        jInternalFrameConsultaAluno.setVisible(false);
        jInternalFrameCadastroInstrutor.setVisible(false);
        jInternalFrameConsultaInstrutor.setVisible(false);
        controller = new DesktopSecretariaControl(this);
        jButtonCadastrarAluno.setEnabled(false);
        jButtonCadastrarInstrutor.setEnabled(false);
        
        
        new Thread() {

            @Override
            public void run() {
              while (true){
                if(controller.isEmptyAluno()==false){
                    jButtonCadastrarAluno.setEnabled(true);
                } else {
                    jButtonCadastrarAluno.setEnabled(false); //pode ser que o usuário apague o texto
                }
                try {
                    sleep(500); //meio segundo
                } catch (InterruptedException e) {}
             }
            }
            }.start();
        
        
        new Thread() {

            @Override
            public void run() {
              while (true){
                if(controller.isEmptyInstrutor()==false){
                    jButtonCadastrarInstrutor.setEnabled(true);
                } else {
                    jButtonCadastrarInstrutor.setEnabled(false); //pode ser que o usuário apague o texto
                }
                try {
                    sleep(500); //meio segundo
                } catch (InterruptedException e) {}
             }
            }
            }.start();
        
    }

    public JButton getjButtonBuscarAluno() {
        return jButtonBuscarAluno;
    }

    public void setjButtonBuscarAluno(JButton jButtonBuscarAluno) {
        this.jButtonBuscarAluno = jButtonBuscarAluno;
    }

    public JButton getjButtonBuscarInstrutor() {
        return jButtonBuscarInstrutor;
    }

    public void setjButtonBuscarInstrutor(JButton jButtonBuscarInstrutor) {
        this.jButtonBuscarInstrutor = jButtonBuscarInstrutor;
    }

    public JButton getjButtonCadastrarAluno() {
        return jButtonCadastrarAluno;
    }

    public void setjButtonCadastrarAluno(JButton jButtonCadastrarAluno) {
        this.jButtonCadastrarAluno = jButtonCadastrarAluno;
    }

    public JButton getjButtonCadastrarInstrutor() {
        return jButtonCadastrarInstrutor;
    }

    public void setjButtonCadastrarInstrutor(JButton jButtonCadastrarInstrutor) {
        this.jButtonCadastrarInstrutor = jButtonCadastrarInstrutor;
    }

    public JButton getjButtonCancelarCadastroAluno() {
        return jButtonCancelarCadastroAluno;
    }

    public void setjButtonCancelarCadastroAluno(JButton jButtonCancelarCadastroAluno) {
        this.jButtonCancelarCadastroAluno = jButtonCancelarCadastroAluno;
    }

    public JButton getjButtonCancelarCadastroInstrutor() {
        return jButtonCancelarCadastroInstrutor;
    }

    public void setjButtonCancelarCadastroInstrutor(JButton jButtonCancelarCadastroInstrutor) {
        this.jButtonCancelarCadastroInstrutor = jButtonCancelarCadastroInstrutor;
    }

    
    public JButton getjButtonFecharConsultaAluno() {
        return jButtonFecharConsultaAluno;
    }

    public void setjButtonFecharConsultaAluno(JButton jButtonFecharConsultaAluno) {
        this.jButtonFecharConsultaAluno = jButtonFecharConsultaAluno;
    }

    public JButton getjButtonFecharConsultaInstrutor() {
        return jButtonFecharConsultaInstrutor;
    }

    public void setjButtonFecharConsultaInstrutor(JButton jButtonFecharConsultaInstrutor) {
        this.jButtonFecharConsultaInstrutor = jButtonFecharConsultaInstrutor;
    }

    public JButton getjButtonMostrarTodosAlunos() {
        return jButtonMostrarTodosAlunos;
    }

    public void setjButtonMostrarTodosAlunos(JButton jButtonMostrarTodosAlunos) {
        this.jButtonMostrarTodosAlunos = jButtonMostrarTodosAlunos;
    }

    public JButton getjButtonMostrarTodosInstrutores() {
        return jButtonMostrarTodosInstrutores;
    }

    public void setjButtonMostrarTodosInstrutores(JButton jButtonMostrarTodosInstrutores) {
        this.jButtonMostrarTodosInstrutores = jButtonMostrarTodosInstrutores;
    }

    public JComboBox<String> getjComboBox4() {
        return jComboBox4;
    }

    public void setjComboBox4(JComboBox<String> jComboBox4) {
        this.jComboBox4 = jComboBox4;
    }

    public JComboBox<String> getjComboBoxMensalidadeAluno() {
        return jComboBoxMensalidadeAluno;
    }

    public JComboBox<String> getjComboBoxSexoAluno() {
        return jComboBoxSexoAluno;
    }

    public void setjComboBoxSexoAluno(JComboBox<String> jComboBoxSexoAluno) {
        this.jComboBoxSexoAluno = jComboBoxSexoAluno;
    }

    public JComboBox<String> getjComboBoxSexoInstrutor() {
        return jComboBoxSexoInstrutor;
    }

    public void setjComboBoxSexoInstrutor(JComboBox<String> jComboBoxSexoInstrutor) {
        this.jComboBoxSexoInstrutor = jComboBoxSexoInstrutor;
    }

    public JDesktopPane getjDesktopPaneSecretaria() {
        return jDesktopPaneSecretaria;
    }

    public void setjDesktopPaneSecretaria(JDesktopPane jDesktopPaneSecretaria) {
        this.jDesktopPaneSecretaria = jDesktopPaneSecretaria;
    }

    public JFormattedTextField getjFormattedTextFieldCEPAluno() {
        return jFormattedTextFieldCEPAluno;
    }

    public void setjFormattedTextFieldCEPAluno(JFormattedTextField jFormattedTextFieldCEPAluno) {
        this.jFormattedTextFieldCEPAluno = jFormattedTextFieldCEPAluno;
    }

    public JFormattedTextField getjFormattedTextFieldCEPInstrutor() {
        return jFormattedTextFieldCEPInstrutor;
    }

    public void setjFormattedTextFieldCEPInstrutor(JFormattedTextField jFormattedTextFieldCEPInstrutor) {
        this.jFormattedTextFieldCEPInstrutor = jFormattedTextFieldCEPInstrutor;
    }

    public JFormattedTextField getjFormattedTextFieldCPFInstrutor() {
        return jFormattedTextFieldCPFInstrutor;
    }

    public void setjFormattedTextFieldCPFInstrutor(JFormattedTextField jFormattedTextFieldCPFInstrutor) {
        this.jFormattedTextFieldCPFInstrutor = jFormattedTextFieldCPFInstrutor;
    }

    public JFormattedTextField getjFormattedTextFieldDataContratoInicial() {
        return jFormattedTextFieldDataContratoInicial;
    }

    public void setjFormattedTextFieldDataContratoInicial(JFormattedTextField jFormattedTextFieldDataContratoInicial) {
        this.jFormattedTextFieldDataContratoInicial = jFormattedTextFieldDataContratoInicial;
    }

    public JFormattedTextField getjFormattedTextFieldDataMatricula() {
        return jFormattedTextFieldDataMatricula;
    }

    public void setjFormattedTextFieldDataMatricula(JFormattedTextField jFormattedTextFieldDataMatricula) {
        this.jFormattedTextFieldDataMatricula = jFormattedTextFieldDataMatricula;
    }

    public JInternalFrame getjInternalFrameCadastroAluno() {
        return jInternalFrameCadastroAluno;
    }

    public void setjInternalFrameCadastroAluno(JInternalFrame jInternalFrameCadastroAluno) {
        this.jInternalFrameCadastroAluno = jInternalFrameCadastroAluno;
    }

    public JInternalFrame getjInternalFrameCadastroInstrutor() {
        return jInternalFrameCadastroInstrutor;
    }

    public void setjInternalFrameCadastroInstrutor(JInternalFrame jInternalFrameCadastroInstrutor) {
        this.jInternalFrameCadastroInstrutor = jInternalFrameCadastroInstrutor;
    }

    public JInternalFrame getjInternalFrameConsultaAluno() {
        return jInternalFrameConsultaAluno;
    }

    public void setjInternalFrameConsultaAluno(JInternalFrame jInternalFrameConsultaAluno) {
        this.jInternalFrameConsultaAluno = jInternalFrameConsultaAluno;
    }

    public JInternalFrame getjInternalFrameConsultaInstrutor() {
        return jInternalFrameConsultaInstrutor;
    }

    public void setjInternalFrameConsultaInstrutor(JInternalFrame jInternalFrameConsultaInstrutor) {
        this.jInternalFrameConsultaInstrutor = jInternalFrameConsultaInstrutor;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabelAlunoNome() {
        return jLabelAlunoNome;
    }

    public void setjLabelAlunoNome(JLabel jLabelAlunoNome) {
        this.jLabelAlunoNome = jLabelAlunoNome;
    }

    public JLabel getjLabelAlunoNome1() {
        return jLabelAlunoNome1;
    }

    public void setjLabelAlunoNome1(JLabel jLabelAlunoNome1) {
        this.jLabelAlunoNome1 = jLabelAlunoNome1;
    }

    public JLabel getjLabelAlunoNome10() {
        return jLabelAlunoNome10;
    }

    public void setjLabelAlunoNome10(JLabel jLabelAlunoNome10) {
        this.jLabelAlunoNome10 = jLabelAlunoNome10;
    }

    public JLabel getjLabelAlunoNome11() {
        return jLabelAlunoNome11;
    }

    public void setjLabelAlunoNome11(JLabel jLabelAlunoNome11) {
        this.jLabelAlunoNome11 = jLabelAlunoNome11;
    }

    public JLabel getjLabelAlunoNome12() {
        return jLabelAlunoNome12;
    }

    public void setjLabelAlunoNome12(JLabel jLabelAlunoNome12) {
        this.jLabelAlunoNome12 = jLabelAlunoNome12;
    }

    public JLabel getjLabelAlunoNome13() {
        return jLabelAlunoNome13;
    }

    public void setjLabelAlunoNome13(JLabel jLabelAlunoNome13) {
        this.jLabelAlunoNome13 = jLabelAlunoNome13;
    }

    public JLabel getjLabelAlunoNome14() {
        return jLabelAlunoNome14;
    }

    public void setjLabelAlunoNome14(JLabel jLabelAlunoNome14) {
        this.jLabelAlunoNome14 = jLabelAlunoNome14;
    }

    public JLabel getjLabelAlunoNome15() {
        return jLabelAlunoNome15;
    }

    public void setjLabelAlunoNome15(JLabel jLabelAlunoNome15) {
        this.jLabelAlunoNome15 = jLabelAlunoNome15;
    }

    public JLabel getjLabelAlunoNome16() {
        return jLabelAlunoNome16;
    }

    public void setjLabelAlunoNome16(JLabel jLabelAlunoNome16) {
        this.jLabelAlunoNome16 = jLabelAlunoNome16;
    }

    public JLabel getjLabelAlunoNome17() {
        return jLabelAlunoNome17;
    }

    public void setjLabelAlunoNome17(JLabel jLabelAlunoNome17) {
        this.jLabelAlunoNome17 = jLabelAlunoNome17;
    }

    public JLabel getjLabelAlunoNome18() {
        return jLabelAlunoNome18;
    }

    public void setjLabelAlunoNome18(JLabel jLabelAlunoNome18) {
        this.jLabelAlunoNome18 = jLabelAlunoNome18;
    }

    public JLabel getjLabelAlunoNome19() {
        return jLabelAlunoNome19;
    }

    public void setjLabelAlunoNome19(JLabel jLabelAlunoNome19) {
        this.jLabelAlunoNome19 = jLabelAlunoNome19;
    }

    public JLabel getjLabelAlunoNome2() {
        return jLabelAlunoNome2;
    }

    public void setjLabelAlunoNome2(JLabel jLabelAlunoNome2) {
        this.jLabelAlunoNome2 = jLabelAlunoNome2;
    }

    public JLabel getjLabelAlunoNome20() {
        return jLabelAlunoNome20;
    }

    public void setjLabelAlunoNome20(JLabel jLabelAlunoNome20) {
        this.jLabelAlunoNome20 = jLabelAlunoNome20;
    }

    public JLabel getjLabelAlunoNome21() {
        return jLabelAlunoNome21;
    }

    public void setjLabelAlunoNome21(JLabel jLabelAlunoNome21) {
        this.jLabelAlunoNome21 = jLabelAlunoNome21;
    }

    public JLabel getjLabelAlunoNome22() {
        return jLabelAlunoNome22;
    }

    public void setjLabelAlunoNome22(JLabel jLabelAlunoNome22) {
        this.jLabelAlunoNome22 = jLabelAlunoNome22;
    }

    public JLabel getjLabelAlunoNome23() {
        return jLabelAlunoNome23;
    }

    public void setjLabelAlunoNome23(JLabel jLabelAlunoNome23) {
        this.jLabelAlunoNome23 = jLabelAlunoNome23;
    }

    public JLabel getjLabelAlunoNome25() {
        return jLabelAlunoNome25;
    }

    public void setjLabelAlunoNome25(JLabel jLabelAlunoNome25) {
        this.jLabelAlunoNome25 = jLabelAlunoNome25;
    }

    public JLabel getjLabelAlunoNome3() {
        return jLabelAlunoNome3;
    }

    public void setjLabelAlunoNome3(JLabel jLabelAlunoNome3) {
        this.jLabelAlunoNome3 = jLabelAlunoNome3;
    }

    public JLabel getjLabelAlunoNome4() {
        return jLabelAlunoNome4;
    }

    public void setjLabelAlunoNome4(JLabel jLabelAlunoNome4) {
        this.jLabelAlunoNome4 = jLabelAlunoNome4;
    }

    public JLabel getjLabelAlunoNome5() {
        return jLabelAlunoNome5;
    }

    public void setjLabelAlunoNome5(JLabel jLabelAlunoNome5) {
        this.jLabelAlunoNome5 = jLabelAlunoNome5;
    }

    public JLabel getjLabelAlunoNome6() {
        return jLabelAlunoNome6;
    }

    public void setjLabelAlunoNome6(JLabel jLabelAlunoNome6) {
        this.jLabelAlunoNome6 = jLabelAlunoNome6;
    }

    public JLabel getjLabelAlunoNome7() {
        return jLabelAlunoNome7;
    }

    public void setjLabelAlunoNome7(JLabel jLabelAlunoNome7) {
        this.jLabelAlunoNome7 = jLabelAlunoNome7;
    }

    public JLabel getjLabelAlunoNome8() {
        return jLabelAlunoNome8;
    }

    public void setjLabelAlunoNome8(JLabel jLabelAlunoNome8) {
        this.jLabelAlunoNome8 = jLabelAlunoNome8;
    }

    public JLabel getjLabelAlunoNome9() {
        return jLabelAlunoNome9;
    }

    public void setjLabelAlunoNome9(JLabel jLabelAlunoNome9) {
        this.jLabelAlunoNome9 = jLabelAlunoNome9;
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

    public JLabel getjLabelNomeBuscaAluno1() {
        return jLabelNomeBuscaAluno1;
    }

    public void setjLabelNomeBuscaAluno1(JLabel jLabelNomeBuscaAluno1) {
        this.jLabelNomeBuscaAluno1 = jLabelNomeBuscaAluno1;
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

    public JMenu getjMenuFinanceiro() {
        return jMenuFinanceiro;
    }

    public void setjMenuFinanceiro(JMenu jMenuFinanceiro) {
        this.jMenuFinanceiro = jMenuFinanceiro;
    }

    public JMenu getjMenuInstrutores() {
        return jMenuInstrutores;
    }

    public void setjMenuInstrutores(JMenu jMenuInstrutores) {
        this.jMenuInstrutores = jMenuInstrutores;
    }

    public JMenuItem getjMenuItemCadastroAluno() {
        return jMenuItemCadastroAluno;
    }

    public void setjMenuItemCadastroAluno(JMenuItem jMenuItemCadastroAluno) {
        this.jMenuItemCadastroAluno = jMenuItemCadastroAluno;
    }

    public JMenuItem getjMenuItemCadastroInstrutor() {
        return jMenuItemCadastroInstrutor;
    }

    public void setjMenuItemCadastroInstrutor(JMenuItem jMenuItemCadastroInstrutor) {
        this.jMenuItemCadastroInstrutor = jMenuItemCadastroInstrutor;
    }

    public JMenuItem getjMenuItemConsultaAluno() {
        return jMenuItemConsultaAluno;
    }

    public void setjMenuItemConsultaAluno(JMenuItem jMenuItemConsultaAluno) {
        this.jMenuItemConsultaAluno = jMenuItemConsultaAluno;
    }

    public JMenuItem getjMenuItemConsultaInstrutor() {
        return jMenuItemConsultaInstrutor;
    }

    public void setjMenuItemConsultaInstrutor(JMenuItem jMenuItemConsultaInstrutor) {
        this.jMenuItemConsultaInstrutor = jMenuItemConsultaInstrutor;
    }

    public JMenuItem getjMenuItemGerarRelatorio1() {
        return jMenuItemGerarRelatorio1;
    }

    public void setjMenuItemGerarRelatorio1(JMenuItem jMenuItemGerarRelatorio1) {
        this.jMenuItemGerarRelatorio1 = jMenuItemGerarRelatorio1;
    }

    public JMenuItem getjMenuItemGerarRelatorio2() {
        return jMenuItemGerarRelatorio2;
    }

    public void setjMenuItemGerarRelatorio2(JMenuItem jMenuItemGerarRelatorio2) {
        this.jMenuItemGerarRelatorio2 = jMenuItemGerarRelatorio2;
    }

    public JMenuItem getjMenuItemGerarRelatorio3() {
        return jMenuItemGerarRelatorio3;
    }

    public void setjMenuItemGerarRelatorio3(JMenuItem jMenuItemGerarRelatorio3) {
        this.jMenuItemGerarRelatorio3 = jMenuItemGerarRelatorio3;
    }

    public JMenuItem getjMenuItemGerarRelatorio4() {
        return jMenuItemGerarRelatorio4;
    }

    public void setjMenuItemGerarRelatorio4(JMenuItem jMenuItemGerarRelatorio4) {
        this.jMenuItemGerarRelatorio4 = jMenuItemGerarRelatorio4;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTable getjTableConsultaAluno() {
        return jTableConsultaAluno;
    }

    public void setjTableConsultaAluno(JTable jTableConsultaAluno) {
        this.jTableConsultaAluno = jTableConsultaAluno;
    }

    public JTable getjTableConsultaInstrutor() {
        return jTableConsultaInstrutor;
    }

    public void setjTableConsultaInstrutor(JTable jTableConsultaInstrutor) {
        this.jTableConsultaInstrutor = jTableConsultaInstrutor;
    }

    public JTextField getjTextField15() {
        return jTextField15;
    }

    public void setjTextField15(JTextField jTextField15) {
        this.jTextField15 = jTextField15;
    }

    public JTextField getjTextField17() {
        return jTextField17;
    }

    public void setjTextField17(JTextField jTextField17) {
        this.jTextField17 = jTextField17;
    }

    public JTextField getjTextFieldBairroAluno() {
        return jTextFieldBairroAluno;
    }

    public void setjTextFieldBairroAluno(JTextField jTextFieldBairroAluno) {
        this.jTextFieldBairroAluno = jTextFieldBairroAluno;
    }

    public JTextField getjTextFieldBairroInstrutor() {
        return jTextFieldBairroInstrutor;
    }

    public void setjTextFieldBairroInstrutor(JTextField jTextFieldBairroInstrutor) {
        this.jTextFieldBairroInstrutor = jTextFieldBairroInstrutor;
    }

    public JTextField getjTextFieldBuscaAluno() {
        return jTextFieldBuscaAluno;
    }

    public void setjTextFieldBuscaAluno(JTextField jTextFieldBuscaAluno) {
        this.jTextFieldBuscaAluno = jTextFieldBuscaAluno;
    }

    public JTextField getjTextFieldBuscaInstrutor() {
        return jTextFieldBuscaInstrutor;
    }

    public void setjTextFieldBuscaInstrutor(JTextField jTextFieldBuscaInstrutor) {
        this.jTextFieldBuscaInstrutor = jTextFieldBuscaInstrutor;
    }

    public JTextField getjTextFieldCelularAluno() {
        return jTextFieldCelularAluno;
    }

    public void setjTextFieldCelularAluno(JTextField jTextFieldCelularAluno) {
        this.jTextFieldCelularAluno = jTextFieldCelularAluno;
    }

    public JTextField getjTextFieldCelularInstrutor() {
        return jTextFieldCelularInstrutor;
    }

    public void setjTextFieldCelularInstrutor(JTextField jTextFieldCelularInstrutor) {
        this.jTextFieldCelularInstrutor = jTextFieldCelularInstrutor;
    }

    public JTextField getjTextFieldCidadeAluno() {
        return jTextFieldCidadeAluno;
    }

    public void setjTextFieldCidadeAluno(JTextField jTextFieldCidadeAluno) {
        this.jTextFieldCidadeAluno = jTextFieldCidadeAluno;
    }

    public JTextField getjTextFieldCidadeInstrutor() {
        return jTextFieldCidadeInstrutor;
    }

    public void setjTextFieldCidadeInstrutor(JTextField jTextFieldCidadeInstrutor) {
        this.jTextFieldCidadeInstrutor = jTextFieldCidadeInstrutor;
    }

    public JTextField getjTextFieldEnderecoAluno() {
        return jTextFieldEnderecoAluno;
    }

    public JTextField getjTextFieldIdadeInstrutor() {
        return jTextFieldIdadeInstrutor;
    }

    public void setjTextFieldIdadeInstrutor(JTextField jTextFieldIdadeInstrutor) {
        this.jTextFieldIdadeInstrutor = jTextFieldIdadeInstrutor;
    }

    public JTextField getjTextFieldInstrutorAluno() {
        return jTextFieldInstrutorAluno;
    }

    public void setjTextFieldInstrutorAluno(JTextField jTextFieldInstrutorAluno) {
        this.jTextFieldInstrutorAluno = jTextFieldInstrutorAluno;
    }

    public JTextField getjTextFieldNomeAluno() {
        return jTextFieldNomeAluno;
    }

    public void setjTextFieldNomeAluno(JTextField jTextFieldNomeAluno) {
        this.jTextFieldNomeAluno = jTextFieldNomeAluno;
    }

    public JTextField getjTextFieldNomeInstrutor() {
        return jTextFieldNomeInstrutor;
    }

    public void setjTextFieldNomeInstrutor(JTextField jTextFieldNomeInstrutor) {
        this.jTextFieldNomeInstrutor = jTextFieldNomeInstrutor;
    }

    public JTextField getjTextFieldSalarioInstrutor() {
        return jTextFieldSalarioInstrutor;
    }

    public void setjTextFieldSalarioInstrutor(JTextField jTextFieldSalarioInstrutor) {
        this.jTextFieldSalarioInstrutor = jTextFieldSalarioInstrutor;
    }

    
    public void setjTextFieldEnderecoAluno(JTextField jTextFieldEnderecoAluno) {
        this.jTextFieldEnderecoAluno = jTextFieldEnderecoAluno;
    }

    public JTextField getjTextFieldEnderecoInstrutor() {
        return jTextFieldEnderecoInstrutor;
    }

    public void setjTextFieldEnderecoInstrutor(JTextField jTextFieldEnderecoInstrutor) {
        this.jTextFieldEnderecoInstrutor = jTextFieldEnderecoInstrutor;
    }

    public JTextField getjTextFieldUFAluno() {
        return jTextFieldIdadeAluno;
    }

    public void setjTextFieldUFAluno(JTextField jTextFieldUFAluno) {
        this.jTextFieldIdadeAluno = jTextFieldUFAluno;
    }

    public JTextField getjTextFieldUFInstrutor() {
        return jTextFieldUFInstrutor;
    }

    public void setjTextFieldUFInstrutor(JTextField jTextFieldUFInstrutor) {
        this.jTextFieldUFInstrutor = jTextFieldUFInstrutor;
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
        jInternalFrameCadastroInstrutor = new javax.swing.JInternalFrame();
        jLabelAlunoNome12 = new javax.swing.JLabel();
        jLabelAlunoNome13 = new javax.swing.JLabel();
        jTextFieldNomeInstrutor = new javax.swing.JTextField();
        jLabelAlunoNome14 = new javax.swing.JLabel();
        jLabelAlunoNome15 = new javax.swing.JLabel();
        jLabelAlunoNome16 = new javax.swing.JLabel();
        jLabelAlunoNome17 = new javax.swing.JLabel();
        jLabelAlunoNome18 = new javax.swing.JLabel();
        jLabelAlunoNome19 = new javax.swing.JLabel();
        jTextFieldEnderecoInstrutor = new javax.swing.JTextField();
        jTextFieldBairroInstrutor = new javax.swing.JTextField();
        jLabelAlunoNome22 = new javax.swing.JLabel();
        jComboBoxSexoInstrutor = new javax.swing.JComboBox<>();
        jButtonCancelarCadastroInstrutor = new javax.swing.JButton();
        jTextFieldUFInstrutor = new javax.swing.JTextField();
        jButtonCadastrarInstrutor = new javax.swing.JButton();
        jFormattedTextFieldCEPInstrutor = new javax.swing.JFormattedTextField();
        jLabelAlunoNome23 = new javax.swing.JLabel();
        jTextFieldCidadeInstrutor = new javax.swing.JTextField();
        jFormattedTextFieldDataContratoInicial = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPFInstrutor = new javax.swing.JFormattedTextField();
        jTextFieldCelularInstrutor = new javax.swing.JTextField();
        jLabelAlunoNome25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextFieldSalarioInstrutor = new javax.swing.JTextField();
        jTextFieldIdadeInstrutor = new javax.swing.JTextField();
        jLabelAlunoNome20 = new javax.swing.JLabel();
        jInternalFrameCadastroAluno = new javax.swing.JInternalFrame();
        jLabelAlunoNome = new javax.swing.JLabel();
        jLabelAlunoNome1 = new javax.swing.JLabel();
        jTextFieldNomeAluno = new javax.swing.JTextField();
        jLabelAlunoNome2 = new javax.swing.JLabel();
        jLabelAlunoNome3 = new javax.swing.JLabel();
        jLabelAlunoNome4 = new javax.swing.JLabel();
        jLabelAlunoNome5 = new javax.swing.JLabel();
        jLabelAlunoNome6 = new javax.swing.JLabel();
        jLabelAlunoNome7 = new javax.swing.JLabel();
        jComboBoxMensalidadeAluno = new javax.swing.JComboBox<>();
        jLabelAlunoNome8 = new javax.swing.JLabel();
        jTextFieldEnderecoAluno = new javax.swing.JTextField();
        jTextFieldBairroAluno = new javax.swing.JTextField();
        jTextFieldCelularAluno = new javax.swing.JTextField();
        jLabelAlunoNome9 = new javax.swing.JLabel();
        jLabelAlunoNome10 = new javax.swing.JLabel();
        jComboBoxSexoAluno = new javax.swing.JComboBox<>();
        jButtonCancelarCadastroAluno = new javax.swing.JButton();
        jTextFieldIdadeAluno = new javax.swing.JTextField();
        jButtonCadastrarAluno = new javax.swing.JButton();
        jFormattedTextFieldCEPAluno = new javax.swing.JFormattedTextField();
        jLabelAlunoNome11 = new javax.swing.JLabel();
        jTextFieldCidadeAluno = new javax.swing.JTextField();
        jFormattedTextFieldDataMatricula = new javax.swing.JFormattedTextField();
        jTextFieldInstrutorAluno = new javax.swing.JTextField();
        jLabelAlunoNome21 = new javax.swing.JLabel();
        jFormattedTextFieldCPFAluno = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPFAluno2 = new javax.swing.JFormattedTextField();
        jTextFieldUFAluno1 = new javax.swing.JTextField();
        jInternalFrameConsultaInstrutor = new javax.swing.JInternalFrame();
        jLabelNomeBuscaAluno1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsultaInstrutor = new javax.swing.JTable();
        jTextFieldBuscaInstrutor = new javax.swing.JTextField();
        jButtonBuscarInstrutor = new javax.swing.JButton();
        jButtonMostrarTodosInstrutores = new javax.swing.JButton();
        jButtonFecharConsultaInstrutor = new javax.swing.JButton();
        jInternalFrameConsultaAluno = new javax.swing.JInternalFrame();
        jLabelNomeBuscaAluno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaAluno = new javax.swing.JTable();
        jTextFieldBuscaAluno = new javax.swing.JTextField();
        jButtonBuscarAluno = new javax.swing.JButton();
        jButtonMostrarTodosAlunos = new javax.swing.JButton();
        jButtonFecharConsultaAluno = new javax.swing.JButton();
        jLabelDesktopBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlunos = new javax.swing.JMenu();
        jMenuItemCadastroAluno = new javax.swing.JMenuItem();
        jMenuItemConsultaAluno = new javax.swing.JMenuItem();
        jMenuInstrutores = new javax.swing.JMenu();
        jMenuItemCadastroInstrutor = new javax.swing.JMenuItem();
        jMenuItemConsultaInstrutor = new javax.swing.JMenuItem();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenuItemGerarRelatorio1 = new javax.swing.JMenuItem();
        jMenuItemGerarRelatorio2 = new javax.swing.JMenuItem();
        jMenuItemGerarRelatorio3 = new javax.swing.JMenuItem();
        jMenuItemGerarRelatorio4 = new javax.swing.JMenuItem();

        jToggleButton1.setText("jToggleButton1");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FitLife Academia - Secretaria");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrameCadastroInstrutor.setBackground(new java.awt.Color(204, 204, 204));
        jInternalFrameCadastroInstrutor.setTitle("Cadastrar instrutor");
        jInternalFrameCadastroInstrutor.setVisible(true);
        jInternalFrameCadastroInstrutor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAlunoNome12.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome12.setText("UF:");
        jInternalFrameCadastroInstrutor.getContentPane().add(jLabelAlunoNome12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabelAlunoNome13.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome13.setText("Nome:");
        jInternalFrameCadastroInstrutor.getContentPane().add(jLabelAlunoNome13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTextFieldNomeInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldNomeInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeInstrutorActionPerformed(evt);
            }
        });
        jInternalFrameCadastroInstrutor.getContentPane().add(jTextFieldNomeInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 280, 25));

        jLabelAlunoNome14.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome14.setText("CPF:");
        jInternalFrameCadastroInstrutor.getContentPane().add(jLabelAlunoNome14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabelAlunoNome15.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome15.setText("Endereço:");
        jInternalFrameCadastroInstrutor.getContentPane().add(jLabelAlunoNome15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabelAlunoNome16.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome16.setText("Bairro:");
        jInternalFrameCadastroInstrutor.getContentPane().add(jLabelAlunoNome16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabelAlunoNome17.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome17.setText("Cidade:");
        jInternalFrameCadastroInstrutor.getContentPane().add(jLabelAlunoNome17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabelAlunoNome18.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome18.setText("Sexo:");
        jInternalFrameCadastroInstrutor.getContentPane().add(jLabelAlunoNome18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabelAlunoNome19.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome19.setText("CEP:");
        jInternalFrameCadastroInstrutor.getContentPane().add(jLabelAlunoNome19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jTextFieldEnderecoInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldEnderecoInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoInstrutorActionPerformed(evt);
            }
        });
        jInternalFrameCadastroInstrutor.getContentPane().add(jTextFieldEnderecoInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 250, 25));

        jTextFieldBairroInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldBairroInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroInstrutorActionPerformed(evt);
            }
        });
        jInternalFrameCadastroInstrutor.getContentPane().add(jTextFieldBairroInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 140, 25));

        jLabelAlunoNome22.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome22.setText("Celular:");
        jInternalFrameCadastroInstrutor.getContentPane().add(jLabelAlunoNome22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jComboBoxSexoInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jComboBoxSexoInstrutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outro" }));
        jInternalFrameCadastroInstrutor.getContentPane().add(jComboBoxSexoInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 90, -1));

        jButtonCancelarCadastroInstrutor.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancelarCadastroInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jButtonCancelarCadastroInstrutor.setText("Fechar");
        jButtonCancelarCadastroInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroInstrutorActionPerformed(evt);
            }
        });
        jInternalFrameCadastroInstrutor.getContentPane().add(jButtonCancelarCadastroInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 120, 30));

        jTextFieldUFInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldUFInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUFInstrutorActionPerformed(evt);
            }
        });
        jInternalFrameCadastroInstrutor.getContentPane().add(jTextFieldUFInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 40, 25));

        jButtonCadastrarInstrutor.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jButtonCadastrarInstrutor.setText("Cadastrar");
        jButtonCadastrarInstrutor.setEnabled(false);
        jButtonCadastrarInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarInstrutorActionPerformed(evt);
            }
        });
        jInternalFrameCadastroInstrutor.getContentPane().add(jButtonCadastrarInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 120, 30));

        try {
            jFormattedTextFieldCEPInstrutor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCEPInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jInternalFrameCadastroInstrutor.getContentPane().add(jFormattedTextFieldCEPInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 90, -1));

        jLabelAlunoNome23.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome23.setText("Data de início:");
        jInternalFrameCadastroInstrutor.getContentPane().add(jLabelAlunoNome23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jTextFieldCidadeInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldCidadeInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeInstrutorActionPerformed(evt);
            }
        });
        jInternalFrameCadastroInstrutor.getContentPane().add(jTextFieldCidadeInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 190, 25));

        try {
            jFormattedTextFieldDataContratoInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataContratoInicial.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jInternalFrameCadastroInstrutor.getContentPane().add(jFormattedTextFieldDataContratoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 100, 25));

        try {
            jFormattedTextFieldCPFInstrutor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPFInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jInternalFrameCadastroInstrutor.getContentPane().add(jFormattedTextFieldCPFInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 150, -1));

        jTextFieldCelularInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldCelularInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCelularInstrutorActionPerformed(evt);
            }
        });
        jInternalFrameCadastroInstrutor.getContentPane().add(jTextFieldCelularInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 170, 25));

        jLabelAlunoNome25.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome25.setText("Salário:");
        jInternalFrameCadastroInstrutor.getContentPane().add(jLabelAlunoNome25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel1.setText("Senha:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jTextField15.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 110, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel2.setText("Usuário:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jTextField17.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 110, 20));

        jInternalFrameCadastroInstrutor.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 330, 70));

        jTextFieldSalarioInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldSalarioInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalarioInstrutorActionPerformed(evt);
            }
        });
        jInternalFrameCadastroInstrutor.getContentPane().add(jTextFieldSalarioInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 110, 30));

        jTextFieldIdadeInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldIdadeInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdadeInstrutorActionPerformed(evt);
            }
        });
        jInternalFrameCadastroInstrutor.getContentPane().add(jTextFieldIdadeInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 40, 25));

        jLabelAlunoNome20.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome20.setText("Idade:");
        jInternalFrameCadastroInstrutor.getContentPane().add(jLabelAlunoNome20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 50, -1));

        jDesktopPaneSecretaria.add(jInternalFrameCadastroInstrutor);
        jInternalFrameCadastroInstrutor.setBounds(20, 20, 370, 430);

        jInternalFrameCadastroAluno.setBackground(new java.awt.Color(204, 204, 204));
        jInternalFrameCadastroAluno.setTitle("Cadastrar aluno");
        jInternalFrameCadastroAluno.setVisible(true);
        jInternalFrameCadastroAluno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAlunoNome.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome.setText("UF:");
        jInternalFrameCadastroAluno.getContentPane().add(jLabelAlunoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabelAlunoNome1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome1.setText("Nome:");
        jInternalFrameCadastroAluno.getContentPane().add(jLabelAlunoNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTextFieldNomeAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeAlunoActionPerformed(evt);
            }
        });
        jInternalFrameCadastroAluno.getContentPane().add(jTextFieldNomeAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, 280, 25));

        jLabelAlunoNome2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome2.setText("CPF:");
        jInternalFrameCadastroAluno.getContentPane().add(jLabelAlunoNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabelAlunoNome3.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome3.setText("Endereço:");
        jInternalFrameCadastroAluno.getContentPane().add(jLabelAlunoNome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabelAlunoNome4.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome4.setText("Bairro:");
        jInternalFrameCadastroAluno.getContentPane().add(jLabelAlunoNome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabelAlunoNome5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome5.setText("Cidade:");
        jInternalFrameCadastroAluno.getContentPane().add(jLabelAlunoNome5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabelAlunoNome6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome6.setText("Sexo:");
        jInternalFrameCadastroAluno.getContentPane().add(jLabelAlunoNome6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabelAlunoNome7.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome7.setText("CEP:");
        jInternalFrameCadastroAluno.getContentPane().add(jLabelAlunoNome7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jComboBoxMensalidadeAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jComboBoxMensalidadeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMensalidadeAlunoActionPerformed(evt);
            }
        });
        jInternalFrameCadastroAluno.getContentPane().add(jComboBoxMensalidadeAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 160, -1));

        jLabelAlunoNome8.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome8.setText("Mensalidade:");
        jInternalFrameCadastroAluno.getContentPane().add(jLabelAlunoNome8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jTextFieldEnderecoAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldEnderecoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoAlunoActionPerformed(evt);
            }
        });
        jInternalFrameCadastroAluno.getContentPane().add(jTextFieldEnderecoAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 250, 25));

        jTextFieldBairroAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldBairroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroAlunoActionPerformed(evt);
            }
        });
        jInternalFrameCadastroAluno.getContentPane().add(jTextFieldBairroAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 140, 25));

        jTextFieldCelularAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldCelularAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCelularAlunoActionPerformed(evt);
            }
        });
        jInternalFrameCadastroAluno.getContentPane().add(jTextFieldCelularAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 170, 25));

        jLabelAlunoNome9.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome9.setText("Instrutor:");
        jInternalFrameCadastroAluno.getContentPane().add(jLabelAlunoNome9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabelAlunoNome10.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome10.setText("Celular:");
        jInternalFrameCadastroAluno.getContentPane().add(jLabelAlunoNome10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jComboBoxSexoAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jComboBoxSexoAluno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outro" }));
        jInternalFrameCadastroAluno.getContentPane().add(jComboBoxSexoAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 90, -1));

        jButtonCancelarCadastroAluno.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancelarCadastroAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jButtonCancelarCadastroAluno.setText("Fechar");
        jButtonCancelarCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroAlunoActionPerformed(evt);
            }
        });
        jInternalFrameCadastroAluno.getContentPane().add(jButtonCancelarCadastroAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 120, 30));

        jTextFieldIdadeAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldIdadeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdadeAlunoActionPerformed(evt);
            }
        });
        jInternalFrameCadastroAluno.getContentPane().add(jTextFieldIdadeAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 40, 25));

        jButtonCadastrarAluno.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jButtonCadastrarAluno.setText("Cadastrar");
        jButtonCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarAlunoActionPerformed(evt);
            }
        });
        jInternalFrameCadastroAluno.getContentPane().add(jButtonCadastrarAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 120, 30));

        try {
            jFormattedTextFieldCEPAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCEPAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jInternalFrameCadastroAluno.getContentPane().add(jFormattedTextFieldCEPAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 90, -1));

        jLabelAlunoNome11.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome11.setText("Data de início:");
        jInternalFrameCadastroAluno.getContentPane().add(jLabelAlunoNome11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jTextFieldCidadeAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldCidadeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeAlunoActionPerformed(evt);
            }
        });
        jInternalFrameCadastroAluno.getContentPane().add(jTextFieldCidadeAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 190, 25));

        try {
            jFormattedTextFieldDataMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataMatricula.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jInternalFrameCadastroAluno.getContentPane().add(jFormattedTextFieldDataMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 70, 25));

        jTextFieldInstrutorAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldInstrutorAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInstrutorAlunoActionPerformed(evt);
            }
        });
        jInternalFrameCadastroAluno.getContentPane().add(jTextFieldInstrutorAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 260, 25));

        jLabelAlunoNome21.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelAlunoNome21.setText("Idade:");
        jInternalFrameCadastroAluno.getContentPane().add(jLabelAlunoNome21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 50, -1));

        try {
            jFormattedTextFieldCPFAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPFAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jInternalFrameCadastroAluno.getContentPane().add(jFormattedTextFieldCPFAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 150, -1));

        try {
            jFormattedTextFieldCPFAluno2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPFAluno2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jInternalFrameCadastroAluno.getContentPane().add(jFormattedTextFieldCPFAluno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 150, -1));

        jTextFieldUFAluno1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextFieldUFAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUFAluno1ActionPerformed(evt);
            }
        });
        jInternalFrameCadastroAluno.getContentPane().add(jTextFieldUFAluno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 40, 25));

        jDesktopPaneSecretaria.add(jInternalFrameCadastroAluno);
        jInternalFrameCadastroAluno.setBounds(20, 20, 370, 380);

        jInternalFrameConsultaInstrutor.setTitle("Consultar instrutor");
        jInternalFrameConsultaInstrutor.setVisible(true);
        jInternalFrameConsultaInstrutor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNomeBuscaAluno1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelNomeBuscaAluno1.setText("Nome:");
        jInternalFrameConsultaInstrutor.getContentPane().add(jLabelNomeBuscaAluno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 50, -1));

        jTableConsultaInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTableConsultaInstrutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Salario R$", "Idade", "Sexo", "Celular", "Data Inicio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableConsultaInstrutor);

        jInternalFrameConsultaInstrutor.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 670, 170));

        jTextFieldBuscaInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jInternalFrameConsultaInstrutor.getContentPane().add(jTextFieldBuscaInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 370, 30));

        jButtonBuscarInstrutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/search.png"))); // NOI18N
        jButtonBuscarInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarInstrutorActionPerformed(evt);
            }
        });
        jInternalFrameConsultaInstrutor.getContentPane().add(jButtonBuscarInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 40, 30));

        jButtonMostrarTodosInstrutores.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jButtonMostrarTodosInstrutores.setText("Exibir todos");
        jButtonMostrarTodosInstrutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTodosInstrutoresActionPerformed(evt);
            }
        });
        jInternalFrameConsultaInstrutor.getContentPane().add(jButtonMostrarTodosInstrutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 110, 30));

        jButtonFecharConsultaInstrutor.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jButtonFecharConsultaInstrutor.setText("Fechar");
        jButtonFecharConsultaInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharConsultaInstrutorActionPerformed(evt);
            }
        });
        jInternalFrameConsultaInstrutor.getContentPane().add(jButtonFecharConsultaInstrutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 110, 30));

        jDesktopPaneSecretaria.add(jInternalFrameConsultaInstrutor);
        jInternalFrameConsultaInstrutor.setBounds(10, 10, 710, 450);

        jInternalFrameConsultaAluno.setTitle("Consultar aluno");
        jInternalFrameConsultaAluno.setVisible(true);
        jInternalFrameConsultaAluno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNomeBuscaAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabelNomeBuscaAluno.setText("Nome:");
        jInternalFrameConsultaAluno.getContentPane().add(jLabelNomeBuscaAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 50, -1));

        jTableConsultaAluno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTableConsultaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Matricula", "Idade", "Sexo", "Celular", "Data de Matricula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
        jInternalFrameConsultaAluno.setBounds(10, 10, 710, 450);

        jLabelDesktopBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/backgroundDesktop1.png"))); // NOI18N
        jDesktopPaneSecretaria.add(jLabelDesktopBackground);
        jLabelDesktopBackground.setBounds(-15, 0, 970, 568);

        getContentPane().add(jDesktopPaneSecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 550));

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenuAlunos.setText("Alunos");

        jMenuItemCadastroAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/addaluno.png"))); // NOI18N
        jMenuItemCadastroAluno.setText("Cadastro");
        jMenuItemCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroAlunoActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemCadastroAluno);

        jMenuItemConsultaAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/search.png"))); // NOI18N
        jMenuItemConsultaAluno.setText("Consulta");
        jMenuItemConsultaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaAlunoActionPerformed(evt);
            }
        });
        jMenuAlunos.add(jMenuItemConsultaAluno);

        jMenuBar1.add(jMenuAlunos);

        jMenuInstrutores.setText("Instrutores");

        jMenuItemCadastroInstrutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/addinstrutor.png"))); // NOI18N
        jMenuItemCadastroInstrutor.setText("Cadastro");
        jMenuItemCadastroInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroInstrutorActionPerformed(evt);
            }
        });
        jMenuInstrutores.add(jMenuItemCadastroInstrutor);

        jMenuItemConsultaInstrutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/search.png"))); // NOI18N
        jMenuItemConsultaInstrutor.setText("Consulta");
        jMenuItemConsultaInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaInstrutorActionPerformed(evt);
            }
        });
        jMenuInstrutores.add(jMenuItemConsultaInstrutor);

        jMenuBar1.add(jMenuInstrutores);

        jMenuFinanceiro.setText("Financeiro");

        jMenuItemGerarRelatorio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/relatorio.png"))); // NOI18N
        jMenuItemGerarRelatorio1.setText("Gerar relatório 1");
        jMenuItemGerarRelatorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerarRelatorio1ActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemGerarRelatorio1);

        jMenuItemGerarRelatorio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/relatorio.png"))); // NOI18N
        jMenuItemGerarRelatorio2.setText("Gerar relatório 2");
        jMenuItemGerarRelatorio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerarRelatorio2ActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemGerarRelatorio2);

        jMenuItemGerarRelatorio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/relatorio.png"))); // NOI18N
        jMenuItemGerarRelatorio3.setText("Gerar relatório 3");
        jMenuItemGerarRelatorio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerarRelatorio3ActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemGerarRelatorio3);

        jMenuItemGerarRelatorio4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icons/relatorio.png"))); // NOI18N
        jMenuItemGerarRelatorio4.setText("Gerar relatório 4");
        jMenuItemGerarRelatorio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerarRelatorio4ActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemGerarRelatorio4);

        jMenuBar1.add(jMenuFinanceiro);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JComboBox<String> getjComboBoxInstrutorAluno() {
        return jComboBoxMensalidadeAluno;
    }

    public void setjComboBoxInstrutorAluno(JComboBox<String> jComboBoxInstrutorAluno) {
        this.jComboBoxMensalidadeAluno = jComboBoxInstrutorAluno;
    }

    public JTextField getjTextFieldIdadeAluno() {
        return jTextFieldIdadeAluno;
    }

    public void setjTextFieldIdadeAluno(JTextField jTextFieldIdadeAluno) {
        this.jTextFieldIdadeAluno = jTextFieldIdadeAluno;
    }

    public JTextField getjTextFieldUFAluno1() {
        return jTextFieldUFAluno1;
    }

    public void setjTextFieldUFAluno1(JTextField jTextFieldUFAluno1) {
        this.jTextFieldUFAluno1 = jTextFieldUFAluno1;
    }
    
    
    
    private void jMenuItemCadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroAlunoActionPerformed
        jInternalFrameCadastroAluno.setVisible(true);
        controller.preencherPlanos();
    }//GEN-LAST:event_jMenuItemCadastroAlunoActionPerformed

    private void jMenuItemCadastroInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroInstrutorActionPerformed
        jInternalFrameCadastroInstrutor.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroInstrutorActionPerformed

    private void jMenuItemGerarRelatorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerarRelatorio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemGerarRelatorio1ActionPerformed

    private void jMenuItemConsultaInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaInstrutorActionPerformed
        jInternalFrameConsultaInstrutor.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultaInstrutorActionPerformed

    private void jMenuItemConsultaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaAlunoActionPerformed
        jInternalFrameConsultaAluno.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemConsultaAlunoActionPerformed

    private void jButtonMostrarTodosAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTodosAlunosActionPerformed
        readJtable();
    }//GEN-LAST:event_jButtonMostrarTodosAlunosActionPerformed

    private void jButtonFecharConsultaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharConsultaAlunoActionPerformed
        jInternalFrameConsultaAluno.setVisible(false);
    }//GEN-LAST:event_jButtonFecharConsultaAlunoActionPerformed

    private void jTextFieldNomeInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeInstrutorActionPerformed

    private void jTextFieldEnderecoInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoInstrutorActionPerformed

    private void jTextFieldBairroInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroInstrutorActionPerformed

    private void jButtonCancelarCadastroInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroInstrutorActionPerformed
        jInternalFrameCadastroInstrutor.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarCadastroInstrutorActionPerformed

    private void jTextFieldUFInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUFInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUFInstrutorActionPerformed

    private void jTextFieldCidadeInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeInstrutorActionPerformed

    private void jTextFieldCelularInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCelularInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCelularInstrutorActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextFieldSalarioInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalarioInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalarioInstrutorActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButtonMostrarTodosInstrutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTodosInstrutoresActionPerformed
        readJtableInstrutor();
    }//GEN-LAST:event_jButtonMostrarTodosInstrutoresActionPerformed

    private void jButtonFecharConsultaInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharConsultaInstrutorActionPerformed
        jInternalFrameConsultaInstrutor.setVisible(false);
    }//GEN-LAST:event_jButtonFecharConsultaInstrutorActionPerformed

    private void jButtonCadastrarInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarInstrutorActionPerformed
           if(controller.isEmptyInstrutor()==false){
           boolean inserido = controller.inserirTudoInstrutor(controller.cadastrarEndereco());
            
            if(inserido=true){
                controller.alertaSucesso("Novo instrutor(a) cadastrado!");
                controller.clearInstrutor();
                int x = controller.recuperaLASTID();
                System.out.println(x);
            }else{
                controller.alertaErro("Algo deu errado, contate o suporte.");
            }
        } else {
            controller.alertaUsuario("Preencha todos os campos.");
        }
        
    }//GEN-LAST:event_jButtonCadastrarInstrutorActionPerformed

    private void jTextFieldIdadeInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdadeInstrutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdadeInstrutorActionPerformed

    private void jMenuItemGerarRelatorio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerarRelatorio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemGerarRelatorio2ActionPerformed

    private void jMenuItemGerarRelatorio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerarRelatorio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemGerarRelatorio3ActionPerformed

    private void jMenuItemGerarRelatorio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerarRelatorio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemGerarRelatorio4ActionPerformed

    private void jTextFieldUFAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUFAluno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUFAluno1ActionPerformed

    private void jTextFieldInstrutorAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInstrutorAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInstrutorAlunoActionPerformed

    private void jTextFieldCidadeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeAlunoActionPerformed

    private void jButtonCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarAlunoActionPerformed
        if(controller.isEmptyAluno()==false){
            boolean inseridoAluno = controller.inserirTudoAluno(controller.cadastrarEnderecoAluno());
            if(inseridoAluno==true){
                controller.alertaSucesso("Aluno(a) matriculado(a) com sucesso!");
                controller.clearAluno();
            }else{
                controller.alertaErro("Algo deu errado, contate o suporte.");
            }
        } else {
            controller.alertaUsuario("Preencha todos os campos.");
        }

    }//GEN-LAST:event_jButtonCadastrarAlunoActionPerformed

    private void jTextFieldIdadeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdadeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdadeAlunoActionPerformed

    private void jButtonCancelarCadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroAlunoActionPerformed
        jInternalFrameCadastroAluno.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarCadastroAlunoActionPerformed

    private void jTextFieldCelularAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCelularAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCelularAlunoActionPerformed

    private void jTextFieldBairroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroAlunoActionPerformed

    private void jTextFieldEnderecoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoAlunoActionPerformed

    private void jComboBoxMensalidadeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMensalidadeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMensalidadeAlunoActionPerformed

    private void jTextFieldNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeAlunoActionPerformed

    private void jButtonBuscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAlunoActionPerformed
        readJtableSpecific();
    }//GEN-LAST:event_jButtonBuscarAlunoActionPerformed

    private void jButtonBuscarInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarInstrutorActionPerformed
        readJtableSpecificInstrutor();
    }//GEN-LAST:event_jButtonBuscarInstrutorActionPerformed

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
            java.util.logging.Logger.getLogger(DesktopSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesktopSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesktopSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesktopSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesktopSecretaria().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarAluno;
    private javax.swing.JButton jButtonBuscarInstrutor;
    private javax.swing.JButton jButtonCadastrarAluno;
    private javax.swing.JButton jButtonCadastrarInstrutor;
    private javax.swing.JButton jButtonCancelarCadastroAluno;
    private javax.swing.JButton jButtonCancelarCadastroInstrutor;
    private javax.swing.JButton jButtonFecharConsultaAluno;
    private javax.swing.JButton jButtonFecharConsultaInstrutor;
    private javax.swing.JButton jButtonMostrarTodosAlunos;
    private javax.swing.JButton jButtonMostrarTodosInstrutores;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBoxMensalidadeAluno;
    private javax.swing.JComboBox<String> jComboBoxSexoAluno;
    private javax.swing.JComboBox<String> jComboBoxSexoInstrutor;
    private javax.swing.JDesktopPane jDesktopPaneSecretaria;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEPAluno;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEPInstrutor;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPFAluno;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPFAluno2;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPFInstrutor;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataContratoInicial;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataMatricula;
    private javax.swing.JInternalFrame jInternalFrameCadastroAluno;
    private javax.swing.JInternalFrame jInternalFrameCadastroInstrutor;
    private javax.swing.JInternalFrame jInternalFrameConsultaAluno;
    private javax.swing.JInternalFrame jInternalFrameConsultaInstrutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAlunoNome;
    private javax.swing.JLabel jLabelAlunoNome1;
    private javax.swing.JLabel jLabelAlunoNome10;
    private javax.swing.JLabel jLabelAlunoNome11;
    private javax.swing.JLabel jLabelAlunoNome12;
    private javax.swing.JLabel jLabelAlunoNome13;
    private javax.swing.JLabel jLabelAlunoNome14;
    private javax.swing.JLabel jLabelAlunoNome15;
    private javax.swing.JLabel jLabelAlunoNome16;
    private javax.swing.JLabel jLabelAlunoNome17;
    private javax.swing.JLabel jLabelAlunoNome18;
    private javax.swing.JLabel jLabelAlunoNome19;
    private javax.swing.JLabel jLabelAlunoNome2;
    private javax.swing.JLabel jLabelAlunoNome20;
    private javax.swing.JLabel jLabelAlunoNome21;
    private javax.swing.JLabel jLabelAlunoNome22;
    private javax.swing.JLabel jLabelAlunoNome23;
    private javax.swing.JLabel jLabelAlunoNome25;
    private javax.swing.JLabel jLabelAlunoNome3;
    private javax.swing.JLabel jLabelAlunoNome4;
    private javax.swing.JLabel jLabelAlunoNome5;
    private javax.swing.JLabel jLabelAlunoNome6;
    private javax.swing.JLabel jLabelAlunoNome7;
    private javax.swing.JLabel jLabelAlunoNome8;
    private javax.swing.JLabel jLabelAlunoNome9;
    private javax.swing.JLabel jLabelDesktopBackground;
    private javax.swing.JLabel jLabelNomeBuscaAluno;
    private javax.swing.JLabel jLabelNomeBuscaAluno1;
    private javax.swing.JMenu jMenuAlunos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFinanceiro;
    private javax.swing.JMenu jMenuInstrutores;
    private javax.swing.JMenuItem jMenuItemCadastroAluno;
    private javax.swing.JMenuItem jMenuItemCadastroInstrutor;
    private javax.swing.JMenuItem jMenuItemConsultaAluno;
    private javax.swing.JMenuItem jMenuItemConsultaInstrutor;
    private javax.swing.JMenuItem jMenuItemGerarRelatorio1;
    private javax.swing.JMenuItem jMenuItemGerarRelatorio2;
    private javax.swing.JMenuItem jMenuItemGerarRelatorio3;
    private javax.swing.JMenuItem jMenuItemGerarRelatorio4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConsultaAluno;
    private javax.swing.JTable jTableConsultaInstrutor;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextFieldBairroAluno;
    private javax.swing.JTextField jTextFieldBairroInstrutor;
    private javax.swing.JTextField jTextFieldBuscaAluno;
    private javax.swing.JTextField jTextFieldBuscaInstrutor;
    private javax.swing.JTextField jTextFieldCelularAluno;
    private javax.swing.JTextField jTextFieldCelularInstrutor;
    private javax.swing.JTextField jTextFieldCidadeAluno;
    private javax.swing.JTextField jTextFieldCidadeInstrutor;
    private javax.swing.JTextField jTextFieldEnderecoAluno;
    private javax.swing.JTextField jTextFieldEnderecoInstrutor;
    private javax.swing.JTextField jTextFieldIdadeAluno;
    private javax.swing.JTextField jTextFieldIdadeInstrutor;
    private javax.swing.JTextField jTextFieldInstrutorAluno;
    private javax.swing.JTextField jTextFieldNomeAluno;
    private javax.swing.JTextField jTextFieldNomeInstrutor;
    private javax.swing.JTextField jTextFieldSalarioInstrutor;
    private javax.swing.JTextField jTextFieldUFAluno1;
    private javax.swing.JTextField jTextFieldUFInstrutor;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    public JFormattedTextField getjFormattedTextFieldCPFAluno() {
        return jFormattedTextFieldCPFAluno;
    }

    public void setjFormattedTextFieldCPFAluno(JFormattedTextField jFormattedTextFieldCPFAluno) {
        this.jFormattedTextFieldCPFAluno = jFormattedTextFieldCPFAluno;
    }


    public void readJtable(){
            ArrayList<Aluno> lista = controller.selecionarTodosAlunos();
            DefaultTableModel modelo = (DefaultTableModel) jTableConsultaAluno.getModel();
            modelo.setRowCount(0);
            if(!lista.isEmpty()){
                for(Aluno aluno: lista){
                    modelo.addRow(new String[]{
                        aluno.getNome(),
                        String.valueOf(aluno.getIdMatricula()),
                        String.valueOf(aluno.getIdade()),
                        aluno.getSexo(),
                        aluno.getCelular(),
                        aluno.getDataMatricula(),
                    });
                }
            }
        }

    
    public void readJtableInstrutor(){
            ArrayList<Instrutor> lista = controller.selecionarTodosInstrutores();
            DefaultTableModel modelo = (DefaultTableModel) jTableConsultaInstrutor.getModel();
            modelo.setRowCount(0);
            if(!lista.isEmpty()){
                for(Instrutor instrutor: lista){
                    modelo.addRow(new String[]{
                        instrutor.getNome(),
                        String.valueOf(instrutor.getSalario()),
                        String.valueOf(instrutor.getIdade()),
                        instrutor.getSexo(),
                        instrutor.getCelular(),
                        instrutor.getDataInicio(),
                    });
                }
            }
        }
    
    private void readJtableSpecific() {
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
            String.valueOf(aluno.getIdMatricula()),
            String.valueOf(aluno.getIdade()),
            aluno.getSexo(),
            aluno.getCelular(),
            aluno.getDataMatricula(),
            });
               
         }
    
    
    private void readJtableSpecificInstrutor() {
            Instrutor instrutor = null;
            if(controller.selecionarInstrutor()!= null){
                instrutor = controller.selecionarInstrutor();
            }
            else {
                controller.alertaUsuario("Erro na busca!");
                return;
            }
            
            DefaultTableModel modelo = (DefaultTableModel) jTableConsultaInstrutor.getModel();
            modelo.setRowCount(0);
            modelo.addRow(new String[]{
            instrutor.getNome(),
            String.valueOf(instrutor.getSalario()),
            String.valueOf(instrutor.getIdade()),
            instrutor.getSexo(),
            instrutor.getCelular(),
            instrutor.getDataInicio(),
            });
               
         }
    
  
    
}
