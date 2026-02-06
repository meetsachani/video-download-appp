package com.google.android.exoplayer2.source.rtsp;

import java.util.List;
import java.util.Map;
import o.AbstractC5317bO0;
import o.C5098aU0;
import o.C5559cO0;
import o.C8077mf;
import o.InterfaceC11300zs1;
import o.InterfaceC6181ey;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public final class e {
    public static final String A = "Speed";
    public static final String B = "Supported";
    public static final String C = "Timestamp";
    public static final String D = "Transport";
    public static final String E = "User-Agent";
    public static final String F = "Via";
    public static final String G = "WWW-Authenticate";
    public static final e H = new b().e();
    public static final String b = "Accept";
    public static final String c = "Allow";
    public static final String d = "Authorization";
    public static final String e = "Bandwidth";
    public static final String f = "Blocksize";
    public static final String g = "Cache-Control";
    public static final String h = "Connection";
    public static final String i = "Content-Base";
    public static final String j = "Content-Encoding";
    public static final String k = "Content-Language";
    public static final String l = "Content-Length";
    public static final String m = "Content-Location";
    public static final String n = "Content-Type";

    /* renamed from: o  reason: collision with root package name */
    public static final String f163o = "CSeq";
    public static final String p = "Date";
    public static final String q = "Expires";
    public static final String r = "Location";
    public static final String s = "Proxy-Authenticate";
    public static final String t = "Proxy-Require";
    public static final String u = "Public";
    public static final String v = "Range";
    public static final String w = "RTP-Info";
    public static final String x = "RTCP-Interval";
    public static final String y = "Scale";
    public static final String z = "Session";
    public final C5559cO0<String, String> a;

    /* loaded from: classes2.dex */
    public static final class b {
        public final C5559cO0.a<String, String> a;

        @InterfaceC6181ey
        public b b(String str, String str2) {
            this.a.f(e.d(str.trim()), str2.trim());
            return this;
        }

        @InterfaceC6181ey
        public b c(List<String> list) {
            for (int i = 0; i < list.size(); i++) {
                String[] K1 = TD2.K1(list.get(i), ":\\s?");
                if (K1.length == 2) {
                    b(K1[0], K1[1]);
                }
            }
            return this;
        }

        @InterfaceC6181ey
        public b d(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public e e() {
            return new e(this);
        }

        public b() {
            this.a = new C5559cO0.a<>();
        }

        public b(String str, @InterfaceC11300zs1 String str2, int i) {
            this();
            b("User-Agent", str);
            b(e.f163o, String.valueOf(i));
            if (str2 != null) {
                b(e.z, str2);
            }
        }

        public b(C5559cO0.a<String, String> aVar) {
            this.a = aVar;
        }
    }

    public static String d(String str) {
        if (C8077mf.a(str, "Accept")) {
            return "Accept";
        }
        if (C8077mf.a(str, "Allow")) {
            return "Allow";
        }
        if (C8077mf.a(str, "Authorization")) {
            return "Authorization";
        }
        if (C8077mf.a(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (C8077mf.a(str, f)) {
            return f;
        }
        if (C8077mf.a(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (C8077mf.a(str, "Connection")) {
            return "Connection";
        }
        if (C8077mf.a(str, i)) {
            return i;
        }
        if (C8077mf.a(str, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (C8077mf.a(str, "Content-Language")) {
            return "Content-Language";
        }
        if (C8077mf.a(str, "Content-Length")) {
            return "Content-Length";
        }
        if (C8077mf.a(str, "Content-Location")) {
            return "Content-Location";
        }
        if (C8077mf.a(str, "Content-Type")) {
            return "Content-Type";
        }
        if (C8077mf.a(str, f163o)) {
            return f163o;
        }
        if (C8077mf.a(str, "Date")) {
            return "Date";
        }
        if (C8077mf.a(str, "Expires")) {
            return "Expires";
        }
        if (C8077mf.a(str, "Location")) {
            return "Location";
        }
        if (C8077mf.a(str, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (C8077mf.a(str, t)) {
            return t;
        }
        if (C8077mf.a(str, u)) {
            return u;
        }
        if (C8077mf.a(str, "Range")) {
            return "Range";
        }
        if (C8077mf.a(str, w)) {
            return w;
        }
        if (C8077mf.a(str, x)) {
            return x;
        }
        if (C8077mf.a(str, y)) {
            return y;
        }
        if (C8077mf.a(str, z)) {
            return z;
        }
        if (C8077mf.a(str, A)) {
            return A;
        }
        if (C8077mf.a(str, B)) {
            return B;
        }
        if (C8077mf.a(str, C)) {
            return C;
        }
        if (C8077mf.a(str, D)) {
            return D;
        }
        if (C8077mf.a(str, "User-Agent")) {
            return "User-Agent";
        }
        if (C8077mf.a(str, "Via")) {
            return "Via";
        }
        if (C8077mf.a(str, "WWW-Authenticate")) {
            return "WWW-Authenticate";
        }
        return str;
    }

    public C5559cO0<String, String> b() {
        return this.a;
    }

    public b c() {
        C5559cO0.a aVar = new C5559cO0.a();
        aVar.k(this.a);
        return new b(aVar);
    }

    @InterfaceC11300zs1
    public String e(String str) {
        AbstractC5317bO0<String> f2 = f(str);
        if (f2.isEmpty()) {
            return null;
        }
        return (String) C5098aU0.w(f2);
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.a.equals(((e) obj).a);
    }

    public AbstractC5317bO0<String> f(String str) {
        return this.a.u(d(str));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public e(b bVar) {
        this.a = bVar.a.a();
    }
}
