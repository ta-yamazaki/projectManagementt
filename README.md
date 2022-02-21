# 案件管理アプリケーション

---

## 案件管理業務とアプリケーションの対象範囲
このアプリケーションは、営業部署の案件管理業務をサポートするアプリケーションです。

### 主な対象業務
- 顧客情報の記録
- 進捗管理
- レポート出力


## 技術・設計
- ドメイン駆動設計 (DDD)
- Spring MVC
- Spring Security
- Thymeleaf
- MyBatis SQL Mapper
- PostgreSQL (h2db)


## 起動方法
```sh
./gradlew bootRun
```

[comment]: <> (http://localhost:8080 でダッシュボード画面を表示)

[comment]: <> (## 実行可能Jarのビルドと実行)

[comment]: <> (```sh)

[comment]: <> (./gradlew clean build)

[comment]: <> (java -jar webapp/build/libs/webapp.jar)

[comment]: <> (```)

[comment]: <> (## JIG 設計ドキュメントの自動生成)

[comment]: <> (```sh)

[comment]: <> (./gradlew jig)

[comment]: <> (```)

[comment]: <> (`webapp/build/jig` 以下にソースコードから自動生成したクラス一覧やクラスの関連図を出力)


[comment]: <> (## アーキテクチャ)

[comment]: <> (![アーキテクチャ]&#40;architecture.png&#41;)