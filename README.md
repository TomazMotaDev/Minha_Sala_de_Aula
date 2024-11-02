
# Minha Sala de Aula

Minha Sala de Aula é meu projeto de conclusão do curso Técnico em Desenvolvimento de Sistemas pelo SENAC na modalidade EAD. Durante muito tempo em dei aula particular de violão e passei por diversas experiências atuando desta forma. Neste momento em que estou passando por uma transição de carreira, decidi fazer como meu projeto de curso algo que se relaciona com minha vivência. Então muito do que está presente aqui é baseado nas minhas "dores" enquanto professor particular e no que pude obter de conversas com amigos meus que também atuam desta forma.

![Imagem principal da aplicação mostrando o calendário com as aulas cadastradas e as demais abas com demais funcionalidades](https://github.com/TomazMotaDev/Minha_Sala_de_Aula/blob/main/Docs/Imagem%20do%20sistema%20-%20241102.png)

É um projeto ainda em desenvolvimento mas que a cada dia cresce. Segue o projeto que fiz sobre toda a aplicação.

# O Projeto

## Apresentação

Para muitos profissionais no mercado de trabalho, em segmentos distintos, as aulas particulares possibilitam uma fonte de renda extra ou até mesmo ser o seu sustento principal. Diversas áreas do conhecimento podem ser ensinadas a uma pessoa através de encontros prensenciais ou de maneira remota, com aulas individuais ou em grupo. É um formato de ensino antigo e que até hoje é muito requisitado por pessoas que desejam obter um reforço para um conteúdo específico ou até mesmo aprender a tocar um instrumento musical.

Ser um professor particular te possibilita obter um ganho imediato do seu serviço. Feito o
acordo entre as partes, professor e estudante/turma, basta a aula acontecer e o professor receber, muitas vezes de maneira antecipada. Esta “facilidade” que a aula particular traz é muito bem vista por profissionais que precisam de uma renda extra mais imediata ou até mesmo vêem nesta atuação profissional como a sua forma de obter toda sua renda. Mas não basta apenas saber dar aula.

O profissional que deseja atuar com aulas particulares precisa desenvolver habilidades que
vão além do seu aprendizado formal. Saber lidar com pessoas, aprender a oferecer e a cobrar pelo
seu serviço, saber o custo de seu trabalho e gerenciar alunos(as/es) são alguns dos conhecimentos importantes para quem deseja ser um professor particular. Não ter uma destas habilidades pode diminuir os lucros obtidos bem como sua aceitação no mercado. Além disto, o profissional que atua neste segmento de trabalho não dispõe de uma recepção e/ou secretaria que possa te auxiliar no gerenciamento de suas aulas e alunos. O próprio professor também precisa realizar a função de administração, toda a parte de captação de novos alunos bem como de entrega do serviço.

Dessa forma, o projeto ‘Minha Sala de Aula’ visa criar um sistema desktop que auxilia o professor particular a gerenciar todos seus alunos(as/es) registrando diversas informações como valor acertado, se já foi pago, dia e hora da aula, conteúdos, um balanço financeiro de quanto está
recebendo no fim do mês, material pré-preparado para envio ao aluno, lembretes, registro do que
aconteceu na aula e qualquer outra informação importante para seu trabalho. Acredita-se que o
software possa dar ao professor particular, acima de tudo um profissional autônomo, toda a estrutura organizacional de uma escola sem que ele precise da estrutura fisíca e dos recursos humanos da mesma.

## Descrição do projeto

Gerenciar os alunos(as/es) é muito importante para que o professor particular não perca qualquer informação e acordo estabelecido com cada um dos estudantes. Registrar isto de forma organizada e estruturada certamente contribuirá para um melhor desenvolvimento de seu trabalho. Desta forma, para melhor atender a todos os usuários (professores particular), o software “Minha Sala de Aula” será desenvolvido para desktop de modo que qualquer profissional possa ter um controle de seu trabalho a partir de seu computador em casa.

Além disso, seu desenvolvimento será feito em Java com a IDE Netbeans, facilitando e possibilitando que o software seja multiplataforma. Acredita-se que assim poderemos atender usuários com diversos sistemas operacionais como Windows, MacOS, Linux e outros que suportam
o Java no seu sistema.

Para que tudo isto seja possível, será necessário a criação de um banco de dados de modo a comportar todas as informações referentes aos professores(as), estudantes e toda a parte financeira do software, usando o MySQL. O usuário poderá incluir, excluir, modificar e consultar qualquer
dado inserido. O foco principal são três setores, o cadastro do professor, dos alunos(as/es) e o
financeiro. Cada um deles apresenta desdobramentos de acordo com suas necessidades.

O cadastro de professores deverá receber dados pessoais, sua formação e sobre seus
serviços. As informações para o cadastro são seu nome, logotipo seguindo determinadas
especificações de imagem (caso tenha), tipo de aula oferecido (remoto ou presencial), cidade em
que mora (principalmente se marcar que a aula é presencial), uma breve apresentação, metodologia
utilizada, formação acadêmica e um setor de cadastro de ofertas de suas aulas. Neste setor
específico, uma outra tela, o professor poderá cadastrar o valor de sua aula particular, os pacotes de aulas para ofertar para potenciais alunos(as/es), dias e horas disponíveis para suas aulas particulares de acordo com um calendário semanal e formas de pagamento. A apresentação das ofertas será feito através da geração de uma página de perfil (podendo alterar sua paleta de cores) vinculada ao cadastro do professor e mostrará informações como logotipo, tipo de aula oferecido, cidade (no caso de presencial), plataforma(s) das aulas remotas (no caso das aulas serem remotas), uma breve descrição (opcional), metodologia, valor das aulas particulares, pacotes de aulas e forma de pagamento. Esta página de perfil será passada ao potencial novo estudante no momento de captação de novos alunos(as/es) através de um arquivo PDF gerado pelo sistema. Ela tem a função apenas de mostrar os dados de uma maneira fluida e com um visual. A captura do prospecto deverá ser feita anteriormente ao passe do arquivo. Não será responsabilidade do sistema realizar o trabalho de marketing do professor mas sim de auxiliar.

O cadastro de alunos(as/es) ou turmas conterá dados como informar se é um estudante ou
uma turma, nome(s), tipo de aula (remoto ou presencial), endereço (no caso de presencial), idade, valor ou pacote de aulas acertado, observações, condições especiais (caso apresente algum quadro médico importante de ser anotado e considerado pelo professor) e todo um outro sub-setor apenas para o cadastro das aulas. Na seção de aulas, uma outra tela, o professor poderá cadastrar todos os
planejamentos de aula de maneira antecipada, logo, ele(a/u) poderá cadastrar um nome para a aula,
dia e hora, link da aula para o caso dela ser remota, objetivos (principal e geral), conteúdo,
metodologia, recursos didáticos necessários para a aula (material utilizado ou links de referência) e
poderá emitir um resumo da aula através de um arquivo PDF que poderá ser passado ao estudante
de maneira anteciapada às aulas mostrando o título da aula, logotipo, data e hora, link para as aulas
(no caso de remota) e conteúdo podendo o professor acrescentar mais informações que julgue
pertinente para este documento. Este resumo poderá ser referente ao mês ou a uma aula e mostrará
ao(s) estudante(s) um maior comprometimento do professor com o trabalho.

O setor financeiro tem como objetivo auxiliar o professor no controle de pagamento e
recebimento dos valores acertados. Sendo assim, será necessário cadastrar algumas informações
sempre que um novo estudante ou turma é cadastrado. Algumas das informações são: valor final acertado; forma como será feito o pagamento pela turma (apenas no caso de turma); data de
pagamento e se terá recorrência; se foi parcelado ou não e para quantas parcelas; forma de
pagamento utilizada; um espaço com um calendário em meses mostrando pagamentos recebidos; e
um lembrete para que o professor possa sempre atualizar a situação de pagamento dos alunos(as/es)
ou turma. Todas estas informações serão acessadas por outra página do sistema que mostrará o
balanço do mês ao professor bem como dos meses anteriores. Desta forma ele poderá acompanhar
seus ganhos e quem ainda não realizaou o pagamento no mês de acordo com a data acertada. Nesta
mesma página, no final do mês, o professor poderá emitir um PDF com o balanço mensal e/ou
anual de modo a te auxiliar no seu controle financeiro, principalmente caso ele seja
Microempreendedor Individual (MEI). Será possível também que o professor possa estipular uma
meta mensal para sua renda. Isto servirá como um panorama para que o profssional fique atento a
quantidade minima de estudantes que ele(a/u) precisa ter.

Para fechar o sistema, o professor terá um quadro de horários semanal com o registro de
suas aulas bem como de horários vagos para novos alunos(as/es) ou turmas. Além deste, o sistema
terá um calendário dinâmico mostrando de maneira ampla todas as aulas cadastradas e suas
recorrências. Assim será possível ter um panorama de suas aulas, de maneira diária, semanal e
mensal. As aulas que já tiverem o dia e hora acertado aparecerão no calendário. Ao clicar na aula o professor também poderá ver o planejamento cadastrado de maneira detalhada, assim ele poderá
estudar e preparar previamente as aulas a seguir no calendário.

## Descrição de Usuários

O foco principal do software “Minha Sala de Aula” é proporcionar ao professor particular
um ambiente em que possa ter um controle total de suas aulas, tanto na parte pedagógica quanto
financeira. Neste sentido, os usuários deste sistema são professores que trabalham com aulas
particulares, individuais ou em grupo. Podem ser qualquer área de ensino desde que necessitem de
um gerenciador para seus alunos(as/es) e trabalho.

## Necessidades Observadas e Regras de Negócio

Para o melhor funcionamento do sistema é importante ficar atento a algumas regras e
necessidades. São elas:

- Para finalizar o cadastro do professor, é  necessário cadastrar ao menos uma oferta de aula, seja uma aula avulsa ou um pacote, dados pessoais (nome, data de nascimento, cidade em que trabalha), tipo de aula oferecido e preencher o quadro de horários;

- Para cadastrar um aluno(a/e) ou turma é necessário preencher informações sobre o acerto financeiro estabelecido (data de pagamento, se vai ser uma aula recorrente ou não e forma de pagamento);

- No cadastro de aluno(a/e) ou turma o professor deverá informar os dias e horário das aulas acertados para poder atualizar o calendário e quadro de horários;

- Não será obrigatório o preenchimento do planejamento das aulas mas será recomendado;

- Os arquivos que poderão ser exportados (perfil dos pacotes de aula, perfil das aulas, relatório mensal de ganhos e relatório anual de ganhos) serão no formato PDF. Para exportar o usuário poderá escolher uma paleta de cores ou utilizar as cores base de sua logotipo. Ele também terá ao menos três layouts para escolher;

- Caso a aula seja presencial, é obrigatório o preenchimento do campo de endereço ou do local da aula. Caso seja aula remota, este campo é opcional;

- Na tela principal o professor deverá ter acesso ao calendário de aulas semanal para que veja todas as aulas da semana. Ao selecionar um dia da  semana, ele poderá ver as aulas do dia e ao selecionar a aula ele verá o planejamento de aula. Em uma outra aba ou seção ele poderá ver o balanço financeiro do mês. E em uma terceira aba ou seção, ele poderá ver os alunos(as/es) ou turmas cadastrados sendo que ao selecioná-los será possível ver detalhes de tudo que foi acertado, tanto da parte financeira quanto de horário da aula.

## Requisitos Funcionais

- [RF001] <Cadastro do professor>
**Ator:** <Usuário>

**Descrição:** <Realização do cadasro do professor (usuário) com seu nome, idade (data de
nascimento), redes sociais, contato (celular), cidade em que trabalha, logotipo, breve apresentação,
tipo de aula oferecido (remoto ou presencial), metodologia utilizada, formação acadêmica>

- [RF002] <Cadastro de ofertas/pacotes de aula>
**Ator:** <Usuário>

**Descrição:** <Realização do cadasro de aulas ofertadas com título, tipo de aula oferecido, cidade (no
caso de presencial), plataforma(s) das aulas remotas (no caso das aulas serem remotas), uma breve
descrição das ofertas (opcional), metodologia, valor das aulas particulares, pacotes de aulas e forma
de pagamento>

- [RF003] <Perfil da oferta>
**Ator:** <Usuário>

**Descrição:** <Exibição de um perfil das ofertas cadastradas com todas as informações desejadas e as
ofertas de aulas com valores baseado no que foi inserido no cadastro do professor e de ofertas. O
usuário poderá selecionar qual das ofertas aparecerão no caso de ter mais de uma. Terá um botão
para ser exportado para PDF>

- [RF004] <Cadastro da turma>
**Ator:** <Usuário>

**Descrição:** <Cadastramento de uma turma com nome para identificação, endereço (para aulas
presencial) ou local da aula (no caso de turma), tipo de aula (remoto ou presencial), observações,
condições especiais, valor acertado, forma de pagamento, data de pagamento e se terá recorrência>

- [RF005] <Cadastro de aluno(a/e)>
**Ator:** <Usuário>

**Descrição:** <Cadastramento de aluno(a/e) com nome, idade e observação>

- [RF006] <Cadastro de aula>
**Ator:** <Usuário>

**Descrição:** <Cadastramento de informações referentes ao planejamento de cada aula com título,
link para a aula, conteúdo, objetivos, metodologia, recursos didáticos>

- [RF007] <Resumo das aulas>
**Ator:** <Usuário>

**Descrição:** <Exibição de um perfil das aulas cadastradas com a possibilidade de escolher
informações desejadas e baseado no que foi inserido no cadastro das aulas para enviar ao
estudante(s)>

- [RF008] <Cadastro do planejamento de aula>
**Ator:** <Usuário>

**Descrição:** <Cadastramento de informações sobre o planejamento de uma aula como nome de
identificação, objetivo(s), conteúdo(s), metodologia e recursos didáticos>

- [RF009] <Resumo do planejamento de aula>
**Ator:** <Usuário>

**Descrição:** <Exibição de um resumo com todas as informações cadastradas sobre o planejamento
de uma determinada aula>

- [RF010] <Perfil Financeiro da turma>
**Ator:** <Usuário>

**Descrição:** <Exibição de um perfil com todas as informações e acertos feito sobre valores, formas e
data de pagamento baseado nos dados financeiro no cadastro da turma>

- [RF011] <Cadastrar situação de pagamento>
**Ator:** <Usuário>

**Descrição:** <Cadastramento da situação de pagamento de uma turma atualizando mensalmente se o
mês já foi pago ou não registrando a data em que o pagamento foi realizado, caso tenha sido pago>

- [RF012] <Balanço Financeiro>
**Ator:** <Usuário>

**Descrição:** <Exibição de um perfil com um balanço de pagamentos realizados mensalmente e
anualmente, os pagamentos que faltam e com um somatório dos ganhos, tanto para o mês quanto
para o ano e a deinição de uma meta mensal de ganho>

- [RF013] <Calendário mensal das aulas>
**Ator:**<Usuário>

**Descrição:** <Apresentação de um calendário mensal das aulas, inicialmente o mês vigente mas
podendo escolher um mês anterior para consulta, mostrando os dias que tem aulas cadastradas
podendo acessar quadro de horários do dia selecionado>

- [RF014] <Quadro de horários>
**Ator:** <Usuário>

**Descrição:** <Apresentação de um quadro de horários mostrando as aulas de hora em hora em que os
espaços vazios mostrarão horários vagos e os que estão preenchidos mostrarão aulas cadastradas ou
que já são recorrentes de uma turma, mesmo que ainda não haja aula cadastrada. Ao clicar na aula,
terá acesso a informações da aula. Caso esteja vazio, poderá cadastrar uma aula. Caso já tenha uma
aula cadastrada, poderá ver suas informações ou edita-la>

- [RF015] <Layouts>
**Ator:** <Usuário>

**Descrição:** <Criação ou edição de um layout para exportar arquivos em PDF definindo cores,
posicionamento da logotipo (caso tenha), fontem tamanho e informando qual a sua finalidade
(balanço financeio, apresentação do professor, apresentação da oferta...)>

- [RF016] <Relatório Financeiro Positivo>
**Ator:** <Usuário>

**Descrição:** <Exportação de um arquivo em PDF, com base no layout definido, contendo os ganhos
de cada mês e ano dentro de um determinado período>

## Requisitos Não Funcionais

- [RNF001] <Multiplataforma>
<O sistema desktop deverá ser multiplataforma podendo ser utilizado no Windows, MacOS, Linux
e qualquer outra plataforma que tenha suporte ao Java>

- [RNF002] <Funcionamento Off-line>
<O sistema deverá ser utilizado de maneira off-line podendo incluir, alterar, excluir ou consultar
dados>

- [RNF003] <Banco de Dados>
<Será utilizado o MySQL para a creação do banco de dados>

- [RNF004] <Linguagem de Programação>
<Será utilizado o Java como linguagem de programação>

- [RNF005] <Sistema leve>
<O sistema deverá ser leve para poder rodar em qualquer máquina sem muitas dificuldades>

## Tecnologias Previstas

- Linguagem de Programação – Java
- IDE Netbeans
- Banco de Dados MySQL
- Figma
- Hibernate (JPA)

### Mais informações

Para mais informações detalhadas como diagrama de classes, diagrama de caso de uso, diagrama de atividade e wireframes, acesse a pasta Docs aqui no repositório.
