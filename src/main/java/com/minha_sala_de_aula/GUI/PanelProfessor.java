package com.minha_sala_de_aula.GUI;

/**
 * Panel responsavel por todas as informações contidas na aba Professor
 * na Tela Principal. Aqui constam todas as ações para cadastro e exclusão de uma nova
 * formação e pacote de aula bem como a edição de dados do professor, formação e pacotes.
 * Esta classe foi criada para que tudo sobre ela ficasse aqui e não aumentasse a carga
 * de código na Tela Principal.
 */

import com.minha_sala_de_aula.Fabrica.PanelFormacao;
import com.minha_sala_de_aula.Fabrica.PanelPacotes;
import com.minha_sala_de_aula.Professor.FormFormacao;
import com.minha_sala_de_aula.Professor.FormPacoteDeAula;
import com.minha_sala_de_aula.Professor.FormProfessor;
import com.minha_sala_de_aula.Professor.Formacao;
import com.minha_sala_de_aula.Professor.FormacaoJPA;
import com.minha_sala_de_aula.Professor.PacoteDeAula;
import com.minha_sala_de_aula.Professor.PacoteDeAulaJPA;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelProfessor extends javax.swing.JPanel {
    /*
    Construtor da Panel
    */
    public PanelProfessor() {
        initComponents();
    }
    
    /*
    Método static para repopular a Panel com as Pacotes atualizados
    */
    public static void preencherPacotes(){
        
        //Conexão com banco e criação de uma lista de Pacotes cadastrados
        PacoteDeAulaJPA pctJPA = new PacoteDeAulaJPA();
        List<PacoteDeAula> listaPacotes = pctJPA.listaPacotes();
        
        //Atualizando o professor
        GUI_Principal.atualizarProf();
        //removendo tudo do Scroll Pane para adicionar as novos componentes
        scrlpnPacotes.removeAll();
        
        //Caso a lista esteja vazia, ou seja, não há pacotes cadastrados, nada acontece
        if(listaPacotes != null){
            /*Criação de um Panel que receberá os PanelPacotes com os dados de
            cada Pacote*/
            pnPacotes = new JPanel();
            pnPacotes.setLayout(new GridLayout(1, 40, 1, 1));
            pnPacotes.setBounds(0, 0, scrlpnPacotes.getWidth(), scrlpnPacotes.getHeight());
            pnPacotes.setVisible(true);
            
            /*
            Loop sobre a lista de pacotes encontradas no bando de dados
            e criação de cada PanelPacotes com seu devido povoamento
            */
            for (PacoteDeAula pacote: listaPacotes) {
                PanelPacotes pctDados = new PanelPacotes();
                pctDados.getLbNome().setText(pacote.getInfoPacote().getNome());
                pctDados.getLbTipo().setText(pacote.getInfoPacote().getTipo());
                pctDados.getLbPerfil().setText(pacote.getInfoPacote().getPerfil());
                pctDados.getLbRecorrencia().setText(String.valueOf(pacote.getRecorrenciaSemanal()));
                pctDados.getLbDuracaoPacote().setText(String.valueOf(pacote.getDuracaoPacote()));
                pctDados.getLbValor().setText(String.valueOf(pacote.getValor()));
                
                pctDados.setVisible(true);
                //adicionando o PanelPacotes panel
                pnPacotes.add(pctDados);
            }
            //adicionando o panel ao scrollpane
            scrlpnPacotes.add(pnPacotes);
        }
        //revalidando e repintando o scrollpane com as novas informações
        scrlpnPacotes.revalidate();
        scrlpnPacotes.repaint();
    }
    /*
    Método static para repopular a Panel com as Formações atualizadas
    */
    public static void preencherFormacao(){
        //Atualizando o professor
        GUI_Principal.atualizarProf();
        //removendo tudo do Scroll Pane para adicionar as novos componentes
        scrlpnFormacao.removeAll();
        
        //Verificando se há um professor - acontecerá apenas no primeiro uso
        if(GUI_Principal.getProfessor() != null){
            /*
            Caso a lista de formações do professor esteja nula, ou seja,
            não há formações cadastradas, nada acontecerá
            */
            if(GUI_Principal.getProfessor().getFormacao() != null){
                /*Criação de um Panel que receberá os PanelFormacao com os dados de
                cada Formação*/
                pnFormacao = new JPanel();
                pnFormacao.setLayout(new GridLayout(1, 40, 1, 1));
                pnFormacao.setBounds(0, 0, scrlpnFormacao.getWidth(), scrlpnFormacao.getHeight());
                pnFormacao.setVisible(true);
                
                /*
                Loop sobre a lista de formações do professor
                e criação de cada PanelFormacao com seu devido povoamento
                */
                for (Formacao formacao: GUI_Principal.getProfessor().getFormacao()) {
                    PanelFormacao formDados = new PanelFormacao();
                    formDados.getLbNivel().setText(formacao.getEscolaridade());
                    formDados.getLbInstituicao().setText(formacao.getInstituicao());
                    formDados.getLbCurso().setText(formacao.getCurso());
                    formDados.getLbInicio().setText(formacao.getAnoInicio());
                    formDados.getLbTermino().setText(formacao.getAnoFinal());
                    
                    formDados.setVisible(true);
                    //adicionando o PanelPacotes panel
                    pnFormacao.add(formDados);                     
                } 
                //adicionando o panel ao scrollpane
                scrlpnFormacao.add(pnFormacao);
            }
        }
        //revalidando e repintando o scrollpane com as novas informações
        scrlpnFormacao.revalidate();
        scrlpnFormacao.repaint();
    }
    
    /*
    Metódo Static para atualizar o panel com os dados do professor
    */
    public static void infoProf(){
        
        if(GUI_Principal.getProfessor() != null){
            lbNome.setText(GUI_Principal.getProfessor().getNome());
            txpBio.setText(GUI_Principal.getProfessor().getApresentacao().getBio());
            txpMeto.setText(GUI_Principal.getProfessor().getApresentacao().getMetodologia());
            lbContato.setText(GUI_Principal.getProfessor().getContato());
            lbEmail.setText(GUI_Principal.getProfessor().getEmail());
        }else {
            lbNome.setText("Nome");
            txpBio.setText("");
            txpMeto.setText("");
            lbContato.setText("Contato");
            lbEmail.setText("E-mail");
        }
    }
    
    /*
    Método para realizar a contagem das formações que estão selecionadas
    */
    public int contFormSelecionados(){
        int cont = 0;
        
        for(Component comp: pnFormacao.getComponents()){
            PanelFormacao form = (PanelFormacao) comp;
            if(form.getPanelDados1().isSelecionado()){
                cont++;
            }
        }
        
        return cont;
    }
    
    /*
    Método para realizar a contagem dos pacotes que estão selecionados
    */
    public int contPctSelecionados(){
        int cont = 0;
        
        for(Component comp: pnPacotes.getComponents()){
            PanelPacotes form = (PanelPacotes) comp;
            if(form.getPanelDados1().isSelecionado()){
                cont++;
            }
        }
        
        return cont;
    }
    
    /*
    Método para retornar uma Formação com base na formação selecionada.
    Será usado apenas quando já se tem certeza de que há apenas uma selecionada.
    */
    public Formacao getFormSelecionado(){
        FormacaoJPA formJPA = new FormacaoJPA();
        Formacao formacao = null;
        
        for(Component comp: pnFormacao.getComponents()){
            PanelFormacao form = (PanelFormacao) comp;
            if(form.getPanelDados1().isSelecionado()){
                formacao = formJPA.consultaFormacaoSelecionada(form.getLbNivel().getText(), form.getLbInstituicao().getText(), form.getLbCurso().getText(), form.getLbInicio().getText(), form.getLbTermino().getText());                
            }
        }
        return formacao;
    }
    
    /*
    Método para retornar umPacote com base no pacote selecionado.
    Será usado apenas quando já se tem certeza de que há apenas um selecionado.
    */
    public PacoteDeAula getPctSelecionado(){
        PacoteDeAulaJPA pctJPA = new PacoteDeAulaJPA();
        PacoteDeAula pacoteDeAula = null;
        
        for(Component comp: pnPacotes.getComponents()){
            PanelPacotes form = (PanelPacotes) comp;
            if(form.getPanelDados1().isSelecionado()){
                pacoteDeAula = pctJPA.consultaPacoteSelecionada(form.getLbNome().getText(), form.getLbTipo().getText(), form.getLbPerfil().getText(), form.getLbDuracaoPacote().getText(), form.getLbRecorrencia().getText(), form.getLbValor().getText());
            }
        }
        return pacoteDeAula;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbBio = new javax.swing.JLabel();
        lbMetodologia = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbContato = new javax.swing.JLabel();
        lbNomeRetorno = new javax.swing.JLabel();
        lbEmailRetorno = new javax.swing.JLabel();
        lbContatoRetorno = new javax.swing.JLabel();
        scrlpnBio = new javax.swing.JScrollPane();
        txpBio = new javax.swing.JTextPane();
        scrlpnMeto = new javax.swing.JScrollPane();
        txpMeto = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lbFormacao = new javax.swing.JLabel();
        lbPacotes = new javax.swing.JLabel();
        btEditarFormacao = new javax.swing.JButton();
        btExcluirFormacao = new javax.swing.JButton();
        btAddPacote = new javax.swing.JButton();
        btEditarPacote = new javax.swing.JButton();
        btExcluirPacote = new javax.swing.JButton();
        btAddForm = new javax.swing.JButton();
        btEditarProfessor = new javax.swing.JButton();
        scrlpnFormacao = new javax.swing.JScrollPane();
        pnFormacao = new javax.swing.JPanel();
        scrlpnPacotes = new javax.swing.JScrollPane();
        pnPacotes = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 153));
        setPreferredSize(new java.awt.Dimension(1285, 571));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lbNome.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbNome.setForeground(new java.awt.Color(0, 0, 0));
        lbNome.setText("Nome");

        lbBio.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        lbBio.setForeground(new java.awt.Color(0, 0, 0));
        lbBio.setText("Bio");

        lbMetodologia.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        lbMetodologia.setForeground(new java.awt.Color(0, 0, 0));
        lbMetodologia.setText("Metodologia");

        lbEmail.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(0, 0, 0));
        lbEmail.setText("E-mail");

        lbContato.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbContato.setForeground(new java.awt.Color(0, 0, 0));
        lbContato.setText("Contato");

        lbNomeRetorno.setForeground(new java.awt.Color(102, 102, 102));

        lbEmailRetorno.setForeground(new java.awt.Color(102, 102, 102));

        lbContatoRetorno.setForeground(new java.awt.Color(102, 102, 102));

        scrlpnBio.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrlpnBio.setOpaque(false);

        txpBio.setEditable(false);
        txpBio.setForeground(new java.awt.Color(0, 0, 0));
        txpBio.setEnabled(false);
        txpBio.setOpaque(false);
        scrlpnBio.setViewportView(txpBio);

        scrlpnMeto.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrlpnMeto.setOpaque(false);

        txpMeto.setEditable(false);
        txpMeto.setForeground(new java.awt.Color(0, 0, 0));
        txpMeto.setEnabled(false);
        txpMeto.setOpaque(false);
        scrlpnMeto.setViewportView(txpMeto);

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbBio)
                    .addComponent(lbMetodologia)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbContato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbContatoRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbEmail)
                        .addGap(27, 27, 27)
                        .addComponent(lbEmailRetorno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNomeRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrlpnMeto, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrlpnBio, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome)
                    .addComponent(lbNomeRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbBio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlpnBio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMetodologia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlpnMeto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbEmailRetorno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContato)
                    .addComponent(lbContatoRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbFormacao.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        lbFormacao.setForeground(new java.awt.Color(0, 0, 0));
        lbFormacao.setText("Formações");

        lbPacotes.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        lbPacotes.setForeground(new java.awt.Color(0, 0, 0));
        lbPacotes.setText("Pacotes de Aula");

        btEditarFormacao.setIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Edit-menor.png")); // NOI18N
        btEditarFormacao.setContentAreaFilled(false);
        btEditarFormacao.setDefaultCapable(false);
        btEditarFormacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarFormacaoActionPerformed(evt);
            }
        });

        btExcluirFormacao.setIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Trash-menor.png")); // NOI18N
        btExcluirFormacao.setBorderPainted(false);
        btExcluirFormacao.setContentAreaFilled(false);
        btExcluirFormacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirFormacaoActionPerformed(evt);
            }
        });

        btAddPacote.setIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Add_Pacote.png")); // NOI18N
        btAddPacote.setBorderPainted(false);
        btAddPacote.setContentAreaFilled(false);
        btAddPacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddPacoteActionPerformed(evt);
            }
        });

        btEditarPacote.setIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Edit-menor.png")); // NOI18N
        btEditarPacote.setBorderPainted(false);
        btEditarPacote.setContentAreaFilled(false);
        btEditarPacote.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btEditarPacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarPacoteActionPerformed(evt);
            }
        });

        btExcluirPacote.setIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Trash-menor.png")); // NOI18N
        btExcluirPacote.setContentAreaFilled(false);
        btExcluirPacote.setDefaultCapable(false);
        btExcluirPacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirPacoteActionPerformed(evt);
            }
        });

        btAddForm.setIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Add_Formacao.png")); // NOI18N
        btAddForm.setAlignmentY(0.0F);
        btAddForm.setBorderPainted(false);
        btAddForm.setContentAreaFilled(false);
        btAddForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddFormActionPerformed(evt);
            }
        });

        btEditarProfessor.setIcon(new javax.swing.ImageIcon("/run/media/tomazaudio/ed644f64-c403-47df-b53b-4b1c2e37f556/SENAC/Projetos Java/Minha_Sala_de_Aula/src/main/resources/icon/Edit.png")); // NOI18N
        btEditarProfessor.setBorderPainted(false);
        btEditarProfessor.setContentAreaFilled(false);
        btEditarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarProfessorActionPerformed(evt);
            }
        });

        scrlpnFormacao.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pnFormacao.setLayout(new java.awt.GridLayout(1, 40));
        scrlpnFormacao.setViewportView(pnFormacao);

        javax.swing.GroupLayout pnPacotesLayout = new javax.swing.GroupLayout(pnPacotes);
        pnPacotes.setLayout(pnPacotesLayout);
        pnPacotesLayout.setHorizontalGroup(
            pnPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        pnPacotesLayout.setVerticalGroup(
            pnPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );

        scrlpnPacotes.setViewportView(pnPacotes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btEditarProfessor)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(lbFormacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAddForm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditarFormacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluirFormacao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrlpnFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(152, 152, 152)
                                    .addComponent(lbPacotes)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btAddPacote)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btEditarPacote)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btExcluirPacote))
                                .addComponent(scrlpnPacotes)))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btAddForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btEditarFormacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btExcluirFormacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbFormacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrlpnFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btExcluirPacote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btEditarPacote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btAddPacote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPacotes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(scrlpnPacotes, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEditarProfessor)
                .addGap(0, 20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarFormacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarFormacaoActionPerformed
        if(contFormSelecionados() <= 0){
            JOptionPane.showMessageDialog(null, "Para editar uma Formação, clique e selecione uma das formações cadastradas.");
        }else if(contFormSelecionados() > 1){
            JOptionPane.showMessageDialog(null, "Para editar uma Formação é necessário que apenas uma delas esteja selecionada.");
        }else{
            FormFormacao formForm = new FormFormacao(getFormSelecionado());
            formForm.setVisible(true);
        }
    }//GEN-LAST:event_btEditarFormacaoActionPerformed

    private void btAddPacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddPacoteActionPerformed
        FormPacoteDeAula formPct = new FormPacoteDeAula();
        formPct.setVisible(true);
    }//GEN-LAST:event_btAddPacoteActionPerformed

    private void btEditarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarProfessorActionPerformed
        FormProfessor formProf = new FormProfessor(GUI_Principal.getProfessor());
        formProf.setVisible(true);
    }//GEN-LAST:event_btEditarProfessorActionPerformed

    private void btAddFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddFormActionPerformed
        FormFormacao formForm = new FormFormacao();
        formForm.setVisible(true);
    }//GEN-LAST:event_btAddFormActionPerformed

    private void btEditarPacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarPacoteActionPerformed
        if(contPctSelecionados() <= 0){
            JOptionPane.showMessageDialog(null, "Para editar um Pacote de Aula, clique e selecione um dos pacotes cadastradas.");
        }else if(contPctSelecionados() > 1){
            JOptionPane.showMessageDialog(null, "Para editar um Pacote de Aula é necessário que apenas um deles esteja selecionado.");
        }else{
            FormPacoteDeAula formPct = new FormPacoteDeAula(getPctSelecionado());
            formPct.setVisible(true);
        }
    }//GEN-LAST:event_btEditarPacoteActionPerformed

    private void btExcluirFormacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirFormacaoActionPerformed
        if(contFormSelecionados() <= 0){
            JOptionPane.showMessageDialog(null, "Para excluir uma Formação, clique e selecione uma das formações cadastradas.");
        }else if(contFormSelecionados() > 1){
            JOptionPane.showMessageDialog(null, "Para excluir uma Formação é necessário que apenas uma delas esteja selecionada.");
        }else{
            String[] opcoes = {"Sim", "Não"};
            
            int excluir = JOptionPane.showOptionDialog(null,
                                                       "Tem certeza que deseja exluir a formação selecionada?",
                                                        "Exclusão da Formação",
                                                        JOptionPane.DEFAULT_OPTION,
                                                        JOptionPane.QUESTION_MESSAGE,
                                                        null,
                                                        opcoes,
                                                        opcoes[0]
            );
            
            if (excluir == 0){ //Caso sim
                FormacaoJPA formJPA = new FormacaoJPA();
                formJPA.deletar(getFormSelecionado().getId());
                
                preencherFormacao();
                
            }else{ //Caso não
                
            }
        }
    }//GEN-LAST:event_btExcluirFormacaoActionPerformed

    private void btExcluirPacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirPacoteActionPerformed
        if(contPctSelecionados() <= 0){
            JOptionPane.showMessageDialog(null, "Para excluir um Pacote de Aula, clique e selecione um dos pacotes cadastradas.");
            
        }else if(contPctSelecionados() > 1){
            JOptionPane.showMessageDialog(null, "Para excluir um Pacote de Aula é necessário que apenas um deles esteja selecionado.");
        }else{
            String[] opcoes = {"Sim", "Não"};
            
            int excluir = JOptionPane.showOptionDialog(null,
                                                       "Tem certeza que deseja exluir o pacote selecionado?",
                                                        "Exclusão do Pacote de Aula",
                                                        JOptionPane.DEFAULT_OPTION,
                                                        JOptionPane.QUESTION_MESSAGE,
                                                        null,
                                                        opcoes,
                                                        opcoes[0]
            );
            
            if (excluir == 0){ //Caso sim
                PacoteDeAulaJPA pctJPA = new PacoteDeAulaJPA();
                PacoteDeAula pacoteInativo = getPctSelecionado();
                pacoteInativo.setAtividade("inativo");
                
                pctJPA.editar(pacoteInativo);
                
                preencherPacotes();
                
            }else{ //Caso não
                
            }
        }
    }//GEN-LAST:event_btExcluirPacoteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddForm;
    private javax.swing.JButton btAddPacote;
    private javax.swing.JButton btEditarFormacao;
    private javax.swing.JButton btEditarPacote;
    private javax.swing.JButton btEditarProfessor;
    private javax.swing.JButton btExcluirFormacao;
    private javax.swing.JButton btExcluirPacote;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbBio;
    private static javax.swing.JLabel lbContato;
    private javax.swing.JLabel lbContatoRetorno;
    private static javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmailRetorno;
    private javax.swing.JLabel lbFormacao;
    private javax.swing.JLabel lbMetodologia;
    private static javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeRetorno;
    private javax.swing.JLabel lbPacotes;
    private static javax.swing.JPanel pnFormacao;
    private static javax.swing.JPanel pnPacotes;
    private javax.swing.JScrollPane scrlpnBio;
    private static javax.swing.JScrollPane scrlpnFormacao;
    private javax.swing.JScrollPane scrlpnMeto;
    private static javax.swing.JScrollPane scrlpnPacotes;
    private static javax.swing.JTextPane txpBio;
    private static javax.swing.JTextPane txpMeto;
    // End of variables declaration//GEN-END:variables
}
