![image](https://github.com/Wfelipetm/MissaoPraticaN1_Mundo3/assets/108297008/262d833e-618d-480c-83cd-8f856715ebd8) 



# Cadastro usando JDBC e Padrão DAO

Nome: Wallace Felipe Tavares Moreira 
Matrícula: 202109237331
Universidade: UNIVERSIDADE ESTÁCIO DE SÁ
Curso: Desenvolvimento Full Stack
Campus: Jardim América – Itaguaí/RJ
Disciplina: Nível 3 – BeckEnd sem banco não tem
Semestre Letivo: Terceiro Semestre



**Objetivo**

1 - Implementar persistência com base no middleware JDBC.

Utilizar o padrão DAO (Data Access Object) no manuseio de dados.

2 - Implementar o mapeamento objeto-relacional em sistemas Java.

3 - Criar sistemas cadastrais com persistência em banco relacional.

4 - criar um aplicativo cadastral com uso do SQL
Server na persistência de dados.





## 3.1. Classe ConectorBD:


A classe ConectorBD é responsável por estabelecer a conexão com o banco de dados. Ela contém métodos para abrir e fechar a conexão, bem como para obter um objeto Statement que será usado para executar consultas SQL no banco de dados.


## 3.2. Classe SequenceManager:

A classe SequenceManager é responsável por gerenciar sequências numéricas no banco de dados. Ela utiliza a função nextval do SQL para obter o próximo valor de uma sequência especificada no banco de dados.



## 3.3. PessoaFisica e PessoaJuridica:


As classes PessoaFisica e PessoaJuridica são classes que representam entidades no sistema, ou seja, as informações de uma pessoa física e pessoa jurídica, respectivamente. Cada uma dessas classes possui atributos que correspondem aos campos do banco de dados, como nome, CPF, CNPJ, etc. Essas classes também possuem métodos getter e setter para acessar e modificar esses atributos.


## 3.4. Classe PessoaFisicaDAO:

A classe PessoaFisicaDAO é uma classe que implementa a lógica de acesso aos dados para a entidade PessoaFisica. Ela possui métodos para incluir, alterar, excluir e buscar informações de pessoas físicas no banco de dados. A classe utiliza a classe ConectorBD para estabelecer a conexão com o banco de dados e realizar as operações SQL.



## 3.5. Classe PessoaJuridicaDAO:

A classe PessoaJuridicaDAO é semelhante à classe PessoaFisicaDAO, mas é específica para a entidade PessoaJuridica. Ela também possui métodos para incluir, alterar, excluir e buscar informações de pessoas jurídicas no banco de dados, utilizando a classe ConectorBD para a conexão e operações SQL.


## 3.6. Classe InterfaceCadastro:

A classe InterfaceCadastro contém métodos para interagir com o usuário através da linha de comando e realizar as operações de inclusão, alteração, exclusão, obtenção por ID e listagem de pessoas físicas e jurídicas. Ela utiliza as classes PessoaFisicaDAO e PessoaJuridicaDAO para realizar essas operações no banco de dados.



## 3.7. Classe CadastroBD:

A classe CadastroBD é a classe principal do aplicativo. Ela contém o método main, que é o ponto de entrada do programa. Essa classe é responsável por criar instâncias dos DAOs e realizar a interação com o usuário através da classe InterfaceCadastro.


Esses códigos trabalham em conjunto para criar um aplicativo de cadastro que permite ao usuário interagir com o banco de dados, realizando operações de inclusão, alteração, exclusão, obtenção e listagem de pessoas físicas e jurídicas. O uso do padrão DAO ajuda a manter a separação de responsabilidades e a melhorar a manutenibilidade do código, enquanto o JDBC facilita a conexão com o banco de dados e a execução de consultas SQL. A interface InterfaceCadastro fornece uma experiência amigável ao usuário para realizar essas operações de forma intuitiva e eficiente.


<p align="center">
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/6878d710-0d1b-4736-b849-e7843aa4a201" alt="Imagem 1" width="400" height="400" />
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/2e3401ae-23cb-40ed-bb57-5b365a0e1822" alt="Imagem 2" width="400" height="400" />
</p>




## Incluir Pessoa Fisica e Juridica:

<p align="center">
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/95a06b6f-6c62-4428-ad54-cc195bc9fffe" alt="Imagem 1" width="400" height="400" />
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/4ce7d425-1c28-4669-9eb8-d8fcdaf0fc72" alt="Imagem 2" width="400" height="400" />
</p>

<p align="center">
 
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/deb35f28-fa2d-4fb0-985c-22e0ddfb5a23" alt="Imagem 2" width="800" height="400" />
</p>
<p align="center">
 
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/6ce6edd2-54da-4d6c-8d04-9896963a85f5" alt="Imagem 2" width="800" height="400" />
</p>

## Alterar Pessoa Fisica e Juridica:

<p align="center">
 
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/1f547dfa-7133-4920-8567-00bb2a347bfb" alt="Imagem 2" width="800" height="400" />
</p>
<p align="center">
 
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/e9566eff-cd83-4bef-b160-5bf0e6d2303e" alt="Imagem 2" width="800" height="400" />
</p>




## Excluir Pessoa Fisica e Juridica:

<p align="center">
 
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/45c65963-9f22-44b7-aa59-2b214d9c29f2" alt="Imagem 2" width="800" height="400" />
</p>
<p align="center">
 
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/2fcd8167-266e-4ca3-91fa-14d30e7103e0" alt="Imagem 2" width="800" height="400" />
</p>

## Buscar Pessoa Fisica e Juridica por ID:

<p align="center">
 
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/262f3d2a-8d51-4c38-a84f-07d8fa179d49" alt="Imagem 2" width="800" height="400" />
</p>
<p align="center">
 
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/d1f2fd49-2c2d-447b-b76c-3e90c597de4d" alt="Imagem 2" width="800" height="400" />
</p>

## Exibir todas Pessoa Fisica e Juridica:

<p align="center">
 
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/78e0505c-cfc8-4785-a8d2-f11d6abe1389" alt="Imagem 2" width="800" height="400" />
</p>
<p align="center">
 
  <img src="https://github.com/Wfelipetm/MissaoPraticaN3_Mundo3/assets/108297008/0b159f12-cc5e-41a6-b355-de590d18741f" alt="Imagem 2" width="800" height="400" />
</p>



