package o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC7542kW0
@InterfaceC6480g82(version = "1.3")
/* loaded from: classes3.dex */
public final class PT1<T> implements Serializable {
    @NotNull
    public static final a Y = new a(null);
    @Nullable
    public final Object X;

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @XP0
        @InterfaceC8046mW0(name = com.facebook.login.C.L)
        public final <T> Object a(Throwable th) {
            C6562gT0.p(th, "exception");
            return PT1.b(RT1.a(th));
        }

        @XP0
        @InterfaceC8046mW0(name = "success")
        public final <T> Object b(T t) {
            return PT1.b(t);
        }

        public a() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Serializable {
        @InterfaceC7058iW0
        @NotNull
        public final Throwable X;

        public b(@NotNull Throwable th) {
            C6562gT0.p(th, "exception");
            this.X = th;
        }

        public boolean equals(@Nullable Object obj) {
            if ((obj instanceof b) && C6562gT0.g(this.X, ((b) obj).X)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.X.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(" + this.X + ')';
        }
    }

    @HK1
    public /* synthetic */ PT1(Object obj) {
        this.X = obj;
    }

    public static final /* synthetic */ PT1 a(Object obj) {
        return new PT1(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        if (!(obj2 instanceof PT1) || !C6562gT0.g(obj, ((PT1) obj2).l())) {
            return false;
        }
        return true;
    }

    public static final boolean d(Object obj, Object obj2) {
        return C6562gT0.g(obj, obj2);
    }

    @Nullable
    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).X;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    public static final T f(Object obj) {
        if (i(obj)) {
            return null;
        }
        return obj;
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean i(Object obj) {
        return obj instanceof b;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof b);
    }

    @NotNull
    public static String k(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.X, obj);
    }

    public int hashCode() {
        return h(this.X);
    }

    public final /* synthetic */ Object l() {
        return this.X;
    }

    @NotNull
    public String toString() {
        return k(this.X);
    }

    @HK1
    public static /* synthetic */ void g() {
    }

    @HK1
    @NotNull
    public static <T> Object b(@Nullable Object obj) {
        return obj;
    }
}
