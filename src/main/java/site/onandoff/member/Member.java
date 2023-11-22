package site.onandoff.member;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import site.onandoff.util.EntityHistory;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends EntityHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String nickname;

    private String password;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private Provider provider;

}
