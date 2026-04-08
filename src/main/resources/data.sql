-- Populate Default Currency Type Data
INSERT INTO currency_type (code, name, created_at, updated_at) VALUES ('USD', 'US Dollar', UTC_TIMESTAMP(), UTC_TIMESTAMP());
INSERT INTO currency_type (code, name, created_at, updated_at) VALUES ('MMK', 'Myanmar Kyat', UTC_TIMESTAMP(), UTC_TIMESTAMP());

-- Populate Transaction Entry Data
INSERT INTO transaction_entry (name, sign_value, created_at, updated_at) VALUES ('Income', 1, UTC_TIMESTAMP(), UTC_TIMESTAMP());
INSERT INTO transaction_entry (name, sign_value, created_at, updated_at) VALUES ('Expense', -1, UTC_TIMESTAMP(), UTC_TIMESTAMP());
