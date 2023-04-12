# <h1 align="center">![Título do projeto "PROJETO PAYSANDU"](https://user-images.githubusercontent.com/77586790/231581984-ff30ac06-2b5b-4f8b-a048-7c6139b243d7.png) </h1>
# <h2 align="center"> Projeto Paysandu (Front-end) </h2>
Projeto de aplicação de um sistema gestor de condomínios da disciplina de Engenharia de Software 2022.1 UFRPE

## Integrantes do grupo 
<details open>
 <summary>...</summary>

 * Filipe Moreira Gomes - filipe_m_gomes@hotmail.com
 * João Victor de Sena Lemos Gomes Marinheiro - joaovictordesena2020@gmail.com
 * Rubson Hebrain de Lima Freire - limarubson@hotmail.com
</details>

## Descrição geral do projeto 

>### Condomínios têm se tornado um tipo de habitação cada vez mais comum. Diariamente, tarefas, obrigações e problemas se apresentam aos seus residentes e administradores, tais como solicitação de serviços, controle do pagamento de despesas e obtenção de informações. 
>### Por via de regra, a responsabilidade de gerenciamento de tais demandas se concentra na figura do Síndico, seja ele condômino eleito por assembleia ou profissional de Gestão Condominial. De modo que pode por um lado um condômino pode não ter conhecimentos administrativos, burocráticos e habilidades para lidar com essa demanda de forma eficiente; Por outro lado a contratação de empresa especializada pode acarretar em custos recorrentes ao condomínio. 
>### Tornando nesse cenário uma opção praticável e de demanda evidente a disponibilidade de um software de gerenciamento a disposição de síndicos e condôminos, de modo a agilizar e desburocratizar as tarefas de um condomínio; tendo a disposição do síndico informações como lista de moradores com dados pessoais e informações sobre pagamentos de despesas, produzir informativos que ao invés de serem fixados em murais possam ser notificados aos moradores por e-mail, WhatsApp, etc... E aos moradores opções como a possibilidade de solicitação de serviços, informações sobre possíveis intervenções estruturais que ocorrerão no seu piso. Tornando assim o síndico independente na administração do condomínio, e os condôminos menos frustrados e mais insformados.

 ### 1. Quem vai usar o programa?
	Administradores e moradores de um condomínio.
 ### 2. Que serviços são “necessários” (leia-se: importantes para os clientes e usuários)?
	 > Gestão de acessos, organização de vagas de estacionamento e agendamento de áreas comuns ao prédio.
 ### 3. Quais serviços cada usuário pode executar?
**Administrador**:

	  Gerar de relatórios;
	  Cadastro de moradores, veículos e funcionários;
	  Aprovação de solicitações de serviços;
	  Gerar notificações gerais e individuais;
	  Convocação de assembleias;
**Morador**:
	  
	  Obter informações sobre áreas comuns;
	  Solicitar ocupação de vagas de estacionamento;
	  Gerenciar acesso em tempo real e agendado de terceiros;
	   

## Requisitos do projeto

<details open>
 <summary>...</summary>
 
 * **REQ1** - O sistema deve permitir o gerenciamento (Create, Recover, Update e Delete - CRUD) de moradores, veículos, funcionários (?) 
 * **REQ2** - O sistema deve controlar o acesso através de login e senha. Os usuários do sistema serão do tipo administrador e morador.
 * **REQ3** - O sistema deve permitir solicitação de serviços básicos de um condomínio por parte dos moradores.
 * **REQ4** - O sistema deve permitir o controle de acessos as dependencias do condomínio, salvando em um histórico com relação ao morador.
 </details >
 
## Cronograma de MVPs com seleção de requisitos
Exemplo de sequência de MVPs:
* **MVP1 - Cadastros** - [REQ1, REQ2]: Sistema de cadastro e autenticação.
* **MVP2 - Serviços e Informativos** - [REQ3]: Solicitação de serviços e geração de infomativos.
* **MVP3 - Controle de acesso e gestão de movimentações** - [REQ3, REQ4]: Gerenciamento de despesas e solicitação de serviço
