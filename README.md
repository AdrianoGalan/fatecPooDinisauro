Exercicio - Dinossauro
Crie o jogo do Dinossauro - skeep
O Skeep é um dinossauro e será um personagem que possui as seguintes
características:
•
o
o
o
o
energia
velocidade
temperatura
humor
Comportamentos :
•
o
o
o
o
o
o
pular()
correr()
comer()
atirar()
tomarSol()
ficarNaSombra()
Regras:
•
o
o
o
o
o
o
o
O dinossauro precisa tomar Sol para ter velocidade, além de deixa-lo
com o humor feliz
Precisa comer para ter energia, e comer deixa o humor feliz
Para cada ponto de velocidade ganho ele perde um ponto de energia
Correr gasta energia deixa o humor feliz
ficarNaSombra recupera energia deixa o humor triste
atirar gasta energia e deixa o humor feliz
pular gasta energia e deixa o humor feliz
1. Faça uma classe chamada Dinossauro, contendo as características e
comportamentos do skeep.
2. Crie uma classe de Teste com o método main, que execute as seguintes
atividades:
•
o
o
o
Crie uma instância do classe Dinossauro chamada de skeep
Crie uma instância da classe Scanner chamada de scan
Em um loop inifinito
▪ Mostre na tela as características do objeto skeep▪
▪
▪
Mostre um menu de opções para o usuário com as seguintes
opções:
▪ (P)ular
(C)orrer
Co(M)er
▪ (A)tirar
Tomar (S)ol
Ficar na S(O)mbra
Pegue a primeira letra do que o usuário digitar como sendo a
opção escolhida
▪ String textoMaiusculo = scan.nextLine().toUpperCase();
▪ char letra = textoMaiusculo.charAt(0);
Conforme a opção escolhida execute o método
correspondente no objeto skeep
