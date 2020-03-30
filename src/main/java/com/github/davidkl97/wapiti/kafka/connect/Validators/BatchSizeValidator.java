package com.github.davidkl97.wapiti.kafka.connect.Validators;

import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigException;

public class BatchSizeValidator implements ConfigDef.Validator {

    @Override
    public void ensureValid(String name, Object value) {
        Integer batchSize = (Integer) value;
        if (!(1 <= batchSize && batchSize <= 100)) {
            throw new ConfigException(name, value, "Batch Size Must be Positive and less or equal to 100");
        }
    }

}
