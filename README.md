# jogoDaVelha
Jogo da velha

## Requisitos funcionais

### Funcionalidades
1. Dois jogadores podem se alternar para fazer jogadas.
2. Os jogadores podem escolher entre o símbolo X ou O.
3. O jogo deve detectar um vencedor (três símbolos iguais em linha, coluna ou diagonal).
4. O jogo deve detectar um empate (quando todas as casas estiverem preenchidas sem um vencedor).
5. O jogo deve permitir reiniciar uma partida.

### Interface
1. A interface deve exibir o tabuleiro de jogo.
2. A interface deve indicar a vez de cada jogador.
3. A interface deve exibir o vencedor ou empate ao final da partida.
4. A interface deve permitir que os jogadores façam suas jogadas clicando nas células do tabuleiro.

### Outras funcionalidades
1. O sistema deve permitir que os jogadores escolham seus nomes.


## Requisitos não funcionais

## Desempenho
1. O jogo deve responder rapidamente às ações do usuário.

## Tecnologia envolvidas
1. O sistema pode usar linguagem Java
2. O sistema pode usar SceneBuilder para apresentar uma interface intuitiva

### Robustez
1. O jogo deve ser capaz de lidar com entradas inválidas do usuário (por exemplo, clicar em uma célula já ocupada).

### Usabilidade
1. O jogo deve fornecer feedback claro ao usuário sobre suas ações.
2. A interface deve ser fácil de entender e usar.


## Regras de negócio
1. Cada jogador pode marcar apenas uma célula por vez.
2. Uma célula só pode ser marcada uma vez.
3. O jogo termina quando um jogador fizer três marcas em linha, coluna ou diagonal, ou quando todas as células estiverem ocupadas.
4. O jogador que conseguir três de suas marcas em linha, coluna ou diagonal primeiro vence.
5. Se todas as células estiverem ocupadas e nenhum jogador tiver vencido, o jogo termina em empate.
