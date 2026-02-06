package o;

import java.util.Iterator;

/* renamed from: o.Ba2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2518Ba2 {

    /* renamed from: o.Ba2$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8515oR0 {
        public int X;
        public final /* synthetic */ C10986ya2<T> Y;

        public a(C10986ya2<T> c10986ya2) {
            this.Y = c10986ya2;
        }

        public final int b() {
            return this.X;
        }

        public final void c(int i) {
            this.X = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < this.Y.y()) {
                return true;
            }
            return false;
        }

        @Override // o.AbstractC8515oR0
        public int nextInt() {
            C10986ya2<T> c10986ya2 = this.Y;
            int i = this.X;
            this.X = i + 1;
            return c10986ya2.n(i);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.Ba2$b */
    /* loaded from: classes.dex */
    public static final class b<T> implements Iterator<T>, GW0 {
        public int X;
        public final /* synthetic */ C10986ya2<T> Y;

        public b(C10986ya2<T> c10986ya2) {
            this.Y = c10986ya2;
        }

        public final int b() {
            return this.X;
        }

        public final void c(int i) {
            this.X = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X < this.Y.y()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            C10986ya2<T> c10986ya2 = this.Y;
            int i = this.X;
            this.X = i + 1;
            return c10986ya2.z(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(C10986ya2<T> c10986ya2, int i) {
        C6562gT0.p(c10986ya2, "<this>");
        return c10986ya2.e(i);
    }

    public static final <T> void b(C10986ya2<T> c10986ya2, VA0<? super Integer, ? super T, C7458kA2> va0) {
        C6562gT0.p(c10986ya2, "<this>");
        C6562gT0.p(va0, "action");
        int y = c10986ya2.y();
        for (int i = 0; i < y; i++) {
            va0.i(Integer.valueOf(c10986ya2.n(i)), c10986ya2.z(i));
        }
    }

    public static final <T> T c(C10986ya2<T> c10986ya2, int i, T t) {
        C6562gT0.p(c10986ya2, "<this>");
        return c10986ya2.i(i, t);
    }

    public static final <T> T d(C10986ya2<T> c10986ya2, int i, FA0<? extends T> fa0) {
        C6562gT0.p(c10986ya2, "<this>");
        C6562gT0.p(fa0, "defaultValue");
        T h = c10986ya2.h(i);
        if (h == null) {
            return fa0.invoke();
        }
        return h;
    }

    public static final <T> int e(C10986ya2<T> c10986ya2) {
        C6562gT0.p(c10986ya2, "<this>");
        return c10986ya2.y();
    }

    public static final <T> boolean f(C10986ya2<T> c10986ya2) {
        C6562gT0.p(c10986ya2, "<this>");
        return !c10986ya2.m();
    }

    public static final <T> AbstractC8515oR0 g(C10986ya2<T> c10986ya2) {
        C6562gT0.p(c10986ya2, "<this>");
        return new a(c10986ya2);
    }

    public static final <T> C10986ya2<T> h(C10986ya2<T> c10986ya2, C10986ya2<T> c10986ya22) {
        C6562gT0.p(c10986ya2, "<this>");
        C6562gT0.p(c10986ya22, "other");
        C10986ya2<T> c10986ya23 = new C10986ya2<>(c10986ya2.y() + c10986ya22.y());
        c10986ya23.p(c10986ya2);
        c10986ya23.p(c10986ya22);
        return c10986ya23;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean i(C10986ya2 c10986ya2, int i, Object obj) {
        C6562gT0.p(c10986ya2, "<this>");
        return c10986ya2.s(i, obj);
    }

    public static final <T> void j(C10986ya2<T> c10986ya2, int i, T t) {
        C6562gT0.p(c10986ya2, "<this>");
        c10986ya2.o(i, t);
    }

    public static final <T> Iterator<T> k(C10986ya2<T> c10986ya2) {
        C6562gT0.p(c10986ya2, "<this>");
        return new b(c10986ya2);
    }
}
