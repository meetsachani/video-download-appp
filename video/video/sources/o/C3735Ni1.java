package o;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import o.IC0;

/* renamed from: o.Ni1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3735Ni1 {
    public static final String a = "List";
    public static final String b = "OrBuilderList";
    public static final String c = "Map";
    public static final String d = "Bytes";

    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append(CrashlyticsReportPersistence.m);
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (((Float) obj).floatValue() == 0.0f) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof AbstractC8616os) {
                return obj.equals(AbstractC8616os.Z0);
            }
            if (obj instanceof InterfaceC3540Li1) {
                if (obj == ((InterfaceC3540Li1) obj).u0()) {
                    return true;
                }
                return false;
            } else if ((obj instanceof Enum) && ((Enum) obj).ordinal() == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static final void c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                c(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                c(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C2468Am2.e((String) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC8616os) {
                sb.append(": \"");
                sb.append(C2468Am2.a((AbstractC8616os) obj));
                sb.append('\"');
            } else if (obj instanceof IC0) {
                sb.append(" {");
                d((IC0) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                c(sb, i4, "key", entry2.getKey());
                c(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    public static void d(InterfaceC3540Li1 interfaceC3540Li1, StringBuilder sb, int i) {
        Method[] declaredMethods;
        Map.Entry<IC0.g, Object> next;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC3540Li1.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst("get", "");
            boolean z = true;
            if (replaceFirst.endsWith(a) && !replaceFirst.endsWith(b) && !replaceFirst.equals(a)) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i, a(str2), IC0.L1(method2, interfaceC3540Li1, new Object[0]));
                }
            }
            if (replaceFirst.endsWith(c) && !replaceFirst.equals(c)) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i, a(str3), IC0.L1(method3, interfaceC3540Li1, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(C10829xw0.c + replaceFirst)) != null) {
                if (replaceFirst.endsWith(d)) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get" + replaceFirst);
                Method method5 = (Method) hashMap.get("has" + replaceFirst);
                if (method4 != null) {
                    Object L1 = IC0.L1(method4, interfaceC3540Li1, new Object[0]);
                    if (method5 == null) {
                        if (b(L1)) {
                            z = false;
                        }
                    } else {
                        z = ((Boolean) IC0.L1(method5, interfaceC3540Li1, new Object[0])).booleanValue();
                    }
                    if (z) {
                        c(sb, i, a(str4), L1);
                    }
                }
            }
        }
        if (interfaceC3540Li1 instanceof IC0.e) {
            Iterator<Map.Entry<IC0.g, Object>> H = ((IC0.e) interfaceC3540Li1).extensions.H();
            while (H.hasNext()) {
                c(sb, i, C6566gU0.f + next.getKey().k() + C6566gU0.g, H.next().getValue());
            }
        }
        C10888yA2 c10888yA2 = ((IC0) interfaceC3540Li1).unknownFields;
        if (c10888yA2 != null) {
            c10888yA2.q(sb, i);
        }
    }

    public static String e(InterfaceC3540Li1 interfaceC3540Li1, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(interfaceC3540Li1, sb, 0);
        return sb.toString();
    }
}
