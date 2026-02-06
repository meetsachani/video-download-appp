package o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public interface J82 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    @NotNull
    C8120mp2 timeout();

    void write(@NotNull C5422bq c5422bq, long j) throws IOException;
}
