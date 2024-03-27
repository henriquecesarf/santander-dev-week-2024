# Santander Dev Week 2024

RESTful API da Santander Dev Week 2024 construída em Java 21 com Spring Boot 3. Uma iniciativa fruto da parceria entre DIO e Santander para a divulgação dos Bootcamps Santander 2024.

## Estrutura de Diretórios

Sendo assim, a aplicação está organizada seguindo os princípios da [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html), com o objetivo de separar as responsabilidades de maneira clara e promover a independência das camadas. Abaixo está a estrutura de diretórios adotada:

- `adapters/` - Contém os adaptadores que interagem com mecanismos externos ou recebem requisições do usuário.
  - `in/` - Adaptadores de entrada, como controladores REST, responsáveis por receber as requisições dos usuários.
  - `out/` - Adaptadores de saída, para interação com bancos de dados e APIs externas.
- `application/` - Define os casos de uso da aplicação, encapsulando a lógica de negócios.
- `domain/` - O núcleo da aplicação, incluindo entidades, exceções e interfaces (portas) que definem as regras de negócio.
  - `exception/` - Exceções personalizadas do domínio.
  - `model/` - Modelos de entidades do domínio.
  - `ports/` - Interfaces que definem os contratos para os adaptadores e serviços externos.
- `Application.java` - Classe principal que inicia a aplicação.

Esta estrutura promove a divisão das responsabilidades, facilitando a manutenção, testabilidade e a escalabilidade do sistema.
