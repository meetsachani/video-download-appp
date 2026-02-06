package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import o.AbstractC6044eO0;

@Deprecated
/* renamed from: o.hf1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6848hf1 {
    public static final String k = "audio";
    public static final String l = "video";
    public static final String m = "RTP/AVP";
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    @InterfaceC11300zs1
    public final String f;
    @InterfaceC11300zs1
    public final String g;
    @InterfaceC11300zs1
    public final String h;
    public final AbstractC6044eO0<String, String> i;
    public final d j;

    /* renamed from: o.hf1$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public static final String j = "%d %s/%d/%d";
        public static final int k = 0;
        public static final int l = 8;
        public static final int m = 10;
        public static final int n = 11;
        public final String a;
        public final int b;
        public final String c;
        public final int d;
        public final HashMap<String, String> e = new HashMap<>();
        public int f = -1;
        @InterfaceC11300zs1
        public String g;
        @InterfaceC11300zs1
        public String h;
        @InterfaceC11300zs1
        public String i;

        public b(String str, int i, String str2, int i2) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = i2;
        }

        public static String k(int i, String str, int i2, int i3) {
            return TD2.M(j, Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3));
        }

        public static String l(int i) {
            boolean z;
            if (i < 96) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            if (i != 0) {
                if (i != 8) {
                    if (i != 10) {
                        if (i == 11) {
                            return k(11, OV1.r, 44100, 1);
                        }
                        throw new IllegalStateException("Unsupported static paylod type " + i);
                    }
                    return k(10, OV1.r, 44100, 2);
                }
                return k(8, OV1.s, 8000, 1);
            }
            return k(0, OV1.t, 8000, 1);
        }

        @InterfaceC6181ey
        public b i(String str, String str2) {
            this.e.put(str, str2);
            return this;
        }

        public C6848hf1 j() {
            d a;
            try {
                if (this.e.containsKey(V12.r)) {
                    a = d.a((String) TD2.o(this.e.get(V12.r)));
                } else {
                    a = d.a(l(this.d));
                }
                return new C6848hf1(this, AbstractC6044eO0.g(this.e), a);
            } catch (C3989Py1 e) {
                throw new IllegalStateException(e);
            }
        }

        @InterfaceC6181ey
        public b m(int i) {
            this.f = i;
            return this;
        }

        @InterfaceC6181ey
        public b n(String str) {
            this.h = str;
            return this;
        }

        @InterfaceC6181ey
        public b o(String str) {
            this.i = str;
            return this;
        }

        @InterfaceC6181ey
        public b p(String str) {
            this.g = str;
            return this;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.hf1$c */
    /* loaded from: classes2.dex */
    public @interface c {
    }

    /* renamed from: o.hf1$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public d(int i, String str, int i2, int i3) {
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = i3;
        }

        public static d a(String str) throws C3989Py1 {
            boolean z;
            boolean z2;
            int i;
            String[] K1 = TD2.K1(str, C4500Ve2.b);
            if (K1.length == 2) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            int h = com.google.android.exoplayer2.source.rtsp.h.h(K1[0]);
            String[] J1 = TD2.J1(K1[1].trim(), RemoteSettings.i);
            if (J1.length >= 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9542sf.a(z2);
            int h2 = com.google.android.exoplayer2.source.rtsp.h.h(J1[1]);
            if (J1.length == 3) {
                i = com.google.android.exoplayer2.source.rtsp.h.h(J1[2]);
            } else {
                i = -1;
            }
            return new d(h, J1[0], h2, i);
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.a == dVar.a && this.b.equals(dVar.b) && this.c == dVar.c && this.d == dVar.d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((((217 + this.a) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
        }
    }

    public AbstractC6044eO0<String, String> a() {
        boolean z;
        String str = this.i.get(V12.f632o);
        if (str == null) {
            return AbstractC6044eO0.u();
        }
        String[] K1 = TD2.K1(str, C4500Ve2.b);
        if (K1.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.b(z, str);
        String[] split = K1[1].split(";\\s?", 0);
        AbstractC6044eO0.b bVar = new AbstractC6044eO0.b();
        for (String str2 : split) {
            String[] K12 = TD2.K1(str2, "=");
            bVar.i(K12[0], K12[1]);
        }
        return bVar.d();
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6848hf1.class == obj.getClass()) {
            C6848hf1 c6848hf1 = (C6848hf1) obj;
            if (this.a.equals(c6848hf1.a) && this.b == c6848hf1.b && this.c.equals(c6848hf1.c) && this.d == c6848hf1.d && this.e == c6848hf1.e && this.i.equals(c6848hf1.i) && this.j.equals(c6848hf1.j) && TD2.g(this.f, c6848hf1.f) && TD2.g(this.g, c6848hf1.g) && TD2.g(this.h, c6848hf1.h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((((((((((((217 + this.a.hashCode()) * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31;
        String str = this.f;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.h;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public C6848hf1(b bVar, AbstractC6044eO0<String, String> abstractC6044eO0, d dVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.f = bVar.g;
        this.g = bVar.h;
        this.e = bVar.f;
        this.h = bVar.i;
        this.i = abstractC6044eO0;
        this.j = dVar;
    }
}
