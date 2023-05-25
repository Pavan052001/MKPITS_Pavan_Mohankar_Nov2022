package com.mkpits.Trading.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Tradingdatadto {
    private long id;
    private double fiftyWeekHigh;
    private double fiftyWeekLow;

    private double currentPrice;

    private String scripeName;


}
