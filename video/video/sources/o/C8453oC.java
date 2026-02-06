package o;

import java.io.IOException;
import javax.crypto.Cipher;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nCipherSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n1#2:149\n86#3:150\n*S KotlinDebug\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n*L\n47#1:150\n*E\n"})
/* renamed from: o.oC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8453oC implements J82 {
    @NotNull
    public final InterfaceC2579Bq X;
    @NotNull
    public final Cipher Y;
    public boolean Y0;
    public final int Z;

    public C8453oC(@NotNull InterfaceC2579Bq interfaceC2579Bq, @NotNull Cipher cipher) {
        C6562gT0.p(interfaceC2579Bq, "sink");
        C6562gT0.p(cipher, "cipher");
        this.X = interfaceC2579Bq;
        this.Y = cipher;
        int blockSize = cipher.getBlockSize();
        this.Z = blockSize;
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    public final Throwable a() {
        int outputSize = this.Y.getOutputSize(0);
        Throwable th = null;
        if (outputSize == 0) {
            return null;
        }
        if (outputSize > 8192) {
            try {
                InterfaceC2579Bq interfaceC2579Bq = this.X;
                byte[] doFinal = this.Y.doFinal();
                C6562gT0.o(doFinal, "doFinal(...)");
                interfaceC2579Bq.write(doFinal);
                return null;
            } catch (Throwable th2) {
                return th2;
            }
        }
        C5422bq B = this.X.B();
        PZ1 Z = B.Z(outputSize);
        try {
            int doFinal2 = this.Y.doFinal(Z.a, Z.c);
            Z.c += doFinal2;
            B.R(B.size() + doFinal2);
        } catch (Throwable th3) {
            th = th3;
        }
        if (Z.b == Z.c) {
            B.X = Z.b();
            UZ1.d(Z);
        }
        return th;
    }

    @Override // o.J82, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.Y0) {
            this.Y0 = true;
            Throwable a = a();
            try {
                this.X.close();
            } catch (Throwable th) {
                if (a == null) {
                    a = th;
                }
            }
            if (a == null) {
                return;
            }
            throw a;
        }
    }

    @NotNull
    public final Cipher d() {
        return this.Y;
    }

    public final int f(C5422bq c5422bq, long j) {
        PZ1 pz1 = c5422bq.X;
        C6562gT0.m(pz1);
        int min = (int) Math.min(j, pz1.c - pz1.b);
        C5422bq B = this.X.B();
        int outputSize = this.Y.getOutputSize(min);
        int i = min;
        while (outputSize > 8192) {
            int i2 = this.Z;
            if (i <= i2) {
                InterfaceC2579Bq interfaceC2579Bq = this.X;
                byte[] update = this.Y.update(c5422bq.o2(j));
                C6562gT0.o(update, "update(...)");
                interfaceC2579Bq.write(update);
                return (int) j;
            }
            i -= i2;
            outputSize = this.Y.getOutputSize(i);
        }
        PZ1 Z = B.Z(outputSize);
        int update2 = this.Y.update(pz1.a, pz1.b, i, Z.a, Z.c);
        Z.c += update2;
        B.R(B.size() + update2);
        if (Z.b == Z.c) {
            B.X = Z.b();
            UZ1.d(Z);
        }
        this.X.l1();
        c5422bq.R(c5422bq.size() - i);
        int i3 = pz1.b + i;
        pz1.b = i3;
        if (i3 == pz1.c) {
            c5422bq.X = pz1.b();
            UZ1.d(pz1);
        }
        return i;
    }

    @Override // o.J82, java.io.Flushable
    public void flush() {
        this.X.flush();
    }

    @Override // o.J82
    @NotNull
    public C8120mp2 timeout() {
        return this.X.timeout();
    }

    @Override // o.J82
    public void write(@NotNull C5422bq c5422bq, long j) throws IOException {
        C6562gT0.p(c5422bq, "source");
        C8648p.e(c5422bq.size(), 0L, j);
        if (!this.Y0) {
            long j2 = j;
            while (j2 > 0) {
                j2 -= f(c5422bq, j2);
            }
            return;
        }
        throw new IllegalStateException("closed");
    }
}
