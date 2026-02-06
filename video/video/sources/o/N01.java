package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
/* loaded from: classes3.dex */
public final class N01 {
    @NotNull
    public static final <E> E[] d(int i) {
        if (i >= 0) {
            return (E[]) new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @NotNull
    public static final <T> T[] e(@NotNull T[] tArr, int i) {
        C6562gT0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        C6562gT0.o(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void f(@NotNull E[] eArr, int i) {
        C6562gT0.p(eArr, "<this>");
        eArr[i] = null;
    }

    public static final <E> void g(@NotNull E[] eArr, int i, int i2) {
        C6562gT0.p(eArr, "<this>");
        while (i < i2) {
            f(eArr, i);
            i++;
        }
    }

    public static final <T> boolean h(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C6562gT0.g(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final <T> int i(T[] tArr, int i, int i2) {
        int i3;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            T t = tArr[i + i5];
            int i6 = i4 * 31;
            if (t != null) {
                i3 = t.hashCode();
            } else {
                i3 = 0;
            }
            i4 = i6 + i3;
        }
        return i4;
    }

    public static final <T> String j(T[] tArr, int i, int i2, Collection<? extends T> collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append(C6566gU0.f);
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(C6566gU0.h);
            }
            T t = tArr[i + i3];
            if (t == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(t);
            }
        }
        sb.append(C6566gU0.g);
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "toString(...)");
        return sb2;
    }
}
