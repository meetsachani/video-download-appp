package o;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* renamed from: o.Ea0 */
/* loaded from: classes.dex */
public final class C2810Ea0 extends InputConnectionWrapper {
    public final TextView a;
    public final a b;

    /* renamed from: o.Ea0$a */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return androidx.emoji2.text.c.j(inputConnection, editable, i, i2, z);
        }

        public void b(EditorInfo editorInfo) {
            if (androidx.emoji2.text.c.q()) {
                androidx.emoji2.text.c.c().G(editorInfo);
            }
        }
    }

    public C2810Ea0(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    public final Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        if (!this.b.a(this, a(), i, i2, false) && !super.deleteSurroundingText(i, i2)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (!this.b.a(this, a(), i, i2, true) && !super.deleteSurroundingTextInCodePoints(i, i2)) {
            return false;
        }
        return true;
    }

    public C2810Ea0(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.a = textView;
        this.b = aVar;
        aVar.b(editorInfo);
    }
}
