DROP SEQUENCE IF EXISTS "author_id_seq";
DROP SEQUENCE IF EXISTS "quote_id_seq";

CREATE SEQUENCE "author_id_seq" START WITH 1 INCREMENT BY 50;
CREATE SEQUENCE "quote_id_seq" START WITH 1 INCREMENT BY 50;

DROP TABLE IF EXISTS "authors";
DROP TABLE IF EXISTS "quotes";

CREATE TABLE "authors"
(
    "id"   bigint       NOT NULL,
    "name" VARCHAR(255) NOT NULL,
    CONSTRAINT "authors_pk" PRIMARY KEY ("id")
);

CREATE TABLE "quotes"
(
    "id"        bigint        NOT NULL,
    "quote"     VARCHAR(2048) NOT NULL,
    "author_id" bigint        NOT NULL,
    CONSTRAINT "quotes_pk" PRIMARY KEY ("id")
);

