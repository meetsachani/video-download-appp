package o;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class X8 extends AbstractC9627t0 implements InterfaceC8023mQ {
    @Nullable
    private volatile Object _preHandler;

    public X8() {
        super(InterfaceC8023mQ.z);
        this._preHandler = this;
    }

    public final Method I() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // o.InterfaceC8023mQ
    public void S(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Throwable th) {
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 28) {
            Method I = I();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (I != null) {
                obj = I.invoke(null, null);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
