CREATE SEQUENCE  IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE purchases (
  id UUID NOT NULL,
   name VARCHAR(255),
   amount DECIMAL NOT NULL,
   CONSTRAINT pk_purchases PRIMARY KEY (id)
);

ALTER TABLE purchases ADD CONSTRAINT uc_purchases_id UNIQUE (id);