# [Lab jNetPCap](https://github.com/walisonmoreira/lab-jnetpcap)

Experimentos com o [jNetPCap](http://jnetpcap.com).

jNetPCap é uma biblioteca Java usada para interceptar pacotes de dados numa rede.

## Comandos

* `mvnw clean` - Limpar os arquivos gerados automaticamente.
* `mvnw org.codehaus.mojo:exec-maven-plugin:1.3.2:java -Dexec.mainClass=lab.jnetpcap.Main` - Executar a aplicação.

## Executando

Pelo Eclipse, execute a configuração de execução `eclipse/lab-jnetpcap-main.launch` ou `eclipse/lab-jnetpcap-mvn-exec-java.launch`.

Pelo Maven, execute `mvn org.codehaus.mojo:exec-maven-plugin:1.3.2:java`.

Em seguida acesse `http://127.0.0.1:8080`.

## Criação

Durante a criação do projeto, o seguinte comando foi executado:

```
mvn -N io.takari:maven:0.4.3:wrapper -Dmaven=3.5.4
```

Com isso o projeto não precisa mais do Maven instalado e configurado para funcionar. Agora basta utilizar o script `mvnw` no Windows ou no Linux.

## Links

* [jNetPcap - Libpcap/WinPcap Java Wrapper](https://sourceforge.net/projects/jnetpcap). Projeto no SourceForge.
* [Capture Network Packages with Java](https://javatutorial.net/capture-network-packages-java).