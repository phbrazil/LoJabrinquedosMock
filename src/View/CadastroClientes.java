package View;

import Model.InsertBancoMySQL;
import Model.SelectBancoMySQL;
import Service.ValidaCPF;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author paulo.hbezerra
 */
public class CadastroClientes extends javax.swing.JFrame {

    /**
     * Creates new form CadastroClientes
     */
    public CadastroClientes() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        GravarNovoCliente = new javax.swing.JButton();
        JClienteNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JClienteLogradouro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JClienteNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JClienteCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JClienteEstado = new javax.swing.JTextField();
        ComboUF = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JClienteEmail = new javax.swing.JTextField();
        ComboSexo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ComboEstadoCivil = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jFormattedNascimento = new javax.swing.JFormattedTextField();
        jFormattedCPF = new javax.swing.JFormattedTextField();
        jFormattedRG = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        BotaoPesquisarCEP = new javax.swing.JButton();
        jFormattedTelefone = new javax.swing.JFormattedTextField();
        jFormattedCelular = new javax.swing.JFormattedTextField();
        jFormattedCEP = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Clientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(175, 11, 373, 42);

        GravarNovoCliente.setText("Gravar");
        GravarNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarNovoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(GravarNovoCliente);
        GravarNovoCliente.setBounds(340, 450, 65, 23);

        JClienteNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JClienteNomeActionPerformed(evt);
            }
        });
        getContentPane().add(JClienteNome);
        JClienteNome.setBounds(270, 80, 252, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 60, 99, 18);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("RG");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 60, 57, 18);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("CPF");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 50, 58, 26);
        getContentPane().add(JClienteLogradouro);
        JClienteLogradouro.setBounds(50, 190, 250, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Logradouro");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 170, 100, 14);
        getContentPane().add(JClienteNumero);
        JClienteNumero.setBounds(340, 190, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Numero");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 170, 80, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cidade");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(520, 170, 100, 14);
        getContentPane().add(JClienteCidade);
        JClienteCidade.setBounds(520, 190, 160, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Estado");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 230, 100, 20);
        getContentPane().add(JClienteEstado);
        JClienteEstado.setBounds(50, 250, 250, 30);

        ComboUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "RJ", "ES", "SE", "PE", "PB", "ES", "AM", "RR", "RO", "RS", "RN","PR", "AC", "TO", "MG", "SC", "BA", "CE", "PA","PI" }));
        getContentPane().add(ComboUF);
        ComboUF.setBounds(340, 250, 70, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("UF");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(340, 230, 14, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Telefone");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 370, 80, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Celular");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(240, 370, 100, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Email");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(450, 300, 120, 30);
        getContentPane().add(JClienteEmail);
        JClienteEmail.setBounds(450, 330, 230, 30);

        ComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino"}));
        getContentPane().add(ComboSexo);
        ComboSexo.setBounds(440, 250, 180, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Sexo");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(440, 230, 90, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Estado Civil");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 300, 100, 30);

        ComboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Viúvo", "Divorciado" }));
        getContentPane().add(ComboEstadoCivil);
        ComboEstadoCivil.setBounds(50, 330, 160, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Data Nascimento AAAA/MM/DD");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(240, 300, 180, 30);

        try {
            jFormattedNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedNascimento);
        jFormattedNascimento.setBounds(240, 330, 80, 30);

        try {
            jFormattedCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedCPF);
        jFormattedCPF.setBounds(50, 80, 200, 30);

        try {
            jFormattedRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedRG);
        jFormattedRG.setBounds(560, 80, 180, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("CEP");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(50, 120, 20, 14);

        BotaoPesquisarCEP.setText("Pesquisar CEP");
        BotaoPesquisarCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisarCEPActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoPesquisarCEP);
        BotaoPesquisarCEP.setBounds(240, 140, 130, 30);

        try {
            jFormattedTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTelefone);
        jFormattedTelefone.setBounds(50, 390, 160, 30);

        try {
            jFormattedCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedCelular);
        jFormattedCelular.setBounds(240, 390, 170, 30);

        try {
            jFormattedCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedCEP);
        jFormattedCEP.setBounds(50, 140, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JClienteNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JClienteNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JClienteNomeActionPerformed

    private void GravarNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarNovoClienteActionPerformed

        InsertBancoMySQL insertcliente = new InsertBancoMySQL();
        SelectBancoMySQL selectnovocliente = new SelectBancoMySQL();

        ValidaCPF validacpf = new ValidaCPF();

        boolean tudook = false;
        String nome = "", logradouro = "", RG = "", numero = "", cidade = "",
                estado = "", UF = "", telefone = "", celular = "", email = "", sexo = "", estadocivil = "", nascimento = "", CEP = "";

        String CPFOriginal = "";
        String CPFsemTraco = "";

        long CPF = 0;

        //TENTA PEGAR TODOS OS DADOS NO CADASTRO DO CLIENTE
        do {
            try {
                nome = String.valueOf(JClienteNome.getText());
                logradouro = String.valueOf(JClienteLogradouro.getText());
                RG = String.valueOf(jFormattedRG.getText());

                //GAMBIS PRA TIRAR O TRACINHO E PONTO DO CEP
                CPFOriginal = String.valueOf(jFormattedCPF.getText());
                CPFsemTraco = String.valueOf(CPFOriginal.replace(".", ""));
                CPF = Long.valueOf(CPFsemTraco.replace("-", ""));

                System.out.println("aeeeeeeee" + CPF);

                numero = String.valueOf(JClienteNumero.getText());
                cidade = String.valueOf(JClienteCidade.getText());
                estado = String.valueOf(JClienteEstado.getText());
                UF = String.valueOf(ComboUF.getSelectedItem());
                CEP = String.valueOf(jFormattedCEP.getText().replace("-", ""));
                telefone = String.valueOf(jFormattedTelefone.getText());
                celular = String.valueOf(jFormattedCelular.getText());
                email = String.valueOf(JClienteEmail.getText());
                sexo = String.valueOf(ComboSexo.getSelectedItem());
                estadocivil = String.valueOf(ComboEstadoCivil.getSelectedItem());
                nascimento = String.valueOf(jFormattedNascimento.getText());

                tudook = true;

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Verifique os dados inseridos");
            }
        } while (tudook == false);

        //SE CPF EM BRANCO OU MENOR OU MAIOR QUE 14 CARACTERES
        if (jFormattedCPF.getText().equals("") || jFormattedCPF.getText().length() < 14 || jFormattedCPF.getText().length() > 14) {
            JOptionPane.showMessageDialog(null, "Verifique os campos");

        } //SE NOME EM BRANCO OU MENOR OU MAIOR QUE 5 CARACTERES
        else if (JClienteNome.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "Verifique o nome inserido");

            //SE A FUNCAO CPF VALIDO RETORNAR FALSO
        } else if (validacpf.CPFValido(CPF) == false) {
            JOptionPane.showMessageDialog(null, "CPF inválido");

            //SE O NOVO CLIENTE JÁ ESTIVER NA BASE 
        } else if (selectnovocliente.CPFCadastradoSelect(CPFOriginal) == true) {

            JOptionPane.showMessageDialog(null, "O CPF " + CPF + " já se encontra na base");

        } else if (jFormattedNascimento.getText().equals("    /  /  ")) {

            JOptionPane.showMessageDialog(null, "Data de Nascimento inválida");

            //O ELSE GRAVA OS DADOS NO BANCO
        } else {
            insertcliente.InsertNovoCliente(nome, logradouro, RG, String.valueOf(CPFOriginal), numero, cidade, estado, UF, CEP, telefone, celular, email, sexo, estadocivil, nascimento.replace("/", "-"));

            JClienteNome.setText("");
            JClienteNumero.setText("");
            jFormattedCPF.setText("");
            jFormattedRG.setText("");
            JClienteLogradouro.setText("");
            jFormattedTelefone.setText("");
            jFormattedCelular.setText("");
            JClienteEstado.setText("");
            JClienteCidade.setText("");
            jFormattedNascimento.setText("");
            JClienteEmail.setText("");
            jFormattedCEP.setText("");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_GravarNovoClienteActionPerformed

    private void BotaoPesquisarCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisarCEPActionPerformed

        Service.ServiceCepCliente selectCEP = new Service.ServiceCepCliente();

        boolean cepvalido = false;

        //TENTA PEGAR O CEP DO CLIENTE
        do {
            try {
                selectCEP.SelectCEP(String.valueOf(jFormattedCEP.getText().replace("-", "")));
                cepvalido = true;
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "CEP inválido");
                break;
            }
        } while (cepvalido == false);

        if (selectCEP.GetLogradouro() != null) {

            JClienteLogradouro.setText(String.valueOf(selectCEP.GetLogradouro()));
            JClienteEstado.setText(String.valueOf(selectCEP.GetEstado()));
            JClienteCidade.setText(String.valueOf(selectCEP.GetCidade()));
            ComboUF.setSelectedItem(String.valueOf(selectCEP.GetUF()));

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoPesquisarCEPActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadastroClientes().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoPesquisarCEP;
    public javax.swing.JComboBox<String> ComboEstadoCivil;
    public javax.swing.JComboBox<String> ComboSexo;
    public javax.swing.JComboBox<String> ComboUF;
    private javax.swing.JButton GravarNovoCliente;
    public javax.swing.JTextField JClienteCidade;
    public javax.swing.JTextField JClienteEmail;
    public javax.swing.JTextField JClienteEstado;
    public javax.swing.JTextField JClienteLogradouro;
    public javax.swing.JTextField JClienteNome;
    public javax.swing.JTextField JClienteNumero;
    private javax.swing.JFormattedTextField jFormattedCEP;
    private javax.swing.JFormattedTextField jFormattedCPF;
    private javax.swing.JFormattedTextField jFormattedCelular;
    private javax.swing.JFormattedTextField jFormattedNascimento;
    private javax.swing.JFormattedTextField jFormattedRG;
    private javax.swing.JFormattedTextField jFormattedTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
