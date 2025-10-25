# saas-ecommerce (starter)

Modular-monolith Spring Boot starter skeleton.
Base package: com.coderai.ecommerce
Java: 17

Import steps:
1. Unzip the project
2. In STS: File -> Import -> Existing Maven Projects -> select the root folder
3. In Package Explorer enable: Package Presentation -> Hierarchical
"# saas-multi-vender-ecomm-be" 


# SaaS Multi-Vendor E-Commerce — Backend (Spring Boot)

Short summary: Backend monolith built with Spring Boot, Spring Data JPA, PostgreSQL, Kafka (async), AWS S3, Razorpay (subscriptions). Production-ready defaults, unit/integration tests, OpenAPI docs, CI/CD.

## Quick links
- Architecture: `docs/architecture.md`
- API docs (OpenAPI): `docs/api/openapi.yaml`
- Run locally: `docs/run_locally.md`
- Deployment: `docs/deployment.md`
- Contributing: `CONTRIBUTING.md`
- Security contact: `SECURITY.md`

## Badges
[build badge] [coverage badge] [openapi badge] (add CI badges here)

---

## Prerequisites
- Java 17+
- Maven 3.8+ or Gradle 7+
- PostgreSQL 14+
- Docker (for local dev)
- Node/npm (only if frontend docs or swagger UI locally)

## Quickstart (development)
1. Copy `.env.example` → `.env`
2. Start DB: `docker compose up -d postgres`
3. Build + run:
   ```bash
   ./mvnw clean package -DskipTests
   ./mvnw spring-boot:run -Dspring-boot.run.profiles=local
