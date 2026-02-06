package com.facebook;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.facebook.common.b;
import o.C10201vM;
import o.C6562gT0;
import o.InterfaceC5486c6;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ResourceType"})
/* renamed from: com.facebook.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2410t extends Button {
    @NotNull
    public final String Y0;
    @NotNull
    public final String Z0;
    @Nullable
    public View.OnClickListener a1;
    @Nullable
    public View.OnClickListener b1;
    public boolean c1;
    public int d1;
    public int e1;
    @Nullable
    public com.facebook.internal.I f1;
    public final int g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2410t(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2, @NotNull String str, @NotNull String str2) {
        super(context, attributeSet, 0);
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "analyticsButtonCreatedEventName");
        C6562gT0.p(str2, "analyticsButtonTappedEventName");
        i2 = i2 == 0 ? getDefaultStyleResource() : i2;
        c(context, attributeSet, i, i2 == 0 ? b.m.Y5 : i2);
        this.Y0 = str;
        this.Z0 = str2;
        setClickable(true);
        setFocusable(true);
    }

    public static final void l(AbstractC2410t abstractC2410t, View view) {
        if (!SQ.e(AbstractC2410t.class)) {
            try {
                C6562gT0.p(abstractC2410t, "this$0");
                abstractC2410t.e(abstractC2410t.getContext());
                View.OnClickListener onClickListener = abstractC2410t.b1;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                View.OnClickListener onClickListener2 = abstractC2410t.a1;
                if (onClickListener2 == null) {
                    return;
                }
                onClickListener2.onClick(view);
            } catch (Throwable th) {
                SQ.c(th, AbstractC2410t.class);
            }
        }
    }

    public void b(@Nullable View view) {
        if (!SQ.e(this)) {
            try {
                View.OnClickListener onClickListener = this.a1;
                if (onClickListener == null) {
                    return;
                }
                onClickListener.onClick(view);
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public void c(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(context, "context");
            g(context, attributeSet, i, i2);
            h(context, attributeSet, i, i2);
            i(context, attributeSet, i, i2);
            j(context, attributeSet, i, i2);
            k();
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public void d(@Nullable Context context) {
        if (SQ.e(this)) {
            return;
        }
        try {
            com.facebook.appevents.K.b.b(context, null).l(this.Y0);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public void e(@Nullable Context context) {
        if (SQ.e(this)) {
            return;
        }
        try {
            com.facebook.appevents.K.b.b(context, null).l(this.Z0);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public int f(@Nullable String str) {
        if (SQ.e(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil(getPaint().measureText(str));
        } catch (Throwable th) {
            SQ.c(th, this);
            return 0;
        }
    }

    public final void g(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!SQ.e(this)) {
            try {
                if (isInEditMode()) {
                    return;
                }
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i, i2);
                C6562gT0.o(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(C10201vM.g(context, b.e.V));
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @NotNull
    public Activity getActivity() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new C2416z("Unable to get Activity.");
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @NotNull
    public final String getAnalyticsButtonCreatedEventName() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.Y0;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @NotNull
    public final String getAnalyticsButtonTappedEventName() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.Z0;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @Nullable
    public final InterfaceC5486c6 getAndroidxActivityResultRegistryOwner() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            Activity activity = getActivity();
            if (!(activity instanceof InterfaceC5486c6)) {
                return null;
            }
            return (InterfaceC5486c6) activity;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (SQ.e(this)) {
            return 0;
        }
        try {
            if (this.c1) {
                return this.d1;
            }
            return super.getCompoundPaddingLeft();
        } catch (Throwable th) {
            SQ.c(th, this);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (SQ.e(this)) {
            return 0;
        }
        try {
            if (this.c1) {
                return this.e1;
            }
            return super.getCompoundPaddingRight();
        } catch (Throwable th) {
            SQ.c(th, this);
            return 0;
        }
    }

    public abstract int getDefaultRequestCode();

    public int getDefaultStyleResource() {
        if (SQ.e(this)) {
            return 0;
        }
        try {
            return this.g1;
        } catch (Throwable th) {
            SQ.c(th, this);
            return 0;
        }
    }

    @Nullable
    public final Fragment getFragment() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            com.facebook.internal.I i = this.f1;
            if (i == null) {
                return null;
            }
            return i.c();
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @Nullable
    public final android.app.Fragment getNativeFragment() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            com.facebook.internal.I i = this.f1;
            if (i == null) {
                return null;
            }
            return i.b();
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public int getRequestCode() {
        if (SQ.e(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th) {
            SQ.c(th, this);
            return 0;
        }
    }

    @SuppressLint({"ResourceType"})
    public final void h(Context context, AttributeSet attributeSet, int i, int i2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i, i2);
            C6562gT0.o(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
            setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            obtainStyledAttributes.recycle();
            setCompoundDrawablePadding(dimensionPixelSize);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void i(Context context, AttributeSet attributeSet, int i, int i2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i, i2);
            C6562gT0.o(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
            setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void j(Context context, AttributeSet attributeSet, int i, int i2) {
        if (SQ.e(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i, i2);
            C6562gT0.o(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, colorResources, defStyleAttr, defStyleRes)");
            setTextColor(obtainStyledAttributes.getColorStateList(0));
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i, i2);
            C6562gT0.o(obtainStyledAttributes2, "context.theme.obtainStyledAttributes(attrs, gravityResources, defStyleAttr, defStyleRes)");
            int i3 = obtainStyledAttributes2.getInt(0, 17);
            obtainStyledAttributes2.recycle();
            setGravity(i3);
            TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i, i2);
            C6562gT0.o(obtainStyledAttributes3, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
            setTextSize(0, obtainStyledAttributes3.getDimensionPixelSize(0, 0));
            setTypeface(Typeface.create(getTypeface(), 1));
            String string = obtainStyledAttributes3.getString(2);
            obtainStyledAttributes3.recycle();
            setText(string);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void k() {
        if (SQ.e(this)) {
            return;
        }
        try {
            super.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC2410t.l(AbstractC2410t.this, view);
                }
            });
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (!SQ.e(this)) {
            try {
                super.onAttachedToWindow();
                if (!isInEditMode()) {
                    d(getContext());
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(canvas, "canvas");
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - f(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.d1 = compoundPaddingLeft - min;
                this.e1 = compoundPaddingRight + min;
                this.c1 = true;
            }
            super.onDraw(canvas);
            this.c1 = false;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void setFragment(@NotNull android.app.Fragment fragment) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(fragment, "fragment");
            this.f1 = new com.facebook.internal.I(fragment);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public void setInternalOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (SQ.e(this)) {
            return;
        }
        try {
            this.b1 = onClickListener;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (SQ.e(this)) {
            return;
        }
        try {
            this.a1 = onClickListener;
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }

    public final void setFragment(@NotNull Fragment fragment) {
        if (SQ.e(this)) {
            return;
        }
        try {
            C6562gT0.p(fragment, "fragment");
            this.f1 = new com.facebook.internal.I(fragment);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }
}
