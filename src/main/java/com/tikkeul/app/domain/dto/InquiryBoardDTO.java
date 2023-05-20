package com.tikkeul.app.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class InquiryBoardDTO {
    private Long id;
    private String inquireType;
    private String inquireTitle;
    private String inquireContent;
    private String inquireDate;
    private String inquireUpDate;
    private String status;
    private Long userId;
    private String name;
    private String identification;
}
