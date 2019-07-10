package org.dimigo.crawiling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class WebCrawiling {
    public static void main(String[] args) {
        try {
            //네이버 웹툰 크롤링
            Document doc =
                    Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn").get();
         //   System.out.println(doc.html());

            //class="rank" -> .select(".rank")
           Elements result = doc.select("[id = realTimeRankFavorite]").select("li").select("a");
           List<String> list =  result.eachText();
           int i = 0;
           for(String title : list){
               System.out.printf("%d,%s\n",++i,title);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
