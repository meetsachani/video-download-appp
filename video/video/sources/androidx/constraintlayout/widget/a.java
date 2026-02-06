package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import o.C10829xw0;
import o.C6516gH2;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class a {
    public static final String i = "TransitionLayout";
    public static final boolean j = false;
    public boolean a;
    public String b;
    public EnumC0018a c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    /* renamed from: androidx.constraintlayout.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0018a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, EnumC0018a enumC0018a) {
        this.a = false;
        this.b = str;
        this.c = enumC0018a;
    }

    public static int b(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    public static HashMap<String, a> d(HashMap<String, a> hashMap, View view) {
        HashMap<String, a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e3);
            }
        }
        return hashMap2;
    }

    public static void q(Context context, XmlPullParser xmlPullParser, HashMap<String, a> hashMap) {
        EnumC0018a enumC0018a;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.A8);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0018a enumC0018a2 = null;
        boolean z = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == j.c.B8) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == j.c.L8) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == j.c.C8) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC0018a2 = EnumC0018a.BOOLEAN_TYPE;
            } else {
                if (index == j.c.E8) {
                    enumC0018a = EnumC0018a.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == j.c.D8) {
                    enumC0018a = EnumC0018a.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == j.c.I8) {
                    enumC0018a = EnumC0018a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == j.c.F8) {
                    enumC0018a = EnumC0018a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == j.c.G8) {
                    enumC0018a = EnumC0018a.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == j.c.H8) {
                    enumC0018a = EnumC0018a.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == j.c.K8) {
                    enumC0018a = EnumC0018a.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == j.c.J8) {
                    enumC0018a = EnumC0018a.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                enumC0018a2 = enumC0018a;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, enumC0018a2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public static void r(View view, HashMap<String, a> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            a aVar = hashMap.get(str2);
            if (!aVar.a) {
                str = C10829xw0.c + str2;
            } else {
                str = str2;
            }
            try {
                int ordinal = aVar.c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (ordinal) {
                    case 0:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(aVar.d));
                        continue;
                    case 1:
                        cls.getMethod(str, cls2).invoke(view, Float.valueOf(aVar.e));
                        continue;
                    case 2:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(aVar.h));
                        continue;
                    case 3:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.h);
                        method.invoke(view, colorDrawable);
                        continue;
                    case 4:
                        cls.getMethod(str, CharSequence.class).invoke(view, aVar.f);
                        continue;
                    case 5:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.g));
                        continue;
                    case 6:
                        cls.getMethod(str, cls2).invoke(view, Float.valueOf(aVar.e));
                        continue;
                    case 7:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(aVar.d));
                        continue;
                }
            } catch (IllegalAccessException e) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e3);
            }
        }
    }

    public void a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.b;
        if (!this.a) {
            str = C10829xw0.c + str2;
        } else {
            str = str2;
        }
        try {
            int ordinal = this.c.ordinal();
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            switch (ordinal) {
                case 0:
                case 7:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.d));
                    return;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.e));
                    return;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.h));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.h);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f);
                    return;
                case 5:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.g));
                    return;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.e));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
        } catch (NoSuchMethodException e2) {
            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
        } catch (InvocationTargetException e3) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e3);
        }
    }

    public boolean c(a aVar) {
        EnumC0018a enumC0018a;
        if (aVar != null && (enumC0018a = this.c) == aVar.c) {
            switch (enumC0018a.ordinal()) {
                case 0:
                case 7:
                    if (this.d == aVar.d) {
                        return true;
                    }
                    break;
                case 1:
                    if (this.e != aVar.e) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    if (this.h != aVar.h) {
                        return false;
                    }
                    return true;
                case 4:
                    if (this.d != aVar.d) {
                        return false;
                    }
                    return true;
                case 5:
                    if (this.g != aVar.g) {
                        return false;
                    }
                    return true;
                case 6:
                    if (this.e != aVar.e) {
                        return false;
                    }
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    public int e() {
        return this.h;
    }

    public float f() {
        return this.e;
    }

    public int g() {
        return this.d;
    }

    public String h() {
        return this.b;
    }

    public String i() {
        return this.f;
    }

    public EnumC0018a j() {
        return this.c;
    }

    public float k() {
        switch (this.c.ordinal()) {
            case 0:
                return this.d;
            case 1:
            case 6:
                return this.e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                if (this.g) {
                    return 1.0f;
                }
                return 0.0f;
            default:
                return Float.NaN;
        }
    }

    public void l(float[] fArr) {
        float f;
        switch (this.c.ordinal()) {
            case 0:
                fArr[0] = this.d;
                return;
            case 1:
                fArr[0] = this.e;
                return;
            case 2:
            case 3:
                int i2 = this.h;
                float pow = (float) Math.pow(((i2 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i2 >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i2 & 255) / 255.0f, 2.2d);
                fArr[3] = ((i2 >> 24) & 255) / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                if (this.g) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case 6:
                fArr[0] = this.e;
                return;
            default:
                return;
        }
    }

    public boolean m() {
        return this.g;
    }

    public boolean n() {
        int ordinal = this.c.ordinal();
        if (ordinal != 4 && ordinal != 5 && ordinal != 7) {
            return true;
        }
        return false;
    }

    public boolean o() {
        return this.a;
    }

    public int p() {
        int ordinal = this.c.ordinal();
        if (ordinal != 2 && ordinal != 3) {
            return 1;
        }
        return 4;
    }

    public void s(int i2) {
        this.h = i2;
    }

    public void t(float f) {
        this.e = f;
    }

    public void u(int i2) {
        this.d = i2;
    }

    public void v(String str) {
        this.f = str;
    }

    public void w(Object obj) {
        switch (this.c.ordinal()) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                return;
            case 1:
                this.e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f = (String) obj;
                return;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public void x(float[] fArr) {
        boolean z = false;
        switch (this.c.ordinal()) {
            case 0:
            case 7:
                this.d = (int) fArr[0];
                return;
            case 1:
                this.e = fArr[0];
                return;
            case 2:
            case 3:
                int HSVToColor = Color.HSVToColor(fArr);
                this.h = HSVToColor;
                this.h = (b((int) (fArr[3] * 255.0f)) << 24) | (HSVToColor & C6516gH2.x);
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                if (fArr[0] > 0.5d) {
                    z = true;
                }
                this.g = z;
                return;
            case 6:
                this.e = fArr[0];
                return;
            default:
                return;
        }
    }

    public a(String str, EnumC0018a enumC0018a, Object obj, boolean z) {
        this.b = str;
        this.c = enumC0018a;
        this.a = z;
        w(obj);
    }

    public a(a aVar, Object obj) {
        this.a = false;
        this.b = aVar.b;
        this.c = aVar.c;
        w(obj);
    }
}
