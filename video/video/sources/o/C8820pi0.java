package o;

import java.util.Map;

/* renamed from: o.pi0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8820pi0 extends AbstractC3697My1 {
    public static final String q = "KG";
    public static final String r = "LB";
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    /* renamed from: o  reason: collision with root package name */
    public final String f836o;
    public final Map<String, String> p;

    public C8820pi0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map) {
        super(EnumC3795Ny1.PRODUCT);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = str12;
        this.n = str13;
        this.f836o = str14;
        this.p = map;
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int u(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // o.AbstractC3697My1
    public String a() {
        return String.valueOf(this.b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8820pi0)) {
            return false;
        }
        C8820pi0 c8820pi0 = (C8820pi0) obj;
        if (!e(this.c, c8820pi0.c) || !e(this.d, c8820pi0.d) || !e(this.e, c8820pi0.e) || !e(this.f, c8820pi0.f) || !e(this.h, c8820pi0.h) || !e(this.i, c8820pi0.i) || !e(this.j, c8820pi0.j) || !e(this.k, c8820pi0.k) || !e(this.l, c8820pi0.l) || !e(this.m, c8820pi0.m) || !e(this.n, c8820pi0.n) || !e(this.f836o, c8820pi0.f836o) || !e(this.p, c8820pi0.p)) {
            return false;
        }
        return true;
    }

    public String f() {
        return this.h;
    }

    public String g() {
        return this.i;
    }

    public String h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((u(this.c) ^ u(this.d)) ^ u(this.e)) ^ u(this.f)) ^ u(this.h)) ^ u(this.i)) ^ u(this.j)) ^ u(this.k)) ^ u(this.l)) ^ u(this.m)) ^ u(this.n)) ^ u(this.f836o)) ^ u(this.p);
    }

    public String i() {
        return this.g;
    }

    public String j() {
        return this.m;
    }

    public String k() {
        return this.f836o;
    }

    public String l() {
        return this.n;
    }

    public String m() {
        return this.c;
    }

    public String n() {
        return this.f;
    }

    public String o() {
        return this.b;
    }

    public String p() {
        return this.d;
    }

    public Map<String, String> q() {
        return this.p;
    }

    public String r() {
        return this.j;
    }

    public String s() {
        return this.l;
    }

    public String t() {
        return this.k;
    }
}
