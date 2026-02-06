package o;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import o.OL1;

/* renamed from: o.tc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9773tc {
    public final EditText a;
    public final C2516Ba0 b;

    public C9773tc(EditText editText) {
        this.a = editText;
        this.b = new C2516Ba0(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        if (b(keyListener)) {
            return this.b.b(keyListener);
        }
        return keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public boolean c() {
        return this.b.d();
    }

    public void d(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, OL1.m.v0, i, 0);
        try {
            int i2 = OL1.m.K0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            f(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection e(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.b.e(inputConnection, editorInfo);
    }

    public void f(boolean z) {
        this.b.g(z);
    }
}
