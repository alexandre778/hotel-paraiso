🏨 Hotel Paraíso – Sistema Web de Reservas
📋 Descrição

O Hotel Paraíso é um sistema web desenvolvido em Spring Boot (Java) com Thymeleaf e Bootstrap, que permite gerenciar reservas de hóspedes, visualizar quartos e realizar pagamentos online de forma prática e intuitiva.

O projeto inclui:

Cadastro de reservas (nome, datas, quarto)

Visualização de reservas existentes

Tela de pagamento com diferentes métodos

Confirmação e mensagens de sucesso ou erro

⚙️ Tecnologias Utilizadas

Java 21

Spring Boot 3.3.3

Thymeleaf

Bootstrap 5.3.3

Maven

MySQL 8

HikariCP (pool de conexões)

Hibernate / JPA

💾 Banco de Dados

Nome: hotel_paraiso_db
Usuário: root
Senha: 81225573
Porta: 3306

Crie o banco antes de executar o projeto:

CREATE DATABASE hotel_paraiso_db;

⚙️ Configuração do application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/hotel_paraiso_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=81225573
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

server.port=8080
spring.messages.basename=messages
spring.messages.encoding=UTF-8

🚀 Executando o Projeto

Clone o repositório:

git clone https://github.com/seuusuario/hotel-paraiso.git


Entre na pasta do projeto:

cd hotel-paraiso


Compile e execute:

mvn spring-boot:run


Acesse no navegador:
👉 http://localhost:8080

🧭 Estrutura de Páginas HTML (Thymeleaf)
Página	Caminho	Descrição
🏠 index.html	/	Página inicial com menu de navegação
📋 cadastro.html	/cadastro	Formulário para cadastrar nova reserva
📅 ver-reserva.html	/ver-reserva	Lista de reservas cadastradas
💳 pagamento.html	/pagamento	Tela de pagamento (dinheiro, cartão, pix)
✅ sucesso.html	/sucesso	Confirmação de reserva realizada
⚠️ erro.html	/erro	Página de erro genérica
🧱 Estrutura de Diretórios
hotel-paraiso/
├── src/
│   ├── main/
│   │   ├── java/com/hotelparaiso/
│   │   │   ├── controller/    # Controladores Spring MVC
│   │   │   ├── model/         # Entidades JPA
│   │   │   ├── repository/    # Repositórios JPA
│   │   │   └── HotelParaisoApplication.java
│   │   └── resources/
│   │       ├── templates/     # Arquivos HTML Thymeleaf
│   │       │   ├── index.html
│   │       │   ├── cadastro.html
│   │       │   ├── ver-reserva.html
│   │       │   ├── pagamento.html
│   │       │   ├── sucesso.html
│   │       │   └── erro.html
│   │       └── application.properties
│   └── test/
│       └── java/com/hotelparaiso/
│           └── tests/          # Testes JUnit
├── pom.xml
└── README.md

🧪 Teste Básico de Conexão

Você pode validar se o banco está ativo executando:

mvn test


Ou acessando diretamente http://localhost:8080
 — se a página inicial abrir, tudo está correto ✅.

🧑‍💻 Autor

Alexandre Garcia Martins
📧 E-mail: (alexgmax@gmail.com)
💻 Projeto desenvolvido com foco em boas práticas e aprendizado em Spring Boot + Thymeleaf + MySQL.
