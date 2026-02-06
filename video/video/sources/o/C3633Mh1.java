package o;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: o.Mh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3633Mh1 implements InterfaceC6575gX0 {
    public final String c;
    public final long d;
    public final int e;

    public C3633Mh1(String str, long j, int i) {
        this.c = str == null ? "" : str;
        this.d = j;
        this.e = i;
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.d).putInt(this.e).array());
        messageDigest.update(this.c.getBytes(InterfaceC6575gX0.b));
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3633Mh1 c3633Mh1 = (C3633Mh1) obj;
        if (this.d == c3633Mh1.d && this.e == c3633Mh1.e && this.c.equals(c3633Mh1.c)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        long j = this.d;
        return (((this.c.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.e;
    }
}
