package com.valuego.expense.api.dto.request;

public record ExpenseParticipantReqDto(
        Long groupMemberId,
        Boolean isExcluded
) {
}
