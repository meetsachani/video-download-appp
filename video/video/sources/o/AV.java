package o;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.e;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
import o.TD0;

/* loaded from: classes.dex */
public class AV {
    public static void a(ViewGroup.LayoutParams layoutParams, String str) {
        Field[] fields;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + TD0.a.Y0;
        System.out.println(" >>>>>>>>>>>>>>>>>>. dump " + str2 + TD0.a.Y0 + layoutParams.getClass().getName());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(str2 + e.f.f25o + name + C4500Ve2.b + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + str2);
    }

    public static void b(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + TD0.a.Y0;
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            System.out.println(str2 + "     " + k(childAt));
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Field[] fields = layoutParams.getClass().getFields();
            for (int i2 = 0; i2 < fields.length; i2++) {
                Field field = fields[i2];
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(str2 + e.f.f25o + field.getName() + C4500Ve2.b + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void c(Object obj) {
        Field[] fields;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + C9811tl1.d;
        Class<?> cls = obj.getClass();
        System.out.println(str + "------------- " + cls.getName() + " --------------------");
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(str + "    " + field.getName() + C4500Ve2.b + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(str + "------------- " + cls.getSimpleName() + " --------------------");
    }

    public static String d(MotionEvent motionEvent) {
        Field[] fields;
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String e(int i) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i + 2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + C9811tl1.d;
    }

    public static String f() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String g() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + C9811tl1.d;
    }

    public static String h() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + C9811tl1.d;
    }

    public static String i(Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                return "?" + i;
            }
        }
        return "UNKNOWN";
    }

    public static String j(Context context, int[] iArr) {
        String str;
        String str2;
        try {
            String str3 = iArr.length + C6566gU0.f;
            for (int i = 0; i < iArr.length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                if (i == 0) {
                    str = "";
                } else {
                    str = C4500Ve2.b;
                }
                sb.append(str);
                String sb2 = sb.toString();
                try {
                    str2 = context.getResources().getResourceEntryName(iArr[i]);
                } catch (Resources.NotFoundException unused) {
                    str2 = "? " + iArr[i] + C4500Ve2.b;
                }
                str3 = sb2 + str2;
            }
            return str3 + C6566gU0.g;
        } catch (Exception e) {
            Log.v("DEBUG", e.toString());
            return "UNKNOWN";
        }
    }

    public static String k(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String l(C7114il1 c7114il1, int i) {
        return m(c7114il1, i, -1);
    }

    public static String m(C7114il1 c7114il1, int i, int i2) {
        int length;
        if (i == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = c7114il1.getContext().getResources().getResourceEntryName(i);
        if (i2 != -1) {
            if (resourceEntryName.length() > i2) {
                resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
            }
            if (resourceEntryName.length() > i2 && (length = resourceEntryName.replaceAll("[^_]", "").length()) > 0) {
                int length2 = (resourceEntryName.length() - i2) / length;
                return resourceEntryName.replaceAll(CharBuffer.allocate(length2).toString().replace((char) 0, '.') + CrashlyticsReportPersistence.m, CrashlyticsReportPersistence.m);
            }
            return resourceEntryName;
        }
        return resourceEntryName;
    }

    public static void n(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str3 = C4500Ve2.b;
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            str3 = str3 + C4500Ve2.b;
            Log.v(str, str2 + str3 + (".(" + stackTrace[i2].getFileName() + ":" + stackTrace[i2].getLineNumber() + ") " + stackTrace[i2].getMethodName()) + str3);
        }
    }

    public static void o(String str, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str2 = C4500Ve2.b;
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            str2 = str2 + C4500Ve2.b;
            PrintStream printStream = System.out;
            printStream.println(str + str2 + (".(" + stackTrace[i2].getFileName() + ":" + stackTrace[i2].getLineNumber() + ") ") + str2);
        }
    }
}
