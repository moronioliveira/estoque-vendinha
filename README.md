# 📦 API de Gestão de Estoque (A Vendinha)

API REST profissional desenvolvida para o gerenciamento completo de produtos em um cenário de varejo (CRUD). Este projeto foca em boas práticas de desenvolvimento Backend com Java e Spring Boot.

---

## 🚀 Tecnologias Utilizadas

Este projeto utiliza o que há de mais moderno no ecossistema Java:

* **JDK 21**: Aproveitando as últimas melhorias de performance da linguagem.
* **Spring Boot 3**: Framework base para a construção da API.
* **Spring Data JPA**: Para abstração da camada de persistência.
* **H2 Database**: Banco de dados em memória para testes rápidos.
* **Lombok**: Para um código mais limpo e produtivo.
* **Maven**: Gerenciador de dependências.

---

## 🛠️ Funcionalidades (Endpoints)

A API segue os padrões RESTful. Abaixo, os principais recursos:

| Método | Endpoint | Descrição | Status Code |
| :--- | :--- | :--- | :--- |
| **POST** | `/produtos` | Cadastra um novo produto | 201 Created |
| **GET** | `/produtos` | Lista todos os produtos | 200 OK |
| **GET** | `/produtos/{id}` | Busca um produto específico | 200 OK |
| **PUT** | `/produtos/{id}` | Atualiza dados de um produto | 200 OK |
| **DELETE** | `/produtos/{id}` | Remove um produto do estoque | 204 No Content |

---

## 📋 Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone [https://github.com/moronioliveira/estoque-vendinha.git](https://github.com/moronioliveira/estoque-vendinha.git)