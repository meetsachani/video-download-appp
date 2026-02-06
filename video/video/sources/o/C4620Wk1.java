package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;
import java.util.HashMap;

/* renamed from: o.Wk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4620Wk1 extends C4814Yk1 {
    public static final int A1 = -1;
    public static final String u1 = "FadeMove";
    public static final int v1 = -1;
    public static final int w1 = 0;
    public static final int x1 = 1;
    public static final int y1 = 2;
    public static final int z1 = 3;
    public float m1;
    public int n1;
    public int o1;
    public int p1;
    public int q1;
    public boolean r1;
    public int s1;
    public int t1;

    public C4620Wk1(Context context) {
        super(context);
        this.m1 = 0.1f;
        this.n1 = 49;
        this.o1 = 50;
        this.p1 = 0;
        this.q1 = 0;
        this.r1 = true;
        this.s1 = -1;
        this.t1 = -1;
    }

    private void M(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Uc);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.Yc) {
                    int i2 = obtainStyledAttributes.getInt(index, this.n1);
                    this.n1 = i2;
                    this.n1 = Math.max(Math.min(i2, 99), 0);
                } else if (index == j.c.Wc) {
                    int i3 = obtainStyledAttributes.getInt(index, this.o1);
                    this.o1 = i3;
                    this.o1 = Math.max(Math.min(i3, 99), 0);
                } else if (index == j.c.ad) {
                    this.p1 = obtainStyledAttributes.getDimensionPixelOffset(index, this.p1);
                } else if (index == j.c.bd) {
                    this.q1 = obtainStyledAttributes.getDimensionPixelOffset(index, this.q1);
                } else if (index == j.c.Vc) {
                    this.m1 = obtainStyledAttributes.getFloat(index, this.m1);
                } else if (index == j.c.Xc) {
                    this.t1 = obtainStyledAttributes.getInt(index, this.t1);
                } else if (index == j.c.Zc) {
                    this.r1 = obtainStyledAttributes.getBoolean(index, this.r1);
                } else if (index == j.c.cd) {
                    this.s1 = obtainStyledAttributes.getResourceId(index, this.s1);
                }
            }
            int i4 = this.n1;
            int i5 = this.o1;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.n1 = i4 - 1;
                } else {
                    this.o1 = i5 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0180, code lost:
        if (r14 == 0.0f) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0196, code lost:
        if (r14 == 0.0f) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a7, code lost:
        if (r15 == 0.0f) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b8, code lost:
        if (r15 == 0.0f) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e3  */
    @Override // o.C4814Yk1, o.InterfaceC4921Zk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(C7114il1 c7114il1, HashMap<View, C4523Vk1> hashMap) {
        AbstractC6818hX0 abstractC6818hX0;
        AbstractC6818hX0 abstractC6818hX02;
        AbstractC6818hX0 abstractC6818hX03;
        int i;
        int i2;
        int i3;
        HashMap<View, C4523Vk1> hashMap2 = hashMap;
        int i4 = 1;
        View[] x = x((ConstraintLayout) getParent());
        if (x == null) {
            Log.v(u1, AV.f() + " views = null");
            return;
        }
        AbstractC6818hX0 c7788lX0 = new C7788lX0();
        AbstractC6818hX0 c7788lX02 = new C7788lX0();
        c7788lX0.j("alpha", Float.valueOf(this.m1));
        c7788lX02.j("alpha", Float.valueOf(this.m1));
        c7788lX0.h(this.n1);
        c7788lX02.h(this.o1);
        EX0 ex0 = new EX0();
        ex0.h(this.n1);
        ex0.A(0);
        ex0.j("percentX", 0);
        ex0.j("percentY", 0);
        EX0 ex02 = new EX0();
        ex02.h(this.o1);
        ex02.A(0);
        ex02.j("percentX", 1);
        ex02.j("percentY", 1);
        AbstractC6818hX0 abstractC6818hX04 = null;
        if (this.p1 > 0) {
            abstractC6818hX0 = new C7788lX0();
            abstractC6818hX02 = new C7788lX0();
            abstractC6818hX0.j("translationX", Integer.valueOf(this.p1));
            abstractC6818hX0.h(this.o1);
            abstractC6818hX02.j("translationX", 0);
            abstractC6818hX02.h(this.o1 - 1);
        } else {
            abstractC6818hX0 = null;
            abstractC6818hX02 = null;
        }
        if (this.q1 > 0) {
            abstractC6818hX04 = new C7788lX0();
            abstractC6818hX03 = new C7788lX0();
            abstractC6818hX04.j("translationY", Integer.valueOf(this.q1));
            abstractC6818hX04.h(this.o1);
            abstractC6818hX03.j("translationY", 0);
            abstractC6818hX03.h(this.o1 - 1);
        } else {
            abstractC6818hX03 = null;
        }
        int i5 = this.t1;
        if (i5 == -1) {
            int[] iArr = new int[4];
            i = 3;
            i2 = 2;
            for (View view : x) {
                C4523Vk1 c4523Vk1 = hashMap2.get(view);
                if (c4523Vk1 != null) {
                    float t = c4523Vk1.t() - c4523Vk1.G();
                    float u = c4523Vk1.u() - c4523Vk1.H();
                    if (u < 0.0f) {
                        iArr[1] = iArr[1] + 1;
                    }
                    if (u > 0.0f) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (t > 0.0f) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (t < 0.0f) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
            }
            int i6 = iArr[0];
            int i7 = 0;
            for (int i8 = 4; i4 < i8; i8 = 4) {
                int i9 = iArr[i4];
                if (i6 < i9) {
                    i6 = i9;
                    i7 = i4;
                }
                i4++;
            }
            i5 = i7;
        } else {
            i = 3;
            i2 = 2;
        }
        int i10 = 0;
        while (i10 < x.length) {
            C4523Vk1 c4523Vk12 = hashMap2.get(x[i10]);
            if (c4523Vk12 != null) {
                float t2 = c4523Vk12.t() - c4523Vk12.G();
                float u2 = c4523Vk12.u() - c4523Vk12.H();
                if (i5 == 0) {
                    if (u2 > 0.0f) {
                        if (this.r1) {
                        }
                    }
                    i3 = this.s1;
                    if (i3 != -1) {
                        c4523Vk12.a(c7788lX0);
                        c4523Vk12.a(c7788lX02);
                        c4523Vk12.a(ex0);
                        c4523Vk12.a(ex02);
                        if (this.p1 > 0) {
                            c4523Vk12.a(abstractC6818hX0);
                            c4523Vk12.a(abstractC6818hX02);
                        }
                        if (this.q1 > 0) {
                            c4523Vk12.a(abstractC6818hX04);
                            c4523Vk12.a(abstractC6818hX03);
                        }
                    } else {
                        c7114il1.m0(i3, c4523Vk12);
                    }
                } else if (i5 == 1) {
                    if (u2 < 0.0f) {
                        if (this.r1) {
                        }
                    }
                    i3 = this.s1;
                    if (i3 != -1) {
                    }
                } else if (i5 == i2) {
                    if (t2 < 0.0f) {
                        if (this.r1) {
                        }
                    }
                    i3 = this.s1;
                    if (i3 != -1) {
                    }
                } else {
                    if (i5 == i) {
                        if (t2 > 0.0f) {
                            if (this.r1) {
                            }
                        }
                    }
                    i3 = this.s1;
                    if (i3 != -1) {
                    }
                }
                i10++;
                hashMap2 = hashMap;
                i = 3;
                i2 = 2;
            }
            i10++;
            hashMap2 = hashMap;
            i = 3;
            i2 = 2;
        }
    }

    @Override // o.C4814Yk1, o.InterfaceC4921Zk1
    public boolean k() {
        return true;
    }

    public C4620Wk1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m1 = 0.1f;
        this.n1 = 49;
        this.o1 = 50;
        this.p1 = 0;
        this.q1 = 0;
        this.r1 = true;
        this.s1 = -1;
        this.t1 = -1;
        M(context, attributeSet);
    }

    public C4620Wk1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m1 = 0.1f;
        this.n1 = 49;
        this.o1 = 50;
        this.p1 = 0;
        this.q1 = 0;
        this.r1 = true;
        this.s1 = -1;
        this.t1 = -1;
        M(context, attributeSet);
    }
}
