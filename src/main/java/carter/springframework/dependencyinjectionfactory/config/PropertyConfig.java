package carter.springframework.dependencyinjectionfactory.config;

import carter.springframework.dependencyinjectionfactory.exampleBeans.FakeDataSource;
import carter.springframework.dependencyinjectionfactory.exampleBeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration

public class PropertyConfig {

    @Value("${carter.user}")
    String user;

    @Value("${carter.password}")
    String password;

    @Value("${carter.dburl}")
    String url;

    @Value("${carter.jms.user}")
    String jmsUser;

    @Value("${carter.jms.password}")
    String jmsPassword;

    @Value("${carter.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSourceDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUser);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }
}
