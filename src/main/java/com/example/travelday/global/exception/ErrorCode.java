package com.example.travelday.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    // 호텔 관련 오류
    FAIL_TO_GET_HOTEL_INFO(HttpStatus.INTERNAL_SERVER_ERROR, "HT001", "호텔 정보를 가져오는데 실패하였습니다."),

    // 서버 오류
    SEVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "SV001", "서버 오류"),
    FAIL_TO_GET_HOTEL_INFO(HttpStatus.INTERNAL_SERVER_ERROR,"SV002", "호텔 오류"),
    FAIL_TO_GET_FLIGHT_INFO(HttpStatus.INTERNAL_SERVER_ERROR,"SV003", "항공권 오류");

    private final HttpStatus httpStatus;

    private final String code;

    private final String message;
}
