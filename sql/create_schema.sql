CREATE SCHEMA IF NOT EXISTS spoc;
CREATE TABLE spoc."user" (
    id int8 NOT NULL,
    email varchar(255) NULL,
    is_account_non_expired bool NOT NULL,
    is_account_non_locked bool NOT NULL,
    is_credentials_non_expired bool NOT NULL,
    is_enabled bool NOT NULL,
    "password" varchar(255) NULL,
    "role" varchar(255) NULL,
    username varchar(255) NULL,
    CONSTRAINT user_pkey PRIMARY KEY (id)
);
CREATE TABLE spoc.energierueckgewinnung (
    id int8 NOT NULL,
    name varchar(255) NULL,
    recovery_rate float8 NOT NULL,
    stromanteil float8 NOT NULL,
    thermischer_anteil float8 NOT NULL,
    CONSTRAINT energierueckgewinnung_pkey PRIMARY KEY (id)
);
CREATE TABLE spoc.material (
    id int8 NOT NULL,
    a_name varchar(255) NULL,
    bioco2verbrennung float8 NOT NULL,
    bio_fuelco2 float8 NOT NULL,
    bioco2prod float8 NOT NULL,
    co2recycling float8 NOT NULL,
    co2verbrennung float8 NOT NULL,
    dichte float8 NOT NULL,
    energie_recycling float8 NOT NULL,
    fossiles float8 NOT NULL,
    heizenergie float8 NOT NULL,
    productionco2 float8 NOT NULL,
    prozessenergie float8 NOT NULL,
    CONSTRAINT material_pkey PRIMARY KEY (id)
);
CREATE TABLE spoc.transportmittel (
    id int8 NOT NULL,
    co2 float8 NOT NULL,
    energie float8 NOT NULL,
    "name" varchar(255) NULL,
    CONSTRAINT transportmittel_pkey PRIMARY KEY (id)
);
CREATE TABLE spoc.verarbeitung (
    id int8 NOT NULL,
    "name" varchar(255) NULL,
    strom float8 NOT NULL,
    waerme float8 NOT NULL,
    CONSTRAINT verarbeitung_pkey PRIMARY KEY (id)
);
CREATE TABLE spoc.nutzenergieco2equivalent (
    id int8 NOT NULL,
    co2prokj float8 NOT NULL,
    co2prokwh float8 NOT NULL,
    energietraeger varchar(255) NULL,
    CONSTRAINT nutzenergieco2equivalent_pkey PRIMARY KEY (id)
);
CREATE TABLE spoc.verpackung (
    id int8 NOT NULL,
    beschreibung varchar(255) NULL,
    "name" varchar(255) NULL,
    user_id int8 NULL,
    CONSTRAINT verpackung_pkey PRIMARY KEY (id),
    CONSTRAINT fkstjbw1hxt7ddqbdox0yy0jidc FOREIGN KEY (user_id) REFERENCES spoc."user"(id)
);
CREATE TABLE spoc.materialverwendung (
    id int8 NOT NULL,
    dicke float8 NOT NULL,
    flaeche float8 NOT NULL,
    menge float8 NOT NULL,
    recycling_quote float8 NOT NULL,
    recycling_verfahren varchar(255) NULL,
    transport_strecke float8 NOT NULL,
    energierueckgewinnung_id int8 NULL,
    material_id int8 NULL,
    transportmittel_id int8 NULL,
    verarbeitung_id int8 NULL,
    verpackung_id int8 NULL,
    CONSTRAINT materialverwendung_pkey PRIMARY KEY (id),
    CONSTRAINT fk6ryugbyajer2ep4yejrn9jd52 FOREIGN KEY (verarbeitung_id) REFERENCES spoc.verarbeitung(id),
    CONSTRAINT fk8v4cudsnqebq2140ivtcb6pi8 FOREIGN KEY (transportmittel_id) REFERENCES spoc.transportmittel(id),
    CONSTRAINT fkehmmi0rtsbyhj2cayj7ltag3p FOREIGN KEY (material_id) REFERENCES spoc.material(id),
    CONSTRAINT fkklg50w3a6p0mkcorgsynhr8ry FOREIGN KEY (verpackung_id) REFERENCES spoc.verpackung(id),
    CONSTRAINT fks1s7629hldsv3umsff1d8nx6t FOREIGN KEY (energierueckgewinnung_id) REFERENCES spoc.energierueckgewinnung(id)
);

CREATE SEQUENCE spoc.energierueckgewinnung_sequence
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1
    NO CYCLE;
CREATE SEQUENCE spoc.material_sequence
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1
    NO CYCLE;
CREATE SEQUENCE spoc.nutzenergieco2equivalent_sequence
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1
    NO CYCLE;
CREATE SEQUENCE spoc.recycling_verfahren_seqence
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1
    NO CYCLE;
CREATE SEQUENCE spoc.transportmittel_sequence
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1
    NO CYCLE;
CREATE SEQUENCE spoc.verarbeitung_sequence
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1
    NO CYCLE;

INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'LDPE', '0', '0', '0', '0.41', '3.14', '0.925', '1.6', '1.8', '46', '1.87', '36.7');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'HDPE', '0', '0', '0', '0.41', '3.14', '0.955', '1.6', '1.8', '46', '1.8', '34');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'LLDPE', '0', '0', '0', '0.41', '3.14', '0.925', '1.6', '1.7', '46', '1.79', '33');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'PET', '0', '0', '0', '0.48', '2.29', '1.38', '1.8', '1.6', '24', '2.19', '47.2');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'PP', '0', '0', '0', '0.41', '3.14', '0.91', '1.6', '1.7', '46.4', '1.63', '31.5');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'GPPS', '0', '0', '0', '0.36', '3.38', '1.05', '1.6', '1.7', '42', '2.25', '40.3');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'HIPS', '0', '0', '0', '0.36', '3.38', '1.05', '1.6', '1.7', '42', '2.43', '44.59');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'PVC', '0', '0', '0', '0.41', '1.4', '1.38', '1.6', '1.4', '20', '1.99', '40');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'PA', '0', '0', '0', '0.41', '2.34', '1.15', '1.6', '2.5', '38.5', '6.7', '91');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'EVOH', '0', '0', '0', '0.41', '2.2', '1.2', '1.6', '1.59', '30', '4.6', '40');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'PVDC', '0', '0', '0', '0.41', '0.91', '1.63', '1.6', '1.6', '21.5', '4.4', '40');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'R-LLDPE', '0', '0', '0', '0.41', '3.14', '0.925', '1.6', '1.7', '46', '1.79', '33');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'R-LDPE', '0', '0', '0', '0.41', '3.14', '0.925', '1.6', '1.8', '46', '1.87', '36.7');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'R-HDPE', '0', '0', '0', '0.41', '3.14', '0.955', '1.6', '1.8', '46', '1.8', '34');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'R-PET', '0', '0', '0', '0.48', '2.29', '1.38', '1.6', '1.6', '24', '2.19', '47.2');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'R-PP', '0', '0', '0', '0.41', '3.14', '0.91', '1.6', '1.7', '46.4', '1.63', '31.5');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'bio PE iluc', '3.14', '2.77', '0', '0.41', '0', '0.925', '1.6', '0.4', '46', '2.33', '70');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'bio PE', '3.14', '2.77', '0', '0.41', '0', '0.925', '1.6', '0.4', '46', '1', '70');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'R-BioPE', '3.14', '2.77', '0', '0.41', '0', '0.925', '1.8', '0.4', '46', '1', '70');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'bio-PET', '0.46', '0', '0', '0.48', '0', '1.38', '1.6', '1.13', '24', '1.8', '51');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'PLA', '0', '0', '0', '0.41', '0', '1.3', '1.6', '1.19555555555556', '18', '1', '53.8');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'bio-PA', '2.34', '0', '0', '0.41', '0', '1.15', '1.6', '1.44', '20', '3.38', '64.8');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'ABS', '0', '0', '0', '0.36', '3.3', '1.05', '1.6', '1.95', '44', '3.1', '52.18');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'SAN', '0', '0', '0', '0.36', '3.31', '1.09', '1.6', '2', '44', '2.96', '52.88');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'PC', '0', '0', '0', '0.41', '2.89', '1.2', '1.6', '0', '33', '3.4', '71.28');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'PUR', '0', '0', '0', '0.41', '2', '1', '1.6', '1.8', '33', '3', '56');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'EPS', '0', '0', '0', '0.41', '3.38', '0', '1.6', '1.85', '40', '2.37', '45');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'PU Foam 18', '0', '0', '0', '0.41', '2', '0.018', '1.6', '1.85', '33', '3.18', '55');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Pu foam 35', '0', '0', '0', '0.41', '2', '0.035', '1.6', '1.91', '33', '3.22', '59');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Pu foam 40', '0', '0', '0', '0.41', '2', '0.04', '1.6', '2.03', '33', '3.56', '64');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Pu foam 45', '0', '0', '0', '0.41', '2', '0.045', '1.6', '1.85', '33', '2.95', '55');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'rigid PU foam', '0', '0', '0', '0.41', '2', '0.05', '1.6', '2.1', '37', '4.2', '64');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'PSA-Acrylat', '0', '0', '0', '0.41', '0', '1.38', '1.6', '1.8', '0', '0', '50');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'HMPSA (Rosin)', '1.32', '0', '0', '0.41', '1.48', '1', '1.6', '0.78', '41', '2.07', '24');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'HMPSA (C5 Resin)', '0', '0', '0', '0.41', '3.1', '1', '1.6', '1.7', '41', '3.5', '62');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), '2k lh Klebstoff', '0', '0', '0', '0.41', '2', '1', '1.6', '1.8', '30', '4.3', '56');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), '2k lf Klebstoff', '0', '0', '0', '0.41', '2', '1', '1.6', '1.8', '33', '3.5', '56');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'HMA EVA Rosin', '0.88', '0', '0', '0.41', '1.3', '1', '1.6', '1.1', '39', '1.6', '31');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'HMA C5-Rosin', '0', '0', '0', '0.41', '2.4', '1', '1.6', '1.7', '41', '2.5', '61');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Offsetfarbe ', '1.6', '0', '0', '0.41', '0.8', '1', '1.6', '0.7', '30', '2', '30');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Tiefdruckfarbe', '0', '0', '0', '0.41', '2.5', '1', '1.6', '0', '30', '3.293', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Flexofarbe wässrig', '0', '0', '0', '0.41', '2.5', '1', '1.6', '0', '30', '3.293', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Flexofarbe wässrig', '0', '0', '0', '0.41', '2.5', '1', '1.6', '0', '30', '3.293', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Flexofarbe', '0', '0', '0', '0.41', '2.5', '1', '1.6', '0.7', '30', '3.293', '40');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'aliph PU', '0', '0', '0', '0.41', '0', '0.05', '1.6', '3.3', '31', '6.5', '113');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'EVA 30%', '0', '0', '0', '0.41', '2.5', '0.945', '1.6', '1.59', '35', '2.07', '39.8');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'long polyol', '0', '0', '0', '0.41', '0', '0', '1.6', '0', '37', '2.93', '52');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'short Polyol', '0', '0', '0', '0.41', '0', '0', '1.6', '0', '42', '2.83', '52');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'arom Polyol', '0', '0', '0', '0.41', '0', '0', '1.6', '0', '38', '1.63', '34');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'GAA', '0', '0', '0', '0.41', '0', '0.95', '1.6', '0.97', '19', '1.2', '26');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'MA', '0', '0', '0', '0.41', '2.04', '0.95', '1.6', '1.2', '22', '1.7', '34');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'EA', '0', '0', '0', '0.41', '2.2', '0.95', '1.6', '1.2', '25', '1.6', '59');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'BA', '0', '0', '0', '0.41', '2.4', '0.95', '1.6', '1.68', '29', '2.2', '46');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'EHA', '0', '0', '0', '0.41', '2.44', '0.95', '1.6', '2.26', '33', '3.3', '70');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'EVA 30%', '0', '0', '0', '0.41', '2.5', '0.945', '1.6', '1.59', '35', '2.07', '39.8');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Brettschichtholz', '1.595', '0', '0', '0.1', '0', '0.4894', '0.2', '0', '18', '0.247', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Dreischichtholz', '1.595', '0', '0', '0.1', '0', '0.472', '0.2', '0', '18', '0.36', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Schnittholz', '1.595', '0', '0', '0.1', '0', '0.365', '0.2', '0', '18', '0.27', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Furnierschichtholz', '1.595', '0', '0', '0.1', '0', '0.465', '0.2', '0', '18', '0.73', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Furniersperrholz', '1.595', '0', '0', '0.1', '0', '0.68', '0.2', '0', '18', '0.514', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Spanplatte', '1.595', '0', '0', '0.1', '0', '0.63', '0.2', '0', '18', '0.277', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Spanplatte Melamin beschichtet', '1.595', '0', '0', '0.1', '0', '0.63', '0.2', '0', '18', '0.33', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'OSB', '1.595', '0', '0', '0.1', '0', '0.6', '0.2', '0', '18', '0.62', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'MDF', '1.595', '0', '0', '0.1', '0', '0.72', '0.2', '0', '18', '0.522', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'HDF', '1.595', '0', '0', '0.1', '0', '0.669', '0.2', '0', '18', '0.639', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Papier', '0', '0', '0', '0.1', '0', '0', '2', '0.12', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Papier hf', '0', '0', '0', '0.1', '0', '0.9', '2', '0.12', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Papier hf coated', '0', '0', '0', '0.1', '0', '0.9', '2', '0.12', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Papier holzhaltig', '0', '0', '0', '0.1', '0', '0.9', '2', '0.12', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'holzhaltig coated', '0', '0', '0', '0.1', '0', '0.9', '2', '0.12', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Altpapier', '0', '0', '0', '0.1', '0', '0.9', '2', '0.12', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Altpapier coated', '0', '0', '0', '0.1', '0', '0.9', '2', '0.12', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Kraftliner', '0', '0', '0', '0.1', '0', '0.9', '2', '0.12', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Testliner', '0', '0', '0', '0.1', '0', '0.9', '2', '0.12', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Schrenz', '0', '0', '0', '0.1', '0', '0.9', '2', '0.12', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'GZ Karton', '0', '0', '0', '0.1', '0', '0.7', '2', '0.12', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'GC Karton', '0', '0', '0', '0.1', '0', '0.7', '2', '0.12', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'GD Karton', '0', '0', '0', '0.1', '0', '0.7', '2', '0.12', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'N2 gas', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0.048', '0.44');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'N2 flüssig', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0.164', '1.8');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'O2 flüssig', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0.17', '1.5');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Neuglas', '0', '0', '0', '0.36', '0', '2.5', '7.2', '0.244', '0', '1.03', '11');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'R-Behälterglas', '0', '0', '0', '0.36', '0', '2.5', '7.2', '0.16', '0', '0.36', '7.2');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'R-Weißglas', '0', '0', '0', '0.36', '0', '2.5', '7.2', '0.158', '0', '0.382', '7.6');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'R-Buntglas', '0', '0', '0', '0.306', '0', '2.5', '7.2', '0.129', '0', '0.306', '6.2');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Weißglas', '0', '0', '0', '0.36', '0', '2.5', '7.2', '0.176', '0', '0.449', '8.47');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Buntglas', '0', '0', '0', '0.36', '0', '2.5', '7.2', '0.176', '0', '0.437', '8.47');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Flaconglas', '0', '0', '0', '0.36', '0', '2.5', '7.2', '0.32', '0', '0.76', '14');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Alu prod EU', '0', '0', '0', '0.5', '0', '2.71', '8', '0.53', '31', '6.7', '140');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Alu used EU', '0', '0', '0', '0.5', '0', '2.71', '8', '0.53', '31', '8.6', '160');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Elektrostahl', '0', '0', '0', '0.61', '0', '7.8', '5.5', '0', '8', '0.71', '5.5');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Hochofenstahl', '0', '0', '0', '0.61', '0', '7.8', '5.5', '0', '8', '1.6', '14');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'R-Weißblech', '0', '0', '0', '0.61', '0', '7.8', '5.5', '0.311', '0', '1.03', '14');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Zellstoff', '0', '1.3', '1.37', '0.1', '0', '0', '2', '0', '0', '0.28', '19.8');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Holzstoff', '0', '0.16', '0.9', '0.1', '0', '0', '2', '0', '0', '0', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Altpapier', '0', '0.12', '0.3', '0.1', '0', '0', '2', '0', '0', '0.3', '0.72');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'DIPP', '0', '0.2', '0.5', '0.1', '0', '0', '2', '0', '0', '0.5', '0.72');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Füllstoff-CaCO3', '0', '0', '0', '0.1', '0', '1.944', '2', '0', '0', '0.075', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Streich-CaCO3', '0', '0', '0', '0.1', '0', '1.944', '2', '0', '0', '0.115', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Kaolin', '0', '0', '0', '0.1', '0', '0', '2', '0', '0', '0.21', '0');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'SB-Binder (40/60; Tg 21Â°C))', '0', '0', '0', '0.4', '0', '0', '2', '0', '0', '3.3', '50');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'Papiermaschine', '0', '0.12', '0', '0', '0', '0', '2', '0', '0', '0.4', '6.1');
INSERT INTO spoc.material VALUES (nextval('spoc.material_sequence'), 'StreichmaschineKalander', '0', '0.0133', '0', '0', '0', '0', '2', '0', '0', '0.037', '0.677');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'Blasfolienanlage', '1.134', '0');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'Flachfolienanlage', '1.26', '0');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'FlachfolienundReckanlage', '2.8', '0');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'Spritzgussanlage', '2.16', '0');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'Extrusionsblasformen', '2.63', '0');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'Streckblasformen', '0.9', '0');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'Spritzguss-undStreckblasformanlage', '3.06', '0');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'Tiefziehen', '1.2', '0');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'FolienherstellungundTiefziehen', '2.3', '0');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'Schrumpfofen', '0.6', '0');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'Wellpappenherstellung', '1.3', '0');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'Weißblechwalzen', '0', '4.3');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'Aluminium walzen', '11', '0');
INSERT INTO spoc.verarbeitung VALUES (nextval('spoc.verarbeitung_sequence'), 'Wahl', '0', '0');
INSERT INTO spoc.energierueckgewinnung VALUES (nextval('spoc.energierueckgewinnung_sequence'), 'Standard', '52.8', '0.252382767823103', '0.747780621970481');
INSERT INTO spoc.energierueckgewinnung VALUES (nextval('spoc.energierueckgewinnung_sequence'), 'MVA', '44.6', '0.271706381813202', '0.72856751574911');
INSERT INTO spoc.energierueckgewinnung VALUES (nextval('spoc.energierueckgewinnung_sequence'), 'EBS', '60.1', '0.279918864097363', '0.721208023439261');
INSERT INTO spoc.energierueckgewinnung VALUES (nextval('spoc.energierueckgewinnung_sequence'), 'SMVA', '56.6', '0.0302603800140746', '0.985221674876847');
INSERT INTO spoc.energierueckgewinnung VALUES (nextval('spoc.energierueckgewinnung_sequence'), 'IKW', '75', '0.333386915286931', '0.667095322295451');
INSERT INTO spoc.energierueckgewinnung VALUES (nextval('spoc.energierueckgewinnung_sequence'), 'ZW', '70', '0', '0.998075998075998');
INSERT INTO spoc.energierueckgewinnung VALUES (nextval('spoc.energierueckgewinnung_sequence'), 'ZW EBS IKW', '68.69', '0.223812095032397', '0.776187904967603');
INSERT INTO spoc.energierueckgewinnung VALUES (nextval('spoc.energierueckgewinnung_sequence'), 'No Energy Recovery', '0', '0', '0');
INSERT INTO spoc.energierueckgewinnung VALUES (nextval('spoc.energierueckgewinnung_sequence'), 'Deponierung', '0', '0', '0');
INSERT INTO spoc.energierueckgewinnung VALUES (nextval('spoc.energierueckgewinnung_sequence'), 'Ländereingabe', '33.21', '0.252382767823103', '0.747780621970481');
INSERT INTO spoc.energierueckgewinnung VALUES (nextval('spoc.energierueckgewinnung_sequence'), 'eigene Eingabe', '0', '0', '1');
INSERT INTO spoc.transportmittel VALUES (nextval('spoc.transportmittel_sequence'), '0.000022', '0.000284705882352941', 'Bahn');
INSERT INTO spoc.transportmittel VALUES (nextval('spoc.transportmittel_sequence'), '0.00077', '0.00996470588235294', 'Flugzeug');
INSERT INTO spoc.transportmittel VALUES (nextval('spoc.transportmittel_sequence'), '0.0000725', '0.00102190476190476', 'LKW');
INSERT INTO spoc.transportmittel VALUES (nextval('spoc.transportmittel_sequence'), '0.0000084', '0.000108705882352941', 'Schiff');
INSERT INTO spoc.nutzenergieCO2Equivalent VALUES (nextval('spoc.nutzenergieCO2Equivalent_sequence'), '0.114722222222222', '413', 'CO2 Stromnetz');
INSERT INTO spoc.nutzenergieCO2Equivalent VALUES (nextval('spoc.nutzenergieCO2Equivalent_sequence'), '0.0555555555555556', '200', 'CO2 Gaswaerme');





