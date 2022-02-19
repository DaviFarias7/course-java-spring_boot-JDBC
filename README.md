# Projeto web services com Spring Boot e JPA / Hibernate 
Objetivos 
- Criar projeto Spring Boot Java 
- Implementar modelo de domínio 
- Estruturar camadas lógicas: resource, service, repository 
- Configurar banco de dados de teste (H2) 
- Povoar o banco de dados 
- CRUD - Create, Retrieve, Update, Delete 
- Tratamento de exceções

# Modelo de domínio

![image](https://user-images.githubusercontent.com/86566715/154816104-af1f1f7a-6ec8-41d9-9fde-9f17b77df183.png)

# Instância de domínio

![image](https://user-images.githubusercontent.com/86566715/154816199-d4ea7e2d-e14f-49c4-bf67-fbafa5ea43f7.png)

# Aplicação funcionando em produção via Heroku

### GET USERS :green_circle:
https://course-java-jdbc.herokuapp.com/users

### INSERT USER :yellow_circle:
- Json do corpo da requisição POST
  ```
  {
     "name": "nome",
     "email": "nomea@gmail.com",
     "phone": "9999999",
     "password": "123456"
   }

### UPDATE USER :large_blue_circle:
https://course-java-jdbc.herokuapp.com/users/ " IFORMAR O ID DO USER A SER ATUALIZADO"
- Json do corpo da requisição PUT
  ```
  {
     "name": "nome",
     "email": "nomea@gmail.com",
     "phone": "9999999",
     "password": "123456""
   }


### DELETE USER :red_circle:
https://course-java-jdbc.herokuapp.com/users/" IFORMAR O ID DO USER A SER DELETADO"

### GET PRODUCTS :green_circle:
https://course-java-jdbc.herokuapp.com/products

### GET ORDERS :green_circle:
https://course-java-jdbc.herokuapp.com/orders

### GET CATEGORIES :green_circle:
https://course-java-jdbc.herokuapp.com/categories
