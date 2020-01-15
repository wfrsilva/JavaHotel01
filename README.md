# JavaHotel01
## Projeto Java Swing de Cadastro de Hotéis em banco mysql

## wfrsilva  / JavaHotel01

### Branch AMT (Alterar na Mesma Tela Salvar)
- Botao Alterar Chama dialogo,
- Dialogo recebe um numero no campo de texto, 
- Passa esse numero para procurar o hotelid,
- Consulta no banco o hotelid,
- Retorna tupla (registro) do hotelid pesquisado nos Campos de Texto (JTextField), os mesmos usados para salvar;
- Atribui Variavel ehAlteracao para TRUE,
- Atribui Jlabel com o valor do hotelid procurado,
- Aguarda alteracoes diretamente nos campos de texto (JTextField),
- Clica-se no botão salvar, 
- como JLabel possiu id e variavel ehAlteracao esta TRUE, faz os processos de alteração e nao de salvamento (NAO cria nova tupla, novo registro),
- Grava a alteração na tupla (no registro) com mesmo valor do hotelid,


### Branch wendelH01

Muitas variaveis com nome **`hotel`**, desde variaveis de objeto java ate databes mysql, por isso renomeando alguns itens
- MYSQL - Tanto o *database* (Banco de Dados) como a *table* (tabela) se chamavam hotel.

## Etapas concluidas:

01 - **Salvar** (Cadastrar) um registro de Hotel:
 - https://youtu.be/durhinqC7aA

02 - **Listar** todos os dados (hoteis) Cadastrados:
  -  https://youtu.be/Nb91_dlGhzQ 
  
03 - **Alterar (AMT)** registro (tupla) pesquisada usando mesma tela (MT) do Salvar:
  - Aguardando video ...



# JAVA
- **`factory/Conexao.java`** sera substituido pela **`conexaoBanco/ConexaoMySQL.java`**

- **`Conexao.java`** renomeado para **`Conexao_OLD.java`**

# MYSQL
- database renomeado de `hotel` para **`bdhotel`** (inspirado em  "Banco de Dados Hotel")

- tabela `hotel` renomeada para **`tblhotel`** (inspirado em "Tabela Hotel")


## REFERENCIAS
https://www.oficinadanet.com.br/artigo/java/criando-um-cadastro-de-usuario-em-java

https://www.devmedia.com.br/criando-uma-conexao-java-mysql-server/16753

https://medium.com/@raullesteves/github-como-fazer-um-readme-md-bonit%C3%A3o-c85c8f154f8

https://www.youtube.com/watch?v=durhinqC7aA&feature=youtu.be

http://icons.iconarchive.com/icons/custom-icon-design/pretty-office-7/128/Save-icon.png

http://gauss.ececs.uc.edu/Users/Franco/Fonts/Fonts.java.html

https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html

https://alvinalexander.com/blog/post/jdbc/sample-jdbc-preparedstatement-sql-update

https://alvinalexander.com/java/java-mysql-update-query-example
