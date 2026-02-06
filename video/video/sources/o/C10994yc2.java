package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import o.C7025iN1;
import o.HT1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@HT1({HT1.a.Y})
/* renamed from: o.yc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10994yc2 {
    public static final int e = 10;
    public int a;
    @InterfaceC5670cr1
    public a b;
    @InterfaceC5670cr1
    public int[][] c = new int[10];
    @InterfaceC5670cr1
    public a[] d = new a[10];

    /* renamed from: o.yc2$b */
    /* loaded from: classes3.dex */
    public static class b {
        public c a;
        public float b;

        public b(c cVar, float f) {
            this.a = cVar;
            this.b = f;
        }

        public int a(@PK1 int i) {
            c cVar = this.a;
            if (cVar == c.PERCENT) {
                return (int) (this.b * i);
            }
            if (cVar == c.PIXELS) {
                return (int) this.b;
            }
            return 0;
        }
    }

    /* renamed from: o.yc2$c */
    /* loaded from: classes3.dex */
    public enum c {
        PERCENT,
        PIXELS
    }

    @InterfaceC11300zs1
    public static C10994yc2 b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedArray typedArray, @InterfaceC4902Zf2 int i) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals(C2730De2.w)) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            C10994yc2 c10994yc2 = new C10994yc2();
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                if (xml.getName().equals("selector")) {
                    c10994yc2.j(context, xml, asAttributeSet, context.getTheme());
                }
                xml.close();
                return c10994yc2;
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public final void a(@InterfaceC5670cr1 int[] iArr, @InterfaceC5670cr1 a aVar) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = aVar;
        }
        if (i >= this.c.length) {
            g(i, i + 10);
        }
        int[][] iArr2 = this.c;
        int i2 = this.a;
        iArr2[i2] = iArr;
        this.d[i2] = aVar;
        this.a = i2 + 1;
    }

    @InterfaceC5670cr1
    public a c() {
        return this.b;
    }

    public int d(@PK1 int i) {
        float max;
        int i2 = -i;
        for (int i3 = 0; i3 < this.a; i3++) {
            b bVar = this.d[i3].a;
            c cVar = bVar.a;
            if (cVar == c.PIXELS) {
                max = Math.max(i2, bVar.b);
            } else if (cVar == c.PERCENT) {
                max = Math.max(i2, i * bVar.b);
            }
            i2 = (int) max;
        }
        return i2;
    }

    @InterfaceC11300zs1
    public final b e(@InterfaceC5670cr1 TypedArray typedArray, int i, @InterfaceC11300zs1 b bVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new b(c.PIXELS, TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new b(c.PERCENT, peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return bVar;
    }

    @InterfaceC5670cr1
    public a f(@InterfaceC5670cr1 int[] iArr) {
        int h = h(iArr);
        if (h < 0) {
            h = h(StateSet.WILD_CARD);
        }
        if (h < 0) {
            return this.b;
        }
        return this.d[h];
    }

    public final void g(int i, int i2) {
        int[][] iArr = new int[i2];
        System.arraycopy(this.c, 0, iArr, 0, i);
        this.c = iArr;
        a[] aVarArr = new a[i2];
        System.arraycopy(this.d, 0, aVarArr, 0, i);
        this.d = aVarArr;
    }

    public final int h(int[] iArr) {
        int[][] iArr2 = this.c;
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    public boolean i() {
        if (this.a > 1) {
            return true;
        }
        return false;
    }

    public final void j(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 XmlPullParser xmlPullParser, @InterfaceC5670cr1 AttributeSet attributeSet, @InterfaceC11300zs1 Resources.Theme theme) throws XmlPullParserException, IOException {
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
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, C7025iN1.o.vc);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C7025iN1.o.vc, 0, 0);
                        }
                        b e2 = e(obtainStyledAttributes, C7025iN1.o.wc, null);
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i = 0;
                        for (int i2 = 0; i2 < attributeCount; i2++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                            if (attributeNameResource != C7025iN1.c.widthChange) {
                                int i3 = i + 1;
                                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i] = attributeNameResource;
                                i = i3;
                            }
                        }
                        a(StateSet.trimStateSet(iArr, i), new a(e2));
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: o.yc2$a */
    /* loaded from: classes3.dex */
    public static class a {
        @InterfaceC11300zs1
        public b a;

        public a(@InterfaceC11300zs1 b bVar) {
            this.a = bVar;
        }

        public a(@InterfaceC5670cr1 a aVar) {
            b bVar = aVar.a;
            this.a = new b(bVar.a, bVar.b);
        }
    }
}
