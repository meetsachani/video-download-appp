package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import o.C7025iN1;
import o.HT1;
import o.O22;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@HT1({HT1.a.Y})
/* renamed from: o.xc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10751xc2 {
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 4;
    public static final int l = 8;
    public static final int m = 10;
    public final int a;
    @InterfaceC5670cr1
    public final O22 b;
    @InterfaceC5670cr1
    public final int[][] c;
    @InterfaceC5670cr1
    public final O22[] d;
    @InterfaceC11300zs1
    public final C10262vc2 e;
    @InterfaceC11300zs1
    public final C10262vc2 f;
    @InterfaceC11300zs1
    public final C10262vc2 g;
    @InterfaceC11300zs1
    public final C10262vc2 h;

    /* renamed from: o.xc2$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public int a;
        @InterfaceC5670cr1
        public O22 b;
        @InterfaceC5670cr1
        public int[][] c;
        @InterfaceC5670cr1
        public O22[] d;
        @InterfaceC11300zs1
        public C10262vc2 e;
        @InterfaceC11300zs1
        public C10262vc2 f;
        @InterfaceC11300zs1
        public C10262vc2 g;
        @InterfaceC11300zs1
        public C10262vc2 h;

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b i(@InterfaceC5670cr1 int[] iArr, @InterfaceC5670cr1 O22 o22) {
            int i = this.a;
            if (i == 0 || iArr.length == 0) {
                this.b = o22;
            }
            if (i >= this.c.length) {
                l(i, i + 10);
            }
            int[][] iArr2 = this.c;
            int i2 = this.a;
            iArr2[i2] = iArr;
            this.d[i2] = o22;
            this.a = i2 + 1;
            return this;
        }

        @InterfaceC11300zs1
        public C10751xc2 j() {
            if (this.a == 0) {
                return null;
            }
            return new C10751xc2(this);
        }

        public final boolean k(int i, int i2) {
            if ((i2 | i) == i) {
                return true;
            }
            return false;
        }

        public final void l(int i, int i2) {
            int[][] iArr = new int[i2];
            System.arraycopy(this.c, 0, iArr, 0, i);
            this.c = iArr;
            O22[] o22Arr = new O22[i2];
            System.arraycopy(this.d, 0, o22Arr, 0, i);
            this.d = o22Arr;
        }

        public final void m() {
            this.b = new O22();
            this.c = new int[10];
            this.d = new O22[10];
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b n(@InterfaceC5670cr1 C10262vc2 c10262vc2, int i) {
            if (k(i, 1)) {
                this.e = c10262vc2;
            }
            if (k(i, 2)) {
                this.f = c10262vc2;
            }
            if (k(i, 4)) {
                this.g = c10262vc2;
            }
            if (k(i, 8)) {
                this.h = c10262vc2;
            }
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public b o(@InterfaceC5670cr1 O22.c cVar) {
            O22[] o22Arr = new O22[this.d.length];
            for (int i = 0; i < this.a; i++) {
                o22Arr[i] = this.d[i].z(cVar);
            }
            this.d = o22Arr;
            C10262vc2 c10262vc2 = this.e;
            if (c10262vc2 != null) {
                this.e = c10262vc2.j(cVar);
            }
            C10262vc2 c10262vc22 = this.f;
            if (c10262vc22 != null) {
                this.f = c10262vc22.j(cVar);
            }
            C10262vc2 c10262vc23 = this.g;
            if (c10262vc23 != null) {
                this.g = c10262vc23.j(cVar);
            }
            C10262vc2 c10262vc24 = this.h;
            if (c10262vc24 != null) {
                this.h = c10262vc24.j(cVar);
            }
            return this;
        }

        public b(@InterfaceC5670cr1 C10751xc2 c10751xc2) {
            int i = c10751xc2.a;
            this.a = i;
            this.b = c10751xc2.b;
            int[][] iArr = c10751xc2.c;
            int[][] iArr2 = new int[iArr.length];
            this.c = iArr2;
            this.d = new O22[c10751xc2.d.length];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(c10751xc2.d, 0, this.d, 0, this.a);
            this.e = c10751xc2.e;
            this.f = c10751xc2.f;
            this.g = c10751xc2.g;
            this.h = c10751xc2.h;
        }

        public b(@InterfaceC5670cr1 O22 o22) {
            m();
            i(StateSet.WILD_CARD, o22);
        }

        public b(@InterfaceC5670cr1 Context context, @XN2 int i) {
            int next;
            m();
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    if (xml.getName().equals("selector")) {
                        C10751xc2.h(this, context, xml, asAttributeSet, context.getTheme());
                    }
                    xml.close();
                    return;
                }
                throw new XmlPullParserException("No start tag found");
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                m();
            }
        }
    }

    @InterfaceC11300zs1
    public static C10751xc2 b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedArray typedArray, @InterfaceC4902Zf2 int i2) {
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), C2730De2.w)) {
            return null;
        }
        return new b(context, resourceId).j();
    }

    public static void h(@InterfaceC5670cr1 b bVar, @InterfaceC5670cr1 Context context, @InterfaceC5670cr1 XmlPullParser xmlPullParser, @InterfaceC5670cr1 AttributeSet attributeSet, @InterfaceC11300zs1 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray obtainStyledAttributes;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, C7025iN1.o.f7);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C7025iN1.o.f7, 0, 0);
                        }
                        O22 m2 = O22.b(context, obtainStyledAttributes.getResourceId(C7025iN1.o.g7, 0), obtainStyledAttributes.getResourceId(C7025iN1.o.h7, 0)).m();
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i2 = 0;
                        for (int i3 = 0; i3 < attributeCount; i3++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                            if (attributeNameResource != C7025iN1.c.shapeAppearance && attributeNameResource != C7025iN1.c.shapeAppearanceOverlay) {
                                int i4 = i2 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i2] = attributeNameResource;
                                i2 = i4;
                            }
                        }
                        bVar.i(StateSet.trimStateSet(iArr, i2), m2);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static int i(int i2) {
        int i3 = i2 & 5;
        return ((i2 & 10) >> 1) | (i3 << 1);
    }

    @InterfaceC5670cr1
    public O22 c(boolean z) {
        if (z && (this.e != null || this.f != null || this.g != null || this.h != null)) {
            O22.b w = this.b.w();
            C10262vc2 c10262vc2 = this.e;
            if (c10262vc2 != null) {
                w.L(c10262vc2.e());
            }
            C10262vc2 c10262vc22 = this.f;
            if (c10262vc22 != null) {
                w.Q(c10262vc22.e());
            }
            C10262vc2 c10262vc23 = this.g;
            if (c10262vc23 != null) {
                w.y(c10262vc23.e());
            }
            C10262vc2 c10262vc24 = this.h;
            if (c10262vc24 != null) {
                w.D(c10262vc24.e());
            }
            return w.m();
        }
        return this.b;
    }

    @InterfaceC5670cr1
    public O22 d(@InterfaceC5670cr1 int[] iArr) {
        int f = f(iArr);
        if (f < 0) {
            f = f(StateSet.WILD_CARD);
        }
        if (this.e == null && this.f == null && this.g == null && this.h == null) {
            return this.d[f];
        }
        O22.b w = this.d[f].w();
        C10262vc2 c10262vc2 = this.e;
        if (c10262vc2 != null) {
            w.L(c10262vc2.d(iArr));
        }
        C10262vc2 c10262vc22 = this.f;
        if (c10262vc22 != null) {
            w.Q(c10262vc22.d(iArr));
        }
        C10262vc2 c10262vc23 = this.g;
        if (c10262vc23 != null) {
            w.y(c10262vc23.d(iArr));
        }
        C10262vc2 c10262vc24 = this.h;
        if (c10262vc24 != null) {
            w.D(c10262vc24.d(iArr));
        }
        return w.m();
    }

    public int e() {
        return this.a;
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.c;
        for (int i2 = 0; i2 < this.a; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    public boolean g() {
        C10262vc2 c10262vc2;
        C10262vc2 c10262vc22;
        C10262vc2 c10262vc23;
        C10262vc2 c10262vc24;
        if (this.a > 1 || (((c10262vc2 = this.e) != null && c10262vc2.h()) || (((c10262vc22 = this.f) != null && c10262vc22.h()) || (((c10262vc23 = this.g) != null && c10262vc23.h()) || ((c10262vc24 = this.h) != null && c10262vc24.h()))))) {
            return true;
        }
        return false;
    }

    @InterfaceC5670cr1
    public b j() {
        return new b(this);
    }

    @InterfaceC5670cr1
    public C10751xc2 k(@InterfaceC5670cr1 O22.c cVar) {
        return j().o(cVar).j();
    }

    public C10751xc2(@InterfaceC5670cr1 b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
    }
}
