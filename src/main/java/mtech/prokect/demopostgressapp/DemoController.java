package mtech.prokect.demopostgressapp;


import mtech.prokect.demopostgressapp.repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/")
public class DemoController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public ResponseEntity<?> addUser(@RequestBody Users user) {

        userRepository.save(user);

        return new ResponseEntity<>(user, HttpStatus.OK);


    }

    @GetMapping("/user")
    public ResponseEntity<?> getUserById(@RequestParam long id){

        var user=userRepository.findById(id);

        return  new ResponseEntity<>(user,HttpStatus.OK);
    }


}
