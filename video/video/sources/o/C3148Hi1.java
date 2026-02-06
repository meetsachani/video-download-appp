package o;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@NN0
@InterfaceC7311ja0
/* renamed from: o.Hi1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3148Hi1 extends T0 implements Serializable {
    public final MessageDigest X;
    public final int Y;
    public final String Y0;
    public final boolean Z;

    /* renamed from: o.Hi1$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC5462c0 {
        public final MessageDigest b;
        public final int c;
        public boolean d;

        private void u() {
            C10664xF1.h0(!this.d, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // o.CG0
        public AbstractC8471oG0 o() {
            u();
            this.d = true;
            if (this.c == this.b.getDigestLength()) {
                return AbstractC8471oG0.h(this.b.digest());
            }
            return AbstractC8471oG0.h(Arrays.copyOf(this.b.digest(), this.c));
        }

        @Override // o.AbstractC5462c0
        public void q(byte b) {
            u();
            this.b.update(b);
        }

        @Override // o.AbstractC5462c0
        public void r(ByteBuffer byteBuffer) {
            u();
            this.b.update(byteBuffer);
        }

        @Override // o.AbstractC5462c0
        public void t(byte[] bArr, int i, int i2) {
            u();
            this.b.update(bArr, i, i2);
        }

        public b(MessageDigest messageDigest, int i) {
            this.b = messageDigest;
            this.c = i;
        }
    }

    /* renamed from: o.Hi1$c */
    /* loaded from: classes3.dex */
    public static final class c implements Serializable {
        private static final long serialVersionUID = 0;
        public final String X;
        public final int Y;
        public final String Z;

        private Object readResolve() {
            return new C3148Hi1(this.X, this.Y, this.Z);
        }

        public c(String str, int i, String str2) {
            this.X = str;
            this.Y = i;
            this.Z = str2;
        }
    }

    public C3148Hi1(String str, String str2) {
        MessageDigest l = l(str);
        this.X = l;
        this.Y = l.getDigestLength();
        this.Y0 = (String) C10664xF1.E(str2);
        this.Z = m(l);
    }

    public static MessageDigest l(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static boolean m(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // o.InterfaceC9449sG0
    public int d() {
        return this.Y * 8;
    }

    @Override // o.InterfaceC9449sG0
    public CG0 g() {
        if (this.Z) {
            try {
                return new b((MessageDigest) this.X.clone(), this.Y);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new b(l(this.X.getAlgorithm()), this.Y);
    }

    public String toString() {
        return this.Y0;
    }

    public Object writeReplace() {
        return new c(this.X.getAlgorithm(), this.Y, this.Y0);
    }

    public C3148Hi1(String str, int i, String str2) {
        this.Y0 = (String) C10664xF1.E(str2);
        MessageDigest l = l(str);
        this.X = l;
        int digestLength = l.getDigestLength();
        C10664xF1.m(i >= 4 && i <= digestLength, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.Y = i;
        this.Z = m(l);
    }
}
