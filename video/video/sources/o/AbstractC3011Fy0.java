package o;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Fy0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3011Fy0 implements J82 {
    @NotNull
    private final J82 delegate;

    public AbstractC3011Fy0(@NotNull J82 j82) {
        C6562gT0.p(j82, "delegate");
        this.delegate = j82;
    }

    @InterfaceC8046mW0(name = "-deprecated_delegate")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "delegate", imports = {}))
    @NotNull
    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final J82 m13deprecated_delegate() {
        return this.delegate;
    }

    @Override // o.J82, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @InterfaceC8046mW0(name = "delegate")
    @NotNull
    public final J82 delegate() {
        return this.delegate;
    }

    @Override // o.J82, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // o.J82
    @NotNull
    public C8120mp2 timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // o.J82
    public void write(@NotNull C5422bq c5422bq, long j) throws IOException {
        C6562gT0.p(c5422bq, "source");
        this.delegate.write(c5422bq, j);
    }
}
