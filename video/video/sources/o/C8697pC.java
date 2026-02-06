package o;

import java.io.IOException;
import javax.crypto.Cipher;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* renamed from: o.pC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8697pC implements InterfaceC7072ia2 {
    @NotNull
    public final InterfaceC2677Cq X;
    @NotNull
    public final Cipher Y;
    @NotNull
    public final C5422bq Y0;
    public final int Z;
    public boolean Z0;
    public boolean a1;

    public C8697pC(@NotNull InterfaceC2677Cq interfaceC2677Cq, @NotNull Cipher cipher) {
        C6562gT0.p(interfaceC2677Cq, "source");
        C6562gT0.p(cipher, "cipher");
        this.X = interfaceC2677Cq;
        this.Y = cipher;
        int blockSize = cipher.getBlockSize();
        this.Z = blockSize;
        this.Y0 = new C5422bq();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    public final void a() {
        int outputSize = this.Y.getOutputSize(0);
        if (outputSize != 0) {
            PZ1 Z = this.Y0.Z(outputSize);
            int doFinal = this.Y.doFinal(Z.a, Z.b);
            Z.c += doFinal;
            C5422bq c5422bq = this.Y0;
            c5422bq.R(c5422bq.size() + doFinal);
            if (Z.b == Z.c) {
                this.Y0.X = Z.b();
                UZ1.d(Z);
            }
        }
    }

    @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a1 = true;
        this.X.close();
    }

    @NotNull
    public final Cipher d() {
        return this.Y;
    }

    public final void f() {
        while (this.Y0.size() == 0 && !this.Z0) {
            if (this.X.M3()) {
                this.Z0 = true;
                a();
                return;
            }
            h();
        }
    }

    public final void h() {
        PZ1 pz1 = this.X.B().X;
        C6562gT0.m(pz1);
        int i = pz1.c - pz1.b;
        int outputSize = this.Y.getOutputSize(i);
        int i2 = i;
        while (outputSize > 8192) {
            int i3 = this.Z;
            if (i2 <= i3) {
                this.Z0 = true;
                C5422bq c5422bq = this.Y0;
                byte[] doFinal = this.Y.doFinal(this.X.I3());
                C6562gT0.o(doFinal, "doFinal(...)");
                c5422bq.write(doFinal);
                return;
            }
            i2 -= i3;
            outputSize = this.Y.getOutputSize(i2);
        }
        PZ1 Z = this.Y0.Z(outputSize);
        int update = this.Y.update(pz1.a, pz1.b, i2, Z.a, Z.b);
        this.X.skip(i2);
        Z.c += update;
        C5422bq c5422bq2 = this.Y0;
        c5422bq2.R(c5422bq2.size() + update);
        if (Z.b == Z.c) {
            this.Y0.X = Z.b();
            UZ1.d(Z);
        }
    }

    @Override // o.InterfaceC7072ia2
    public long read(@NotNull C5422bq c5422bq, long j) throws IOException {
        C6562gT0.p(c5422bq, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.a1) {
                if (i == 0) {
                    return 0L;
                }
                f();
                return this.Y0.read(c5422bq, j);
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // o.InterfaceC7072ia2
    @NotNull
    public C8120mp2 timeout() {
        return this.X.timeout();
    }
}
