package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.HL1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.cx0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5693cx0 {
    public static final int a = 400;
    public static final int b = 1;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = -1;
    public static final int f = 500;

    /* renamed from: o.cx0$a */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: o.cx0$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.cx0$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* renamed from: o.cx0$d */
    /* loaded from: classes.dex */
    public static final class d implements b {
        public final e[] a;

        public d(e[] eVarArr) {
            this.a = eVarArr;
        }

        public e[] a() {
            return this.a;
        }
    }

    /* renamed from: o.cx0$e */
    /* loaded from: classes.dex */
    public static final class e {
        public final String a;
        public final int b;
        public final boolean c;
        public final String d;
        public final int e;
        public final int f;

        public e(String str, int i, boolean z, String str2, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    public static int a(TypedArray typedArray, int i) {
        return a.a(typedArray, i);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, C10196vK2.h);
        if (xmlPullParser.getName().equals(C10196vK2.h)) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), HL1.j.j);
        String string = obtainAttributes.getString(HL1.j.k);
        String string2 = obtainAttributes.getString(HL1.j.p);
        String string3 = obtainAttributes.getString(HL1.j.q);
        String string4 = obtainAttributes.getString(HL1.j.m);
        int resourceId = obtainAttributes.getResourceId(HL1.j.l, 0);
        int integer = obtainAttributes.getInteger(HL1.j.n, 1);
        int integer2 = obtainAttributes.getInteger(HL1.j.f483o, 500);
        String string5 = obtainAttributes.getString(HL1.j.r);
        obtainAttributes.recycle();
        C4761Xw0 c4761Xw0 = null;
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List<List<byte[]>> c2 = c(resources, resourceId);
            if (string4 != null) {
                c4761Xw0 = new C4761Xw0(string, string2, string4, c2);
            }
            return new f(new C4761Xw0(string, string2, string3, c2), c4761Xw0, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(C4317Th1.q)) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new d((e[]) arrayList.toArray(new e[0]));
    }

    public static e f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), HL1.j.s);
        int i = HL1.j.B;
        if (!obtainAttributes.hasValue(i)) {
            i = HL1.j.u;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = HL1.j.z;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = HL1.j.v;
        }
        if (1 == obtainAttributes.getInt(i3, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i4 = HL1.j.C;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = HL1.j.w;
        }
        int i5 = HL1.j.A;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = HL1.j.x;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = HL1.j.y;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = HL1.j.t;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new e(string2, i2, z, string, i6, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i--;
                }
            } else {
                i++;
            }
        }
    }

    public static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* renamed from: o.cx0$f */
    /* loaded from: classes.dex */
    public static final class f implements b {
        public final C4761Xw0 a;
        public final C4761Xw0 b;
        public final int c;
        public final int d;
        public final String e;

        public f(C4761Xw0 c4761Xw0, C4761Xw0 c4761Xw02, int i, int i2, String str) {
            this.a = c4761Xw0;
            this.b = c4761Xw02;
            this.d = i;
            this.c = i2;
            this.e = str;
        }

        public C4761Xw0 a() {
            return this.b;
        }

        public int b() {
            return this.d;
        }

        public C4761Xw0 c() {
            return this.a;
        }

        public String d() {
            return this.e;
        }

        public int e() {
            return this.c;
        }

        public f(C4761Xw0 c4761Xw0, int i, int i2) {
            this(c4761Xw0, null, i, i2, null);
        }
    }
}
