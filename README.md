# Projeto de Aplicativo de Jogo de Cartas de Filmes

Este é um projeto para criar um aplicativo REST e Front-end para um jogo no estilo de cartas, onde os jogadores devem adivinhar qual filme tem a melhor avaliação no IMDB. O jogo consiste em informar um par de filmes e o jogador deve tentar acertar qual filme possui a pontuação mais alta no IMDB.

## Requisitos

O projeto atende aos seguintes requisitos:

- Cada rodada do jogo consiste em informar um par de filmes aos jogadores.
- O jogador deve tentar adivinhar qual filme possui a maior pontuação, avaliada em uma escala de 0.0 a 10.0.
- Se o jogador escolher o filme vencedor corretamente, ele ganha 1 ponto.
- Após responder, o jogador terá acesso a um novo par de filmes quando acessar o endpoint do quiz.
- A listagem de jogadores exibe os jogadores em ordem decrescente de acordo com sua pontuação.

## Tecnologias Utilizadas

O projeto faz uso dos seguintes frameworks do Spring:

- **Spring Boot**: um framework Java que simplifica o desenvolvimento de aplicativos, fornecendo configurações iniciais e facilitando a criação de APIs REST.
- **Spring Web**: um módulo do Spring que fornece recursos para o desenvolvimento de aplicativos web RESTful.
- **Spring Data**: um módulo do Spring que facilita a integração com bancos de dados, permitindo a persistência e recuperação de dados de forma simples e eficiente.

## Funcionalidades

O projeto oferece as seguintes funcionalidades:

- Exibir um par de filmes para o jogador adivinhar qual tem a melhor avaliação no IMDB.
- Registrar a resposta do jogador e verificar se está correta.
- Atualizar a pontuação do jogador e exibir o ranking dos jogadores em ordem decrescente.
- Fornecer um novo par de filmes para o jogador continuar jogando.
- Interface front-end para facilitar a interação do jogador.

## Configuração e Execução

Siga as etapas abaixo para configurar e executar o projeto localmente:

1. Clone o repositório do projeto:

```
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```

2. Navegue até o diretório raiz do projeto:

```
cd nome-do-repositorio
```

3. Compile o projeto utilizando o Maven:

```
mvn compile
```

4. Execute o projeto:

```
mvn spring-boot:run
```

5. Acesse o aplicativo no navegador através da URL: `http://localhost:8080`

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões para melhorias, fique à vontade para abrir uma "issue" ou enviar um "pull request" no repositório do projeto.

## Licença

Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT). Sinta-se à vontade para utilizar, modificar e distribuir o código-fonte conforme necessário.
