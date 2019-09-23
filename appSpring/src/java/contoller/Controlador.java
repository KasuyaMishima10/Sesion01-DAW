
package contoller;
import Config.Conexion;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;

public class Controlador {
    Conexion conn = new Conexion();
    JdbcTemplate jdbcTemplate = new  JdbcTemplate();
    ModelAndView mav = new ModelAndView();
    
    
}
