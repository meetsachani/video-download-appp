package o;

import com.facebook.internal.C2356a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC7542kW0
/* renamed from: o.xA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10642xA<T> {
    @NotNull
    public static final b b = new b(null);
    @NotNull
    public static final c c = new c();
    @Nullable
    public final Object a;

    /* renamed from: o.xA$a */
    /* loaded from: classes3.dex */
    public static final class a extends c {
        @InterfaceC7058iW0
        @Nullable
        public final Throwable a;

        public a(@Nullable Throwable th) {
            this.a = th;
        }

        public boolean equals(@Nullable Object obj) {
            if ((obj instanceof a) && C6562gT0.g(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // o.C10642xA.c
        @NotNull
        public String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    @InterfaceC10472wS0
    /* renamed from: o.xA$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC10472wS0
        @NotNull
        public final <E> Object a(@Nullable Throwable th) {
            return C10642xA.c(new a(th));
        }

        @InterfaceC10472wS0
        @NotNull
        public final <E> Object b() {
            return C10642xA.c(C10642xA.c);
        }

        @InterfaceC10472wS0
        @NotNull
        public final <E> Object c(E e) {
            return C10642xA.c(e);
        }

        public b() {
        }
    }

    /* renamed from: o.xA$c */
    /* loaded from: classes3.dex */
    public static class c {
        @NotNull
        public String toString() {
            return C2356a.v;
        }
    }

    @HK1
    public /* synthetic */ C10642xA(Object obj) {
        this.a = obj;
    }

    public static final /* synthetic */ C10642xA b(Object obj) {
        return new C10642xA(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        if (!(obj2 instanceof C10642xA) || !C6562gT0.g(obj, ((C10642xA) obj2).o())) {
            return false;
        }
        return true;
    }

    public static final boolean e(Object obj, Object obj2) {
        return C6562gT0.g(obj, obj2);
    }

    @Nullable
    public static final Throwable f(Object obj) {
        a aVar;
        if (obj instanceof a) {
            aVar = (a) obj;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final T h(Object obj) {
        if (!(obj instanceof c)) {
            return obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T i(Object obj) {
        Throwable th;
        if (!(obj instanceof c)) {
            return obj;
        }
        if ((obj instanceof a) && (th = ((a) obj).a) != null) {
            throw th;
        }
        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    public static int j(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean k(Object obj) {
        return obj instanceof a;
    }

    public static final boolean l(Object obj) {
        return obj instanceof c;
    }

    public static final boolean m(Object obj) {
        return !(obj instanceof c);
    }

    @NotNull
    public static String n(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ Object o() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return n(this.a);
    }

    @HK1
    public static /* synthetic */ void g() {
    }

    @HK1
    @NotNull
    public static <T> Object c(@Nullable Object obj) {
        return obj;
    }
}
