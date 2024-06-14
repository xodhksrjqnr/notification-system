package com.taewan.notification_api_server.api;

import com.taewan.notification_api_server.user.dto.JoinInfoDto;
import com.taewan.notification_api_server.user.dto.SearchResultDto;
import com.taewan.notification_api_server.user.dto.WithdrawInfoDto;
import com.taewan.notification_api_server.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Transactional
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @Transactional(readOnly = true)
    public SearchResultDto requestSearchAll() {
        return userService.searchAll();
    }

    @PostMapping("/join")
    public void requestJoin(JoinInfoDto dto) {
        userService.join(dto);
    }

    @PostMapping("/withdraw")
    public void requestWithDraw(WithdrawInfoDto dto) {
        userService.withdraw(dto);
    }
}
