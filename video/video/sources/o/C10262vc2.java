package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import o.C7025iN1;
import o.HT1;
import o.O22;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@HT1({HT1.a.Y})
/* renamed from: o.vc2 */
/* loaded from: classes3.dex */
public class C10262vc2 {
    public static final int e = 10;
    public int a;
    @InterfaceC5670cr1
    public YP b;
    @InterfaceC5670cr1
    public int[][] c = new int[10];
    @InterfaceC5670cr1
    public YP[] d = new YP[10];

    @InterfaceC5670cr1
    public static C10262vc2 b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TypedArray typedArray, @InterfaceC4902Zf2 int i, @InterfaceC5670cr1 YP yp) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return c(O22.m(typedArray, i, yp));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals(C2730De2.w)) {
            return c(O22.m(typedArray, i, yp));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            C10262vc2 c10262vc2 = new C10262vc2();
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                if (xml.getName().equals("selector")) {
                    c10262vc2.i(context, xml, asAttributeSet, context.getTheme());
                }
                xml.close();
                return c10262vc2;
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return c(yp);
        }
    }

    @InterfaceC5670cr1
    public static C10262vc2 c(@InterfaceC5670cr1 YP yp) {
        C10262vc2 c10262vc2 = new C10262vc2();
        c10262vc2.a(StateSet.WILD_CARD, yp);
        return c10262vc2;
    }

    public final void a(@InterfaceC5670cr1 int[] iArr, @InterfaceC5670cr1 YP yp) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = yp;
        }
        if (i >= this.c.length) {
            f(i, i + 10);
        }
        int[][] iArr2 = this.c;
        int i2 = this.a;
        iArr2[i2] = iArr;
        this.d[i2] = yp;
        this.a = i2 + 1;
    }

    @InterfaceC5670cr1
    public YP d(@InterfaceC5670cr1 int[] iArr) {
        int g = g(iArr);
        if (g < 0) {
            g = g(StateSet.WILD_CARD);
        }
        if (g < 0) {
            return this.b;
        }
        return this.d[g];
    }

    @InterfaceC5670cr1
    public YP e() {
        return this.b;
    }

    public final void f(int i, int i2) {
        int[][] iArr = new int[i2];
        System.arraycopy(this.c, 0, iArr, 0, i);
        this.c = iArr;
        YP[] ypArr = new YP[i2];
        System.arraycopy(this.d, 0, ypArr, 0, i);
        this.d = ypArr;
    }

    public final int g(int[] iArr) {
        int[][] iArr2 = this.c;
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    public boolean h() {
        if (this.a > 1) {
            return true;
        }
        return false;
    }

    public final void i(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 XmlPullParser xmlPullParser, @InterfaceC5670cr1 AttributeSet attributeSet, @InterfaceC11300zs1 Resources.Theme theme) throws XmlPullParserException, IOException {
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
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, C7025iN1.o.Ka);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C7025iN1.o.Ka, 0, 0);
                        }
                        YP m = O22.m(obtainStyledAttributes, C7025iN1.o.Qa, new M(0.0f));
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i = 0;
                        for (int i2 = 0; i2 < attributeCount; i2++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                            if (attributeNameResource != C7025iN1.c.cornerSize) {
                                int i3 = i + 1;
                                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i] = attributeNameResource;
                                i = i3;
                            }
                        }
                        a(StateSet.trimStateSet(iArr, i), m);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @InterfaceC5670cr1
    public C10262vc2 j(@InterfaceC5670cr1 O22.c cVar) {
        C10262vc2 c10262vc2 = new C10262vc2();
        c10262vc2.a = this.a;
        int[][] iArr = new int[this.c.length];
        c10262vc2.c = iArr;
        int[][] iArr2 = this.c;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        c10262vc2.d = new YP[this.d.length];
        for (int i = 0; i < this.a; i++) {
            c10262vc2.d[i] = cVar.a(this.d[i]);
        }
        return c10262vc2;
    }
}
