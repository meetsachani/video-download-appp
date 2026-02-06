package o;

import android.os.Trace;

/* renamed from: o.jr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7381jr2 {
    @InterfaceC9150r20(message = "Use androidx.tracing.Trace instead", replaceWith = @IR1(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    public static final <T> T a(String str, FA0<? extends T> fa0) {
        Trace.beginSection(str);
        try {
            return fa0.invoke();
        } finally {
            UP0.d(1);
            Trace.endSection();
            UP0.c(1);
        }
    }
}
