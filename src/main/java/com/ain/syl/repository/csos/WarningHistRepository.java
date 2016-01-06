package com.ain.syl.repository.csos;

import com.ain.syl.domain.csos.WarningHist;
import com.ain.syl.domain.csos.WarningHistPK;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Young Gyu Park on 1/10/2015.
 */
@Repository
public interface WarningHistRepository extends CrudRepository<WarningHist, WarningHistPK>, QueryDslPredicateExecutor<WarningHist> {

    // @Query(value = "SELECT * FROM whatever_custom_query here s WHERE s.reconciliation_setting_id=?1", nativeQuery = true)
    // B2gHist doAFoo(String s);

}
