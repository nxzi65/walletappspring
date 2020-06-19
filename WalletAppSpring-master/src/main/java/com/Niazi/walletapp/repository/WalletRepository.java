package com.Niazi.walletapp.repository;

import com.Niazi.walletapp.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WalletRepository extends JpaRepository<Wallet,Long> {
    List<Wallet> findAllByOrderByPriority();
}
