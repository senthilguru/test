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

package com.dharbor.set.fusion.dynamicentityservice.model;

import java.io.Serializable;
import com.dharbor.set.fusion.dynamicentityservice.enums.*;
import java.util.Date;
import java.util.UUID;
import java.util.List;
import java.util.Map;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.Valid;
import org.springframework.data.rest.core.annotation.RestResource;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Table(
        indexes = {
            @Index(
                name = "findByNormalLong",
                columnList = "normalLong"
            ),
            @Index(
                name = "findByNormalDateAfter",
                columnList = "normalDate"
            ),
            @Index(
                name = "findByNormalStringOrLengthString",
                columnList = "lengthString,normalString"
            ),
            @Index(
                name = "findByLengthString",
                columnList = "lengthString"
            ),
            @Index(
                name = "findByDefaultIntegerAndDefaultLong",
                columnList = "defaultInteger,defaultLong"
            ),
            @Index(
                name = "findByNormalFloat",
                columnList = "normalFloat"
            ),
            @Index(
                name = "findByNormalUuid",
                columnList = "normalUuid"
            ),
            @Index(
                name = "findByNormalStringNotLike",
                columnList = "normalString"
            ),
            @Index(
                name = "findByNormalInteger",
                columnList = "normalInteger"
            ),
            @Index(
                name = "findByNormalEnum",
                columnList = "normalEnum"
            ),
            @Index(
                name = "findByMaxLengthForIndexString",
                columnList = "maxLengthForIndexString"
            ),
            @Index(
                name = "findByNormalDouble",
                columnList = "normalDouble"
            ),
            @Index(
                name = "findByNormalBooleanIsTrue",
                columnList = "normalBoolean"
            )
        }
)
@Entity
public @Data class AllDataTypes implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Length(max = 255)
    @Column(unique = true)
 	private String uniqueString;

 	private Float defaultFloat = 100.11f;

 	private Double requiredAndDefaultDouble = 1000.11d;

    @Enumerated(EnumType.STRING)
 	private Department requiredAndDefaultEnum = Department.EMPLOYEE;

    @Length(max = 36)
    private String generatedUuid = UUID.randomUUID().toString();
    public void setGeneratedUuid(UUID uuidValue) {
    }

 	private Long requiredAndDefaultLong = 1000L;

    @NotNull(message = "requiredDate is required")
 	private Date requiredDate;

 	private Date updatedDate;

    @Column(columnDefinition = "DATETIME(6)")
 	private Date customDate;

    @Length(max = 36)
    private String requiredAndGeneratedUuid = UUID.randomUUID().toString();
    public void setRequiredAndGeneratedUuid(UUID uuidValue) {
    }

    @NotNull(message = "requiredBoolean is required")
 	private Boolean requiredBoolean;

    @Length(max = 256)
 	private String minLengthForNoIndexString;

    @Enumerated(EnumType.STRING)
 	private Department defaultEnum = Department.EMPLOYEE;

 	private Integer requiredAndDefaultInteger = 100;

    @NotNull(message = "requiredLong is required")
 	private Long requiredLong;

 	private Integer defaultInteger = 100;

 	private Date normalDate;

    @Length(max = 255)
 	private String maxLengthForIndexString;

    @NotNull(message = "requiredUuid is required")
    @Length(max = 36)
    private String requiredUuid;
    public void setRequiredUuid(UUID uuidValue) {
        this.requiredUuid = (uuidValue != null) ? uuidValue.toString() : null;
    }

    @Length(max = 10)
 	private String lengthString;

    @Length(max = 255)
 	private String normalString;

 	private Integer normalInteger = 0;

    @Length(max = 10000)
 	private String largeString;

 	private Double defaultDouble = 1000.11d;

    @Length(max = 255)
 	private String requiredAndDefaultString = "Default String Value";

 	private Date createdAndUpdatedDate;

    @NotNull(message = "requiredEnum is required")
    @Enumerated(EnumType.STRING)
 	private Department requiredEnum;

 	private Long normalLong = 0L;

    @NotNull(message = "normalEnum is required")
    @Enumerated(EnumType.STRING)
 	private Department normalEnum;

 	private Boolean defaultBoolean = true;

    @Length(max = 36)
    private String normalUuid;
    public void setNormalUuid(UUID uuidValue) {
        this.normalUuid = (uuidValue != null) ? uuidValue.toString() : null;
    }

    @NotNull(message = "requiredFloat is required")
 	private Float requiredFloat;

 	private Long defaultLong = 1000L;

    @NotBlank(message = "requiredString is required")
    @Length(max = 255)
 	private String requiredString;

 	private Date requiredAndUpdatedDate;

    @NotNull(message = "requiredDouble is required")
 	private Double requiredDouble;

 	private Boolean normalBoolean = false;

 	private Float requiredAndDefaultFloat = 100.11f;

 	private Date createdDate;

    @Length(max = 255)
 	private String defaultString = "Default String Value";

 	private Double normalDouble = 0.0d;

    @NotNull(message = "requiredInteger is required")
 	private Integer requiredInteger;

 	private Float normalFloat = 0.0f;

 	private Date requiredAndCreatedDate;

 	private Boolean requiredAndDefaultBoolean = true;

    public void onBeforeCreate() {
        Date sysDate = new Date();
        createdAndUpdatedDate=sysDate;
        createdDate=sysDate;
        requiredAndCreatedDate=sysDate;
        updatedDate=sysDate;
        createdAndUpdatedDate=sysDate;
        requiredAndUpdatedDate=sysDate;
    }

    public void onBeforeSave() {
        Date sysDate = new Date();
        updatedDate=sysDate;
        createdAndUpdatedDate=sysDate;
        requiredAndUpdatedDate=sysDate;
    }

}

