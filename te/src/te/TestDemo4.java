//package te;
//
//import java.io.IOException;
// 
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
// 
//public class TestDemo4 {
//     
//    public String baseUrl = "http://www.cnblogs.com/zhangfei/p/";
//     
//    public String pager = "?page=%s";
//     
//    public int getAllPageCount(){
//        int count = 0;
//        try {
//            Document doc = Jsoup.connect(baseUrl).get();
//            String countText = doc.select("#myposts>div.pager:nth-of-type(1)>.Pager").text();
//            countText = countText.replaceFirst("\\D+(\\d+).*", "$1");
//            count = Integer.valueOf(countText);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return count;
//    }
//     
//    public void crawler(){
//        int count = this.getAllPageCount();
//        for (int i = 1; i <= count; i++) {
//            String url = baseUrl + String.format(pager, i);
//            this.testJsop(url);
//        }
//    }
// 
//    public void testJsop(String url) {
//        try {
//            Document doc = Jsoup.connect(url).get();
//            Elements element = doc.select("div.PostList a");
//            for (Element e : element) {
//                String text = e.text();
//                String href = e.attr("href");
//                System.out.println(text+" : "+href);
//            }          
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
// 
//    public static void main(String[] args) {
//        TestDemo4 t = new TestDemo4();
//        t.crawler();
//    }
//}
