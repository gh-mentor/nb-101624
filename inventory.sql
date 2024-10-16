/*
This file contains a script of Transact SQL (T-SQL) commands to interact with a database named 'Inventory'.
Requirements:
- SQL Server 2022 is installed and running
Details:
- Check if the database 'Inventory' exists:
-- If it exists, drop the database.
- Create a new database named 'Inventory'.
- Sets the default database to 'Inventory'.
- Create the 'categories' table. Use the following columns:
-- id:  integer, primary key
-- name: 50 characters, not null
-- description:  255 characters, nullable
- Create the 'products' table. Use the following columns:
-- id: integer, primary key
-- name: 50 characters, not null
-- price: decimal (10, 2), not null
-- category_id: int, foreign key references categories(id)
*/

-- Check if the database 'Inventory' exists:
IF DB_ID('Inventory') IS NOT NULL
BEGIN
    -- Drop the database if it exists:
    ALTER DATABASE Inventory SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
    DROP DATABASE Inventory;
END
GO

-- Create a new database named 'Inventory':
CREATE DATABASE Inventory;
GO

-- Sets the default database to 'Inventory':
USE Inventory;

-- Create the 'categories' table:
CREATE TABLE categories (
    id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(255)
);

-- Create the 'products' table:
CREATE TABLE products (
    id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES categories(id),
    -- Add a created_at column:
    created_at DATETIME DEFAULT GETDATE(),
    -- add an updated_at column:
    updated_at DATETIME DEFAULT GETDATE()
);

-- Populate the 'categories' table with sample data.
INSERT INTO categories (id, name, description) VALUES
(1, 'Electronics', 'Electronic devices and accessories'),
(2, 'Clothing', 'Apparel and fashion accessories'),
(3, 'Home Goods', 'Household items and decor'),
(4, 'Books', 'Literature and educational materials'),
(5, 'Toys', 'Children''s playthings');

-- Populate the 'products' table with sample data.
INSERT INTO products (id, name, price, category_id) VALUES
(1, 'Laptop', 999.99, 1),
(2, 'Smartphone', 599.99, 1),
(3, 'T-shirt', 19.99, 2),
(4, 'Jeans', 49.99, 2),
(5, 'Sofa', 499.99, 3),
(6, 'Coffee Table', 199.99, 3),
(7, 'Harry Potter', 12.99, 4),
(8, 'The Great Gatsby', 9.99, 4),
(9, 'Action Figure', 14.99, 5),
(10, 'Board Game', 24.99, 5);


