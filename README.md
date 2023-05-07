# Welcome To My Java 3 Final Project!

## What is my project about?
My project recieves data from a CSV file I was able to obtain that contains the items I own in a game called _Destiny 2._
This project is meant to be able to items from the game and allow different users to be able to favorite items as well.

## How to use my project
Make sure to register a new user and log in to see what items are being listed. On the navbar located at the top of the 
page, you are able to filter items by their associated rarities and sort these items in multiple, convinient ways.
Users also have the option of favouring the items they like the most. When you're done, you can log out by selecting 
"log out" on the nav bar located at the top of the page.



### Database Code:
`create table users
(
id         int auto_increment
primary key,
first_name varchar(100)                                not null,
last_name  varchar(100)                                not null,
email      varchar(100)                                not null,
password   varchar(255)                                not null,
status     enum ('inactive', 'active', 'locked')       not null,
privileges enum ('none', 'editor', 'admin', 'premium') not null,
constraint email
unique (email)
);

create table user_favorites
(
user_id   int    not null,
weapon_id bigint not null,
primary key (user_id, weapon_id),
constraint fk_user_id
foreign key (user_id) references users (id)
);`

## Thank you for viewing my Java 3 Final Project!