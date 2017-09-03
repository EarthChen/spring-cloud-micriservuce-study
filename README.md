# spring-cloud-microservice-study

## 版本信息
本仓库作为spring学习用仓库，使用以下版本
* spring-cloud Dalston.SR1
* spring-boot 1.5.6.RELEASE
* jdk 1.8

## Eureka
修改host，将以下主机名添加进host
```text
127.0.0.1 discovery
127.0.0.1 peer1
127.0.0.1 peer2
```

### 运行服务发现

#### 服务端
运行模块**microservice-discovery-eureka**中的main函数即可

然后在浏览器中输入127.0.0.1:端口号(**application.yml**中指定的端口),即可看到注册中心页面

#### 客户端
运行模块**microservice-eureka-client**中的main函数即可

在其**application.yml**需要确保注册到了注册中心的端口




### 高可用
修改服务端中的**application.yml**,配置两个不同端口，起两个服务，需要指定参数运行

如使用高可用需要在运行的时候指定--**spring.profiles.active=peer1**和--**spring.profiles.active=peer2**，可以使用运行jar

打包成jar命令如下:(首先需要进入相应子模块根目录)
```bash
$ mvn clean package
```

运行jar指定参数命令如下；
```bash
$ java -jar microservice-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
$ java -jar microservice-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
```







