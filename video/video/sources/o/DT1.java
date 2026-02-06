package o;

import o.InterfaceC4747Xs;

/* loaded from: classes.dex */
public class DT1<T> {
    public final T a;
    public final InterfaceC4747Xs.a b;
    public final C6524gJ2 c;
    public boolean d;

    /* loaded from: classes.dex */
    public interface a {
        void a(C6524gJ2 c6524gJ2);
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void b(T t);
    }

    public DT1(T t, InterfaceC4747Xs.a aVar) {
        this.d = false;
        this.a = t;
        this.b = aVar;
        this.c = null;
    }

    public static <T> DT1<T> a(C6524gJ2 c6524gJ2) {
        return new DT1<>(c6524gJ2);
    }

    public static <T> DT1<T> c(T t, InterfaceC4747Xs.a aVar) {
        return new DT1<>(t, aVar);
    }

    public boolean b() {
        if (this.c == null) {
            return true;
        }
        return false;
    }

    public DT1(C6524gJ2 c6524gJ2) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = c6524gJ2;
    }
}
