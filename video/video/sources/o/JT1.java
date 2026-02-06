package o;

import java.util.ArrayList;
import java.util.Set;
import o.C2602Bw0;

/* loaded from: classes.dex */
public class JT1 extends C4279Sx0 {
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    public static final int k = 5;
    public static final int l = 6;
    public static final int m = 7;
    public final InterfaceC9610sw c;
    public volatile boolean d;
    public volatile Set<Integer> e;

    /* loaded from: classes.dex */
    public @interface a {
    }

    public JT1(InterfaceC9610sw interfaceC9610sw) {
        super(interfaceC9610sw);
        this.d = false;
        this.c = interfaceC9610sw;
    }

    @Override // o.C4279Sx0, o.InterfaceC9367rw
    public InterfaceFutureC8411o11<Void> d(float f2) {
        if (!t(0)) {
            return C7221jC0.f(new IllegalStateException("Zoom is not supported"));
        }
        return this.c.d(f2);
    }

    @Override // o.C4279Sx0, o.InterfaceC9367rw
    public InterfaceFutureC8411o11<Void> f() {
        return this.c.f();
    }

    @Override // o.C4279Sx0, o.InterfaceC9367rw
    public InterfaceFutureC8411o11<Void> g(float f2) {
        if (!t(0)) {
            return C7221jC0.f(new IllegalStateException("Zoom is not supported"));
        }
        return this.c.g(f2);
    }

    @Override // o.C4279Sx0, o.InterfaceC9610sw
    public InterfaceC9610sw getImplementation() {
        return this.c;
    }

    @Override // o.C4279Sx0, o.InterfaceC9367rw
    public InterfaceFutureC8411o11<Void> j(boolean z) {
        if (!t(6)) {
            return C7221jC0.f(new IllegalStateException("Torch is not supported"));
        }
        return this.c.j(z);
    }

    @Override // o.C4279Sx0, o.InterfaceC9367rw
    public InterfaceFutureC8411o11<C3788Nw0> m(C2602Bw0 c2602Bw0) {
        C2602Bw0 s = s(c2602Bw0);
        if (s == null) {
            return C7221jC0.f(new IllegalStateException("FocusMetering is not supported"));
        }
        return this.c.m(s);
    }

    @Override // o.C4279Sx0, o.InterfaceC9367rw
    public InterfaceFutureC8411o11<Integer> o(int i2) {
        if (!t(7)) {
            return C7221jC0.f(new IllegalStateException("ExposureCompensation is not supported"));
        }
        return this.c.o(i2);
    }

    public void r(boolean z, Set<Integer> set) {
        this.d = z;
        this.e = set;
    }

    public C2602Bw0 s(C2602Bw0 c2602Bw0) {
        boolean z;
        C2602Bw0.a aVar = new C2602Bw0.a(c2602Bw0);
        boolean z2 = true;
        if (!c2602Bw0.c().isEmpty() && !t(1, 2)) {
            aVar.e(1);
            z = true;
        } else {
            z = false;
        }
        if (!c2602Bw0.b().isEmpty() && !t(3)) {
            aVar.e(2);
            z = true;
        }
        if (!c2602Bw0.d().isEmpty() && !t(4)) {
            aVar.e(4);
        } else {
            z2 = z;
        }
        if (!z2) {
            return c2602Bw0;
        }
        C2602Bw0 c = aVar.c();
        if (c.c().isEmpty() && c.b().isEmpty() && c.d().isEmpty()) {
            return null;
        }
        return aVar.c();
    }

    public boolean t(int... iArr) {
        if (this.d && this.e != null) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList.add(Integer.valueOf(i2));
            }
            return this.e.containsAll(arrayList);
        }
        return true;
    }
}
