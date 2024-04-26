package com.egym.measurementservice.api.controller;

import com.egym.measurementservice.domain.model.Measurement;
import com.egym.measurementservice.domain.service.MeasurementsService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

/**
 * rdziuba
 * 25.04.2024
 */
@RestController
@RequestMapping("/api/v1/users")
public class BodyWeightController {

    private final MeasurementsService measurementsService;

    public BodyWeightController(MeasurementsService measurementsService) {
        this.measurementsService = measurementsService;
    }

    @GetMapping("/{userId}/body-weight-measurements")
    Measurement getBodyWeightMeasurements(@PathVariable String userId) {
        return Optional.ofNullable(measurementsService.getBodyWeightByUserId(userId))
            .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND, "Body weight measurement not found"));
    }
}
