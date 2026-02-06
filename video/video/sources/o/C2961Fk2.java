package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Fk2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C2961Fk2 {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return a;
    }

    @Nullable
    public static final String b(@NotNull String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
