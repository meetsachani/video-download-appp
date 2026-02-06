package o;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: o.Ba0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2516Ba0 {
    public final b a;
    public int b;
    public int c;

    /* renamed from: o.Ba0$a */
    /* loaded from: classes.dex */
    public static class a extends b {
        public final EditText a;
        public final C3311Ja0 b;

        public a(EditText editText, boolean z) {
            this.a = editText;
            C3311Ja0 c3311Ja0 = new C3311Ja0(editText, z);
            this.b = c3311Ja0;
            editText.addTextChangedListener(c3311Ja0);
            editText.setEditableFactory(C2614Ca0.getInstance());
        }

        @Override // o.C2516Ba0.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof C3017Ga0) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new C3017Ga0(keyListener);
        }

        @Override // o.C2516Ba0.b
        public boolean b() {
            return this.b.d();
        }

        @Override // o.C2516Ba0.b
        public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof C2810Ea0) {
                return inputConnection;
            }
            return new C2810Ea0(this.a, inputConnection, editorInfo);
        }

        @Override // o.C2516Ba0.b
        public void d(int i) {
            this.b.f(i);
        }

        @Override // o.C2516Ba0.b
        public void e(boolean z) {
            this.b.g(z);
        }

        @Override // o.C2516Ba0.b
        public void f(int i) {
            this.b.h(i);
        }
    }

    public C2516Ba0(EditText editText) {
        this(editText, true);
    }

    public int a() {
        return this.c;
    }

    public KeyListener b(KeyListener keyListener) {
        return this.a.a(keyListener);
    }

    public int c() {
        return this.b;
    }

    public boolean d() {
        return this.a.b();
    }

    public InputConnection e(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.a.c(inputConnection, editorInfo);
    }

    public void f(int i) {
        this.c = i;
        this.a.d(i);
    }

    public void g(boolean z) {
        this.a.e(z);
    }

    public void h(int i) {
        C10907yF1.j(i, "maxEmojiCount should be greater than 0");
        this.b = i;
        this.a.f(i);
    }

    public C2516Ba0(EditText editText, boolean z) {
        this.b = Integer.MAX_VALUE;
        this.c = 0;
        C10907yF1.m(editText, "editText cannot be null");
        this.a = new a(editText, z);
    }

    /* renamed from: o.Ba0$b */
    /* loaded from: classes.dex */
    public static class b {
        public boolean b() {
            return false;
        }

        public KeyListener a(KeyListener keyListener) {
            return keyListener;
        }

        public void d(int i) {
        }

        public void e(boolean z) {
        }

        public void f(int i) {
        }

        public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }
    }
}
