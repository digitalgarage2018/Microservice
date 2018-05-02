package it.iseed.coupon.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.iseed.coupon.entities.Coupon;

import java.util.Optional;

public interface CouponDao extends JpaRepository<Coupon, Integer> {

    Optional<Coupon> findByAccount(String account);
}
