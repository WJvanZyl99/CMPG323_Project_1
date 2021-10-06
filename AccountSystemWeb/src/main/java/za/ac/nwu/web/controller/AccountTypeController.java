package za.ac.nwu.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.domain.service.GeneralResponse;

@RestController
@RequestMapping("AccountType")
public class AccountTypeController {

    @GetMapping("/all")
    public GeneralResponse<String> getAll(){
        return new GeneralResponse<String>(true, "No types found");}
}
