package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import o.FE1;

/* renamed from: o.ek0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6126ek0 {
    public static final String a = "FactoryPools";
    public static final int b = 20;
    public static final g<Object> c = new a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.ek0$b */
    /* loaded from: classes.dex */
    public class b<T> implements d<List<T>> {
        @Override // o.C6126ek0.d
        /* renamed from: b */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.ek0$c */
    /* loaded from: classes.dex */
    public class c<T> implements g<List<T>> {
        @Override // o.C6126ek0.g
        /* renamed from: b */
        public void a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: o.ek0$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    /* renamed from: o.ek0$e */
    /* loaded from: classes.dex */
    public static final class e<T> implements FE1.a<T> {
        public final d<T> a;
        public final g<T> b;
        public final FE1.a<T> c;

        public e(FE1.a<T> aVar, d<T> dVar, g<T> gVar) {
            this.c = aVar;
            this.a = dVar;
            this.b = gVar;
        }

        @Override // o.FE1.a
        public T a() {
            T a = this.c.a();
            if (a == null) {
                a = this.a.a();
                if (Log.isLoggable(C6126ek0.a, 2)) {
                    Log.v(C6126ek0.a, "Created new " + a.getClass());
                }
            }
            if (a instanceof f) {
                ((f) a).e().b(false);
            }
            return a;
        }

        @Override // o.FE1.a
        public boolean b(T t) {
            if (t instanceof f) {
                ((f) t).e().b(true);
            }
            this.b.a(t);
            return this.c.b(t);
        }
    }

    /* renamed from: o.ek0$f */
    /* loaded from: classes.dex */
    public interface f {
        AbstractC2428Ac2 e();
    }

    /* renamed from: o.ek0$g */
    /* loaded from: classes.dex */
    public interface g<T> {
        void a(T t);
    }

    public static <T extends f> FE1.a<T> a(FE1.a<T> aVar, d<T> dVar) {
        return b(aVar, dVar, c());
    }

    public static <T> FE1.a<T> b(FE1.a<T> aVar, d<T> dVar, g<T> gVar) {
        return new e(aVar, dVar, gVar);
    }

    public static <T> g<T> c() {
        return (g<T>) c;
    }

    public static <T extends f> FE1.a<T> d(int i, d<T> dVar) {
        return a(new FE1.b(i), dVar);
    }

    public static <T extends f> FE1.a<T> e(int i, d<T> dVar) {
        return a(new FE1.c(i), dVar);
    }

    public static <T extends f> FE1.a<T> f(int i, d<T> dVar, g<T> gVar) {
        return b(new FE1.c(i), dVar, gVar);
    }

    public static <T> FE1.a<List<T>> g() {
        return h(20);
    }

    public static <T> FE1.a<List<T>> h(int i) {
        return b(new FE1.c(i), new b(), new c());
    }

    /* renamed from: o.ek0$a */
    /* loaded from: classes.dex */
    public class a implements g<Object> {
        @Override // o.C6126ek0.g
        public void a(Object obj) {
        }
    }
}
