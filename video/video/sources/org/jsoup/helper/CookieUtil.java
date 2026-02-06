package org.jsoup.helper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import o.AI0;
import o.C10928yK2;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.CharacterReader;

/* loaded from: classes4.dex */
class CookieUtil {
    public static final Map<String, List<String>> a = Collections.unmodifiableMap(new HashMap());
    public static final String b = "; ";
    public static final String c = "Cookie";
    public static final String d = "Cookie2";

    public static void a(HttpConnection.Request request, BiConsumer<String, String> biConsumer) throws IOException {
        HashSet hashSet;
        HashSet hashSet2;
        LinkedHashSet<String> d2 = d(request);
        HashSet hashSet3 = null;
        for (Map.Entry<String, List<String>> entry : request.m0().get(b(request.a), a).entrySet()) {
            List<String> value = entry.getValue();
            if (value != null && value.size() != 0) {
                String key = entry.getKey();
                if ("Cookie".equals(key)) {
                    hashSet = hashSet3;
                    hashSet2 = d2;
                } else if (d.equals(key)) {
                    hashSet2 = new HashSet();
                    hashSet = hashSet2;
                }
                hashSet2.addAll(value);
                hashSet3 = hashSet;
            }
        }
        if (d2.size() > 0) {
            biConsumer.accept("Cookie", StringUtil.q(d2, b));
        }
        if (hashSet3 != null && hashSet3.size() > 0) {
            biConsumer.accept(d, StringUtil.q(hashSet3, b));
        }
    }

    public static URI b(URL url) throws IOException {
        try {
            return url.toURI();
        } catch (URISyntaxException e) {
            MalformedURLException malformedURLException = new MalformedURLException(e.getMessage());
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    public static void c(String str, HttpConnection.Response response) {
        if (str == null) {
            return;
        }
        CharacterReader characterReader = new CharacterReader(str);
        String trim = characterReader.G('=').trim();
        characterReader.n();
        String trim2 = characterReader.G(C10928yK2.l).trim();
        if (!trim.isEmpty()) {
            response.c(trim, trim2);
        }
        characterReader.close();
    }

    public static LinkedHashSet<String> d(Connection.Request request) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (Map.Entry<String, String> entry : request.C().entrySet()) {
            linkedHashSet.add(entry.getKey() + "=" + entry.getValue());
        }
        return linkedHashSet;
    }

    public static void e(HttpConnection.Request request, HttpConnection.Response response, URL url, Map<String, List<String>> map) throws IOException {
        request.m0().put(b(url), map);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            if (entry.getKey().equalsIgnoreCase(AI0.E0)) {
                for (String str : value) {
                    c(str, response);
                }
            }
        }
    }
}
