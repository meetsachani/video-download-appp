package o;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* renamed from: o.sH2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9455sH2 {
    @NotNull
    public static final String c = "com.facebook.react.ReactRootView";
    @NotNull
    public static final String d = "com.facebook.react.views.view.ReactViewGroup";
    @NotNull
    public static final String e = "com.facebook.react.uimanager.TouchTargetHelper";
    @NotNull
    public static final String f = "findTouchTargetView";
    public static final int g = 44;
    @Nullable
    public static Method i;
    @NotNull
    public static final C9455sH2 a = new C9455sH2();
    public static final String b = C9455sH2.class.getCanonicalName();
    @NotNull
    public static WeakReference<View> h = new WeakReference<>(null);

    @InterfaceC9511sW0
    @Nullable
    public static final View a(@Nullable View view) {
        if (SQ.e(C9455sH2.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (a.q(view)) {
                    return view;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } catch (Throwable th) {
                SQ.c(th, C9455sH2.class);
            }
        }
        return null;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final List<View> b(@Nullable View view) {
        int childCount;
        if (SQ.e(C9455sH2.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount()) > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    arrayList.add(((ViewGroup) view).getChildAt(i2));
                    if (i3 >= childCount) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            SQ.c(th, C9455sH2.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final int c(@NotNull View view) {
        int i2;
        if (SQ.e(C9455sH2.class)) {
            return 0;
        }
        try {
            C6562gT0.p(view, C9698tH2.A);
            if (view instanceof ImageView) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            if (view.isClickable()) {
                i2 |= 32;
            }
            if (o(view)) {
                i2 |= 512;
            }
            if (view instanceof TextView) {
                int i3 = i2 | 1025;
                if (view instanceof Button) {
                    i3 = i2 | J8.i0;
                    if (view instanceof Switch) {
                        i3 = i2 | 9221;
                    } else if (view instanceof CheckBox) {
                        i3 = 33797 | i2;
                    }
                }
                if (view instanceof EditText) {
                    return i3 | 2048;
                }
                return i3;
            }
            if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                if (view instanceof RatingBar) {
                    return 65536 | i2;
                }
                if (view instanceof RadioGroup) {
                    return i2 | 16384;
                }
                if ((view instanceof ViewGroup) && a.p(view, h.get())) {
                    return i2 | 64;
                }
                return i2;
            }
            return i2 | 4096;
        } catch (Throwable th) {
            SQ.c(th, C9455sH2.class);
            return 0;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final JSONObject d(@NotNull View view) {
        if (SQ.e(C9455sH2.class)) {
            return null;
        }
        try {
            C6562gT0.p(view, C9698tH2.A);
            if (C6562gT0.g(view.getClass().getName(), c)) {
                h = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                t(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> b2 = b(view);
                int size = b2.size() - 1;
                if (size >= 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        jSONArray.put(d(b2.get(i2)));
                        if (i3 > size) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                jSONObject.put(C9698tH2.j, jSONArray);
                return jSONObject;
            } catch (JSONException e2) {
                Log.e(b, "Failed to create JSONObject for view.", e2);
                return jSONObject;
            }
        } catch (Throwable th) {
            SQ.c(th, C9455sH2.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final View.OnClickListener g(@Nullable View view) {
        Field declaredField;
        if (SQ.e(C9455sH2.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            SQ.c(th, C9455sH2.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final View.OnTouchListener h(@Nullable View view) {
        Field declaredField;
        try {
            if (SQ.e(C9455sH2.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        return (View.OnTouchListener) obj2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                } catch (ClassNotFoundException e2) {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.l0(b, e2);
                    return null;
                } catch (IllegalAccessException e3) {
                    com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.l0(b, e3);
                    return null;
                }
            } catch (NoSuchFieldException e4) {
                com.facebook.internal.l0 l0Var3 = com.facebook.internal.l0.a;
                com.facebook.internal.l0.l0(b, e4);
                return null;
            }
        } catch (Throwable th) {
            SQ.c(th, C9455sH2.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String i(@Nullable View view) {
        CharSequence charSequence;
        if (SQ.e(C9455sH2.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else if (view instanceof TextView) {
                charSequence = ((TextView) view).getHint();
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                return "";
            }
            String obj = charSequence.toString();
            if (obj == null) {
                return "";
            }
            return obj;
        } catch (Throwable th) {
            SQ.c(th, C9455sH2.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final ViewGroup j(@Nullable View view) {
        if (SQ.e(C9455sH2.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            return (ViewGroup) parent;
        } catch (Throwable th) {
            SQ.c(th, C9455sH2.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String k(@Nullable View view) {
        CharSequence valueOf;
        Object selectedItem;
        String str;
        if (SQ.e(C9455sH2.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    if (((Switch) view).isChecked()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    valueOf = str;
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else if (view instanceof DatePicker) {
                int year = ((DatePicker) view).getYear();
                int month = ((DatePicker) view).getMonth();
                int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                C8319ne2 c8319ne2 = C8319ne2.a;
                valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                C6562gT0.o(valueOf, "java.lang.String.format(format, *args)");
            } else if (view instanceof TimePicker) {
                Integer currentHour = ((TimePicker) view).getCurrentHour();
                C6562gT0.o(currentHour, "view.currentHour");
                int intValue = currentHour.intValue();
                Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                C6562gT0.o(currentMinute, "view.currentMinute");
                int intValue2 = currentMinute.intValue();
                C8319ne2 c8319ne22 = C8319ne2.a;
                valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                C6562gT0.o(valueOf, "java.lang.String.format(format, *args)");
            } else if (view instanceof RadioGroup) {
                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                int childCount = ((RadioGroup) view).getChildCount();
                if (childCount > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        View childAt = ((RadioGroup) view).getChildAt(i2);
                        if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                            valueOf = ((RadioButton) childAt).getText();
                            break;
                        } else if (i3 >= childCount) {
                            break;
                        } else {
                            i2 = i3;
                        }
                    }
                }
                valueOf = null;
            } else {
                if (view instanceof RatingBar) {
                    valueOf = String.valueOf(((RatingBar) view).getRating());
                }
                valueOf = null;
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            if (obj == null) {
                return "";
            }
            return obj;
        } catch (Throwable th) {
            SQ.c(th, C9455sH2.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final boolean o(View view) {
        if (SQ.e(C9455sH2.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            C9455sH2 c9455sH2 = a;
            Class<?> f2 = c9455sH2.f("android.support.v4.view.NestedScrollingChild");
            if (f2 != null && f2.isInstance(parent)) {
                return true;
            }
            Class<?> f3 = c9455sH2.f("androidx.core.view.NestedScrollingChild");
            if (f3 != null) {
                if (f3.isInstance(parent)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            SQ.c(th, C9455sH2.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final void r(@NotNull View view, @Nullable View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        if (!SQ.e(C9455sH2.class)) {
            try {
                C6562gT0.p(view, C9698tH2.A);
                Object obj = null;
                try {
                    try {
                        field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        field = null;
                    }
                    try {
                        field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                        field2 = null;
                        if (field == null) {
                        }
                        view.setOnClickListener(onClickListener);
                    }
                    if (field == null && field2 != null) {
                        field.setAccessible(true);
                        field2.setAccessible(true);
                        try {
                            field.setAccessible(true);
                            obj = field.get(view);
                        } catch (IllegalAccessException unused3) {
                        }
                        if (obj == null) {
                            view.setOnClickListener(onClickListener);
                            return;
                        } else {
                            field2.set(obj, onClickListener);
                            return;
                        }
                    }
                    view.setOnClickListener(onClickListener);
                } catch (Exception unused4) {
                }
            } catch (Throwable th) {
                SQ.c(th, C9455sH2.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void s(@NotNull View view, @NotNull JSONObject jSONObject, float f2) {
        Bitmap bitmap;
        Typeface typeface;
        if (!SQ.e(C9455sH2.class)) {
            try {
                C6562gT0.p(view, C9698tH2.A);
                C6562gT0.p(jSONObject, com.facebook.S.B);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if ((view instanceof TextView) && (typeface = ((TextView) view).getTypeface()) != null) {
                        jSONObject2.put(C9698tH2.s, ((TextView) view).getTextSize());
                        jSONObject2.put(C9698tH2.t, typeface.isBold());
                        jSONObject2.put(C9698tH2.u, typeface.isItalic());
                        jSONObject.put(C9698tH2.v, jSONObject2);
                    }
                    if (view instanceof ImageView) {
                        Drawable drawable = ((ImageView) view).getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            float f3 = 44;
                            if (view.getHeight() / f2 <= f3 && view.getWidth() / f2 <= f3 && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                jSONObject.put(C9698tH2.w, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                            }
                        }
                    }
                } catch (JSONException e2) {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.l0(b, e2);
                }
            } catch (Throwable th) {
                SQ.c(th, C9455sH2.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void t(@NotNull View view, @NotNull JSONObject jSONObject) {
        if (!SQ.e(C9455sH2.class)) {
            try {
                C6562gT0.p(view, C9698tH2.A);
                C6562gT0.p(jSONObject, com.facebook.S.B);
                try {
                    String k = k(view);
                    String i2 = i(view);
                    Object tag = view.getTag();
                    CharSequence contentDescription = view.getContentDescription();
                    jSONObject.put(C9698tH2.c, view.getClass().getCanonicalName());
                    jSONObject.put(C9698tH2.d, c(view));
                    jSONObject.put("id", view.getId());
                    A02 a02 = A02.a;
                    if (!A02.g(view)) {
                        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                        jSONObject.put("text", com.facebook.internal.l0.k(com.facebook.internal.l0.R0(k), ""));
                    } else {
                        jSONObject.put("text", "");
                        jSONObject.put(C9698tH2.h, true);
                    }
                    com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                    jSONObject.put("hint", com.facebook.internal.l0.k(com.facebook.internal.l0.R0(i2), ""));
                    if (tag != null) {
                        jSONObject.put("tag", com.facebook.internal.l0.k(com.facebook.internal.l0.R0(tag.toString()), ""));
                    }
                    if (contentDescription != null) {
                        jSONObject.put("description", com.facebook.internal.l0.k(com.facebook.internal.l0.R0(contentDescription.toString()), ""));
                    }
                    jSONObject.put("dimension", a.e(view));
                } catch (JSONException e2) {
                    com.facebook.internal.l0 l0Var3 = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.l0(b, e2);
                }
            } catch (Throwable th) {
                SQ.c(th, C9455sH2.class);
            }
        }
    }

    public final JSONObject e(View view) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C9698tH2.l, view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put(C9698tH2.p, view.getScrollX());
                jSONObject.put(C9698tH2.q, view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException e2) {
                Log.e(b, "Failed to create JSONObject for dimension.", e2);
                return jSONObject;
            }
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final Class<?> f(String str) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final View l(float[] fArr, View view) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            n();
            Method method = i;
            if (method != null && view != null) {
                try {
                    if (method != null) {
                        Object invoke = method.invoke(null, fArr, view);
                        if (invoke != null) {
                            View view2 = (View) invoke;
                            if (view2.getId() > 0) {
                                ViewParent parent = view2.getParent();
                                if (parent != null) {
                                    return (View) parent;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } catch (IllegalAccessException e2) {
                    com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.l0(b, e2);
                } catch (InvocationTargetException e3) {
                    com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                    com.facebook.internal.l0.l0(b, e3);
                }
            }
            return null;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final float[] m(View view) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{iArr[0], iArr[1]};
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final void n() {
        if (!SQ.e(this)) {
            try {
                if (i == null) {
                    try {
                        Method declaredMethod = Class.forName(e).getDeclaredMethod(f, float[].class, ViewGroup.class);
                        i = declaredMethod;
                        if (declaredMethod != null) {
                            declaredMethod.setAccessible(true);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    } catch (ClassNotFoundException e2) {
                        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                        com.facebook.internal.l0.l0(b, e2);
                    } catch (NoSuchMethodException e3) {
                        com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
                        com.facebook.internal.l0.l0(b, e3);
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final boolean p(@NotNull View view, @Nullable View view2) {
        View l;
        if (SQ.e(this)) {
            return false;
        }
        try {
            C6562gT0.p(view, C9698tH2.A);
            if (C6562gT0.g(view.getClass().getName(), d) && (l = l(m(view), view2)) != null) {
                if (l.getId() == view.getId()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }

    public final boolean q(View view) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            return C6562gT0.g(view.getClass().getName(), c);
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }
}
