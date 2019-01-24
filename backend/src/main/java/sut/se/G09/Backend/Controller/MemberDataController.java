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

public class MemberDataController
{
    @Autowired
    private final MemberDataRepository memberDataRepository;
    @Autowired
    private MLDataRepository mlDataRepository;
    @Autowired
    private AgentRegistrationRepository agentRegistrationRepository;
    @Autowired
    private ProvinceRepository provinceRepository;
    @Autowired
    private CategoryRepository categoryRepository;



    public MemberDataController(MemberDataRepository memberDataRepository ) {
        this.memberDataRepository = memberDataRepository;
    }

    @PostMapping("/Regmem/{fname}/{lname}/{age}/{PID}")
    //@RequestMapping(path="Reg", method=RequestMethod.POST,  consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public MemberData NewMemberData(
            @PathVariable String fname,
            @PathVariable String lname,
            @PathVariable Long age,
            @PathVariable Long PID ,
            ){

        MemberData Member = new MemberData();

        return memberDataRepository.save(MemberData);
    }
    
  

}