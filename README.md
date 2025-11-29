# Atividade Avaliativa - Git Colaborativo com Java

## Integrantes do grupo
- Edduardo Maturano
- Victor Kendi Goya

## Objetivo
Desenvolver colaborativamente um algoritmo em Portugol de "Calculadora Simples"

## Etapas realizadas por cada membro

### Edduardo Maturano
-Primeiro fiz a criação do repositorio e adicionei o Victor Kendi Goya ao repositorio
-Depois decidimos qual seria o projeto 
-E começei a editar o Readme, copiei o que o professor mandou e depois fui editando com nossas informações, como colocando qual seria o projeto alem de como configurei minha chave ssh
- liberei o Readme para o vitor editar ele
- Fiz a criação do arquivo que sera editado por ambos os membros
- Agora fiz a pasta onde sera colocado o arquivo do para ser editado
- Abri o git Bash na pasta para realizar o git clone
- Depois de realizar o clone ja que estamos utilizando a lingagem java tive que abrir o clone pelo Intellij por isto não teve o comando "code ."
- depois fiz minhas modificarçoes no codigo (minha parte que tinha combinado com o Victor)
- depois o comando git add
- depois usei o git status para verificar se está correto
- agora dei o git commit com a mensagem do commit
- Enqaunto eu fazia essas alterções eu ia montando o readme, colocando os comandos utilizados e essa lista que vc esta lendo :D

### Victor Kendi Goya
- Criei um arquivo na main dentro da pasta Calculadora Simples chamada Calculadora.java
- Criei uma nova branch chamada Subtracao_E_Divisao e fiz um pull request
- Atualizando esta parte do README com as informações acima



## Comandos utilizados
Todos os comandos foram executados via terminal utilizando chave SSH:
### Comandos de Edduardo MAturano
## Criando chave ssh
eddua@samsung4 MINGW64 ~
$ ssh-keygen -t rsa -b 4096 -C "edu36232029@gmail.com"
Generating public/private rsa key pair.
Enter file in which to save the key (/c/Users/eddua/.ssh/id_rsa):
/c/Users/eddua/.ssh/id_rsa already exists.
Overwrite (y/n)? y
Enter passphrase for "/c/Users/eddua/.ssh/id_rsa" (empty for no passphrase):
Enter same passphrase again:
Your identification has been saved in /c/Users/eddua/.ssh/id_rsa
Your public key has been saved in /c/Users/eddua/.ssh/id_rsa.pub
The key fingerprint is:
The key's randomart image is:


eddua@samsung4 MINGW64 ~
$ eval "$(ssh-agent -s)"
Agent pid 1028

eddua@samsung4 MINGW64 ~
$ ssh-add ~/.ssh/id_rsa
Identity added: /c/Users/eddua/.ssh/id_rsa (edu36232029@gmail.com)

eddua@samsung4 MINGW64 ~
$ clip < ~/.ssh/id_rsa.pub

eddua@samsung4 MINGW64 ~
$ clip < ~/.ssh/id_rsa.pub

eddua@samsung4 MINGW64 ~
$ ssh -T git@github.com
Hi edduMaturano/Atividade-avaliativa-Git! You've successfully authenticated, but GitHub does not provide shell access.

## fazendo a Manipulação do arquivo (git clone, git add, git status, git commit)

eddua@samsung4 MINGW64 ~/OneDrive/Área de Trabalho/atividade de git
$ git clone git@github.com:edduMaturano/Atividade-avaliativa-Git.git
Cloning into 'Atividade-avaliativa-Git'...
remote: Enumerating objects: 13, done.
remote: Counting objects: 100% (13/13), done.
remote: Compressing objects: 100% (10/10), done.
remote: Total 13 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
Receiving objects: 100% (13/13), 5.24 KiB | 893.00 KiB/s, done.
Resolving deltas: 100% (1/1), done.

eddua@samsung4 MINGW64 ~/OneDrive/Área de Trabalho/atividade de git
$ cd Atividade-avaliativa-Git/

eddua@samsung4 MINGW64 ~/OneDrive/Área de Trabalho/atividade de git/Atividade-avaliativa-Git (main)
$ git add .

eddua@samsung4 MINGW64 ~/OneDrive/Área de Trabalho/atividade de git/Atividade-avaliativa-Git (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   .idea/.gitignore
        new file:   .idea/Atividade-avaliativa-Git.iml
        new file:   .idea/misc.xml
        new file:   .idea/modules.xml
        new file:   .idea/vcs.xml
        new file:   Calculadora simples/Main.java
        new file:   out/production/Atividade-avaliativa-Git/Calculadora simples.iml
        new file:   out/production/Atividade-avaliativa-Git/Main.class


eddua@samsung4 MINGW64 ~/OneDrive/Área de Trabalho/atividade de git/Atividade-avaliativa-Git (main)
$ git commit -m "Crie a função subtração e a função divisão, alem de criar o menu basico"
[main 5b47515] Crie a função subtração e a função divisão, alem de criar o menu basico
 8 files changed, 152 insertions(+)
 create mode 100644 .idea/.gitignore
 create mode 100644 .idea/Atividade-avaliativa-Git.iml
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/modules.xml
 create mode 100644 .idea/vcs.xml
 create mode 100644 Calculadora simples/Main.java
 create mode 100644 out/production/Atividade-avaliativa-Git/Calculadora simples.iml
 create mode 100644 out/production/Atividade-avaliativa-Git/Main.class

eddua@samsung4 MINGW64 ~/OneDrive/Área de Trabalho/atividade de git/Atividade-avaliativa-Git (main)
$




### Victor Kendi Goya
Usuario@DESKTOP-J3R75BE MINGW32 ~
$ git config --global user.name "VictorGoya"

Usuario@DESKTOP-J3R75BE MINGW32 ~
$ git config --global user.email "victor.goya@edu.unifil.br"

Usuario@DESKTOP-J3R75BE MINGW32 ~
$ ssh-keygen -t rsa -b 4096 -C "victor.goya@edu.unifil.br"
Generating public/private rsa key pair.
Enter file in which to save the key (/c/Users/Usuario/.ssh/id_rsa):
Enter passphrase for "/c/Users/Usuario/.ssh/id_rsa" (empty for no passphrase):
Enter same passphrase again:
Your identification has been saved in /c/Users/Usuario/.ssh/id_rsa
Your public key has been saved in /c/Users/Usuario/.ssh/id_rsa.pub

Usuario@DESKTOP-J3R75BE MINGW32 ~
$ eval "$(ssh-agent -s)"
Agent pid 871

Usuario@DESKTOP-J3R75BE MINGW32 ~
$ ssh-add ~/.ssh/id_rsa
Identity added: /c/Users/Usuario/.ssh/id_rsa (victor.goya@edu.unifil.br)

Usuario@DESKTOP-J3R75BE MINGW32 ~
$ clip < ~/.ssh/id_rsa.pub

Usuario@DESKTOP-J3R75BE MINGW32 ~
$ ssh -T git@github.com
Hi Swithical! You've successfully authenticated, but GitHub does not provide shell access.


## Observações
Cada etapa foi realizada por apenas um integrante por vez, 
respeitando a ordem de commits e a integridade do código.
