@acessoAPP
Feature: ACESSO APLICATIVO
Scenario: Usuario acessa o aplicativo MyAssist
Given que o usuario possui o aplicativo MyAssist instalado no celular
When o usuario clica no icone do aplicativo
Then o sistema abre a tela Onboarding evidenciando o header da pagina com o logo da empresa, o nome da empresa "0 MyAssist"
