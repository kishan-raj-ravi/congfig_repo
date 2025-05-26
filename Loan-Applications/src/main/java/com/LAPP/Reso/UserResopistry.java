package com.LAPP.Reso;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LAPP.entity.LoanEntity;

public interface UserResopistry extends JpaRepository<LoanEntity, Integer> {

}
