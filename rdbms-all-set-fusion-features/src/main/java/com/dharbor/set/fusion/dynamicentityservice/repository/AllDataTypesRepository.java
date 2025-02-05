/*Digital Harbor International, Inc. makes no representations or warranties with respect to the contents or use of this manual,
and specifically disclaims any express or implied warranties of merchantability or fitness for any particular purpose. Digital
Harbor, Inc. reserves the right to revise this publication and to make changes to its content, at any time, without obligation to
notify any person or entity of such revisions or changes. Digital Harbor International, Inc. makes no representations or
warranties with respect to any Digital Harbor software, and specifically disclaims any express or implied warranties of
merchantability or fitness for any particular purpose. There are no warranties that extend beyond the descriptions contained in
these paragraphs. No warranty may be created or extended by sales representatives or written sales materials. Digital Harbor,
Inc. reserves the right to make changes to any and all parts of Digital Harbor software, at any time, without any obligation to
notify any person or entity of such changes. Digital Harbor, Inc. shall not be liable for any loss of profit or any other commercial
damages, including but not limited to special, incidental, consequential, or other damages.

Copyright © 2002-2017, Digital Harbor, Inc. All rights reserved. No part of this publication, including its interior design and\
icons, may be reproduced, stored in a retrieval system, or transmitted in any form by any means, electronic, mechanical,
photocopying, recording, or otherwise, without written permission of Digital Harbor.*/

package com.dharbor.set.fusion.dynamicentityservice.repository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.format.annotation.DateTimeFormat;
import com.dharbor.set.fusion.dynamicentityservice.model.AllDataTypes;
import com.dharbor.set.fusion.dynamicentityservice.enums.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Api(tags = "AllDataTypes:AllDataTypes Entity Description")
@RepositoryRestResource(path="f59dff71-2010-4f5c-ba5b-1c35090d33bc")
public interface AllDataTypesRepository extends JpaRepository<AllDataTypes, Long>{
    @ApiOperation(
        value = "findById", notes = "findById CustomQuery Description"
    )
    @Transactional
    AllDataTypes findById(
             @Param("id") @RequestParam("id") Long id
    );

    @Transactional
    AllDataTypes findByNormalBoolean(
             @Param("normalBoolean") @RequestParam("normalBoolean") Boolean normalBoolean
    );

    @Transactional
    AllDataTypes findByNormalDate(
             @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @Param("normalDate") @RequestParam("normalDate") Date normalDate
    );

    @Transactional
    List<AllDataTypes> findByNormalStringIsNull(
    );

    @Transactional
    List<AllDataTypes> findByNormalStringIsNotNull(
    );

    @Transactional
    AllDataTypes findByIdIs(
             @Param("id") @RequestParam("id") Long id
    );

    @Transactional
    List<AllDataTypes> findByIdEquals(
             @Param("id") @RequestParam("id") Long id
    );

    @Transactional
    List<AllDataTypes> findByIdBetween(
             @Param("from_id") @RequestParam("from_id") Long from_id,
             @Param("to_id") @RequestParam("to_id") Long to_id
    );

    @Transactional
    List<AllDataTypes> findByIdLessThan(
             @Param("id") @RequestParam("id") Long id
    );

    @Transactional
    List<AllDataTypes> findByIdLessThanEqual(
             @Param("id") @RequestParam("id") Long id
    );

    @Transactional
    List<AllDataTypes> findByIdGreaterThanEqual(
             @Param("id") @RequestParam("id") Long id
    );

    @Transactional
    List<AllDataTypes> findByIdGreaterThan(
             @Param("id") @RequestParam("id") Long id
    );

    @Transactional
    List<AllDataTypes> findByNormalDateAfter(
             @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @Param("normalDate") @RequestParam("normalDate") Date normalDate
    );

    @Transactional
    List<AllDataTypes> findByNormalDateBefore(
             @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @Param("normalDate") @RequestParam("normalDate") Date normalDate
    );

    @Transactional
    List<AllDataTypes> findByNormalDateBetween(
             @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @Param("from_normalDate") @RequestParam("from_normalDate") Date from_normalDate,
             @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @Param("to_normalDate") @RequestParam("to_normalDate") Date to_normalDate
    );

    @Transactional
    List<AllDataTypes> findByNormalStringLike(
             @Param("normalString") @RequestParam("normalString") String normalString
    );

    @Transactional
    List<AllDataTypes> findByNormalStringNotLike(
             @Param("normalString") @RequestParam("normalString") String normalString
    );

    @Transactional
    List<AllDataTypes> findByNormalStringStartingWith(
             @Param("normalString") @RequestParam("normalString") String normalString
    );

    @Transactional
    List<AllDataTypes> findByNormalStringEndingWith(
             @Param("normalString") @RequestParam("normalString") String normalString
    );

    @Transactional
    List<AllDataTypes> findByNormalStringContaining(
             @Param("normalString") @RequestParam("normalString") String normalString
    );

    @Transactional
    List<AllDataTypes> findByNormalStringNot(
             @Param("normalString") @RequestParam("normalString") String normalString
    );

    @Transactional
    List<AllDataTypes> findByNormalStringIn(
             @Param("normalString") @RequestParam("normalString") Collection<String> normalString
    );

    @Transactional
    List<AllDataTypes> findByNormalStringNotIn(
             @Param("normalString") @RequestParam("normalString") Collection<String> normalString
    );

    @Transactional
    List<AllDataTypes> findByNormalBooleanIsTrue(
    );

    @Transactional
    List<AllDataTypes> findByNormalBooleanIsFalse(
    );

    @Transactional
    List<AllDataTypes> findByNormalStringIgnoreCase(
             @Param("normalString") @RequestParam("normalString") String normalString
    );

    @Transactional
    Page<AllDataTypes> findByNormalString(
             @Param("normalString") @RequestParam("normalString") String normalString,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    AllDataTypes findByLengthString(
             @Param("lengthString") @RequestParam("lengthString") String lengthString
    );

    @Transactional
    AllDataTypes findByLargeString(
             @Param("largeString") @RequestParam("largeString") String largeString
    );

    @Transactional
    List<AllDataTypes> findByNormalInteger(
             @Param("myQueryParam") @RequestParam("myQueryParam") Integer myQueryParam
    );

    @Transactional
    AllDataTypes findByNormalLong(
             @Param("normalLong") @RequestParam("normalLong") Long normalLong
    );

    @Transactional
    AllDataTypes findByNormalFloat(
             @Param("normalFloat") @RequestParam("normalFloat") Float normalFloat
    );

    @Transactional
    AllDataTypes findByNormalDouble(
             @Param("normalDouble") @RequestParam("normalDouble") Double normalDouble
    );

    @Transactional
    AllDataTypes findByNormalEnum(
             @Param("normalEnum") @RequestParam("normalEnum") Department normalEnum
    );

    @Transactional
    AllDataTypes findByNormalUuid(
             @Param("normalUuid") @RequestParam("normalUuid") String normalUuid
    );

    @Transactional
    AllDataTypes findByMaxLengthForIndexString(
             @Param("maxLengthForIndexString") @RequestParam("maxLengthForIndexString") String maxLengthForIndexString
    );

    @Transactional
    AllDataTypes findByMinLengthForNoIndexString(
             @Param("minLengthForNoIndexString") @RequestParam("minLengthForNoIndexString") String minLengthForNoIndexString
    );

    @Transactional
    List<AllDataTypes> findFirst10ByNormalString(
             @Param("normalString") @RequestParam("normalString") String normalString
    );

    @Transactional
    Page<AllDataTypes> queryFirst10ByNormalString(
             @Param("normalString") @RequestParam("normalString") String normalString,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<AllDataTypes> findTop3ByNormalString(
             @Param("normalString") @RequestParam("normalString") String normalString,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    AllDataTypes findByDefaultIntegerAndDefaultLong(
             @Param("defaultInteger") @RequestParam("defaultInteger") Integer defaultInteger,
             @Param("defaultLong") @RequestParam("defaultLong") Long defaultLong
    );

    @Transactional
    Long countByNormalString(
             @Param("normalString") @RequestParam("normalString") String normalString
    );

    @Transactional
    Long deleteByNormalString(
             @Param("normalString") @RequestParam("normalString") String normalString
    );

    @Transactional
    List<AllDataTypes> findByNormalStringOrLengthString(
             @Param("normalString") @RequestParam("normalString") String normalString,
             @Param("lengthString") @RequestParam("lengthString") String lengthString
    );

}