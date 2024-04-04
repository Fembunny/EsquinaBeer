DROP DATABASE esquina_db;
CREATE DATABASE esquina_db;
USE esquina_db;

INSERT INTO Produto (id, categoria, nome, preco, src_img) VALUES	
	(1,'FardoLongNeck','Cerveja Heineken 330ml - 6 unidades',54.00, './img/fardo-heineken330.png'),
	(2,'FardoLongNeck','Cerveja Budweiser 330ml - 6 unidades',45.00, './img/Fardo-budweiser.png'),
	(3,'FardoLongNeck','Cerveja Corona 330ml - 6 unidades',83.88, './img/Fardo-corona.png'),
    (4,'FardoLongNeck','Cerveja Heineken 250ml - 12 unidades',55.50, './img/Fardo-Shot.png'),
    (5,'FardoLongNeck','Cerveja Coronita Extra 210ml - 6 unidades',42.60, './img/Fardo-coronita.png'),
    (6,'FardoLongNeck','Cerveja Brahma Duplo Malte 330ml - 6 unidades',40.20, './img/Fardo-brahmaDuploMalte.png'),
    (7,'FardoLongNeck','Cerveja Strella Artois 330ml - 6 unidades',42.90, './img/Fardo-Strella.png'),
    (8,'FardoLongNeck','Cerveja Eisenbahn IPA 330ml - 6 unidades',40.00, './img/Fardo-Eisenbahn.png'),
    
    (9,'LongNeck','Cerveja Heineken 330ml',9.00, './img/cerveja-Heineken330.png'),
    (10,'LongNeck','Cerveja Budweiser 330ml',7.50, './img/cerveja-Budweiser.png'),
    (11,'LongNeck','Cerveja Corona 330ml',9.25, './img/cerveja-Corona330.png'),
    (12,'LongNeck','Cerveja Heineken 250ml',6.99, './img/cerveja-Heineken250.png'),
    (13,'LongNeck','Cerveja Coronita Extra 210ml',7.00, './img/cewrveja-Corona210.png'),
    (14,'LongNeck','Cerveja Brahma Duplo Malte 330ml',6.70, './img/cerveja-Brahma330.png'),
    (15,'LongNeck','Cerveja Strella Artois 330ml',7.15, './img/cerveja-Stella330.png'),
    (16,'LongNeck','Cerveja Eisenbahn IPA 330ml',6.65, './img/cerveja-Eisenbahn330.png'),
    
    (17,'FardoLata','Cerveja Heineken 350ml - 12 unidades',70.80, './img/Fardo-heineken.png'),
    (18,'FardoLata','Cerveja Amstel 350ml - 12 unidades',49.20, './img/fardo-amstel.png'),
    (19,'FardoLata','Cerveja Brahma Pilsen 350ml - 12 unidades',48.00, './img/fardo-brahma.png'),
    (20,'FardoLata','Cerveja Antartica Boa 350ml - 12 unidades',44.90, './img/fardo-antartica.png'),
    (21,'FardoLata','Cerveja Crystal 330ml - 12 unidades',36.00, './img/fardo-skol.png'),
    (22,'FardoLata','Cerveja Brahma Duplo Malte 330ml',6.70, './img/fardo-crystal.png'),
    (23,'FardoLata','Cerveja Petra 350ml - 12 unidades',44.70, './img/fardo-petra.png'),
    (24,'FardoLata','Cerveja Imperio Pilsen 350ml - 12 unidades',43.50, './img/fardo-imperio.png'),
    
    (25,'Lata','Cerveja Heineken 350ml',5.90, './img/heineken-lata.png'),
    (26,'Lata','Cerveja Amstel 350ml',4.10, './img/amstel-lata.png'),
    (27,'Lata','Cerveja Brahma Pilsen 350ml',4.00, './img/brahma-lata.png'),
    (28,'Lata','Cerveja Antartica Boa 350ml',3.70, './img/antartica-lata.png'),
    (29,'Lata','Cerveja Skol Pilsen 350ml',3.80, './img/skol-lata.png'),
    (30,'Lata','Cerveja Crystal 330ml',3.00, './img/crystal-lata.png'),
    (31,'Lata','Cerveja Petra 350ml',3.55, './img/petra-lata.png'),
    (32,'Lata','Cerveja Imperio Pilsen 350ml',3.60, './img/imperio-lata.png'),
    
    (33,'Refrigerante','Coca Cola 2l',10.50, './img/coca2l.png'),
    (34,'Refrigerante','Coca Cola 2l Zero',9.80, './img/Coca2lZero.png'),
    (35,'Refrigerante','Guaraná Mineiro 2l',8.00, './img/Mineiro2l.png'),
    (36,'Refrigerante','Quaraná Antartica 2l',11.00, './img/Antartica2l.png'),
    (37,'Refrigerante','Refrigerante Schweppes 1,5l',7.50, './img/Schweppes2l.png'),
    (38,'Refrigerante','Refrigerante Sprite 2l',9.00, './img/Sprite2l.png'),
    (39,'Refrigerante','Refrigerante Fanta Laranja 2l',8.50, './img/FantaLaranja2l.png'),
    (40,'Refrigerante','Refrigerante Fanta Uva 2l',8.50, './img/FantaUva2l.png'),
    
    (41,'Energetico','Energétíco Extra Power 473ml',10.50, './img/Extrapower.png'),
    (42,'Energetico','Energético Extra Power Zero 473ml',10.00, './img/ExtraPowerZero.png'),
    (43,'Energetico','Energetico Monster Green 473ml',11.00, './img/Monster.png'),
    (44,'Energetico','Energetico Monster Ultra(Zero) 473ML',11.00, './img/MonsterZero.png'),
    (45,'Energetico','Energetico Red Bull 250ml',11.00, './img/RedBull.png'),
    (46,'Energetico','Energetico Red Bull Zero 250ml',11.00, './img/RedBullZero.png'),
    (47,'Energetico','Energetico TNT 350ml',10.00, './img/TnT.png'),
    (48,'Energetico','Energetico TNT Zero 350ml',9.50, './img/TnTZero.png');

SELECT * FROM Produto; 
SELECT * FROM Carrinho; 