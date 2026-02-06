package org.jsoup.helper;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

/* loaded from: classes4.dex */
final class UrlBuilder {
    public static final String c = "<>\"{}|\\^[]`";
    public static final /* synthetic */ boolean d = false;
    public URL a;
    public StringBuilder b;

    public UrlBuilder(URL url) {
        this.a = url;
        if (url.getQuery() != null) {
            StringBuilder e = StringUtil.e();
            e.append(this.a.getQuery());
            this.b = e;
        }
    }

    public static void b(String str, boolean z, StringBuilder sb) throws UnsupportedEncodingException {
        char c2;
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 32) {
                if (z) {
                    c2 = '+';
                } else {
                    c2 = "%20";
                }
                sb.append(c2);
            } else if (codePointAt == 37) {
                if (i < str.length() - 2) {
                    int i2 = i + 1;
                    if (e(str.charAt(i2))) {
                        int i3 = i + 2;
                        if (e(str.charAt(i3))) {
                            sb.append('%');
                            sb.append(str.charAt(i2));
                            sb.append(str.charAt(i3));
                            i = i3;
                        }
                    }
                }
                sb.append("%25");
            } else if (codePointAt <= 127 && c.indexOf(codePointAt) == -1) {
                sb.append((char) codePointAt);
            } else {
                sb.append(URLEncoder.encode(new String(Character.toChars(codePointAt)), DataUtil.b.name()));
                if (Character.charCount(codePointAt) == 2) {
                    i++;
                }
            }
            i++;
        }
    }

    public static String d(String str) {
        try {
            return URLDecoder.decode(str, DataUtil.b.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean e(char c2) {
        if (c2 < '0' || c2 > '9') {
            if (c2 < 'A' || c2 > 'F') {
                return c2 >= 'a' && c2 <= 'f';
            }
            return true;
        }
        return true;
    }

    public void a(Connection.KeyVal keyVal) throws UnsupportedEncodingException {
        StringBuilder sb = this.b;
        if (sb == null) {
            this.b = StringUtil.e();
        } else {
            sb.append('&');
        }
        StringBuilder sb2 = this.b;
        String c2 = keyVal.c();
        Charset charset = DataUtil.b;
        sb2.append(URLEncoder.encode(c2, charset.name()));
        sb2.append('=');
        sb2.append(URLEncoder.encode(keyVal.value(), charset.name()));
    }

    public URL c() {
        try {
            URI uri = new URI(this.a.getProtocol(), this.a.getUserInfo(), IDN.toASCII(d(this.a.getHost())), this.a.getPort(), null, null, null);
            StringBuilder e = StringUtil.e();
            e.append(uri.toASCIIString());
            b(this.a.getPath(), false, e);
            if (this.b != null) {
                e.append('?');
                b(StringUtil.x(this.b), true, e);
            }
            if (this.a.getRef() != null) {
                e.append('#');
                b(this.a.getRef(), false, e);
            }
            URL url = new URL(StringUtil.x(e));
            this.a = url;
            return url;
        } catch (UnsupportedEncodingException | MalformedURLException | URISyntaxException unused) {
            return this.a;
        }
    }
}
