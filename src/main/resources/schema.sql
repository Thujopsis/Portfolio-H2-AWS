CREATE TABLE IF NOT EXISTS list (
                                      id SERIAL NOT NULL,
                                      name VARCHAR(255) NOT NULL,
                                      details VARCHAR(255) NOT NULL,
                                      PRIMARY KEY (id)
);