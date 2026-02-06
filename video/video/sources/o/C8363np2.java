package o;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nkotlinx/coroutines/TimeoutCancellationException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
/* renamed from: o.np2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8363np2 extends CancellationException implements RP<C8363np2> {
    @InterfaceC7058iW0
    @Nullable
    public final transient RU0 X;

    public C8363np2(@NotNull String str, @Nullable RU0 ru0) {
        super(str);
        this.X = ru0;
    }

    @Override // o.RP
    @NotNull
    /* renamed from: b */
    public C8363np2 a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        C8363np2 c8363np2 = new C8363np2(message, this.X);
        c8363np2.initCause(this);
        return c8363np2;
    }

    public C8363np2(@NotNull String str) {
        this(str, null);
    }
}
