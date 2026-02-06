package o;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

/* renamed from: o.xf0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10761xf0 {
    public static final int a = -1;
    public static final String[] b = {"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};
    public static final String c = " [wrapped] ";

    public static <T extends Throwable> T A(Throwable th, Class<T> cls, int i, boolean z) {
        if (th != null && cls != null) {
            if (i < 0) {
                i = 0;
            }
            Throwable[] o2 = o(th);
            if (i >= o2.length) {
                return null;
            }
            if (z) {
                while (i < o2.length) {
                    if (cls.isAssignableFrom(o2[i].getClass())) {
                        return cls.cast(o2[i]);
                    }
                    i++;
                }
            } else {
                while (i < o2.length) {
                    if (cls.equals(o2[i].getClass())) {
                        return cls.cast(o2[i]);
                    }
                    i++;
                }
            }
        }
        return null;
    }

    public static <T extends Throwable> T B(Throwable th, Class<T> cls) {
        return (T) A(th, cls, 0, false);
    }

    public static <T extends Throwable> T C(Throwable th, Class<T> cls, int i) {
        return (T) A(th, cls, i, false);
    }

    public static <T extends Throwable> T D(Throwable th, Class<T> cls) {
        return (T) A(th, cls, 0, true);
    }

    public static <T extends Throwable> T E(Throwable th, Class<T> cls, int i) {
        return (T) A(th, cls, i, true);
    }

    public static <R> R G(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new UndeclaredThrowableException(th);
        }
        throw ((RuntimeException) th);
    }

    @Deprecated
    public static Throwable a(Throwable th) {
        return b(th, null);
    }

    @Deprecated
    public static Throwable b(Throwable th, String[] strArr) {
        Throwable c2;
        if (th == null) {
            return null;
        }
        if (strArr == null) {
            Throwable cause = th.getCause();
            if (cause != null) {
                return cause;
            }
            strArr = b;
        }
        for (String str : strArr) {
            if (str != null && (c2 = c(th, str)) != null) {
                return c2;
            }
        }
        return null;
    }

    public static Throwable c(Throwable th, String str) {
        Method method;
        try {
            method = th.getClass().getMethod(str, null);
        } catch (NoSuchMethodException | SecurityException unused) {
            method = null;
        }
        if (method != null && Throwable.class.isAssignableFrom(method.getReturnType())) {
            try {
                return (Throwable) method.invoke(th, null);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            }
        }
        return null;
    }

    @Deprecated
    public static String[] d() {
        return (String[]) C4206Se.R(b);
    }

    public static String e(Throwable th) {
        if (th == null) {
            return "";
        }
        String H = C8457oD.H(th, null);
        String message = th.getMessage();
        return H + ": " + C4500Ve2.L(message);
    }

    public static Throwable f(Throwable th) {
        List<Throwable> n = n(th);
        if (n.isEmpty()) {
            return null;
        }
        return n.get(n.size() - 1);
    }

    public static String g(Throwable th) {
        Throwable f = f(th);
        if (f != null) {
            th = f;
        }
        return e(th);
    }

    public static String[] h(Throwable th) {
        List<String> list;
        if (th == null) {
            return C4206Se.u;
        }
        Throwable[] o2 = o(th);
        int length = o2.length;
        ArrayList arrayList = new ArrayList();
        int i = length - 1;
        List<String> i2 = i(o2[i]);
        while (true) {
            int i3 = length - 1;
            if (i3 >= 0) {
                if (i3 != 0) {
                    list = i(o2[length - 2]);
                    y(i2, list);
                } else {
                    list = i2;
                }
                if (i3 == i) {
                    arrayList.add(o2[i3].toString());
                } else {
                    arrayList.add(c + o2[i3].toString());
                }
                arrayList.addAll(i2);
                i2 = list;
                length = i3;
            } else {
                return (String[]) arrayList.toArray(C4206Se.u);
            }
        }
    }

    public static List<String> i(Throwable th) {
        StringTokenizer stringTokenizer = new StringTokenizer(l(th), System.lineSeparator());
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("at");
            if (indexOf != -1 && nextToken.substring(0, indexOf).trim().isEmpty()) {
                arrayList.add(nextToken);
                z = true;
            } else if (z) {
                break;
            }
        }
        return arrayList;
    }

    public static String[] j(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, System.lineSeparator());
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return (String[]) arrayList.toArray(C4206Se.u);
    }

    public static String[] k(Throwable th) {
        if (th == null) {
            return C4206Se.u;
        }
        return j(l(th));
    }

    public static String l(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static int m(Throwable th) {
        return n(th).size();
    }

    public static List<Throwable> n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        return arrayList;
    }

    public static Throwable[] o(Throwable th) {
        return (Throwable[]) n(th).toArray(C4206Se.v);
    }

    public static boolean p(Throwable th, Class<? extends Throwable> cls) {
        if (th instanceof UndeclaredThrowableException) {
            th = th.getCause();
        }
        return cls.isInstance(th);
    }

    public static int q(Throwable th, Class<? extends Throwable> cls, int i, boolean z) {
        if (th != null && cls != null) {
            if (i < 0) {
                i = 0;
            }
            Throwable[] o2 = o(th);
            if (i >= o2.length) {
                return -1;
            }
            if (z) {
                while (i < o2.length) {
                    if (cls.isAssignableFrom(o2[i].getClass())) {
                        return i;
                    }
                    i++;
                }
            } else {
                while (i < o2.length) {
                    if (cls.equals(o2[i].getClass())) {
                        return i;
                    }
                    i++;
                }
            }
        }
        return -1;
    }

    public static int r(Throwable th, Class<? extends Throwable> cls) {
        return q(th, cls, 0, false);
    }

    public static int s(Throwable th, Class<? extends Throwable> cls, int i) {
        return q(th, cls, i, false);
    }

    public static int t(Throwable th, Class<? extends Throwable> cls) {
        return q(th, cls, 0, true);
    }

    public static int u(Throwable th, Class<? extends Throwable> cls, int i) {
        return q(th, cls, i, true);
    }

    public static void v(Throwable th) {
        w(th, System.err);
    }

    public static void w(Throwable th, PrintStream printStream) {
        if (th == null) {
            return;
        }
        Objects.requireNonNull(printStream, "printStream");
        for (String str : h(th)) {
            printStream.println(str);
        }
        printStream.flush();
    }

    public static void x(Throwable th, PrintWriter printWriter) {
        if (th == null) {
            return;
        }
        Objects.requireNonNull(printWriter, "printWriter");
        for (String str : h(th)) {
            printWriter.println(str);
        }
        printWriter.flush();
    }

    public static void y(List<String> list, List<String> list2) {
        if (list != null && list2 != null) {
            int size = list.size() - 1;
            for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
                if (list.get(size).equals(list2.get(size2))) {
                    list.remove(size);
                }
                size--;
            }
            return;
        }
        throw new IllegalArgumentException("The List must not be null");
    }

    public static <R> R z(Throwable th) {
        return (R) F(th);
    }

    public static <R, T extends Throwable> R F(Throwable th) throws Throwable {
        throw th;
    }
}
