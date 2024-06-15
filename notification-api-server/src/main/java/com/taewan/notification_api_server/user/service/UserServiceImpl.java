package com.taewan.notification_api_server.user.service;

import com.taewan.notification_api_server.tool.convertor.DtoConvertor;
import com.taewan.notification_api_server.tool.convertor.EntityConvertor;
import com.taewan.notification_api_server.user.dto.request.JoinInfoDto;
import com.taewan.notification_api_server.user.dto.response.SearchOneResultDto;
import com.taewan.notification_api_server.user.dto.response.SearchResultDto;
import com.taewan.notification_api_server.user.dto.request.WithdrawInfoDto;
import com.taewan.notification_api_server.user.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    final UsersRepository usersRepository;

    @Autowired
    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public void join(JoinInfoDto dto) {
        usersRepository.save(DtoConvertor.toUser(dto));
    }

    @Override
    public void withdraw(WithdrawInfoDto dto) {
        usersRepository.deleteByUserIdAndEmail(dto.getUserId(), dto.getEmail());
    }

    @Override
    @Transactional(readOnly = true)
    public SearchResultDto searchAll() {
        List<SearchOneResultDto> dtos = usersRepository
                .findAll()
                .stream()
                .map(EntityConvertor::toDto)
                .collect(Collectors.toList());

        return new SearchResultDto(dtos);
    }
}
