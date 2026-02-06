package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C3010Fy;
import o.C5146ah2;
import o.C7284jS;
import o.InterfaceC11300zs1;
import o.InterfaceC9397s30;
import o.TD2;

@Deprecated
/* loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout {
    public static final float i1 = 0.0533f;
    public static final float j1 = 0.08f;
    public static final int k1 = 1;
    public static final int l1 = 2;
    public List<C7284jS> Y0;
    public C3010Fy Z0;
    public int a1;
    public float b1;
    public float c1;
    public boolean d1;
    public boolean e1;
    public int f1;
    public a g1;
    public View h1;

    /* loaded from: classes2.dex */
    public interface a {
        void a(List<C7284jS> list, C3010Fy c3010Fy, float f, int i, float f2);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private List<C7284jS> getCuesWithStylingPreferencesApplied() {
        if (this.d1 && this.e1) {
            return this.Y0;
        }
        ArrayList arrayList = new ArrayList(this.Y0.size());
        for (int i = 0; i < this.Y0.size(); i++) {
            arrayList.add(a(this.Y0.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (TD2.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C3010Fy getUserCaptionStyle() {
        if (TD2.a >= 19 && !isInEditMode()) {
            CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
            if (captioningManager != null && captioningManager.isEnabled()) {
                return C3010Fy.a(captioningManager.getUserStyle());
            }
            return C3010Fy.m;
        }
        return C3010Fy.m;
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.h1);
        View view = this.h1;
        if (view instanceof n) {
            ((n) view).g();
        }
        this.h1 = t;
        this.g1 = t;
        addView(t);
    }

    public final C7284jS a(C7284jS c7284jS) {
        C7284jS.c b2 = c7284jS.b();
        if (!this.d1) {
            C5146ah2.c(b2);
        } else if (!this.e1) {
            C5146ah2.d(b2);
        }
        return b2.a();
    }

    public void b(@InterfaceC9397s30 int i, float f) {
        Resources resources;
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        d(2, TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    public void c(float f, boolean z) {
        d(z ? 1 : 0, f);
    }

    public final void d(int i, float f) {
        this.a1 = i;
        this.b1 = f;
        g();
    }

    public void e() {
        setStyle(getUserCaptionStyle());
    }

    public void f() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void g() {
        this.g1.a(getCuesWithStylingPreferencesApplied(), this.Z0, this.b1, this.a1, this.c1);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.e1 = z;
        g();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.d1 = z;
        g();
    }

    public void setBottomPaddingFraction(float f) {
        this.c1 = f;
        g();
    }

    public void setCues(@InterfaceC11300zs1 List<C7284jS> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.Y0 = list;
        g();
    }

    public void setFractionalTextSize(float f) {
        c(f, false);
    }

    public void setStyle(C3010Fy c3010Fy) {
        this.Z0 = c3010Fy;
        g();
    }

    public void setViewType(int i) {
        if (this.f1 == i) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                setView(new n(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new com.google.android.exoplayer2.ui.a(getContext()));
        }
        this.f1 = i;
    }

    public SubtitleView(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = Collections.EMPTY_LIST;
        this.Z0 = C3010Fy.m;
        this.a1 = 0;
        this.b1 = 0.0533f;
        this.c1 = 0.08f;
        this.d1 = true;
        this.e1 = true;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context);
        this.g1 = aVar;
        this.h1 = aVar;
        addView(aVar);
        this.f1 = 1;
    }
}
