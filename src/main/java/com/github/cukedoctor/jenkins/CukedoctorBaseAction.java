package com.github.cukedoctor.jenkins;

public abstract class CukedoctorBaseAction {

    protected static final String ICON_NAME = "/plugin/cucumber-living-documentation/cuke.png";

    protected static final String BASE_URL = "cucumber-living-documentation";

    protected static final String TITLE = "Living documentation";


    public String getUrlName() {
        return BASE_URL;
    }

    public String getDisplayName() {
        return TITLE;
    }

    public String getIconFileName() {
        return ICON_NAME;
    }

    protected abstract String getTitle();

}
