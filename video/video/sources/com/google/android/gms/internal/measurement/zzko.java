package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzko {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(zzkj zzkjVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(zzkjVar, sb, 0);
        return sb.toString();
    }

    public static void b(int i, StringBuilder sb) {
        int i2;
        while (i > 0) {
            char[] cArr = a;
            if (i > cArr.length) {
                i2 = cArr.length;
            } else {
                i2 = i;
            }
            sb.append(cArr, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0196, code lost:
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0198, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a9, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01bb, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d1, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(zzkj zzkjVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzkjVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
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
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith(C3735Ni1.a) && !substring.endsWith(C3735Ni1.b) && !substring.equals(C3735Ni1.a) && (method2 = (Method) entry.getValue()) != null) {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    d(sb, i, substring.substring(0, substring.length() - 4), zzix.s(method2, zzkjVar, new Object[0]));
                    i2 = i3;
                }
            } else {
                i3 = i2;
            }
            if (substring.endsWith(C3735Ni1.c) && !substring.equals(C3735Ni1.c) && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                d(sb, i, substring.substring(0, substring.length() - 3), zzix.s(method, zzkjVar, new Object[0]));
            } else {
                if (hashSet.contains(C10829xw0.c + substring)) {
                    if (substring.endsWith(C3735Ni1.d)) {
                        if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                        }
                    }
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has" + substring);
                    if (method4 != null) {
                        Object s = zzix.s(method4, zzkjVar, new Object[0]);
                        if (method5 == null) {
                            booleanValue = true;
                            if (!(s instanceof Boolean)) {
                                if (!(s instanceof Integer)) {
                                    if (!(s instanceof Float)) {
                                        if (!(s instanceof Double)) {
                                            if (s instanceof String) {
                                                equals = s.equals("");
                                            } else if (s instanceof zzhm) {
                                                equals = s.equals(zzhm.Y);
                                            } else {
                                                equals = !(s instanceof zzkj) ? false : false;
                                            }
                                        }
                                    }
                                }
                            }
                            if (equals) {
                                booleanValue = false;
                            }
                        } else {
                            booleanValue = ((Boolean) zzix.s(method5, zzkjVar, new Object[0])).booleanValue();
                        }
                        if (booleanValue) {
                            d(sb, i, substring, s);
                        }
                    }
                }
            }
            i2 = i3;
        }
        if (zzkjVar instanceof zzix.zzd) {
            Iterator<Map.Entry<zzix.zzc, Object>> q = ((zzix.zzd) zzkjVar).zzc.q();
            if (q.hasNext()) {
                q.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        zzlz zzlzVar = ((zzix) zzkjVar).zzb;
        if (zzlzVar != null) {
            zzlzVar.h(sb, i);
        }
    }

    public static void d(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                d(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                d(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            b(i, sb);
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
                sb.append(zzlw.a(zzhm.j((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzhm) {
                sb.append(": \"");
                sb.append(zzlw.a((zzhm) obj));
                sb.append('\"');
            } else if (obj instanceof zzix) {
                sb.append(" {");
                c((zzix) obj, sb, i + 2);
                sb.append("\n");
                b(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                d(sb, i3, "key", entry2.getKey());
                d(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                b(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }
}
