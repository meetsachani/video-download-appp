package o;

import java.io.Serializable;
import java.nio.ByteBuffer;

@NN0
@InterfaceC7311ja0
/* loaded from: classes3.dex */
public final class K82 extends T0 implements Serializable {
    public static final InterfaceC9449sG0 Z0 = new K82(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;
    public final int X;
    public final int Y;
    public final long Y0;
    public final long Z;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9639t3 {
        public static final int l = 8;
        public final int d;
        public final int e;
        public long f;
        public long g;
        public long h;
        public long i;
        public long j;
        public long k;

        public a(int i, int i2, long j, long j2) {
            super(8);
            this.j = 0L;
            this.k = 0L;
            this.d = i;
            this.e = i2;
            this.f = 8317987319222330741L ^ j;
            this.g = 7237128888997146477L ^ j2;
            this.h = 7816392313619706465L ^ j;
            this.i = 8387220255154660723L ^ j2;
        }

        @Override // o.AbstractC9639t3
        public AbstractC8471oG0 p() {
            long j = this.k ^ (this.j << 56);
            this.k = j;
            v(j);
            this.h ^= 255;
            w(this.e);
            return AbstractC8471oG0.j(((this.f ^ this.g) ^ this.h) ^ this.i);
        }

        @Override // o.AbstractC9639t3
        public void s(ByteBuffer byteBuffer) {
            this.j += 8;
            v(byteBuffer.getLong());
        }

        @Override // o.AbstractC9639t3
        public void t(ByteBuffer byteBuffer) {
            this.j += byteBuffer.remaining();
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                this.k ^= (byteBuffer.get() & 255) << i;
                i += 8;
            }
        }

        public final void v(long j) {
            this.i ^= j;
            w(this.d);
            this.f = j ^ this.f;
        }

        public final void w(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                long j = this.f;
                long j2 = this.g;
                this.f = j + j2;
                this.h += this.i;
                this.g = Long.rotateLeft(j2, 13);
                long rotateLeft = Long.rotateLeft(this.i, 16);
                long j3 = this.g;
                long j4 = this.f;
                this.g = j3 ^ j4;
                this.i = rotateLeft ^ this.h;
                long rotateLeft2 = Long.rotateLeft(j4, 32);
                long j5 = this.h;
                long j6 = this.g;
                this.h = j5 + j6;
                this.f = rotateLeft2 + this.i;
                this.g = Long.rotateLeft(j6, 17);
                long rotateLeft3 = Long.rotateLeft(this.i, 21);
                long j7 = this.g;
                long j8 = this.h;
                this.g = j7 ^ j8;
                this.i = rotateLeft3 ^ this.f;
                this.h = Long.rotateLeft(j8, 32);
            }
        }
    }

    public K82(int i, int i2, long j, long j2) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "The number of SipRound iterations (c=%s) during Compression must be positive.", i);
        C10664xF1.k(i2 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i2);
        this.X = i;
        this.Y = i2;
        this.Z = j;
        this.Y0 = j2;
    }

    @Override // o.InterfaceC9449sG0
    public int d() {
        return 64;
    }

    public boolean equals(@MB Object obj) {
        if (obj instanceof K82) {
            K82 k82 = (K82) obj;
            if (this.X == k82.X && this.Y == k82.Y && this.Z == k82.Z && this.Y0 == k82.Y0) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC9449sG0
    public CG0 g() {
        return new a(this.X, this.Y, this.Z, this.Y0);
    }

    public int hashCode() {
        return (int) ((((K82.class.hashCode() ^ this.X) ^ this.Y) ^ this.Z) ^ this.Y0);
    }

    public String toString() {
        int i = this.X;
        int i2 = this.Y;
        long j = this.Z;
        long j2 = this.Y0;
        StringBuilder sb = new StringBuilder(81);
        sb.append("Hashing.sipHash");
        sb.append(i);
        sb.append(i2);
        sb.append(C9811tl1.c);
        sb.append(j);
        sb.append(C6566gU0.h);
        sb.append(j2);
        sb.append(C9811tl1.d);
        return sb.toString();
    }
}
