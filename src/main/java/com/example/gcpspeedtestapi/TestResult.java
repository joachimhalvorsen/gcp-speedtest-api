package com.example.gcpspeedtestapi;

public class TestResult {
    private String user;
    private Integer device;
    private Long timestamp;
    Data data;
    public String getUser() {
        return user;
    }
    public Integer getDevice() {
        return device;
    }
    public Long getTimestamp() {
        return timestamp;
    }
    public Data getData() {
        return data;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public void setDevice(Integer device) {
        this.device = device;
    }
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    public void setData(Data dataObject) {
        this.data = dataObject;
    }
}
class Data {
    Speeds Speeds;
    Client Client;
    Server Server;
    // Getter Methods
    public Speeds getSpeeds() {
        return Speeds;
    }
    public Client getClient() {
        return Client;
    }
    public Server getServer() {
        return Server;
    }
    // Setter Methods
    public void setSpeeds(Speeds speedsObject) {
        this.Speeds = speedsObject;
    }
    public void setClient(Client clientObject) {
        this.Client = clientObject;
    }
    public void setServer(Server serverObject) {
        this.Server = serverObject;
    }
}
class Server {
    private String host;
    private Double lat;
    private Double lon;
    private String country;
    private Double distance;
    private Integer ping;
    private Integer id;
    // Getter Methods
    public String getHost() {
        return host;
    }
    public Double getLat() {
        return lat;
    }
    public Double getLon() {
        return lon;
    }
    public String getCountry() {
        return country;
    }
    public Double getDistance() {
        return distance;
    }
    public Integer getPing() {
        return ping;
    }
    public Integer getId() {
        return id;
    }
    // Setter Methods
    public void setHost(String host) {
        this.host = host;
    }
    public void setLat(Double lat) {
        this.lat = lat;
    }
    public void setLon(Double lon) {
        this.lon = lon;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setDistance(Double distance) {
        this.distance = distance;
    }
    public void setPing(Integer ping) {
        this.ping = ping;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
class Client {
    private String ip;
    private Double lat;
    private Double lon;
    private String isp;
    private String country;
    // Getter Methods
    public String getIp() {
        return ip;
    }
    public Double getLat() {
        return lat;
    }
    public Double getLon() {
        return lon;
    }
    public String getIsp() {
        return isp;
    }
    public String getCountry() {
        return country;
    }
    // Setter Methods
    public void setIp(String ip) {
        this.ip = ip;
    }
    public void setLat(Double lat) {
        this.lat = lat;
    }
    public void setLon(Double lon) {
        this.lon = lon;
    }
    public void setIsp(String isp) {
        this.isp = isp;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
class Speeds {
    private Double download;
    private Double upload;
    // Getter Methods
    public Double getDownload() {
        return download;
    }
    public Double getUpload() {
        return upload;
    }
    // Setter Methods
    public void setDownload(Double download) {
        this.download = download;
    }
    public void setUpload(Double upload) {
        this.upload = upload;
    }
}