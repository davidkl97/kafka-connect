package com.github.davidkl97.wapiti.kafka.connect.Validators;

import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigException;

import java.time.Instant;
import java.time.format.DateTimeParseException;

public class TimestampValidator implements ConfigDef.Validator {
    @Override
    public void ensureValid(String name, Object value) {
        String timestamp = (String) value;
        try {
            Instant.parse(timestamp);
        } catch (DateTimeParseException e) {
            throw new ConfigException(name, value, "Wasn't able to parse the timestamp,make sure its formatted ISO-8601 Date");
        }
    }
}
