package com.egym.measurementservice.domain.service;

import com.egym.measurementservice.domain.model.Measurement;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * rdziuba
 * 25.04.2024
 */
@Service
public class MeasurementsService {
    public static final String BODY_WEIGHT_VALUE = "BodyWeight";
    private static final Map<String, Measurement> repository = Map.of(
        "bb85c502-08d7-4d61-99ea-e887b6a3ed53", new Measurement(1, BODY_WEIGHT_VALUE, 73.3),
        "f1b733ab-5a84-4253-b6de-a08a51512adc", new Measurement(2, BODY_WEIGHT_VALUE, 65.6),
        "ed408763-d342-4768-ad0e-832a6f114ec5", new Measurement(3, BODY_WEIGHT_VALUE, 123.0),
        "6c8f71a9-8d0c-464d-9faa-d1cb7e31250d", new Measurement(12, BODY_WEIGHT_VALUE, 43.3),
        "ff13a5fd-637c-4734-97b8-57ba24edc0e5", new Measurement(189, BODY_WEIGHT_VALUE, 94.5),
        "33e82b26-eb77-4d97-94fe-2e8fa110c5ba", new Measurement(32, BODY_WEIGHT_VALUE, 160.0),
        "c6b58a29-f5e3-4210-9488-46baff9d47fb", new Measurement(65, BODY_WEIGHT_VALUE, 45.4)
    );

    public Measurement getBodyWeightByUserId(String userId) {
        return repository.get(userId);
    }
}
