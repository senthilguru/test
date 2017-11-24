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

import com.dharbor.set.fusion.dynamicentityservice.enums.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.rest.core.annotation.RestResource;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;

@CompoundIndexes(
        value = {
            @CompoundIndex(
                name = "findByNormalLong",
                def = "{'normalLong':1 }"
            ),
            @CompoundIndex(
                name = "findByLengthString",
                def = "{'lengthString':1 }"
            ),
            @CompoundIndex(
                name = "findByDefaultIntegerAndDefaultLong",
                def = "{'defaultInteger':1 ,'defaultLong':1 }"
            ),
            @CompoundIndex(
                name = "findByNormalFloat",
                def = "{'normalFloat':1 }"
            ),
            @CompoundIndex(
                name = "findByNormalUuid",
                def = "{'normalUuid':1 }"
            ),
            @CompoundIndex(
                name = "findByNormalInteger",
                def = "{'normalInteger':1 }"
            ),
            @CompoundIndex(
                name = "findByNormalEnum",
                def = "{'normalEnum':1 }"
            ),
            @CompoundIndex(
                name = "findByNormalDate",
                def = "{'normalDate':1 }"
            ),
            @CompoundIndex(
                name = "findByMaxLengthForIndexString",
                def = "{'maxLengthForIndexString':1 }"
            ),
            @CompoundIndex(
                name = "queryFirst10ByNormalString",
                def = "{'normalString':1 }"
            ),
            @CompoundIndex(
                name = "findByNormalDouble",
                def = "{'normalDouble':1 }"
            ),
            @CompoundIndex(
                name = "findByNormalBoolean",
                def = "{'normalBoolean':1 }"
            )
        }
)
@Document
public @Data class AllDataTypes implements BaseEntity {

    @Id
    private String id;

 	private Double requiredAndDefaultDouble = 1000.11d;

    @NotNull(message = "requiredDate is required")
 	private Date requiredDate;

 	private Date updatedDate;

 	private Date customDate;

 	private UUID requiredAndGeneratedUuid = UUID.randomUUID();
 	public void setRequiredAndGeneratedUuid(UUID uuidValue) {}

 	private Department defaultEnum = Department.EMPLOYEE;

 	private Integer requiredAndDefaultInteger = 100;

 	private Integer defaultInteger = 100;

 	private Date normalDate;

    @Length(max = 255)
 	private String maxLengthForIndexString;

    @NotNull(message = "requiredUuid is required")
 	private UUID requiredUuid;

    @Length(max = 10)
 	private String lengthString;

 	private Integer normalInteger = 0;

    @Length(max = 255)
 	private String requiredAndDefaultString = "Default String Value";

    @NotNull(message = "requiredEnum is required")
 	private Department requiredEnum;

 	private Long normalLong = 0L;

    @NotNull(message = "normalEnum is required")
 	private Department normalEnum;

    @NotNull(message = "requiredFloat is required")
 	private Float requiredFloat;

 	private Long defaultLong = 1000L;

 	private Boolean normalBoolean = false;

    @Length(max = 255)
 	private String defaultString = "Default String Value";

 	private List<Department> collectionEnum;

 	private Double normalDouble = 0.0d;

    @NotNull(message = "requiredInteger is required")
 	private Integer requiredInteger;

 	private Float normalFloat = 0.0f;

 	private Boolean requiredAndDefaultBoolean = true;

 	private List<String> collectionString;

 	private Float defaultFloat = 100.11f;

 	private Department requiredAndDefaultEnum = Department.EMPLOYEE;

 	private UUID generatedUuid = UUID.randomUUID();
 	public void setGeneratedUuid(UUID uuidValue) {}

 	private Long requiredAndDefaultLong = 1000L;

    @NotNull(message = "requiredBoolean is required")
 	private Boolean requiredBoolean;

    @Length(max = 256)
 	private String minLengthForNoIndexString;

 	private List<EmbeddedProperties> collectionEmbeddedEntity;

    @NotNull(message = "requiredLong is required")
 	private Long requiredLong;

    @Length(max = 255)
 	private String normalString;

    @Length(max = 10000)
 	private String largeString;

 	private Double defaultDouble = 1000.11d;

 	private Map<String, Department> mapString;

 	private Date createdAndUpdatedDate;

 	private Boolean defaultBoolean = true;

 	private UUID normalUuid;

    @NotBlank(message = "requiredString is required")
    @Length(max = 255)
 	private String requiredString;

 	private Date requiredAndUpdatedDate;

    @NotNull(message = "requiredDouble is required")
 	private Double requiredDouble;

 	private Float requiredAndDefaultFloat = 100.11f;

 	private Date createdDate;

 	private List<Address> collectionEntity;

 	private Date requiredAndCreatedDate;


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