package org.example;

import org.example.factory.Factory;
import org.example.factory.Link;
import org.example.factory.Page;
import org.example.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
        }
        // Factory factory = Factory.getFactory(args[0]);
        Factory factory = Factory.getFactory("org.example.listfactory.ListFactory");

        Link people = factory.createLink("人民日报", "https://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "https://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "https://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "https://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "https://www.excite.com/");
        Link google = factory.createLink("Google", "https://www.google.com");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("搜索引擎");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "author");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
