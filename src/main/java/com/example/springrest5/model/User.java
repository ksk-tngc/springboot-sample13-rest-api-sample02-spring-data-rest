package com.example.springrest5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * ユーザテーブルのエンティティクラス。
 */
@Entity
@Data
public class User {

    /** ID */
    @Id
    @GeneratedValue
    private Long id;

    /** 名前 */
    @NotBlank
    @NotNull
    private String name;

    /** 年齢 */
    @NotNull
    private Integer age;

}
