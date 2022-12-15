package hello.servlet.domain.member;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MemberRepositoryTest {
	MemberRepository memberRepository = MemberRepository.getInstance();

	@AfterEach
	void afterEach(){
		memberRepository.clearStore();
	}

	@Test
	void save(){
		//given
		Member member = new Member("hello", 20);
		//when
		Member savedMember = memberRepository.save(member);
		//then
		Member findMember = memberRepository.findById(savedMember.getId());
		assertThat(findMember).isEqualTo(savedMember);
	}

}
