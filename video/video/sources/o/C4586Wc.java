package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.OL1;

/* renamed from: o.Wc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4586Wc {
    public static final String h = "AppCompatViewInflater";
    public final Object[] a = new Object[2];
    public static final Class<?>[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {16843375};
    public static final int[] d = {16844160};
    public static final int[] e = {16844156};
    public static final int[] f = {16844148};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final C9654t62<String, Constructor<? extends View>> i = new C9654t62<>();

    /* renamed from: o.Wc$a */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {
        public final View X;
        public final String Y;
        public Context Y0;
        public Method Z;

        public a(View view, String str) {
            this.X = view;
            this.Y = str;
        }

        public final void a(Context context) {
            int id;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.Y, View.class)) != null) {
                        this.Z = method;
                        this.Y0 = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            if (this.X.getId() == -1) {
                str = "";
            } else {
                str = " with id '" + this.X.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.Y + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.X.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.Z == null) {
                a(this.X.getContext());
            }
            try {
                this.Z.invoke(this.Y0, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    public static Context u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OL1.m.W6, 0, 0);
        if (z) {
            i2 = obtainStyledAttributes.getResourceId(OL1.m.X6, 0);
        } else {
            i2 = 0;
        }
        if (z2 && i2 == 0 && (i2 = obtainStyledAttributes.getResourceId(OL1.m.b7, 0)) != 0) {
            Log.i(h, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (i2 != 0 && (!(context instanceof BM) || ((BM) context).c() != i2)) {
            return new BM(context, i2);
        }
        return context;
    }

    public final void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d);
        if (obtainStyledAttributes.hasValue(0)) {
            C6516gH2.J1(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e);
        if (obtainStyledAttributes2.hasValue(0)) {
            C6516gH2.L1(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f);
        if (obtainStyledAttributes3.hasValue(0)) {
            C6516gH2.y2(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    public final void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C3607Mb c(Context context, AttributeSet attributeSet) {
        return new C3607Mb(context, attributeSet);
    }

    public AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public C4485Vb e(Context context, AttributeSet attributeSet) {
        return new C4485Vb(context, attributeSet);
    }

    public C4679Xb f(Context context, AttributeSet attributeSet) {
        return new C4679Xb(context, attributeSet);
    }

    public C9530sc g(Context context, AttributeSet attributeSet) {
        return new C9530sc(context, attributeSet);
    }

    public C10748xc h(Context context, AttributeSet attributeSet) {
        return new C10748xc(context, attributeSet);
    }

    public AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public C2523Bc j(Context context, AttributeSet attributeSet) {
        return new C2523Bc(context, attributeSet);
    }

    public C2926Fc k(Context context, AttributeSet attributeSet) {
        return new C2926Fc(context, attributeSet);
    }

    public C3024Gc l(Context context, AttributeSet attributeSet) {
        return new C3024Gc(context, attributeSet);
    }

    public C3318Jc m(Context context, AttributeSet attributeSet) {
        return new C3318Jc(context, attributeSet);
    }

    public C3611Mc n(Context context, AttributeSet attributeSet) {
        return new C3611Mc(context, attributeSet);
    }

    public AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public C4489Vc p(Context context, AttributeSet attributeSet) {
        return new C4489Vc(context, attributeSet);
    }

    public View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View l;
        if (z && view != null) {
            context2 = view.getContext();
        } else {
            context2 = context;
        }
        if (z2 || z3) {
            context2 = u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C2578Bp2.b(context2);
        }
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c2 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = C8206nB.d;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                l = l(context2, attributeSet);
                v(l, str);
                break;
            case 1:
                l = f(context2, attributeSet);
                v(l, str);
                break;
            case 2:
                l = j(context2, attributeSet);
                v(l, str);
                break;
            case 3:
                l = o(context2, attributeSet);
                v(l, str);
                break;
            case 4:
                l = h(context2, attributeSet);
                v(l, str);
                break;
            case 5:
                l = m(context2, attributeSet);
                v(l, str);
                break;
            case 6:
                l = n(context2, attributeSet);
                v(l, str);
                break;
            case 7:
                l = k(context2, attributeSet);
                v(l, str);
                break;
            case '\b':
                l = p(context2, attributeSet);
                v(l, str);
                break;
            case '\t':
                l = i(context2, attributeSet);
                v(l, str);
                break;
            case '\n':
                l = c(context2, attributeSet);
                v(l, str);
                break;
            case 11:
                l = e(context2, attributeSet);
                v(l, str);
                break;
            case '\f':
                l = g(context2, attributeSet);
                v(l, str);
                break;
            case '\r':
                l = d(context2, attributeSet);
                v(l, str);
                break;
            default:
                l = q(context2, str, attributeSet);
                break;
        }
        if (l == null && context != context2) {
            l = t(context2, str, attributeSet);
        }
        if (l != null) {
            b(l, attributeSet);
            a(context2, l, attributeSet);
        }
        return l;
    }

    public final View s(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        C9654t62<String, Constructor<? extends View>> c9654t62 = i;
        Constructor<? extends View> constructor = c9654t62.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            c9654t62.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.a);
    }

    public final View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(C9698tH2.A)) {
            str = attributeSet.getAttributeValue(null, com.facebook.applinks.c.f);
        }
        try {
            Object[] objArr = this.a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i2 = 0;
                while (true) {
                    String[] strArr = g;
                    if (i2 >= strArr.length) {
                        return null;
                    }
                    View s = s(context, str, strArr[i2]);
                    if (s != null) {
                        return s;
                    }
                    i2++;
                }
            } else {
                return s(context, str, null);
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public final void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
