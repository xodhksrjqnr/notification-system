package com.taewan.notification_api_server.domain.device.repository;

import com.taewan.notification_api_server.domain.device.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
