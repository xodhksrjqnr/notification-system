package com.taewan.notification_api_server.user.service;

import com.taewan.notification_api_server.user.dto.JoinInfoDto;
import com.taewan.notification_api_server.user.dto.SearchResultDto;
import com.taewan.notification_api_server.user.dto.WithdrawInfoDto;

public interface UserService {

    void join(JoinInfoDto dto);
    void withdraw(WithdrawInfoDto dto);
    SearchResultDto searchAll();
}
