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
- fez o que? depois?...

### Victor Kendi Goya
- Como Configurou o Git? não deixe exposto sua chave.
- Fez `git pull` após o commit de Fulano.
- Adicionou lógica de ... 



## Comandos utilizados
Todos os comandos foram executados via terminal utilizando chave SSH:
### Comandos de Edduardo MAturano
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

### Victor Kendi Goya


## Observações
Cada etapa foi realizada por apenas um integrante por vez, 
respeitando a ordem de commits e a integridade do código.
