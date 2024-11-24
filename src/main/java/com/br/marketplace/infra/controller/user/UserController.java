package com.br.marketplace.infra.controller.user;

import com.br.marketplace.core.domain.user.save.SaveUserInput;
import com.br.marketplace.core.domain.user.save.SaveUserOutput;
import com.br.marketplace.usecase.user.save.SaveUserUsecase;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final SaveUserUsecase saveUserUsecase;

    public UserController(SaveUserUsecase saveUserUsecase) {
        this.saveUserUsecase = saveUserUsecase;
    }

    @PostMapping("/save-user")
    public ResponseEntity<SaveUserOutput> saveUser(@RequestBody @Valid SaveUserInput saveUserInput) {
        SaveUserOutput saveUserOutput = saveUserUsecase.execute(saveUserInput);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveUserOutput);
    }
}
