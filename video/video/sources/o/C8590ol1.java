package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.j;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.AbstractC4253Sp2;
import o.C7114il1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.ol1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8590ol1 {
    public static final int A = -2;
    public static final int B = -1;
    public static final boolean C = false;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final String G = "MotionScene";
    public static final String H = "Transition";
    public static final String I = "OnSwipe";
    public static final String J = "OnClick";
    public static final String K = "StateSet";
    public static final String L = "Include";
    public static final String M = "include";
    public static final String N = "KeyFrameSet";
    public static final String O = "ConstraintSet";
    public static final String P = "ViewTransition";
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static final int T = 3;
    public static final int U = 4;
    public static final int V = 5;
    public static final int W = 6;
    public static final String u = "MotionScene";
    public static final boolean v = false;
    public static final int w = 8;
    public static final int x = 0;
    public static final int y = 1;
    public static final int z = -1;
    public final C7114il1 a;
    public MotionEvent m;
    public C7114il1.h p;
    public boolean q;
    public final C8481oI2 r;
    public float s;
    public float t;
    public androidx.constraintlayout.widget.m b = null;
    public b c = null;
    public boolean d = false;
    public ArrayList<b> e = new ArrayList<>();
    public b f = null;
    public ArrayList<b> g = new ArrayList<>();
    public SparseArray<androidx.constraintlayout.widget.e> h = new SparseArray<>();
    public HashMap<String, Integer> i = new HashMap<>();
    public SparseIntArray j = new SparseIntArray();
    public int k = 400;
    public int l = 0;
    public boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f830o = false;

    /* renamed from: o.ol1$a */
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

    public C8590ol1(C7114il1 c7114il1) {
        this.a = c7114il1;
        this.r = new C8481oI2(c7114il1);
    }

    public static String A(Context context, int i, XmlPullParser xmlPullParser) {
        return ".(" + AV.i(context, i) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + AbstractC4253Sp2.b.x1;
    }

    public static String r0(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    public int[] B(String... strArr) {
        int size = this.h.size();
        int[] iArr = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.constraintlayout.widget.e valueAt = this.h.valueAt(i2);
            int keyAt = this.h.keyAt(i2);
            if (valueAt.B0(strArr)) {
                valueAt.s0();
                iArr[i] = keyAt;
                i++;
            }
        }
        return Arrays.copyOf(iArr, i);
    }

    public float C() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.i();
        }
        return 0.0f;
    }

    public float D() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.j();
        }
        return 0.0f;
    }

    public boolean E() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.k();
        }
        return false;
    }

    public float F(View view, int i) {
        return 0.0f;
    }

    public float G(float f, float f2) {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.l(f, f2);
        }
        return 0.0f;
    }

    public final int H(int i) {
        int e;
        androidx.constraintlayout.widget.m mVar = this.b;
        if (mVar != null && (e = mVar.e(i, -1, -1)) != -1) {
            return e;
        }
        return i;
    }

    public int I() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.m();
        }
        return 0;
    }

    public float J() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.n();
        }
        return 0.0f;
    }

    public float K() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.o();
        }
        return 0.0f;
    }

    public float L() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.p();
        }
        return 0.0f;
    }

    public float M() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.q();
        }
        return 0.0f;
    }

    public float N() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.i;
        }
        return 0.0f;
    }

    public int O() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.d;
        }
        return -1;
    }

    public b P(int i) {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.a == i) {
                return next;
            }
        }
        return null;
    }

    public int Q(int i) {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next().d == i) {
                return 0;
            }
        }
        return 1;
    }

    public List<b> R(int i) {
        int H2 = H(i);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.d == H2 || next.c == H2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean S(int i) {
        int i2 = this.j.get(i);
        int size = this.j.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.j.get(i2);
            size = i3;
        }
        return false;
    }

    public boolean T(View view, int i) {
        b bVar = this.c;
        if (bVar == null) {
            return false;
        }
        Iterator it = bVar.k.iterator();
        while (it.hasNext()) {
            Iterator<AbstractC6818hX0> it2 = ((C10243vX0) it.next()).d(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().a == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean U() {
        if (this.p != null) {
            return true;
        }
        return false;
    }

    public boolean V(int i) {
        return this.r.h(i);
    }

    public final void W(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1239391468:
                                if (name.equals("KeyFrameSet")) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -687739768:
                                if (name.equals(L)) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 61998586:
                                if (name.equals("ViewTransition")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 269306229:
                                if (name.equals("Transition")) {
                                    break;
                                }
                                c = 65535;
                                break;
                            case 312750793:
                                if (name.equals(J)) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 327855227:
                                if (name.equals(I)) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 793277014:
                                if (name.equals("MotionScene")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1382829617:
                                if (name.equals(K)) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1942574248:
                                if (name.equals(M)) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                d0(context, xml);
                                continue;
                            case 1:
                                ArrayList<b> arrayList = this.e;
                                bVar = new b(this, context, xml);
                                arrayList.add(bVar);
                                if (this.c == null && !bVar.b) {
                                    this.c = bVar;
                                    if (bVar.l != null) {
                                        this.c.l.D(this.q);
                                    }
                                }
                                if (bVar.b) {
                                    if (bVar.c == -1) {
                                        this.f = bVar;
                                    } else {
                                        this.g.add(bVar);
                                    }
                                    this.e.remove(bVar);
                                    continue;
                                } else {
                                    continue;
                                }
                            case 2:
                                if (bVar == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + C9811tl1.d);
                                }
                                if (bVar != null) {
                                    bVar.l = new C4742Xq2(context, this.a, xml);
                                    continue;
                                } else {
                                    continue;
                                }
                            case 3:
                                if (bVar == null) {
                                    continue;
                                } else if (this.a.isInEditMode()) {
                                    continue;
                                } else {
                                    bVar.v(context, xml);
                                    continue;
                                }
                            case 4:
                                this.b = new androidx.constraintlayout.widget.m(context, xml);
                                continue;
                            case 5:
                                a0(context, xml);
                                continue;
                            case 6:
                            case 7:
                                c0(context, xml);
                                continue;
                            case '\b':
                                C10243vX0 c10243vX0 = new C10243vX0(context, xml);
                                if (bVar != null) {
                                    bVar.k.add(c10243vX0);
                                    continue;
                                } else {
                                    continue;
                                }
                            case '\t':
                                this.r.b(new C7994mI2(context, xml));
                                continue;
                            default:
                                continue;
                        }
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
        }
    }

    public int X(String str) {
        Integer num = this.i.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String Y(int i) {
        for (Map.Entry<String, Integer> entry : this.i.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == i) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int a0(Context context, XmlPullParser xmlPullParser) {
        boolean z2;
        boolean z3;
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.d1(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        z2 = false;
                        break;
                    }
                    z2 = true;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        z2 = true;
                        break;
                    }
                    z2 = true;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        z2 = true;
                        break;
                    }
                    z2 = true;
                    break;
                case 973381616:
                    if (attributeName.equals("stateLabels")) {
                        z2 = true;
                        break;
                    }
                    z2 = true;
                    break;
                default:
                    z2 = true;
                    break;
            }
            switch (z2) {
                case false:
                    i2 = v(context, attributeValue);
                    break;
                case true:
                    try {
                        eVar.e = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    z3 = false;
                                    break;
                                }
                                z3 = true;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    z3 = true;
                                    break;
                                }
                                z3 = true;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    z3 = true;
                                    break;
                                }
                                z3 = true;
                                break;
                            case 108511772:
                                if (attributeValue.equals(C5445bv2.n0)) {
                                    z3 = true;
                                    break;
                                }
                                z3 = true;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    z3 = true;
                                    break;
                                }
                                z3 = true;
                                break;
                            default:
                                z3 = true;
                                break;
                        }
                        switch (z3) {
                            case false:
                                eVar.e = 4;
                                continue;
                            case true:
                                eVar.e = 2;
                                continue;
                            case true:
                                eVar.e = 0;
                                continue;
                            case true:
                                eVar.e = 1;
                                continue;
                            case true:
                                eVar.e = 3;
                                continue;
                        }
                    }
                    break;
                case true:
                    i = v(context, attributeValue);
                    this.i.put(r0(attributeValue), Integer.valueOf(i));
                    eVar.b = AV.i(context, i);
                    break;
                case true:
                    eVar.u1(attributeValue);
                    break;
            }
        }
        if (i != -1) {
            if (this.a.c2 != 0) {
                eVar.E1(true);
            }
            eVar.z0(context, xmlPullParser);
            if (i2 != -1) {
                this.j.put(i, i2);
            }
            this.h.put(i, eVar);
        }
        return i;
    }

    public final int b0(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return a0(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
            return -1;
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
            return -1;
        }
    }

    public final void c0(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.Nf);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == j.c.Of) {
                b0(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void d0(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.Nd);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == j.c.Od) {
                int i2 = obtainStyledAttributes.getInt(index, this.k);
                this.k = i2;
                if (i2 < 8) {
                    this.k = 8;
                }
            } else if (index == j.c.Pd) {
                this.l = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void e0(float f, float f2) {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            this.c.l.w(f, f2);
        }
    }

    public void f(C7114il1 c7114il1, int i) {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.m.size() > 0) {
                Iterator it2 = next.m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).c(c7114il1);
                }
            }
        }
        Iterator<b> it3 = this.g.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            if (next2.m.size() > 0) {
                Iterator it4 = next2.m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).c(c7114il1);
                }
            }
        }
        Iterator<b> it5 = this.e.iterator();
        while (it5.hasNext()) {
            b next3 = it5.next();
            if (next3.m.size() > 0) {
                Iterator it6 = next3.m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).a(c7114il1, i, next3);
                }
            }
        }
        Iterator<b> it7 = this.g.iterator();
        while (it7.hasNext()) {
            b next4 = it7.next();
            if (next4.m.size() > 0) {
                Iterator it8 = next4.m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).a(c7114il1, i, next4);
                }
            }
        }
    }

    public void f0(float f, float f2) {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            this.c.l.x(f, f2);
        }
    }

    public void g(b bVar) {
        int w2 = w(bVar);
        if (w2 == -1) {
            this.e.add(bVar);
        } else {
            this.e.set(w2, bVar);
        }
    }

    public void g0(MotionEvent motionEvent, int i, C7114il1 c7114il1) {
        C7114il1.h hVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.p == null) {
            this.p = this.a.T0();
        }
        this.p.c(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z2 = false;
            if (action != 0) {
                if (action == 2 && !this.n) {
                    float rawY = motionEvent.getRawY() - this.t;
                    float rawX = motionEvent.getRawX() - this.s;
                    if ((rawX != 0.0d || rawY != 0.0d) && (motionEvent2 = this.m) != null) {
                        b j = j(i, rawX, rawY, motionEvent2);
                        if (j != null) {
                            c7114il1.setTransition(j);
                            RectF r = this.c.l.r(this.a, rectF);
                            if (r != null && !r.contains(this.m.getX(), this.m.getY())) {
                                z2 = true;
                            }
                            this.f830o = z2;
                            this.c.l.G(this.s, this.t);
                        }
                    } else {
                        return;
                    }
                }
            } else {
                this.s = motionEvent.getRawX();
                this.t = motionEvent.getRawY();
                this.m = motionEvent;
                this.n = false;
                if (this.c.l != null) {
                    RectF g = this.c.l.g(this.a, rectF);
                    if (g != null && !g.contains(this.m.getX(), this.m.getY())) {
                        this.m = null;
                        this.n = true;
                        return;
                    }
                    RectF r2 = this.c.l.r(this.a, rectF);
                    if (r2 != null && !r2.contains(this.m.getX(), this.m.getY())) {
                        this.f830o = true;
                    } else {
                        this.f830o = false;
                    }
                    this.c.l.A(this.s, this.t);
                    return;
                }
                return;
            }
        }
        if (!this.n) {
            b bVar = this.c;
            if (bVar != null && bVar.l != null && !this.f830o) {
                this.c.l.u(motionEvent, this.p, i, this);
            }
            this.s = motionEvent.getRawX();
            this.t = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (hVar = this.p) != null) {
                hVar.a();
                this.p = null;
                int i2 = c7114il1.K1;
                if (i2 != -1) {
                    i(c7114il1, i2);
                }
            }
        }
    }

    public boolean h(int i, C4523Vk1 c4523Vk1) {
        return this.r.e(i, c4523Vk1);
    }

    public final void h0(int i, C7114il1 c7114il1) {
        androidx.constraintlayout.widget.e eVar = this.h.get(i);
        eVar.c = eVar.b;
        int i2 = this.j.get(i);
        if (i2 > 0) {
            h0(i2, c7114il1);
            androidx.constraintlayout.widget.e eVar2 = this.h.get(i2);
            if (eVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + AV.i(this.a.getContext(), i2));
                return;
            }
            eVar.c += RemoteSettings.i + eVar2.c;
            eVar.M0(eVar2);
        } else {
            eVar.c += "  layout";
            eVar.L0(c7114il1);
        }
        eVar.q(eVar);
    }

    public boolean i(C7114il1 c7114il1, int i) {
        b bVar;
        if (U() || this.d) {
            return false;
        }
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.n != 0 && ((bVar = this.c) != next || !bVar.L(2))) {
                if (i == next.d && (next.n == 4 || next.n == 2)) {
                    C7114il1.l lVar = C7114il1.l.FINISHED;
                    c7114il1.setState(lVar);
                    c7114il1.setTransition(next);
                    if (next.n == 4) {
                        c7114il1.h1();
                        c7114il1.setState(C7114il1.l.SETUP);
                        c7114il1.setState(C7114il1.l.MOVING);
                    } else {
                        c7114il1.setProgress(1.0f);
                        c7114il1.y0(true);
                        c7114il1.setState(C7114il1.l.SETUP);
                        c7114il1.setState(C7114il1.l.MOVING);
                        c7114il1.setState(lVar);
                        c7114il1.U0();
                    }
                    return true;
                } else if (i == next.c && (next.n == 3 || next.n == 1)) {
                    C7114il1.l lVar2 = C7114il1.l.FINISHED;
                    c7114il1.setState(lVar2);
                    c7114il1.setTransition(next);
                    if (next.n == 3) {
                        c7114il1.j1();
                        c7114il1.setState(C7114il1.l.SETUP);
                        c7114il1.setState(C7114il1.l.MOVING);
                    } else {
                        c7114il1.setProgress(0.0f);
                        c7114il1.y0(true);
                        c7114il1.setState(C7114il1.l.SETUP);
                        c7114il1.setState(C7114il1.l.MOVING);
                        c7114il1.setState(lVar2);
                        c7114il1.U0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void i0(C7114il1 c7114il1) {
        for (int i = 0; i < this.h.size(); i++) {
            int keyAt = this.h.keyAt(i);
            if (S(keyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            h0(keyAt, c7114il1);
        }
    }

    public b j(int i, float f, float f2, MotionEvent motionEvent) {
        float f3;
        if (i != -1) {
            List<b> R2 = R(i);
            RectF rectF = new RectF();
            float f4 = 0.0f;
            b bVar = null;
            for (b bVar2 : R2) {
                if (!bVar2.f831o && bVar2.l != null) {
                    bVar2.l.D(this.q);
                    RectF r = bVar2.l.r(this.a, rectF);
                    if (r == null || motionEvent == null || r.contains(motionEvent.getX(), motionEvent.getY())) {
                        RectF g = bVar2.l.g(this.a, rectF);
                        if (g == null || motionEvent == null || g.contains(motionEvent.getX(), motionEvent.getY())) {
                            float a2 = bVar2.l.a(f, f2);
                            if (bVar2.l.l && motionEvent != null) {
                                float x2 = motionEvent.getX() - bVar2.l.i;
                                float y2 = motionEvent.getY() - bVar2.l.j;
                                a2 = ((float) (Math.atan2(f2 + y2, f + x2) - Math.atan2(x2, y2))) * 10.0f;
                            }
                            if (bVar2.c == i) {
                                f3 = -1.0f;
                            } else {
                                f3 = 1.1f;
                            }
                            float f5 = a2 * f3;
                            if (f5 > f4) {
                                bVar = bVar2;
                                f4 = f5;
                            }
                        }
                    }
                }
            }
            return bVar;
        }
        return this.c;
    }

    public void j0(b bVar) {
        int w2 = w(bVar);
        if (w2 != -1) {
            this.e.remove(w2);
        }
    }

    public void k(boolean z2) {
        this.d = z2;
    }

    public void k0(int i, androidx.constraintlayout.widget.e eVar) {
        this.h.put(i, eVar);
    }

    public void l(int i, boolean z2) {
        this.r.f(i, z2);
    }

    public void l0(int i) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.O(i);
        } else {
            this.k = i;
        }
    }

    public int m() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.p;
        }
        return -1;
    }

    public void m0(View view, int i, String str, Object obj) {
        b bVar = this.c;
        if (bVar != null) {
            Iterator it = bVar.k.iterator();
            while (it.hasNext()) {
                Iterator<AbstractC6818hX0> it2 = ((C10243vX0) it.next()).d(view.getId()).iterator();
                while (it2.hasNext()) {
                    if (it2.next().a == i && obj != null) {
                        Float f = (Float) obj;
                    }
                }
            }
        }
    }

    public int n() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return this.c.l.e();
        }
        return 0;
    }

    public void n0(boolean z2) {
        this.q = z2;
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            this.c.l.D(this.q);
        }
    }

    public androidx.constraintlayout.widget.e o(int i) {
        return p(i, -1, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o0(int i, int i2) {
        int i3;
        int i4;
        androidx.constraintlayout.widget.m mVar = this.b;
        if (mVar != null) {
            i3 = mVar.e(i, -1, -1);
            if (i3 == -1) {
                i3 = i;
            }
            i4 = this.b.e(i2, -1, -1);
        } else {
            i3 = i;
        }
        i4 = i2;
        b bVar = this.c;
        if (bVar == null || bVar.c != i2 || this.c.d != i) {
            Iterator<b> it = this.e.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if ((next.c == i4 && next.d == i3) || (next.c == i2 && next.d == i)) {
                    this.c = next;
                    if (next != null && next.l != null) {
                        this.c.l.D(this.q);
                        return;
                    }
                    return;
                }
            }
            b bVar2 = this.f;
            Iterator<b> it2 = this.g.iterator();
            while (it2.hasNext()) {
                b next2 = it2.next();
                if (next2.c == i2) {
                    bVar2 = next2;
                }
            }
            b bVar3 = new b(this, bVar2);
            bVar3.d = i3;
            bVar3.c = i4;
            if (i3 != -1) {
                this.e.add(bVar3);
            }
            this.c = bVar3;
        }
    }

    public androidx.constraintlayout.widget.e p(int i, int i2, int i3) {
        int e;
        androidx.constraintlayout.widget.m mVar = this.b;
        if (mVar != null && (e = mVar.e(i, i2, i3)) != -1) {
            i = e;
        }
        if (this.h.get(i) == null) {
            Log.e("MotionScene", "Warning could not find ConstraintSet id/" + AV.i(this.a.getContext(), i) + " In MotionScene");
            SparseArray<androidx.constraintlayout.widget.e> sparseArray = this.h;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.h.get(i);
    }

    public void p0(b bVar) {
        this.c = bVar;
        if (bVar != null && bVar.l != null) {
            this.c.l.D(this.q);
        }
    }

    public androidx.constraintlayout.widget.e q(Context context, String str) {
        for (int i = 0; i < this.h.size(); i++) {
            int keyAt = this.h.keyAt(i);
            if (str.equals(context.getResources().getResourceName(keyAt))) {
                return this.h.get(keyAt);
            }
        }
        return null;
    }

    public void q0() {
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            this.c.l.H();
        }
    }

    public int[] r() {
        int size = this.h.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.h.keyAt(i);
        }
        return iArr;
    }

    public ArrayList<b> s() {
        return this.e;
    }

    public boolean s0() {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next().l != null) {
                return true;
            }
        }
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return true;
        }
        return false;
    }

    public int t() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.h;
        }
        return this.k;
    }

    public boolean t0(C7114il1 c7114il1) {
        if (c7114il1 == this.a && c7114il1.F1 == this) {
            return true;
        }
        return false;
    }

    public int u() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.c;
        }
        return -1;
    }

    public void u0(int i, View... viewArr) {
        this.r.m(i, viewArr);
    }

    public final int v(Context context, String str) {
        int i;
        if (str.contains(RemoteSettings.i)) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i = -1;
        }
        if (i == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return i;
    }

    public final int w(b bVar) {
        int i = bVar.a;
        if (i != -1) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                if (this.e.get(i2).a == i) {
                    return i2;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("The transition must have an id");
    }

    public Interpolator x() {
        int i = this.c.e;
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
            return new a(C6725h90.c(this.c.f));
        }
        return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
    }

    public AbstractC6818hX0 y(Context context, int i, int i2, int i3) {
        b bVar = this.c;
        if (bVar == null) {
            return null;
        }
        Iterator it = bVar.k.iterator();
        while (it.hasNext()) {
            C10243vX0 c10243vX0 = (C10243vX0) it.next();
            for (Integer num : c10243vX0.e()) {
                if (i2 == num.intValue()) {
                    Iterator<AbstractC6818hX0> it2 = c10243vX0.d(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        AbstractC6818hX0 next = it2.next();
                        if (next.a == i3 && next.d == i) {
                            return next;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public void z(C4523Vk1 c4523Vk1) {
        b bVar = this.c;
        if (bVar == null) {
            b bVar2 = this.f;
            if (bVar2 != null) {
                Iterator it = bVar2.k.iterator();
                while (it.hasNext()) {
                    ((C10243vX0) it.next()).b(c4523Vk1);
                }
                return;
            }
            return;
        }
        Iterator it2 = bVar.k.iterator();
        while (it2.hasNext()) {
            ((C10243vX0) it2.next()).b(c4523Vk1);
        }
    }

    /* renamed from: o.ol1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static final int A = -2;
        public static final int B = -1;
        public static final int C = 0;
        public static final int D = 1;
        public static final int E = 2;
        public static final int F = 3;
        public static final int G = 4;
        public static final int H = 5;
        public static final int I = 6;
        public static final int s = 0;
        public static final int t = 1;
        public static final int u = 2;
        public static final int v = 3;
        public static final int w = 4;
        public static final int x = 1;
        public static final int y = 2;
        public static final int z = 4;
        public int a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public String f;
        public int g;
        public int h;
        public float i;
        public final C8590ol1 j;
        public ArrayList<C10243vX0> k;
        public C4742Xq2 l;
        public ArrayList<a> m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f831o;
        public int p;
        public int q;
        public int r;

        public b(C8590ol1 c8590ol1, b bVar) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.f831o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.j = c8590ol1;
            this.h = c8590ol1.k;
            if (bVar != null) {
                this.p = bVar.p;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.k = bVar.k;
                this.i = bVar.i;
                this.q = bVar.q;
            }
        }

        public int A() {
            return this.h;
        }

        public int B() {
            return this.c;
        }

        public int C() {
            return this.a;
        }

        public List<C10243vX0> D() {
            return this.k;
        }

        public int E() {
            return this.q;
        }

        public List<a> F() {
            return this.m;
        }

        public int G() {
            return this.p;
        }

        public float H() {
            return this.i;
        }

        public int I() {
            return this.d;
        }

        public C4742Xq2 J() {
            return this.l;
        }

        public boolean K() {
            return !this.f831o;
        }

        public boolean L(int i) {
            if ((i & this.r) != 0) {
                return true;
            }
            return false;
        }

        public void M(int i) {
            a aVar;
            Iterator<a> it = this.m.iterator();
            while (true) {
                if (it.hasNext()) {
                    aVar = it.next();
                    if (aVar.Y == i) {
                        break;
                    }
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                this.m.remove(aVar);
            }
        }

        public void N(int i) {
            this.n = i;
        }

        public void O(int i) {
            this.h = Math.max(i, 8);
        }

        public void P(boolean z2) {
            this.f831o = !z2;
        }

        public void Q(int i, String str, int i2) {
            this.e = i;
            this.f = str;
            this.g = i2;
        }

        public void R(int i) {
            this.q = i;
        }

        public void S(C7639kv1 c7639kv1) {
            C4742Xq2 c4742Xq2;
            if (c7639kv1 == null) {
                c4742Xq2 = null;
            } else {
                c4742Xq2 = new C4742Xq2(this.j.a, c7639kv1);
            }
            this.l = c4742Xq2;
        }

        public void T(int i) {
            C4742Xq2 J = J();
            if (J != null) {
                J.F(i);
            }
        }

        public void U(int i) {
            this.p = i;
        }

        public void V(float f) {
            this.i = f;
        }

        public void W(int i) {
            this.r = i;
        }

        public void t(C10243vX0 c10243vX0) {
            this.k.add(c10243vX0);
        }

        public void u(int i, int i2) {
            Iterator<a> it = this.m.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.Y == i) {
                    next.Z = i2;
                    return;
                }
            }
            this.m.add(new a(this, i, i2));
        }

        public void v(Context context, XmlPullParser xmlPullParser) {
            this.m.add(new a(context, this, xmlPullParser));
        }

        public String w(Context context) {
            String resourceEntryName;
            if (this.d == -1) {
                resourceEntryName = "null";
            } else {
                resourceEntryName = context.getResources().getResourceEntryName(this.d);
            }
            if (this.c == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + B8.d + context.getResources().getResourceEntryName(this.c);
        }

        public final void x(C8590ol1 c8590ol1, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == j.c.hf) {
                    this.c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    if (C5445bv2.w.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
                        eVar.y0(context, this.c);
                        c8590ol1.h.append(this.c, eVar);
                    } else if (C2730De2.w.equals(resourceTypeName)) {
                        this.c = c8590ol1.b0(context, this.c);
                    }
                } else if (index == j.c.jf) {
                    this.d = typedArray.getResourceId(index, this.d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                    if (C5445bv2.w.equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.e eVar2 = new androidx.constraintlayout.widget.e();
                        eVar2.y0(context, this.d);
                        c8590ol1.h.append(this.d, eVar2);
                    } else if (C2730De2.w.equals(resourceTypeName2)) {
                        this.d = c8590ol1.b0(context, this.d);
                    }
                } else if (index == j.c.mf) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.g = resourceId;
                        if (resourceId != -1) {
                            this.e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.f = string;
                        if (string != null) {
                            if (string.indexOf(RemoteSettings.i) > 0) {
                                this.g = typedArray.getResourceId(index, -1);
                                this.e = -2;
                            } else {
                                this.e = -1;
                            }
                        }
                    } else {
                        this.e = typedArray.getInteger(index, this.e);
                    }
                } else if (index == j.c.kf) {
                    int i3 = typedArray.getInt(index, this.h);
                    this.h = i3;
                    if (i3 < 8) {
                        this.h = 8;
                    }
                } else if (index == j.c.of) {
                    this.i = typedArray.getFloat(index, this.i);
                } else if (index == j.c.gf) {
                    this.n = typedArray.getInteger(index, this.n);
                } else if (index == j.c.ff) {
                    this.a = typedArray.getResourceId(index, this.a);
                } else if (index == j.c.pf) {
                    this.f831o = typedArray.getBoolean(index, this.f831o);
                } else if (index == j.c.nf) {
                    this.p = typedArray.getInteger(index, -1);
                } else if (index == j.c.lf) {
                    this.q = typedArray.getInteger(index, 0);
                } else if (index == j.c.qf) {
                    this.r = typedArray.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.b = true;
            }
        }

        public final void y(C8590ol1 c8590ol1, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.ef);
            x(c8590ol1, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public int z() {
            return this.n;
        }

        /* renamed from: o.ol1$b$a */
        /* loaded from: classes.dex */
        public static class a implements View.OnClickListener {
            public static final int Y0 = 1;
            public static final int Z0 = 17;
            public static final int a1 = 16;
            public static final int b1 = 256;
            public static final int c1 = 4096;
            public final b X;
            public int Y;
            public int Z;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.Y = -1;
                this.Z = 17;
                this.X = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.Ud);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == j.c.Wd) {
                        this.Y = obtainStyledAttributes.getResourceId(index, this.Y);
                    } else if (index == j.c.Vd) {
                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
            public void a(C7114il1 c7114il1, int i, b bVar) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                int i2 = this.Y;
                C7114il1 c7114il12 = c7114il1;
                if (i2 != -1) {
                    c7114il12 = c7114il1.findViewById(i2);
                }
                if (c7114il12 != null) {
                    int i3 = bVar.d;
                    int i4 = bVar.c;
                    if (i3 == -1) {
                        c7114il12.setOnClickListener(this);
                        return;
                    }
                    int i5 = this.Z;
                    boolean z5 = false;
                    if ((i5 & 1) != 0 && i == i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((i5 & 256) != 0 && i == i3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z6 = z | z2;
                    if ((i5 & 1) != 0 && i == i3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z7 = z3 | z6;
                    if ((i5 & 16) != 0 && i == i4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z8 = z7 | z4;
                    if ((i5 & 4096) != 0 && i == i4) {
                        z5 = true;
                    }
                    if (z8 | z5) {
                        c7114il12.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                Log.e("MotionScene", "OnClick could not find id " + this.Y);
            }

            public boolean b(b bVar, C7114il1 c7114il1) {
                b bVar2 = this.X;
                if (bVar2 != bVar) {
                    int i = bVar2.c;
                    int i2 = this.X.d;
                    if (i2 == -1) {
                        if (c7114il1.K1 != i) {
                            return true;
                        }
                        return false;
                    }
                    int i3 = c7114il1.K1;
                    if (i3 == i2 || i3 == i) {
                        return true;
                    }
                    return false;
                }
                return true;
            }

            public void c(C7114il1 c7114il1) {
                int i = this.Y;
                if (i == -1) {
                    return;
                }
                View findViewById = c7114il1.findViewById(i);
                if (findViewById == null) {
                    Log.e("MotionScene", " (*)  could not find id " + this.Y);
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onClick(View view) {
                boolean z;
                boolean z2;
                C7114il1 c7114il1 = this.X.j.a;
                if (c7114il1.P0()) {
                    if (this.X.d == -1) {
                        int currentState = c7114il1.getCurrentState();
                        if (currentState == -1) {
                            c7114il1.l1(this.X.c);
                            return;
                        }
                        b bVar = new b(this.X.j, this.X);
                        bVar.d = currentState;
                        bVar.c = this.X.c;
                        c7114il1.setTransition(bVar);
                        c7114il1.h1();
                        return;
                    }
                    b bVar2 = this.X.j.c;
                    int i = this.Z;
                    boolean z3 = false;
                    if ((i & 1) == 0 && (i & 256) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if ((i & 16) == 0 && (i & 4096) == 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z && z2) {
                        b bVar3 = this.X.j.c;
                        b bVar4 = this.X;
                        if (bVar3 != bVar4) {
                            c7114il1.setTransition(bVar4);
                        }
                        if (c7114il1.getCurrentState() != c7114il1.getEndState() && c7114il1.getProgress() <= 0.5f) {
                            z2 = false;
                        }
                        if (!b(bVar2, c7114il1)) {
                            if (z3 && (this.Z & 1) != 0) {
                                c7114il1.setTransition(this.X);
                                c7114il1.h1();
                                return;
                            } else if (z2 && (this.Z & 16) != 0) {
                                c7114il1.setTransition(this.X);
                                c7114il1.j1();
                                return;
                            } else if (z3 && (this.Z & 256) != 0) {
                                c7114il1.setTransition(this.X);
                                c7114il1.setProgress(1.0f);
                                return;
                            } else if (z2 && (this.Z & 4096) != 0) {
                                c7114il1.setTransition(this.X);
                                c7114il1.setProgress(0.0f);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    z3 = z;
                    if (!b(bVar2, c7114il1)) {
                    }
                }
            }

            public a(b bVar, int i, int i2) {
                this.X = bVar;
                this.Y = i;
                this.Z = i2;
            }
        }

        public b(int i, C8590ol1 c8590ol1, int i2, int i3) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.f831o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.a = i;
            this.j = c8590ol1;
            this.d = i2;
            this.c = i3;
            this.h = c8590ol1.k;
            this.q = c8590ol1.l;
        }

        public b(C8590ol1 c8590ol1, Context context, XmlPullParser xmlPullParser) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.f831o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.h = c8590ol1.k;
            this.q = c8590ol1.l;
            this.j = c8590ol1;
            y(c8590ol1, context, Xml.asAttributeSet(xmlPullParser));
        }
    }

    public C8590ol1(Context context, C7114il1 c7114il1, int i) {
        this.a = c7114il1;
        this.r = new C8481oI2(c7114il1);
        W(context, i);
        SparseArray<androidx.constraintlayout.widget.e> sparseArray = this.h;
        int i2 = j.b.motion_base;
        sparseArray.put(i2, new androidx.constraintlayout.widget.e());
        this.i.put("motion_base", Integer.valueOf(i2));
    }

    public void Z(boolean z2, int i, int i2, int i3, int i4) {
    }
}
