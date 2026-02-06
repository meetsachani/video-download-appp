package o;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.BY;

/* renamed from: o.eF0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6008eF0 {
    public C4308Tf0 a;
    public Z41 b;
    public InterfaceC10308vo0 c;
    public final Map<Type, InterfaceC10218vQ0<?>> d;
    public final List<InterfaceC8631ov2> e;
    public final List<InterfaceC8631ov2> f;
    public boolean g;
    public String h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public C3693Mx0 n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f722o;
    public EnumC7572ke2 p;
    public boolean q;
    public InterfaceC3959Pp2 r;
    public InterfaceC3959Pp2 s;
    public final ArrayDeque<InterfaceC7278jQ1> t;

    public C6008eF0() {
        this.a = C4308Tf0.c1;
        this.b = Z41.X;
        this.c = EnumC10065uo0.X;
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = false;
        this.h = C5523cF0.H;
        this.i = 2;
        this.j = 2;
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = C5523cF0.B;
        this.f722o = false;
        this.p = C5523cF0.A;
        this.q = true;
        this.r = C5523cF0.J;
        this.s = C5523cF0.K;
        this.t = new ArrayDeque<>();
    }

    public static void d(String str, int i, int i2, List<InterfaceC8631ov2> list) {
        InterfaceC8631ov2 interfaceC8631ov2;
        InterfaceC8631ov2 interfaceC8631ov22;
        boolean z = C8794pb2.a;
        InterfaceC8631ov2 interfaceC8631ov23 = null;
        if (str != null && !str.trim().isEmpty()) {
            interfaceC8631ov2 = BY.b.b.b(str);
            if (z) {
                interfaceC8631ov23 = C8794pb2.c.b(str);
                interfaceC8631ov22 = C8794pb2.b.b(str);
            }
            interfaceC8631ov22 = null;
        } else if (i != 2 || i2 != 2) {
            InterfaceC8631ov2 a = BY.b.b.a(i, i2);
            if (z) {
                interfaceC8631ov23 = C8794pb2.c.a(i, i2);
                InterfaceC8631ov2 a2 = C8794pb2.b.a(i, i2);
                interfaceC8631ov2 = a;
                interfaceC8631ov22 = a2;
            } else {
                interfaceC8631ov2 = a;
                interfaceC8631ov22 = null;
            }
        } else {
            return;
        }
        list.add(interfaceC8631ov2);
        if (z) {
            list.add(interfaceC8631ov23);
            list.add(interfaceC8631ov22);
        }
    }

    public static int e(int i) {
        if (i >= 0 && i <= 3) {
            return i;
        }
        throw new IllegalArgumentException("Invalid style: " + i);
    }

    public static boolean n(Type type) {
        if (type == Object.class) {
            return true;
        }
        return false;
    }

    @InterfaceC6181ey
    @Deprecated
    @VP0(imports = {"com.google.gson.Strictness"}, replacement = "this.setStrictness(Strictness.LENIENT)")
    public C6008eF0 A() {
        return F(EnumC7572ke2.LENIENT);
    }

    @InterfaceC6181ey
    public C6008eF0 B(Z41 z41) {
        Objects.requireNonNull(z41);
        this.b = z41;
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 C(InterfaceC3959Pp2 interfaceC3959Pp2) {
        Objects.requireNonNull(interfaceC3959Pp2);
        this.s = interfaceC3959Pp2;
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 D(InterfaceC3959Pp2 interfaceC3959Pp2) {
        Objects.requireNonNull(interfaceC3959Pp2);
        this.r = interfaceC3959Pp2;
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 E() {
        return z(C3693Mx0.e);
    }

    @InterfaceC6181ey
    public C6008eF0 F(EnumC7572ke2 enumC7572ke2) {
        Objects.requireNonNull(enumC7572ke2);
        this.p = enumC7572ke2;
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 G(double d) {
        if (!Double.isNaN(d) && d >= 0.0d) {
            this.a = this.a.n(d);
            return this;
        }
        throw new IllegalArgumentException("Invalid version: " + d);
    }

    @InterfaceC6181ey
    public C6008eF0 a(InterfaceC4502Vf0 interfaceC4502Vf0) {
        Objects.requireNonNull(interfaceC4502Vf0);
        this.a = this.a.l(interfaceC4502Vf0, false, true);
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 b(InterfaceC7278jQ1 interfaceC7278jQ1) {
        Objects.requireNonNull(interfaceC7278jQ1);
        this.t.addFirst(interfaceC7278jQ1);
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 c(InterfaceC4502Vf0 interfaceC4502Vf0) {
        Objects.requireNonNull(interfaceC4502Vf0);
        this.a = this.a.l(interfaceC4502Vf0, true, false);
        return this;
    }

    public C5523cF0 f() {
        ArrayList arrayList = new ArrayList(this.e.size() + this.f.size() + 3);
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        d(this.h, this.i, this.j, arrayList);
        return new C5523cF0(this.a, this.c, new HashMap(this.d), this.g, this.k, this.f722o, this.m, this.n, this.p, this.l, this.q, this.b, this.h, this.i, this.j, new ArrayList(this.e), new ArrayList(this.f), arrayList, this.r, this.s, new ArrayList(this.t));
    }

    @InterfaceC6181ey
    public C6008eF0 g() {
        this.m = false;
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 h() {
        this.a = this.a.d();
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 i() {
        this.q = false;
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 j() {
        this.k = true;
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 k(int... iArr) {
        Objects.requireNonNull(iArr);
        this.a = this.a.m(iArr);
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 l() {
        this.a = this.a.g();
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 m() {
        this.f722o = true;
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 o(Type type, Object obj) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(obj);
        boolean z = obj instanceof UV0;
        if (!z && !(obj instanceof CV0) && !(obj instanceof InterfaceC10218vQ0) && !(obj instanceof AbstractC8387nv2)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        } else if (!n(type)) {
            if (obj instanceof InterfaceC10218vQ0) {
                this.d.put(type, (InterfaceC10218vQ0) obj);
            }
            if (z || (obj instanceof CV0)) {
                this.e.add(C9113qu2.m(Rv2.c(type), obj));
            }
            if (obj instanceof AbstractC8387nv2) {
                this.e.add(C9117qv2.c(Rv2.c(type), (AbstractC8387nv2) obj));
            }
            return this;
        } else {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
    }

    @InterfaceC6181ey
    public C6008eF0 p(InterfaceC8631ov2 interfaceC8631ov2) {
        Objects.requireNonNull(interfaceC8631ov2);
        this.e.add(interfaceC8631ov2);
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 q(Class<?> cls, Object obj) {
        Objects.requireNonNull(cls);
        Objects.requireNonNull(obj);
        boolean z = obj instanceof UV0;
        if (!z && !(obj instanceof CV0) && !(obj instanceof AbstractC8387nv2)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        }
        if ((obj instanceof CV0) || z) {
            this.f.add(C9113qu2.n(cls, obj));
        }
        if (obj instanceof AbstractC8387nv2) {
            this.e.add(C9117qv2.e(cls, (AbstractC8387nv2) obj));
        }
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 r() {
        this.g = true;
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 s() {
        this.l = true;
        return this;
    }

    @InterfaceC6181ey
    @Deprecated
    public C6008eF0 t(int i) {
        this.i = e(i);
        this.h = null;
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 u(int i, int i2) {
        this.i = e(i);
        this.j = e(i2);
        this.h = null;
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 v(String str) {
        if (str != null) {
            try {
                new SimpleDateFormat(str);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("The date pattern '" + str + "' is not valid", e);
            }
        }
        this.h = str;
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 w(InterfaceC4502Vf0... interfaceC4502Vf0Arr) {
        Objects.requireNonNull(interfaceC4502Vf0Arr);
        for (InterfaceC4502Vf0 interfaceC4502Vf0 : interfaceC4502Vf0Arr) {
            this.a = this.a.l(interfaceC4502Vf0, true, true);
        }
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 x(EnumC10065uo0 enumC10065uo0) {
        return y(enumC10065uo0);
    }

    @InterfaceC6181ey
    public C6008eF0 y(InterfaceC10308vo0 interfaceC10308vo0) {
        Objects.requireNonNull(interfaceC10308vo0);
        this.c = interfaceC10308vo0;
        return this;
    }

    @InterfaceC6181ey
    public C6008eF0 z(C3693Mx0 c3693Mx0) {
        Objects.requireNonNull(c3693Mx0);
        this.n = c3693Mx0;
        return this;
    }

    public C6008eF0(C5523cF0 c5523cF0) {
        this.a = C4308Tf0.c1;
        this.b = Z41.X;
        this.c = EnumC10065uo0.X;
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        this.g = false;
        this.h = C5523cF0.H;
        this.i = 2;
        this.j = 2;
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = C5523cF0.B;
        this.f722o = false;
        this.p = C5523cF0.A;
        this.q = true;
        this.r = C5523cF0.J;
        this.s = C5523cF0.K;
        ArrayDeque<InterfaceC7278jQ1> arrayDeque = new ArrayDeque<>();
        this.t = arrayDeque;
        this.a = c5523cF0.f;
        this.c = c5523cF0.g;
        hashMap.putAll(c5523cF0.h);
        this.g = c5523cF0.i;
        this.k = c5523cF0.j;
        this.f722o = c5523cF0.k;
        this.m = c5523cF0.l;
        this.n = c5523cF0.m;
        this.p = c5523cF0.n;
        this.l = c5523cF0.f704o;
        this.b = c5523cF0.t;
        this.h = c5523cF0.q;
        this.i = c5523cF0.r;
        this.j = c5523cF0.s;
        arrayList.addAll(c5523cF0.u);
        arrayList2.addAll(c5523cF0.v);
        this.q = c5523cF0.p;
        this.r = c5523cF0.w;
        this.s = c5523cF0.x;
        arrayDeque.addAll(c5523cF0.y);
    }
}
