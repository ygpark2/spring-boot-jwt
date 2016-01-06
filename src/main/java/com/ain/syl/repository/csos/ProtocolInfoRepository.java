package com.ain.syl.repository.csos;

import com.ain.syl.domain.csos.ProtocolInfo;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Young Gyu Park on 1/10/2015.
 */
@Repository
public interface ProtocolInfoRepository extends CrudRepository<ProtocolInfo, Integer>, QueryDslPredicateExecutor<ProtocolInfo> {

    // @Query(value = "SELECT * FROM whatever_custom_query here s WHERE s.reconciliation_setting_id=?1", nativeQuery = true)
    // B2gHist doAFoo(String s);

    Optional<ProtocolInfo> findOneByProtocolType(Integer id);
}
