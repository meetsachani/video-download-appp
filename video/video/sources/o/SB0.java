package o;

import java.security.AccessController;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class SB0 {
    public static final String a = "org.apache.commons.collections.enableUnsafeSerialization";

    public static void a(Class cls) {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new QB0());
        } catch (SecurityException unused) {
            str = null;
        }
        if ("true".equalsIgnoreCase(str)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Serialization support for ");
        stringBuffer.append(cls.getName());
        stringBuffer.append(" is disabled for security reasons. ");
        stringBuffer.append("To enable it set system property '");
        stringBuffer.append(a);
        stringBuffer.append("' to 'true', ");
        stringBuffer.append("but you must ensure that your application does not de-serialize objects from untrusted sources.");
        throw new UnsupportedOperationException(stringBuffer.toString());
    }

    public static InterfaceC8948qE[] b(InterfaceC8948qE[] interfaceC8948qEArr) {
        if (interfaceC8948qEArr == null) {
            return null;
        }
        return (InterfaceC8948qE[]) interfaceC8948qEArr.clone();
    }

    public static JF1[] c(JF1[] jf1Arr) {
        if (jf1Arr == null) {
            return null;
        }
        return (JF1[]) jf1Arr.clone();
    }

    public static InterfaceC3189Hs2[] d(InterfaceC3189Hs2[] interfaceC3189Hs2Arr) {
        if (interfaceC3189Hs2Arr == null) {
            return null;
        }
        return (InterfaceC3189Hs2[]) interfaceC3189Hs2Arr.clone();
    }

    public static void e(InterfaceC8948qE[] interfaceC8948qEArr) {
        if (interfaceC8948qEArr != null) {
            for (int i = 0; i < interfaceC8948qEArr.length; i++) {
                if (interfaceC8948qEArr[i] == null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("The closure array must not contain a null closure, index ");
                    stringBuffer.append(i);
                    stringBuffer.append(" was null");
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("The closure array must not be null");
    }

    public static void f(JF1[] jf1Arr) {
        if (jf1Arr != null) {
            for (int i = 0; i < jf1Arr.length; i++) {
                if (jf1Arr[i] == null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("The predicate array must not contain a null predicate, index ");
                    stringBuffer.append(i);
                    stringBuffer.append(" was null");
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("The predicate array must not be null");
    }

    public static void g(InterfaceC3189Hs2[] interfaceC3189Hs2Arr) {
        if (interfaceC3189Hs2Arr != null) {
            for (int i = 0; i < interfaceC3189Hs2Arr.length; i++) {
                if (interfaceC3189Hs2Arr[i] == null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("The transformer array must not contain a null transformer, index ");
                    stringBuffer.append(i);
                    stringBuffer.append(" was null");
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("The transformer array must not be null");
    }

    public static JF1[] h(Collection collection) {
        if (collection != null) {
            JF1[] jf1Arr = new JF1[collection.size()];
            Iterator it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                JF1 jf1 = (JF1) it.next();
                jf1Arr[i] = jf1;
                if (jf1 != null) {
                    i++;
                } else {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("The predicate collection must not contain a null predicate, index ");
                    stringBuffer.append(i);
                    stringBuffer.append(" was null");
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
            }
            return jf1Arr;
        }
        throw new IllegalArgumentException("The predicate collection must not be null");
    }
}
