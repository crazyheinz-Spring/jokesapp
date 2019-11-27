package be.intecbrussel.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

//@Configuration
public class ChuckConfig {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {

        return new ChuckNorrisQuotes();
    }
}
