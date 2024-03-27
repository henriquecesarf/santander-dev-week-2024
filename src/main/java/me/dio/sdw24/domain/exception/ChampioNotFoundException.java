package me.dio.sdw24.domain.exception;

public class ChampioNotFoundException extends RuntimeException {
    public ChampioNotFoundException(Long championId) {

        super("Champion %d not found.".formatted(championId));

    }
}
