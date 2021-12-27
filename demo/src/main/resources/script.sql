create table Client (
    id serial PRIMARY KEY,
    nom varchar(255),
    prenom varchar(255),
    date_naissance varchar(255),
    addresse varchar(255),
    code_postale integer,
    ville varchar(255),
    tel varchar(255),
    fax varchar(255),
    gsm varchar(255),
    email varchar(255)
);

create table categorie (
    id serial PRIMARY KEY,
    code varchar(255),
    libelle varchar(255)
);

create table Produit (
    id serial PRIMARY KEY,
    code varchar(255),
    marque varchar(255),
    modele varchar(255),
    caracteristiques varchar(255),
    prix_unitaire decimal,
    quantite integer,
    category_id integer,
    CONSTRAINT fk_categorie FOREIGN KEY(category_id) REFERENCES categorie(id)
);

create table Commande(
    id serial PRIMARY KEY,
    numero varchar(255),
    date date,
    prix_total decimal,
    etat bigint,
    client_id integer,
    CONSTRAINT fk_client FOREIGN KEY(client_id) REFERENCES client(id)
);

create table LignCommande(
    id serial PRIMARY KEY,
    qte bigint,
    prix_unitaire decimal,
    prix_total decimal,
    etat bigint,
    commande_id integer,
    produit_id integer,
    CONSTRAINT fk_commande FOREIGN KEY(commande_id) REFERENCES Commande(id),
    CONSTRAINT fk_produit FOREIGN KEY(produit_id) REFERENCES Produit(id)
);
