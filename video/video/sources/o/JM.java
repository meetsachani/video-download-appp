package o;

import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import o.PT1;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class JM<T> implements BiFunction<T, Throwable, C7458kA2> {
    @InterfaceC7058iW0
    @Nullable
    public volatile HM<? super T> cont;

    public JM(@Nullable HM<? super T> hm) {
        this.cont = hm;
    }

    public void a(@Nullable T t, @Nullable Throwable th) {
        CompletionException completionException;
        Throwable cause;
        HM<? super T> hm = this.cont;
        if (hm == null) {
            return;
        }
        if (th == null) {
            PT1.a aVar = PT1.Y;
            hm.q(PT1.b(t));
            return;
        }
        if (th instanceof CompletionException) {
            completionException = (CompletionException) th;
        } else {
            completionException = null;
        }
        if (completionException != null && (cause = completionException.getCause()) != null) {
            th = cause;
        }
        PT1.a aVar2 = PT1.Y;
        hm.q(PT1.b(RT1.a(th)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ C7458kA2 apply(Object obj, Throwable th) {
        a(obj, th);
        return C7458kA2.a;
    }
}
