package net.java.springannotations.configurationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "app") // you can use (prefix="app") so that any bean called as app.packagename.property is bound.
/*
@ConfigurationProperties allows you to bind external configs to a strongly typed bean
(binding to the internal properties of the class code from the properties file) in your code.
It can be injected and used throughout the application like any other Spring bean.
it is linked directly to a properties files, storing key-value pairs in a this Map.
 */
@Component
public class AppProperties {

    private String name;
    private String description;
    private String uploadDir;
    private Security security = new Security();

    public static class Security {
        private String username;
        private String password;
        List<String> roles = new ArrayList<>();
        private boolean enabled;
        Map<String, String> permissions = new HashMap<>();

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public Map<String, String> getPermissions() {
            return permissions;
        }

        public void setPermissions(Map<String, String> permissions) {
            this.permissions = permissions;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }
}
