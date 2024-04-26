package com.egym.measurementservice.domain.model;

/**
 * rdziuba
 * 25.04.2024
 */
public record Measurement(
    long id,
    String metricType,
    double value
    // String interpretation to add
) {
}
