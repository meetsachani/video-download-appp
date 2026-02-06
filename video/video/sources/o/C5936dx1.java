package o;

import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n86#2:240\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n55#1:240\n*E\n"})
/* renamed from: o.dx1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5936dx1 implements J82 {
    @NotNull
    public final OutputStream X;
    @NotNull
    public final C8120mp2 Y;

    public C5936dx1(@NotNull OutputStream outputStream, @NotNull C8120mp2 c8120mp2) {
        C6562gT0.p(outputStream, "out");
        C6562gT0.p(c8120mp2, "timeout");
        this.X = outputStream;
        this.Y = c8120mp2;
    }

    @Override // o.J82, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.X.close();
    }

    @Override // o.J82, java.io.Flushable
    public void flush() {
        this.X.flush();
    }

    @Override // o.J82
    @NotNull
    public C8120mp2 timeout() {
        return this.Y;
    }

    @NotNull
    public String toString() {
        return "sink(" + this.X + ')';
    }

    @Override // o.J82
    public void write(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "source");
        C8648p.e(c5422bq.size(), 0L, j);
        while (j > 0) {
            this.Y.throwIfReached();
            PZ1 pz1 = c5422bq.X;
            C6562gT0.m(pz1);
            int min = (int) Math.min(j, pz1.c - pz1.b);
            this.X.write(pz1.a, pz1.b, min);
            pz1.b += min;
            long j2 = min;
            j -= j2;
            c5422bq.R(c5422bq.size() - j2);
            if (pz1.b == pz1.c) {
                c5422bq.X = pz1.b();
                UZ1.d(pz1);
            }
        }
    }
}
