package cooper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/demo")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
 
    @GetMapping(value = "/all")
    public List<User> fetchUserPublicRepoDetails(@RequestParam String username) {
    	List<User> resultList = new ArrayList<User>();
    	resultList = userRepository.findByUsername(username);
    	
    	if (resultList.isEmpty()) {
    		/*
    		 * Algorithm : 
	    		use this API : https://api.github.com/users/polymath1995/repos
	    		JSON data will get returned
	    		By using Jackson parse it and find the public repositories
	    	*/
    	}
    	
        return resultList;
    }
}