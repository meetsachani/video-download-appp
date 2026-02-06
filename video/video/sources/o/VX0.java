package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class VX0 extends Error {
    public VX0() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public VX0(@Nullable String str) {
        super(str);
    }

    public VX0(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public VX0(@Nullable Throwable th) {
        super(th);
    }
}
