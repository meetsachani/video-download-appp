package o;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import o.InterfaceC8148mw2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.We  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4594We {
    @NotNull
    public static final <T> T[] a(@NotNull T[] tArr, int i) {
        C6562gT0.p(tArr, InterfaceC8148mw2.b.h);
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        C6562gT0.n(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    @InterfaceC8046mW0(name = "contentDeepHashCode")
    @HK1
    @InterfaceC6480g82(version = "1.3")
    public static final <T> int b(@Nullable T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @InterfaceC6480g82(version = "1.3")
    public static final void c(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static final /* synthetic */ <T> T[] d(T[] tArr) {
        if (tArr == null) {
            C6562gT0.y(0, "T");
            return (T[]) new Object[0];
        }
        return tArr;
    }

    @XP0
    public static final String e(byte[] bArr, Charset charset) {
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new String(bArr, charset);
    }

    public static final /* synthetic */ <T> T[] f(Collection<? extends T> collection) {
        C6562gT0.p(collection, "<this>");
        C6562gT0.y(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }
}
