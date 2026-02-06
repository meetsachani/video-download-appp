package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.kj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7592kj2 {
    @InterfaceC7058iW0
    @NotNull
    public final String a;

    public C7592kj2(@NotNull String str) {
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T a(@Nullable Object obj) {
        if (obj == this) {
            return null;
        }
        return obj;
    }

    @NotNull
    public String toString() {
        return '<' + this.a + '>';
    }
}
