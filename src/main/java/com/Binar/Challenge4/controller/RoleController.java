package com.binar.challenge4.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class RoleController {
    @Operation(summary="This is a test to get all role access")
    @ApiResponses(value ={
            @ApiResponse(responseCode = "200",
                    description = "Fetched all the role access from DB",
                    content = {@Content(mediaType="application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Not Available",
                    content = @Content)
    })
    @GetMapping("/all")
    public String allAccess() {
        return "plebs.";
    }

    @Operation(summary="This is to get all user with the role 'user' from db")
    @ApiResponses(value ={
            @ApiResponse(responseCode = "200",
                    description = "Fetched all the user information with the role 'user' from DB",
                    content = {@Content(mediaType="application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Not Available",
                    content = @Content)
    })
    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String userAccess() {
        return "User stuff nanodesu.";
    }
    @Operation(summary="This is to get all user with the role 'admin' from db")
    @ApiResponses(value ={
            @ApiResponse(responseCode = "200",
                    description = "Fetched all the user information with the role 'admin' from DB",
                    content = {@Content(mediaType="application/json")}),
            @ApiResponse(responseCode = "404",
                    description = "Not Available",
                    content = @Content)
    })
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin desu.";
    }
}
