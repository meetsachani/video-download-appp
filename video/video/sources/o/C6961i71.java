package o;

import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

@NN0
@InterfaceC7311ja0
/* renamed from: o.i71  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6961i71 extends T0 {
    public final Mac X;
    public final Key Y;
    public final int Y0;
    public final String Z;
    public final boolean Z0;

    /* renamed from: o.i71$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC5462c0 {
        public final Mac b;
        public boolean c;

        @Override // o.CG0
        public AbstractC8471oG0 o() {
            u();
            this.c = true;
            return AbstractC8471oG0.h(this.b.doFinal());
        }

        @Override // o.AbstractC5462c0
        public void q(byte b) {
            u();
            this.b.update(b);
        }

        @Override // o.AbstractC5462c0
        public void r(ByteBuffer byteBuffer) {
            u();
            C10664xF1.E(byteBuffer);
            this.b.update(byteBuffer);
        }

        @Override // o.AbstractC5462c0
        public void s(byte[] bArr) {
            u();
            this.b.update(bArr);
        }

        @Override // o.AbstractC5462c0
        public void t(byte[] bArr, int i, int i2) {
            u();
            this.b.update(bArr, i, i2);
        }

        public final void u() {
            C10664xF1.h0(!this.c, "Cannot re-use a Hasher after calling hash() on it");
        }

        public b(Mac mac) {
            this.b = mac;
        }
    }

    public C6961i71(String str, Key key, String str2) {
        Mac l = l(str, key);
        this.X = l;
        this.Y = (Key) C10664xF1.E(key);
        this.Z = (String) C10664xF1.E(str2);
        this.Y0 = l.getMacLength() * 8;
        this.Z0 = m(l);
    }

    public static Mac l(String str, Key key) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(key);
            return mac;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static boolean m(Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // o.InterfaceC9449sG0
    public int d() {
        return this.Y0;
    }

    @Override // o.InterfaceC9449sG0
    public CG0 g() {
        if (this.Z0) {
            try {
                return new b((Mac) this.X.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new b(l(this.X.getAlgorithm(), this.Y));
    }

    public String toString() {
        return this.Z;
    }
}
