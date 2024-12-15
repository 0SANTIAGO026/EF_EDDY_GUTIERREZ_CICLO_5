package com.ef.gutierrez.riveros.eddy.santiago.response;

import com.ef.gutierrez.riveros.eddy.santiago.dto.CarDTO;

public record FindCarResponse(String code,
                              String error,
                              Iterable<CarDTO> cars) {
}
