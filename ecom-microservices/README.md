# E-commerce Spring Boot Microservices (DevOps Practice)

This project provides a lightweight **5-service Java Spring Boot e-commerce setup** for DevOps practice.

## Services

1. **api-gateway** (port `8080`) - single entry point via Spring Cloud Gateway.
2. **product-service** (port `8081`) - product catalog API.
3. **inventory-service** (port `8082`) - stock API.
4. **order-service** (port `8083`) - order creation API.
5. **payment-service** (port `8084`) - payment API.

## Why this is useful for DevOps

- Multi-service Maven build (`mvn clean verify`) for CI pipelines.
- Dockerfiles per service for containerization practice.
- `docker-compose.yml` to practice local integration, health checks, and deployment flow.
- Spring Actuator enabled on all services for observability and readiness/liveness patterns.

## Run locally (without Docker)

```bash
mvn clean package
mvn -pl product-service spring-boot:run
mvn -pl inventory-service spring-boot:run
mvn -pl order-service spring-boot:run
mvn -pl payment-service spring-boot:run
mvn -pl api-gateway spring-boot:run
```

## Run with Docker Compose

```bash
docker compose up --build
```

## Example API calls through gateway

```bash
curl http://localhost:8080/api/products
curl http://localhost:8080/api/inventory/P1001
curl -X POST http://localhost:8080/api/orders -H "Content-Type: application/json" -d '{"sku":"P1001","quantity":2}'
curl -X POST http://localhost:8080/api/payments -H "Content-Type: application/json" -d '{"orderId":"ORD-P1001-001","amount":1998.00}'
```

## Next DevOps exercises

- Add service discovery (Eureka or Consul).
- Add config server + profile-based config.
- Add PostgreSQL and Kafka.
- Add OpenTelemetry + Prometheus + Grafana.
- Create Helm charts and GitHub Actions CI/CD workflows.
