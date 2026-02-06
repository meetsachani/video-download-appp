package o;

import java.security.MessageDigest;

/* renamed from: o.Sv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4274Sv1<T> {
    public static final b<Object> e = new a();
    public final T a;
    public final b<T> b;
    public final String c;
    public volatile byte[] d;

    /* renamed from: o.Sv1$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public C4274Sv1(String str, T t, b<T> bVar) {
        this.c = C10175vF1.c(str);
        this.a = t;
        this.b = (b) C10175vF1.e(bVar);
    }

    public static <T> C4274Sv1<T> a(String str, T t, b<T> bVar) {
        return new C4274Sv1<>(str, t, bVar);
    }

    public static <T> C4274Sv1<T> b(String str, b<T> bVar) {
        return new C4274Sv1<>(str, null, bVar);
    }

    public static <T> b<T> c() {
        return (b<T>) e;
    }

    public static <T> C4274Sv1<T> f(String str) {
        return new C4274Sv1<>(str, null, c());
    }

    public static <T> C4274Sv1<T> g(String str, T t) {
        return new C4274Sv1<>(str, t, c());
    }

    public T d() {
        return this.a;
    }

    public final byte[] e() {
        if (this.d == null) {
            this.d = this.c.getBytes(InterfaceC6575gX0.b);
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4274Sv1) {
            return this.c.equals(((C4274Sv1) obj).c);
        }
        return false;
    }

    public void h(T t, MessageDigest messageDigest) {
        this.b.a(e(), t, messageDigest);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.c + "'}";
    }

    /* renamed from: o.Sv1$a */
    /* loaded from: classes.dex */
    public class a implements b<Object> {
        @Override // o.C4274Sv1.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
