package site.mizore.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"site.mizore.mall.mbg.mapper","site.mizore.mall.dao"})
public class MybatisConfig {

}
