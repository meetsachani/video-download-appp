package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import o.C10829xw0;
import o.C3735Ni1;
import o.C6566gU0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhaf {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(zzhad zzhadVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(zzhadVar, sb, 0);
        return sb.toString();
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            c(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append(CrashlyticsReportPersistence.m);
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzhbg.a(zzgxk.V((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzgxk) {
                sb.append(": \"");
                sb.append(zzhbg.a((zzgxk) obj));
                sb.append('\"');
            } else if (obj instanceof zzgys) {
                sb.append(" {");
                d((zzgys) obj, sb, i + 2);
                sb.append("\n");
                c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                int i3 = i + 2;
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                b(sb, i3, "key", entry2.getKey());
                b(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    public static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void d(zzhad zzhadVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzhadVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith(C10829xw0.c)) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith(C3735Ni1.a) && !substring.endsWith(C3735Ni1.b) && !substring.equals(C3735Ni1.a) && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i, substring.substring(0, substring.length() - 4), zzgys.v1(method2, zzhadVar, new Object[0]));
            } else if (substring.endsWith(C3735Ni1.c) && !substring.equals(C3735Ni1.c) && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i, substring.substring(0, substring.length() - 3), zzgys.v1(method, zzhadVar, new Object[0]));
            } else if (hashSet.contains(C10829xw0.c.concat(substring)) && (!substring.endsWith(C3735Ni1.d) || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object v1 = zzgys.v1(method4, zzhadVar, new Object[0]);
                    if (method5 == null) {
                        if (v1 instanceof Boolean) {
                            if (!((Boolean) v1).booleanValue()) {
                            }
                            b(sb, i, substring, v1);
                        } else if (v1 instanceof Integer) {
                            if (((Integer) v1).intValue() == 0) {
                            }
                            b(sb, i, substring, v1);
                        } else if (v1 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) v1).floatValue()) == 0) {
                            }
                            b(sb, i, substring, v1);
                        } else if (v1 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) v1).doubleValue()) == 0) {
                            }
                            b(sb, i, substring, v1);
                        } else {
                            if (v1 instanceof String) {
                                equals = v1.equals("");
                            } else if (v1 instanceof zzgxk) {
                                equals = v1.equals(zzgxk.Y);
                            } else if (v1 instanceof zzhad) {
                                if (v1 == ((zzhad) v1).R0()) {
                                }
                                b(sb, i, substring, v1);
                            } else {
                                if ((v1 instanceof Enum) && ((Enum) v1).ordinal() == 0) {
                                }
                                b(sb, i, substring, v1);
                            }
                            if (equals) {
                            }
                            b(sb, i, substring, v1);
                        }
                    } else {
                        if (!((Boolean) zzgys.v1(method5, zzhadVar, new Object[0])).booleanValue()) {
                        }
                        b(sb, i, substring, v1);
                    }
                }
            }
            i2 = 3;
        }
        if (zzhadVar instanceof zzgyo) {
            Iterator f = ((zzgyo) zzhadVar).zza.f();
            while (f.hasNext()) {
                Map.Entry entry2 = (Map.Entry) f.next();
                b(sb, i, C6566gU0.f + ((zzgyp) entry2.getKey()).X + C6566gU0.g, entry2.getValue());
            }
        }
        zzhbj zzhbjVar = ((zzgys) zzhadVar).zzt;
        if (zzhbjVar != null) {
            zzhbjVar.i(sb, i);
        }
    }
}
