# java-todo-api

## 実行可能jarファイルの作成

```shell
# jarファイル作成
./mvnw clean package
```

```shell
# テスト通さずjarファイル作成
./mvnw clean package -DskipTests=true
```

## jarファイルの実行

```shell
java -jar target/todo-0.0.1-SNAPSHOT.jar
```
