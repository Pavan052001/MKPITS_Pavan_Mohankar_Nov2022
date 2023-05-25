package com.mkpits.Trading.service.impl;

import com.mkpits.Trading.dto.Tradingdatadto;
import com.mkpits.Trading.service.TradingDataService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier
public class TradingDataDummyServiceImpl implements TradingDataService {


    @Override
    public List<Tradingdatadto> getTradingData() {
        List<Tradingdatadto> tradingdatadtoList=new ArrayList<>();
        Tradingdatadto tradingDataList1 = Tradingdatadto.builder()
                .fiftyWeekHigh(900.00)
                .fiftyWeekLow(760.222)
                .scripeName("TCS")
                .currentPrice(870.00)
                .build();

        Tradingdatadto tradingDataList2 = Tradingdatadto.builder()
                .fiftyWeekHigh(600.00)
                .fiftyWeekLow(300.222)
                .scripeName("MRF")
                .currentPrice(450.00)
                .build();

        Tradingdatadto tradingDataList3 = Tradingdatadto.builder()
                .fiftyWeekHigh(3000.00)
                .fiftyWeekLow(2000.222)
                .scripeName("ORACLE")
                .currentPrice(1500.00)
                .build();

        Tradingdatadto tradingDataList4 = Tradingdatadto.builder()
                .fiftyWeekHigh(1111.00)
                .fiftyWeekLow(800.222)
                .scripeName("NIFTY")
                .currentPrice(999.00)
                .build();

        tradingdatadtoList.add(tradingDataList1);
        tradingdatadtoList.add(tradingDataList2);
        tradingdatadtoList.add(tradingDataList3);
        tradingdatadtoList.add(tradingDataList4);
        return tradingdatadtoList;
    }
}
