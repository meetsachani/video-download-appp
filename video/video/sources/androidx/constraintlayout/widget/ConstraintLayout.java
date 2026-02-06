package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.j;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o.C3641Mj1;
import o.C4077Qv1;
import o.C5163am;
import o.C6516gH2;
import o.C9445sF0;
import o.InterfaceMenuC9553sh2;
import o.MK;
import o.UI2;
import o.UK;
import o.VK;
import o.YK;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static final boolean A1 = false;
    public static final boolean B1 = false;
    public static final boolean C1 = false;
    public static final int D1 = 0;
    public static l E1 = null;
    public static final String x1 = "ConstraintLayout-2.2.0-alpha04";
    public static final String y1 = "ConstraintLayout";
    public static final boolean z1 = true;
    public SparseArray<View> Y0;
    public ArrayList<androidx.constraintlayout.widget.b> Z0;
    public VK a1;
    public int b1;
    public int c1;
    public int d1;
    public int e1;
    public boolean f1;
    public int g1;
    public e h1;
    public androidx.constraintlayout.widget.c i1;
    public int j1;
    public HashMap<String, Integer> k1;
    public int l1;
    public int m1;
    public int n1;
    public int o1;
    public int p1;
    public int q1;
    public SparseArray<UK> r1;
    public C3641Mj1 s1;
    public c t1;
    public int u1;
    public int v1;
    public ArrayList<d> w1;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UK.b.values().length];
            a = iArr;
            try {
                iArr[UK.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UK.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UK.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[UK.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements C5163am.b {
        public ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        @Override // o.C5163am.b
        public final void a() {
            int childCount = this.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.a.getChildAt(i);
                if (childAt instanceof i) {
                    ((i) childAt).b(this.a);
                }
            }
            int size = this.a.Z0.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.b) this.a.Z0.get(i2)).G(this.a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0148  */
        @Override // o.C5163am.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(UK uk, C5163am.a aVar) {
            long j;
            int makeMeasureSpec;
            int i;
            int i2;
            int makeMeasureSpec2;
            VK vk;
            UK.b bVar;
            boolean z;
            boolean z2;
            UK.b bVar2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            int baseline;
            int i3;
            int i4;
            long j2;
            int i5;
            int i6;
            int i7;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            if (uk != null) {
                if (uk.l0() == 8 && !uk.C0()) {
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                } else if (uk.U() != null) {
                    if (ConstraintLayout.this.s1 != null) {
                        ConstraintLayout.this.s1.N++;
                        j = System.nanoTime();
                    } else {
                        j = 0;
                    }
                    UK.b bVar3 = aVar.a;
                    UK.b bVar4 = aVar.b;
                    int i8 = aVar.c;
                    int i9 = aVar.d;
                    int i10 = this.b + this.c;
                    int i11 = this.d;
                    View view = (View) uk.w();
                    int[] iArr = a.a;
                    int i12 = iArr[bVar3.ordinal()];
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 4) {
                                    i = 0;
                                } else {
                                    i = ViewGroup.getChildMeasureSpec(this.f, i11, -2);
                                    if (uk.w == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    int i13 = aVar.j;
                                    if (i13 == C5163am.a.l || i13 == C5163am.a.m) {
                                        if (view.getMeasuredHeight() == uk.D()) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (aVar.j == C5163am.a.m || !z11 || ((z11 && z12) || (view instanceof i) || uk.G0())) {
                                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(uk.m0(), 1073741824);
                                        }
                                    }
                                }
                                i2 = iArr[bVar4.ordinal()];
                                if (i2 == 1) {
                                    if (i2 != 2) {
                                        if (i2 != 3) {
                                            if (i2 != 4) {
                                                makeMeasureSpec2 = 0;
                                            } else {
                                                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i10, -2);
                                                if (uk.x == 1) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                int i14 = aVar.j;
                                                if (i14 == C5163am.a.l || i14 == C5163am.a.m) {
                                                    if (view.getMeasuredWidth() == uk.m0()) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (aVar.j == C5163am.a.m || !z9 || ((z9 && z10) || (view instanceof i) || uk.H0())) {
                                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(uk.D(), 1073741824);
                                                    }
                                                }
                                            }
                                        } else {
                                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i10 + uk.k0(), -1);
                                        }
                                    } else {
                                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i10, -2);
                                    }
                                } else {
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                                }
                                vk = (VK) uk.U();
                                if (vk == null && C4077Qv1.b(ConstraintLayout.this.g1, 256) && view.getMeasuredWidth() == uk.m0() && view.getMeasuredWidth() < vk.m0() && view.getMeasuredHeight() == uk.D() && view.getMeasuredHeight() < vk.D() && view.getBaseline() == uk.t() && !uk.F0() && d(uk.J(), i, uk.m0()) && d(uk.K(), makeMeasureSpec2, uk.D())) {
                                    aVar.e = uk.m0();
                                    aVar.f = uk.D();
                                    aVar.g = uk.t();
                                    return;
                                }
                                bVar = UK.b.MATCH_CONSTRAINT;
                                if (bVar3 != bVar) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (bVar4 != bVar) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                bVar2 = UK.b.MATCH_PARENT;
                                if (bVar4 == bVar2 && bVar4 != UK.b.FIXED) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (bVar3 == bVar2 && bVar3 != UK.b.FIXED) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (!z && uk.f0 > 0.0f) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (!z2 && uk.f0 > 0.0f) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (view == null) {
                                    b bVar5 = (b) view.getLayoutParams();
                                    int i15 = aVar.j;
                                    boolean z13 = z4;
                                    if (i15 != C5163am.a.l && i15 != C5163am.a.m && z && uk.w == 0 && z2 && uk.x == 0) {
                                        j2 = j;
                                        i4 = 0;
                                        i7 = -1;
                                        baseline = 0;
                                        i3 = 0;
                                    } else {
                                        if ((view instanceof n) && (uk instanceof UI2)) {
                                            ((n) view).L((UI2) uk, i, makeMeasureSpec2);
                                        } else {
                                            view.measure(i, makeMeasureSpec2);
                                        }
                                        uk.K1(i, makeMeasureSpec2);
                                        int measuredWidth = view.getMeasuredWidth();
                                        int measuredHeight = view.getMeasuredHeight();
                                        baseline = view.getBaseline();
                                        int i16 = uk.z;
                                        if (i16 > 0) {
                                            i3 = Math.max(i16, measuredWidth);
                                        } else {
                                            i3 = measuredWidth;
                                        }
                                        int i17 = makeMeasureSpec2;
                                        int i18 = uk.A;
                                        if (i18 > 0) {
                                            i3 = Math.min(i18, i3);
                                        }
                                        int i19 = uk.C;
                                        if (i19 > 0) {
                                            i4 = Math.max(i19, measuredHeight);
                                        } else {
                                            i4 = measuredHeight;
                                        }
                                        int i20 = i;
                                        int i21 = uk.D;
                                        if (i21 > 0) {
                                            i4 = Math.min(i21, i4);
                                        }
                                        j2 = j;
                                        if (!C4077Qv1.b(ConstraintLayout.this.g1, 1)) {
                                            if (z5 && z3) {
                                                i3 = (int) ((i4 * uk.f0) + 0.5f);
                                            } else if (z6 && z13) {
                                                i4 = (int) ((i3 / uk.f0) + 0.5f);
                                            }
                                        }
                                        if (measuredWidth != i3 || measuredHeight != i4) {
                                            if (measuredWidth != i3) {
                                                i5 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                            } else {
                                                i5 = i20;
                                            }
                                            if (measuredHeight != i4) {
                                                i6 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                            } else {
                                                i6 = i17;
                                            }
                                            view.measure(i5, i6);
                                            uk.K1(i5, i6);
                                            i3 = view.getMeasuredWidth();
                                            i4 = view.getMeasuredHeight();
                                            baseline = view.getBaseline();
                                        }
                                        i7 = -1;
                                    }
                                    if (baseline != i7) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (i3 == aVar.c && i4 == aVar.d) {
                                        z8 = false;
                                    } else {
                                        z8 = true;
                                    }
                                    aVar.i = z8;
                                    if (bVar5.g0) {
                                        z7 = true;
                                    }
                                    if (z7 && baseline != -1 && uk.t() != baseline) {
                                        aVar.i = true;
                                    }
                                    aVar.e = i3;
                                    aVar.f = i4;
                                    aVar.h = z7;
                                    aVar.g = baseline;
                                    if (ConstraintLayout.this.s1 != null) {
                                        long nanoTime = System.nanoTime();
                                        ConstraintLayout.this.s1.a += nanoTime - j2;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i11 + uk.I(), -1);
                        } else {
                            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i11, -2);
                        }
                    } else {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    }
                    i = makeMeasureSpec;
                    i2 = iArr[bVar4.ordinal()];
                    if (i2 == 1) {
                    }
                    vk = (VK) uk.U();
                    if (vk == null) {
                    }
                    bVar = UK.b.MATCH_CONSTRAINT;
                    if (bVar3 != bVar) {
                    }
                    if (bVar4 != bVar) {
                    }
                    bVar2 = UK.b.MATCH_PARENT;
                    if (bVar4 == bVar2) {
                    }
                    z3 = true;
                    if (bVar3 == bVar2) {
                    }
                    z4 = true;
                    if (!z) {
                    }
                    z5 = false;
                    if (!z2) {
                    }
                    z6 = false;
                    if (view == null) {
                    }
                }
            }
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i;
            this.g = i2;
        }

        public final boolean d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(int i, int i2, int i3, View view, b bVar);
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.Y0 = new SparseArray<>();
        this.Z0 = new ArrayList<>(4);
        this.a1 = new VK();
        this.b1 = 0;
        this.c1 = 0;
        this.d1 = Integer.MAX_VALUE;
        this.e1 = Integer.MAX_VALUE;
        this.f1 = true;
        this.g1 = 257;
        this.h1 = null;
        this.i1 = null;
        this.j1 = -1;
        this.k1 = new HashMap<>();
        this.l1 = -1;
        this.m1 = -1;
        this.n1 = -1;
        this.o1 = -1;
        this.p1 = 0;
        this.q1 = 0;
        this.r1 = new SparseArray<>();
        this.t1 = new c(this);
        this.u1 = 0;
        this.v1 = 0;
        y(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static l getSharedValues() {
        if (E1 == null) {
            E1 = new l();
        }
        return E1;
    }

    public void A(int i) {
        if (i != 0) {
            try {
                this.i1 = new androidx.constraintlayout.widget.c(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
                this.i1 = null;
                return;
            }
        }
        this.i1 = null;
    }

    public final void B() {
        this.f1 = true;
        this.l1 = -1;
        this.m1 = -1;
        this.n1 = -1;
        this.o1 = -1;
        this.p1 = 0;
        this.q1 = 0;
    }

    public void C(int i) {
        this.i1 = new androidx.constraintlayout.widget.c(getContext(), this, i);
    }

    public void D(d dVar) {
        if (dVar == null) {
            return;
        }
        this.w1.remove(dVar);
    }

    public void E(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.t1;
        int i5 = cVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + cVar.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0);
        int i6 = resolveSizeAndState & C6516gH2.x;
        int i7 = resolveSizeAndState2 & C6516gH2.x;
        int min = Math.min(this.d1, i6);
        int min2 = Math.min(this.e1, i7);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.l1 = min;
        this.m1 = min2;
    }

    public void F(VK vk, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.t1.c(i2, i3, max, max2, paddingWidth, i5);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        } else if (z()) {
            i4 = max4;
            int i6 = size - paddingWidth;
            int i7 = size2 - i5;
            I(vk, mode, i6, mode2, i7);
            vk.R2(i, mode, i6, mode2, i7, this.l1, this.m1, i4, max);
        }
        i4 = max3;
        int i62 = size - paddingWidth;
        int i72 = size2 - i5;
        I(vk, mode, i62, mode2, i72);
        vk.R2(i, mode, i62, mode2, i72, this.l1, this.m1, i4, max);
    }

    public final void G() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            UK x = x(getChildAt(i));
            if (x != null) {
                x.R0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    H(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    v(childAt.getId()).k1(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.j1 != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.j1 && (childAt2 instanceof f)) {
                    this.h1 = ((f) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.h1;
        if (eVar != null) {
            eVar.t(this, true);
        }
        this.a1.q2();
        int size = this.Z0.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.Z0.get(i4).I(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof i) {
                ((i) childAt3).c(this);
            }
        }
        this.r1.clear();
        this.r1.put(0, this.a1);
        this.r1.put(getId(), this.a1);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.r1.put(childAt4.getId(), x(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            UK x2 = x(childAt5);
            if (x2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.a1.a(x2);
                j(isInEditMode, childAt5, x2, bVar, this.r1);
            }
        }
    }

    public void H(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.k1 == null) {
                this.k1 = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf(RemoteSettings.i);
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.k1.put(str, num);
        }
    }

    public void I(VK vk, int i, int i2, int i3, int i4) {
        UK.b bVar;
        c cVar = this.t1;
        int i5 = cVar.e;
        int i6 = cVar.d;
        UK.b bVar2 = UK.b.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i != 0) {
                if (i != 1073741824) {
                    bVar = bVar2;
                    i2 = 0;
                } else {
                    i2 = Math.min(this.d1 - i6, i2);
                    bVar = bVar2;
                }
            } else {
                bVar = UK.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.b1);
                }
                i2 = 0;
            }
        } else {
            bVar = UK.b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.b1);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 != 0) {
                if (i3 == 1073741824) {
                    i4 = Math.min(this.e1 - i5, i4);
                }
                i4 = 0;
            } else {
                bVar2 = UK.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.c1);
                }
                i4 = 0;
            }
        } else {
            bVar2 = UK.b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.c1);
            }
        }
        if (i2 != vk.m0() || i4 != vk.D()) {
            vk.N2();
        }
        vk.g2(0);
        vk.h2(0);
        vk.N1(this.d1 - i6);
        vk.M1(this.e1 - i5);
        vk.Q1(0);
        vk.P1(0);
        vk.E1(bVar);
        vk.d2(i2);
        vk.Z1(bVar2);
        vk.z1(i4);
        vk.Q1(this.b1 - i6);
        vk.P1(this.c1 - i5);
    }

    public void J(int i, int i2, int i3) {
        androidx.constraintlayout.widget.c cVar = this.i1;
        if (cVar != null) {
            cVar.e(i, i2, i3);
        }
    }

    public final void K(UK uk, b bVar, SparseArray<UK> sparseArray, int i, MK.a aVar) {
        View view = this.Y0.get(i);
        UK uk2 = sparseArray.get(i);
        if (uk2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.g0 = true;
            MK.a aVar2 = MK.a.BASELINE;
            if (aVar == aVar2) {
                b bVar2 = (b) view.getLayoutParams();
                bVar2.g0 = true;
                bVar2.v0.y1(true);
            }
            uk.r(aVar2).b(uk2.r(aVar), bVar.D, bVar.C, true);
            uk.y1(true);
            uk.r(MK.a.TOP).x();
            uk.r(MK.a.BOTTOM).x();
        }
    }

    public final boolean L() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            G();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.Z0;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.Z0.get(i).H(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(InterfaceMenuC9553sh2.c);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        B();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.e1;
    }

    public int getMaxWidth() {
        return this.d1;
    }

    public int getMinHeight() {
        return this.c1;
    }

    public int getMinWidth() {
        return this.b1;
    }

    public int getOptimizationLevel() {
        return this.a1.I2();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.a1.f625o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.a1.f625o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.a1.f625o = e.W1;
            }
        }
        if (this.a1.y() == null) {
            VK vk = this.a1;
            vk.k1(vk.f625o);
            Log.v(y1, " setDebugName " + this.a1.y());
        }
        Iterator<UK> it = this.a1.m2().iterator();
        while (it.hasNext()) {
            UK next = it.next();
            View view = (View) next.w();
            if (view != null) {
                if (next.f625o == null && (id = view.getId()) != -1) {
                    next.f625o = getContext().getResources().getResourceEntryName(id);
                }
                if (next.y() == null) {
                    next.k1(next.f625o);
                    Log.v(y1, " setDebugName " + next.y());
                }
            }
        }
        this.a1.b0(sb);
        return sb.toString();
    }

    public void i(d dVar) {
        if (this.w1 == null) {
            this.w1 = new ArrayList<>();
        }
        this.w1.add(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(boolean z, View view, UK uk, b bVar, SparseArray<UK> sparseArray) {
        UK uk2;
        UK uk3;
        UK uk4;
        UK uk5;
        b bVar2;
        UK uk6;
        float f;
        int i;
        bVar.e();
        bVar.w0 = false;
        uk.c2(view.getVisibility());
        if (bVar.j0) {
            uk.I1(true);
            uk.c2(8);
        }
        uk.i1(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).D(uk, this.a1.P2());
        }
        if (bVar.h0) {
            C9445sF0 c9445sF0 = (C9445sF0) uk;
            int i2 = bVar.s0;
            int i3 = bVar.t0;
            float f2 = bVar.u0;
            if (f2 != -1.0f) {
                c9445sF0.A2(f2);
                return;
            } else if (i2 != -1) {
                c9445sF0.y2(i2);
                return;
            } else if (i3 != -1) {
                c9445sF0.z2(i3);
                return;
            } else {
                return;
            }
        }
        int i4 = bVar.l0;
        int i5 = bVar.m0;
        int i6 = bVar.n0;
        int i7 = bVar.o0;
        int i8 = bVar.p0;
        int i9 = bVar.q0;
        float f3 = bVar.r0;
        int i10 = bVar.p;
        if (i10 != -1) {
            UK uk7 = sparseArray.get(i10);
            if (uk7 != null) {
                uk.m(uk7, bVar.r, bVar.q);
            }
            uk6 = uk;
            bVar2 = bVar;
        } else {
            if (i4 != -1) {
                UK uk8 = sparseArray.get(i4);
                if (uk8 != null) {
                    MK.a aVar = MK.a.LEFT;
                    uk.v0(aVar, uk8, aVar, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
                }
            } else if (i5 != -1 && (uk2 = sparseArray.get(i5)) != null) {
                uk.v0(MK.a.LEFT, uk2, MK.a.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
            }
            if (i6 != -1) {
                UK uk9 = sparseArray.get(i6);
                if (uk9 != null) {
                    uk.v0(MK.a.RIGHT, uk9, MK.a.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
                }
            } else if (i7 != -1 && (uk3 = sparseArray.get(i7)) != null) {
                MK.a aVar2 = MK.a.RIGHT;
                uk.v0(aVar2, uk3, aVar2, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
            }
            int i11 = bVar.i;
            if (i11 != -1) {
                UK uk10 = sparseArray.get(i11);
                if (uk10 != null) {
                    MK.a aVar3 = MK.a.TOP;
                    uk.v0(aVar3, uk10, aVar3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            } else {
                int i12 = bVar.j;
                if (i12 != -1 && (uk4 = sparseArray.get(i12)) != null) {
                    uk.v0(MK.a.TOP, uk4, MK.a.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            }
            int i13 = bVar.k;
            if (i13 != -1) {
                UK uk11 = sparseArray.get(i13);
                if (uk11 != null) {
                    uk.v0(MK.a.BOTTOM, uk11, MK.a.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            } else {
                int i14 = bVar.l;
                if (i14 != -1 && (uk5 = sparseArray.get(i14)) != null) {
                    MK.a aVar4 = MK.a.BOTTOM;
                    uk.v0(aVar4, uk5, aVar4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            }
            int i15 = bVar.m;
            if (i15 != -1) {
                bVar2 = bVar;
                K(uk, bVar2, sparseArray, i15, MK.a.BASELINE);
            } else {
                bVar2 = bVar;
                int i16 = bVar2.n;
                if (i16 != -1) {
                    K(uk, bVar2, sparseArray, i16, MK.a.TOP);
                } else {
                    int i17 = bVar2.f17o;
                    if (i17 != -1) {
                        K(uk, bVar2, sparseArray, i17, MK.a.BOTTOM);
                        uk6 = uk;
                        if (f3 >= 0.0f) {
                            uk6.B1(f3);
                        }
                        f = bVar2.H;
                        if (f >= 0.0f) {
                            uk6.W1(f);
                        }
                    }
                }
            }
            uk6 = uk;
            if (f3 >= 0.0f) {
            }
            f = bVar2.H;
            if (f >= 0.0f) {
            }
        }
        if (z && ((i = bVar2.X) != -1 || bVar2.Y != -1)) {
            uk6.S1(i, bVar2.Y);
        }
        if (!bVar2.e0) {
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
                if (bVar2.a0) {
                    uk6.E1(UK.b.MATCH_CONSTRAINT);
                } else {
                    uk6.E1(UK.b.MATCH_PARENT);
                }
                uk6.r(MK.a.LEFT).g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
                uk6.r(MK.a.RIGHT).g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
            } else {
                uk6.E1(UK.b.MATCH_CONSTRAINT);
                uk6.d2(0);
            }
        } else {
            uk6.E1(UK.b.FIXED);
            uk6.d2(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                uk6.E1(UK.b.WRAP_CONTENT);
            }
        }
        if (!bVar2.f0) {
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
                if (bVar2.b0) {
                    uk6.Z1(UK.b.MATCH_CONSTRAINT);
                } else {
                    uk6.Z1(UK.b.MATCH_PARENT);
                }
                uk6.r(MK.a.TOP).g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
                uk6.r(MK.a.BOTTOM).g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
            } else {
                uk6.Z1(UK.b.MATCH_CONSTRAINT);
                uk6.z1(0);
            }
        } else {
            uk6.Z1(UK.b.FIXED);
            uk6.z1(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                uk6.Z1(UK.b.WRAP_CONTENT);
            }
        }
        uk6.o1(bVar2.I);
        uk6.G1(bVar2.L);
        uk6.b2(bVar2.M);
        uk6.C1(bVar2.N);
        uk6.X1(bVar2.O);
        uk6.f2(bVar2.d0);
        uk6.F1(bVar2.P, bVar2.R, bVar2.T, bVar2.V);
        uk6.a2(bVar2.Q, bVar2.S, bVar2.U, bVar2.W);
    }

    public boolean k(int i, int i2) {
        boolean z = false;
        if (this.w1 == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Iterator<d> it = this.w1.iterator();
        while (it.hasNext()) {
            d next = it.next();
            Iterator<UK> it2 = this.a1.m2().iterator();
            while (it2.hasNext()) {
                View view = (View) it2.next().w();
                z |= next.a(size, size2, view.getId(), view, (b) view.getLayoutParams());
            }
        }
        return z;
    }

    public void l(C3641Mj1 c3641Mj1) {
        this.s1 = c3641Mj1;
        this.a1.F2(c3641Mj1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        C3641Mj1 c3641Mj1 = this.s1;
        if (c3641Mj1 != null) {
            c3641Mj1.M++;
        }
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            UK uk = bVar.v0;
            if ((childAt.getVisibility() != 8 || bVar.h0 || bVar.i0 || bVar.k0 || isInEditMode) && !bVar.j0) {
                int o0 = uk.o0();
                int p0 = uk.p0();
                int m0 = uk.m0() + o0;
                int D = uk.D() + p0;
                childAt.layout(o0, p0, m0, D);
                if ((childAt instanceof i) && (content = ((i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(o0, p0, m0, D);
                }
            }
        }
        int size = this.Z0.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.Z0.get(i6).F(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        long j;
        if (this.s1 != null) {
            j = System.nanoTime();
            this.s1.P = getChildCount();
            this.s1.Q++;
        } else {
            j = 0;
        }
        boolean k = this.f1 | k(i, i2);
        this.f1 = k;
        if (!k) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    this.f1 = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.u1 = i;
        this.v1 = i2;
        this.a1.Z2(z());
        if (this.f1) {
            this.f1 = false;
            if (L()) {
                this.a1.b3();
            }
        }
        this.a1.F2(this.s1);
        F(this.a1, this.g1, i, i2);
        E(i, i2, this.a1.m0(), this.a1.D(), this.a1.Q2(), this.a1.O2());
        C3641Mj1 c3641Mj1 = this.s1;
        if (c3641Mj1 != null) {
            c3641Mj1.O += System.nanoTime() - j;
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        UK x = x(view);
        if ((view instanceof h) && !(x instanceof C9445sF0)) {
            b bVar = (b) view.getLayoutParams();
            C9445sF0 c9445sF0 = new C9445sF0();
            bVar.v0 = c9445sF0;
            bVar.h0 = true;
            c9445sF0.D2(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.K();
            ((b) view.getLayoutParams()).i0 = true;
            if (!this.Z0.contains(bVar2)) {
                this.Z0.add(bVar2);
            }
        }
        this.Y0.put(view.getId(), view);
        this.f1 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.Y0.remove(view.getId());
        this.a1.p2(x(view));
        this.Z0.remove(view);
        this.f1 = true;
    }

    @Override // android.view.ViewGroup
    /* renamed from: q */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object r(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.k1;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.k1.get(str);
            }
            return null;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        B();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.h1 = eVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.Y0.remove(getId());
        super.setId(i);
        this.Y0.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.e1) {
            return;
        }
        this.e1 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.d1) {
            return;
        }
        this.d1 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.c1) {
            return;
        }
        this.c1 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.b1) {
            return;
        }
        this.b1 = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(YK yk) {
        androidx.constraintlayout.widget.c cVar = this.i1;
        if (cVar != null) {
            cVar.d(yk);
        }
    }

    public void setOptimizationLevel(int i) {
        this.g1 = i;
        this.a1.W2(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final UK v(int i) {
        if (i == 0) {
            return this.a1;
        }
        View view = this.Y0.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.a1;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).v0;
    }

    public View w(int i) {
        return this.Y0.get(i);
    }

    public final UK x(View view) {
        if (view == this) {
            return this.a1;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).v0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).v0;
            }
            return null;
        }
        return null;
    }

    public final void y(AttributeSet attributeSet, int i, int i2) {
        this.a1.i1(this);
        this.a1.V2(this.t1);
        this.Y0.put(getId(), this);
        this.h1 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.H1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == j.c.Y1) {
                    this.b1 = obtainStyledAttributes.getDimensionPixelOffset(index, this.b1);
                } else if (index == j.c.Z1) {
                    this.c1 = obtainStyledAttributes.getDimensionPixelOffset(index, this.c1);
                } else if (index == j.c.W1) {
                    this.d1 = obtainStyledAttributes.getDimensionPixelOffset(index, this.d1);
                } else if (index == j.c.X1) {
                    this.e1 = obtainStyledAttributes.getDimensionPixelOffset(index, this.e1);
                } else if (index == j.c.R3) {
                    this.g1 = obtainStyledAttributes.getInt(index, this.g1);
                } else if (index == j.c.M2) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            C(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.i1 = null;
                        }
                    }
                } else if (index == j.c.q2) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.h1 = eVar;
                        eVar.y0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.h1 = null;
                    }
                    this.j1 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.a1.W2(this.g1);
    }

    public boolean z() {
        if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = new SparseArray<>();
        this.Z0 = new ArrayList<>(4);
        this.a1 = new VK();
        this.b1 = 0;
        this.c1 = 0;
        this.d1 = Integer.MAX_VALUE;
        this.e1 = Integer.MAX_VALUE;
        this.f1 = true;
        this.g1 = 257;
        this.h1 = null;
        this.i1 = null;
        this.j1 = -1;
        this.k1 = new HashMap<>();
        this.l1 = -1;
        this.m1 = -1;
        this.n1 = -1;
        this.o1 = -1;
        this.p1 = 0;
        this.q1 = 0;
        this.r1 = new SparseArray<>();
        this.t1 = new c(this);
        this.u1 = 0;
        this.v1 = 0;
        y(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y0 = new SparseArray<>();
        this.Z0 = new ArrayList<>(4);
        this.a1 = new VK();
        this.b1 = 0;
        this.c1 = 0;
        this.d1 = Integer.MAX_VALUE;
        this.e1 = Integer.MAX_VALUE;
        this.f1 = true;
        this.g1 = 257;
        this.h1 = null;
        this.i1 = null;
        this.j1 = -1;
        this.k1 = new HashMap<>();
        this.l1 = -1;
        this.m1 = -1;
        this.n1 = -1;
        this.o1 = -1;
        this.p1 = 0;
        this.q1 = 0;
        this.r1 = new SparseArray<>();
        this.t1 = new c(this);
        this.u1 = 0;
        this.v1 = 0;
        y(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Y0 = new SparseArray<>();
        this.Z0 = new ArrayList<>(4);
        this.a1 = new VK();
        this.b1 = 0;
        this.c1 = 0;
        this.d1 = Integer.MAX_VALUE;
        this.e1 = Integer.MAX_VALUE;
        this.f1 = true;
        this.g1 = 257;
        this.h1 = null;
        this.i1 = null;
        this.j1 = -1;
        this.k1 = new HashMap<>();
        this.l1 = -1;
        this.m1 = -1;
        this.n1 = -1;
        this.o1 = -1;
        this.p1 = 0;
        this.q1 = 0;
        this.r1 = new SparseArray<>();
        this.t1 = new c(this);
        this.u1 = 0;
        this.v1 = 0;
        y(attributeSet, i, i2);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public static final int A0 = Integer.MIN_VALUE;
        public static final int B0 = 0;
        public static final int C0 = 1;
        public static final int D0 = 1;
        public static final int E0 = 2;
        public static final int F0 = 3;
        public static final int G0 = 4;
        public static final int H0 = 5;
        public static final int I0 = 6;
        public static final int J0 = 7;
        public static final int K0 = 8;
        public static final int L0 = 1;
        public static final int M0 = 0;
        public static final int N0 = 2;
        public static final int O0 = 0;
        public static final int P0 = 1;
        public static final int Q0 = 2;
        public static final int R0 = 0;
        public static final int S0 = 1;
        public static final int T0 = 2;
        public static final int U0 = 3;
        public static final int x0 = 0;
        public static final int y0 = 0;
        public static final int z0 = -1;
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean F;
        public float G;
        public float H;
        public String I;
        public float J;
        public int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public String c0;
        public boolean d;
        public int d0;
        public int e;
        public boolean e0;
        public int f;
        public boolean f0;
        public int g;
        public boolean g0;
        public int h;
        public boolean h0;
        public int i;
        public boolean i0;
        public int j;
        public boolean j0;
        public int k;
        public boolean k0;
        public int l;
        public int l0;
        public int m;
        public int m0;
        public int n;
        public int n0;

        /* renamed from: o  reason: collision with root package name */
        public int f17o;
        public int o0;
        public int p;
        public int p0;
        public int q;
        public int q0;
        public float r;
        public float r0;
        public int s;
        public int s0;
        public int t;
        public int t0;
        public int u;
        public float u0;
        public int v;
        public UK v0;
        public int w;
        public boolean w0;
        public int x;
        public int y;
        public int z;

        /* loaded from: classes.dex */
        public static class a {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 31;
            public static final int G = 32;
            public static final int H = 33;
            public static final int I = 34;
            public static final int J = 35;
            public static final int K = 36;
            public static final int L = 37;
            public static final int M = 38;
            public static final int N = 39;
            public static final int O = 40;
            public static final int P = 41;
            public static final int Q = 42;
            public static final int R = 43;
            public static final int S = 44;
            public static final int T = 45;
            public static final int U = 46;
            public static final int V = 47;
            public static final int W = 48;
            public static final int X = 49;
            public static final int Y = 50;
            public static final int Z = 51;
            public static final int a = 0;
            public static final int a0 = 52;
            public static final int b = 1;
            public static final int b0 = 53;
            public static final int c = 2;
            public static final int c0 = 54;
            public static final int d = 3;
            public static final int d0 = 55;
            public static final int e = 4;
            public static final int e0 = 64;
            public static final int f = 5;
            public static final int f0 = 65;
            public static final int g = 6;
            public static final int g0 = 66;
            public static final int h = 7;
            public static final int h0 = 67;
            public static final int i = 8;
            public static final SparseIntArray i0;
            public static final int j = 9;
            public static final int k = 10;
            public static final int l = 11;
            public static final int m = 12;
            public static final int n = 13;

            /* renamed from: o  reason: collision with root package name */
            public static final int f18o = 14;
            public static final int p = 15;
            public static final int q = 16;
            public static final int r = 17;
            public static final int s = 18;
            public static final int t = 19;
            public static final int u = 20;
            public static final int v = 21;
            public static final int w = 22;
            public static final int x = 23;
            public static final int y = 24;
            public static final int z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                i0 = sparseIntArray;
                sparseIntArray.append(j.c.C3, 64);
                sparseIntArray.append(j.c.f3, 65);
                sparseIntArray.append(j.c.o3, 8);
                sparseIntArray.append(j.c.p3, 9);
                sparseIntArray.append(j.c.r3, 10);
                sparseIntArray.append(j.c.s3, 11);
                sparseIntArray.append(j.c.y3, 12);
                sparseIntArray.append(j.c.x3, 13);
                sparseIntArray.append(j.c.V2, 14);
                sparseIntArray.append(j.c.U2, 15);
                sparseIntArray.append(j.c.Q2, 16);
                sparseIntArray.append(j.c.S2, 52);
                sparseIntArray.append(j.c.R2, 53);
                sparseIntArray.append(j.c.W2, 2);
                sparseIntArray.append(j.c.Y2, 3);
                sparseIntArray.append(j.c.X2, 4);
                sparseIntArray.append(j.c.H3, 49);
                sparseIntArray.append(j.c.I3, 50);
                sparseIntArray.append(j.c.c3, 5);
                sparseIntArray.append(j.c.d3, 6);
                sparseIntArray.append(j.c.e3, 7);
                sparseIntArray.append(j.c.L2, 67);
                sparseIntArray.append(j.c.I1, 1);
                sparseIntArray.append(j.c.t3, 17);
                sparseIntArray.append(j.c.u3, 18);
                sparseIntArray.append(j.c.b3, 19);
                sparseIntArray.append(j.c.a3, 20);
                sparseIntArray.append(j.c.M3, 21);
                sparseIntArray.append(j.c.P3, 22);
                sparseIntArray.append(j.c.N3, 23);
                sparseIntArray.append(j.c.K3, 24);
                sparseIntArray.append(j.c.O3, 25);
                sparseIntArray.append(j.c.L3, 26);
                sparseIntArray.append(j.c.J3, 55);
                sparseIntArray.append(j.c.Q3, 54);
                sparseIntArray.append(j.c.k3, 29);
                sparseIntArray.append(j.c.z3, 30);
                sparseIntArray.append(j.c.Z2, 44);
                sparseIntArray.append(j.c.m3, 45);
                sparseIntArray.append(j.c.B3, 46);
                sparseIntArray.append(j.c.l3, 47);
                sparseIntArray.append(j.c.A3, 48);
                sparseIntArray.append(j.c.O2, 27);
                sparseIntArray.append(j.c.N2, 28);
                sparseIntArray.append(j.c.D3, 31);
                sparseIntArray.append(j.c.g3, 32);
                sparseIntArray.append(j.c.F3, 33);
                sparseIntArray.append(j.c.E3, 34);
                sparseIntArray.append(j.c.G3, 35);
                sparseIntArray.append(j.c.i3, 36);
                sparseIntArray.append(j.c.h3, 37);
                sparseIntArray.append(j.c.j3, 38);
                sparseIntArray.append(j.c.n3, 39);
                sparseIntArray.append(j.c.w3, 40);
                sparseIntArray.append(j.c.q3, 41);
                sparseIntArray.append(j.c.T2, 42);
                sparseIntArray.append(j.c.P2, 43);
                sparseIntArray.append(j.c.v3, 51);
                sparseIntArray.append(j.c.S3, 66);
            }
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.f17o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new UK();
            this.w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.a = bVar.a;
                this.b = bVar.b;
                this.c = bVar.c;
                this.d = bVar.d;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.i = bVar.i;
                this.j = bVar.j;
                this.k = bVar.k;
                this.l = bVar.l;
                this.m = bVar.m;
                this.n = bVar.n;
                this.f17o = bVar.f17o;
                this.p = bVar.p;
                this.q = bVar.q;
                this.r = bVar.r;
                this.s = bVar.s;
                this.t = bVar.t;
                this.u = bVar.u;
                this.v = bVar.v;
                this.w = bVar.w;
                this.x = bVar.x;
                this.y = bVar.y;
                this.z = bVar.z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                this.J = bVar.J;
                this.K = bVar.K;
                this.L = bVar.L;
                this.M = bVar.M;
                this.N = bVar.N;
                this.O = bVar.O;
                this.a0 = bVar.a0;
                this.b0 = bVar.b0;
                this.P = bVar.P;
                this.Q = bVar.Q;
                this.R = bVar.R;
                this.T = bVar.T;
                this.S = bVar.S;
                this.U = bVar.U;
                this.V = bVar.V;
                this.W = bVar.W;
                this.X = bVar.X;
                this.Y = bVar.Y;
                this.Z = bVar.Z;
                this.e0 = bVar.e0;
                this.f0 = bVar.f0;
                this.g0 = bVar.g0;
                this.h0 = bVar.h0;
                this.l0 = bVar.l0;
                this.m0 = bVar.m0;
                this.n0 = bVar.n0;
                this.o0 = bVar.o0;
                this.p0 = bVar.p0;
                this.q0 = bVar.q0;
                this.r0 = bVar.r0;
                this.c0 = bVar.c0;
                this.d0 = bVar.d0;
                this.v0 = bVar.v0;
                this.E = bVar.E;
                this.F = bVar.F;
            }
        }

        public String a() {
            return this.c0;
        }

        public UK b() {
            return this.v0;
        }

        public void c() {
            UK uk = this.v0;
            if (uk != null) {
                uk.R0();
            }
        }

        public void d(String str) {
            this.v0.k1(str);
        }

        public void e() {
            this.h0 = false;
            this.e0 = true;
            this.f0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.a0) {
                this.e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.b0) {
                this.f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.e0 = false;
                if (i == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.a0 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f0 = false;
                if (i2 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.b0 = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.h0 = true;
            this.e0 = true;
            this.f0 = true;
            if (!(this.v0 instanceof C9445sF0)) {
                this.v0 = new C9445sF0();
            }
            ((C9445sF0) this.v0).D2(this.Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i) {
            boolean z;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z2 = false;
            if (1 == getLayoutDirection()) {
                z = true;
            } else {
                z = false;
            }
            this.n0 = -1;
            this.o0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.p0 = this.w;
            this.q0 = this.y;
            float f = this.G;
            this.r0 = f;
            int i8 = this.a;
            this.s0 = i8;
            int i9 = this.b;
            this.t0 = i9;
            float f2 = this.c;
            this.u0 = f2;
            if (z) {
                int i10 = this.s;
                if (i10 != -1) {
                    this.n0 = i10;
                } else {
                    int i11 = this.t;
                    if (i11 != -1) {
                        this.o0 = i11;
                    }
                    i2 = this.u;
                    if (i2 != -1) {
                        this.m0 = i2;
                        z2 = true;
                    }
                    i3 = this.v;
                    if (i3 != -1) {
                        this.l0 = i3;
                        z2 = true;
                    }
                    i4 = this.A;
                    if (i4 != Integer.MIN_VALUE) {
                        this.q0 = i4;
                    }
                    i5 = this.B;
                    if (i5 != Integer.MIN_VALUE) {
                        this.p0 = i5;
                    }
                    if (z2) {
                        this.r0 = 1.0f - f;
                    }
                    if (this.h0 && this.Z == 1 && this.d) {
                        if (f2 == -1.0f) {
                            this.u0 = 1.0f - f2;
                            this.s0 = -1;
                            this.t0 = -1;
                        } else if (i8 != -1) {
                            this.t0 = i8;
                            this.s0 = -1;
                            this.u0 = -1.0f;
                        } else if (i9 != -1) {
                            this.s0 = i9;
                            this.t0 = -1;
                            this.u0 = -1.0f;
                        }
                    }
                }
                z2 = true;
                i2 = this.u;
                if (i2 != -1) {
                }
                i3 = this.v;
                if (i3 != -1) {
                }
                i4 = this.A;
                if (i4 != Integer.MIN_VALUE) {
                }
                i5 = this.B;
                if (i5 != Integer.MIN_VALUE) {
                }
                if (z2) {
                }
                if (this.h0) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                int i12 = this.s;
                if (i12 != -1) {
                    this.m0 = i12;
                }
                int i13 = this.t;
                if (i13 != -1) {
                    this.l0 = i13;
                }
                int i14 = this.u;
                if (i14 != -1) {
                    this.n0 = i14;
                }
                int i15 = this.v;
                if (i15 != -1) {
                    this.o0 = i15;
                }
                int i16 = this.A;
                if (i16 != Integer.MIN_VALUE) {
                    this.p0 = i16;
                }
                int i17 = this.B;
                if (i17 != Integer.MIN_VALUE) {
                    this.q0 = i17;
                }
            }
            if (this.u == -1 && this.v == -1 && this.t == -1 && this.s == -1) {
                int i18 = this.g;
                if (i18 != -1) {
                    this.n0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.h;
                    if (i19 != -1) {
                        this.o0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.e;
                if (i20 != -1) {
                    this.l0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && i6 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                        return;
                    }
                    return;
                }
                int i21 = this.f;
                if (i21 != -1) {
                    this.m0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && i6 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    }
                }
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.f17o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new UK();
            this.w0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.H1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = a.i0.get(index);
                switch (i2) {
                    case 1:
                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < 0.0f) {
                            this.r = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 23:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.a0 = obtainStyledAttributes.getBoolean(index, this.a0);
                        break;
                    case 28:
                        this.b0 = obtainStyledAttributes.getBoolean(index, this.b0);
                        break;
                    case 29:
                        this.G = obtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = obtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.P = i3;
                        if (i3 == 1) {
                            Log.e(ConstraintLayout.y1, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.Q = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.y1, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                e.F0(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.L = obtainStyledAttributes.getFloat(index, this.L);
                                continue;
                            case 46:
                                this.M = obtainStyledAttributes.getFloat(index, this.M);
                                continue;
                            case 47:
                                this.N = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.O = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                continue;
                            case 50:
                                this.Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                continue;
                            case 51:
                                this.c0 = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f17o);
                                this.f17o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f17o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i2) {
                                    case 64:
                                        e.D0(this, obtainStyledAttributes, index, 0);
                                        this.E = true;
                                        continue;
                                    case 65:
                                        e.D0(this, obtainStyledAttributes, index, 1);
                                        this.F = true;
                                        continue;
                                    case 66:
                                        this.d0 = obtainStyledAttributes.getInt(index, this.d0);
                                        continue;
                                    case 67:
                                        this.d = obtainStyledAttributes.getBoolean(index, this.d);
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            e();
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.f17o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new UK();
            this.w0 = false;
        }
    }
}
