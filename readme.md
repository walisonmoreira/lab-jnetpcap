# [Lab jNetPCap](https://github.com/walisonmoreira/lab-jnetpcap)

Experimentos com [jNetPCap](http://jnetpcap.com).

jNetPCap é uma biblioteca Java usada para interceptar pacotes de dados numa rede.

## Comandos

* `mvnw clean` - Limpar os arquivos gerados automaticamente.
* `mvnw compile` - Compila o projeto.
* `mvnw exec:java` - Executa o projeto. Em seguida acesse `http://127.0.0.1:8080`.

## Criação

Na criação do projeto, o seguinte comando foi executado:

```
mvn -N io.takari:maven:0.4.3:wrapper -Dmaven=3.5.4
```

Isso habilita a utilização do Maven Wrapper. Dessa forma não é mais necessário ter o Maven instalado e configurado. Basta utilizar o script `mvnw` no Linux e o `mvnw.cmd` no Windows.

## Links

* [jNetPcap - Libpcap/WinPcap Java Wrapper](https://sourceforge.net/projects/jnetpcap). Projeto no SourceForge.
* [Capture Network Packages with Java](https://javatutorial.net/capture-network-packages-java).
