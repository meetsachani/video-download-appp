package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.Constructor;
import o.InterfaceC8148mw2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.rt2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9358rt2 {
    public static final Class<?>[] b = {Context.class, AttributeSet.class};
    public static final C2531Be<String, Constructor<?>> c = new C2531Be<>();
    public final Context a;

    public C9358rt2(Context context) {
        this.a = context;
    }

    public static C9358rt2 d(Context context) {
        return new C9358rt2(context);
    }

    public final Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, com.facebook.applinks.c.f);
        if (attributeValue != null) {
            try {
                C2531Be<String, Constructor<?>> c2531Be = c;
                synchronized (c2531Be) {
                    Constructor<?> constructor = c2531Be.get(attributeValue);
                    if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.a.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = asSubclass.getConstructor(b);
                        constructor.setAccessible(true);
                        c2531Be.put(attributeValue, constructor);
                    }
                    newInstance = constructor.newInstance(this.a, attributeSet);
                }
                return newInstance;
            } catch (Exception e) {
                throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
            }
        }
        throw new InflateException(str + " tag must have a 'class' attribute");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x017d, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC5921dt2 b(XmlPullParser xmlPullParser, AttributeSet attributeSet, AbstractC5921dt2 abstractC5921dt2) throws XmlPullParserException, IOException {
        C2692Ct2 c2692Ct2;
        int depth = xmlPullParser.getDepth();
        if (abstractC5921dt2 instanceof C2692Ct2) {
            c2692Ct2 = (C2692Ct2) abstractC5921dt2;
        } else {
            c2692Ct2 = null;
        }
        loop0: while (true) {
            AbstractC5921dt2 abstractC5921dt22 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        String name = xmlPullParser.getName();
                        if ("fade".equals(name)) {
                            abstractC5921dt22 = new C7351jk0(this.a, attributeSet);
                        } else if ("changeBounds".equals(name)) {
                            abstractC5921dt22 = new C5502cA(this.a, attributeSet);
                        } else if ("slide".equals(name)) {
                            abstractC5921dt22 = new C5259b92(this.a, attributeSet);
                        } else if ("explode".equals(name)) {
                            abstractC5921dt22 = new C7105ij0(this.a, attributeSet);
                        } else if ("changeImageTransform".equals(name)) {
                            abstractC5921dt22 = new C5987eA(this.a, attributeSet);
                        } else if ("changeTransform".equals(name)) {
                            abstractC5921dt22 = new C6485gA(this.a, attributeSet);
                        } else if ("changeClipBounds".equals(name)) {
                            abstractC5921dt22 = new C5745dA(this.a, attributeSet);
                        } else if (InterfaceC8148mw2.h.f.equals(name)) {
                            abstractC5921dt22 = new C6360fi(this.a, attributeSet);
                        } else if ("changeScroll".equals(name)) {
                            abstractC5921dt22 = new C6230fA(this.a, attributeSet);
                        } else if ("transitionSet".equals(name)) {
                            abstractC5921dt22 = new C2692Ct2(this.a, attributeSet);
                        } else if (S9.u1.equals(name)) {
                            abstractC5921dt22 = (AbstractC5921dt2) a(attributeSet, AbstractC5921dt2.class, S9.u1);
                        } else if ("targets".equals(name)) {
                            e(xmlPullParser, attributeSet, abstractC5921dt2);
                        } else if ("arcMotion".equals(name)) {
                            if (abstractC5921dt2 != null) {
                                abstractC5921dt2.M0(new C3811Od(this.a, attributeSet));
                            } else {
                                throw new RuntimeException("Invalid use of arcMotion element");
                            }
                        } else if ("pathMotion".equals(name)) {
                            if (abstractC5921dt2 != null) {
                                abstractC5921dt2.M0((AbstractC9139qz1) a(attributeSet, AbstractC9139qz1.class, "pathMotion"));
                            } else {
                                throw new RuntimeException("Invalid use of pathMotion element");
                            }
                        } else if ("patternPathMotion".equals(name)) {
                            if (abstractC5921dt2 != null) {
                                abstractC5921dt2.M0(new C7222jC1(this.a, attributeSet));
                            } else {
                                throw new RuntimeException("Invalid use of patternPathMotion element");
                            }
                        } else {
                            throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                        }
                        if (abstractC5921dt22 == null) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                b(xmlPullParser, attributeSet, abstractC5921dt22);
                            }
                            if (c2692Ct2 != null) {
                                break;
                            } else if (abstractC5921dt2 != null) {
                                throw new InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            c2692Ct2.X0(abstractC5921dt22);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C10576wt2 c(XmlPullParser xmlPullParser, AttributeSet attributeSet, ViewGroup viewGroup) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        C10576wt2 c10576wt2 = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("transitionManager")) {
                        c10576wt2 = new C10576wt2();
                    } else if (!name.equals(S9.u1) || c10576wt2 == null) {
                        break;
                    } else {
                        h(attributeSet, xmlPullParser, viewGroup, c10576wt2);
                    }
                }
            }
        }
        throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
    }

    public final void e(XmlPullParser xmlPullParser, AttributeSet attributeSet, AbstractC5921dt2 abstractC5921dt2) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    if (xmlPullParser.getName().equals("target")) {
                        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(attributeSet, C4795Yf2.a);
                        int l = C5206aw2.l(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                        if (l != 0) {
                            abstractC5921dt2.e(l);
                        } else {
                            int l2 = C5206aw2.l(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                            if (l2 != 0) {
                                abstractC5921dt2.C(l2, true);
                            } else {
                                String m = C5206aw2.m(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                                if (m != null) {
                                    abstractC5921dt2.h(m);
                                } else {
                                    String m2 = C5206aw2.m(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                    if (m2 != null) {
                                        abstractC5921dt2.F(m2, true);
                                    } else {
                                        String m3 = C5206aw2.m(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                        if (m3 != null) {
                                            try {
                                                abstractC5921dt2.E(Class.forName(m3), true);
                                            } catch (ClassNotFoundException e) {
                                                obtainStyledAttributes.recycle();
                                                throw new RuntimeException("Could not create " + m3, e);
                                            }
                                        } else {
                                            String m4 = C5206aw2.m(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                            if (m4 != null) {
                                                abstractC5921dt2.g(Class.forName(m4));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        obtainStyledAttributes.recycle();
                    } else {
                        throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                    }
                }
            } else {
                return;
            }
        }
    }

    public AbstractC5921dt2 f(int i) {
        XmlResourceParser xml = this.a.getResources().getXml(i);
        try {
            try {
                return b(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e) {
                throw new InflateException(xml.getPositionDescription() + ": " + e.getMessage(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        } finally {
            xml.close();
        }
    }

    public C10576wt2 g(int i, ViewGroup viewGroup) {
        XmlResourceParser xml = this.a.getResources().getXml(i);
        try {
            try {
                return c(xml, Xml.asAttributeSet(xml), viewGroup);
            } catch (IOException e) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e.getMessage());
                inflateException.initCause(e);
                throw inflateException;
            } catch (XmlPullParserException e2) {
                InflateException inflateException2 = new InflateException(e2.getMessage());
                inflateException2.initCause(e2);
                throw inflateException2;
            }
        } finally {
            xml.close();
        }
    }

    public final void h(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, C10576wt2 c10576wt2) throws Resources.NotFoundException {
        C5354bY1 d;
        AbstractC5921dt2 f;
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(attributeSet, C4795Yf2.b);
        int l = C5206aw2.l(obtainStyledAttributes, xmlPullParser, S9.u1, 2, -1);
        int l2 = C5206aw2.l(obtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        C5354bY1 c5354bY1 = null;
        if (l2 < 0) {
            d = null;
        } else {
            d = C5354bY1.d(viewGroup, l2, this.a);
        }
        int l3 = C5206aw2.l(obtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        if (l3 >= 0) {
            c5354bY1 = C5354bY1.d(viewGroup, l3, this.a);
        }
        if (l >= 0 && (f = f(l)) != null) {
            if (c5354bY1 != null) {
                if (d == null) {
                    c10576wt2.n(c5354bY1, f);
                } else {
                    c10576wt2.m(d, c5354bY1, f);
                }
            } else {
                throw new RuntimeException("No toScene for transition ID " + l);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
