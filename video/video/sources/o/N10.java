package o;

import java.io.IOException;
import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,163:1\n86#2:164\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n58#1:164\n*E\n"})
/* loaded from: classes4.dex */
public final class N10 implements J82 {
    @NotNull
    public final InterfaceC2579Bq X;
    @NotNull
    public final Deflater Y;
    public boolean Z;

    public N10(@NotNull InterfaceC2579Bq interfaceC2579Bq, @NotNull Deflater deflater) {
        C6562gT0.p(interfaceC2579Bq, "sink");
        C6562gT0.p(deflater, "deflater");
        this.X = interfaceC2579Bq;
        this.Y = deflater;
    }

    public final void a(boolean z) {
        PZ1 Z;
        int deflate;
        C5422bq B = this.X.B();
        while (true) {
            Z = B.Z(1);
            if (z) {
                try {
                    Deflater deflater = this.Y;
                    byte[] bArr = Z.a;
                    int i = Z.c;
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                Deflater deflater2 = this.Y;
                byte[] bArr2 = Z.a;
                int i2 = Z.c;
                deflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (deflate > 0) {
                Z.c += deflate;
                B.R(B.size() + deflate);
                this.X.l1();
            } else if (this.Y.needsInput()) {
                break;
            }
        }
        if (Z.b == Z.c) {
            B.X = Z.b();
            UZ1.d(Z);
        }
    }

    @Override // o.J82, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.Z) {
            try {
                d();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.Y.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.X.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.Z = true;
            if (th == null) {
                return;
            }
            throw th;
        }
    }

    public final void d() {
        this.Y.finish();
        a(false);
    }

    @Override // o.J82, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.X.flush();
    }

    @Override // o.J82
    @NotNull
    public C8120mp2 timeout() {
        return this.X.timeout();
    }

    @NotNull
    public String toString() {
        return "DeflaterSink(" + this.X + ')';
    }

    @Override // o.J82
    public void write(@NotNull C5422bq c5422bq, long j) throws IOException {
        C6562gT0.p(c5422bq, "source");
        C8648p.e(c5422bq.size(), 0L, j);
        while (j > 0) {
            PZ1 pz1 = c5422bq.X;
            C6562gT0.m(pz1);
            int min = (int) Math.min(j, pz1.c - pz1.b);
            this.Y.setInput(pz1.a, pz1.b, min);
            a(false);
            long j2 = min;
            c5422bq.R(c5422bq.size() - j2);
            int i = pz1.b + min;
            pz1.b = i;
            if (i == pz1.c) {
                c5422bq.X = pz1.b();
                UZ1.d(pz1);
            }
            j -= j2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N10(@NotNull J82 j82, @NotNull Deflater deflater) {
        this(C9604su1.d(j82), deflater);
        C6562gT0.p(j82, "sink");
        C6562gT0.p(deflater, "deflater");
    }
}
