package com.taewan.notification_api_server.user.dto;

import java.time.LocalDateTime;

public class SearchOneResultDto extends FullInfoDto {

    int id;
    LocalDateTime createdAt;

    public int getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
