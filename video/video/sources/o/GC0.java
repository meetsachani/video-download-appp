package o;

import java.io.Serializable;
import java.util.Comparator;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class GC0<T> implements Serializable {
    public final Comparator<? super T> X;
    public final boolean Y;
    public final EnumC6886hp Y0;
    @MB
    public final T Z;
    public final boolean Z0;
    @MB
    public final T a1;
    public final EnumC6886hp b1;
    @MB
    public transient GC0<T> c1;

    public GC0(Comparator<? super T> comparator, boolean z, @MB T t, EnumC6886hp enumC6886hp, boolean z2, @MB T t2, EnumC6886hp enumC6886hp2) {
        boolean z3;
        this.X = (Comparator) C10664xF1.E(comparator);
        this.Y = z;
        this.Z0 = z2;
        this.Z = t;
        this.Y0 = (EnumC6886hp) C10664xF1.E(enumC6886hp);
        this.a1 = t2;
        this.b1 = (EnumC6886hp) C10664xF1.E(enumC6886hp2);
        if (z) {
            comparator.compare((Object) C2491As1.a(t), (Object) C2491As1.a(t));
        }
        if (z2) {
            comparator.compare((Object) C2491As1.a(t2), (Object) C2491As1.a(t2));
        }
        if (z && z2) {
            int compare = comparator.compare((Object) C2491As1.a(t), (Object) C2491As1.a(t2));
            boolean z4 = false;
            if (compare <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            C10664xF1.y(z3, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (compare == 0) {
                EnumC6886hp enumC6886hp3 = EnumC6886hp.OPEN;
                C10664xF1.d((enumC6886hp == enumC6886hp3 && enumC6886hp2 == enumC6886hp3) ? z4 : true);
            }
        }
    }

    public static <T> GC0<T> a(Comparator<? super T> comparator) {
        EnumC6886hp enumC6886hp = EnumC6886hp.OPEN;
        return new GC0<>(comparator, false, null, enumC6886hp, false, null, enumC6886hp);
    }

    public static <T> GC0<T> d(Comparator<? super T> comparator, @InterfaceC7894ly1 T t, EnumC6886hp enumC6886hp) {
        return new GC0<>(comparator, true, t, enumC6886hp, false, null, EnumC6886hp.OPEN);
    }

    public static <T extends Comparable> GC0<T> e(PN1<T> pn1) {
        T t;
        EnumC6886hp enumC6886hp;
        EnumC6886hp enumC6886hp2;
        T t2 = null;
        if (pn1.q()) {
            t = pn1.y();
        } else {
            t = null;
        }
        if (pn1.q()) {
            enumC6886hp = pn1.x();
        } else {
            enumC6886hp = EnumC6886hp.OPEN;
        }
        EnumC6886hp enumC6886hp3 = enumC6886hp;
        if (pn1.r()) {
            t2 = pn1.J();
        }
        T t3 = t2;
        if (pn1.r()) {
            enumC6886hp2 = pn1.I();
        } else {
            enumC6886hp2 = EnumC6886hp.OPEN;
        }
        return new GC0<>(AbstractC10587ww1.z(), pn1.q(), t, enumC6886hp3, pn1.r(), t3, enumC6886hp2);
    }

    public static <T> GC0<T> n(Comparator<? super T> comparator, @InterfaceC7894ly1 T t, EnumC6886hp enumC6886hp, @InterfaceC7894ly1 T t2, EnumC6886hp enumC6886hp2) {
        return new GC0<>(comparator, true, t, enumC6886hp, true, t2, enumC6886hp2);
    }

    public static <T> GC0<T> r(Comparator<? super T> comparator, @InterfaceC7894ly1 T t, EnumC6886hp enumC6886hp) {
        return new GC0<>(comparator, false, null, EnumC6886hp.OPEN, true, t, enumC6886hp);
    }

    public Comparator<? super T> b() {
        return this.X;
    }

    public boolean c(@InterfaceC7894ly1 T t) {
        if (!q(t) && !p(t)) {
            return true;
        }
        return false;
    }

    public boolean equals(@MB Object obj) {
        if (obj instanceof GC0) {
            GC0 gc0 = (GC0) obj;
            if (this.X.equals(gc0.X) && this.Y == gc0.Y && this.Z0 == gc0.Z0 && f().equals(gc0.f()) && h().equals(gc0.h()) && C2593Bt1.a(g(), gc0.g()) && C2593Bt1.a(i(), gc0.i())) {
                return true;
            }
        }
        return false;
    }

    public EnumC6886hp f() {
        return this.Y0;
    }

    @MB
    public T g() {
        return this.Z;
    }

    public EnumC6886hp h() {
        return this.b1;
    }

    public int hashCode() {
        return C2593Bt1.b(this.X, g(), f(), i(), h());
    }

    @MB
    public T i() {
        return this.a1;
    }

    public boolean j() {
        return this.Y;
    }

    public boolean k() {
        return this.Z0;
    }

    public GC0<T> l(GC0<T> gc0) {
        int compare;
        int compare2;
        T t;
        int compare3;
        EnumC6886hp enumC6886hp;
        C10664xF1.E(gc0);
        C10664xF1.d(this.X.equals(gc0.X));
        boolean z = this.Y;
        T g = g();
        EnumC6886hp f = f();
        if (!j()) {
            z = gc0.Y;
            g = gc0.g();
            f = gc0.f();
        } else if (gc0.j() && ((compare = this.X.compare(g(), gc0.g())) < 0 || (compare == 0 && gc0.f() == EnumC6886hp.OPEN))) {
            g = gc0.g();
            f = gc0.f();
        }
        boolean z2 = z;
        boolean z3 = this.Z0;
        T i = i();
        EnumC6886hp h = h();
        if (!k()) {
            z3 = gc0.Z0;
            i = gc0.i();
            h = gc0.h();
        } else if (gc0.k() && ((compare2 = this.X.compare(i(), gc0.i())) > 0 || (compare2 == 0 && gc0.h() == EnumC6886hp.OPEN))) {
            i = gc0.i();
            h = gc0.h();
        }
        boolean z4 = z3;
        T t2 = i;
        if (z2 && z4 && ((compare3 = this.X.compare(g, t2)) > 0 || (compare3 == 0 && f == (enumC6886hp = EnumC6886hp.OPEN) && h == enumC6886hp))) {
            f = EnumC6886hp.OPEN;
            h = EnumC6886hp.CLOSED;
            t = t2;
        } else {
            t = g;
        }
        return new GC0<>(this.X, z2, t, f, z4, t2, h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean m() {
        if (!k() || !q(C2491As1.a(i()))) {
            if (j() && p(C2491As1.a(g()))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public GC0<T> o() {
        GC0<T> gc0 = this.c1;
        if (gc0 == null) {
            GC0<T> gc02 = new GC0<>(AbstractC10587ww1.h(this.X).E(), this.Z0, i(), h(), this.Y, g(), f());
            gc02.c1 = this;
            this.c1 = gc02;
            return gc02;
        }
        return gc0;
    }

    public boolean p(@InterfaceC7894ly1 T t) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (!k()) {
            return false;
        }
        int compare = this.X.compare(t, C2491As1.a(i()));
        if (compare > 0) {
            z = true;
        } else {
            z = false;
        }
        if (compare == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (h() == EnumC6886hp.OPEN) {
            z3 = true;
        }
        return (z2 & z3) | z;
    }

    public boolean q(@InterfaceC7894ly1 T t) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (!j()) {
            return false;
        }
        int compare = this.X.compare(t, C2491As1.a(g()));
        if (compare < 0) {
            z = true;
        } else {
            z = false;
        }
        if (compare == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (f() == EnumC6886hp.OPEN) {
            z3 = true;
        }
        return (z2 & z3) | z;
    }

    public String toString() {
        char c;
        Object obj;
        Object obj2;
        char c2;
        String valueOf = String.valueOf(this.X);
        EnumC6886hp enumC6886hp = this.Y0;
        EnumC6886hp enumC6886hp2 = EnumC6886hp.CLOSED;
        if (enumC6886hp == enumC6886hp2) {
            c = '[';
        } else {
            c = '(';
        }
        if (this.Y) {
            obj = this.Z;
        } else {
            obj = "-∞";
        }
        String valueOf2 = String.valueOf(obj);
        if (this.Z0) {
            obj2 = this.a1;
        } else {
            obj2 = "∞";
        }
        String valueOf3 = String.valueOf(obj2);
        if (this.b1 == enumC6886hp2) {
            c2 = ']';
        } else {
            c2 = ')';
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + 4 + valueOf2.length() + valueOf3.length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(c);
        sb.append(valueOf2);
        sb.append(',');
        sb.append(valueOf3);
        sb.append(c2);
        return sb.toString();
    }
}
