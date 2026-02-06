package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Cb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2620Cb2 implements InterfaceC10706xQ {
    @Nullable
    public final InterfaceC10706xQ X;
    @NotNull
    public final StackTraceElement Y;

    public C2620Cb2(@Nullable InterfaceC10706xQ interfaceC10706xQ, @NotNull StackTraceElement stackTraceElement) {
        this.X = interfaceC10706xQ;
        this.Y = stackTraceElement;
    }

    @Override // o.InterfaceC10706xQ
    @NotNull
    public StackTraceElement Y() {
        return this.Y;
    }

    @Override // o.InterfaceC10706xQ
    @Nullable
    public InterfaceC10706xQ g() {
        return this.X;
    }
}
