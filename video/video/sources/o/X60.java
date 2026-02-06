package o;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class X60 {
    public static final int[] a = {16842912};
    public static final int[] b = new int[0];
    public static final Rect c = new Rect();

    /* loaded from: classes.dex */
    public static class a {
        public static final boolean a;
        public static final Method b;
        public static final Field c;
        public static final Field d;
        public static final Field e;
        public static final Field f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z;
            Class<?> cls;
            try {
                cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
                try {
                    field = cls.getField("left");
                } catch (ClassNotFoundException unused) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (!z) {
                    }
                } catch (NoSuchFieldException unused2) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (!z) {
                    }
                } catch (NoSuchMethodException unused3) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (!z) {
                    }
                }
                try {
                    field2 = cls.getField(C9698tH2.l);
                    try {
                        field3 = cls.getField(C5445bv2.n0);
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (!z) {
                    }
                } catch (NoSuchFieldException unused6) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (!z) {
                    }
                } catch (NoSuchMethodException unused7) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (!z) {
                    }
                }
            } catch (ClassNotFoundException unused8) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused9) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused10) {
                method = null;
                field = null;
            }
            try {
                field4 = cls.getField("bottom");
                z = true;
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused11) {
                field4 = null;
                z = false;
                if (!z) {
                }
            }
            if (!z) {
                b = method;
                c = field;
                d = field2;
                e = field3;
                f = field4;
                a = true;
                return;
            }
            b = null;
            c = null;
            d = null;
            e = null;
            f = null;
            a = false;
        }

        public static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && a) {
                try {
                    Object invoke = b.invoke(drawable, null);
                    if (invoke != null) {
                        return new Rect(c.getInt(invoke), d.getInt(invoke), e.getInt(invoke), f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return X60.c;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    @Deprecated
    public static boolean a(Drawable drawable) {
        return true;
    }

    public static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            c(drawable);
        }
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(b);
        } else {
            drawable.setState(a);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets a2 = b.a(drawable);
            i = a2.left;
            i2 = a2.top;
            i3 = a2.right;
            i4 = a2.bottom;
            return new Rect(i, i2, i3, i4);
        }
        return a.a(D60.q(drawable));
    }

    public static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
