package umc.spring.service.MemberService;

import umc.spring.web.dto.MemberRequestDTO;
import umc.spring.domain.common.Member;

public interface MemberCommandService {

    public Member joinMember(MemberRequestDTO.JoinDto request);
}
