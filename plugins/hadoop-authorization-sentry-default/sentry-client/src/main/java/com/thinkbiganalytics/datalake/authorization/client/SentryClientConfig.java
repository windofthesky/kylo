package com.thinkbiganalytics.datalake.authorization.client;

import javax.sql.DataSource;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Sentry Client configuration class for setting sentry connection information.
 *
 *  Created by Shashi Vishwakarma on 19/9/2016.
 */
public class SentryClientConfig {

    private String driverName;
    private String connectionString;
    private Configuration config;
    private String username;
    private String password;
    private String keyTab;
    private String principal;
    private FileSystem fileSystem;
    private DataSource dataSrouce;
    private JdbcTemplate sentryJdbcTemplate;
    private String sentryGroups ;

    public SentryClientConfig() {

    }

    public SentryClientConfig(String driverName, String connectionString) {
        this.driverName = driverName;
        this.connectionString = connectionString;
    }

    public SentryClientConfig(String driverName, String connectionString, String username, String password) {
        this.username = driverName;
        this.connectionString = connectionString;
        this.setUsername(username);
        this.setPassword(password);
    }

    public SentryClientConfig(DataSource dataSrouce)
    {
        this.dataSrouce = dataSrouce;
        setSentryJdbcTemplate(new JdbcTemplate(this.dataSrouce));
    }

    public JdbcTemplate getSentryJdbcTemplate() {
        return sentryJdbcTemplate;
    }


    public void setSentryJdbcTemplate(JdbcTemplate sentryJdbcTemplate) {
        this.sentryJdbcTemplate = sentryJdbcTemplate;
    }



    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public Configuration getConfig() {
        return config;
    }

    public void setConfig(Configuration config) {
        this.config = config;
    }

    public String getKeyTab() {
        return keyTab;
    }

    public void setKeyTab(String keyTab) {
        this.keyTab = keyTab;
    }

    public FileSystem getFileSystem() {
        return fileSystem;
    }

    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

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

    public DataSource getDataSrouce() {
        return dataSrouce;
    }

    public void setDataSrouce(DataSource dataSrouce) {
        this.dataSrouce = dataSrouce;
    }

    public String getSentryGroups() {
        return sentryGroups;
    }

    public void setSentryGroups(String sentryGroups) {
        this.sentryGroups = sentryGroups;
    }


}