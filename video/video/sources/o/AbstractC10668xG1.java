package o;

import java.util.Map;

/* renamed from: o.xG1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10668xG1 {

    /* renamed from: o.xG1$a */
    /* loaded from: classes.dex */
    public static final class a<T> {
        public final String a;

        public a(String str) {
            C6562gT0.p(str, "name");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public final b<T> b(T t) {
            return new b<>(this, t);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return C6562gT0.g(this.a, ((a) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return this.a;
        }
    }

    /* renamed from: o.xG1$b */
    /* loaded from: classes.dex */
    public static final class b<T> {
        public final a<T> a;
        public final T b;

        public b(a<T> aVar, T t) {
            C6562gT0.p(aVar, "key");
            this.a = aVar;
            this.b = t;
        }

        public final a<T> a() {
            return this.a;
        }

        public final T b() {
            return this.b;
        }
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> boolean b(a<T> aVar);

    public abstract <T> T c(a<T> aVar);

    public final C2972Fn1 d() {
        return new C2972Fn1(C8926q81.J0(a()), false);
    }

    public final AbstractC10668xG1 e() {
        return new C2972Fn1(C8926q81.J0(a()), true);
    }
}
