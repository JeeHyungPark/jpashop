package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue // 식별자를 id에 맵핑해주고, GeneratedValue로 자동 생성하게 함
    private Long id;
    private String username;
}
