package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "ThreadsKt")
@InterfaceC8303na2({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* renamed from: o.eo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6144eo2 {

    /* renamed from: o.eo2$a */
    /* loaded from: classes3.dex */
    public static final class a extends Thread {
        public final /* synthetic */ FA0<C7458kA2> X;

        public a(FA0<C7458kA2> fa0) {
            this.X = fa0;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.X.invoke();
        }
    }

    @XP0
    public static final <T> T a(ThreadLocal<T> threadLocal, FA0<? extends T> fa0) {
        C6562gT0.p(threadLocal, "<this>");
        C6562gT0.p(fa0, JT.d);
        T t = threadLocal.get();
        if (t == null) {
            T invoke = fa0.invoke();
            threadLocal.set(invoke);
            return invoke;
        }
        return t;
    }

    @NotNull
    public static final Thread b(boolean z, boolean z2, @Nullable ClassLoader classLoader, @Nullable String str, int i, @NotNull FA0<C7458kA2> fa0) {
        C6562gT0.p(fa0, "block");
        a aVar = new a(fa0);
        if (z2) {
            aVar.setDaemon(true);
        }
        if (i > 0) {
            aVar.setPriority(i);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z) {
            aVar.start();
        }
        return aVar;
    }

    public static /* synthetic */ Thread c(boolean z, boolean z2, ClassLoader classLoader, String str, int i, FA0 fa0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            classLoader = null;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            i = -1;
        }
        int i3 = i;
        String str2 = str;
        return b(z, z2, classLoader, str2, i3, fa0);
    }
}
