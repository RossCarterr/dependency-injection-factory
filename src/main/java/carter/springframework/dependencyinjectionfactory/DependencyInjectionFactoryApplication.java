package carter.springframework.dependencyinjectionfactory;

import carter.springframework.dependencyinjectionfactory.controllers.ConstructorInjectedController;
import carter.springframework.dependencyinjectionfactory.controllers.GetterInjectedController;
import carter.springframework.dependencyinjectionfactory.controllers.MyController;
import carter.springframework.dependencyinjectionfactory.controllers.PropertyInjectedController;
import carter.springframework.dependencyinjectionfactory.exampleBeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionFactoryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionFactoryApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());

//		Bean testing
//		System.out.println(controller.hello());
//		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
