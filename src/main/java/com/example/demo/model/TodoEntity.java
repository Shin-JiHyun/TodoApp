package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@NoArgsConstructor //인자없는 생성자 생성
@AllArgsConstructor
@Data   //GETTER/SETTER추가
@Entity //엔터티 클래스 지정
@Table(name = "Todo")
public class TodoEntity {
    @Id //id를 기본키 (프라이머리키) 지정
    @GeneratedValue(generator = "system-uuid")  //system-uuid 이름의 generator 이용하겠다는 의미
    @GenericGenerator(name = "system-uuid", strategy = "uuid") // system-uuid라는 이름의 generator 정의, 생성방식 uuid문자열
    private String id;
    private String userId;
    private String title;
    private boolean done;
}
