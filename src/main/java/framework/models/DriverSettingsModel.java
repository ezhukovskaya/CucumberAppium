package framework.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

public class DriverSettingsModel {
    @JsonProperty(value = "appPackage")
    private String appPackage;
    @JsonProperty(value = "appActivity")
    private String appActivity;
    @JsonProperty(value = "deviceName")
    private String deviceName;
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "platformName")
    private String platformName;
    @JsonProperty(value = "url")
    private String url;
    @JsonProperty(value = "udid")
    private String udid;

    public String getAppPackage() {
        return appPackage;
    }

    public String getAppActivity() {
        return appActivity;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getName() {
        return name;
    }

    public String getPlatformName() {
        return platformName;
    }

    public String getUrl() {
        return url;
    }

    public String getUdid() {
        return udid;
    }
}
