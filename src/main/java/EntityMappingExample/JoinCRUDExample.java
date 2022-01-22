package EntityMappingExample;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class JoinCRUDExample {
    @Autowired
    EntityManager em;

    public void testSave(){
        Team team1 = new Team("team1", "팀1");
        em.persist(team1);

        Member member1 = new Member("member1", "회원1");
        member1.setTeam(team1);
        em.persist(member1);

        Member member2 = new Member("member2", "회원2");
        member2.setTeam(team1);
        em.persist(member2);
    }

    public void queryLogicJoin(EntityManager em){
        String jpq1 = "select m from Member m join m.team t where "+"t.name=:teamName";
        List<Member> resultList = em.createQuery(jpq1, Member.class)
                .setParameter("teamName", "First_Team")
                .getResultList();

        
    }
}
