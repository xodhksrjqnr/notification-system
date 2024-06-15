package com.taewan.notification_api_server.user.dto.response;

import com.taewan.notification_api_server.user.dto.response.SearchOneResultDto;

import java.util.List;

public class SearchResultDto {

    List<SearchOneResultDto> userList;
    int size;

    public SearchResultDto(List<SearchOneResultDto> dtos) {
        this.userList = dtos;
        this.size = userList.size();
    }

    public List<SearchOneResultDto> getUserList() {
        return userList;
    }

    public int getSize() {
        return size;
    }
}
