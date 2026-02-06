package o;

import java.util.ArrayDeque;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1790#2,6:213\n12511#2,2:221\n1682#2,6:223\n12511#2,2:229\n1682#2,6:232\n37#3,2:219\n1#4:231\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n39#1:213,6\n127#1:221,2\n137#1:223,6\n169#1:229,2\n190#1:232,6\n102#1:219,2\n*E\n"})
/* renamed from: o.Db2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2718Db2 {
    @NotNull
    public static final String a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    @NotNull
    public static final String b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    @NotNull
    public static final StackTraceElement c = new C7816lf().a();
    public static final String d;
    public static final String e;

    static {
        Object b2;
        Object b3;
        try {
            PT1.a aVar = PT1.Y;
            b2 = PT1.b(AbstractC5644cl.class.getCanonicalName());
        } catch (Throwable th) {
            PT1.a aVar2 = PT1.Y;
            b2 = PT1.b(RT1.a(th));
        }
        if (PT1.e(b2) != null) {
            b2 = a;
        }
        d = (String) b2;
        try {
            PT1.a aVar3 = PT1.Y;
            b3 = PT1.b(C2718Db2.class.getCanonicalName());
        } catch (Throwable th2) {
            PT1.a aVar4 = PT1.Y;
            b3 = PT1.b(RT1.a(th2));
        }
        if (PT1.e(b3) != null) {
            b3 = b;
        }
        e = (String) b3;
    }

    public static final <E extends Throwable> C4180Rx1<E, StackTraceElement[]> d(E e2) {
        Throwable cause = e2.getCause();
        if (cause != null && C6562gT0.g(cause.getClass(), e2.getClass())) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (j(stackTraceElement)) {
                    return C6670gv2.a(cause, stackTrace);
                }
            }
            return C6670gv2.a(e2, new StackTraceElement[0]);
        }
        return C6670gv2.a(e2, new StackTraceElement[0]);
    }

    public static final <E extends Throwable> E e(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(c);
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int h = h(stackTrace, d);
        int i = 0;
        if (h == -1) {
            e3.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e3;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + h];
        for (int i2 = 0; i2 < h; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[i + h] = stackTraceElement;
            i++;
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }

    public static final ArrayDeque<StackTraceElement> f(InterfaceC10706xQ interfaceC10706xQ) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement Y = interfaceC10706xQ.Y();
        if (Y != null) {
            arrayDeque.add(Y);
        }
        while (true) {
            interfaceC10706xQ = interfaceC10706xQ.g();
            if (interfaceC10706xQ == null) {
                return arrayDeque;
            }
            StackTraceElement Y2 = interfaceC10706xQ.Y();
            if (Y2 != null) {
                arrayDeque.add(Y2);
            }
        }
    }

    public static final boolean g(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C6562gT0.g(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && C6562gT0.g(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && C6562gT0.g(stackTraceElement.getClassName(), stackTraceElement2.getClassName())) {
            return true;
        }
        return false;
    }

    public static final int h(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (C6562gT0.g(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    public static final void i(@NotNull Throwable th, @NotNull Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean j(@NotNull StackTraceElement stackTraceElement) {
        return C9545sf2.J2(stackTraceElement.getClassName(), C7276jQ.c(), false, 2, null);
    }

    public static final void k(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (j(stackTraceElementArr[i])) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 > length2) {
            return;
        }
        while (true) {
            if (g(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 != i2) {
                length2--;
            } else {
                return;
            }
        }
    }

    public static final <E extends Throwable> E n(E e2, InterfaceC10706xQ interfaceC10706xQ) {
        C4180Rx1 d2 = d(e2);
        Throwable th = (Throwable) d2.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) d2.b();
        Throwable q = C3527Lf0.q(th);
        if (q != null) {
            ArrayDeque<StackTraceElement> f = f(interfaceC10706xQ);
            if (!f.isEmpty()) {
                if (th != e2) {
                    k(stackTraceElementArr, f);
                }
                return (E) e(th, q, f);
            }
        }
        return e2;
    }

    public static final <E extends Throwable> E q(E e2) {
        int i;
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (C6562gT0.g(e, stackTrace[length2].getClassName())) {
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length2 = i2;
                }
            }
        }
        length2 = -1;
        int i3 = length2 + 1;
        int h = h(stackTrace, d);
        if (h == -1) {
            i = 0;
        } else {
            i = length - h;
        }
        int i4 = (length - length2) - i;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 == 0) {
                stackTraceElement = c;
            } else {
                stackTraceElement = stackTrace[(i3 + i5) - 1];
            }
            stackTraceElementArr[i5] = stackTraceElement;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    @HK1
    @NotNull
    public static final <E extends Throwable> E s(@NotNull E e2) {
        E e3 = (E) e2.getCause();
        if (e3 != null && C6562gT0.g(e3.getClass(), e2.getClass())) {
            for (StackTraceElement stackTraceElement : e2.getStackTrace()) {
                if (j(stackTraceElement)) {
                    return e3;
                }
            }
        }
        return e2;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    @NotNull
    public static final <E extends Throwable> E o(@NotNull E e2) {
        return e2;
    }

    @HK1
    @NotNull
    public static final <E extends Throwable> E r(@NotNull E e2) {
        return e2;
    }

    @Nullable
    public static final Object l(@NotNull Throwable th, @NotNull HM<?> hm) {
        throw th;
    }

    public static final Object m(Throwable th, HM<?> hm) {
        throw th;
    }

    @NotNull
    public static final <E extends Throwable> E p(@NotNull E e2, @NotNull HM<?> hm) {
        return e2;
    }
}
