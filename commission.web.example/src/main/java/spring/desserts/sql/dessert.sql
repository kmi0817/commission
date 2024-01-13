CREATE TABLE events (
    id INT AUTO_INCREMENT NOT NULL,
    type CHAR(4) NOT NULL,
    title VARCHAR(50) NOT NULL,
    period VARCHAR(23) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO desserts(name, description) VALUES
('Chocolate  Cake', "Indulge in a symphony of rich cocoa bliss with our velvety chocolate cake. Moist layers intertwine with luscious ganache, creating a heavenly escape for your taste buds. A chocolate lover's dream come true!"),
('Cherry Ice Cream', "Dive into a delightful swirl of vibrant cherry goodness in every scoop. Our Cherry Jubilee ice cream is a harmonious blend of succulent cherries and creamy perfection. Experience the joy of summer in every bite!"),
('Mint Cupcake', "Savor the cool breeze of minty freshness with our Mint Cupcake. Moist cake infused with a burst of minty flavor, topped with a swirl of mint frosting. It's a charming treat that will leave you refreshed and satisfied!");
