dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "oracle.jdbc.driver.OracleDriver"
    dialect = org.hibernate.dialect.Oracle10gDialect
//    url = "jdbc:oracle:thin:@//192.168.1.81:1521/ORCL" // ASG NATIVE
//    url = "jdbc:oracle:thin:@//175.29.187.99:1521/ORCL" // ASG REAL
//    url = "jdbc:oracle:thin:@//192.168.1.5:1521/XE" // TALHA VAI
//    url = "jdbc:oracle:thin:@//192.168.11.1:1521/ORCL"  // SG LOCAL
//
    //url = "jdbc:oracle:thin:@//172.16.3.6:1521/XE" // NUB LOCAL
//    url = "jdbc:oracle:thin:@//192.168.11.1:1521/ORCL" // ASG LOCAL
//    url = "jdbc:oracle:thin:@//172.16.1.19:1521/ORCL" // NUB LOCAL PERMANENT
//    url = "jdbc:oracle:thin:@//118.179.84.54:1521/ORCL" // SG
    url = "jdbc:oracle:thin:@//localhost:1521/XE" // LOCAL
//    username = "SG_NEW"
    username = "nuboffice"
//    username = "asg"
    password = "1234"

}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.region.factory_class = 'org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory' // Hibernate 4
    singleSession = true  // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
    jdbc.use_get_generated_keys = true
    format_sql = true
    use_sql_comments = true
}

environments {
    development {
        dataSource {
            dbCreate = "" // one of 'create', 'create-drop', 'update', 'validate', ''
            logSql = true
            properties {
                maxActive = -1
                minEvictableIdleTimeMillis = 1800000
                timeBetweenEvictionRunsMillis = 1800000
                numTestsPerEvictionRun = 3
                testOnBorrow = true
                testWhileIdle = true
                testOnReturn = true
                validationQuery = "SELECT 1"
            }
        }
    }
    test {
        dataSource {
            dbCreate = ""
        }
    }
    production {
        dataSource {
            dbCreate = ""
//            url = "jdbc:oracle:thin:@//192.168.1.81:1521/ORCL" // ASG LOCAL
//            url = "jdbc:oracle:thin:@//175.29.187.99:1521/ORCL" // ASG REAL
//            url = "jdbc:oracle:thin:@//172.16.1.19:1521/ORCL"  // NUB LOCAL
//            url = "jdbc:oracle:thin:@//192.168.11.1:1521/ORCL"  // SG LOCAL
//            url = "jdbc:oracle:thin:@//175.29.187.99:1521/ORCL"
            url = "jdbc:oracle:thin:@//localhost:1521/ORCL" // SG
//            url = "jdbc:oracle:thin:@//localhost/XE"
//            username = "asg"
            username = "nuboffice"
//            username = "ABSS"
//            password = "absssg"
//            username = "abss"
//            password = "abss"
//            username = "SG_NEW"
            password = "Labbaik78600"
            properties {
                jmxEnabled = true
                initialSize = 5
                maxActive = 50
                minIdle = 5
                maxIdle = 25
                maxWait = 10000
                maxAge = 10 * 60000
                timeBetweenEvictionRunsMillis = 5000
                minEvictableIdleTimeMillis = 60000
                validationQuery = "SELECT 1"
                validationQueryTimeout = 3
                validationInterval = 15000
                testOnBorrow = true
                testWhileIdle = true
                testOnReturn = false
                jdbcInterceptors = "ConnectionState"
                defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
            }
        }
    }

}