package o;

import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,239:1\n1#2:240\n86#3:241\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/InputStreamSource\n*L\n92#1:241\n*E\n"})
/* renamed from: o.mQ0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8024mQ0 implements InterfaceC7072ia2 {
    @NotNull
    public final InputStream X;
    @NotNull
    public final C8120mp2 Y;

    public C8024mQ0(@NotNull InputStream inputStream, @NotNull C8120mp2 c8120mp2) {
        C6562gT0.p(inputStream, "input");
        C6562gT0.p(c8120mp2, "timeout");
        this.X = inputStream;
        this.Y = c8120mp2;
    }

    @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.X.close();
    }

    @Override // o.InterfaceC7072ia2
    public long read(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            try {
                this.Y.throwIfReached();
                PZ1 Z = c5422bq.Z(1);
                int read = this.X.read(Z.a, Z.c, (int) Math.min(j, 8192 - Z.c));
                if (read == -1) {
                    if (Z.b == Z.c) {
                        c5422bq.X = Z.b();
                        UZ1.d(Z);
                        return -1L;
                    }
                    return -1L;
                }
                Z.c += read;
                long j2 = read;
                c5422bq.R(c5422bq.size() + j2);
                return j2;
            } catch (AssertionError e) {
                if (C9604su1.l(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // o.InterfaceC7072ia2
    @NotNull
    public C8120mp2 timeout() {
        return this.Y;
    }

    @NotNull
    public String toString() {
        return "source(" + this.X + ')';
    }
}
