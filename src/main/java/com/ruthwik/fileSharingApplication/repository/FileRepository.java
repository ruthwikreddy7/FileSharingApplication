package com.ruthwik.fileSharingApplication.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ruthwik.fileSharingApplication.entity.FileEntity;


@Repository
public interface FileRepository extends JpaRepository<FileEntity, Integer> {
    List<FileEntity> findByExpiryTimeBefore(LocalDateTime now);

}