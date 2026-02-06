package o;

import java.util.Arrays;

/* renamed from: o.yb0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10988yb0 {
    public final C3123Hc0 a;
    public final byte[] b;

    public C10988yb0(@InterfaceC5670cr1 C3123Hc0 c3123Hc0, @InterfaceC5670cr1 byte[] bArr) {
        if (c3123Hc0 != null) {
            if (bArr != null) {
                this.a = c3123Hc0;
                this.b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public byte[] a() {
        return this.b;
    }

    public C3123Hc0 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10988yb0)) {
            return false;
        }
        C10988yb0 c10988yb0 = (C10988yb0) obj;
        if (!this.a.equals(c10988yb0.a)) {
            return false;
        }
        return Arrays.equals(this.b, c10988yb0.b);
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
