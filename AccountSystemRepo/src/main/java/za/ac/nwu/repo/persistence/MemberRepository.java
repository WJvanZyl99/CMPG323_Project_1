package za.ac.nwu.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.nwu.domain.persistence.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

}
