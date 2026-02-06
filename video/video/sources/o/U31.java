package o;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

/* loaded from: classes4.dex */
public abstract class U31 {
    public static final String a = "priority";
    public static final String b = "use_tccl";
    public static final String c = "org.apache.commons.logging.LogFactory";
    public static final String d = "org.apache.commons.logging.impl.LogFactoryImpl";
    public static final String e = "commons-logging.properties";
    public static final String f = "META-INF/services/org.apache.commons.logging.LogFactory";
    public static final String g = "org.apache.commons.logging.diagnostics.dest";
    public static PrintStream h = null;
    public static final String i;
    public static final String j = "org.apache.commons.logging.LogFactory.HashtableImpl";
    public static final String k = "org.apache.commons.logging.impl.WeakHashtable";
    public static final ClassLoader l;
    public static Hashtable m;
    public static volatile U31 n;

    /* renamed from: o  reason: collision with root package name */
    public static /* synthetic */ Class f622o;

    static {
        String str;
        Class cls = f622o;
        if (cls == null) {
            cls = c(c);
            f622o = cls;
        }
        ClassLoader j2 = j(cls);
        l = j2;
        if (j2 == null) {
            str = "BOOTLOADER";
        } else {
            try {
                str = G(j2);
            } catch (SecurityException unused) {
                str = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactory from ");
        stringBuffer.append(str);
        stringBuffer.append("] ");
        i = stringBuffer.toString();
        h = y();
        Class cls2 = f622o;
        if (cls2 == null) {
            cls2 = c(c);
            f622o = cls2;
        }
        A(cls2);
        m = e();
        if (z()) {
            B("BOOTSTRAP COMPLETED");
        }
    }

    public static void A(Class cls) {
        if (!z()) {
            return;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[ENV] Extension directories (java.ext.dir): ");
            stringBuffer.append(System.getProperty("java.ext.dir"));
            B(stringBuffer.toString());
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("[ENV] Application classpath (java.class.path): ");
            stringBuffer2.append(System.getProperty("java.class.path"));
            B(stringBuffer2.toString());
        } catch (SecurityException unused) {
            B("[ENV] Security setting prevent interrogation of system classpaths.");
        }
        String name = cls.getName();
        try {
            ClassLoader j2 = j(cls);
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[ENV] Class ");
            stringBuffer3.append(name);
            stringBuffer3.append(" was loaded via classloader ");
            stringBuffer3.append(G(j2));
            B(stringBuffer3.toString());
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("[ENV] Ancestry of classloader which loaded ");
            stringBuffer4.append(name);
            stringBuffer4.append(" is ");
            C(stringBuffer4.toString(), j2);
        } catch (SecurityException unused2) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("[ENV] Security forbids determining the classloader for ");
            stringBuffer5.append(name);
            B(stringBuffer5.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(String str) {
        PrintStream printStream = h;
        if (printStream != null) {
            printStream.print(i);
            h.println(str);
            h.flush();
        }
    }

    public static void C(String str, ClassLoader classLoader) {
        if (z()) {
            if (classLoader != null) {
                String obj = classLoader.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(G(classLoader));
                stringBuffer.append(" == '");
                stringBuffer.append(obj);
                stringBuffer.append("'");
                B(stringBuffer.toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("ClassLoader tree:");
                    StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2.toString());
                    do {
                        stringBuffer3.append(G(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer3.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer3.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer3.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer3.append("BOOT");
                    B(stringBuffer3.toString());
                }
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append("Security forbids determining the system classloader.");
                B(stringBuffer4.toString());
            }
        }
    }

    public static final void D(String str) {
        PrintStream printStream = h;
        if (printStream != null) {
            printStream.println(str);
            h.flush();
        }
    }

    public static U31 E(String str, ClassLoader classLoader) {
        return F(str, classLoader, null);
    }

    public static U31 F(String str, ClassLoader classLoader, ClassLoader classLoader2) throws L31 {
        Object doPrivileged = AccessController.doPrivileged(new P31(str, classLoader));
        if (doPrivileged instanceof L31) {
            L31 l31 = (L31) doPrivileged;
            if (z()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("An error occurred while loading the factory class:");
                stringBuffer.append(l31.getMessage());
                B(stringBuffer.toString());
            }
            throw l31;
        }
        if (z()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Created object ");
            stringBuffer2.append(G(doPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(G(classLoader2));
            B(stringBuffer2.toString());
        }
        return (U31) doPrivileged;
    }

    public static String G(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(obj));
        return stringBuffer.toString();
    }

    public static void I(ClassLoader classLoader) {
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Releasing factory for classloader ");
            stringBuffer.append(G(classLoader));
            B(stringBuffer.toString());
        }
        Hashtable hashtable = m;
        synchronized (hashtable) {
            try {
                if (classLoader == null) {
                    if (n != null) {
                        n.H();
                        n = null;
                    }
                } else {
                    U31 u31 = (U31) hashtable.get(classLoader);
                    if (u31 != null) {
                        u31.H();
                        hashtable.remove(classLoader);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void J() {
        if (z()) {
            B("Releasing factory for all classloaders.");
        }
        Hashtable hashtable = m;
        synchronized (hashtable) {
            try {
                Enumeration elements = hashtable.elements();
                while (elements.hasMoreElements()) {
                    ((U31) elements.nextElement()).H();
                }
                hashtable.clear();
                if (n != null) {
                    n.H();
                    n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String M(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static void b(ClassLoader classLoader, U31 u31) {
        if (u31 != null) {
            if (classLoader == null) {
                n = u31;
            } else {
                m.put(classLoader, u31);
            }
        }
    }

    public static /* synthetic */ Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(e2.getMessage());
        }
    }

    public static Object d(String str, ClassLoader classLoader) {
        Class<?> cls = null;
        try {
            if (classLoader != null) {
                try {
                    try {
                        cls = classLoader.loadClass(str);
                        Class cls2 = f622o;
                        if (cls2 == null) {
                            cls2 = c(c);
                            f622o = cls2;
                        }
                        if (cls2.isAssignableFrom(cls)) {
                            if (z()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Loaded class ");
                                stringBuffer.append(cls.getName());
                                stringBuffer.append(" from classloader ");
                                stringBuffer.append(G(classLoader));
                                B(stringBuffer.toString());
                            }
                        } else if (z()) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Factory class ");
                            stringBuffer2.append(cls.getName());
                            stringBuffer2.append(" loaded from classloader ");
                            stringBuffer2.append(G(cls.getClassLoader()));
                            stringBuffer2.append(" does not extend '");
                            Class cls3 = f622o;
                            if (cls3 == null) {
                                cls3 = c(c);
                                f622o = cls3;
                            }
                            stringBuffer2.append(cls3.getName());
                            stringBuffer2.append("' as loaded by this classloader.");
                            B(stringBuffer2.toString());
                            C("[BAD CL TREE] ", classLoader);
                        }
                        return (U31) cls.newInstance();
                    } catch (ClassCastException unused) {
                        if (classLoader == l) {
                            boolean x = x(cls);
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("The application has specified that a custom LogFactory implementation ");
                            stringBuffer3.append("should be used but Class '");
                            stringBuffer3.append(str);
                            stringBuffer3.append("' cannot be converted to '");
                            Class cls4 = f622o;
                            if (cls4 == null) {
                                cls4 = c(c);
                                f622o = cls4;
                            }
                            stringBuffer3.append(cls4.getName());
                            stringBuffer3.append("'. ");
                            if (x) {
                                stringBuffer3.append("The conflict is caused by the presence of multiple LogFactory classes ");
                                stringBuffer3.append("in incompatible classloaders. ");
                                stringBuffer3.append("Background can be found in http://commons.apache.org/logging/tech.html. ");
                                stringBuffer3.append("If you have not explicitly specified a custom LogFactory then it is likely ");
                                stringBuffer3.append("that the container has set one without your knowledge. ");
                                stringBuffer3.append("In this case, consider using the commons-logging-adapters.jar file or ");
                                stringBuffer3.append("specifying the standard LogFactory from the command line. ");
                            } else {
                                stringBuffer3.append("Please check the custom implementation. ");
                            }
                            stringBuffer3.append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.");
                            if (z()) {
                                B(stringBuffer3.toString());
                            }
                            throw new ClassCastException(stringBuffer3.toString());
                        }
                    } catch (ClassNotFoundException e2) {
                        if (classLoader == l) {
                            if (z()) {
                                StringBuffer stringBuffer4 = new StringBuffer();
                                stringBuffer4.append("Unable to locate any class called '");
                                stringBuffer4.append(str);
                                stringBuffer4.append("' via classloader ");
                                stringBuffer4.append(G(classLoader));
                                B(stringBuffer4.toString());
                            }
                            throw e2;
                        }
                    }
                } catch (NoClassDefFoundError e3) {
                    if (classLoader == l) {
                        if (z()) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("Class '");
                            stringBuffer5.append(str);
                            stringBuffer5.append("' cannot be loaded");
                            stringBuffer5.append(" via classloader ");
                            stringBuffer5.append(G(classLoader));
                            stringBuffer5.append(" - it depends on some other class that cannot be found.");
                            B(stringBuffer5.toString());
                        }
                        throw e3;
                    }
                }
            }
            if (z()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("Unable to load factory class via classloader ");
                stringBuffer6.append(G(classLoader));
                stringBuffer6.append(" - trying the classloader associated with this LogFactory.");
                B(stringBuffer6.toString());
            }
            return (U31) Class.forName(str).newInstance();
        } catch (Exception e4) {
            if (z()) {
                B("Unable to create LogFactory instance.");
            }
            if (cls != null) {
                Class cls5 = f622o;
                if (cls5 == null) {
                    cls5 = c(c);
                    f622o = cls5;
                }
                if (!cls5.isAssignableFrom(cls)) {
                    return new L31("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e4);
                }
            }
            return new L31(e4);
        }
    }

    public static final Hashtable e() {
        String str;
        Hashtable hashtable = null;
        try {
            str = v(j, null);
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = k;
        }
        try {
            hashtable = (Hashtable) Class.forName(str).newInstance();
        } catch (Throwable th) {
            w(th);
            if (!k.equals(str)) {
                if (z()) {
                    B("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
        }
        if (hashtable == null) {
            return new Hashtable();
        }
        return hashtable;
    }

    public static ClassLoader f() throws L31 {
        try {
            return Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static U31 i(ClassLoader classLoader) {
        if (classLoader == null) {
            return n;
        }
        return (U31) m.get(classLoader);
    }

    public static ClassLoader j(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e2) {
            if (z()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e2.getMessage());
                B(stringBuffer.toString());
            }
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Properties k(ClassLoader classLoader, String str) {
        URL url;
        Enumeration u;
        double d2;
        Properties properties = null;
        try {
            u = u(classLoader, str);
        } catch (SecurityException unused) {
            url = null;
        }
        if (u == null) {
            return null;
        }
        url = null;
        double d3 = 0.0d;
        while (u.hasMoreElements()) {
            try {
                URL url2 = (URL) u.nextElement();
                Properties s = s(url2);
                if (s != null) {
                    if (properties == null) {
                        try {
                            String property = s.getProperty("priority");
                            if (property != null) {
                                d3 = Double.parseDouble(property);
                            } else {
                                d3 = 0.0d;
                            }
                            if (z()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("[LOOKUP] Properties file found at '");
                                stringBuffer.append(url2);
                                stringBuffer.append("'");
                                stringBuffer.append(" with priority ");
                                stringBuffer.append(d3);
                                B(stringBuffer.toString());
                            }
                            url = url2;
                            properties = s;
                        } catch (SecurityException unused2) {
                            url = url2;
                            properties = s;
                            if (z()) {
                                B("SecurityException thrown while trying to find/read config files.");
                            }
                            if (z()) {
                            }
                            return properties;
                        }
                    } else {
                        String property2 = s.getProperty("priority");
                        if (property2 != null) {
                            d2 = Double.parseDouble(property2);
                        } else {
                            d2 = 0.0d;
                        }
                        if (d2 > d3) {
                            if (z()) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("[LOOKUP] Properties file at '");
                                stringBuffer2.append(url2);
                                stringBuffer2.append("'");
                                stringBuffer2.append(" with priority ");
                                stringBuffer2.append(d2);
                                stringBuffer2.append(" overrides file at '");
                                stringBuffer2.append(url);
                                stringBuffer2.append("'");
                                stringBuffer2.append(" with priority ");
                                stringBuffer2.append(d3);
                                B(stringBuffer2.toString());
                            }
                            url = url2;
                            properties = s;
                            d3 = d2;
                        } else if (z()) {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("[LOOKUP] Properties file at '");
                            stringBuffer3.append(url2);
                            stringBuffer3.append("'");
                            stringBuffer3.append(" with priority ");
                            stringBuffer3.append(d2);
                            stringBuffer3.append(" does not override file at '");
                            stringBuffer3.append(url);
                            stringBuffer3.append("'");
                            stringBuffer3.append(" with priority ");
                            stringBuffer3.append(d3);
                            B(stringBuffer3.toString());
                        }
                    }
                }
            } catch (SecurityException unused3) {
            }
        }
        if (z()) {
            if (properties == null) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[LOOKUP] No properties file of name '");
                stringBuffer4.append(str);
                stringBuffer4.append("' found.");
                B(stringBuffer4.toString());
            } else {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[LOOKUP] Properties file of name '");
                stringBuffer5.append(str);
                stringBuffer5.append("' found at '");
                stringBuffer5.append(url);
                stringBuffer5.append('\"');
                B(stringBuffer5.toString());
            }
        }
        return properties;
    }

    public static ClassLoader l() throws L31 {
        return f();
    }

    private static ClassLoader m() throws L31 {
        return (ClassLoader) AccessController.doPrivileged(new O31());
    }

    public static U31 n() throws L31 {
        ClassLoader classLoader;
        BufferedReader bufferedReader;
        String property;
        ClassLoader m2 = m();
        if (m2 == null && z()) {
            B("Context classloader is null.");
        }
        U31 i2 = i(m2);
        if (i2 != null) {
            return i2;
        }
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[LOOKUP] LogFactory implementation requested for the first time for context classloader ");
            stringBuffer.append(G(m2));
            B(stringBuffer.toString());
            C("[LOOKUP] ", m2);
        }
        Properties k2 = k(m2, e);
        if (k2 != null && (property = k2.getProperty(b)) != null && !Boolean.valueOf(property).booleanValue()) {
            classLoader = l;
        } else {
            classLoader = m2;
        }
        if (z()) {
            B("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            String v = v(c, null);
            if (v != null) {
                if (z()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("[LOOKUP] Creating an instance of LogFactory class '");
                    stringBuffer2.append(v);
                    stringBuffer2.append("' as specified by system property ");
                    stringBuffer2.append(c);
                    B(stringBuffer2.toString());
                }
                i2 = F(v, classLoader, m2);
            } else if (z()) {
                B("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
            }
        } catch (SecurityException e2) {
            if (z()) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer3.append(M(e2.getMessage()));
                stringBuffer3.append("]. Trying alternative implementations...");
                B(stringBuffer3.toString());
            }
        } catch (RuntimeException e3) {
            if (z()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer4.append(M(e3.getMessage()));
                stringBuffer4.append("] as specified by a system property.");
                B(stringBuffer4.toString());
            }
            throw e3;
        }
        if (i2 == null) {
            if (z()) {
                B("[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
            }
            try {
                InputStream t = t(m2, f);
                if (t != null) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(t, "UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                        bufferedReader = new BufferedReader(new InputStreamReader(t));
                    }
                    String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    if (readLine != null && !"".equals(readLine)) {
                        if (z()) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("[LOOKUP]  Creating an instance of LogFactory class ");
                            stringBuffer5.append(readLine);
                            stringBuffer5.append(" as specified by file '");
                            stringBuffer5.append(f);
                            stringBuffer5.append("' which was present in the path of the context classloader.");
                            B(stringBuffer5.toString());
                        }
                        i2 = F(readLine, classLoader, m2);
                    }
                } else if (z()) {
                    B("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
                }
            } catch (Exception e4) {
                if (z()) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                    stringBuffer6.append(M(e4.getMessage()));
                    stringBuffer6.append("]. Trying alternative implementations...");
                    B(stringBuffer6.toString());
                }
            }
        }
        if (i2 == null) {
            if (k2 != null) {
                if (z()) {
                    B("[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use...");
                }
                String property2 = k2.getProperty(c);
                if (property2 != null) {
                    if (z()) {
                        StringBuffer stringBuffer7 = new StringBuffer();
                        stringBuffer7.append("[LOOKUP] Properties file specifies LogFactory subclass '");
                        stringBuffer7.append(property2);
                        stringBuffer7.append("'");
                        B(stringBuffer7.toString());
                    }
                    i2 = F(property2, classLoader, m2);
                } else if (z()) {
                    B("[LOOKUP] Properties file has no entry specifying LogFactory subclass.");
                }
            } else if (z()) {
                B("[LOOKUP] No properties file available to determine LogFactory subclass from..");
            }
        }
        if (i2 == null) {
            if (z()) {
                B("[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader).");
            }
            i2 = F(d, l, m2);
        }
        if (i2 != null) {
            b(m2, i2);
            if (k2 != null) {
                Enumeration<?> propertyNames = k2.propertyNames();
                while (propertyNames.hasMoreElements()) {
                    String str = (String) propertyNames.nextElement();
                    i2.L(str, k2.getProperty(str));
                }
            }
        }
        return i2;
    }

    public static J31 q(Class cls) throws L31 {
        return n().o(cls);
    }

    public static J31 r(String str) throws L31 {
        return n().p(str);
    }

    public static Properties s(URL url) {
        return (Properties) AccessController.doPrivileged(new S31(url));
    }

    public static InputStream t(ClassLoader classLoader, String str) {
        return (InputStream) AccessController.doPrivileged(new Q31(classLoader, str));
    }

    public static Enumeration u(ClassLoader classLoader, String str) {
        return (Enumeration) AccessController.doPrivileged(new R31(classLoader, str));
    }

    private static String v(String str, String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new T31(str, str2));
    }

    public static void w(Throwable th) {
        if (!(th instanceof ThreadDeath)) {
            if (!(th instanceof VirtualMachineError)) {
                return;
            }
            throw ((VirtualMachineError) th);
        }
        throw ((ThreadDeath) th);
    }

    public static boolean x(Class cls) {
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    B("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                    return false;
                }
                C("[CUSTOM LOG FACTORY] ", classLoader);
                boolean isAssignableFrom = Class.forName("o.U31", false, classLoader).isAssignableFrom(cls);
                if (isAssignableFrom) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("[CUSTOM LOG FACTORY] ");
                    stringBuffer.append(cls.getName());
                    stringBuffer.append(" implements LogFactory but was loaded by an incompatible classloader.");
                    B(stringBuffer.toString());
                    return isAssignableFrom;
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[CUSTOM LOG FACTORY] ");
                stringBuffer2.append(cls.getName());
                stringBuffer2.append(" does not implement LogFactory.");
                B(stringBuffer2.toString());
                return isAssignableFrom;
            } catch (ClassNotFoundException unused) {
                B("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            } catch (LinkageError e2) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer3.append(e2.getMessage());
                B(stringBuffer3.toString());
            } catch (SecurityException e3) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer4.append(e3.getMessage());
                B(stringBuffer4.toString());
            }
        }
        return false;
    }

    public static PrintStream y() {
        try {
            String v = v(g, null);
            if (v == null) {
                return null;
            }
            if (v.equals("STDOUT")) {
                return System.out;
            }
            if (v.equals("STDERR")) {
                return System.err;
            }
            return new PrintStream(new FileOutputStream(v, true));
        } catch (IOException | SecurityException unused) {
            return null;
        }
    }

    public static boolean z() {
        if (h != null) {
            return true;
        }
        return false;
    }

    public abstract void H();

    public abstract void K(String str);

    public abstract void L(String str, Object obj);

    public abstract Object g(String str);

    public abstract String[] h();

    public abstract J31 o(Class cls) throws L31;

    public abstract J31 p(String str) throws L31;
}
