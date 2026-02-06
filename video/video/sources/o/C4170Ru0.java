package o;

import android.util.SparseBooleanArray;

@Deprecated
/* renamed from: o.Ru0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4170Ru0 {
    public final SparseBooleanArray a;

    /* renamed from: o.Ru0$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final SparseBooleanArray a = new SparseBooleanArray();
        public boolean b;

        @InterfaceC6181ey
        public b a(int i) {
            C9542sf.i(!this.b);
            this.a.append(i, true);
            return this;
        }

        @InterfaceC6181ey
        public b b(C4170Ru0 c4170Ru0) {
            for (int i = 0; i < c4170Ru0.d(); i++) {
                a(c4170Ru0.c(i));
            }
            return this;
        }

        @InterfaceC6181ey
        public b c(int... iArr) {
            for (int i : iArr) {
                a(i);
            }
            return this;
        }

        @InterfaceC6181ey
        public b d(int i, boolean z) {
            if (z) {
                return a(i);
            }
            return this;
        }

        public C4170Ru0 e() {
            C9542sf.i(!this.b);
            this.b = true;
            return new C4170Ru0(this.a);
        }

        @InterfaceC6181ey
        public b f(int i) {
            C9542sf.i(!this.b);
            this.a.delete(i);
            return this;
        }

        @InterfaceC6181ey
        public b g(int... iArr) {
            for (int i : iArr) {
                f(i);
            }
            return this;
        }

        @InterfaceC6181ey
        public b h(int i, boolean z) {
            if (z) {
                return f(i);
            }
            return this;
        }
    }

    public boolean a(int i) {
        return this.a.get(i);
    }

    public boolean b(int... iArr) {
        for (int i : iArr) {
            if (a(i)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i) {
        C9542sf.c(i, 0, d());
        return this.a.keyAt(i);
    }

    public int d() {
        return this.a.size();
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4170Ru0)) {
            return false;
        }
        C4170Ru0 c4170Ru0 = (C4170Ru0) obj;
        if (TD2.a < 24) {
            if (d() != c4170Ru0.d()) {
                return false;
            }
            for (int i = 0; i < d(); i++) {
                if (c(i) != c4170Ru0.c(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.a.equals(c4170Ru0.a);
    }

    public int hashCode() {
        if (TD2.a < 24) {
            int d = d();
            for (int i = 0; i < d(); i++) {
                d = (d * 31) + c(i);
            }
            return d;
        }
        return this.a.hashCode();
    }

    public C4170Ru0(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }
}
