package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.e;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AbstractC5317bO0;
import o.AbstractC6237fB2;
import o.C3989Py1;
import o.C5559cO0;
import o.C6108ef2;
import o.C6318fW1;
import o.C6573gW1;
import o.C7782lV0;
import o.C9542sf;
import o.InterfaceC11300zs1;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public final class h {
    public static final long a = 60000;
    public static final String h = "RTSP/1.0";
    public static final Pattern b = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");
    public static final Pattern c = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");
    public static final Pattern d = Pattern.compile("Content-Length:\\s?(\\d+)", 2);
    public static final Pattern e = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");
    public static final Pattern f = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");
    public static final Pattern g = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");
    public static final String i = new String(new byte[]{10});
    public static final String j = new String(new byte[]{13, 10});

    /* loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public final String a;
        public final long b;

        public b(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    public static void a(boolean z, @InterfaceC11300zs1 String str) throws C3989Py1 {
        if (z) {
            return;
        }
        throw C3989Py1.c(str, null);
    }

    public static byte[] b(List<String> list) {
        return C7782lV0.p(j).k(list).getBytes(g.b1);
    }

    public static String c(int i2) {
        if (i2 != 200) {
            if (i2 != 461) {
                if (i2 != 500) {
                    if (i2 != 505) {
                        if (i2 != 301) {
                            if (i2 != 302) {
                                if (i2 != 400) {
                                    if (i2 != 401) {
                                        if (i2 != 404) {
                                            if (i2 != 405) {
                                                switch (i2) {
                                                    case 454:
                                                        return "Session Not Found";
                                                    case 455:
                                                        return "Method Not Valid In This State";
                                                    case 456:
                                                        return "Header Field Not Valid";
                                                    case 457:
                                                        return "Invalid Range";
                                                    default:
                                                        throw new IllegalArgumentException();
                                                }
                                            }
                                            return "Method Not Allowed";
                                        }
                                        return "Not Found";
                                    }
                                    return "Unauthorized";
                                }
                                return "Bad Request";
                            }
                            return "Move Temporarily";
                        }
                        return "Move Permanently";
                    }
                    return "RTSP Version Not Supported";
                }
                return "Internal Server Error";
            }
            return "Unsupported Transport";
        }
        return "OK";
    }

    public static byte[] d(String str) {
        return str.getBytes(g.b1);
    }

    public static boolean e(List<String> list) {
        return c.matcher(list.get(0)).matches();
    }

    public static boolean f(String str) {
        if (!b.matcher(str).matches() && !c.matcher(str).matches()) {
            return false;
        }
        return true;
    }

    public static long g(String str) throws C3989Py1 {
        try {
            Matcher matcher = d.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) C9542sf.g(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e2) {
            throw C3989Py1.c(str, e2);
        }
    }

    public static int h(String str) throws C3989Py1 {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            throw C3989Py1.c(str, e2);
        }
    }

    public static int i(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1881579439:
                if (str.equals("RECORD")) {
                    c2 = 0;
                    break;
                }
                break;
            case -880847356:
                if (str.equals("TEARDOWN")) {
                    c2 = 1;
                    break;
                }
                break;
            case -702888512:
                if (str.equals("GET_PARAMETER")) {
                    c2 = 2;
                    break;
                }
                break;
            case -531492226:
                if (str.equals("OPTIONS")) {
                    c2 = 3;
                    break;
                }
                break;
            case -84360524:
                if (str.equals("PLAY_NOTIFY")) {
                    c2 = 4;
                    break;
                }
                break;
            case 2458420:
                if (str.equals("PLAY")) {
                    c2 = 5;
                    break;
                }
                break;
            case 6481884:
                if (str.equals("REDIRECT")) {
                    c2 = 6;
                    break;
                }
                break;
            case 71242700:
                if (str.equals("SET_PARAMETER")) {
                    c2 = 7;
                    break;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 78791261:
                if (str.equals("SETUP")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 133006441:
                if (str.equals("ANNOUNCE")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1800840907:
                if (str.equals("DESCRIBE")) {
                    c2 = 11;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 8;
            case 1:
                return 12;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 7;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 11;
            case '\b':
                return 5;
            case '\t':
                return 10;
            case '\n':
                return 1;
            case 11:
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static AbstractC5317bO0<Integer> j(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return AbstractC5317bO0.L();
        }
        AbstractC5317bO0.a aVar = new AbstractC5317bO0.a();
        for (String str2 : TD2.J1(str, ",\\s?")) {
            aVar.g(Integer.valueOf(i(str2)));
        }
        return aVar.e();
    }

    public static C6318fW1 k(List<String> list) {
        boolean z = false;
        Matcher matcher = b.matcher(list.get(0));
        C9542sf.a(matcher.matches());
        int i2 = i((String) C9542sf.g(matcher.group(1)));
        Uri parse = Uri.parse((String) C9542sf.g(matcher.group(2)));
        int indexOf = list.indexOf("");
        if (indexOf > 0) {
            z = true;
        }
        C9542sf.a(z);
        return new C6318fW1(parse, i2, new e.b().c(list.subList(1, indexOf)).e(), C7782lV0.p(j).k(list.subList(indexOf + 1, list.size())));
    }

    public static C6573gW1 l(List<String> list) {
        boolean z = false;
        Matcher matcher = c.matcher(list.get(0));
        C9542sf.a(matcher.matches());
        int parseInt = Integer.parseInt((String) C9542sf.g(matcher.group(1)));
        int indexOf = list.indexOf("");
        if (indexOf > 0) {
            z = true;
        }
        C9542sf.a(z);
        return new C6573gW1(parseInt, new e.b().c(list.subList(1, indexOf)).e(), C7782lV0.p(j).k(list.subList(indexOf + 1, list.size())));
    }

    public static b m(String str) throws C3989Py1 {
        long parseInt;
        Matcher matcher = e.matcher(str);
        if (matcher.matches()) {
            String str2 = (String) C9542sf.g(matcher.group(1));
            String group = matcher.group(2);
            if (group != null) {
                try {
                    parseInt = Integer.parseInt(group) * 1000;
                } catch (NumberFormatException e2) {
                    throw C3989Py1.c(str, e2);
                }
            } else {
                parseInt = 60000;
            }
            return new b(str2, parseInt);
        }
        throw C3989Py1.c(str, null);
    }

    @InterfaceC11300zs1
    public static a n(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] K1 = TD2.K1(userInfo, ":");
        return new a(K1[0], K1[1]);
    }

    public static c o(String str) throws C3989Py1 {
        Matcher matcher = f.matcher(str);
        if (matcher.find()) {
            return new c(2, (String) C9542sf.g(matcher.group(1)), (String) C9542sf.g(matcher.group(3)), C6108ef2.g(matcher.group(4)));
        }
        Matcher matcher2 = g.matcher(str);
        if (matcher2.matches()) {
            return new c(1, (String) C9542sf.g(matcher2.group(1)), "", "");
        }
        throw C3989Py1.c("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri p(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) C9542sf.g(uri.getAuthority());
        C9542sf.a(str.contains("@"));
        return uri.buildUpon().encodedAuthority(TD2.J1(str, "@")[1]).build();
    }

    public static AbstractC5317bO0<String> q(C6318fW1 c6318fW1) {
        boolean z;
        if (c6318fW1.c.e(e.f163o) != null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        AbstractC5317bO0.a aVar = new AbstractC5317bO0.a();
        aVar.g(TD2.M("%s %s %s", t(c6318fW1.b), c6318fW1.a, h));
        C5559cO0<String, String> b2 = c6318fW1.c.b();
        AbstractC6237fB2<String> it = b2.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            AbstractC5317bO0<String> u = b2.u(next);
            for (int i2 = 0; i2 < u.size(); i2++) {
                aVar.g(TD2.M("%s: %s", next, u.get(i2)));
            }
        }
        aVar.g("");
        aVar.g(c6318fW1.d);
        return aVar.e();
    }

    public static AbstractC5317bO0<String> r(C6573gW1 c6573gW1) {
        boolean z;
        if (c6573gW1.b.e(e.f163o) != null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        AbstractC5317bO0.a aVar = new AbstractC5317bO0.a();
        aVar.g(TD2.M("%s %s %s", h, Integer.valueOf(c6573gW1.a), c(c6573gW1.a)));
        C5559cO0<String, String> b2 = c6573gW1.b.b();
        AbstractC6237fB2<String> it = b2.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            AbstractC5317bO0<String> u = b2.u(next);
            for (int i2 = 0; i2 < u.size(); i2++) {
                aVar.g(TD2.M("%s: %s", next, u.get(i2)));
            }
        }
        aVar.g("");
        aVar.g(c6573gW1.c);
        return aVar.e();
    }

    public static String[] s(String str) {
        String str2 = j;
        if (!str.contains(str2)) {
            str2 = i;
        }
        return TD2.J1(str, str2);
    }

    public static String t(int i2) {
        switch (i2) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
