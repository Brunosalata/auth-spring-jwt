# Authentication API

## Descrição
Este projeto é uma API construída utilizando Java, Spring Boot, PostgreSQL como banco de dados, além de Spring Security e JWT para controle de autenticação.

A API foi desenvolvida para explorar a configuração da autenticação e autorização em uma aplicação Spring utilizando Spring Security.

## Índice
- [Instalação](#instalação)
- [Uso](#uso)
- [Endpoints da API](#endpoints-da-api)
- [Autenticação](#autenticação)
- [Banco de Dados](#banco-de-dados)
- [Contribuição](#contribuição)

## Instalação

### Clonar o repositório:
```bash
git clone https://github.com/Brunosalata/auth-spring-jwt
```

### Instalar dependências com Maven:
```bash
mvn install
```

### Instalar PostgreSQL
Certifique-se de ter o PostgreSQL instalado e configurado.

## Uso
Para iniciar a aplicação, utilize o Maven:
```bash
mvn spring-boot:run
```
A API estará acessível em: [http://localhost:8080](http://localhost:8080)

## Endpoints da API
A API fornece os seguintes endpoints:

- `GET /product` - Retorna a lista de todos os produtos (acesso para usuários autenticados).
- `POST /product` - Cadastra um novo produto (requer permissão de ADMIN).
- `POST /auth/login` - Realiza login no sistema.
- `POST /auth/register` - Registra um novo usuário na aplicação.

## Autenticação
A API utiliza Spring Security para controle de autenticação, utilizando a biblioteca JWT para gerenciamento de Token de identificação. Os seguintes papéis de usuário estão disponíveis:

- **USER** → Papel padrão para usuários autenticados.
- **ADMIN** → Papel de administrador, responsável pelo gerenciamento de parceiros (registro de novos parceiros).

Para acessar endpoints protegidos como um usuário ADMIN, é necessário fornecer as credenciais apropriadas no cabeçalho da requisição.

## 📊 Modelagem do Banco de Dados
<p>A estrutura principal do banco de dados PostgreSQL inclui:</p>
<ul>
    <li><strong>products</strong> (id TEXT, name TEXT, description TEXT, image TEXT, price INT)</li>
    <li><strong>users</strong> (id TEXT, login TEXT, password TEXT, role TEXT)</li>
</ul>

## 👨‍💻 Contribuição
Contribuições são bem-vindas! Se encontrar algum problema ou tiver sugestões de melhorias, abra uma issue ou envie um pull request para o repositório.

Ao contribuir para este projeto, siga o estilo de código existente, convenções de commits e envie suas alterações em um branch separado.

<h2>📱 Contato</h2>

**Email:** [brunosalata.dev@gmail.com](mailto:brunosalata.dev@gmail.com)

**LinkedIn:** [brunosalatalima](https://www.linkedin.com/in/brunosalatalima/)

**GitHub:** [Brunosalata](https://github.com/Brunosalata)
