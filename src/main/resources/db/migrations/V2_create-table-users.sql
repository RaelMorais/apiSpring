CREATE TABLE users (
    id TEXT primary key unique not null, 
    login TEXT primary key unique, 
    password text not null, 
    role text not null, 

);