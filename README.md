# Spring Boot Kafka Example

Exemplo de aplicação Spring Boot que produz e consome mensagens do **Apache Kafka**, com interface de visualização via **Kafdrop**.  
Permite testes rápidos de tópicos, mensagens e grupos de consumidores.

---

## 🚀 Tecnologias

- Java 17 / Spring Boot 3.x
- Apache Kafka 7.x
- Zookeeper 7.x
- Kafdrop (interface web)
- Docker & Docker Compose

---

## 🛠️ Pré-requisitos

- Docker & Docker Compose instalados
- Java 17+
- Maven (para rodar a aplicação local)
- Browser para acessar o Kafdrop (`http://localhost:9000`)

---

## 🚀 Comandos úteis

### Subir Kafka + Zookeeper + Kafdrop

```bash
docker compose up -d
```

### Testar publicação da mensagem

```bash
curl -X POST "http://localhost:8080/api/v1/kafka/send?message=HelloKafka"
```
