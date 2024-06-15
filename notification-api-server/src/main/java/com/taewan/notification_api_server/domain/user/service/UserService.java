package com.taewan.notification_api_server.domain.user.service;

import com.taewan.notification_api_server.domain.user.dto.request.JoinInfoDto;
import com.taewan.notification_api_server.domain.user.dto.response.SearchResultDto;
import com.taewan.notification_api_server.domain.user.dto.request.WithdrawInfoDto;

public interface UserService {

    void join(JoinInfoDto dto);
    void withdraw(WithdrawInfoDto dto);
    SearchResultDto searchAll();
}
