package o;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: o.Ia0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3213Ia0 {
    public final b a;

    /* renamed from: o.Ia0$a */
    /* loaded from: classes.dex */
    public static class a extends b {
        public final TextView a;
        public final C2919Fa0 b;
        public boolean c = true;

        public a(TextView textView) {
            this.a = textView;
            this.b = new C2919Fa0(textView);
        }

        @Override // o.C3213Ia0.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.c) {
                return i(inputFilterArr);
            }
            return g(inputFilterArr);
        }

        @Override // o.C3213Ia0.b
        public boolean b() {
            return this.c;
        }

        @Override // o.C3213Ia0.b
        public void c(boolean z) {
            if (z) {
                e();
            }
        }

        @Override // o.C3213Ia0.b
        public void d(boolean z) {
            this.c = z;
            e();
            l();
        }

        @Override // o.C3213Ia0.b
        public void e() {
            this.a.setTransformationMethod(f(this.a.getTransformationMethod()));
        }

        @Override // o.C3213Ia0.b
        public TransformationMethod f(TransformationMethod transformationMethod) {
            if (this.c) {
                return m(transformationMethod);
            }
            return k(transformationMethod);
        }

        public final InputFilter[] g(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.b;
            return inputFilterArr2;
        }

        public final SparseArray<InputFilter> h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C2919Fa0) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        public final InputFilter[] i(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> h = h(inputFilterArr);
            if (h.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - h.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (h.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        public void j(boolean z) {
            this.c = z;
        }

        public final TransformationMethod k(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof C3409Ka0) {
                return ((C3409Ka0) transformationMethod).a();
            }
            return transformationMethod;
        }

        public final void l() {
            this.a.setFilters(a(this.a.getFilters()));
        }

        public final TransformationMethod m(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof C3409Ka0) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new C3409Ka0(transformationMethod);
        }
    }

    /* renamed from: o.Ia0$c */
    /* loaded from: classes.dex */
    public static class c extends b {
        public final a a;

        public c(TextView textView) {
            this.a = new a(textView);
        }

        @Override // o.C3213Ia0.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (g()) {
                return inputFilterArr;
            }
            return this.a.a(inputFilterArr);
        }

        @Override // o.C3213Ia0.b
        public boolean b() {
            return this.a.b();
        }

        @Override // o.C3213Ia0.b
        public void c(boolean z) {
            if (g()) {
                return;
            }
            this.a.c(z);
        }

        @Override // o.C3213Ia0.b
        public void d(boolean z) {
            if (g()) {
                this.a.j(z);
            } else {
                this.a.d(z);
            }
        }

        @Override // o.C3213Ia0.b
        public void e() {
            if (g()) {
                return;
            }
            this.a.e();
        }

        @Override // o.C3213Ia0.b
        public TransformationMethod f(TransformationMethod transformationMethod) {
            if (g()) {
                return transformationMethod;
            }
            return this.a.f(transformationMethod);
        }

        public final boolean g() {
            return !androidx.emoji2.text.c.q();
        }
    }

    public C3213Ia0(TextView textView) {
        this(textView, true);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.a.a(inputFilterArr);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(boolean z) {
        this.a.c(z);
    }

    public void d(boolean z) {
        this.a.d(z);
    }

    public void e() {
        this.a.e();
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.a.f(transformationMethod);
    }

    public C3213Ia0(TextView textView, boolean z) {
        C10907yF1.m(textView, "textView cannot be null");
        if (!z) {
            this.a = new c(textView);
        } else {
            this.a = new a(textView);
        }
    }

    /* renamed from: o.Ia0$b */
    /* loaded from: classes.dex */
    public static class b {
        public boolean b() {
            return false;
        }

        public void e() {
        }

        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public void c(boolean z) {
        }

        public void d(boolean z) {
        }

        public TransformationMethod f(TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }
}
