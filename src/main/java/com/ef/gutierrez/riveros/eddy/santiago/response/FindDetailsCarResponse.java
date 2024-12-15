package com.ef.gutierrez.riveros.eddy.santiago.response;

import com.ef.gutierrez.riveros.eddy.santiago.dto.CarDetailDTO;

public record FindDetailsCarResponse(String code,
                                     String error,
                                     CarDetailDTO carDetailDTO) {
}
