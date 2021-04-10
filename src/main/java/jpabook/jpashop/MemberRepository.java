package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository { // 리포지토리는 엔티티 같은 걸 찾아주는 애

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member); // 멤버를 주입
        return member.getId();
    }

    public Member find(Long id) { // 조회
        return em.find(Member.class, id);
    }

}
