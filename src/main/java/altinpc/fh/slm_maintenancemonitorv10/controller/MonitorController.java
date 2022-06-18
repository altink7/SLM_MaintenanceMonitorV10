package altinpc.fh.slm_maintenancemonitorv10.controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/monitoring")
public class MonitorController {
    private static String status = "-";

    @GetMapping()
    public String getStatus(){
            return status;
    }

    @GetMapping("{status}")
    public String setStatus(@PathVariable("status") String s){
        if (s == null || s.isEmpty()){
            return status;
        }
         else {
            status = s;
            return status;
        }
    }
}
