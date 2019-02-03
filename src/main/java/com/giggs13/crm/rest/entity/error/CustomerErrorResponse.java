package com.giggs13.crm.rest.entity.error;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CustomerErrorResponse {

    private int status;
    private String message;
    private long timeStamp;
}
