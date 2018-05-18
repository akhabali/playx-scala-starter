package org;

import play.api.mvc.DefaultMessagesControllerComponents;
import play.api.mvc.MessagesControllerComponents;

import java.util.Collection;
import java.util.Collections;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.ProcessBeanAttributes;

public class Workaround implements Extension {
    void skip(@Observes
              final ProcessBeanAttributes<DefaultMessagesControllerComponents>
                      defaultMessagesControllerComponentsProcessAnnotatedType) {
        defaultMessagesControllerComponentsProcessAnnotatedType.configureBeanAttributes()
                                                               .types(DefaultMessagesControllerComponents.class,
                                                                       MessagesControllerComponents.class,
                                                                       Object.class);
    }

    public static class Temp {
        @Produces
        public Collection<SeContainerInitializer> c() {
            return Collections.emptyList();
        }
    }
}
