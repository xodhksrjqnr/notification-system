package com.taewan.notification_api_server.tool.convertor;

import com.taewan.notification_api_server.user.User;
import com.taewan.notification_api_server.user.dto.SearchOneResultDto;

public class EntityConvertor {

    static public SearchOneResultDto toDto(User entity) {
        SearchOneResultDto dto = new SearchOneResultDto();
        dto.setId(entity.getId());
        dto.setUserId(entity.getUserId());
        dto.setPassword(entity.getPassword());
        dto.setPhoneNumber(entity.getPhoneNumber());
        dto.setEmail(entity.getEmail());
        dto.setCreatedAt(entity.getCreatedAt());

        return dto;
    }
}
