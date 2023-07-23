package lk.ijse.gdse.test.dto.impl;

import lk.ijse.gdse.test.dto.Processor;
import org.springframework.stereotype.Component;

@Component
public class ProcessorImpl implements Processor {
    @Override
    public String getProcessorName() {
        return "i3-7t GEN";
    }
}
