package com.weex.openapi.dto.request.swap;

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
public class PlaceBatchOrderReq implements Serializable {
    private static final long serialVersionUID = -4363592514170972068L;

    /**
     * symbol : cmt_btcusdt
     * order_data : [{"client_oid":"weex#123456","order_type":"1","price":"5","size":"2","type":"1","match_price":"0"},
     * {"client_oid":"weex#123457","order_type":"1","price":"2","size":"3","type":"2","match_price":"1"}]
     */
    /**
     * 合约编码
     */
    private String symbol;
    /**
     * 订单信息
     */
    private String order_data;

    /**
     * 订单信息
     */
    private List<OrderData> orderDataList;
}
