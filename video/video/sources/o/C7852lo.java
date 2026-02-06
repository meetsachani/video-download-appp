package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.lo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7852lo implements J82 {
    @Override // o.J82
    @NotNull
    public C8120mp2 timeout() {
        return C8120mp2.NONE;
    }

    @Override // o.J82
    public void write(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "source");
        c5422bq.skip(j);
    }

    @Override // o.J82, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // o.J82, java.io.Flushable
    public void flush() {
    }
}
