package o;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,153:1\n51#2:154\n1#3:155\n86#4:156\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n63#1:154\n131#1:156\n*E\n"})
/* loaded from: classes4.dex */
public final class CF0 implements J82 {
    @NotNull
    public final LO1 X;
    @NotNull
    public final Deflater Y;
    public boolean Y0;
    @NotNull
    public final N10 Z;
    @NotNull
    public final CRC32 Z0;

    public CF0(@NotNull J82 j82) {
        C6562gT0.p(j82, "sink");
        LO1 lo1 = new LO1(j82);
        this.X = lo1;
        Deflater deflater = new Deflater(-1, true);
        this.Y = deflater;
        this.Z = new N10((InterfaceC2579Bq) lo1, deflater);
        this.Z0 = new CRC32();
        C5422bq c5422bq = lo1.Y;
        c5422bq.writeShort(8075);
        c5422bq.writeByte(8);
        c5422bq.writeByte(0);
        c5422bq.writeInt(0);
        c5422bq.writeByte(0);
        c5422bq.writeByte(0);
    }

    @InterfaceC8046mW0(name = "-deprecated_deflater")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "deflater", imports = {}))
    @NotNull
    public final Deflater a() {
        return this.Y;
    }

    @Override // o.J82, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.Y0) {
            try {
                this.Z.d();
                h();
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
            this.Y0 = true;
            if (th == null) {
                return;
            }
            throw th;
        }
    }

    @InterfaceC8046mW0(name = "deflater")
    @NotNull
    public final Deflater d() {
        return this.Y;
    }

    public final void f(C5422bq c5422bq, long j) {
        PZ1 pz1 = c5422bq.X;
        C6562gT0.m(pz1);
        while (j > 0) {
            int min = (int) Math.min(j, pz1.c - pz1.b);
            this.Z0.update(pz1.a, pz1.b, min);
            j -= min;
            pz1 = pz1.f;
            C6562gT0.m(pz1);
        }
    }

    @Override // o.J82, java.io.Flushable
    public void flush() throws IOException {
        this.Z.flush();
    }

    public final void h() {
        this.X.K3((int) this.Z0.getValue());
        this.X.K3((int) this.Y.getBytesRead());
    }

    @Override // o.J82
    @NotNull
    public C8120mp2 timeout() {
        return this.X.timeout();
    }

    @Override // o.J82
    public void write(@NotNull C5422bq c5422bq, long j) throws IOException {
        C6562gT0.p(c5422bq, "source");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return;
            }
            f(c5422bq, j);
            this.Z.write(c5422bq, j);
            return;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }
}
