package com.weex.openapi.api.swap;

import com.alibaba.fastjson.JSONObject;
import com.weex.openapi.dto.request.swap.AdjustMarginReq;
import com.weex.openapi.dto.request.swap.AutoAppendMarginReq;
import com.weex.openapi.dto.request.swap.ChangeLeverageReq;
import com.weex.openapi.dto.response.swap.AccountInfo;
import com.weex.openapi.dto.response.swap.AccountSetting;
import com.weex.openapi.dto.response.swap.AdjustMarginResult;
import com.weex.openapi.dto.response.swap.AutoAppendMarginResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;

/**
 * @author weex-sdk-team
 * @date 2020-05-25
 */
public interface AccountApi {
    /**
     * 查询所有合约账户信息
     *
     * @return
     */
    @GET("/api/swap/v3/account/accounts")
    Call<List<AccountInfo>> accounts();

    /**
     * 单个合约账户信息
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/account/account")
    Call<AccountInfo> getAccount(@Query("symbol") String symbol);

    /**
     * 获取单个合约的用户配置
     *
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/account/settings")
    Call<AccountSetting> settings(@Query("symbol") String symbol);

    /**
     * 调整杠杆
     * @param body
     * @return
     */
    @POST("/api/swap/v3/account/leverage")
    Call<AccountSetting> leverage(@Body ChangeLeverageReq body);

    /**
     * 列出主账户资产流水
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/account/ledger")
    Call<JSONObject> getLedger(@Query("symbol") String symbol,@Query("from")String from,
                                       @Query("to") String to,@Query("limit")String limit,@Query("startTime") String startTime,
                                       @Query("endTime")String endTime);


    /**
     * 列出保证金账户资产流水
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/account/ledgerMargin")
    Call<JSONObject> ledgerMargin(@Query("symbol") String symbol,@Query("from")String from,
                                          @Query("to") String to,@Query("limit")String limit,@Query("startTime") String startTime,
                                          @Query("endTime")String endTime);



    /**
     * 调整保证金
     * @param body
     * @return
     */
    @POST("/api/swap/v3/account/adjustMargin")
    Call<AdjustMarginResult> adjustMargin(@Body AdjustMarginReq body);
    /**
     * 自动追加保证金
     * @param body
     * @return
     */
    @POST("/api/swap/v3/account/modifyAutoAppendMargin")
    Call<AutoAppendMarginResult> modifyAutoAppendMargin(@Body AutoAppendMarginReq body);


}
