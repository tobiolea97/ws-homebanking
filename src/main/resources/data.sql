INSERT INTO accounts VALUES (1,true,0.00,'ARS'),(2,true,0.00,'ARS');
INSERT INTO clients VALUES (1,true,'Ombu 613','dibu@mail.com','Dibu','Martinez','$2a$10$dJEeuz9CL7YFwVpuWWygN.eSML6T0azWoKd/DvLc59Zwa2yWT1MHi','14960360','1169203645','$2a$10$A4Eap64ugSmrWIemIGSzQu');
INSERT INTO clients VALUES (2,true,'Corrientes 111','leo@mail.com','Leo','Mesis','$2a$10$MEDSNu1JK.h8ESXJEcxCh.jV4GHtbu.9e85yVBu4WsqUoPNo.UTXC','40379479','1169203645','$2a$10$J2..yUAz9QPNS7wZImcqQu');
INSERT INTO clients_accounts VALUES (1,1,'TITULAR');
INSERT INTO clients_accounts VALUES (2,1,'CO TITULAR');
INSERT INTO clients_accounts VALUES (2,2,'TITULAR');
INSERT INTO users VALUES ('int_40379479','$2a$10$DJSezd2kgaLZ1MKHSzC7KOHi8.IQLNE5KG4lPY9IYE5Wlu.4kpeKq','ADMIN');
INSERT INTO `transactions` VALUES (1,2,NULL,1000.00,1,'DEPOSITO'),(2,2,NULL,1000.00,1,'DEPOSITO'),(3,2,NULL,4053.00,1,'DEPOSITO'),(4,2,NULL,200.00,1,'RETIRO'),(5,2,NULL,200.00,1,'RETIRO'),(6,2,NULL,512.00,1,'TRANSFERENCIA'),(7,1,NULL,1000.00,1,'DEPOSITO'),(8,2,NULL,1000.00,2,'DEPOSITO');