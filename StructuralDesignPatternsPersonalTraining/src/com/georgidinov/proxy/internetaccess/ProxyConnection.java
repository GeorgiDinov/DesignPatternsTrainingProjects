package com.georgidinov.proxy.internetaccess;

class ProxyConnection implements InternetConnection {
    private final InternetConnection connection = new RealConnection();
    private final String[] bannedSites = {
            "not allowed.com",
            "can't connect.bg",
            "sorry.net",
            "bye bye.org"
    };

    @Override
    public void connect(String url) throws Exception {
        if (this.isBanned(url)) {
            throw new Exception("Access Denied!");
        }
        this.connection.connect(url);
    }//end of method connect

    private boolean isBanned(String url) {
        for (String site : this.bannedSites) {
            if (site.equals(url)) {
                return true;
            }
        }
        return false;
    }//end of method isBanned

}//end of class ProxyConnection
