package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import o.C7875lt2;
import o.InterfaceC8148mw2;
import o.MK;

/* loaded from: classes.dex */
public class UK2 {
    public static float v = Float.NaN;
    public UK a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public float f626o;
    public float p;
    public float q;
    public int r;
    public final HashMap<String, NT> s;
    public String t;
    public C5933dw2 u;

    public UK2() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.f626o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap<>();
        this.t = null;
    }

    public static void a(StringBuilder sb, String str, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void b(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }

    public static float o(float f, float f2, float f3, float f4) {
        boolean isNaN = Float.isNaN(f);
        boolean isNaN2 = Float.isNaN(f2);
        if (isNaN && isNaN2) {
            return Float.NaN;
        }
        if (isNaN) {
            f = f3;
        }
        if (isNaN2) {
            f2 = f3;
        }
        return f + (f4 * (f2 - f));
    }

    public static void p(int i, int i2, UK2 uk2, UK2 uk22, UK2 uk23, C7875lt2 c7875lt2, float f) {
        int i3;
        int i4;
        int i5;
        float f2;
        int i6;
        float f3;
        float f4;
        float f5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f6 = 100.0f * f;
        int i12 = (int) f6;
        int i13 = uk22.b;
        int i14 = uk22.c;
        int i15 = uk23.b;
        int i16 = uk23.c;
        int i17 = uk22.d - i13;
        int i18 = uk22.e - i14;
        int i19 = uk23.d - i15;
        int i20 = uk23.e - i16;
        int i21 = i13;
        float f7 = uk22.p;
        float f8 = uk23.p;
        if (uk22.r == 8) {
            int i22 = i21 - ((int) (i19 / 2.0f));
            i5 = i14 - ((int) (i20 / 2.0f));
            if (Float.isNaN(f7)) {
                i3 = i20;
                i21 = i22;
                i4 = i19;
                f2 = 0.0f;
            } else {
                i21 = i22;
                i4 = i19;
                f2 = f7;
                i3 = i20;
            }
        } else {
            i3 = i20;
            i20 = i18;
            i4 = i17;
            i5 = i14;
            f2 = f7;
        }
        if (uk23.r == 8) {
            i15 -= (int) (i4 / 2.0f);
            i16 -= (int) (i20 / 2.0f);
            if (Float.isNaN(f8)) {
                i6 = i20;
                i19 = i4;
                f8 = 0.0f;
            } else {
                i6 = i20;
                i19 = i4;
            }
        } else {
            i6 = i3;
        }
        if (Float.isNaN(f2) && !Float.isNaN(f8)) {
            f2 = 1.0f;
        }
        if (!Float.isNaN(f2) && Float.isNaN(f8)) {
            f8 = 1.0f;
        }
        int i23 = i15;
        if (uk22.r == 4) {
            f3 = 0.0f;
        } else {
            f3 = f2;
        }
        int i24 = i16;
        if (uk23.r == 4) {
            f4 = 0.0f;
        } else {
            f4 = f8;
        }
        if (uk2.a != null && c7875lt2.W()) {
            C7875lt2.a C = c7875lt2.C(uk2.a.f625o, i12);
            int i25 = i5;
            C7875lt2.a B = c7875lt2.B(uk2.a.f625o, i12);
            if (C == B) {
                B = null;
            }
            if (C != null) {
                i21 = (int) (C.d * i);
                i9 = (int) (C.e * i2);
                i10 = C.a;
            } else {
                i10 = 0;
                i9 = i25;
            }
            if (B != null) {
                i7 = (int) (B.d * i);
                i8 = (int) (B.e * i2);
                i11 = B.a;
            } else {
                i11 = 100;
                i7 = i23;
                i8 = i24;
            }
            f5 = (f6 - i10) / (i11 - i10);
        } else {
            f5 = f;
            i7 = i23;
            i8 = i24;
            i9 = i5;
        }
        int i26 = i21;
        uk2.a = uk22.a;
        int i27 = (int) (i26 + ((i7 - i26) * f5));
        uk2.b = i27;
        int i28 = (int) (i9 + (f5 * (i8 - i9)));
        uk2.c = i28;
        float f9 = 1.0f - f;
        uk2.d = i27 + ((int) ((i4 * f9) + (i19 * f)));
        uk2.e = i28 + ((int) ((f9 * i20) + (i6 * f)));
        uk2.f = o(uk22.f, uk23.f, 0.5f, f);
        uk2.g = o(uk22.g, uk23.g, 0.5f, f);
        uk2.h = o(uk22.h, uk23.h, 0.0f, f);
        uk2.i = o(uk22.i, uk23.i, 0.0f, f);
        uk2.j = o(uk22.j, uk23.j, 0.0f, f);
        uk2.n = o(uk22.n, uk23.n, 1.0f, f);
        uk2.f626o = o(uk22.f626o, uk23.f626o, 1.0f, f);
        uk2.k = o(uk22.k, uk23.k, 0.0f, f);
        uk2.l = o(uk22.l, uk23.l, 0.0f, f);
        uk2.m = o(uk22.m, uk23.m, 0.0f, f);
        uk2.p = o(f3, f4, 1.0f, f);
        Set<String> keySet = uk23.s.keySet();
        uk2.s.clear();
        for (String str : keySet) {
            if (uk22.s.containsKey(str)) {
                NT nt = uk22.s.get(str);
                NT nt2 = uk23.s.get(str);
                NT nt3 = new NT(nt);
                uk2.s.put(str, nt3);
                if (nt.r() == 1) {
                    nt3.y(Float.valueOf(o(nt.n(), nt2.n(), 0.0f, f)));
                } else {
                    int r = nt.r();
                    float[] fArr = new float[r];
                    float[] fArr2 = new float[r];
                    nt.o(fArr);
                    nt2.o(fArr2);
                    for (int i29 = 0; i29 < r; i29++) {
                        fArr[i29] = o(fArr[i29], fArr2[i29], 0.0f, f);
                        nt3.z(fArr);
                    }
                }
            }
        }
    }

    public void A(String str, int i, boolean z) {
        if (this.s.containsKey(str)) {
            this.s.get(str).t(z);
        } else {
            this.s.put(str, new NT(str, i, z));
        }
    }

    public void C(C5933dw2 c5933dw2) {
        this.u = c5933dw2;
    }

    public boolean D(String str, C2783Ds c2783Ds) throws C3284Is {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1881940865:
                if (str.equals("phone_orientation")) {
                    c = 0;
                    break;
                }
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c = 1;
                    break;
                }
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 3;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 4;
                    break;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 6;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 7;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = '\b';
                    break;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = '\t';
                    break;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = '\n';
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 11;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = '\f';
                    break;
                }
                break;
            case 115029:
                if (str.equals(C9698tH2.l)) {
                    c = C8206nB.d;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 14;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 15;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(C5445bv2.n0)) {
                    c = 16;
                    break;
                }
                break;
            case 642850769:
                if (str.equals("interpolatedPos")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                v = c2783Ds.k();
                break;
            case 1:
                this.e = c2783Ds.l();
                break;
            case 2:
                s(c2783Ds);
                break;
            case 3:
                this.h = c2783Ds.k();
                break;
            case 4:
                this.i = c2783Ds.k();
                break;
            case 5:
                this.j = c2783Ds.k();
                break;
            case 6:
                this.k = c2783Ds.k();
                break;
            case 7:
                this.l = c2783Ds.k();
                break;
            case '\b':
                this.m = c2783Ds.k();
                break;
            case '\t':
                this.f = c2783Ds.k();
                break;
            case '\n':
                this.g = c2783Ds.k();
                break;
            case 11:
                this.n = c2783Ds.k();
                break;
            case '\f':
                this.f626o = c2783Ds.k();
                break;
            case '\r':
                this.c = c2783Ds.l();
                break;
            case 14:
                this.b = c2783Ds.l();
                break;
            case 15:
                this.p = c2783Ds.k();
                break;
            case 16:
                this.d = c2783Ds.l();
                break;
            case 17:
                this.q = c2783Ds.k();
                break;
            default:
                return false;
        }
        return true;
    }

    public UK2 E() {
        UK uk = this.a;
        if (uk != null) {
            this.b = uk.L();
            this.c = this.a.e0();
            this.d = this.a.X();
            this.e = this.a.v();
            G(this.a.n);
        }
        return this;
    }

    public UK2 F(UK uk) {
        if (uk == null) {
            return this;
        }
        this.a = uk;
        E();
        return this;
    }

    public void G(UK2 uk2) {
        if (uk2 != null) {
            this.f = uk2.f;
            this.g = uk2.g;
            this.h = uk2.h;
            this.i = uk2.i;
            this.j = uk2.j;
            this.k = uk2.k;
            this.l = uk2.l;
            this.m = uk2.m;
            this.n = uk2.n;
            this.f626o = uk2.f626o;
            this.p = uk2.p;
            this.r = uk2.r;
            C(uk2.u);
            this.s.clear();
            for (NT nt : uk2.s.values()) {
                this.s.put(nt.k(), nt.d());
            }
        }
    }

    public int H() {
        return Math.max(0, this.d - this.b);
    }

    public void c(String str, int i) {
        y(str, 902, i);
    }

    public void d(String str, float f) {
        x(str, 901, f);
    }

    public float e() {
        int i = this.b;
        return i + ((this.d - i) / 2.0f);
    }

    public float f() {
        int i = this.c;
        return i + ((this.e - i) / 2.0f);
    }

    public boolean g(String str) {
        return this.s.containsKey(str);
    }

    public NT h(String str) {
        return this.s.get(str);
    }

    public Set<String> i() {
        return this.s.keySet();
    }

    public int j(String str) {
        if (this.s.containsKey(str)) {
            return this.s.get(str).g();
        }
        return -21880;
    }

    public float k(String str) {
        if (this.s.containsKey(str)) {
            return this.s.get(str).h();
        }
        return Float.NaN;
    }

    public String l() {
        UK uk = this.a;
        if (uk == null) {
            return "unknown";
        }
        return uk.f625o;
    }

    public C5933dw2 m() {
        return this.u;
    }

    public int n() {
        return Math.max(0, this.e - this.c);
    }

    public boolean q() {
        if (Float.isNaN(this.h) && Float.isNaN(this.i) && Float.isNaN(this.j) && Float.isNaN(this.k) && Float.isNaN(this.l) && Float.isNaN(this.m) && Float.isNaN(this.n) && Float.isNaN(this.f626o) && Float.isNaN(this.p)) {
            return true;
        }
        return false;
    }

    public void r(String str) {
        String str2;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str3 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + C4500Ve2.b + (hashCode() % 1000);
        if (this.a != null) {
            str2 = str3 + RemoteSettings.i + (this.a.hashCode() % 1000);
        } else {
            str2 = str3 + "/NULL";
        }
        System.out.println(str2 + C4500Ve2.b + str);
    }

    public void s(C2783Ds c2783Ds) throws C3284Is {
        C3088Gs c3088Gs = (C3088Gs) c2783Ds;
        int size = c3088Gs.size();
        for (int i = 0; i < size; i++) {
            C2783Ds O0 = ((C2881Es) c3088Gs.Y(i)).O0();
            String f = O0.f();
            if (f.matches("#[0-9a-fA-F]+")) {
                y(this.t, 902, Integer.parseInt(f.substring(1), 16));
            } else if (O0 instanceof C2990Fs) {
                x(this.t, 901, O0.k());
            } else {
                z(this.t, InterfaceC8148mw2.b.m, f);
            }
        }
    }

    public void t() {
        String str;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + C4500Ve2.b + (hashCode() % 1000);
        if (this.a != null) {
            str = str2 + RemoteSettings.i + (this.a.hashCode() % 1000) + C4500Ve2.b;
        } else {
            str = str2 + "/NULL ";
        }
        HashMap<String, NT> hashMap = this.s;
        if (hashMap != null) {
            Iterator<String> it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                System.out.println(str + this.s.get(it.next()).toString());
            }
        }
    }

    public StringBuilder u(StringBuilder sb) {
        return v(sb, false);
    }

    public StringBuilder v(StringBuilder sb, boolean z) {
        sb.append("{\n");
        b(sb, "left", this.b);
        b(sb, C9698tH2.l, this.c);
        b(sb, C5445bv2.n0, this.d);
        b(sb, "bottom", this.e);
        a(sb, "pivotX", this.f);
        a(sb, "pivotY", this.g);
        a(sb, "rotationX", this.h);
        a(sb, "rotationY", this.i);
        a(sb, "rotationZ", this.j);
        a(sb, "translationX", this.k);
        a(sb, "translationY", this.l);
        a(sb, "translationZ", this.m);
        a(sb, "scaleX", this.n);
        a(sb, "scaleY", this.f626o);
        a(sb, "alpha", this.p);
        b(sb, "visibility", this.r);
        a(sb, "interpolatedPos", this.q);
        if (this.a != null) {
            for (MK.a aVar : MK.a.values()) {
                w(sb, aVar);
            }
        }
        if (z) {
            a(sb, "phone_orientation", v);
        }
        if (z) {
            a(sb, "phone_orientation", v);
        }
        if (this.s.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.s.keySet()) {
                NT nt = this.s.get(str);
                sb.append(str);
                sb.append(": ");
                switch (nt.m()) {
                    case 900:
                        sb.append(nt.i());
                        sb.append(",\n");
                        break;
                    case 901:
                    case InterfaceC8148mw2.b.f812o /* 905 */:
                        sb.append(nt.h());
                        sb.append(",\n");
                        break;
                    case 902:
                        sb.append("'");
                        sb.append(NT.c(nt.i()));
                        sb.append("',\n");
                        break;
                    case InterfaceC8148mw2.b.m /* 903 */:
                        sb.append("'");
                        sb.append(nt.l());
                        sb.append("',\n");
                        break;
                    case InterfaceC8148mw2.b.n /* 904 */:
                        sb.append("'");
                        sb.append(nt.f());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public final void w(StringBuilder sb, MK.a aVar) {
        MK r = this.a.r(aVar);
        if (r != null && r.f != null) {
            sb.append("Anchor");
            sb.append(aVar.name());
            sb.append(": ['");
            String str = r.f.i().f625o;
            if (str == null) {
                str = "#PARENT";
            }
            sb.append(str);
            sb.append("', '");
            sb.append(r.f.l().name());
            sb.append("', '");
            sb.append(r.g);
            sb.append("'],\n");
        }
    }

    public void x(String str, int i, float f) {
        if (this.s.containsKey(str)) {
            this.s.get(str).u(f);
        } else {
            this.s.put(str, new NT(str, i, f));
        }
    }

    public void y(String str, int i, int i2) {
        if (this.s.containsKey(str)) {
            this.s.get(str).v(i2);
        } else {
            this.s.put(str, new NT(str, i, i2));
        }
    }

    public void z(String str, int i, String str2) {
        if (this.s.containsKey(str)) {
            this.s.get(str).x(str2);
        } else {
            this.s.put(str, new NT(str, i, str2));
        }
    }

    public UK2(UK uk) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.f626o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap<>();
        this.t = null;
        this.a = uk;
    }

    public void B(BS bs, float[] fArr) {
    }

    public UK2(UK2 uk2) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.f626o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap<>();
        this.t = null;
        this.a = uk2.a;
        this.b = uk2.b;
        this.c = uk2.c;
        this.d = uk2.d;
        this.e = uk2.e;
        G(uk2);
    }
}
