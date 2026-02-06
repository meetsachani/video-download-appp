package o;

import java.security.MessageDigest;

/* renamed from: o.qU  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9012qU implements InterfaceC6575gX0 {
    public final InterfaceC6575gX0 c;
    public final InterfaceC6575gX0 d;

    public C9012qU(InterfaceC6575gX0 interfaceC6575gX0, InterfaceC6575gX0 interfaceC6575gX02) {
        this.c = interfaceC6575gX0;
        this.d = interfaceC6575gX02;
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        this.c.b(messageDigest);
        this.d.b(messageDigest);
    }

    public InterfaceC6575gX0 c() {
        return this.c;
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (obj instanceof C9012qU) {
            C9012qU c9012qU = (C9012qU) obj;
            if (this.c.equals(c9012qU.c) && this.d.equals(c9012qU.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.c + ", signature=" + this.d + '}';
    }
}
