//package SimpleDBObject;
//
//import EntityMappingExample.Member;
//
//import javax.persistence.*;
//import java.util.List;
//
//public class JPAMain {
//    public static void main(String[] args) {
//        //엔티티 매니저 팩토리 생성
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpabook");
//        //엔티티 매니저 생성
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        //트랜잭션 가져오기
//        EntityTransaction tx = entityManager.getTransaction();
//
//        try{
//            tx.begin();
//            logic(entityManager);
//            tx.commit();
//        } catch (Exception e){
//            tx.rollback();
//        } finally {
//            //엔티티 매니저 종료
//            entityManager.close();
//        }
//        //엔티티 매니저 팩토리 종료
//        entityManagerFactory.close();
//    }
//
//    public static void logic(EntityManager em){
//        String id = "id";
//        Member member = new Member();
//        member.setId(id);
//        member.setUsername("더미원");
//
//        //등록
//        em.persist(member);
//
//        //조회
//        Member found = em.find(Member.class, id);
//        System.out.println(found.toString());
//
//        //다수조회
//        List<Member> list = em.createQuery("select m from Member m", Member.class)
//                .getResultList();
//        System.out.println("list.size : "+list.size());
//
//        //삭제
//        em.remove(member);
//    }
//}
