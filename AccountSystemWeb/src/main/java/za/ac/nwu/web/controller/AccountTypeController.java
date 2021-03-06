package za.ac.nwu.web.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.domain.persistence.AccountType;
import za.ac.nwu.domain.service.GeneralResponse;
import za.ac.nwu.logic.flow.FetchAccountTypes;
import java.util.List;

@RestController
@RequestMapping("AccountType")
public class AccountTypeController {

    private final FetchAccountTypes fetchAccountTypes;

    @Autowired
    public AccountTypeController(FetchAccountTypes fetchAccountTypes) {
        this.fetchAccountTypes = fetchAccountTypes;
    }

    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured Account Types.", notes = "Returns a list of Account Types")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<List<AccountType>>> getAll() {
        List<AccountType> accountTypes = fetchAccountTypes.getAllAccountTypes();
        GeneralResponse<List<AccountType>> response = new GeneralResponse<>(true, accountTypes);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
