//package com.example.namanmu.config.auth;
//
//import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
//import org.jasypt.encryption.StringEncryptor;
//import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
//import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class JasyptConfig {
//
//    private static final String KEY = "218905C7CD2C857E34E95E8FB59C0DDE3DCBFB97";
//    private static final String ALGORITHM = "PBEWithMD5AndDES";
//
//    @Bean("jasyptStringEncryptor")
//    public StringEncryptor stringEncryptor() {
//        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
//        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
//        config.setPassword(KEY); // 암호화할 때 사용하는 키
//        config.setAlgorithm(ALGORITHM); // 암호화 알고리즘
//        config.setKeyObtentionIterations("1000"); // 반복할 해싱 회수
//        config.setPoolSize("1"); // 인스턴스 pool
//        config.setProviderName("SunJCE"); // 프로바이더
//        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator"); // salt 생성 클래스 지정
//        config.setStringOutputType("base64"); // 인코딩
//        encryptor.setConfig(config); // 설정 정보 Set
//        return encryptor;
//    }
//}
