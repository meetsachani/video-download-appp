package o;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C8541oZ;
import o.FU;

@Deprecated
/* renamed from: o.yY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10977yY implements FU {
    public static final String m = "DefaultDataSource";
    public static final String n = "asset";

    /* renamed from: o  reason: collision with root package name */
    public static final String f916o = "content";
    public static final String p = "rtmp";
    public static final String q = "udp";
    public static final String r = "data";
    public static final String s = "rawresource";
    public static final String t = "android.resource";
    public final Context b;
    public final List<InterfaceC4261Sr2> c;
    public final FU d;
    @InterfaceC11300zs1
    public FU e;
    @InterfaceC11300zs1
    public FU f;
    @InterfaceC11300zs1
    public FU g;
    @InterfaceC11300zs1
    public FU h;
    @InterfaceC11300zs1
    public FU i;
    @InterfaceC11300zs1
    public FU j;
    @InterfaceC11300zs1
    public FU k;
    @InterfaceC11300zs1
    public FU l;

    /* renamed from: o.yY$a */
    /* loaded from: classes2.dex */
    public static final class a implements FU.a {
        public final Context a;
        public final FU.a b;
        @InterfaceC11300zs1
        public InterfaceC4261Sr2 c;

        public a(Context context) {
            this(context, new C8541oZ.b());
        }

        @Override // o.FU.a
        /* renamed from: c */
        public C10977yY a() {
            C10977yY c10977yY = new C10977yY(this.a, this.b.a());
            InterfaceC4261Sr2 interfaceC4261Sr2 = this.c;
            if (interfaceC4261Sr2 != null) {
                c10977yY.s(interfaceC4261Sr2);
            }
            return c10977yY;
        }

        @InterfaceC6181ey
        public a d(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
            this.c = interfaceC4261Sr2;
            return this;
        }

        public a(Context context, FU.a aVar) {
            this.a = context.getApplicationContext();
            this.b = aVar;
        }
    }

    public C10977yY(Context context, boolean z) {
        this(context, null, 8000, 8000, z);
    }

    public final FU A() {
        if (this.j == null) {
            DU du = new DU();
            this.j = du;
            m(du);
        }
        return this.j;
    }

    public final FU B() {
        if (this.e == null) {
            C4829Yo0 c4829Yo0 = new C4829Yo0();
            this.e = c4829Yo0;
            m(c4829Yo0);
        }
        return this.e;
    }

    public final FU C() {
        if (this.k == null) {
            C8504oO1 c8504oO1 = new C8504oO1(this.b);
            this.k = c8504oO1;
            m(c8504oO1);
        }
        return this.k;
    }

    public final FU D() {
        if (this.h == null) {
            try {
                FU fu = (FU) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.h = fu;
                m(fu);
            } catch (ClassNotFoundException unused) {
                I31.n(m, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.h == null) {
                this.h = this.d;
            }
        }
        return this.h;
    }

    public final FU E() {
        if (this.i == null) {
            C5699cy2 c5699cy2 = new C5699cy2();
            this.i = c5699cy2;
            m(c5699cy2);
        }
        return this.i;
    }

    public final void F(@InterfaceC11300zs1 FU fu, InterfaceC4261Sr2 interfaceC4261Sr2) {
        if (fu != null) {
            fu.s(interfaceC4261Sr2);
        }
    }

    @Override // o.FU
    public long a(OU ou) throws IOException {
        boolean z;
        if (this.l == null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        String scheme = ou.a.getScheme();
        if (TD2.W0(ou.a)) {
            String path = ou.a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.l = y();
            } else {
                this.l = B();
            }
        } else if (n.equals(scheme)) {
            this.l = y();
        } else if ("content".equals(scheme)) {
            this.l = z();
        } else if (p.equals(scheme)) {
            this.l = D();
        } else if (q.equals(scheme)) {
            this.l = E();
        } else if ("data".equals(scheme)) {
            this.l = A();
        } else if (!"rawresource".equals(scheme) && !t.equals(scheme)) {
            this.l = this.d;
        } else {
            this.l = C();
        }
        return this.l.a(ou);
    }

    @Override // o.FU
    public Map<String, List<String>> b() {
        FU fu = this.l;
        if (fu == null) {
            return Collections.EMPTY_MAP;
        }
        return fu.b();
    }

    @Override // o.FU
    public void close() throws IOException {
        FU fu = this.l;
        if (fu != null) {
            try {
                fu.close();
            } finally {
                this.l = null;
            }
        }
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        FU fu = this.l;
        if (fu == null) {
            return null;
        }
        return fu.getUri();
    }

    public final void m(FU fu) {
        for (int i = 0; i < this.c.size(); i++) {
            fu.s(this.c.get(i));
        }
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return ((FU) C9542sf.g(this.l)).read(bArr, i, i2);
    }

    @Override // o.FU
    public void s(InterfaceC4261Sr2 interfaceC4261Sr2) {
        C9542sf.g(interfaceC4261Sr2);
        this.d.s(interfaceC4261Sr2);
        this.c.add(interfaceC4261Sr2);
        F(this.e, interfaceC4261Sr2);
        F(this.f, interfaceC4261Sr2);
        F(this.g, interfaceC4261Sr2);
        F(this.h, interfaceC4261Sr2);
        F(this.i, interfaceC4261Sr2);
        F(this.j, interfaceC4261Sr2);
        F(this.k, interfaceC4261Sr2);
    }

    public final FU y() {
        if (this.f == null) {
            C10028uf c10028uf = new C10028uf(this.b);
            this.f = c10028uf;
            m(c10028uf);
        }
        return this.f;
    }

    public final FU z() {
        if (this.g == null) {
            GL gl = new GL(this.b);
            this.g = gl;
            m(gl);
        }
        return this.g;
    }

    public C10977yY(Context context, @InterfaceC11300zs1 String str, boolean z) {
        this(context, str, 8000, 8000, z);
    }

    public C10977yY(Context context, @InterfaceC11300zs1 String str, int i, int i2, boolean z) {
        this(context, new C8541oZ.b().k(str).e(i).i(i2).d(z).a());
    }

    public C10977yY(Context context, FU fu) {
        this.b = context.getApplicationContext();
        this.d = (FU) C9542sf.g(fu);
        this.c = new ArrayList();
    }
}
