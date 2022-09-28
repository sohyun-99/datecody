package org.example.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.junit.Test;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;

}
