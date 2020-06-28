package flyweight;

import java.util.HashMap;

public class WebsiteFactory {
    private HashMap<String,ConcreteWebsite> pool = new HashMap<>();

    public Website getWebsite(String type){
        Website web;
        if (!pool.containsKey(type)){
            pool.put(type,new ConcreteWebsite(type));
            web = pool.get(type);
        }else {
            web = pool.get(type);
        }
        return web;
    }

    public int getSize(){
        return pool.size();
    }
}
