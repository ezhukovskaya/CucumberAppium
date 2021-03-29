package framework.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import framework.models.DriverSettingsModel;

import java.io.File;
import java.io.IOException;

public class JsonUtils {
    public static DriverSettingsModel ToObject(String filePath) {
        try {
            return new ObjectMapper().readValue(new File(filePath), DriverSettingsModel.class);
        } catch (IOException e) {
            return null;
        }
    }
}
