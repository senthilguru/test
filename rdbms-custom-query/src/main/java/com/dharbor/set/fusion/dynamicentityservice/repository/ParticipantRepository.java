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
import com.dharbor.set.fusion.dynamicentityservice.model.Participant;
import com.dharbor.set.fusion.dynamicentityservice.enums.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Api(tags = "Participant:Participant Entity Description")
@RepositoryRestResource
public interface ParticipantRepository extends JpaRepository<Participant, Long>{
    @ApiOperation(
        value = "findByUserIdNotIn CustomQuery Short Description", notes = "findByUserIdNotIn CustomQuery Description"
    )
    @Transactional
    List<Participant> findByUserIdNotIn(
             @Param("userId") @RequestParam("userId") Collection<String> userId
    );

    @Transactional
    Page<Participant> findByUserIdIsNull(
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByLastNameAndFirstName(
             @Param("lastName") @RequestParam("lastName") String lastName,
             @Param("firstName") @RequestParam("firstName") String firstName,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByLastNameOrFirstName(
             @Param("lastName") @RequestParam("lastName") String lastName,
             @Param("firstName") @RequestParam("firstName") String firstName,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByAgeLessThan(
             @Param("age") @RequestParam("age") Integer age,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByAgeLessThanEqual(
             @Param("age") @RequestParam("age") Integer age,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByAgeGreaterThan(
             @Param("age") @RequestParam("age") Integer age,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByAgeGreaterThanEqual(
             @Param("age") @RequestParam("age") Integer age,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByAgeIsNull(
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByAgeNotNull(
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByFirstNameLike(
             @Param("firstName") @RequestParam("firstName") String firstName,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByFirstNameNotLike(
             @Param("firstName") @RequestParam("firstName") String firstName,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByFirstNameStartingWith(
             @Param("firstName") @RequestParam("firstName") String firstName,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByFirstNameEndingWith(
             @Param("firstName") @RequestParam("firstName") String firstName,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByFirstNameContaining(
             @Param("firstName") @RequestParam("firstName") String firstName,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByAgeOrderByLastNameDesc(
             @Param("age") @RequestParam("age") Integer age,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByLastNameNot(
             @Param("lastName") @RequestParam("lastName") String lastName,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByAgeIn(
             @Param("age") @RequestParam("age") Collection<Integer> age,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByAgeNotIn(
             @Param("age") @RequestParam("age") Collection<Integer> age,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByFirstNameIgnoreCase(
             @Param("firstName") @RequestParam("firstName") String firstName,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByStartDateAfter(
             @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @Param("startDate") @RequestParam("startDate") Date startDate,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findByStartDateBefore(
             @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @Param("startDate") @RequestParam("startDate") Date startDate,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    List<Participant> findByStartDateBetween(
             @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @Param("from_startDate") @RequestParam("from_startDate") Date from_startDate,
             @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @Param("to_startDate") @RequestParam("to_startDate") Date to_startDate
    );

    @Transactional
    List<Participant> findByActiveTrue(
    );

    @Transactional
    List<Participant> findByActiveFalse(
    );

    @ApiOperation(
        value = "findById", notes = "findById CustomQuery Description"
    )
    @Transactional
    Participant findById(
             @Param("id") @RequestParam("id") Long id
    );

    @Transactional
    Participant findByStartDate(
             @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @Param("startDate") @RequestParam("startDate") Date startDate
    );

    @RestResource(path="findByDate")
    @Transactional
    List<Participant> findByUserIdAndCreatedDate(
             @Param("userId") @RequestParam("userId") String userId,
             @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @Param("createdDate") @RequestParam("createdDate") Date createdDate
    );

    @Transactional
    List<Participant> findFirst10ByFirstName(
             @Param("firstName") @RequestParam("firstName") String firstName
    );

    @Transactional
    Page<Participant> queryFirst10ByUserId(
             @Param("userId") @RequestParam("userId") String userId,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    Page<Participant> findTop3ByUserId(
             @Param("userId") @RequestParam("userId") String userId,
             @Param("pageable") @RequestParam("pageable") Pageable pageable
    );

    @Transactional
    List<Participant> findByUserIdIn(
             @Param("userId") @RequestParam("userId") Collection<String> userId
    );

    @Transactional
    Long countByUserId(
             @Param("userId") @RequestParam("userId") String userId
    );

    @Transactional
    Long deleteByUserId(
             @Param("userId") @RequestParam("userId") String userId
    );

}