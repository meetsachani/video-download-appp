package o;

import android.net.Uri;
import java.util.HashMap;
import o.AbstractC5317bO0;

@Deprecated
/* loaded from: classes2.dex */
public final class V12 {
    public static final String m = "0";
    public static final String n = "control";

    /* renamed from: o  reason: collision with root package name */
    public static final String f632o = "fmtp";
    public static final String p = "length";
    public static final String q = "range";
    public static final String r = "rtpmap";
    public static final String s = "tool";
    public static final String t = "type";
    public final AbstractC6044eO0<String, String> a;
    public final AbstractC5317bO0<C6848hf1> b;
    @InterfaceC11300zs1
    public final String c;
    @InterfaceC11300zs1
    public final String d;
    @InterfaceC11300zs1
    public final String e;
    public final int f;
    @InterfaceC11300zs1
    public final Uri g;
    @InterfaceC11300zs1
    public final String h;
    @InterfaceC11300zs1
    public final String i;
    @InterfaceC11300zs1
    public final String j;
    @InterfaceC11300zs1
    public final String k;
    @InterfaceC11300zs1
    public final String l;

    /* loaded from: classes2.dex */
    public static final class b {
        public final HashMap<String, String> a = new HashMap<>();
        public final AbstractC5317bO0.a<C6848hf1> b = new AbstractC5317bO0.a<>();
        public int c = -1;
        @InterfaceC11300zs1
        public String d;
        @InterfaceC11300zs1
        public String e;
        @InterfaceC11300zs1
        public String f;
        @InterfaceC11300zs1
        public Uri g;
        @InterfaceC11300zs1
        public String h;
        @InterfaceC11300zs1
        public String i;
        @InterfaceC11300zs1
        public String j;
        @InterfaceC11300zs1
        public String k;
        @InterfaceC11300zs1
        public String l;

        @InterfaceC6181ey
        public b m(String str, String str2) {
            this.a.put(str, str2);
            return this;
        }

        @InterfaceC6181ey
        public b n(C6848hf1 c6848hf1) {
            this.b.g(c6848hf1);
            return this;
        }

        public V12 o() {
            return new V12(this);
        }

        @InterfaceC6181ey
        public b p(int i) {
            this.c = i;
            return this;
        }

        @InterfaceC6181ey
        public b q(String str) {
            this.h = str;
            return this;
        }

        @InterfaceC6181ey
        public b r(String str) {
            this.k = str;
            return this;
        }

        @InterfaceC6181ey
        public b s(String str) {
            this.i = str;
            return this;
        }

        @InterfaceC6181ey
        public b t(String str) {
            this.e = str;
            return this;
        }

        @InterfaceC6181ey
        public b u(String str) {
            this.l = str;
            return this;
        }

        @InterfaceC6181ey
        public b v(String str) {
            this.j = str;
            return this;
        }

        @InterfaceC6181ey
        public b w(String str) {
            this.d = str;
            return this;
        }

        @InterfaceC6181ey
        public b x(String str) {
            this.f = str;
            return this;
        }

        @InterfaceC6181ey
        public b y(Uri uri) {
            this.g = uri;
            return this;
        }
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && V12.class == obj.getClass()) {
            V12 v12 = (V12) obj;
            if (this.f == v12.f && this.a.equals(v12.a) && this.b.equals(v12.b) && TD2.g(this.d, v12.d) && TD2.g(this.c, v12.c) && TD2.g(this.e, v12.e) && TD2.g(this.l, v12.l) && TD2.g(this.g, v12.g) && TD2.g(this.j, v12.j) && TD2.g(this.k, v12.k) && TD2.g(this.h, v12.h) && TD2.g(this.i, v12.i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = (((217 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31;
        String str = this.d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode9 + hashCode) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (((i3 + hashCode3) * 31) + this.f) * 31;
        String str4 = this.l;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Uri uri = this.g;
        if (uri == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = uri.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str5 = this.j;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str6 = this.k;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str7 = this.h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str8 = this.i;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return i9 + i;
    }

    public V12(b bVar) {
        this.a = AbstractC6044eO0.g(bVar.a);
        this.b = bVar.b.e();
        this.c = (String) TD2.o(bVar.d);
        this.d = (String) TD2.o(bVar.e);
        this.e = (String) TD2.o(bVar.f);
        this.g = bVar.g;
        this.h = bVar.h;
        this.f = bVar.c;
        this.i = bVar.i;
        this.j = bVar.k;
        this.k = bVar.l;
        this.l = bVar.j;
    }
}
