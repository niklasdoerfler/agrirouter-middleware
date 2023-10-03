package de.agrirouter.middleware.config;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Provide global beans.
 */
@Configuration
public class GlobalBeanConfiguration {

    public static final Gson GSON = new Gson();

    /**
     * Create a new instance of the Gson library.
     *
     * @return -
     */
    @Bean
    public Gson gson() {
        return GSON;
    }

}
