package za.ac.nwu.translator;

import za.ac.nwu.domain.persistence.Member;
import java.util.List;

public interface MemberTranslator {
    List<Member> getAllMembers();
}
