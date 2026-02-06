package org.jsoup;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import o.C4538Vo0;
import o.UB1;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;
import org.jsoup.internal.SharedConstants;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Safelist;

/* loaded from: classes4.dex */
public class Jsoup {
    private Jsoup() {
    }

    public static String a(String str, String str2, Safelist safelist) {
        if (str2.isEmpty() && safelist.m()) {
            str2 = SharedConstants.h;
        }
        return new Cleaner(safelist).c(w(str, str2)).R4().c3();
    }

    public static String b(String str, String str2, Safelist safelist, Document.OutputSettings outputSettings) {
        Document c = new Cleaner(safelist).c(w(str, str2));
        c.k5(outputSettings);
        return c.R4().c3();
    }

    public static String c(String str, Safelist safelist) {
        return a(str, "", safelist);
    }

    public static Connection d(String str) {
        return HttpConnection.Q(str);
    }

    public static boolean e(String str, Safelist safelist) {
        return new Cleaner(safelist).g(str);
    }

    public static Connection f() {
        return new HttpConnection();
    }

    public static Document g(File file) throws IOException {
        return DataUtil.f(file, null, file.getAbsolutePath());
    }

    public static Document h(File file, String str) throws IOException {
        return DataUtil.f(file, str, file.getAbsolutePath());
    }

    public static Document i(File file, String str, String str2) throws IOException {
        return DataUtil.f(file, str, str2);
    }

    public static Document j(File file, String str, String str2, Parser parser) throws IOException {
        return DataUtil.g(file, str, str2, parser);
    }

    public static Document k(InputStream inputStream, String str, String str2) throws IOException {
        return DataUtil.h(inputStream, str, str2);
    }

    public static Document l(InputStream inputStream, String str, String str2, Parser parser) throws IOException {
        return DataUtil.i(inputStream, str, str2, parser);
    }

    public static Document m(String str) {
        return Parser.j(str, "");
    }

    public static Document n(String str, String str2) {
        return Parser.j(str, str2);
    }

    public static Document o(String str, String str2, Parser parser) {
        return parser.q(str, str2);
    }

    public static Document p(String str, Parser parser) {
        return parser.q(str, "");
    }

    public static Document q(URL url, int i) throws IOException {
        Connection R = HttpConnection.R(url);
        R.d(i);
        return R.get();
    }

    public static Document r(Path path) throws IOException {
        return DataUtil.j(path, null, C4538Vo0.a(UB1.a(path)));
    }

    public static Document s(Path path, String str) throws IOException {
        return DataUtil.j(path, str, C4538Vo0.a(UB1.a(path)));
    }

    public static Document t(Path path, String str, String str2) throws IOException {
        return DataUtil.j(path, str, str2);
    }

    public static Document u(Path path, String str, String str2, Parser parser) throws IOException {
        return DataUtil.k(path, str, str2, parser);
    }

    public static Document v(String str) {
        return Parser.k(str, "");
    }

    public static Document w(String str, String str2) {
        return Parser.k(str, str2);
    }
}
