package com.ain.syl.repository.csos;

import com.ain.syl.domain.csos.B2gHist;
import com.ain.syl.domain.csos.B2gHistPK;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Young Gyu Park on 1/10/2015.
 */
@Repository
public interface B2gHistRepository extends CrudRepository<B2gHist, B2gHistPK>, QueryDslPredicateExecutor<B2gHist> {

    // @Query(value = "SELECT * FROM whatever_custom_query here s WHERE s.reconciliation_setting_id=?1", nativeQuery = true)
    // B2gHist doAFoo(String s);

    // B2gHist findByEqpNum(String eqpNum);

    // List<B2gHist> findByLastname(String lastname, Sort sort);

    // Page<B2gHist> findByFirstname(String firstname, Pageable pageable);

}