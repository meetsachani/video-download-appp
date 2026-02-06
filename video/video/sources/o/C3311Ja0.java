package o;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: o.Ja0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3311Ja0 implements TextWatcher {
    public final EditText X;
    public final boolean Y;
    public c.g Z;
    public int Y0 = Integer.MAX_VALUE;
    public int Z0 = 0;
    public boolean a1 = true;

    /* renamed from: o.Ja0$a */
    /* loaded from: classes.dex */
    public static class a extends c.g {
        public final Reference<EditText> a;

        public a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.g
        public void b() {
            super.b();
            C3311Ja0.e(this.a.get(), 1);
        }
    }

    public C3311Ja0(EditText editText, boolean z) {
        this.X = editText;
        this.Y = z;
    }

    public static void e(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.c.c().x(editableText);
            C2919Fa0.b(editableText, selectionStart, selectionEnd);
        }
    }

    public int a() {
        return this.Z0;
    }

    public final c.g b() {
        if (this.Z == null) {
            this.Z = new a(this.X);
        }
        return this.Z;
    }

    public int c() {
        return this.Y0;
    }

    public boolean d() {
        return this.a1;
    }

    public void f(int i) {
        this.Z0 = i;
    }

    public void g(boolean z) {
        if (this.a1 != z) {
            if (this.Z != null) {
                androidx.emoji2.text.c.c().F(this.Z);
            }
            this.a1 = z;
            if (z) {
                e(this.X, androidx.emoji2.text.c.c().i());
            }
        }
    }

    public void h(int i) {
        this.Y0 = i;
    }

    public final boolean i() {
        if (this.a1) {
            if (this.Y || androidx.emoji2.text.c.q()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.X.isInEditMode() && !i() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int i4 = androidx.emoji2.text.c.c().i();
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 3) {
                        return;
                    }
                } else {
                    androidx.emoji2.text.c.c().A((Spannable) charSequence, i, i + i3, this.Y0, this.Z0);
                    return;
                }
            }
            androidx.emoji2.text.c.c().B(b());
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
