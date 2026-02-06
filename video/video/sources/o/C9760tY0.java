package o;

import java.util.List;
import java.util.Locale;

/* renamed from: o.tY0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9760tY0 {
    public final List<InterfaceC6776hM> a;
    public final C10624x51 b;
    public final String c;
    public final long d;
    public final a e;
    public final long f;
    public final String g;
    public final List<C11122z81> h;
    public final F9 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;

    /* renamed from: o  reason: collision with root package name */
    public final float f876o;
    public final float p;
    public final A9 q;
    public final B9 r;
    public final C9177r9 s;
    public final List<LX0<Float>> t;
    public final b u;
    public final boolean v;
    public final C11039yo w;
    public final C11117z70 x;
    public final EnumC5110aY0 y;

    /* renamed from: o.tY0$a */
    /* loaded from: classes.dex */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* renamed from: o.tY0$b */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public C9760tY0(List<InterfaceC6776hM> list, C10624x51 c10624x51, String str, long j, a aVar, long j2, String str2, List<C11122z81> list2, F9 f9, int i, int i2, int i3, float f, float f2, float f3, float f4, A9 a9, B9 b9, List<LX0<Float>> list3, b bVar, C9177r9 c9177r9, boolean z, C11039yo c11039yo, C11117z70 c11117z70, EnumC5110aY0 enumC5110aY0) {
        this.a = list;
        this.b = c10624x51;
        this.c = str;
        this.d = j;
        this.e = aVar;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = f9;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.f876o = f3;
        this.p = f4;
        this.q = a9;
        this.r = b9;
        this.t = list3;
        this.u = bVar;
        this.s = c9177r9;
        this.v = z;
        this.w = c11039yo;
        this.x = c11117z70;
        this.y = enumC5110aY0;
    }

    public EnumC5110aY0 a() {
        return this.y;
    }

    public C11039yo b() {
        return this.w;
    }

    public C10624x51 c() {
        return this.b;
    }

    public C11117z70 d() {
        return this.x;
    }

    public long e() {
        return this.d;
    }

    public List<LX0<Float>> f() {
        return this.t;
    }

    public a g() {
        return this.e;
    }

    public List<C11122z81> h() {
        return this.h;
    }

    public b i() {
        return this.u;
    }

    public String j() {
        return this.c;
    }

    public long k() {
        return this.f;
    }

    public float l() {
        return this.p;
    }

    public float m() {
        return this.f876o;
    }

    public String n() {
        return this.g;
    }

    public List<InterfaceC6776hM> o() {
        return this.a;
    }

    public int p() {
        return this.l;
    }

    public int q() {
        return this.k;
    }

    public int r() {
        return this.j;
    }

    public float s() {
        return this.n / this.b.e();
    }

    public A9 t() {
        return this.q;
    }

    public String toString() {
        return z("");
    }

    public B9 u() {
        return this.r;
    }

    public C9177r9 v() {
        return this.s;
    }

    public float w() {
        return this.m;
    }

    public F9 x() {
        return this.i;
    }

    public boolean y() {
        return this.v;
    }

    public String z(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j());
        sb.append("\n");
        C9760tY0 z = this.b.z(k());
        if (z != null) {
            sb.append("\t\tParents: ");
            sb.append(z.j());
            C9760tY0 z2 = this.b.z(z.k());
            while (z2 != null) {
                sb.append("->");
                sb.append(z2.j());
                z2 = this.b.z(z2.k());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!h().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(h().size());
            sb.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (InterfaceC6776hM interfaceC6776hM : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(interfaceC6776hM);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
