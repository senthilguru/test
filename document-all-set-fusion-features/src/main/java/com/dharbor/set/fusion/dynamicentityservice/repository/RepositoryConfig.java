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

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import org.springframework.stereotype.Repository;
import com.dharbor.set.fusion.dynamicentityservice.model.*;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
         	config.exposeIdsFor(OneToOneSelfReference.class);
         	config.exposeIdsFor(PPKUuidWithIdField.class);
         	config.exposeIdsFor(ProfilePictureWithProvidedPrimaryKey.class);
         	config.exposeIdsFor(SoftDeleteEntity.class);
         	config.exposeIdsFor(CPKUuidUuidGenerated.class);
         	config.exposeIdsFor(CPKUuidUuidGenerated.CompositeKey.class);
         	config.exposeIdsFor(Entity1WithEmbeddedEntity.class);
         	config.exposeIdsFor(CPKUuidLong.class);
         	config.exposeIdsFor(CPKUuidLong.CompositeKey.class);
         	config.exposeIdsFor(PPKLong.class);
         	config.exposeIdsFor(OTOWithProvidedPrimaryKeyForParent.class);
         	config.exposeIdsFor(Manager.class);
         	config.exposeIdsFor(Salary.class);
         	config.exposeIdsFor(CPKUuidString.class);
         	config.exposeIdsFor(CPKUuidString.CompositeKey.class);
         	config.exposeIdsFor(PPKString.class);
         	config.exposeIdsFor(OTOWithPPKForParentAndChild.class);
         	config.exposeIdsFor(Entity2WithEmbeddedEntity.class);
         	config.exposeIdsFor(CPKLongString.class);
         	config.exposeIdsFor(CPKLongString.CompositeKey.class);
         	config.exposeIdsFor(Address.class);
         	config.exposeIdsFor(EntityWith2LevelEmbeddedEntity.class);
         	config.exposeIdsFor(SGPKString.class);
         	config.exposeIdsFor(OneToOneBiDirectionalChild.class);
         	config.exposeIdsFor(PPKInteger.class);
         	config.exposeIdsFor(PPKGeneratedUuid.class);
         	config.exposeIdsFor(OneToOneBiDirectionalParent.class);
         	config.exposeIdsFor(AllDataTypes.class);
         	config.exposeIdsFor(OneToOne.class);
         	config.exposeIdsFor(OTOWithPPKForChild.class);
         	config.exposeIdsFor(ProfilePicture.class);
         	config.exposeIdsFor(CPKUuidUuid.class);
         	config.exposeIdsFor(CPKUuidUuid.CompositeKey.class);
         	config.exposeIdsFor(Employee.class);
         	config.exposeIdsFor(CustomQueryAlias.class);
         	config.exposeIdsFor(PPKUuid.class);
    }
}