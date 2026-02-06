package o;

import java.security.MessageDigest;

/* renamed from: o.lt1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7874lt1 implements InterfaceC6575gX0 {
    public final Object c;

    public C7874lt1(Object obj) {
        this.c = C10175vF1.e(obj);
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.c.toString().getBytes(InterfaceC6575gX0.b));
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (obj instanceof C7874lt1) {
            return this.c.equals(((C7874lt1) obj).c);
        }
        return false;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.c + '}';
    }
}
