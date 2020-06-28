package flyweight;


/**
 * Integer源码用到过,缓存
 */
public class Client {
    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();
        Website news = websiteFactory.getWebsite("news");
        news.use();
    }
}
