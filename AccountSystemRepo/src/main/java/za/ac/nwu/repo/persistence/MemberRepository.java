package za.ac.nwu.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import za.ac.nwu.domain.persistence.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>,
        QueryByExampleExecutor<Member> {
}
