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

## APIエンドポイントを叩く

- 全タスク情報を取得する
```shell
curl http://localhost:8080/services/v1/tasks | jq
```

- 特定のタスク情報を取得する
```shell
curl http://localhost:8080/services/v1/tasks/4 | jq
```
