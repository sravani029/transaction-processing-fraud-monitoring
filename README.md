# Transaction Processing & Fraud Monitoring Platform

A **simulated** fintech backend that accepts payments, processes transactions,
scores them for fraud risk, and lets analysts investigate alerts.
No real card data or real money is involved.

## Status
- [x] Phase 0: setup
- [ ] Phase 1+: ongoing

## Tech
Java 21, Spring Boot 4.1, PostgreSQL 17, Flyway, Docker. (Redis, Kafka, Python/scikit-learn, React are added in later phases.)

## Run locally
```bash
cp .env.example .env        # then set POSTGRES_PASSWORD
docker compose up --build
curl http://localhost:8080/api/v1/ping
```

## Roadmap
setup -> auth/accounts -> transactions -> idempotency + concurrency -> audit/security ->
ML model -> Redis -> outbox + Kafka -> fraud consumer + decision engine -> analyst UI -> load testing/CI/docs

## Honesty notes (kept up to date as the project grows)
- The ULB credit card dataset has anonymized PCA features, so fraud transactions are *simulated*
  by replaying dataset rows. This is documented, not hidden.
- Performance numbers in this README come only from measurements I ran (method + hardware stated).
