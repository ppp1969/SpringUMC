package umc.spring.domain.mapping;

import lombok.*;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.common.FoodCategory;
import umc.spring.domain.common.Member;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberPrefer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "foodCategory_id")
    private FoodCategory foodCategory;

}