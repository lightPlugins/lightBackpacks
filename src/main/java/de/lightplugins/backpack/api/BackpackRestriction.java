package de.lightplugins.backpack.api;

import java.util.List;

public class BackpackRestriction {

    private List<String> whitelist;
    private List<String> blacklist;

    public List<String> getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(List<String> whitelist) {
        this.whitelist = whitelist;
    }

    public List<String> getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(List<String> blacklist) {
        this.blacklist = blacklist;
    }
}
