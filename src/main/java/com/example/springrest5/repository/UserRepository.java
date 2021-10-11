package com.example.springrest5.repository;

import com.example.springrest5.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * ユーザテーブルのリポジトリインターフェース。
 */
@RepositoryRestResource // 省略可
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 名前からユーザを検索するクエリメソッド。
     * @param name 名前
     * @return ユーザエンティティ
     */
    User findByName(String name);

}
