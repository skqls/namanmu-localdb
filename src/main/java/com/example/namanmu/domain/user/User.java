package com.example.namanmu.domain.user;

import com.example.namanmu.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@Table(name= "user")
@Entity

//캐쉬를 위해서...
//public class User extends BaseTimeEntity implements Serializable {

public class User extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column
    private String picture;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public User(String name, String email, String picture, Role role) {
        this.name = name;
        this.email = email;
        this.picture = picture;
        this.role = role;
    }

    public User update(String name, String picture) {
        this.name = name;
        this.picture = picture;

        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }
}

//    private void joinUserMakeRanking(User joinUser) {
//        // Try to find an existing ranking for the user
//        Ranking joinUserRanking = rankingRepository.findByUser(joinUser);
//
//        if (joinUserRanking == null) {
//            // Create a new ranking if it doesn't exist
//            joinUserRanking = Ranking.builder()
//                    .user(joinUser)
//                    .currentWinNums(0)
//                    .bestWinNums(0)
//                    .build();
//        } else {
//            // Update the existing ranking
//            joinUserRanking.setCurrentWinNums(joinUserRanking.getCurrentWinNums() + 1);
//            joinUserRanking.setBestWinNums(Math.max(joinUserRanking.getBestWinNums(), joinUserRanking.getCurrentWinNums()));
//        }
//        rankingRepository.save(joinUserRanking);
//    }
//
