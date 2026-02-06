package o;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: o.gT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6563gT1 implements InterfaceC6575gX0 {
    public static final X61<Class<?>, byte[]> k = new X61<>(50);
    public final InterfaceC2727De c;
    public final InterfaceC6575gX0 d;
    public final InterfaceC6575gX0 e;
    public final int f;
    public final int g;
    public final Class<?> h;
    public final C5448bw1 i;
    public final InterfaceC5675cs2<?> j;

    public C6563gT1(InterfaceC2727De interfaceC2727De, InterfaceC6575gX0 interfaceC6575gX0, InterfaceC6575gX0 interfaceC6575gX02, int i, int i2, InterfaceC5675cs2<?> interfaceC5675cs2, Class<?> cls, C5448bw1 c5448bw1) {
        this.c = interfaceC2727De;
        this.d = interfaceC6575gX0;
        this.e = interfaceC6575gX02;
        this.f = i;
        this.g = i2;
        this.j = interfaceC5675cs2;
        this.h = cls;
        this.i = c5448bw1;
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.c.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f).putInt(this.g).array();
        this.e.b(messageDigest);
        this.d.b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC5675cs2<?> interfaceC5675cs2 = this.j;
        if (interfaceC5675cs2 != null) {
            interfaceC5675cs2.b(messageDigest);
        }
        this.i.b(messageDigest);
        messageDigest.update(c());
        this.c.put(bArr);
    }

    public final byte[] c() {
        X61<Class<?>, byte[]> x61 = k;
        byte[] k2 = x61.k(this.h);
        if (k2 == null) {
            byte[] bytes = this.h.getName().getBytes(InterfaceC6575gX0.b);
            x61.o(this.h, bytes);
            return bytes;
        }
        return k2;
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (obj instanceof C6563gT1) {
            C6563gT1 c6563gT1 = (C6563gT1) obj;
            if (this.g == c6563gT1.g && this.f == c6563gT1.f && SD2.e(this.j, c6563gT1.j) && this.h.equals(c6563gT1.h) && this.d.equals(c6563gT1.d) && this.e.equals(c6563gT1.e) && this.i.equals(c6563gT1.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        int hashCode = (((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g;
        InterfaceC5675cs2<?> interfaceC5675cs2 = this.j;
        if (interfaceC5675cs2 != null) {
            hashCode = (hashCode * 31) + interfaceC5675cs2.hashCode();
        }
        return (((hashCode * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.d + ", signature=" + this.e + ", width=" + this.f + ", height=" + this.g + ", decodedResourceClass=" + this.h + ", transformation='" + this.j + "', options=" + this.i + '}';
    }
}
