package o;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Ky0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3501Ky0 implements InterfaceC7072ia2 {
    @NotNull
    private final InterfaceC7072ia2 delegate;

    public AbstractC3501Ky0(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        C6562gT0.p(interfaceC7072ia2, "delegate");
        this.delegate = interfaceC7072ia2;
    }

    @InterfaceC8046mW0(name = "-deprecated_delegate")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "delegate", imports = {}))
    @NotNull
    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final InterfaceC7072ia2 m15deprecated_delegate() {
        return this.delegate;
    }

    @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @InterfaceC8046mW0(name = "delegate")
    @NotNull
    public final InterfaceC7072ia2 delegate() {
        return this.delegate;
    }

    @Override // o.InterfaceC7072ia2
    public long read(@NotNull C5422bq c5422bq, long j) throws IOException {
        C6562gT0.p(c5422bq, "sink");
        return this.delegate.read(c5422bq, j);
    }

    @Override // o.InterfaceC7072ia2
    @NotNull
    public C8120mp2 timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
