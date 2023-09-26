package com.weex.openapi.dto.request.swap;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CancelPlanParamReq implements Serializable {
    private static final long serialVersionUID = -4049337926733255487L;

    private String orderId;
    private String symbol;
}
