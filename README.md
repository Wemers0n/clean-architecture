
# Clean Architecture com Java Spring Boot

O modelo proposto por Robert C. Martin, visa separar as preocupações do negócio das tecnologias específicas, promovendo a independência de frameworks e facilitando a manutenção e evolução do software ao longo do tempo.

Neste projeto o Spring foi utilizado para lidar com os detalhes técnicos e de infraestrutura, enquanto a Clean Architecture orienta a organização do código em camadas coesas e desacopladas.

## Tecnologias

- Spring Boot 
- Spring Data Jpa
- H2 Database
- Lombok

## Utilização do projeto

Fazendo clone do repositório

```
$ git clone https://github.com/Wemers0n/clean-architecture.git
```

```
$ cd clean-architecture
```

Executando
```
$ mvn clean install
```

```
$ mvn spring-boot:run
```
## Endpoints

#### Retorna todos os usuários

```http
  GET /api/users

  	{
		"username": "Teste",
		"email": "teste@gmail.com"
	}
```
#### Faz a criação dos usuários

```http
  POST /api/users

    {
        "username" : "Teste",
        "password" : "12345678",
        "email" : "teste@gmail.com"
    }
```

