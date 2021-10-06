package za.ac.nwu.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.nwu.domain.persistence.Member;
import za.ac.nwu.repo.persistence.MemberRepository;
import za.ac.nwu.translator.MemberTranslator;
import java.util.ArrayList;
import java.util.List;

public class MemberTranslatorImpl implements MemberTranslator {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<Member> getAllMembers() {
        List<Member> members = new ArrayList<>();

        try {
            for (Member member : memberRepository.findAll()) {
                members.add((member));
            }
        }
        catch (Exception e) {
            throw new RuntimeException("Unable to read from DB!", e);
        }

        return members;
    }
}
