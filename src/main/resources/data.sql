-- password = 123456
INSERT INTO cliente (nome, cpf, telefone) VALUES 
('Dexter','00000000001', '11999999991'),
('Heinsenberg','00000000002', '11999999992'),
('Joe','00000000003', '11999999993'); ; 

--INSERT INTO telefone(ddd, numero, tipo, contato_id) VALUES 
--('21', '980228799', '0', 1),
--('85', '988810399', '1', 2),
--('21', '980228799', '2', 3);

INSERT INTO endereco (rua, numero, complemento, bairro, cidade, estado, cep, tipo,  cliente_id) VALUES 
('Rua Fictícia 1' , 1, 'Apto 1', 'Centro', 'São Carlos', 'SP', '11111-111', '1',  1),
('Rua Fictícia 2' , 2, 'Apto 2', 'Nova Fortaleza', 'Fortaleza', 'CE', '22222-222', '1',  2),
('Rua Fictícia 3' , 3, 'Apto 3', 'Bangu', 'Rio de Janeiro', 'RJ', '22222-222', '1',  3);;