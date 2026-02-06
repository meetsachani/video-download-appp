package o;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.hD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6741hD0 {
    public static InterfaceC5758dD0 a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return C6243fD0.b(view, viewGroup, matrix);
        }
        return C6498gD0.b(view, viewGroup, matrix);
    }

    public static void b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            C6243fD0.f(view);
        } else {
            C6498gD0.f(view);
        }
    }
}
