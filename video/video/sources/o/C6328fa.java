package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import o.C9624sz1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.fa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6328fa {
    public static final String a = "AnimatorInflater";
    public static final int b = 0;
    public static final int c = 100;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final boolean i = false;

    /* renamed from: o.fa$a */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<C9624sz1.b[]> {
        public C9624sz1.b[] a;

        public a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public C9624sz1.b[] evaluate(float f, C9624sz1.b[] bVarArr, C9624sz1.b[] bVarArr2) {
            if (C9624sz1.b(bVarArr, bVarArr2)) {
                if (!C9624sz1.b(this.a, bVarArr)) {
                    this.a = C9624sz1.f(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.a[i].j(bVarArr[i], bVarArr2[i], f);
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }

        public a(C9624sz1.b[] bVarArr) {
            this.a = bVarArr;
        }
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f2) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Animator b(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i2, float f2) throws XmlPullParserException, IOException {
        int i3;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i3 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        valueAnimator = o(context, resources, theme, attributeSet, f2, xmlPullParser);
                    } else if (name.equals("animator")) {
                        valueAnimator = m(context, resources, theme, attributeSet, null, f2, xmlPullParser);
                    } else if (name.equals(C10829xw0.c)) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray s = C5206aw2.s(resources, theme, attributeSet, C6481g9.a0);
                        b(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, C5206aw2.k(s, xmlPullParser, "ordering", 0, 0), f2);
                        s.recycle();
                        valueAnimator = animatorSet2;
                    } else if (name.equals("propertyValuesHolder")) {
                        PropertyValuesHolder[] q = q(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                        if (q != null && (valueAnimator instanceof ValueAnimator)) {
                            valueAnimator.setValues(q);
                        }
                        i3 = 1;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    if (animatorSet != null && i3 == 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAnimator);
                    }
                }
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i3] = (Animator) it.next();
                i3++;
            }
            if (i2 == 0) {
                animatorSet.playTogether(animatorArr);
                return valueAnimator;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return valueAnimator;
    }

    public static Keyframe c(Keyframe keyframe, float f2) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f2);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f2);
        }
        return Keyframe.ofObject(f2);
    }

    public static void d(Keyframe[] keyframeArr, float f2, int i2, int i3) {
        float f3 = f2 / ((i3 - i2) + 2);
        while (i2 <= i3) {
            keyframeArr[i2].setFraction(keyframeArr[i2 - 1].getFraction() + f3);
            i2++;
        }
    }

    public static void e(Object[] objArr, String str) {
        Float valueOf;
        if (objArr != null && objArr.length != 0) {
            Log.d(a, str);
            int length = objArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Keyframe keyframe = (Keyframe) objArr[i2];
                StringBuilder sb = new StringBuilder();
                sb.append("Keyframe ");
                sb.append(i2);
                sb.append(": fraction ");
                Object obj = "null";
                if (keyframe.getFraction() < 0.0f) {
                    valueOf = "null";
                } else {
                    valueOf = Float.valueOf(keyframe.getFraction());
                }
                sb.append(valueOf);
                sb.append(", , value : ");
                if (keyframe.hasValue()) {
                    obj = keyframe.getValue();
                }
                sb.append(obj);
                Log.d(a, sb.toString());
            }
        }
    }

    public static PropertyValuesHolder f(TypedArray typedArray, int i2, int i3, int i4, String str) {
        boolean z;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        C4493Vd c4493Vd;
        int i7;
        int i8;
        int i9;
        float f2;
        PropertyValuesHolder ofFloat;
        float f3;
        float f4;
        TypedValue peekValue = typedArray.peekValue(i3);
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i5 = peekValue.type;
        } else {
            i5 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i4);
        if (peekValue2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i6 = peekValue2.type;
        } else {
            i6 = 0;
        }
        if (i2 == 4) {
            if ((z && i(i5)) || (z2 && i(i6))) {
                i2 = 3;
            } else {
                i2 = 0;
            }
        }
        if (i2 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i2 == 2) {
            String string = typedArray.getString(i3);
            String string2 = typedArray.getString(i4);
            C9624sz1.b[] d2 = C9624sz1.d(string);
            C9624sz1.b[] d3 = C9624sz1.d(string2);
            if (d2 != null || d3 != null) {
                if (d2 != null) {
                    a aVar = new a();
                    if (d3 != null) {
                        if (C9624sz1.b(d2, d3)) {
                            return PropertyValuesHolder.ofObject(str, aVar, d2, d3);
                        }
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                    return PropertyValuesHolder.ofObject(str, aVar, d2);
                } else if (d3 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), d3);
                }
            }
            return null;
        }
        if (i2 == 3) {
            c4493Vd = C4493Vd.a();
        } else {
            c4493Vd = null;
        }
        if (z3) {
            if (z) {
                if (i5 == 5) {
                    f3 = typedArray.getDimension(i3, 0.0f);
                } else {
                    f3 = typedArray.getFloat(i3, 0.0f);
                }
                if (z2) {
                    if (i6 == 5) {
                        f4 = typedArray.getDimension(i4, 0.0f);
                    } else {
                        f4 = typedArray.getFloat(i4, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f3, f4);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f3);
                }
            } else {
                if (i6 == 5) {
                    f2 = typedArray.getDimension(i4, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i4, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f2);
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            if (i5 == 5) {
                i8 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (i(i5)) {
                i8 = typedArray.getColor(i3, 0);
            } else {
                i8 = typedArray.getInt(i3, 0);
            }
            if (z2) {
                if (i6 == 5) {
                    i9 = (int) typedArray.getDimension(i4, 0.0f);
                } else if (i(i6)) {
                    i9 = typedArray.getColor(i4, 0);
                } else {
                    i9 = typedArray.getInt(i4, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i8, i9);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i8);
            }
        } else if (z2) {
            if (i6 == 5) {
                i7 = (int) typedArray.getDimension(i4, 0.0f);
            } else if (i(i6)) {
                i7 = typedArray.getColor(i4, 0);
            } else {
                i7 = typedArray.getInt(i4, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i7);
        }
        if (propertyValuesHolder != null && c4493Vd != null) {
            propertyValuesHolder.setEvaluator(c4493Vd);
        }
        return propertyValuesHolder;
    }

    public static int g(TypedArray typedArray, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z2 = true;
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i4 = peekValue.type;
        } else {
            i4 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i3);
        if (peekValue2 == null) {
            z2 = false;
        }
        if (z2) {
            i5 = peekValue2.type;
        } else {
            i5 = 0;
        }
        if (!z || !i(i4)) {
            if (!z2 || !i(i5)) {
                return 0;
            }
            return 3;
        }
        return 3;
    }

    public static int h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s = C5206aw2.s(resources, theme, attributeSet, C6481g9.h0);
        int i2 = 0;
        TypedValue t = C5206aw2.t(s, xmlPullParser, "value", 0);
        if (t != null && i(t.type)) {
            i2 = 3;
        }
        s.recycle();
        return i2;
    }

    public static boolean i(int i2) {
        if (i2 >= 28 && i2 <= 31) {
            return true;
        }
        return false;
    }

    public static Animator j(Context context, int i2) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i2);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i2) throws Resources.NotFoundException {
        return l(context, resources, theme, i2, 1.0f);
    }

    public static Animator l(Context context, Resources resources, Resources.Theme theme, int i2, float f2) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i2);
                    return a(context, resources, theme, xmlResourceParser, f2);
                } catch (XmlPullParserException e2) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                    notFoundException.initCause(e2);
                    throw notFoundException;
                }
            } catch (IOException e3) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                notFoundException2.initCause(e3);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    public static ValueAnimator m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray s = C5206aw2.s(resources, theme, attributeSet, C6481g9.R);
        TypedArray s2 = C5206aw2.s(resources, theme, attributeSet, C6481g9.m0);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        r(valueAnimator, s, s2, f2, xmlPullParser);
        int l = C5206aw2.l(s, xmlPullParser, "interpolator", 0, 0);
        if (l > 0) {
            valueAnimator.setInterpolator(C5843da.b(context, l));
        }
        s.recycle();
        if (s2 != null) {
            s2.recycle();
        }
        return valueAnimator;
    }

    public static Keyframe n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i2, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z;
        Keyframe ofInt;
        TypedArray s = C5206aw2.s(resources, theme, attributeSet, C6481g9.h0);
        float j = C5206aw2.j(s, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue t = C5206aw2.t(s, xmlPullParser, "value", 0);
        if (t != null) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == 4) {
            if (z && i(t.type)) {
                i2 = 3;
            } else {
                i2 = 0;
            }
        }
        if (z) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 3) {
                    ofInt = null;
                } else {
                    ofInt = Keyframe.ofInt(j, C5206aw2.k(s, xmlPullParser, "value", 0, 0));
                }
            } else {
                ofInt = Keyframe.ofFloat(j, C5206aw2.j(s, xmlPullParser, "value", 0, 0.0f));
            }
        } else if (i2 == 0) {
            ofInt = Keyframe.ofFloat(j);
        } else {
            ofInt = Keyframe.ofInt(j);
        }
        int l = C5206aw2.l(s, xmlPullParser, "interpolator", 1, 0);
        if (l > 0) {
            ofInt.setInterpolator(C5843da.b(context, l));
        }
        s.recycle();
        return ofInt;
    }

    public static ObjectAnimator o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m(context, resources, theme, attributeSet, objectAnimator, f2, xmlPullParser);
        return objectAnimator;
    }

    public static PropertyValuesHolder p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i2) throws XmlPullParserException, IOException {
        int size;
        Context context2;
        Resources.Theme theme2;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i2 == 4) {
                    i2 = h(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                int i3 = i2;
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
                Keyframe n = n(context2, resources, theme2, Xml.asAttributeSet(xmlPullParser), i3, xmlPullParser2);
                if (n != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(n);
                }
                xmlPullParser2.next();
                i2 = i3;
            } else {
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
            }
            context = context2;
            theme = theme2;
            xmlPullParser = xmlPullParser2;
        }
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            return null;
        }
        Keyframe keyframe = (Keyframe) arrayList.get(0);
        Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
        float fraction = keyframe2.getFraction();
        if (fraction < 1.0f) {
            if (fraction < 0.0f) {
                keyframe2.setFraction(1.0f);
            } else {
                arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                size++;
            }
        }
        float fraction2 = keyframe.getFraction();
        if (fraction2 != 0.0f) {
            if (fraction2 < 0.0f) {
                keyframe.setFraction(0.0f);
            } else {
                arrayList.add(0, c(keyframe, 0.0f));
                size++;
            }
        }
        Keyframe[] keyframeArr = new Keyframe[size];
        arrayList.toArray(keyframeArr);
        for (int i4 = 0; i4 < size; i4++) {
            Keyframe keyframe3 = keyframeArr[i4];
            if (keyframe3.getFraction() < 0.0f) {
                if (i4 == 0) {
                    keyframe3.setFraction(0.0f);
                } else {
                    int i5 = size - 1;
                    if (i4 == i5) {
                        keyframe3.setFraction(1.0f);
                    } else {
                        int i6 = i4;
                        for (int i7 = i4 + 1; i7 < i5 && keyframeArr[i7].getFraction() < 0.0f; i7++) {
                            i6 = i7;
                        }
                        d(keyframeArr, keyframeArr[i6 + 1].getFraction() - keyframeArr[i4 - 1].getFraction(), i4, i6);
                    }
                }
            }
        }
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
        if (i2 == 3) {
            ofKeyframe.setEvaluator(C4493Vd.a());
        }
        return ofKeyframe;
    }

    public static PropertyValuesHolder[] q(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser2.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser2.next();
            } else {
                if (xmlPullParser2.getName().equals("propertyValuesHolder")) {
                    TypedArray s = C5206aw2.s(resources, theme, attributeSet, C6481g9.c0);
                    String m = C5206aw2.m(s, xmlPullParser2, "propertyName", 3);
                    int k = C5206aw2.k(s, xmlPullParser2, com.facebook.a0.p, 2, 4);
                    PropertyValuesHolder p = p(context, resources, theme, xmlPullParser2, m, k);
                    if (p == null) {
                        p = f(s, k, 0, 1, m);
                    }
                    if (p != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(p);
                    }
                    s.recycle();
                }
                xmlPullParser.next();
                xmlPullParser2 = xmlPullParser;
            }
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size];
        for (i2 = 0; i2 < size; i2++) {
            propertyValuesHolderArr[i2] = (PropertyValuesHolder) arrayList.get(i2);
        }
        return propertyValuesHolderArr;
    }

    public static void r(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f2, XmlPullParser xmlPullParser) {
        long k = C5206aw2.k(typedArray, xmlPullParser, "duration", 1, 300);
        long k2 = C5206aw2.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int k3 = C5206aw2.k(typedArray, xmlPullParser, com.facebook.a0.p, 7, 4);
        if (C5206aw2.r(xmlPullParser, "valueFrom") && C5206aw2.r(xmlPullParser, "valueTo")) {
            if (k3 == 4) {
                k3 = g(typedArray, 5, 6);
            }
            PropertyValuesHolder f3 = f(typedArray, k3, 5, 6, "");
            if (f3 != null) {
                valueAnimator.setValues(f3);
            }
        }
        valueAnimator.setDuration(k);
        valueAnimator.setStartDelay(k2);
        valueAnimator.setRepeatCount(C5206aw2.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C5206aw2.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            s(valueAnimator, typedArray2, k3, f2, xmlPullParser);
        }
    }

    public static void s(ValueAnimator valueAnimator, TypedArray typedArray, int i2, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m = C5206aw2.m(typedArray, xmlPullParser, "pathData", 1);
        if (m != null) {
            String m2 = C5206aw2.m(typedArray, xmlPullParser, "propertyXName", 2);
            String m3 = C5206aw2.m(typedArray, xmlPullParser, "propertyYName", 3);
            if (i2 != 2) {
            }
            if (m2 == null && m3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            t(C9624sz1.e(m), objectAnimator, f2 * 0.5f, m2, m3);
            return;
        }
        objectAnimator.setPropertyName(C5206aw2.m(typedArray, xmlPullParser, "propertyName", 0));
    }

    public static void t(Path path, ObjectAnimator objectAnimator, float f2, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        char c2 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f3 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f4 = 0.0f;
        do {
            f4 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f4));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f4 / f2)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f5 = f4 / (min - 1);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i2 >= min) {
                break;
            }
            char c3 = c2;
            pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
            fArr[i2] = fArr3[c3];
            fArr2[i2] = fArr3[1];
            f3 += f5;
            int i4 = i3 + 1;
            if (i4 < arrayList.size() && f3 > ((Float) arrayList.get(i4)).floatValue()) {
                pathMeasure2.nextContour();
                i3 = i4;
            }
            i2++;
            c2 = c3;
        }
        if (str != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, fArr);
        } else {
            propertyValuesHolder2 = null;
        }
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (propertyValuesHolder2 == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(propertyValuesHolder2);
        } else {
            objectAnimator.setValues(propertyValuesHolder2, propertyValuesHolder);
        }
    }
}
