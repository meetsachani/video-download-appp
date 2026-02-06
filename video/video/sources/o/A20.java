package o;

import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public class A20 {
    public static final HashMap<Pair<Integer, Integer>, String> g;
    public static final HashMap<String, String> h;
    public static final boolean i = false;
    public static final boolean j = false;
    public static final String k = "DesignTool";
    public final C7114il1 a;
    public C8590ol1 b;
    public String c = null;
    public String d = null;
    public int e = -1;
    public int f = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        g = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        h = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public A20(C7114il1 c7114il1) {
        this.a = c7114il1;
    }

    public static void a(int i2, androidx.constraintlayout.widget.e eVar, View view, HashMap<String, String> hashMap, int i3, int i4) {
        int i5;
        String str = g.get(Pair.create(Integer.valueOf(i3), Integer.valueOf(i4)));
        String str2 = hashMap.get(str);
        if (str2 != null) {
            String str3 = h.get(str);
            if (str3 != null) {
                i5 = q(i2, hashMap.get(str3));
            } else {
                i5 = 0;
            }
            int i6 = i5;
            eVar.L(view.getId(), i3, Integer.parseInt(str2), i4, i6);
        }
    }

    public static int q(int i2, String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, indexOf)).intValue() * i2) / 160.0f);
    }

    public static void v(int i2, androidx.constraintlayout.widget.e eVar, View view, HashMap<String, String> hashMap) {
        String str = hashMap.get("layout_editor_absoluteX");
        if (str != null) {
            eVar.Z0(view.getId(), q(i2, str));
        }
        String str2 = hashMap.get("layout_editor_absoluteY");
        if (str2 != null) {
            eVar.a1(view.getId(), q(i2, str2));
        }
    }

    public static void x(androidx.constraintlayout.widget.e eVar, View view, HashMap<String, String> hashMap, int i2) {
        String str;
        if (i2 == 1) {
            str = "layout_constraintVertical_bias";
        } else {
            str = "layout_constraintHorizontal_bias";
        }
        String str2 = hashMap.get(str);
        if (str2 != null) {
            if (i2 == 0) {
                eVar.i1(view.getId(), Float.parseFloat(str2));
            } else if (i2 == 1) {
                eVar.F1(view.getId(), Float.parseFloat(str2));
            }
        }
    }

    public static void y(int i2, androidx.constraintlayout.widget.e eVar, View view, HashMap<String, String> hashMap, int i3) {
        String str;
        int i4;
        if (i3 == 1) {
            str = "layout_height";
        } else {
            str = "layout_width";
        }
        String str2 = hashMap.get(str);
        if (str2 != null) {
            if (!str2.equalsIgnoreCase("wrap_content")) {
                i4 = q(i2, str2);
            } else {
                i4 = -2;
            }
            if (i3 == 0) {
                eVar.W(view.getId(), i4);
            } else {
                eVar.P(view.getId(), i4);
            }
        }
    }

    public boolean A(Object obj, int i2, int i3, float f, float f2) {
        if (!(obj instanceof View)) {
            return false;
        }
        C7114il1 c7114il1 = this.a;
        if (c7114il1.F1 != null) {
            C4523Vk1 c4523Vk1 = c7114il1.P1.get(obj);
            C7114il1 c7114il12 = this.a;
            int i4 = (int) (c7114il12.S1 * 100.0f);
            if (c4523Vk1 != null) {
                View view = (View) obj;
                if (c7114il12.F1.T(view, i4)) {
                    float y = c4523Vk1.y(2, f, f2);
                    float y2 = c4523Vk1.y(5, f, f2);
                    this.a.F1.m0(view, i4, "motion:percentX", Float.valueOf(y));
                    this.a.F1.m0(view, i4, "motion:percentY", Float.valueOf(y2));
                    this.a.X0();
                    this.a.y0(true);
                    this.a.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public void B(Object obj, String str, Object obj2) {
        if (obj instanceof AbstractC6818hX0) {
            ((AbstractC6818hX0) obj).j(str, obj2);
            this.a.X0();
            this.a.X1 = true;
        }
    }

    public void C(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (Objects.equals(this.c, str)) {
            return;
        }
        this.c = str;
        this.d = null;
        C7114il1 c7114il1 = this.a;
        if (c7114il1.F1 == null) {
            c7114il1.F1 = this.b;
        }
        int S0 = c7114il1.S0(str);
        this.e = S0;
        if (S0 != 0) {
            if (S0 == this.a.getStartState()) {
                this.a.setProgress(0.0f);
            } else if (S0 == this.a.getEndState()) {
                this.a.setProgress(1.0f);
            } else {
                this.a.l1(S0);
                this.a.setProgress(1.0f);
            }
        }
        this.a.requestLayout();
    }

    public void D(float f) {
        C7114il1 c7114il1 = this.a;
        if (c7114il1.F1 == null) {
            c7114il1.F1 = this.b;
        }
        c7114il1.setProgress(f);
        this.a.y0(true);
        this.a.requestLayout();
        this.a.invalidate();
    }

    public void E(String str, String str2) {
        C7114il1 c7114il1 = this.a;
        if (c7114il1.F1 == null) {
            c7114il1.F1 = this.b;
        }
        int S0 = c7114il1.S0(str);
        int S02 = this.a.S0(str2);
        this.a.c1(S0, S02);
        this.e = S0;
        this.f = S02;
        this.c = str;
        this.d = str2;
    }

    public void F(Object obj, int i2) {
        C4523Vk1 c4523Vk1;
        if ((obj instanceof View) && (c4523Vk1 = this.a.P1.get(obj)) != null) {
            c4523Vk1.S(i2);
            this.a.invalidate();
        }
    }

    public int b(int i2, String str, Object obj, float[] fArr, int i3, float[] fArr2, int i4) {
        C4523Vk1 c4523Vk1;
        View view = (View) obj;
        if (i2 != 0) {
            C7114il1 c7114il1 = this.a;
            if (c7114il1.F1 == null || view == null || (c4523Vk1 = c7114il1.P1.get(view)) == null) {
                return -1;
            }
        } else {
            c4523Vk1 = null;
        }
        if (i2 == 0) {
            return 1;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return -1;
                }
                this.a.F1.t();
                return c4523Vk1.l(str, fArr2, i4);
            }
            int t = this.a.F1.t() / 16;
            c4523Vk1.e(fArr2, null);
            return t;
        }
        int t2 = this.a.F1.t() / 16;
        c4523Vk1.f(fArr2, t2);
        return t2;
    }

    public void c(boolean z) {
        this.a.u0(z);
    }

    public void d(String str) {
        C7114il1 c7114il1 = this.a;
        if (c7114il1.F1 == null) {
            c7114il1.F1 = this.b;
        }
        int S0 = c7114il1.S0(str);
        PrintStream printStream = System.out;
        printStream.println(" dumping  " + str + " (" + S0 + C9811tl1.d);
        try {
            this.a.F1.o(S0).g0(this.a.F1, new int[0]);
        } catch (Exception e) {
            Log.e(k, "Error while dumping: " + str + " (" + S0 + C9811tl1.d, e);
        }
    }

    public int e(Object obj, float[] fArr) {
        C8590ol1 c8590ol1 = this.a.F1;
        if (c8590ol1 == null) {
            return -1;
        }
        int t = c8590ol1.t() / 16;
        C4523Vk1 c4523Vk1 = this.a.P1.get(obj);
        if (c4523Vk1 == null) {
            return 0;
        }
        c4523Vk1.e(fArr, null);
        return t;
    }

    public int f(Object obj, float[] fArr, int i2) {
        C7114il1 c7114il1 = this.a;
        if (c7114il1.F1 == null) {
            return -1;
        }
        C4523Vk1 c4523Vk1 = c7114il1.P1.get(obj);
        if (c4523Vk1 == null) {
            return 0;
        }
        c4523Vk1.f(fArr, i2);
        return i2;
    }

    public void g(Object obj, float[] fArr) {
        C8590ol1 c8590ol1 = this.a.F1;
        if (c8590ol1 != null) {
            int t = c8590ol1.t() / 16;
            C4523Vk1 c4523Vk1 = this.a.P1.get(obj);
            if (c4523Vk1 == null) {
                return;
            }
            c4523Vk1.h(fArr, t);
        }
    }

    public String h() {
        int endState = this.a.getEndState();
        if (this.f == endState) {
            return this.d;
        }
        String G0 = this.a.G0(endState);
        if (G0 != null) {
            this.d = G0;
            this.f = endState;
        }
        return G0;
    }

    public int i(Object obj, int i2, int[] iArr) {
        C4523Vk1 c4523Vk1 = this.a.P1.get((View) obj);
        if (c4523Vk1 == null) {
            return 0;
        }
        return c4523Vk1.x(i2, iArr);
    }

    public float j(Object obj, int i2, float f, float f2) {
        C4523Vk1 c4523Vk1;
        if (!(obj instanceof View) || (c4523Vk1 = this.a.P1.get((View) obj)) == null) {
            return 0.0f;
        }
        return c4523Vk1.y(i2, f, f2);
    }

    public int k(Object obj, int[] iArr, float[] fArr) {
        C4523Vk1 c4523Vk1 = this.a.P1.get((View) obj);
        if (c4523Vk1 == null) {
            return 0;
        }
        return c4523Vk1.z(iArr, fArr);
    }

    public Object l(int i2, int i3, int i4) {
        C7114il1 c7114il1 = this.a;
        C8590ol1 c8590ol1 = c7114il1.F1;
        if (c8590ol1 == null) {
            return null;
        }
        return c8590ol1.y(c7114il1.getContext(), i2, i3, i4);
    }

    public Object m(Object obj, int i2, int i3) {
        if (this.a.F1 == null) {
            return null;
        }
        int id = ((View) obj).getId();
        C7114il1 c7114il1 = this.a;
        return c7114il1.F1.y(c7114il1.getContext(), i2, id, i3);
    }

    public Object n(Object obj, float f, float f2) {
        C4523Vk1 c4523Vk1;
        View view = (View) obj;
        C7114il1 c7114il1 = this.a;
        if (c7114il1.F1 == null) {
            return -1;
        }
        if (view == null || (c4523Vk1 = c7114il1.P1.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return c4523Vk1.B(viewGroup.getWidth(), viewGroup.getHeight(), f, f2);
    }

    public Boolean o(Object obj, Object obj2, float f, float f2, String[] strArr, float[] fArr) {
        if (obj instanceof FX0) {
            View view = (View) obj2;
            this.a.P1.get(view).N(view, (FX0) obj, f, f2, strArr, fArr);
            this.a.X0();
            this.a.X1 = true;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public float p() {
        return this.a.getProgress();
    }

    public String r() {
        int startState = this.a.getStartState();
        if (this.e == startState) {
            return this.c;
        }
        String G0 = this.a.G0(startState);
        if (G0 != null) {
            this.c = G0;
            this.e = startState;
        }
        return this.a.G0(startState);
    }

    public String s() {
        if (this.c != null && this.d != null) {
            float p = p();
            if (p <= 0.01f) {
                return this.c;
            }
            if (p >= 0.99f) {
                return this.d;
            }
        }
        return this.c;
    }

    public long t() {
        return this.a.getTransitionTimeMs();
    }

    public boolean u() {
        if (this.c != null && this.d != null) {
            return true;
        }
        return false;
    }

    public void w(int i2, String str, Object obj, Object obj2) {
        HashMap hashMap;
        View view = (View) obj;
        if (obj2 instanceof HashMap) {
            hashMap = (HashMap) obj2;
        } else {
            hashMap = new HashMap();
        }
        HashMap hashMap2 = hashMap;
        int S0 = this.a.S0(str);
        androidx.constraintlayout.widget.e o2 = this.a.F1.o(S0);
        if (o2 == null) {
            return;
        }
        o2.E(view.getId());
        y(i2, o2, view, hashMap2, 0);
        y(i2, o2, view, hashMap2, 1);
        a(i2, o2, view, hashMap2, 6, 6);
        a(i2, o2, view, hashMap2, 6, 7);
        a(i2, o2, view, hashMap2, 7, 7);
        a(i2, o2, view, hashMap2, 7, 6);
        a(i2, o2, view, hashMap2, 1, 1);
        a(i2, o2, view, hashMap2, 1, 2);
        a(i2, o2, view, hashMap2, 2, 2);
        a(i2, o2, view, hashMap2, 2, 1);
        a(i2, o2, view, hashMap2, 3, 3);
        a(i2, o2, view, hashMap2, 3, 4);
        a(i2, o2, view, hashMap2, 4, 3);
        a(i2, o2, view, hashMap2, 4, 4);
        a(i2, o2, view, hashMap2, 5, 5);
        x(o2, view, hashMap2, 0);
        x(o2, view, hashMap2, 1);
        v(i2, o2, view, hashMap2);
        this.a.q1(S0, o2);
        this.a.requestLayout();
    }

    public void z(Object obj, int i2, String str, Object obj2) {
        C8590ol1 c8590ol1 = this.a.F1;
        if (c8590ol1 != null) {
            c8590ol1.m0((View) obj, i2, str, obj2);
            C7114il1 c7114il1 = this.a;
            c7114il1.V1 = i2 / 100.0f;
            c7114il1.T1 = 0.0f;
            c7114il1.X0();
            this.a.y0(true);
        }
    }
}
