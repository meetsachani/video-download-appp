package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.C11163zI2;
import o.C2872Ep2;
import o.C6516gH2;
import o.C9811tl1;
import o.JE0;
import o.OL1;

/* loaded from: classes.dex */
public class d extends ViewGroup {
    public static final int n1 = 0;
    public static final int o1 = 1;
    public static final int p1 = 0;
    public static final int q1 = 1;
    public static final int r1 = 2;
    public static final int s1 = 4;
    public static final int t1 = 4;
    public static final int u1 = 0;
    public static final int v1 = 1;
    public static final int w1 = 2;
    public static final int x1 = 3;
    public static final String y1 = "androidx.appcompat.widget.LinearLayoutCompat";
    public boolean Y0;
    public int Z0;
    public int a1;
    public int b1;
    public int c1;
    public int d1;
    public float e1;
    public boolean f1;
    public int[] g1;
    public int[] h1;
    public Drawable i1;
    public int j1;
    public int k1;
    public int l1;
    public int m1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* loaded from: classes.dex */
    public static class b extends LinearLayout.LayoutParams {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(int i, int i2, float f) {
            super(i, i2, f);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public d(Context context) {
        this(context, null);
    }

    private void E(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    private void k(int i, int i2) {
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View u = u(i4);
            if (u.getVisibility() != 8) {
                b bVar = (b) u.getLayoutParams();
                if (((LinearLayout.LayoutParams) bVar).width == -1) {
                    int i5 = ((LinearLayout.LayoutParams) bVar).height;
                    ((LinearLayout.LayoutParams) bVar).height = u.getMeasuredHeight();
                    i3 = i2;
                    measureChildWithMargins(u, makeMeasureSpec, 0, i3, 0);
                    ((LinearLayout.LayoutParams) bVar).height = i5;
                    i4++;
                    i2 = i3;
                }
            }
            i3 = i2;
            i4++;
            i2 = i3;
        }
    }

    public void A(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0461  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int max;
        float f;
        int i5;
        int i6;
        int i7;
        int max2;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        boolean z3;
        int baseline;
        int i12;
        int i13;
        float f2;
        int i14;
        char c2;
        int i15;
        boolean z4;
        int i16;
        int i17;
        int i18;
        int[] iArr;
        int i19;
        int i20;
        boolean z5;
        int[] iArr2;
        View view;
        boolean z6;
        boolean z7;
        int baseline2;
        this.d1 = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.g1 == null || this.h1 == null) {
            this.g1 = new int[4];
            this.h1 = new int[4];
        }
        int[] iArr3 = this.g1;
        int[] iArr4 = this.h1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z8 = this.Y0;
        boolean z9 = this.f1;
        int i21 = 1073741824;
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        boolean z10 = z9;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean z11 = false;
        int i25 = 0;
        boolean z12 = false;
        boolean z13 = true;
        float f3 = 0.0f;
        int i26 = 0;
        int i27 = 0;
        while (true) {
            i3 = i23;
            if (i22 >= virtualChildCount) {
                break;
            }
            boolean z14 = z8;
            View u = u(i22);
            if (u == null) {
                this.d1 += C(i22);
            } else if (u.getVisibility() == 8) {
                i22 += o(u, i22);
            } else {
                if (v(i22)) {
                    this.d1 += this.j1;
                }
                b bVar = (b) u.getLayoutParams();
                float f4 = ((LinearLayout.LayoutParams) bVar).weight;
                float f5 = f3 + f4;
                if (mode == i21 && ((LinearLayout.LayoutParams) bVar).width == 0 && f4 > 0.0f) {
                    if (z) {
                        this.d1 += ((LinearLayout.LayoutParams) bVar).leftMargin + ((LinearLayout.LayoutParams) bVar).rightMargin;
                    } else {
                        int i28 = this.d1;
                        this.d1 = Math.max(i28, ((LinearLayout.LayoutParams) bVar).leftMargin + i28 + ((LinearLayout.LayoutParams) bVar).rightMargin);
                    }
                    if (z14) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        u.measure(makeMeasureSpec, makeMeasureSpec);
                        i17 = virtualChildCount;
                        i18 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                    } else {
                        i17 = virtualChildCount;
                        i18 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        z11 = true;
                    }
                    i19 = i3;
                    i20 = 1073741824;
                    z5 = z10;
                    view = u;
                } else {
                    if (((LinearLayout.LayoutParams) bVar).width == 0 && f4 > 0.0f) {
                        c2 = 65534;
                        ((LinearLayout.LayoutParams) bVar).width = -2;
                        i15 = 0;
                    } else {
                        c2 = 65534;
                        i15 = Integer.MIN_VALUE;
                    }
                    if (f5 == 0.0f) {
                        z4 = z10;
                        i16 = this.d1;
                    } else {
                        z4 = z10;
                        i16 = 0;
                    }
                    i17 = virtualChildCount;
                    i18 = mode;
                    iArr = iArr3;
                    i19 = i3;
                    i20 = 1073741824;
                    z5 = z4;
                    iArr2 = iArr4;
                    int i29 = i15;
                    A(u, i22, i, i16, i2, 0);
                    view = u;
                    if (i29 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) bVar).width = i29;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    if (z) {
                        this.d1 += ((LinearLayout.LayoutParams) bVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) bVar).rightMargin + t(view);
                    } else {
                        int i30 = this.d1;
                        this.d1 = Math.max(i30, i30 + measuredWidth + ((LinearLayout.LayoutParams) bVar).leftMargin + ((LinearLayout.LayoutParams) bVar).rightMargin + t(view));
                    }
                    if (z5) {
                        i24 = Math.max(measuredWidth, i24);
                    }
                }
                if (mode2 != i20 && ((LinearLayout.LayoutParams) bVar).height == -1) {
                    z6 = true;
                    z12 = true;
                } else {
                    z6 = false;
                }
                int i31 = ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin;
                int measuredHeight = view.getMeasuredHeight() + i31;
                i25 = View.combineMeasuredStates(i25, view.getMeasuredState());
                if (z14 && (baseline2 = view.getBaseline()) != -1) {
                    int i32 = ((LinearLayout.LayoutParams) bVar).gravity;
                    if (i32 < 0) {
                        i32 = this.c1;
                    }
                    int i33 = (((i32 & 112) >> 4) & (-2)) >> 1;
                    z7 = z6;
                    iArr[i33] = Math.max(iArr[i33], baseline2);
                    iArr2[i33] = Math.max(iArr2[i33], measuredHeight - baseline2);
                } else {
                    z7 = z6;
                }
                int max3 = Math.max(i19, measuredHeight);
                if (z13 && ((LinearLayout.LayoutParams) bVar).height == -1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (((LinearLayout.LayoutParams) bVar).weight > 0.0f) {
                    if (!z7) {
                        i31 = measuredHeight;
                    }
                    i27 = Math.max(i27, i31);
                } else {
                    if (!z7) {
                        i31 = measuredHeight;
                    }
                    i26 = Math.max(i26, i31);
                }
                i22 += o(view, i22);
                i23 = max3;
                f3 = f5;
                i22++;
                z10 = z5;
                iArr4 = iArr2;
                z8 = z14;
                mode = i18;
                iArr3 = iArr;
                virtualChildCount = i17;
                i21 = 1073741824;
            }
            i17 = virtualChildCount;
            i18 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            i23 = i3;
            z5 = z10;
            i22++;
            z10 = z5;
            iArr4 = iArr2;
            z8 = z14;
            mode = i18;
            iArr3 = iArr;
            virtualChildCount = i17;
            i21 = 1073741824;
        }
        boolean z15 = z8;
        int i34 = virtualChildCount;
        int i35 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i36 = i25;
        boolean z16 = z10;
        if (this.d1 > 0) {
            i4 = i34;
            if (v(i4)) {
                this.d1 += this.j1;
            }
        } else {
            i4 = i34;
        }
        int i37 = iArr5[1];
        if (i37 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) {
            max = i3;
        } else {
            max = Math.max(i3, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i37, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
        }
        if (z16) {
            i5 = i35;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                this.d1 = 0;
                int i38 = 0;
                while (i38 < i4) {
                    View u2 = u(i38);
                    if (u2 == null) {
                        this.d1 += C(i38);
                    } else if (u2.getVisibility() == 8) {
                        i38 += o(u2, i38);
                    } else {
                        b bVar2 = (b) u2.getLayoutParams();
                        if (z) {
                            f2 = f3;
                            this.d1 += ((LinearLayout.LayoutParams) bVar2).leftMargin + i24 + ((LinearLayout.LayoutParams) bVar2).rightMargin + t(u2);
                            i14 = max;
                            i38++;
                            f3 = f2;
                            max = i14;
                        } else {
                            f2 = f3;
                            int i39 = this.d1;
                            i14 = max;
                            this.d1 = Math.max(i39, i39 + i24 + ((LinearLayout.LayoutParams) bVar2).leftMargin + ((LinearLayout.LayoutParams) bVar2).rightMargin + t(u2));
                            i38++;
                            f3 = f2;
                            max = i14;
                        }
                    }
                    f2 = f3;
                    i14 = max;
                    i38++;
                    f3 = f2;
                    max = i14;
                }
            }
            f = f3;
        } else {
            f = f3;
            i5 = i35;
        }
        int i40 = max;
        int paddingLeft = this.d1 + getPaddingLeft() + getPaddingRight();
        this.d1 = paddingLeft;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
        int i41 = (16777215 & resolveSizeAndState) - this.d1;
        if (!z11 && (i41 == 0 || f <= 0.0f)) {
            i9 = Math.max(i26, i27);
            if (z16 && i5 != 1073741824) {
                for (int i42 = 0; i42 < i4; i42++) {
                    View u3 = u(i42);
                    if (u3 != null && u3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((b) u3.getLayoutParams())).weight > 0.0f) {
                        u3.measure(View.MeasureSpec.makeMeasureSpec(i24, 1073741824), View.MeasureSpec.makeMeasureSpec(u3.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = resolveSizeAndState;
            i8 = i36;
            i7 = -16777216;
        } else {
            float f6 = this.e1;
            if (f6 > 0.0f) {
                f = f6;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            this.d1 = 0;
            int i43 = i36;
            int i44 = -1;
            int i45 = 0;
            while (i45 < i4) {
                View u4 = u(i45);
                if (u4 == null || u4.getVisibility() == 8) {
                    i10 = resolveSizeAndState;
                } else {
                    b bVar3 = (b) u4.getLayoutParams();
                    float f7 = ((LinearLayout.LayoutParams) bVar3).weight;
                    if (f7 > 0.0f) {
                        int i46 = (int) ((i41 * f7) / f);
                        f -= f7;
                        i41 -= i46;
                        i10 = resolveSizeAndState;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) bVar3).topMargin + ((LinearLayout.LayoutParams) bVar3).bottomMargin, ((LinearLayout.LayoutParams) bVar3).height);
                        if (((LinearLayout.LayoutParams) bVar3).width == 0) {
                            i13 = 1073741824;
                            if (i5 == 1073741824) {
                                if (i46 <= 0) {
                                    i46 = 0;
                                }
                                u4.measure(View.MeasureSpec.makeMeasureSpec(i46, 1073741824), childMeasureSpec);
                                i43 = View.combineMeasuredStates(i43, u4.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i13 = 1073741824;
                        }
                        int measuredWidth2 = u4.getMeasuredWidth() + i46;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        u4.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i13), childMeasureSpec);
                        i43 = View.combineMeasuredStates(i43, u4.getMeasuredState() & (-16777216));
                    } else {
                        i10 = resolveSizeAndState;
                    }
                    if (z) {
                        this.d1 += u4.getMeasuredWidth() + ((LinearLayout.LayoutParams) bVar3).leftMargin + ((LinearLayout.LayoutParams) bVar3).rightMargin + t(u4);
                    } else {
                        int i47 = this.d1;
                        this.d1 = Math.max(i47, u4.getMeasuredWidth() + i47 + ((LinearLayout.LayoutParams) bVar3).leftMargin + ((LinearLayout.LayoutParams) bVar3).rightMargin + t(u4));
                    }
                    if (mode2 != 1073741824 && ((LinearLayout.LayoutParams) bVar3).height == -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i48 = ((LinearLayout.LayoutParams) bVar3).topMargin + ((LinearLayout.LayoutParams) bVar3).bottomMargin;
                    int measuredHeight2 = u4.getMeasuredHeight() + i48;
                    i44 = Math.max(i44, measuredHeight2);
                    if (!z2) {
                        i48 = measuredHeight2;
                    }
                    int max4 = Math.max(i26, i48);
                    if (z13) {
                        i11 = -1;
                        if (((LinearLayout.LayoutParams) bVar3).height == -1) {
                            z3 = true;
                            if (z15 && (baseline = u4.getBaseline()) != i11) {
                                i12 = ((LinearLayout.LayoutParams) bVar3).gravity;
                                if (i12 < 0) {
                                    i12 = this.c1;
                                }
                                int i49 = (((i12 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i49] = Math.max(iArr5[i49], baseline);
                                iArr6[i49] = Math.max(iArr6[i49], measuredHeight2 - baseline);
                            }
                            i26 = max4;
                            z13 = z3;
                        }
                    } else {
                        i11 = -1;
                    }
                    z3 = false;
                    if (z15) {
                        i12 = ((LinearLayout.LayoutParams) bVar3).gravity;
                        if (i12 < 0) {
                        }
                        int i492 = (((i12 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i492] = Math.max(iArr5[i492], baseline);
                        iArr6[i492] = Math.max(iArr6[i492], measuredHeight2 - baseline);
                    }
                    i26 = max4;
                    z13 = z3;
                }
                i45++;
                resolveSizeAndState = i10;
            }
            i6 = resolveSizeAndState;
            i7 = -16777216;
            this.d1 += getPaddingLeft() + getPaddingRight();
            int i50 = iArr5[1];
            if (i50 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) {
                max2 = i44;
            } else {
                max2 = Math.max(i44, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i50, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
            }
            i40 = max2;
            i8 = i43;
            i9 = i26;
        }
        if (z13 || mode2 == 1073741824) {
            i9 = i40;
        }
        setMeasuredDimension(i6 | (i8 & i7), View.resolveSizeAndState(Math.max(i9 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i8 << 16));
        if (z12) {
            j(i4, i);
        }
    }

    public int C(int i) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        View view;
        boolean z2;
        int i17;
        boolean z3;
        int max;
        int i18;
        this.d1 = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i19 = this.Z0;
        boolean z4 = this.f1;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        boolean z5 = false;
        boolean z6 = false;
        float f = 0.0f;
        boolean z7 = true;
        while (true) {
            int i26 = 8;
            if (i20 < virtualChildCount) {
                float f2 = f;
                View u = u(i20);
                if (u == null) {
                    this.d1 += C(i20);
                } else if (u.getVisibility() == 8) {
                    i20 += o(u, i20);
                } else {
                    if (v(i20)) {
                        this.d1 += this.k1;
                    }
                    b bVar = (b) u.getLayoutParams();
                    float f3 = ((LinearLayout.LayoutParams) bVar).weight;
                    float f4 = f2 + f3;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) bVar).height == 0 && f3 > 0.0f) {
                        int i27 = this.d1;
                        this.d1 = Math.max(i27, ((LinearLayout.LayoutParams) bVar).topMargin + i27 + ((LinearLayout.LayoutParams) bVar).bottomMargin);
                        i17 = i21;
                        i13 = virtualChildCount;
                        i14 = mode2;
                        z5 = true;
                        view = u;
                        i16 = i23;
                        i15 = i24;
                        z2 = z4;
                    } else {
                        if (((LinearLayout.LayoutParams) bVar).height == 0 && f3 > 0.0f) {
                            ((LinearLayout.LayoutParams) bVar).height = -2;
                            i10 = 0;
                        } else {
                            i10 = Integer.MIN_VALUE;
                        }
                        if (f4 == 0.0f) {
                            int i28 = i24;
                            i12 = this.d1;
                            i11 = i28;
                        } else {
                            i11 = i24;
                            i12 = 0;
                        }
                        int i29 = i22;
                        i13 = virtualChildCount;
                        i14 = mode2;
                        i15 = i11;
                        i16 = i23;
                        view = u;
                        z2 = z4;
                        i17 = i21;
                        A(view, i20, i, 0, i2, i12);
                        if (i10 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) bVar).height = i10;
                        }
                        int measuredHeight = view.getMeasuredHeight();
                        int i30 = this.d1;
                        this.d1 = Math.max(i30, i30 + measuredHeight + ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin + t(view));
                        if (z2) {
                            i22 = Math.max(measuredHeight, i29);
                        } else {
                            i22 = i29;
                        }
                    }
                    if (i19 >= 0 && i19 == i20 + 1) {
                        this.a1 = this.d1;
                    }
                    if (i20 < i19 && ((LinearLayout.LayoutParams) bVar).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode != 1073741824 && ((LinearLayout.LayoutParams) bVar).width == -1) {
                        z3 = true;
                        z6 = true;
                    } else {
                        z3 = false;
                    }
                    int i31 = ((LinearLayout.LayoutParams) bVar).leftMargin + ((LinearLayout.LayoutParams) bVar).rightMargin;
                    int measuredWidth = view.getMeasuredWidth() + i31;
                    max = Math.max(i16, measuredWidth);
                    int i32 = i22;
                    int combineMeasuredStates = View.combineMeasuredStates(i15, view.getMeasuredState());
                    if (z7) {
                        i18 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) bVar).width == -1) {
                            z7 = true;
                            if (((LinearLayout.LayoutParams) bVar).weight <= 0.0f) {
                                if (!z3) {
                                    i31 = measuredWidth;
                                }
                                i17 = Math.max(i17, i31);
                            } else {
                                if (!z3) {
                                    i31 = measuredWidth;
                                }
                                i25 = Math.max(i25, i31);
                            }
                            i20 += o(view, i20);
                            f = f4;
                            i22 = i32;
                            i24 = i18;
                            i20++;
                            i23 = max;
                            i21 = i17;
                            z4 = z2;
                            mode2 = i14;
                            virtualChildCount = i13;
                        }
                    } else {
                        i18 = combineMeasuredStates;
                    }
                    z7 = false;
                    if (((LinearLayout.LayoutParams) bVar).weight <= 0.0f) {
                    }
                    i20 += o(view, i20);
                    f = f4;
                    i22 = i32;
                    i24 = i18;
                    i20++;
                    i23 = max;
                    i21 = i17;
                    z4 = z2;
                    mode2 = i14;
                    virtualChildCount = i13;
                }
                i17 = i21;
                i13 = virtualChildCount;
                i14 = mode2;
                z2 = z4;
                f = f2;
                max = i23;
                i20++;
                i23 = max;
                i21 = i17;
                z4 = z2;
                mode2 = i14;
                virtualChildCount = i13;
            } else {
                float f5 = f;
                int i33 = i21;
                int i34 = virtualChildCount;
                int i35 = mode2;
                boolean z8 = z4;
                int i36 = i22;
                int i37 = i23;
                int i38 = i24;
                if (this.d1 > 0) {
                    i3 = i34;
                    if (v(i3)) {
                        this.d1 += this.k1;
                    }
                } else {
                    i3 = i34;
                }
                int i39 = i35;
                if (z8 && (i39 == Integer.MIN_VALUE || i39 == 0)) {
                    this.d1 = 0;
                    int i40 = 0;
                    while (i40 < i3) {
                        View u2 = u(i40);
                        if (u2 == null) {
                            this.d1 += C(i40);
                        } else if (u2.getVisibility() == i26) {
                            i40 += o(u2, i40);
                        } else {
                            b bVar2 = (b) u2.getLayoutParams();
                            int i41 = this.d1;
                            this.d1 = Math.max(i41, i41 + i36 + ((LinearLayout.LayoutParams) bVar2).topMargin + ((LinearLayout.LayoutParams) bVar2).bottomMargin + t(u2));
                        }
                        i40++;
                        i26 = 8;
                    }
                }
                int paddingTop = this.d1 + getPaddingTop() + getPaddingBottom();
                this.d1 = paddingTop;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
                int i42 = (16777215 & resolveSizeAndState) - this.d1;
                if (!z5 && (i42 == 0 || f5 <= 0.0f)) {
                    i4 = Math.max(i25, i33);
                    if (z8 && i39 != 1073741824) {
                        for (int i43 = 0; i43 < i3; i43++) {
                            View u3 = u(i43);
                            if (u3 != null && u3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((b) u3.getLayoutParams())).weight > 0.0f) {
                                u3.measure(View.MeasureSpec.makeMeasureSpec(u3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i36, 1073741824));
                            }
                        }
                    }
                } else {
                    float f6 = this.e1;
                    if (f6 <= 0.0f) {
                        f6 = f5;
                    }
                    this.d1 = 0;
                    float f7 = f6;
                    int i44 = i42;
                    int i45 = 0;
                    while (i45 < i3) {
                        View u4 = u(i45);
                        if (u4.getVisibility() == 8) {
                            i5 = i39;
                            i6 = i45;
                        } else {
                            b bVar3 = (b) u4.getLayoutParams();
                            float f8 = ((LinearLayout.LayoutParams) bVar3).weight;
                            if (f8 > 0.0f) {
                                i6 = i45;
                                int i46 = (int) ((i44 * f8) / f7);
                                f7 -= f8;
                                i44 -= i46;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) bVar3).leftMargin + ((LinearLayout.LayoutParams) bVar3).rightMargin, ((LinearLayout.LayoutParams) bVar3).width);
                                if (((LinearLayout.LayoutParams) bVar3).height == 0) {
                                    i8 = 1073741824;
                                    if (i39 == 1073741824) {
                                        i5 = i39;
                                        if (i46 > 0) {
                                            i9 = i46;
                                        } else {
                                            i9 = 0;
                                        }
                                        u4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                                        i38 = View.combineMeasuredStates(i38, u4.getMeasuredState() & (-256));
                                    }
                                } else {
                                    i8 = 1073741824;
                                }
                                i5 = i39;
                                int measuredHeight2 = u4.getMeasuredHeight() + i46;
                                if (measuredHeight2 < 0) {
                                    measuredHeight2 = 0;
                                }
                                u4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i8));
                                i38 = View.combineMeasuredStates(i38, u4.getMeasuredState() & (-256));
                            } else {
                                i5 = i39;
                                i6 = i45;
                            }
                            int i47 = ((LinearLayout.LayoutParams) bVar3).leftMargin + ((LinearLayout.LayoutParams) bVar3).rightMargin;
                            int measuredWidth2 = u4.getMeasuredWidth() + i47;
                            i37 = Math.max(i37, measuredWidth2);
                            if (mode != 1073741824) {
                                i7 = -1;
                                if (((LinearLayout.LayoutParams) bVar3).width == -1) {
                                    measuredWidth2 = i47;
                                }
                            } else {
                                i7 = -1;
                            }
                            int max2 = Math.max(i25, measuredWidth2);
                            if (z7 && ((LinearLayout.LayoutParams) bVar3).width == i7) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int i48 = this.d1;
                            this.d1 = Math.max(i48, i48 + u4.getMeasuredHeight() + ((LinearLayout.LayoutParams) bVar3).topMargin + ((LinearLayout.LayoutParams) bVar3).bottomMargin + t(u4));
                            i25 = max2;
                            z7 = z;
                        }
                        i45 = i6 + 1;
                        i39 = i5;
                    }
                    this.d1 += getPaddingTop() + getPaddingBottom();
                    i4 = i25;
                }
                if (!z7 && mode != 1073741824) {
                    i37 = i4;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i37 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, i38), resolveSizeAndState);
                if (z6) {
                    k(i3, i2);
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public void e(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean b2 = C11163zI2.b(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View u = u(i2);
            if (u != null && u.getVisibility() != 8 && v(i2)) {
                b bVar = (b) u.getLayoutParams();
                if (b2) {
                    left2 = u.getRight() + ((LinearLayout.LayoutParams) bVar).rightMargin;
                } else {
                    left2 = (u.getLeft() - ((LinearLayout.LayoutParams) bVar).leftMargin) - this.j1;
                }
                i(canvas, left2);
            }
        }
        if (v(virtualChildCount)) {
            View u2 = u(virtualChildCount - 1);
            if (u2 == null) {
                if (b2) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i = this.j1;
                    right = left - i;
                }
            } else {
                b bVar2 = (b) u2.getLayoutParams();
                if (b2) {
                    left = u2.getLeft() - ((LinearLayout.LayoutParams) bVar2).leftMargin;
                    i = this.j1;
                    right = left - i;
                } else {
                    right = u2.getRight() + ((LinearLayout.LayoutParams) bVar2).rightMargin;
                }
            }
            i(canvas, right);
        }
    }

    public void f(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View u = u(i);
            if (u != null && u.getVisibility() != 8 && v(i)) {
                h(canvas, (u.getTop() - ((LinearLayout.LayoutParams) ((b) u.getLayoutParams())).topMargin) - this.k1);
            }
        }
        if (v(virtualChildCount)) {
            View u2 = u(virtualChildCount - 1);
            if (u2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.k1;
            } else {
                bottom = u2.getBottom() + ((LinearLayout.LayoutParams) ((b) u2.getLayoutParams())).bottomMargin;
            }
            h(canvas, bottom);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.Z0 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.Z0;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.Z0 == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.a1;
            if (this.b1 == 1 && (i = this.c1 & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.d1;
                    }
                } else {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.d1) / 2;
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((b) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.Z0;
    }

    public Drawable getDividerDrawable() {
        return this.i1;
    }

    public int getDividerPadding() {
        return this.m1;
    }

    public int getDividerWidth() {
        return this.j1;
    }

    public int getGravity() {
        return this.c1;
    }

    public int getOrientation() {
        return this.b1;
    }

    public int getShowDividers() {
        return this.l1;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.e1;
    }

    public void h(Canvas canvas, int i) {
        this.i1.setBounds(getPaddingLeft() + this.m1, i, (getWidth() - getPaddingRight()) - this.m1, this.k1 + i);
        this.i1.draw(canvas);
    }

    public void i(Canvas canvas, int i) {
        this.i1.setBounds(i, getPaddingTop() + this.m1, this.j1 + i, (getHeight() - getPaddingBottom()) - this.m1);
        this.i1.draw(canvas);
    }

    public final void j(int i, int i2) {
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View u = u(i4);
            if (u.getVisibility() != 8) {
                b bVar = (b) u.getLayoutParams();
                if (((LinearLayout.LayoutParams) bVar).height == -1) {
                    int i5 = ((LinearLayout.LayoutParams) bVar).width;
                    ((LinearLayout.LayoutParams) bVar).width = u.getMeasuredWidth();
                    i3 = i2;
                    measureChildWithMargins(u, i3, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) bVar).width = i5;
                    i4++;
                    i2 = i3;
                }
            }
            i3 = i2;
            i4++;
            i2 = i3;
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: l */
    public b generateDefaultLayoutParams() {
        int i = this.b1;
        if (i == 0) {
            return new b(-2, -2);
        }
        if (i == 1) {
            return new b(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((ViewGroup.MarginLayoutParams) ((b) layoutParams));
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public int o(View view, int i) {
        return 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.i1 == null) {
            return;
        }
        if (this.b1 == 1) {
            f(canvas);
        } else {
            e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(y1);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(y1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.b1 == 1) {
            z(i, i2, i3, i4);
        } else {
            y(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.b1 == 1) {
            D(i, i2);
        } else {
            B(i, i2);
        }
    }

    public int p(View view) {
        return 0;
    }

    public void setBaselineAligned(boolean z) {
        this.Y0 = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.Z0 = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + C9811tl1.d);
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.i1) {
            return;
        }
        this.i1 = drawable;
        boolean z = false;
        if (drawable != null) {
            this.j1 = drawable.getIntrinsicWidth();
            this.k1 = drawable.getIntrinsicHeight();
        } else {
            this.j1 = 0;
            this.k1 = 0;
        }
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.m1 = i;
    }

    public void setGravity(int i) {
        if (this.c1 != i) {
            if ((8388615 & i) == 0) {
                i |= JE0.b;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.c1 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & JE0.d;
        int i3 = this.c1;
        if ((8388615 & i3) != i2) {
            this.c1 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1 = z;
    }

    public void setOrientation(int i) {
        if (this.b1 != i) {
            this.b1 = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.l1) {
            requestLayout();
        }
        this.l1 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.c1;
        if ((i3 & 112) != i2) {
            this.c1 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.e1 = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int t(View view) {
        return 0;
    }

    public View u(int i) {
        return getChildAt(i);
    }

    public boolean v(int i) {
        if (i == 0) {
            if ((this.l1 & 1) == 0) {
                return false;
            }
            return true;
        } else if (i == getChildCount()) {
            if ((this.l1 & 4) == 0) {
                return false;
            }
            return true;
        } else {
            if ((this.l1 & 2) != 0) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    if (getChildAt(i2).getVisibility() != 8) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public boolean w() {
        return this.Y0;
    }

    public boolean x() {
        return this.f1;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        char c2;
        char c3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean b2 = C11163zI2.b(this);
        int paddingTop = getPaddingTop();
        int i16 = i4 - i2;
        int paddingBottom = i16 - getPaddingBottom();
        int paddingBottom2 = (i16 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i17 = this.c1;
        int i18 = i17 & 112;
        boolean z = this.Y0;
        int[] iArr = this.g1;
        int[] iArr2 = this.h1;
        int d = JE0.d(8388615 & i17, getLayoutDirection());
        char c4 = 2;
        char c5 = 1;
        if (d != 1) {
            if (d != 5) {
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.d1;
            }
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.d1) / 2);
        }
        if (b2) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i19 = 0;
        while (i19 < virtualChildCount) {
            int i20 = i5 + (i6 * i19);
            int i21 = i19;
            View u = u(i20);
            if (u == null) {
                paddingLeft += C(i20);
                i8 = i21;
                i7 = paddingTop;
                c2 = c4;
                c3 = c5;
            } else {
                c2 = c4;
                c3 = c5;
                if (u.getVisibility() != 8) {
                    int measuredWidth = u.getMeasuredWidth();
                    int measuredHeight = u.getMeasuredHeight();
                    b bVar = (b) u.getLayoutParams();
                    int i22 = paddingLeft;
                    if (z) {
                        i9 = measuredHeight;
                        if (((LinearLayout.LayoutParams) bVar).height != -1) {
                            i10 = u.getBaseline();
                            i11 = ((LinearLayout.LayoutParams) bVar).gravity;
                            if (i11 < 0) {
                                i11 = i18;
                            }
                            i12 = i11 & 112;
                            i7 = paddingTop;
                            if (i12 == 16) {
                                if (i12 != 48) {
                                    if (i12 != 80) {
                                        i13 = i7;
                                    } else {
                                        i13 = (paddingBottom - i9) - ((LinearLayout.LayoutParams) bVar).bottomMargin;
                                        if (i10 != -1) {
                                            i14 = iArr2[c2] - (u.getMeasuredHeight() - i10);
                                        }
                                    }
                                } else {
                                    i13 = i7 + ((LinearLayout.LayoutParams) bVar).topMargin;
                                    if (i10 != -1) {
                                        i13 += iArr[c3] - i10;
                                    }
                                }
                                if (v(i20)) {
                                    i15 = i22 + this.j1;
                                } else {
                                    i15 = i22;
                                }
                                int i23 = ((LinearLayout.LayoutParams) bVar).leftMargin + i15;
                                E(u, p(u) + i23, i13, measuredWidth, i9);
                                i8 = o(u, i20) + i21;
                                paddingLeft = i23 + ((LinearLayout.LayoutParams) bVar).rightMargin + measuredWidth + t(u);
                            } else {
                                i13 = i7 + ((paddingBottom2 - i9) / 2) + ((LinearLayout.LayoutParams) bVar).topMargin;
                                i14 = ((LinearLayout.LayoutParams) bVar).bottomMargin;
                            }
                            i13 -= i14;
                            if (v(i20)) {
                            }
                            int i232 = ((LinearLayout.LayoutParams) bVar).leftMargin + i15;
                            E(u, p(u) + i232, i13, measuredWidth, i9);
                            i8 = o(u, i20) + i21;
                            paddingLeft = i232 + ((LinearLayout.LayoutParams) bVar).rightMargin + measuredWidth + t(u);
                        }
                    } else {
                        i9 = measuredHeight;
                    }
                    i10 = -1;
                    i11 = ((LinearLayout.LayoutParams) bVar).gravity;
                    if (i11 < 0) {
                    }
                    i12 = i11 & 112;
                    i7 = paddingTop;
                    if (i12 == 16) {
                    }
                    i13 -= i14;
                    if (v(i20)) {
                    }
                    int i2322 = ((LinearLayout.LayoutParams) bVar).leftMargin + i15;
                    E(u, p(u) + i2322, i13, measuredWidth, i9);
                    i8 = o(u, i20) + i21;
                    paddingLeft = i2322 + ((LinearLayout.LayoutParams) bVar).rightMargin + measuredWidth + t(u);
                } else {
                    i7 = paddingTop;
                    i8 = i21;
                }
            }
            i19 = i8 + 1;
            c4 = c2;
            c5 = c3;
            paddingTop = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.c1;
        int i10 = i9 & 112;
        int i11 = i9 & JE0.d;
        if (i10 != 16) {
            if (i10 != 80) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((getPaddingTop() + i4) - i2) - this.d1;
            }
        } else {
            paddingTop = getPaddingTop() + (((i4 - i2) - this.d1) / 2);
        }
        int i12 = 0;
        while (i12 < virtualChildCount) {
            View u = u(i12);
            if (u == null) {
                paddingTop += C(i12);
            } else if (u.getVisibility() != 8) {
                int measuredWidth = u.getMeasuredWidth();
                int measuredHeight = u.getMeasuredHeight();
                b bVar = (b) u.getLayoutParams();
                int i13 = ((LinearLayout.LayoutParams) bVar).gravity;
                if (i13 < 0) {
                    i13 = i11;
                }
                int d = JE0.d(i13, getLayoutDirection()) & 7;
                if (d != 1) {
                    if (d != 5) {
                        i7 = ((LinearLayout.LayoutParams) bVar).leftMargin + paddingLeft;
                        int i14 = i7;
                        if (v(i12)) {
                            paddingTop += this.k1;
                        }
                        int i15 = paddingTop + ((LinearLayout.LayoutParams) bVar).topMargin;
                        E(u, i14, i15 + p(u), measuredWidth, measuredHeight);
                        paddingTop = i15 + measuredHeight + ((LinearLayout.LayoutParams) bVar).bottomMargin + t(u);
                        i12 += o(u, i12);
                        i12++;
                    } else {
                        i5 = paddingRight - measuredWidth;
                        i6 = ((LinearLayout.LayoutParams) bVar).rightMargin;
                    }
                } else {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) bVar).leftMargin;
                    i6 = ((LinearLayout.LayoutParams) bVar).rightMargin;
                }
                i7 = i5 - i6;
                int i142 = i7;
                if (v(i12)) {
                }
                int i152 = paddingTop + ((LinearLayout.LayoutParams) bVar).topMargin;
                E(u, i142, i152 + p(u), measuredWidth, measuredHeight);
                paddingTop = i152 + measuredHeight + ((LinearLayout.LayoutParams) bVar).bottomMargin + t(u);
                i12 += o(u, i12);
                i12++;
            }
            i12++;
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = true;
        this.Z0 = -1;
        this.a1 = 0;
        this.c1 = 8388659;
        int[] iArr = OL1.m.L3;
        C2872Ep2 G = C2872Ep2.G(context, attributeSet, iArr, i, 0);
        C6516gH2.G1(this, context, iArr, attributeSet, G.B(), i, 0);
        int o2 = G.o(OL1.m.N3, -1);
        if (o2 >= 0) {
            setOrientation(o2);
        }
        int o3 = G.o(OL1.m.M3, -1);
        if (o3 >= 0) {
            setGravity(o3);
        }
        boolean a2 = G.a(OL1.m.O3, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.e1 = G.j(OL1.m.Q3, -1.0f);
        this.Z0 = G.o(OL1.m.P3, -1);
        this.f1 = G.a(OL1.m.T3, false);
        setDividerDrawable(G.h(OL1.m.R3));
        this.l1 = G.o(OL1.m.U3, 0);
        this.m1 = G.g(OL1.m.S3, 0);
        G.I();
    }
}
