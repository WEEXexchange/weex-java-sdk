package com.weex.openapi.api.swap;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.weex.openapi.dto.response.*;
import com.weex.openapi.dto.response.swap.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

/**
 * @author weex-sdk-team
 * @date 2019-01-15
 */
public interface MarketApi {
    /**
     * 获取服务端时间
     *
     * @return
     */
    @GET("/api/swap/v3/market/time")
    Call<ServerTime> getTime();

    /**
     * 获取合约信息
     *
     * @return
     */
    @GET("/api/swap/v3/market/contracts")
    Call<List<ContractInfo>> getContractsApi();

    /**
     * 获取深度数据
     *
     * @param symbol
     * @param limit
     * @return
     */
    @GET("/api/swap/v3/market/depth")
    Call<Depth> getDepthApi(@Query("symbol") String symbol, @Query("limit") String limit);

    /**
     * 获取全部ticker信息
     *
     * @return
     */
    @GET("/api/swap/v3/market/tickers")
    Call<List<Ticker>> getTickersApi();

    /**
     * 获取某个ticker信息
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/market/ticker")
    Call<JSONObject> getTicker(@Query("symbol") String symbol);

    /**
     * 获取成交数据
     *
     * @param symbol
     * @param limit
     * @return
     */
    @GET("/api/swap/v3/market/trades")
    Call<List<Trades> > getTrades(@Query("symbol") String symbol, @Query("limit") String limit);


    /**
     * 获取K线数据
     *
     * @param symbol
     * @param start
     * @param end
     * @param startTime
     * @param endTime
     * @return
     */
    @GET("/api/swap/v3/market/candles")
    Call<JSONArray> getCandles(@Query("symbol") String symbol, @Query("start") String start,
                                    @Query("end") String end,@Query("startTime") Long startTime,@Query("endTime")Long endTime,@Query("granularity") String granularity);

    /**
     * 获取指数信息
     *
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/market/index")
    Call<Index> getIndex(@Query("symbol") String symbol);

    /**
     * 获取平台总持仓量
     *
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/market/open_interest")
    Call<OpenInterestApiDto> getOpenInterestApi(@Query("symbol") String symbol);

    /**
     * 获取合约最高限价和最低限价
     *
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/market/price_limit")
    Call<PriceLimit> getPriceLimitApi(@Query("symbol") String symbol);

    /**
     * 获取合约下一次结算时间
     *
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/market/funding_time")
    Call<FundingTime> getFundingTimeApi(@Query("symbol") String symbol);

    /**
     * 获取合约历史资金费率
     * @param symbol
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @GET("/api/swap/v3/market/historyFundRate")
    Call<HistoricalFundingRate> getNewHistoricalFundingRateApi(@Query("symbol") String symbol,@Query("pageIndex") String pageIndex,
                                                                  @Query("pageSize") String pageSize);

    /**
     * 获取合约标记价格
     *
     * @param symbol
     * @return
     */
    @GET("/api/swap/v3/market/mark_price")
    Call<MarkPrice> getMarkPriceApi(@Query("symbol") String symbol);

    /**
     * 可开张数
     *
     * @param symbol       合约Id或者交易对
     * @param amount       用于开仓的总的金额
     * @param leverage     杠杆，默认以20计算
     * @param openPrice    开仓价格
     * @return
     */
    @GET("/api/swap/v3/market/open_count")
    Call<String> calOpenCount(@Query("symbol") String symbol, @Query("amount") String amount, @Query("leverage") String leverage, @Query("openPrice") String openPrice);

}
