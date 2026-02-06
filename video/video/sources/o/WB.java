package o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import o.AbstractC8244nK1;

/* loaded from: classes4.dex */
public final class WB extends JQ {
    public final long Y0;
    public final long Z0;

    /* loaded from: classes4.dex */
    public static class b extends AbstractC8244nK1.a<WB, b> {
        public Checksum m;
        public long n = -1;

        /* renamed from: o  reason: collision with root package name */
        public long f653o;

        @Override // o.AbstractC8244nK1.a
        public /* bridge */ /* synthetic */ XJ0 j0() {
            return super.j0();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.WB$b, o.s3] */
        @Override // o.AbstractC8244nK1.a
        public /* bridge */ /* synthetic */ b k0(XJ0 xj0) {
            return super.k0(xj0);
        }

        @Override // o.XK0
        /* renamed from: o0 */
        public WB get() throws IOException {
            return new WB(this);
        }

        public b p0(Checksum checksum) {
            this.m = checksum;
            return this;
        }

        public b q0(long j) {
            this.n = j;
            return this;
        }

        public b r0(long j) {
            this.f653o = j;
            return this;
        }
    }

    public static b n() {
        return new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r5 == (-1)) goto L8;
     */
    @Override // o.JQ, o.AbstractC8244nK1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(int i) throws IOException {
        try {
            super.a(i);
            if (this.Z0 > 0) {
                if (k() < this.Z0) {
                }
                if (this.Y0 != o().getValue()) {
                    throw new IOException("Checksum verification failed.");
                }
            }
        } finally {
        }
    }

    public final Checksum o() {
        return ((CheckedInputStream) ((FilterInputStream) this).in).getChecksum();
    }

    public long p() {
        return this.Z0 - k();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WB(b bVar) throws IOException {
        super(new CheckedInputStream(r1, r2), bVar);
        InputStream S = bVar.S();
        Checksum checksum = bVar.m;
        Objects.requireNonNull(checksum, "builder.checksum");
        this.Z0 = bVar.n;
        this.Y0 = bVar.f653o;
    }
}
