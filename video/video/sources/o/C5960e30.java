package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.e30  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5960e30 extends RuntimeException {
    @NotNull
    public final transient InterfaceC5809dQ X;

    public C5960e30(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        this.X = interfaceC5809dQ;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getLocalizedMessage() {
        return this.X.toString();
    }
}
