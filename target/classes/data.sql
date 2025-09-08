--Insert authors
INSERT INTO author (id,name,email)VALUES (1,'J.K.Rowling' ,'jkrowling@gmail.com');
INSERT INTO author (id,name,email)VALUES (2,'George.R.R.Martin','martin@18gmail.com');
INSERT INTO author (id,name,email)VALUES (3,'Cheten Bhagat','chetan@28@gmail.com');



--Insert books
INSERT INTO book(id,title, isbn, price, publishedAt ,author_id)VALUES(1, 'Harry Potter and the Philoshoper', '98765432', 589.00, '1997', 1);
INSERT INTO book(id,title,isbn,price,publishedAt,author_id)VALUES(2, 'Harry Potter and the Chamber of secrets', '12345534', 600.99, '1998', 1);
INSERT INTO book(id,title,isbn,price,publishedAt,author_id)VALUES(3, 'A game of thrones', '987654321', 699.00, '1996', 2);
INSERT INTO book(id,title,isbn,price,publishedAt,author_id)VALUES(4, 'A clash of Kings ', '9876543212', 800.99, '1998', 2);
INSERT INTO book(id,title,isbn,price,publishedAt,author_id)VALUES(5, 'Five Point Someone', '89765432', 300.00, '2004', 3);