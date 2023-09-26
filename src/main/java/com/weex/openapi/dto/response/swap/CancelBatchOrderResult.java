package com.weex.openapi.dto.response.swap;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CancelBatchOrderResult implements Serializable {

    private static final long serialVersionUID = 8126438671230139095L;
    private boolean result;
    private String symbol;
    private List<String> order_ids;
    private List<CancelOrderResult> fail_infos;
}
