-- Baseline migration: proves Flyway is wired up and the DB is reachable.
-- Real tables (users, accounts, ...) arrive in V2+ starting in Phase 1.
-- Rule: never edit a migration that has been applied; always add a new Vnn file.
SELECT 1;