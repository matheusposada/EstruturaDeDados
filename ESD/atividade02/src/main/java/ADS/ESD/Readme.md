````mermaid
classDiagram
    direction LR
    
    class App{
        
    }
    
    class Catalogo{
        - imoveis: Hashmap~String, ID~
    }
           
    class Locatarios{
        -String CPF
        -String nome
        -String telefone        
        
    }
    
    class Contrato{
        - Imoveis imovel
        - Locatarios locatario
    }
    
    class Imoveis{
        -String descricao
        -String ID
        -String endereco
        -double preco
        
    }
        
     App ..> "0..*" Contrato   
     Contrato "1" o-- "1" Imoveis    
     Contrato "1" o-- "1" Locatarios
     Catalogo "1" *-- "0..*" Imoveis
     



````