# Trabalhando com Branches
 
Branches são uma espécie de ramificação do projeto.

 - 📦 É um **ponteiro móvel** para um _commit_ no histórico do repositório

 - ⬆ Uma nova _branch_ a partir de outra existente inicia-se apontando para o mesmo _commit_ da _Branch_ que estava quando foi criada.

![Image](BranchDiagrama.png)

_Branches_ são normalmente criadas para facilitar a colaboração em projetos maiores, onde cada participante terá a sua **ramificação** permitindo que versões diferentes do código sejam alteradas simultaneamente em _workspaces_ diferentes.

Alterações realizadas em _branches_ diferentes não interferem nas demais, permitindo que versões diferentes do mesmo projeto sejam criadas.

### ➕ Criando uma nova Branch

Novas _branches_ podem ser criadas usando o comando **_Checkout_** dentro do _git bash_

- Exemplo
```
$ git checkout -b nomeBranch
```
O comando **_Checkout_** também pode ser usado para alternar entre as _branches_ do projeto.

- Exemplo

```
$ git checkout main
```
Nesse caso o comando acima faz o _Git Bash_ voltar para a _branch_ main (Principal)

Para visualizar o ultimo _commit_ de cada _branch_ utilizar o comando

```
$ git branch -v
```

### ↔ Mesclando branches

Uma vez que cada branch pode possuir uma versão diferente do projeto, torna-se importante juntar os _workspaces_ para verificar o trabalho como um todo, para isso usamos o comando **_git merge_**

- Exemplo

```
$ git merge nomeBranch
```

Esse comando alinha os commits de ambas as branches (No caso do exemplo acima ele alinharia os da _branch **main**_ com a _branch **nomeBranch**_ ) criando uma versão mesclada dentro da _branch_ atual 

### ❌ Deletando uma Branch 

_Branches_ podem ser deletadas conforme a necessidade com o comando **_git branch -d_**

- Exemplo

```
$ git branch -d NomeBranch
```
No exemplo acima a _branch_ chamada de **NomeBranch** será apagada

## Conflitos normalmente avistados

Durante o trabalho em equipe é normal presenciar alguns **conflitos**, principalmente ao utilizar as _branches_


### Conflitos de Merge
Acontece quando existem alterações concorrentes

Geralmente acontece quando ambas as _branchs_ trabalham com uma versão desatualizada do projeto.

Esse tipo de conflito pode ser resolvido com o comando **_git pull_**, que atualiza o repositório local com as informações do projeto remoto.

- Exemplo 

```
$ git pull 
```
Esse comando irá adicionar ambas as informações dentro de um só arquivo e cabrerá ao usuário escolher qual das alterações será mantida.

## 📃 Comandos Úteis

```
 $ git clone https://github.com/link-projeto.git --branch nomeBranch --single-branch
 ```

utilizada para clonar apenas uma _branch_ do projeto todo

Caso a _branch_ desejada não seja indicada o _git_ clona apenas a _branch_ principal (_main_)

```
$ git stash
$ git stash list
$ git stash pop
$ git stash apply
```
Utilizado para **apagar**, **listar** ou **restaurar** modificações feitas na _branch_

## 📚 Documentação

 - [Documentação Git - Branch](https://git-scm.com/docs/git-branch)