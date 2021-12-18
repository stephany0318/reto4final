//modelo
//interface
//repositorio
//servicio
//controlador


package Reto2_Web;

import Reto2_Web.interfaces.InterfaceChocolate;
import Reto2_Web.interfaces.InterfaceOrder;
import Reto2_Web.interfaces.InterfaceUser;
import Reto2_Web.repositorio.OrderRepository;
import Reto2_Web.repositorio.UserRepositorio;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto2WebApplication implements CommandLineRunner  {
    @Autowired
    private InterfaceChocolate interfaceChocolate;
    @Autowired
    private InterfaceUser interfaceUser;
    @Autowired
    private InterfaceOrder interfaceOrder;
    @Autowired
    private UserRepositorio userRepositorio;
    @Autowired
    private OrderRepository orderRepository;   
    @Autowired
    private MongoTemplate mongoTemplate;
       
    public static void main(String[] args) {
		SpringApplication.run(Reto2WebApplication.class, args);
	}
    
    @Override
    public void run (String... arg) throws Exception {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        interfaceChocolate.deleteAll();
        interfaceUser.deleteAll ();   
        interfaceOrder.deleteAll (); 
    }
}


