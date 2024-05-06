create table donnees (
    N° Inscription Primary key not null,
    CIN Number (8) UNIQUE ,
    Nom & Prénom Fr char (20) not null ,
    Identifiant Groupe Number Default 18043451 ,
    Nom Groupe char (8) Default LFDRT1 17,
    Note (4,2) not null
);