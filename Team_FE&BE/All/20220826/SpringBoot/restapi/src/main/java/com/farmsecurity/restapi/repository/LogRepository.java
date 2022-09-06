package com.farmsecurity.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.farmsecurity.restapi.model.Log;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface LogRepository extends JpaRepository<Log, String> { // 로그 레포지토리

    List<Log> findByMemberId(String memberId); // 마지막 로그 찾기

    @Transactional
    List<Log> deleteByTime(String time); // 로그 삭제

}
