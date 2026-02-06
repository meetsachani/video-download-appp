package o;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.ia2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7072ia2 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(@NotNull C5422bq c5422bq, long j) throws IOException;

    @NotNull
    C8120mp2 timeout();
}
