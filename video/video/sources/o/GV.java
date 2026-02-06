package o;

import java.lang.reflect.Field;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2:135\n36#2,3:136\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135\n131#1:136,3\n*E\n"})
/* loaded from: classes3.dex */
public final class GV {
    public static final int a = 1;

    public static final void a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    public static final FV b(AbstractC5644cl abstractC5644cl) {
        return (FV) abstractC5644cl.getClass().getAnnotation(FV.class);
    }

    public static final int c(AbstractC5644cl abstractC5644cl) {
        Integer num;
        int i;
        try {
            Field declaredField = abstractC5644cl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC5644cl);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            return i - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @InterfaceC8046mW0(name = "getSpilledVariableFieldMapping")
    @InterfaceC6480g82(version = "1.3")
    @Nullable
    public static final String[] d(@NotNull AbstractC5644cl abstractC5644cl) {
        C6562gT0.p(abstractC5644cl, "<this>");
        FV b = b(abstractC5644cl);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        ArrayList arrayList = new ArrayList();
        int c = c(abstractC5644cl);
        int[] i = b.i();
        int length = i.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i[i2] == c) {
                arrayList.add(b.s()[i2]);
                arrayList.add(b.n()[i2]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @InterfaceC8046mW0(name = "getStackTraceElement")
    @InterfaceC6480g82(version = "1.3")
    @Nullable
    public static final StackTraceElement e(@NotNull AbstractC5644cl abstractC5644cl) {
        int i;
        String str;
        C6562gT0.p(abstractC5644cl, "<this>");
        FV b = b(abstractC5644cl);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        int c = c(abstractC5644cl);
        if (c < 0) {
            i = -1;
        } else {
            i = b.l()[c];
        }
        String b2 = C11268zk1.a.b(abstractC5644cl);
        if (b2 == null) {
            str = b.c();
        } else {
            str = b2 + '/' + b.c();
        }
        return new StackTraceElement(str, b.m(), b.f(), i);
    }
}
