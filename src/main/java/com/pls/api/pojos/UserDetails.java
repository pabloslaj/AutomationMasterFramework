package com.pls.api.pojos;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class UserDetails {

    private String name;
    private String job;
}