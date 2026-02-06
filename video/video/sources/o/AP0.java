package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,147:1\n1#2:148\n86#3:149\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n73#1:149\n*E\n"})
/* loaded from: classes4.dex */
public final class AP0 implements InterfaceC7072ia2 {
    @NotNull
    public final InterfaceC2677Cq X;
    @NotNull
    public final Inflater Y;
    public boolean Y0;
    public int Z;

    public AP0(@NotNull InterfaceC2677Cq interfaceC2677Cq, @NotNull Inflater inflater) {
        C6562gT0.p(interfaceC2677Cq, "source");
        C6562gT0.p(inflater, "inflater");
        this.X = interfaceC2677Cq;
        this.Y = inflater;
    }

    public final long a(@NotNull C5422bq c5422bq, long j) throws IOException {
        C6562gT0.p(c5422bq, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.Y0) {
                if (i == 0) {
                    return 0L;
                }
                try {
                    PZ1 Z = c5422bq.Z(1);
                    d();
                    int inflate = this.Y.inflate(Z.a, Z.c, (int) Math.min(j, 8192 - Z.c));
                    f();
                    if (inflate > 0) {
                        Z.c += inflate;
                        long j2 = inflate;
                        c5422bq.R(c5422bq.size() + j2);
                        return j2;
                    }
                    if (Z.b == Z.c) {
                        c5422bq.X = Z.b();
                        UZ1.d(Z);
                    }
                    return 0L;
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.Y0) {
            return;
        }
        this.Y.end();
        this.Y0 = true;
        this.X.close();
    }

    public final boolean d() throws IOException {
        if (!this.Y.needsInput()) {
            return false;
        }
        if (this.X.M3()) {
            return true;
        }
        PZ1 pz1 = this.X.B().X;
        C6562gT0.m(pz1);
        int i = pz1.c;
        int i2 = pz1.b;
        int i3 = i - i2;
        this.Z = i3;
        this.Y.setInput(pz1.a, i2, i3);
        return false;
    }

    public final void f() {
        int i = this.Z;
        if (i == 0) {
            return;
        }
        int remaining = i - this.Y.getRemaining();
        this.Z -= remaining;
        this.X.skip(remaining);
    }

    @Override // o.InterfaceC7072ia2
    public long read(@NotNull C5422bq c5422bq, long j) throws IOException {
        C6562gT0.p(c5422bq, "sink");
        do {
            long a = a(c5422bq, j);
            if (a > 0) {
                return a;
            }
            if (this.Y.finished() || this.Y.needsDictionary()) {
                return -1L;
            }
        } while (!this.X.M3());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // o.InterfaceC7072ia2
    @NotNull
    public C8120mp2 timeout() {
        return this.X.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AP0(@NotNull InterfaceC7072ia2 interfaceC7072ia2, @NotNull Inflater inflater) {
        this(C9604su1.e(interfaceC7072ia2), inflater);
        C6562gT0.p(interfaceC7072ia2, "source");
        C6562gT0.p(inflater, "inflater");
    }
}
