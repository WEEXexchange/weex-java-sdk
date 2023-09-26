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
public class CancelOrderParam  implements Serializable {
    private static final long serialVersionUID = 3983504190998930372L;

    private String orderId;

    private String symbol;
}
