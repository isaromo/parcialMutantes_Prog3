# TEST MUTANTES (PARCIAL 1 - PROG 3)
Esta API tiene como objetivo determinar si un humano es mutante o no basándose en su secuencia de ADN.
___
## INSTALACIÓN
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/usuario/proyecto-x.git

2. Entrar en el directorio del proyecto:
   ```bash
   cd proyecto-x
  
3. Instalar las dependencias:

   ```bash
   npm install

4. Ejecutar la API:

   ```bash
   npm start

___   
## CÓMO PROBAR ENDPOINTS
### **1. EN RENDER**

Desde Render, solo se podrá verificar el endpoint "/stats".

Para esto, ingresar a la URL: https://parcialmutantes-prog3.onrender.com/mutantapi/api/v1/stats

### **2. EN POSTMAN**

Desde la aplicación Postman, se podrán probar los endpoints "/mutant" y "/stats".

* `2.1. Endpoint "/stats"`

Crear una request de tipo "GET" y colocar como URL: https://parcialmutantes-prog3.onrender.com/mutantapi/api/v1/stats . Presionar "SEND".

* `2.2. Endpoint "/mutant"`

Crear una request de tipo "POST" y colocar como URL: https://parcialmutantes-prog3.onrender.com/mutantapi/api/v1/mutant . En el apartado de "Body", ir a la opción RAW y colocar un JSON. Presionar "SEND".


 ### **3. EN SWAGGER UI (OpenAPI)**
 
 Desde la interfaz interactiva SwaggerUI, también se podrán probar ambos endpoints. Para esto, ingresar a la URL: https://parcialmutantes-prog3.onrender.com/mutantapi/api/v1/swagger-ui/index.html

 * `2.1. Endpoint "/stats"`

Seleccionar el endpoint "GET /stats". Presionar "Try it out". Presionar "Execute".

* `2.2. Endpoint "/mutant"`

Seleccionar el endpoint "POST /mutant". Presionar "Try it out". Colocar un JSON. Presionar "Execute".

___
## JSONs DE PRUEBA

* `Filas:`

  ```json
  {
      "dna": [
          "CCCCTA",
          "TGCAGT",
          "GCTTCC",
          "CCCCTG",
          "GTAGTC",
          "AGTCAC"
      ]
  }

* `Columnas:`

  ```json
  {
      "dna": [
          "AGAATG",
          "TGCAGT",
          "GCTTCC",
          "GTCCTC",
          "GTAGTC",
          "GGTCAC"
      ]
  }

* `Diagonales principales:`

  ```json
  {
      "dna": [
          "AGAATG",
          "TACAGT",
          "GCAGCC",
          "TTGATG",
          "GTAGTC",
          "AGTCAA"
      ]
  }

* `Diagonal derecha ↘:`

  ```json
  {
    "dna": [
        "ATAATG",
        "GTTAGT",
        "GGCTCG",
        "TTGATG",
        "GTAGTC",
        "AGTCAA"
    ]
  }

* `Diagonal izquierda ↙:`

  ```json
  {
    "dna": [
        "ATAATG",
        "GTATGA",
        "GCTTAG",
        "TTTAGG",
        "GTAGTC",
        "AGTCAA"
    ]
  }

* `Filas y columnas:`

  ```json
  {
    "dna": [
        "CGATCA",
        "GATGCT",
        "TCCCCT",
        "TACAGT",
        "GTAACT",
        "ACCGTA"
    ]
  }

* `Todas las direcciones:`

  ```json
  {
    "dna": [
        "GGTGTG",
        "TCGCCG",
        "CCAAAA",
        "ACTGAT",
        "GCCAGC",
        "CTACTA"
    ]
  }

* `No mutante:`

  ```json
  {
    "dna": [
        "ATCGAT",
        "CTCTTG",
        "CAAGGC",
        "GGTATT",
        "ATCGAT",
        "AAGTCC"
    ]
  }


___
~ Desarrollado por [Isabella Romo](https://github.com/isaromo)
