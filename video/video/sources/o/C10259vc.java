package o;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: o.vc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10259vc {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof JM2) {
                    editorInfo.hintText = ((JM2) parent).a();
                    return inputConnection;
                }
            }
        }
        return inputConnection;
    }
}
