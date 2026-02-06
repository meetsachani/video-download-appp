package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.j;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import o.C8590ol1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.mI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7994mI2 {
    public static final String A = "ConstraintOverride";
    public static final String B = "CustomAttribute";
    public static final String C = "CustomMethod";
    public static final int D = -1;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = -1;
    public static final int N = -2;
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 3;
    public static final int S = 4;
    public static final int T = 5;
    public static final int U = 6;
    public static final String x = "ViewTransition";
    public static final String y = "ViewTransition";
    public static final String z = "KeyFrameSet";
    public androidx.constraintlayout.widget.e a;
    public int b;
    public int f;
    public C10243vX0 g;
    public e.a h;
    public int k;
    public String l;
    public Context p;
    public int c = -1;
    public boolean d = false;
    public int e = 0;
    public int i = -1;
    public int j = -1;
    public int m = 0;
    public String n = null;

    /* renamed from: o  reason: collision with root package name */
    public int f803o = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public int w = -1;

    /* renamed from: o.mI2$a */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        public final /* synthetic */ C6725h90 a;

        public a(C6725h90 c6725h90) {
            this.a = c6725h90;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.a.a(f);
        }
    }

    /* renamed from: o.mI2$b */
    /* loaded from: classes.dex */
    public static class b {
        public final int a;
        public final int b;
        public long c;
        public C4523Vk1 d;
        public int e;
        public int f;
        public C8481oI2 h;
        public Interpolator i;
        public float k;
        public float l;
        public long m;

        /* renamed from: o  reason: collision with root package name */
        public boolean f804o;
        public C8049mX0 g = new C8049mX0();
        public boolean j = false;
        public Rect n = new Rect();

        public b(C8481oI2 c8481oI2, C4523Vk1 c4523Vk1, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            float f;
            this.f804o = false;
            this.h = c8481oI2;
            this.d = c4523Vk1;
            this.e = i;
            this.f = i2;
            long nanoTime = System.nanoTime();
            this.c = nanoTime;
            this.m = nanoTime;
            this.h.c(this);
            this.i = interpolator;
            this.a = i4;
            this.b = i5;
            if (i3 == 3) {
                this.f804o = true;
            }
            if (i == 0) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f / i;
            }
            this.l = f;
            a();
        }

        public void a() {
            if (this.j) {
                c();
            } else {
                b();
            }
        }

        public void b() {
            float interpolation;
            long nanoTime = System.nanoTime();
            this.m = nanoTime;
            float f = this.k + (((float) ((nanoTime - this.m) * 1.0E-6d)) * this.l);
            this.k = f;
            if (f >= 1.0f) {
                this.k = 1.0f;
            }
            Interpolator interpolator = this.i;
            if (interpolator == null) {
                interpolation = this.k;
            } else {
                interpolation = interpolator.getInterpolation(this.k);
            }
            float f2 = interpolation;
            C4523Vk1 c4523Vk1 = this.d;
            boolean L = c4523Vk1.L(c4523Vk1.b, f2, nanoTime, this.g);
            if (this.k >= 1.0f) {
                if (this.a != -1) {
                    this.d.J().setTag(this.a, Long.valueOf(System.nanoTime()));
                }
                if (this.b != -1) {
                    this.d.J().setTag(this.b, null);
                }
                if (!this.f804o) {
                    this.h.k(this);
                }
            }
            if (this.k >= 1.0f && !L) {
                return;
            }
            this.h.g();
        }

        public void c() {
            float interpolation;
            long nanoTime = System.nanoTime();
            this.m = nanoTime;
            float f = this.k - (((float) ((nanoTime - this.m) * 1.0E-6d)) * this.l);
            this.k = f;
            if (f < 0.0f) {
                this.k = 0.0f;
            }
            Interpolator interpolator = this.i;
            if (interpolator == null) {
                interpolation = this.k;
            } else {
                interpolation = interpolator.getInterpolation(this.k);
            }
            float f2 = interpolation;
            C4523Vk1 c4523Vk1 = this.d;
            boolean L = c4523Vk1.L(c4523Vk1.b, f2, nanoTime, this.g);
            if (this.k <= 0.0f) {
                if (this.a != -1) {
                    this.d.J().setTag(this.a, Long.valueOf(System.nanoTime()));
                }
                if (this.b != -1) {
                    this.d.J().setTag(this.b, null);
                }
                this.h.k(this);
            }
            if (this.k <= 0.0f && !L) {
                return;
            }
            this.h.g();
        }

        public void d(int i, float f, float f2) {
            if (i != 1) {
                if (i == 2) {
                    this.d.J().getHitRect(this.n);
                    if (!this.n.contains((int) f, (int) f2) && !this.j) {
                        e(true);
                    }
                }
            } else if (!this.j) {
                e(true);
            }
        }

        public void e(boolean z) {
            int i;
            float f;
            this.j = z;
            if (z && (i = this.f) != -1) {
                if (i == 0) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f / i;
                }
                this.l = f;
            }
            this.h.g();
            this.m = System.nanoTime();
        }
    }

    public C7994mI2(Context context, XmlPullParser xmlPullParser) {
        boolean z2;
        this.p = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "ViewTransition".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals(A)) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                z2 = false;
                                break;
                            }
                            z2 = true;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                z2 = true;
                                break;
                            }
                            z2 = true;
                            break;
                        default:
                            z2 = true;
                            break;
                    }
                    if (z2) {
                        if (!z2) {
                            if (!z2) {
                                if (!z2 && !z2) {
                                    Log.e("ViewTransition", AV.f() + " unknown tag " + name);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(".xml:");
                                    sb.append(xmlPullParser.getLineNumber());
                                    Log.e("ViewTransition", sb.toString());
                                    continue;
                                } else {
                                    androidx.constraintlayout.widget.a.q(context, xmlPullParser, this.h.g);
                                    continue;
                                }
                            } else {
                                this.h = androidx.constraintlayout.widget.e.w(context, xmlPullParser);
                                continue;
                            }
                        } else {
                            this.g = new C10243vX0(context, xmlPullParser);
                            continue;
                        }
                    } else {
                        m(context, xmlPullParser);
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            Log.e("ViewTransition", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ViewTransition", "Error parsing XML resource", e2);
        }
    }

    public static /* synthetic */ void a(C7994mI2 c7994mI2, View[] viewArr) {
        if (c7994mI2.q != -1) {
            for (View view : viewArr) {
                view.setTag(c7994mI2.q, Long.valueOf(System.nanoTime()));
            }
        }
        if (c7994mI2.r != -1) {
            for (View view2 : viewArr) {
                view2.setTag(c7994mI2.r, null);
            }
        }
    }

    public void b(C8481oI2 c8481oI2, C7114il1 c7114il1, View view) {
        C4523Vk1 c4523Vk1 = new C4523Vk1(view);
        c4523Vk1.R(view);
        this.g.a(c4523Vk1);
        c4523Vk1.a0(c7114il1.getWidth(), c7114il1.getHeight(), this.i, System.nanoTime());
        new b(c8481oI2, c4523Vk1, this.i, this.j, this.c, f(c7114il1.getContext()), this.q, this.r);
    }

    public void c(C8481oI2 c8481oI2, C7114il1 c7114il1, int i, androidx.constraintlayout.widget.e eVar, final View... viewArr) {
        int[] constraintSetIds;
        if (this.d) {
            return;
        }
        int i2 = this.f;
        if (i2 == 2) {
            b(c8481oI2, c7114il1, viewArr[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : c7114il1.getConstraintSetIds()) {
                if (i3 != i) {
                    androidx.constraintlayout.widget.e F0 = c7114il1.F0(i3);
                    for (View view : viewArr) {
                        e.a k0 = F0.k0(view.getId());
                        e.a aVar = this.h;
                        if (aVar != null) {
                            aVar.h(k0);
                            k0.g.putAll(this.h.g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.e eVar2 = new androidx.constraintlayout.widget.e();
        eVar2.I(eVar);
        for (View view2 : viewArr) {
            e.a k02 = eVar2.k0(view2.getId());
            e.a aVar2 = this.h;
            if (aVar2 != null) {
                aVar2.h(k02);
                k02.g.putAll(this.h.g);
            }
        }
        c7114il1.q1(i, eVar2);
        int i4 = j.b.view_transition;
        c7114il1.q1(i4, eVar);
        c7114il1.J(i4, -1, -1);
        C8590ol1.b bVar = new C8590ol1.b(-1, c7114il1.F1, i4, i);
        for (View view3 : viewArr) {
            u(bVar, view3);
        }
        c7114il1.setTransition(bVar);
        c7114il1.i1(new Runnable() { // from class: o.lI2
            @Override // java.lang.Runnable
            public final void run() {
                C7994mI2.a(C7994mI2.this, viewArr);
            }
        });
    }

    public boolean d(View view) {
        boolean z2;
        boolean z3;
        int i = this.s;
        if (i == -1 || view.getTag(i) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.t;
        if (i2 == -1 || view.getTag(i2) == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 || !z3) {
            return false;
        }
        return true;
    }

    public int e() {
        return this.b;
    }

    public Interpolator f(Context context) {
        int i = this.m;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(C6725h90.c(this.n));
        }
        return AnimationUtils.loadInterpolator(context, this.f803o);
    }

    public int g() {
        return this.u;
    }

    public int h() {
        return this.w;
    }

    public int i() {
        return this.v;
    }

    public int j() {
        return this.c;
    }

    public boolean k() {
        return !this.d;
    }

    public boolean l(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.k == -1 && this.l == null) || !d(view)) {
            return false;
        }
        if (view.getId() == this.k) {
            return true;
        }
        if (this.l == null || !(view.getLayoutParams() instanceof ConstraintLayout.b) || (str = ((ConstraintLayout.b) view.getLayoutParams()).c0) == null || !str.matches(this.l)) {
            return false;
        }
        return true;
    }

    public final void m(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.xf);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == j.c.yf) {
                this.b = obtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == j.c.Gf) {
                if (C7114il1.q3) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.k);
                    this.k = resourceId;
                    if (resourceId == -1) {
                        this.l = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.l = obtainStyledAttributes.getString(index);
                } else {
                    this.k = obtainStyledAttributes.getResourceId(index, this.k);
                }
            } else if (index == j.c.Hf) {
                this.c = obtainStyledAttributes.getInt(index, this.c);
            } else if (index == j.c.Kf) {
                this.d = obtainStyledAttributes.getBoolean(index, this.d);
            } else if (index == j.c.If) {
                this.e = obtainStyledAttributes.getInt(index, this.e);
            } else if (index == j.c.Cf) {
                this.i = obtainStyledAttributes.getInt(index, this.i);
            } else if (index == j.c.Lf) {
                this.j = obtainStyledAttributes.getInt(index, this.j);
            } else if (index == j.c.Mf) {
                this.f = obtainStyledAttributes.getInt(index, this.f);
            } else if (index == j.c.Ff) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f803o = resourceId2;
                    if (resourceId2 != -1) {
                        this.m = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.n = string;
                    if (string != null && string.indexOf(RemoteSettings.i) > 0) {
                        this.f803o = obtainStyledAttributes.getResourceId(index, -1);
                        this.m = -2;
                    } else {
                        this.m = -1;
                    }
                } else {
                    this.m = obtainStyledAttributes.getInteger(index, this.m);
                }
            } else if (index == j.c.Jf) {
                this.q = obtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == j.c.Bf) {
                this.r = obtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == j.c.Ef) {
                this.s = obtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == j.c.Df) {
                this.t = obtainStyledAttributes.getResourceId(index, this.t);
            } else if (index == j.c.Af) {
                this.v = obtainStyledAttributes.getResourceId(index, this.v);
            } else if (index == j.c.zf) {
                this.u = obtainStyledAttributes.getInteger(index, this.u);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void n(boolean z2) {
        this.d = !z2;
    }

    public void o(int i) {
        this.b = i;
    }

    public void p(int i) {
        this.u = i;
    }

    public void q(int i) {
        this.w = i;
    }

    public void r(int i) {
        this.v = i;
    }

    public void s(int i) {
        this.c = i;
    }

    public boolean t(int i) {
        int i2 = this.c;
        if (i2 == 1) {
            if (i != 0) {
                return false;
            }
            return true;
        } else if (i2 == 2) {
            if (i != 1) {
                return false;
            }
            return true;
        } else if (i2 != 3 || i != 0) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return "ViewTransition(" + AV.i(this.p, this.b) + C9811tl1.d;
    }

    public final void u(C8590ol1.b bVar, View view) {
        int i = this.i;
        if (i != -1) {
            bVar.O(i);
        }
        bVar.U(this.e);
        bVar.Q(this.m, this.n, this.f803o);
        int id = view.getId();
        C10243vX0 c10243vX0 = this.g;
        if (c10243vX0 != null) {
            ArrayList<AbstractC6818hX0> d = c10243vX0.d(-1);
            C10243vX0 c10243vX02 = new C10243vX0();
            Iterator<AbstractC6818hX0> it = d.iterator();
            while (it.hasNext()) {
                c10243vX02.c(it.next().clone().k(id));
            }
            bVar.t(c10243vX02);
        }
    }
}
