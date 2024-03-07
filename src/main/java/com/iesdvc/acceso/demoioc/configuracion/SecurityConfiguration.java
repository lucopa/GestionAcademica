package com.iesdvc.acceso.demoioc.configuracion;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

        @Autowired
        private DataSource dataSource;


        @Autowired
        public void configure(AuthenticationManagerBuilder auth) throws Exception {
                auth.jdbcAuthentication()
                                .dataSource(dataSource)
                                .usersByUsernameQuery("select username, password, enabled "
                                                + "from usuario "
                                                + "where username = ?")
                                .authoritiesByUsernameQuery("select username, rol.nombre  "
                                                + "from usuario_roles, usuario, rol "
                                                + "where usuario.id=usuario_roles.usuario_id and "
                                                + "usuario_roles.roles_id = rol.id and username = ?");
        }


        @Bean
        public PasswordEncoder encoder() {
                return new BCryptPasswordEncoder();
        }
         

        @Bean
        public SecurityFilterChain filter(HttpSecurity http) throws Exception {
                
                

                return http
                        .authorizeHttpRequests((requests) -> requests
                                .requestMatchers("/webjars/**", "/img/**", "/js/**", "/register/**", "/ayuda/**", "/login")
                                .permitAll() 
                                .requestMatchers("/usuarios/**", "categorias/**", "localidades/**", "/ayuda/**", "/acerca/**")
                                .hasAuthority("admin")
                                .anyRequest().permitAll()
                        ).formLogin((formLogin) -> formLogin
                                .permitAll()
                        ).rememberMe(
                                Customizer.withDefaults()
                        ).logout((logout) -> logout
                                .invalidateHttpSession(true)
                                .logoutSuccessUrl("/")
                                .permitAll()                                
                        ).build();

        }

}
