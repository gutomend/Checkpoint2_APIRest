# 📦 Checkpoint 2 – API CRUD com Spring Boot

## 📚 Descrição do Projeto

Este projeto consiste no desenvolvimento de uma API REST utilizando **Spring Boot**, com o objetivo de implementar um CRUD completo (Create, Read, Update, Delete) para gerenciamento de pedidos.

A aplicação permite criar, consultar, atualizar e excluir pedidos, além de aplicar validações nos dados e persistir informações em um banco de dados **H2**.

Obs: O arquivo está como Checkpoint1 pois foi criado seguindo o Roteiro.doc. Notamos isso apenas quando o projeto já estava finalizado
---

## 🛠️ Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Lombok
* Bean Validation

---

## 📁 Estrutura do Projeto

```
src/main/java/br/com/fiap/checkpoint1
│
├── controller
│   └── OrderController.java
│
├── model
│   └── OrderModel.java
│
├── repository
│   └── OrderRepository.java
│
├── service
│   └── OrderService.java
│
└── Checkpoint1Application.java
```

---

## 🗄️ Modelo de Dados

A entidade `OrderModel` representa um pedido com os seguintes atributos:

* `id` (Long): chave primária gerada automaticamente
* `clientName` (String): nome do cliente (obrigatório)
* `orderDate` (LocalDate): data do pedido (preenchida automaticamente)
* `totalValue` (BigDecimal): valor total (não pode ser negativo)

---

## ✅ Validações

* Nome do cliente não pode ser vazio
* Valor do pedido deve ser maior que zero

---

## 🔌 Endpoints da API

### 🔹 Criar pedido

* **POST** `/orders`

```json
{
  "clientName": "Augusto",
  "totalValue": 150.50
}
```

---

### 🔹 Listar pedidos

* **GET** `/orders`

---

### 🔹 Buscar pedido por ID

* **GET** `/orders/{id}`

---

### 🔹 Atualizar pedido

* **PUT** `/orders/{id}`

```json
{
  "clientName": "Gabriel",
  "totalValue": 300.00
}
```

---

### 🔹 Deletar pedido

* **DELETE** `/orders/{id}`

---

## 🗃️ Banco de Dados (H2)

A aplicação utiliza o banco H2 em modo arquivo.

### 🔗 Acesso ao console:

```
http://localhost:8085/h2-console
```

### 🔑 Configurações:

* JDBC URL: `jdbc:h2:file:~/testdb`
* Usuário: `sa`
* Senha: `password`

---

## ⚙️ Configurações da Aplicação

Arquivo `application.properties`:

```
spring.application.name=Checkpoint1
server.port=8085

spring.datasource.url=jdbc:h2:file:~/testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

---

## 🧪 Testes da API

Os testes foram realizados utilizando o Postman, contemplando:

1. Criação de pedidos (POST)
2. Listagem de pedidos (GET)
3. Busca por ID (GET)
4. Atualização de pedidos (PUT)
5. Exclusão de pedidos (DELETE)

Também foram testadas validações para garantir integridade dos dados.

---

## 🚀 Como Executar o Projeto

1. Clonar o repositório
2. Abrir na IDE (IntelliJ recomendado)
3. Executar a classe `Checkpoint1Application`
4. Acessar a API em:

```
http://localhost:8085/orders
```

---

## 📌 Observações

* A data do pedido é preenchida automaticamente ao salvar
* O projeto segue padrão em camadas (Controller, Service, Repository, Model)
* Utiliza boas práticas com validação e tratamento de erros

---

## 👨‍💻 Integrantes

| Nome             | RM     |
| ---------------- | ------ |
| Augusto Mendonça | 558371 |
| Gabriel Vasquez  | 557056 |
| Gustavo Oliveira | 559163 |

---

## 📖 Conclusão

Este projeto demonstra a implementação de uma API REST completa utilizando Spring Boot, abordando conceitos fundamentais como:

* Arquitetura em camadas
* Persistência com JPA
* Validações
* Consumo de API via ferramentas externas

Servindo como base sólida para evoluções futuras, como integração com bancos reais, uso de DTOs e documentação automática.
