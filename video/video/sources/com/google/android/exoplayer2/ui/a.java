package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C3010Fy;
import o.C4702Xg2;
import o.C5146ah2;
import o.C7284jS;
import o.InterfaceC11300zs1;

@Deprecated
/* loaded from: classes2.dex */
public final class a extends View implements SubtitleView.a {
    public final List<C4702Xg2> Y0;
    public List<C7284jS> Z0;
    public int a1;
    public float b1;
    public C3010Fy c1;
    public float d1;

    public a(Context context) {
        this(context, null);
    }

    public static C7284jS b(C7284jS c7284jS) {
        C7284jS.c B = c7284jS.b().w(-3.4028235E38f).x(Integer.MIN_VALUE).B(null);
        if (c7284jS.a1 == 0) {
            B.t(1.0f - c7284jS.Z0, 0);
        } else {
            B.t((-c7284jS.Z0) - 1.0f, 1);
        }
        int i = c7284jS.b1;
        if (i != 0) {
            if (i == 2) {
                B.u(0);
            }
        } else {
            B.u(2);
        }
        return B.a();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<C7284jS> list, C3010Fy c3010Fy, float f, int i, float f2) {
        this.Z0 = list;
        this.c1 = c3010Fy;
        this.b1 = f;
        this.a1 = i;
        this.d1 = f2;
        while (this.Y0.size() < list.size()) {
            this.Y0.add(new C4702Xg2(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<C7284jS> list = this.Z0;
        if (!list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && width > paddingLeft) {
                int i = paddingBottom - paddingTop;
                float f = C5146ah2.f(this.a1, this.b1, height, i);
                if (f > 0.0f) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C7284jS c7284jS = list.get(i2);
                        if (c7284jS.k1 != Integer.MIN_VALUE) {
                            c7284jS = b(c7284jS);
                        }
                        this.Y0.get(i2).b(c7284jS, this.c1, f, C5146ah2.f(c7284jS.i1, c7284jS.j1, height, i), this.d1, canvas, paddingLeft, paddingTop, width, paddingBottom);
                    }
                }
            }
        }
    }

    public a(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = new ArrayList();
        this.Z0 = Collections.EMPTY_LIST;
        this.a1 = 0;
        this.b1 = 0.0533f;
        this.c1 = C3010Fy.m;
        this.d1 = 0.08f;
    }
}
