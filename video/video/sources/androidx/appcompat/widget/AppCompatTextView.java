package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import o.C10016uc;
import o.C10259vc;
import o.C11163zI2;
import o.C2578Bp2;
import o.C3220Ic;
import o.C3705Nb;
import o.C3807Oc;
import o.C3904Pc;
import o.C4930Zm2;
import o.C7234jF1;
import o.C8112mn2;
import o.C9128qw2;
import o.InterfaceC10984ya0;
import o.InterfaceC2981Fp2;
import o.InterfaceC3275Ip2;
import o.InterfaceC6117ei;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC2981Fp2, InterfaceC3275Ip2, InterfaceC6117ei, InterfaceC10984ya0 {
    public final C3705Nb Y0;
    public final C3904Pc Z0;
    public final C3807Oc a1;
    public C10016uc b1;
    public boolean c1;
    public a d1;
    public Future<C7234jF1> e1;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i);

        void b(int i, float f);

        TextClassifier c();

        void d(TextClassifier textClassifier);

        void e(int i);

        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i);

        void setAutoSizeTextTypeWithDefaults(int i);
    }

    /* loaded from: classes.dex */
    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i, float f) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public TextClassifier c() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void d(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void e(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeMaxTextSize() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeMinTextSize() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeStepGranularity() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int[] getAutoSizeTextAvailableSizes() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeTextType() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeWithDefaults(int i) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* loaded from: classes.dex */
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void a(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void e(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }
    }

    /* loaded from: classes.dex */
    public class d extends c {
        public d() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i, float f) {
            AppCompatTextView.super.setLineHeight(i, f);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private C10016uc getEmojiTextViewHelper() {
        if (this.b1 == null) {
            this.b1 = new C10016uc(this);
        }
        return this.b1;
    }

    public final void G() {
        Future<C7234jF1> future = this.e1;
        if (future != null) {
            try {
                this.e1 = null;
                C4930Zm2.C(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // o.InterfaceC10984ya0
    public boolean b() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.b();
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.b();
        }
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public int getAutoSizeMaxTextSize() {
        if (C11163zI2.d) {
            return getSuperCaller().getAutoSizeMaxTextSize();
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            return c3904Pc.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public int getAutoSizeMinTextSize() {
        if (C11163zI2.d) {
            return getSuperCaller().getAutoSizeMinTextSize();
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            return c3904Pc.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public int getAutoSizeStepGranularity() {
        if (C11163zI2.d) {
            return getSuperCaller().getAutoSizeStepGranularity();
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            return c3904Pc.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public int[] getAutoSizeTextAvailableSizes() {
        if (C11163zI2.d) {
            return getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            return c3904Pc.h();
        }
        return new int[0];
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public int getAutoSizeTextType() {
        if (C11163zI2.d) {
            if (getSuperCaller().getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc == null) {
            return 0;
        }
        return c3904Pc.i();
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4930Zm2.F(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C4930Zm2.i(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C4930Zm2.j(this);
    }

    public a getSuperCaller() {
        if (this.d1 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.d1 = new d();
            } else if (i >= 28) {
                this.d1 = new c();
            } else if (i >= 26) {
                this.d1 = new b();
            }
        }
        return this.d1;
    }

    @Override // o.InterfaceC2981Fp2
    public ColorStateList getSupportBackgroundTintList() {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            return c3705Nb.c();
        }
        return null;
    }

    @Override // o.InterfaceC2981Fp2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            return c3705Nb.d();
        }
        return null;
    }

    @Override // o.InterfaceC3275Ip2
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.Z0.j();
    }

    @Override // o.InterfaceC3275Ip2
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.Z0.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        G();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C3807Oc c3807Oc;
        if (Build.VERSION.SDK_INT < 28 && (c3807Oc = this.a1) != null) {
            return c3807Oc.a();
        }
        return getSuperCaller().c();
    }

    public C7234jF1.b getTextMetricsParamsCompat() {
        return C4930Zm2.o(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.Z0.r(this, onCreateInputConnection, editorInfo);
        return C10259vc.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        G();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null && !C11163zI2.d && c3904Pc.l()) {
            this.Z0.c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C11163zI2.d) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C11163zI2.d) {
            getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.u(iArr, i);
        }
    }

    @Override // android.widget.TextView, o.InterfaceC6117ei
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C11163zI2.d) {
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.v(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4930Zm2.G(this, callback));
    }

    @Override // o.InterfaceC10984ya0
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i);
        } else {
            C4930Zm2.y(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            C4930Zm2.z(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C4930Zm2.A(this, i);
    }

    public void setPrecomputedText(C7234jF1 c7234jF1) {
        C4930Zm2.C(this, c7234jF1);
    }

    @Override // o.InterfaceC2981Fp2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.i(colorStateList);
        }
    }

    @Override // o.InterfaceC2981Fp2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3705Nb c3705Nb = this.Y0;
        if (c3705Nb != null) {
            c3705Nb.j(mode);
        }
    }

    @Override // o.InterfaceC3275Ip2
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.Z0.w(colorStateList);
        this.Z0.b();
    }

    @Override // o.InterfaceC3275Ip2
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.Z0.x(mode);
        this.Z0.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C3807Oc c3807Oc;
        if (Build.VERSION.SDK_INT < 28 && (c3807Oc = this.a1) != null) {
            c3807Oc.b(textClassifier);
        } else {
            getSuperCaller().d(textClassifier);
        }
    }

    public void setTextFuture(Future<C7234jF1> future) {
        this.e1 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C7234jF1.b bVar) {
        C4930Zm2.E(this, bVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (C11163zI2.d) {
            super.setTextSize(i, f);
            return;
        }
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.A(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.c1) {
            return;
        }
        if (typeface != null && i > 0) {
            typeface2 = C9128qw2.b(getContext(), typeface, i);
        } else {
            typeface2 = null;
        }
        this.c1 = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.c1 = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().b(i, f);
        } else {
            C4930Zm2.B(this, i, f);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C2578Bp2.b(context), attributeSet, i);
        this.c1 = false;
        this.d1 = null;
        C8112mn2.a(this, getContext());
        C3705Nb c3705Nb = new C3705Nb(this);
        this.Y0 = c3705Nb;
        c3705Nb.e(attributeSet, i);
        C3904Pc c3904Pc = new C3904Pc(this);
        this.Z0 = c3904Pc;
        c3904Pc.m(attributeSet, i);
        c3904Pc.b();
        this.a1 = new C3807Oc(this);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C3220Ic.b(context, i) : null, i2 != 0 ? C3220Ic.b(context, i2) : null, i3 != 0 ? C3220Ic.b(context, i3) : null, i4 != 0 ? C3220Ic.b(context, i4) : null);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C3220Ic.b(context, i) : null, i2 != 0 ? C3220Ic.b(context, i2) : null, i3 != 0 ? C3220Ic.b(context, i3) : null, i4 != 0 ? C3220Ic.b(context, i4) : null);
        C3904Pc c3904Pc = this.Z0;
        if (c3904Pc != null) {
            c3904Pc.p();
        }
    }
}
