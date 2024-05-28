package com.exp.mongoexp;

import com.exp.mongoexp.MongoexpApp;
import com.exp.mongoexp.config.AsyncSyncConfiguration;
import com.exp.mongoexp.config.EmbeddedElasticsearch;
import com.exp.mongoexp.config.EmbeddedMongo;
import com.exp.mongoexp.config.EmbeddedRedis;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { MongoexpApp.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedMongo
@EmbeddedElasticsearch
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
