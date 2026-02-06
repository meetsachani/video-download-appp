package o;

import o.Y71;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class IS0 {

    /* loaded from: classes3.dex */
    public static class b {
        public final Y71 a;
        public boolean b;

        public <E> HS0<E> a() {
            if (!this.b) {
                this.a.l();
            }
            return new d(this.a);
        }

        public b b(int i) {
            this.a.a(i);
            return this;
        }

        public b c() {
            this.b = true;
            return this;
        }

        @InterfaceC11149zF0("java.lang.ref.WeakReference")
        public b d() {
            this.b = false;
            return this;
        }

        public b() {
            this.a = new Y71();
            this.b = true;
        }
    }

    /* loaded from: classes3.dex */
    public static class c<E> implements YA0<E, E> {
        public final HS0<E> X;

        public c(HS0<E> hs0) {
            this.X = hs0;
        }

        @Override // o.YA0
        public E apply(E e) {
            return this.X.a(e);
        }

        @Override // o.YA0
        public boolean equals(@MB Object obj) {
            if (obj instanceof c) {
                return this.X.equals(((c) obj).X);
            }
            return false;
        }

        public int hashCode() {
            return this.X.hashCode();
        }
    }

    @InterfaceC5299bJ2
    /* loaded from: classes3.dex */
    public static final class d<E> implements HS0<E> {
        @InterfaceC5299bJ2
        public final Z71<E, Y71.a, ?, ?> a;

        /* JADX WARN: Type inference failed for: r0v1, types: [o.Z71$j] */
        @Override // o.HS0
        public E a(E e) {
            E e2;
            do {
                ?? f = this.a.f(e);
                if (f != 0 && (e2 = (E) f.getKey()) != null) {
                    return e2;
                }
            } while (this.a.putIfAbsent(e, Y71.a.VALUE) != null);
            return e;
        }

        public d(Y71 y71) {
            this.a = Z71.e(y71.h(AbstractC6843he0.c()));
        }
    }

    public static <E> YA0<E, E> a(HS0<E> hs0) {
        return new c((HS0) C10664xF1.E(hs0));
    }

    public static b b() {
        return new b();
    }

    public static <E> HS0<E> c() {
        return b().c().a();
    }

    @InterfaceC11149zF0("java.lang.ref.WeakReference")
    public static <E> HS0<E> d() {
        return b().d().a();
    }
}
