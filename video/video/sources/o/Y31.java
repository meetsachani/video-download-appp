package o;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessController;
import java.util.Hashtable;

/* loaded from: classes4.dex */
public class Y31 extends U31 {
    public static final String F = "org.apache.commons.logging.impl.";
    public static final int G = 32;
    public static final String H = "org.apache.commons.logging.Log";
    public static final String I = "org.apache.commons.logging.log";
    public static final String J = "org.apache.commons.logging.Log.allowFlawedContext";
    public static final String K = "org.apache.commons.logging.Log.allowFlawedDiscovery";
    public static final String L = "org.apache.commons.logging.Log.allowFlawedHierarchy";
    public static /* synthetic */ Class N;
    public static /* synthetic */ Class O;
    public static /* synthetic */ Class P;
    public static /* synthetic */ Class Q;
    public boolean A;
    public String q;
    public String t;
    public Class[] v;
    public Method w;
    public Class[] x;
    public boolean y;
    public boolean z;
    public static final String B = "org.apache.commons.logging.impl.Log4JLogger";
    public static final String C = "org.apache.commons.logging.impl.Jdk14Logger";
    public static final String D = "org.apache.commons.logging.impl.Jdk13LumberjackLogger";
    public static final String E = "org.apache.commons.logging.impl.SimpleLog";
    public static final String[] M = {B, C, D, E};
    public boolean p = true;
    public Hashtable r = new Hashtable();
    public Hashtable s = new Hashtable();
    public Constructor u = null;

    public Y31() {
        Class cls = N;
        if (cls == null) {
            cls = c("java.lang.String");
            N = cls;
        }
        this.v = new Class[]{cls};
        this.w = null;
        Class cls2 = O;
        if (cls2 == null) {
            cls2 = c(U31.c);
            O = cls2;
        }
        this.x = new Class[]{cls2};
        c0();
        if (z()) {
            B("Instance created.");
        }
    }

    public static /* synthetic */ Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static ClassLoader j(Class cls) {
        return U31.j(cls);
    }

    public static ClassLoader l() throws L31 {
        return U31.l();
    }

    public static ClassLoader m() throws L31 {
        return (ClassLoader) AccessController.doPrivileged(new V31());
    }

    public static String v(String str, String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new W31(str, str2));
    }

    public static boolean z() {
        return U31.z();
    }

    public void B(String str) {
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.q);
            stringBuffer.append(str);
            U31.D(stringBuffer.toString());
        }
    }

    @Override // o.U31
    public void H() {
        B("Releasing all known loggers");
        this.s.clear();
    }

    @Override // o.U31
    public void K(String str) {
        this.r.remove(str);
    }

    @Override // o.U31
    public void L(String str, Object obj) {
        boolean z;
        if (this.u != null) {
            B("setAttribute: call too late; configuration already performed.");
        }
        if (obj == null) {
            this.r.remove(str);
        } else {
            this.r.put(str, obj);
        }
        if (str.equals(U31.b)) {
            if (obj != null && Boolean.valueOf(obj.toString()).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            this.p = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x015e A[LOOP:0: B:6:0x0031->B:49:0x015e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0153 A[EDGE_INSN: B:72:0x0153->B:45:0x0153 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final J31 O(String str, String str2, boolean z) throws L31 {
        J31 j31;
        Class<?> cls;
        Class<?> cls2;
        Object newInstance;
        URL systemResource;
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Attempting to instantiate '");
            stringBuffer.append(str);
            stringBuffer.append("'");
            B(stringBuffer.toString());
        }
        Object[] objArr = {str2};
        ClassLoader R = R();
        Constructor<?> constructor = null;
        Class<?> cls3 = null;
        while (true) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Trying to load '");
            stringBuffer2.append(str);
            stringBuffer2.append("' from classloader ");
            stringBuffer2.append(U31.G(R));
            B(stringBuffer2.toString());
            try {
                try {
                    if (z()) {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append(str.replace('.', '/'));
                        stringBuffer3.append(C6497gD.d);
                        String stringBuffer4 = stringBuffer3.toString();
                        if (R != null) {
                            systemResource = R.getResource(stringBuffer4);
                        } else {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append(stringBuffer4);
                            stringBuffer5.append(C6497gD.d);
                            systemResource = ClassLoader.getSystemResource(stringBuffer5.toString());
                        }
                        if (systemResource == null) {
                            StringBuffer stringBuffer6 = new StringBuffer();
                            stringBuffer6.append("Class '");
                            stringBuffer6.append(str);
                            stringBuffer6.append("' [");
                            stringBuffer6.append(stringBuffer4);
                            stringBuffer6.append("] cannot be found.");
                            B(stringBuffer6.toString());
                        } else {
                            StringBuffer stringBuffer7 = new StringBuffer();
                            stringBuffer7.append("Class '");
                            stringBuffer7.append(str);
                            stringBuffer7.append("' was found at '");
                            stringBuffer7.append(systemResource);
                            stringBuffer7.append("'");
                            B(stringBuffer7.toString());
                        }
                    }
                    try {
                        cls = Class.forName(str, true, R);
                    } catch (ClassNotFoundException e) {
                        String message = e.getMessage();
                        StringBuffer stringBuffer8 = new StringBuffer();
                        stringBuffer8.append("The log adapter '");
                        stringBuffer8.append(str);
                        stringBuffer8.append("' is not available via classloader ");
                        stringBuffer8.append(U31.G(R));
                        stringBuffer8.append(": ");
                        stringBuffer8.append(message.trim());
                        B(stringBuffer8.toString());
                        try {
                            cls = Class.forName(str);
                        } catch (ClassNotFoundException e2) {
                            String message2 = e2.getMessage();
                            StringBuffer stringBuffer9 = new StringBuffer();
                            stringBuffer9.append("The log adapter '");
                            stringBuffer9.append(str);
                            stringBuffer9.append("' is not available via the LogFactoryImpl class classloader: ");
                            stringBuffer9.append(message2.trim());
                            B(stringBuffer9.toString());
                            break;
                        }
                    }
                    cls2 = cls;
                    constructor = cls2.getConstructor(this.v);
                    newInstance = constructor.newInstance(objArr);
                } catch (ExceptionInInitializerError e3) {
                    e = e3;
                } catch (NoClassDefFoundError e4) {
                    e = e4;
                } catch (Throwable th) {
                    th = th;
                }
                if (newInstance instanceof J31) {
                    try {
                        j31 = (J31) newInstance;
                        cls3 = cls2;
                        break;
                    } catch (ExceptionInInitializerError e5) {
                        e = e5;
                        cls3 = cls2;
                        String message3 = e.getMessage();
                        StringBuffer stringBuffer10 = new StringBuffer();
                        stringBuffer10.append("The log adapter '");
                        stringBuffer10.append(str);
                        stringBuffer10.append("' is unable to initialize itself when loaded via classloader ");
                        stringBuffer10.append(U31.G(R));
                        stringBuffer10.append(": ");
                        stringBuffer10.append(message3.trim());
                        B(stringBuffer10.toString());
                        j31 = null;
                        if (cls3 != null) {
                            this.t = str;
                            this.u = constructor;
                            try {
                                this.w = cls3.getMethod("setLogFactory", this.x);
                                StringBuffer stringBuffer11 = new StringBuffer();
                                stringBuffer11.append("Found method setLogFactory(LogFactory) in '");
                                stringBuffer11.append(str);
                                stringBuffer11.append("'");
                                B(stringBuffer11.toString());
                            } catch (Throwable th2) {
                                U31.w(th2);
                                this.w = null;
                                StringBuffer stringBuffer12 = new StringBuffer();
                                stringBuffer12.append("[INFO] '");
                                stringBuffer12.append(str);
                                stringBuffer12.append("' from classloader ");
                                stringBuffer12.append(U31.G(R));
                                stringBuffer12.append(" does not declare optional method ");
                                stringBuffer12.append("setLogFactory(LogFactory)");
                                B(stringBuffer12.toString());
                            }
                            StringBuffer stringBuffer13 = new StringBuffer();
                            stringBuffer13.append("Log adapter '");
                            stringBuffer13.append(str);
                            stringBuffer13.append("' from classloader ");
                            stringBuffer13.append(U31.G(cls3.getClassLoader()));
                            stringBuffer13.append(" has been selected for use.");
                            B(stringBuffer13.toString());
                        }
                        return j31;
                    } catch (NoClassDefFoundError e6) {
                        e = e6;
                        cls3 = cls2;
                        String message4 = e.getMessage();
                        StringBuffer stringBuffer14 = new StringBuffer();
                        stringBuffer14.append("The log adapter '");
                        stringBuffer14.append(str);
                        stringBuffer14.append("' is missing dependencies when loaded via classloader ");
                        stringBuffer14.append(U31.G(R));
                        stringBuffer14.append(": ");
                        stringBuffer14.append(message4.trim());
                        B(stringBuffer14.toString());
                        j31 = null;
                        if (cls3 != null) {
                        }
                        return j31;
                    } catch (Throwable th3) {
                        th = th3;
                        cls3 = cls2;
                        U31.w(th);
                        Y(str, R, th);
                        if (R != null) {
                        }
                    }
                } else {
                    Z(R, cls2);
                    if (R != null) {
                        break;
                    }
                    R = X(R);
                }
            } catch (L31 e7) {
                throw e7;
            }
        }
        j31 = null;
        if (cls3 != null && z) {
            this.t = str;
            this.u = constructor;
            this.w = cls3.getMethod("setLogFactory", this.x);
            StringBuffer stringBuffer112 = new StringBuffer();
            stringBuffer112.append("Found method setLogFactory(LogFactory) in '");
            stringBuffer112.append(str);
            stringBuffer112.append("'");
            B(stringBuffer112.toString());
            StringBuffer stringBuffer132 = new StringBuffer();
            stringBuffer132.append("Log adapter '");
            stringBuffer132.append(str);
            stringBuffer132.append("' from classloader ");
            stringBuffer132.append(U31.G(cls3.getClassLoader()));
            stringBuffer132.append(" has been selected for use.");
            B(stringBuffer132.toString());
        }
        return j31;
    }

    public final J31 P(String str) throws L31 {
        if (z()) {
            B("Discovering a Log implementation...");
        }
        b0();
        String Q2 = Q();
        if (Q2 != null) {
            if (z()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Attempting to load user-specified log class '");
                stringBuffer.append(Q2);
                stringBuffer.append("'...");
                B(stringBuffer.toString());
            }
            J31 O2 = O(Q2, str, true);
            if (O2 != null) {
                return O2;
            }
            StringBuffer stringBuffer2 = new StringBuffer("User-specified log class '");
            stringBuffer2.append(Q2);
            stringBuffer2.append("' cannot be found or is not useable.");
            a0(stringBuffer2, Q2, B);
            a0(stringBuffer2, Q2, C);
            a0(stringBuffer2, Q2, D);
            a0(stringBuffer2, Q2, E);
            throw new L31(stringBuffer2.toString());
        }
        if (z()) {
            B("No user-specified Log implementation; performing discovery using the standard supported logging implementations...");
        }
        J31 j31 = null;
        int i = 0;
        while (true) {
            String[] strArr = M;
            if (i >= strArr.length || j31 != null) {
                break;
            }
            j31 = O(strArr[i], str, true);
            i++;
        }
        if (j31 != null) {
            return j31;
        }
        throw new L31("No suitable Log implementation");
    }

    public final String Q() {
        if (z()) {
            B("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
        }
        String str = (String) g(H);
        if (str == null) {
            if (z()) {
                B("Trying to get log class from attribute 'org.apache.commons.logging.log'");
            }
            str = (String) g(I);
        }
        if (str == null) {
            if (z()) {
                B("Trying to get log class from system property 'org.apache.commons.logging.Log'");
            }
            try {
                str = v(H, null);
            } catch (SecurityException e) {
                if (z()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("No access allowed to system property 'org.apache.commons.logging.Log' - ");
                    stringBuffer.append(e.getMessage());
                    B(stringBuffer.toString());
                }
            }
        }
        if (str == null) {
            if (z()) {
                B("Trying to get log class from system property 'org.apache.commons.logging.log'");
            }
            try {
                str = v(I, null);
            } catch (SecurityException e2) {
                if (z()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("No access allowed to system property 'org.apache.commons.logging.log' - ");
                    stringBuffer2.append(e2.getMessage());
                    B(stringBuffer2.toString());
                }
            }
        }
        if (str != null) {
            return str.trim();
        }
        return str;
    }

    public final ClassLoader R() throws L31 {
        Class cls = P;
        if (cls == null) {
            cls = c(U31.d);
            P = cls;
        }
        ClassLoader j = j(cls);
        if (!this.p) {
            return j;
        }
        ClassLoader m = m();
        ClassLoader W = W(m, j);
        if (W == null) {
            if (this.y) {
                if (z()) {
                    B("[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl.");
                }
                return m;
            }
            throw new L31("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
        }
        if (W != m) {
            if (this.y) {
                if (z()) {
                    B("Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly.");
                    return W;
                }
            } else {
                throw new L31("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
        }
        return W;
    }

    public final boolean S(String str, boolean z) {
        String T = T(str);
        if (T == null) {
            return z;
        }
        return Boolean.valueOf(T).booleanValue();
    }

    public final String T(String str) {
        String v;
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[ENV] Trying to get configuration for item ");
            stringBuffer.append(str);
            B(stringBuffer.toString());
        }
        Object g = g(str);
        if (g != null) {
            if (z()) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Found LogFactory attribute [");
                stringBuffer2.append(g);
                stringBuffer2.append("] for ");
                stringBuffer2.append(str);
                B(stringBuffer2.toString());
            }
            return g.toString();
        }
        if (z()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[ENV] No LogFactory attribute found for ");
            stringBuffer3.append(str);
            B(stringBuffer3.toString());
        }
        try {
            v = v(str, null);
        } catch (SecurityException unused) {
            if (z()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Security prevented reading system property ");
                stringBuffer4.append(str);
                B(stringBuffer4.toString());
            }
        }
        if (v != null) {
            if (z()) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Found system property [");
                stringBuffer5.append(v);
                stringBuffer5.append("] for ");
                stringBuffer5.append(str);
                B(stringBuffer5.toString());
            }
            return v;
        }
        if (z()) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("[ENV] No system property found for property ");
            stringBuffer6.append(str);
            B(stringBuffer6.toString());
        }
        if (z()) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("[ENV] No configuration defined for item ");
            stringBuffer7.append(str);
            B(stringBuffer7.toString());
        }
        return null;
    }

    public String U() {
        if (this.t == null) {
            P(getClass().getName());
        }
        return this.t;
    }

    public Constructor V() throws L31 {
        if (this.u == null) {
            P(getClass().getName());
        }
        return this.u;
    }

    public final ClassLoader W(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader == null) {
            return classLoader2;
        }
        if (classLoader2 != null) {
            ClassLoader classLoader3 = classLoader;
            while (classLoader3 != null) {
                if (classLoader3 != classLoader2) {
                    classLoader3 = X(classLoader3);
                }
            }
            ClassLoader classLoader4 = classLoader2;
            while (classLoader4 != null) {
                if (classLoader4 == classLoader) {
                    return classLoader2;
                }
                classLoader4 = X(classLoader4);
            }
            return null;
        }
        return classLoader;
    }

    public final ClassLoader X(ClassLoader classLoader) {
        try {
            return (ClassLoader) AccessController.doPrivileged(new X31(this, classLoader));
        } catch (SecurityException unused) {
            B("[SECURITY] Unable to obtain parent classloader");
            return null;
        }
    }

    public final void Y(String str, ClassLoader classLoader, Throwable th) {
        Throwable targetException;
        Throwable exception;
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not instantiate Log '");
            stringBuffer.append(str);
            stringBuffer.append("' -- ");
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(": ");
            stringBuffer.append(th.getLocalizedMessage());
            B(stringBuffer.toString());
            if ((th instanceof InvocationTargetException) && (targetException = ((InvocationTargetException) th).getTargetException()) != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("... InvocationTargetException: ");
                stringBuffer2.append(targetException.getClass().getName());
                stringBuffer2.append(": ");
                stringBuffer2.append(targetException.getLocalizedMessage());
                B(stringBuffer2.toString());
                if ((targetException instanceof ExceptionInInitializerError) && (exception = ((ExceptionInInitializerError) targetException).getException()) != null) {
                    StringWriter stringWriter = new StringWriter();
                    exception.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("... ExceptionInInitializerError: ");
                    stringBuffer3.append(stringWriter.toString());
                    B(stringBuffer3.toString());
                }
            }
        }
        if (this.z) {
            return;
        }
        throw new L31(th);
    }

    public final void Z(ClassLoader classLoader, Class cls) throws L31 {
        Class cls2 = Q;
        if (cls2 == null) {
            cls2 = c(H);
            Q = cls2;
        }
        String name = cls2.getName();
        for (Class<?> cls3 : cls.getInterfaces()) {
            if (name.equals(cls3.getName())) {
                if (z()) {
                    try {
                        Class cls4 = Q;
                        if (cls4 == null) {
                            cls4 = c(H);
                            Q = cls4;
                        }
                        ClassLoader j = j(cls4);
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Class '");
                        stringBuffer.append(cls.getName());
                        stringBuffer.append("' was found in classloader ");
                        stringBuffer.append(U31.G(classLoader));
                        stringBuffer.append(". It is bound to a Log interface which is not");
                        stringBuffer.append(" the one loaded from classloader ");
                        stringBuffer.append(U31.G(j));
                        B(stringBuffer.toString());
                    } catch (Throwable th) {
                        U31.w(th);
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Error while trying to output diagnostics about bad class '");
                        stringBuffer2.append(cls);
                        stringBuffer2.append("'");
                        B(stringBuffer2.toString());
                    }
                }
                if (!this.A) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("Terminating logging for this context ");
                    stringBuffer3.append("due to bad log hierarchy. ");
                    stringBuffer3.append("You have more than one version of '");
                    Class cls5 = Q;
                    if (cls5 == null) {
                        cls5 = c(H);
                        Q = cls5;
                    }
                    stringBuffer3.append(cls5.getName());
                    stringBuffer3.append("' visible.");
                    if (z()) {
                        B(stringBuffer3.toString());
                    }
                    throw new L31(stringBuffer3.toString());
                } else if (z()) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("Warning: bad log hierarchy. ");
                    stringBuffer4.append("You have more than one version of '");
                    Class cls6 = Q;
                    if (cls6 == null) {
                        cls6 = c(H);
                        Q = cls6;
                    }
                    stringBuffer4.append(cls6.getName());
                    stringBuffer4.append("' visible.");
                    B(stringBuffer4.toString());
                    return;
                } else {
                    return;
                }
            }
        }
        if (!this.z) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("Terminating logging for this context. ");
            stringBuffer5.append("Log class '");
            stringBuffer5.append(cls.getName());
            stringBuffer5.append("' does not implement the Log interface.");
            if (z()) {
                B(stringBuffer5.toString());
            }
            throw new L31(stringBuffer5.toString());
        } else if (z()) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("[WARNING] Log class '");
            stringBuffer6.append(cls.getName());
            stringBuffer6.append("' does not implement the Log interface.");
            B(stringBuffer6.toString());
        }
    }

    public final void a0(StringBuffer stringBuffer, String str, String str2) {
        if (!str.equals(str2) && str.regionMatches(true, 0, str2, 0, G + 5)) {
            stringBuffer.append(" Did you mean '");
            stringBuffer.append(str2);
            stringBuffer.append("'?");
        }
    }

    public final void b0() {
        this.y = S(J, true);
        this.z = S(K, true);
        this.A = S(L, true);
    }

    public final void c0() {
        String str;
        ClassLoader j = j(getClass());
        if (j == null) {
            str = "BOOTLOADER";
        } else {
            try {
                str = U31.G(j);
            } catch (SecurityException unused) {
                str = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactoryImpl@");
        stringBuffer.append(System.identityHashCode(this));
        stringBuffer.append(" from ");
        stringBuffer.append(str);
        stringBuffer.append("] ");
        this.q = stringBuffer.toString();
    }

    public boolean d0() {
        return g0("Jdk13Lumberjack", D);
    }

    public boolean e0() {
        return g0("Jdk14", C);
    }

    public boolean f0() {
        return g0("Log4J", B);
    }

    @Override // o.U31
    public Object g(String str) {
        return this.r.get(str);
    }

    public final boolean g0(String str, String str2) {
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Checking for '");
            stringBuffer.append(str);
            stringBuffer.append("'.");
            B(stringBuffer.toString());
        }
        try {
            if (O(str2, getClass().getName(), false) == null) {
                if (z()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Did not find '");
                    stringBuffer2.append(str);
                    stringBuffer2.append("'.");
                    B(stringBuffer2.toString());
                }
                return false;
            } else if (z()) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Found '");
                stringBuffer3.append(str);
                stringBuffer3.append("'.");
                B(stringBuffer3.toString());
                return true;
            } else {
                return true;
            }
        } catch (L31 unused) {
            if (z()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Logging system '");
                stringBuffer4.append(str);
                stringBuffer4.append("' is available but not useable.");
                B(stringBuffer4.toString());
            }
            return false;
        }
    }

    @Override // o.U31
    public String[] h() {
        return (String[]) this.r.keySet().toArray(new String[this.r.size()]);
    }

    public J31 h0(String str) throws L31 {
        J31 j31;
        try {
            Constructor constructor = this.u;
            if (constructor == null) {
                j31 = P(str);
            } else {
                j31 = (J31) constructor.newInstance(str);
            }
            Method method = this.w;
            if (method != null) {
                method.invoke(j31, this);
            }
            return j31;
        } catch (InvocationTargetException e) {
            e = e;
            Throwable targetException = e.getTargetException();
            if (targetException != null) {
                e = targetException;
            }
            throw new L31(e);
        } catch (L31 e2) {
            throw e2;
        } catch (Throwable th) {
            U31.w(th);
            throw new L31(th);
        }
    }

    @Override // o.U31
    public J31 o(Class cls) throws L31 {
        return p(cls.getName());
    }

    @Override // o.U31
    public J31 p(String str) throws L31 {
        J31 j31 = (J31) this.s.get(str);
        if (j31 == null) {
            J31 h0 = h0(str);
            this.s.put(str, h0);
            return h0;
        }
        return j31;
    }
}
