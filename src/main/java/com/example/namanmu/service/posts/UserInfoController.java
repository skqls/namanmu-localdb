package com.example.namanmu.service.posts;

import com.example.namanmu.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserInfoController {

//    private final HttpSession httpSession;

    @GetMapping("/api/userinfo")
    public SessionUser UserInfo(HttpServletRequest request) {

        HttpSession httpSession = request.getSession();

        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        if(user != null){
//            Map<String, Object> userInfo = new HashMap<>();
//            userInfo.put("name", user.getName());
//            userInfo.put("email",user.getEmail());
//            userInfo.put("picture",user.getPicture());
//            return userInfo;

            return user;

        }else{
//            throw new RuntimeException("user not found in session");
            return null;
        }
    }

}
