# Projeto do curso QAzando - Testes Automatizados Web

Projeto de automação de testes web com Selenium webDriver e java.

# Estrutura:
  * Pasta Raiz
    * Readme (este arquivo de leitura)
    * Arquivo pom.xml -> neste arquivo estão inseridas as dependências do projeto. Após realizar atualizações no arquivo, o maven deve ser atualizado/sincronizado.
    * Driver do browser -> O arquivo de driver do browser a ser utilizado deve ser baixado, instalado e copiado para a pasta raiz do projeto. Neste projeto foram inseridos os arquivos "chromedriver" (driver do chrome) e "geckodriver" (driver do firefox)
    * Pasta "src" -> Pasta criada por padrão
      * Pasta "runner" -> Pasta criada por padrão
      * Pasta "test" -> Pasta criada por padrão
        * Pasta "java" -> Pasta criada por padrão
          * "pages" -> page objects
          * "runner" -> executor do projeto, o que chama a execução dos testes
          * "steps" -> arquivos com os passos do BDD
          * "support" -> arquivos que podem ser reutilizados em outras partes do projeto
        * "resources"
          * "features" -> arquivos de BDD (.feature)

# Versões
- Cluecumber-report 2.9.4 -> Geração de relatórios - gera informações mais completas, porém o relatório só é gerado quando rodado no terminal (com.trivago.rta)
- Maven-surefire 3.2.5 -> Geração de relatórios

- Chrome 123.0.6312.105 macos
- Firefox (geckodriver) 0.34.0 macos
