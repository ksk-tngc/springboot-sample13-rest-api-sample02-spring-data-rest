## 概要

Spring Boot で簡単に REST API を作成するサンプルです。

[**Spring Data REST**](https://spring.pleiades.io/projects/spring-data-rest#overview) を使用することで、リソース (テーブル) の CRUD 操作に対応する各エンドポイントをコントローラ及びリポジトリ操作の実装なしに自動で生成します。

生成された REST API は、Swagger UI (Open API) で可視化して確認します。

## サンプルで使用したリソース及び生成されるエンドポイント

#### リソース (USER テーブル)
<img src="https://user-images.githubusercontent.com/59589496/136736053-70c56f43-447d-46ba-9171-1a07c2f7e4c9.png" width="">  

#### エンドポイント (Spring Data REST が自動生成)
| メソッド   | URL                             | 処理                             |
|----------|----------------------------------|----------------------------------|
| `GET`    | `/api/v1/users`                   | 全件取得                         |
| `POST`   | `/api/v1/users`                   | 登録                            |
| `GET`    | `/api/v1/users/{id}`              | ID指定で検索                      |
| `PUT`    | `/api/v1/users/{id}`              | ID指定で更新（全てのフィールドを指定） |
| `DELETE` | `/api/v1/users/{id}`              | ID指定で削除                       |
| `PATCH`  | `/api/v1/users/{id}`              | ID指定で更新（一部のフィールドを更新） |
| `GET`    | `/api/v1/users/search/findByName` | ユーザ名を指定して検索（※）           |

※ リポジトリに追加したカスタムクエリは `/[リソース名]/search/[クエリメソッド名]` でエンドポイントが自動生成されます。


## 画面

### API 仕様

Swagger UI (Open API) で、生成された REST API の確認 (可視化) を行います。

#### エンドポイント
<img src="https://user-images.githubusercontent.com/59589496/136736978-906ca2c4-2d58-4094-85e7-15c6dde4ba4a.png" width="600px">

#### リクエストボディの定義情報 (POST の例)
<img src="https://user-images.githubusercontent.com/59589496/136737300-a95144ae-1895-4209-b8f8-be610f5b1baf.png" width="600px">

### API 呼び出し

Postman で登録及び取得の確認を行います。

#### 登録 (POST)
<img src="https://user-images.githubusercontent.com/59589496/136739945-058f0faf-2bcd-4de7-b339-edc6c6fc3d53.png" width="800px">

同様に数件登録。

#### 取得 (GET)
<img src="https://user-images.githubusercontent.com/59589496/136744278-258eaf80-de44-4ce9-a560-9768d0c083cc.png" width="800px">


## フォルダ構成

<img width="320" src="https://user-images.githubusercontent.com/59589496/136744759-c8a70635-16bd-4205-bb7a-331bc81f0dd9.png">


## 依存関係

* Spring Boot DevTools
* Spring Web
* Validation
* Spring Data JPA
* __Spring Data REST__
* H2 Database
* Lombok
* Springdoc OpenAPI UI
* Springdoc OpenAPI Data REST
