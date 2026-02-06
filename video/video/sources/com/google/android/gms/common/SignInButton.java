package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public static final int c1 = 0;
    public static final int d1 = 1;
    public static final int e1 = 2;
    public static final int f1 = 0;
    public static final int g1 = 1;
    public static final int h1 = 2;
    public int Y0;
    public int Z0;
    public View a1;
    @InterfaceC11300zs1
    public View.OnClickListener b1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ColorScheme {
    }

    public SignInButton(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public void a(int i, int i2) {
        this.Y0 = i;
        this.Z0 = i2;
        c(getContext());
    }

    @Deprecated
    public void b(int i, int i2, @InterfaceC5670cr1 Scope[] scopeArr) {
        a(i, i2);
    }

    public final void c(Context context) {
        View view = this.a1;
        if (view != null) {
            removeView(view);
        }
        try {
            this.a1 = zaz.c(context, this.Y0, this.Z0);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i = this.Y0;
            int i2 = this.Z0;
            zaaa zaaaVar = new zaaa(context, null);
            zaaaVar.a(context.getResources(), i, i2);
            this.a1 = zaaaVar;
        }
        addView(this.a1);
        this.a1.setEnabled(isEnabled());
        this.a1.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@InterfaceC5670cr1 View view) {
        View.OnClickListener onClickListener = this.b1;
        if (onClickListener != null && view == this.a1) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        a(this.Y0, i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.a1.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(@InterfaceC11300zs1 View.OnClickListener onClickListener) {
        this.b1 = onClickListener;
        View view = this.a1;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@InterfaceC5670cr1 Scope[] scopeArr) {
        a(this.Y0, this.Z0);
    }

    public void setSize(int i) {
        a(i, this.Z0);
    }

    public SignInButton(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b1 = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.google.android.gms.base.R.styleable.e, 0, 0);
        try {
            this.Y0 = obtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.f, 0);
            this.Z0 = obtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.g, 2);
            obtainStyledAttributes.recycle();
            a(this.Y0, this.Z0);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
