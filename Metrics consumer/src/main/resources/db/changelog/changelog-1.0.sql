-- liquibase formatted sql
-- changeset ilyas:1
-- 2024-04-10--create-table-document
-- author: ilyas
-- comment: Create tables for
create table IF NOT EXISTS t_system_health
(
    id                           bigserial primary key,
    exists                       boolean,
    free                         bigint,
    path                         varchar(255),
    threshold                    bigint,
    total                        bigint,
    components_disk_space_status varchar(255),
    ping_status                  varchar(255),
    status                       varchar(255)
);

alter table t_system_health
    owner to postgres;




