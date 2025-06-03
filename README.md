# 📚 Aluno Online - Sistema de Gerenciamento Acadêmico

Projeto back-end desenvolvido com Spring Boot para gerenciar alunos, professores, disciplinas e matrículas em uma instituição de ensino.



## 🛠️ Tecnologias Utilizadas

- ✅ Java 17
- ✅ Spring Boot
- ✅ Spring Web
- ✅ Spring Data JPA
- ✅ H2 Database
- ✅ Maven
- ✅ Swagger (OpenAPI)
- ✅ Insomnia (para testes de API)



## 📂 Estrutura do Projeto

src  
└── main  
├── java  
│   └── br.com.alunoonline.api  
│       ├── config  
│       │   └── SwaggerConfig.java  
│       ├── controller  
│       │   ├── AlunoController.java  
│       │   ├── DisciplinaController.java  
│       │   ├── MatriculaAlunoController.java  
│       │   └── ProfessorController.java  
│       ├── dtos  
│       │   ├── AtualizarNotasRequestDTO.java  
│       │   ├── DisciplinasAlunoResponseDTO.java  
│       │   └── HistoricoAlunoResponseDTO.java  
│       ├── enums  
│       │   └── MatriculaAlunoStatusEnum.java  
│       ├── model  
│       │   ├── Aluno.java  
│       │   ├── Disciplina.java  
│       │   ├── MatriculaAluno.java  
│       │   └── Professor.java  
│       ├── repository  
│       │   ├── AlunoRepository.java  
│       │   ├── DisciplinaRepository.java  
│       │   ├── MatriculaAlunoRepository.java  
│       │   └── ProfessorRepository.java  
│       └── service  
│           ├── AlunoService.java  
│           ├── DisciplinaService.java  
│           ├── MatriculaAlunoService.java  
│           └── ProfessorService.java  
└── resources



## ⚙️ Como Executar o Projeto

1.  Clone o repositório:
    ```bash
    git clone https://github.com/erikaveloso/AlunoOnline.git
    ```

2.  Abra no IntelliJ, Eclipse ou VS Code (com suporte a Java).

3.  Execute a aplicação:
    ```bash
    ./mvnw spring-boot:run
    ```

4.  Acesse o Swagger para testar os endpoints:  
    `http://localhost:8080/swagger-ui/index.html`



## 🚀 Funcionalidades

* 👨‍🎓 **Alunos**
    * Cadastro de alunos
    * Consulta de todos os alunos
    * Atualização de dados
    * Remoção de aluno

* 👩‍🏫 **Professores**
    * Cadastro e gerenciamento de professores

* 📘 **Disciplinas**
    * Criação de disciplinas
    * Associação com professores

* 📝 **Matrículas**
    * Realizar matrícula de alunos em disciplinas
    * Atualizar notas e status da matrícula
    * Visualizar histórico escolar



## 🧪 Testes de API

Utilizar o Swagger para testes interativos via navegador.  
Também é possível testar usando o Insomnia ou Postman com os seguintes endpoints base:

* `GET    /aluno`
* `POST   /aluno`
* `PUT    /aluno/{id}`
* `DELETE /aluno/{id}`
* ...



## 🧑‍💻 Autora

Desenvolvido por Érika Veloso  
📚 Curso: Sistemas para Internet  
🌐 Projeto acadêmico com fins educativos


## Entregas no decorrer do projeto:

### criarAluno
| Insomnia | DBeaver |
|-------|-------|
| ![Captura de tela 2025-04-06 112334](https://github.com/user-attachments/assets/c2ceb9c3-dbae-4d36-bf81-b1c77b679a74) | ![Captura de tela 2025-04-06 112130](https://github.com/user-attachments/assets/8a8daa55-96b7-4990-aa1f-ba15a7b570c2) |

### deletarAlunoPorId
| Insomnia | DBeaver |
|-------|-------|
| ![Captura de tela 2025-04-14 083111](https://github.com/user-attachments/assets/1d0e3cde-02fe-4a6f-802e-504c1b3df79b) | ![Captura de tela 2025-04-14 083123](https://github.com/user-attachments/assets/789e561a-4035-474b-b400-6a256f3e9d63) |

### Aluno, Professor e Disciplina (CRUD completo)
| Insomnia | DBeaver |
|-------|-------|
| ![Captura de tela 2025-04-23 085706](https://github.com/user-attachments/assets/ce34202f-58a7-4b00-aa04-e88f2b944c6f) | ![Captura de tela 2025-04-23 085651](https://github.com/user-attachments/assets/836857db-5d76-42a5-a552-de67d1952492) |

### MatriculaAluno com trancar e adicionar Swagger
| Insomnia | DBeaver | Swagger |
|-------|-------|-------|
| ![Captura de tela 2025-05-08 133555](https://github.com/user-attachments/assets/4bbb9014-98dc-45cf-8f0a-f78eaee9cde3) | ![Captura de tela 2025-05-08 133624](https://github.com/user-attachments/assets/3b00a96e-7ca5-42e7-a2a9-69417b84159d) | ![Captura de tela 2025-05-08 133753](https://github.com/user-attachments/assets/884fdda6-2970-43d2-8c64-a0658fb8426b) |


