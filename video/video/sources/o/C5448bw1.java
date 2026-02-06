package o;

import java.security.MessageDigest;

/* renamed from: o.bw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5448bw1 implements InterfaceC6575gX0 {
    public final C2531Be<C4274Sv1<?>, Object> c = new C9598st();

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void g(C4274Sv1<T> c4274Sv1, Object obj, MessageDigest messageDigest) {
        c4274Sv1.h(obj, messageDigest);
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        for (int i = 0; i < this.c.size(); i++) {
            g(this.c.g(i), this.c.l(i), messageDigest);
        }
    }

    public <T> T c(C4274Sv1<T> c4274Sv1) {
        if (this.c.containsKey(c4274Sv1)) {
            return (T) this.c.get(c4274Sv1);
        }
        return c4274Sv1.d();
    }

    public void d(C5448bw1 c5448bw1) {
        this.c.i(c5448bw1.c);
    }

    public C5448bw1 e(C4274Sv1<?> c4274Sv1) {
        this.c.remove(c4274Sv1);
        return this;
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (obj instanceof C5448bw1) {
            return this.c.equals(((C5448bw1) obj).c);
        }
        return false;
    }

    public <T> C5448bw1 f(C4274Sv1<T> c4274Sv1, T t) {
        this.c.put(c4274Sv1, t);
        return this;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.c + '}';
    }
}
