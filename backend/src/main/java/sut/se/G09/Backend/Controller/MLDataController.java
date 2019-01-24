package sut.se.G09.Backend.Controller;

import org.springframework.web.bind.annotation.*;
import sut.se.G09.Backend.Entity.*;
import sut.se.G09.Backend.Repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class MLDataController
{
    @Autowired
    private final MLDataRepository mlDataRepository; 



    public MemberDataController(MemberDataRepository memberDataRepository ) {
        this.memberDataRepository = memberDataRepository;
    }

    @PostMapping("/RegLog/{Username}/{password}")
    //@RequestMapping(path="Reg", method=RequestMethod.POST,  consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public MLData NewMLData(
            @PathVariable String Username,
            @PathVariable String password,
            ){
        
        MLData Login = new MLData();
        
        return mLDataRepository.save(Login);
    }
    
  

}