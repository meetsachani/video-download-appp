package o;

import android.os.Build;
import android.os.Bundle;
import com.facebook.internal.C2379y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.g71  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6475g71 {
    public static boolean b;
    @Nullable
    public static JSONArray c;
    @NotNull
    public static final C6475g71 a = new C6475g71();
    @NotNull
    public static String[] d = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    @InterfaceC9511sW0
    public static final void a() {
        if (!SQ.e(C6475g71.class)) {
            try {
                a.g();
                if (c != null) {
                    b = true;
                }
            } catch (Throwable th) {
                SQ.c(th, C6475g71.class);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:5:0x000d, B:12:0x0032, B:18:0x0049, B:21:0x005c, B:24:0x0072, B:28:0x008a, B:15:0x0042, B:9:0x002b), top: B:33:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    @InterfaceC9511sW0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(@NotNull Bundle bundle, @NotNull String str) {
        String language;
        Locale J;
        String country;
        String R;
        String str2;
        String R2;
        if (SQ.e(C6475g71.class)) {
            return;
        }
        try {
            C6562gT0.p(bundle, "params");
            C6562gT0.p(str, "event");
            bundle.putString("event", str);
            StringBuilder sb = new StringBuilder();
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            Locale J2 = l0Var.J();
            String str3 = "";
            if (J2 != null) {
                language = J2.getLanguage();
                if (language == null) {
                }
                sb.append(language);
                sb.append('_');
                J = l0Var.J();
                if (J != null) {
                    country = J.getCountry();
                    if (country != null) {
                    }
                    sb.append(country);
                    bundle.putString("_locale", sb.toString());
                    R = l0Var.R();
                    if (R == null) {
                        R = "";
                    }
                    bundle.putString("_appVersion", R);
                    bundle.putString("_deviceOS", "ANDROID");
                    bundle.putString("_platform", "mobile");
                    str2 = Build.MODEL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    bundle.putString("_deviceModel", str2);
                    com.facebook.M m = com.facebook.M.a;
                    bundle.putString("_nativeAppID", com.facebook.M.o());
                    R2 = l0Var.R();
                    if (R2 != null) {
                        str3 = R2;
                    }
                    bundle.putString("_nativeAppShortVersion", str3);
                    bundle.putString("_timezone", l0Var.E());
                    bundle.putString("_carrier", l0Var.z());
                    bundle.putString("_deviceOSTypeName", "ANDROID");
                    bundle.putString("_deviceOSVersion", Build.VERSION.RELEASE);
                    bundle.putLong("_remainingDiskGB", l0Var.x());
                }
                country = "";
                sb.append(country);
                bundle.putString("_locale", sb.toString());
                R = l0Var.R();
                if (R == null) {
                }
                bundle.putString("_appVersion", R);
                bundle.putString("_deviceOS", "ANDROID");
                bundle.putString("_platform", "mobile");
                str2 = Build.MODEL;
                if (str2 == null) {
                }
                bundle.putString("_deviceModel", str2);
                com.facebook.M m2 = com.facebook.M.a;
                bundle.putString("_nativeAppID", com.facebook.M.o());
                R2 = l0Var.R();
                if (R2 != null) {
                }
                bundle.putString("_nativeAppShortVersion", str3);
                bundle.putString("_timezone", l0Var.E());
                bundle.putString("_carrier", l0Var.z());
                bundle.putString("_deviceOSTypeName", "ANDROID");
                bundle.putString("_deviceOSVersion", Build.VERSION.RELEASE);
                bundle.putLong("_remainingDiskGB", l0Var.x());
            }
            language = "";
            sb.append(language);
            sb.append('_');
            J = l0Var.J();
            if (J != null) {
            }
            country = "";
            sb.append(country);
            bundle.putString("_locale", sb.toString());
            R = l0Var.R();
            if (R == null) {
            }
            bundle.putString("_appVersion", R);
            bundle.putString("_deviceOS", "ANDROID");
            bundle.putString("_platform", "mobile");
            str2 = Build.MODEL;
            if (str2 == null) {
            }
            bundle.putString("_deviceModel", str2);
            com.facebook.M m22 = com.facebook.M.a;
            bundle.putString("_nativeAppID", com.facebook.M.o());
            R2 = l0Var.R();
            if (R2 != null) {
            }
            bundle.putString("_nativeAppShortVersion", str3);
            bundle.putString("_timezone", l0Var.E());
            bundle.putString("_carrier", l0Var.z());
            bundle.putString("_deviceOSTypeName", "ANDROID");
            bundle.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            bundle.putLong("_remainingDiskGB", l0Var.x());
        } catch (Throwable th) {
            SQ.c(th, C6475g71.class);
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String c(@NotNull JSONObject jSONObject) {
        if (SQ.e(C6475g71.class)) {
            return null;
        }
        try {
            C6562gT0.p(jSONObject, "logic");
            Iterator<String> keys = jSONObject.keys();
            if (!keys.hasNext()) {
                return null;
            }
            return keys.next();
        } catch (Throwable th) {
            SQ.c(th, C6475g71.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String d(@Nullable Bundle bundle) {
        Integer valueOf;
        String optString;
        if (SQ.e(C6475g71.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = c;
            if (jSONArray != null) {
                if (jSONArray == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(jSONArray.length());
                }
                if (valueOf != null && valueOf.intValue() == 0) {
                    return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                }
                JSONArray jSONArray2 = c;
                if (jSONArray2 != null) {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray2.length();
                    if (length > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            String optString2 = jSONArray2.optString(i);
                            if (optString2 != null) {
                                JSONObject jSONObject = new JSONObject(optString2);
                                long optLong = jSONObject.optLong("id");
                                if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && f(optString, bundle)) {
                                    arrayList.add(Long.valueOf(optLong));
                                }
                            }
                            if (i2 >= length) {
                                break;
                            }
                            i = i2;
                        }
                    }
                    String jSONArray3 = new JSONArray((Collection) arrayList).toString();
                    C6562gT0.o(jSONArray3, "JSONArray(res).toString()");
                    return jSONArray3;
                }
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        } catch (Throwable th) {
            SQ.c(th, C6475g71.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final ArrayList<String> e(@Nullable JSONArray jSONArray) {
        if (SQ.e(C6475g71.class) || jSONArray == null) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    arrayList.add(jSONArray.get(i).toString());
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            SQ.c(th, C6475g71.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final boolean f(@Nullable String str, @Nullable Bundle bundle) {
        int length;
        if (!SQ.e(C6475g71.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String c2 = c(jSONObject);
                if (c2 == null) {
                    return false;
                }
                Object obj = jSONObject.get(c2);
                int hashCode = c2.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && c2.equals("not")) {
                            return !f(obj.toString(), bundle);
                        }
                    } else if (c2.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length2 = jSONArray.length();
                        if (length2 > 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                if (!f(jSONArray.get(i).toString(), bundle)) {
                                    return false;
                                }
                                if (i2 >= length2) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        return true;
                    }
                } else if (c2.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            if (f(jSONArray2.get(i3).toString(), bundle)) {
                                return true;
                            }
                            if (i4 >= length) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return j(c2, jSONObject2, bundle);
            } catch (Throwable th) {
                SQ.c(th, C6475g71.class);
            }
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final void h(@Nullable Bundle bundle, @NotNull String str) {
        if (!SQ.e(C6475g71.class)) {
            try {
                C6562gT0.p(str, "event");
                if (b && bundle != null) {
                    try {
                        b(bundle, str);
                        bundle.putString("_audiencePropertyIds", d(bundle));
                        bundle.putString("cs_maca", "1");
                        i(bundle);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, C6475g71.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void i(@NotNull Bundle bundle) {
        if (!SQ.e(C6475g71.class)) {
            try {
                C6562gT0.p(bundle, "params");
                String[] strArr = d;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    i++;
                    bundle.remove(str);
                }
            } catch (Throwable th) {
                SQ.c(th, C6475g71.class);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0217 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0245 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0246 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0253 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0254 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:5:0x000a, B:8:0x001b, B:13:0x003f, B:12:0x0037, B:24:0x0068, B:27:0x0070, B:31:0x007d, B:34:0x0087, B:36:0x008d, B:38:0x0098, B:40:0x00a4, B:41:0x00a9, B:42:0x00aa, B:43:0x00af, B:44:0x00b0, B:47:0x00ba, B:51:0x00c6, B:161:0x0254, B:164:0x025b, B:165:0x025f, B:167:0x0265, B:169:0x026d, B:171:0x027c, B:174:0x028a, B:175:0x028f, B:176:0x0290, B:177:0x0295, B:54:0x00d0, B:57:0x00da, B:59:0x00e0, B:61:0x00eb, B:63:0x00f7, B:64:0x00fc, B:65:0x00fd, B:66:0x0102, B:67:0x0103, B:184:0x02a4, B:187:0x02ab, B:188:0x02af, B:190:0x02b5, B:192:0x02bd, B:194:0x02cc, B:197:0x02da, B:198:0x02df, B:199:0x02e0, B:200:0x02e5, B:70:0x010d, B:73:0x0117, B:75:0x011d, B:77:0x0128, B:79:0x0134, B:80:0x0139, B:81:0x013a, B:82:0x013f, B:83:0x0140, B:133:0x01f0, B:86:0x014a, B:126:0x01d4, B:89:0x0154, B:116:0x01ae, B:92:0x015e, B:95:0x0168, B:152:0x0235, B:98:0x0172, B:101:0x017c, B:247:0x0383, B:104:0x0186, B:140:0x0206, B:107:0x0190, B:110:0x019a, B:147:0x0222, B:113:0x01a4, B:120:0x01c0, B:123:0x01ca, B:130:0x01e6, B:137:0x01fc, B:144:0x0218, B:149:0x022b, B:156:0x0247, B:179:0x0297, B:202:0x02e7, B:205:0x02f1, B:207:0x02f7, B:209:0x0302, B:213:0x0311, B:214:0x0316, B:215:0x0317, B:216:0x031c, B:217:0x031d, B:220:0x0327, B:222:0x0330, B:240:0x036e, B:225:0x0339, B:228:0x0342, B:230:0x0350, B:233:0x0359, B:235:0x0362, B:242:0x0377, B:249:0x038c, B:252:0x0395, B:254:0x039b, B:256:0x03a6, B:260:0x03b5, B:261:0x03ba, B:262:0x03bb, B:263:0x03c0, B:20:0x0055), top: B:266:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02b5 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:5:0x000a, B:8:0x001b, B:13:0x003f, B:12:0x0037, B:24:0x0068, B:27:0x0070, B:31:0x007d, B:34:0x0087, B:36:0x008d, B:38:0x0098, B:40:0x00a4, B:41:0x00a9, B:42:0x00aa, B:43:0x00af, B:44:0x00b0, B:47:0x00ba, B:51:0x00c6, B:161:0x0254, B:164:0x025b, B:165:0x025f, B:167:0x0265, B:169:0x026d, B:171:0x027c, B:174:0x028a, B:175:0x028f, B:176:0x0290, B:177:0x0295, B:54:0x00d0, B:57:0x00da, B:59:0x00e0, B:61:0x00eb, B:63:0x00f7, B:64:0x00fc, B:65:0x00fd, B:66:0x0102, B:67:0x0103, B:184:0x02a4, B:187:0x02ab, B:188:0x02af, B:190:0x02b5, B:192:0x02bd, B:194:0x02cc, B:197:0x02da, B:198:0x02df, B:199:0x02e0, B:200:0x02e5, B:70:0x010d, B:73:0x0117, B:75:0x011d, B:77:0x0128, B:79:0x0134, B:80:0x0139, B:81:0x013a, B:82:0x013f, B:83:0x0140, B:133:0x01f0, B:86:0x014a, B:126:0x01d4, B:89:0x0154, B:116:0x01ae, B:92:0x015e, B:95:0x0168, B:152:0x0235, B:98:0x0172, B:101:0x017c, B:247:0x0383, B:104:0x0186, B:140:0x0206, B:107:0x0190, B:110:0x019a, B:147:0x0222, B:113:0x01a4, B:120:0x01c0, B:123:0x01ca, B:130:0x01e6, B:137:0x01fc, B:144:0x0218, B:149:0x022b, B:156:0x0247, B:179:0x0297, B:202:0x02e7, B:205:0x02f1, B:207:0x02f7, B:209:0x0302, B:213:0x0311, B:214:0x0316, B:215:0x0317, B:216:0x031c, B:217:0x031d, B:220:0x0327, B:222:0x0330, B:240:0x036e, B:225:0x0339, B:228:0x0342, B:230:0x0350, B:233:0x0359, B:235:0x0362, B:242:0x0377, B:249:0x038c, B:252:0x0395, B:254:0x039b, B:256:0x03a6, B:260:0x03b5, B:261:0x03ba, B:262:0x03bb, B:263:0x03c0, B:20:0x0055), top: B:266:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x036d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x036e A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:5:0x000a, B:8:0x001b, B:13:0x003f, B:12:0x0037, B:24:0x0068, B:27:0x0070, B:31:0x007d, B:34:0x0087, B:36:0x008d, B:38:0x0098, B:40:0x00a4, B:41:0x00a9, B:42:0x00aa, B:43:0x00af, B:44:0x00b0, B:47:0x00ba, B:51:0x00c6, B:161:0x0254, B:164:0x025b, B:165:0x025f, B:167:0x0265, B:169:0x026d, B:171:0x027c, B:174:0x028a, B:175:0x028f, B:176:0x0290, B:177:0x0295, B:54:0x00d0, B:57:0x00da, B:59:0x00e0, B:61:0x00eb, B:63:0x00f7, B:64:0x00fc, B:65:0x00fd, B:66:0x0102, B:67:0x0103, B:184:0x02a4, B:187:0x02ab, B:188:0x02af, B:190:0x02b5, B:192:0x02bd, B:194:0x02cc, B:197:0x02da, B:198:0x02df, B:199:0x02e0, B:200:0x02e5, B:70:0x010d, B:73:0x0117, B:75:0x011d, B:77:0x0128, B:79:0x0134, B:80:0x0139, B:81:0x013a, B:82:0x013f, B:83:0x0140, B:133:0x01f0, B:86:0x014a, B:126:0x01d4, B:89:0x0154, B:116:0x01ae, B:92:0x015e, B:95:0x0168, B:152:0x0235, B:98:0x0172, B:101:0x017c, B:247:0x0383, B:104:0x0186, B:140:0x0206, B:107:0x0190, B:110:0x019a, B:147:0x0222, B:113:0x01a4, B:120:0x01c0, B:123:0x01ca, B:130:0x01e6, B:137:0x01fc, B:144:0x0218, B:149:0x022b, B:156:0x0247, B:179:0x0297, B:202:0x02e7, B:205:0x02f1, B:207:0x02f7, B:209:0x0302, B:213:0x0311, B:214:0x0316, B:215:0x0317, B:216:0x031c, B:217:0x031d, B:220:0x0327, B:222:0x0330, B:240:0x036e, B:225:0x0339, B:228:0x0342, B:230:0x0350, B:233:0x0359, B:235:0x0362, B:242:0x0377, B:249:0x038c, B:252:0x0395, B:254:0x039b, B:256:0x03a6, B:260:0x03b5, B:261:0x03ba, B:262:0x03bb, B:263:0x03c0, B:20:0x0055), top: B:266:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0382 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0383 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:5:0x000a, B:8:0x001b, B:13:0x003f, B:12:0x0037, B:24:0x0068, B:27:0x0070, B:31:0x007d, B:34:0x0087, B:36:0x008d, B:38:0x0098, B:40:0x00a4, B:41:0x00a9, B:42:0x00aa, B:43:0x00af, B:44:0x00b0, B:47:0x00ba, B:51:0x00c6, B:161:0x0254, B:164:0x025b, B:165:0x025f, B:167:0x0265, B:169:0x026d, B:171:0x027c, B:174:0x028a, B:175:0x028f, B:176:0x0290, B:177:0x0295, B:54:0x00d0, B:57:0x00da, B:59:0x00e0, B:61:0x00eb, B:63:0x00f7, B:64:0x00fc, B:65:0x00fd, B:66:0x0102, B:67:0x0103, B:184:0x02a4, B:187:0x02ab, B:188:0x02af, B:190:0x02b5, B:192:0x02bd, B:194:0x02cc, B:197:0x02da, B:198:0x02df, B:199:0x02e0, B:200:0x02e5, B:70:0x010d, B:73:0x0117, B:75:0x011d, B:77:0x0128, B:79:0x0134, B:80:0x0139, B:81:0x013a, B:82:0x013f, B:83:0x0140, B:133:0x01f0, B:86:0x014a, B:126:0x01d4, B:89:0x0154, B:116:0x01ae, B:92:0x015e, B:95:0x0168, B:152:0x0235, B:98:0x0172, B:101:0x017c, B:247:0x0383, B:104:0x0186, B:140:0x0206, B:107:0x0190, B:110:0x019a, B:147:0x0222, B:113:0x01a4, B:120:0x01c0, B:123:0x01ca, B:130:0x01e6, B:137:0x01fc, B:144:0x0218, B:149:0x022b, B:156:0x0247, B:179:0x0297, B:202:0x02e7, B:205:0x02f1, B:207:0x02f7, B:209:0x0302, B:213:0x0311, B:214:0x0316, B:215:0x0317, B:216:0x031c, B:217:0x031d, B:220:0x0327, B:222:0x0330, B:240:0x036e, B:225:0x0339, B:228:0x0342, B:230:0x0350, B:233:0x0359, B:235:0x0362, B:242:0x0377, B:249:0x038c, B:252:0x0395, B:254:0x039b, B:256:0x03a6, B:260:0x03b5, B:261:0x03ba, B:262:0x03bb, B:263:0x03c0, B:20:0x0055), top: B:266:0x000a }] */
    @InterfaceC9511sW0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean j(@NotNull String str, @NotNull JSONObject jSONObject, @Nullable Bundle bundle) {
        Object obj;
        if (SQ.e(C6475g71.class)) {
            return false;
        }
        try {
            C6562gT0.p(str, "variable");
            C6562gT0.p(jSONObject, androidx.lifecycle.p.g);
            String c2 = c(jSONObject);
            if (c2 == null) {
                return false;
            }
            String obj2 = jSONObject.get(c2).toString();
            ArrayList<String> e = e(jSONObject.optJSONArray(c2));
            Boolean bool = null;
            if (C6562gT0.g(c2, "exists")) {
                if (bundle != null) {
                    bool = Boolean.valueOf(bundle.containsKey(str));
                }
                return C6562gT0.g(bool, Boolean.valueOf(Boolean.parseBoolean(obj2)));
            }
            if (bundle == null) {
                obj = null;
            } else {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                C6562gT0.o(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                obj = bundle.get(lowerCase);
            }
            if (obj == null) {
                if (bundle == null) {
                    obj = null;
                } else {
                    obj = bundle.get(str);
                }
                if (obj == null) {
                    return false;
                }
            }
            switch (c2.hashCode()) {
                case -1729128927:
                    if (c2.equals("i_not_contains")) {
                        String obj3 = obj.toString();
                        if (obj3 != null) {
                            Locale locale = Locale.ROOT;
                            String lowerCase2 = obj3.toLowerCase(locale);
                            C6562gT0.o(lowerCase2, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            if (obj2 != null) {
                                String lowerCase3 = obj2.toLowerCase(locale);
                                C6562gT0.o(lowerCase3, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                                if (C10763xf2.n3(lowerCase2, lowerCase3, false, 2, null)) {
                                    return false;
                                }
                                return true;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    return false;
                case -1179774633:
                    if (!c2.equals("is_any")) {
                        return false;
                    }
                    if (e != null) {
                        return false;
                    }
                    return e.contains(obj.toString());
                case -1039699439:
                    if (!c2.equals("not_in")) {
                        return false;
                    }
                    if (e != null) {
                        return false;
                    }
                    return e.contains(obj.toString());
                case -969266188:
                    if (!c2.equals("starts_with")) {
                        return false;
                    }
                    return C9545sf2.J2(obj.toString(), obj2, false, 2, null);
                case -966353971:
                    if (!c2.equals("regex_match")) {
                        return false;
                    }
                    return new C10219vQ1(obj2).m(obj.toString());
                case -665609109:
                    if (!c2.equals("is_not_any")) {
                        return false;
                    }
                    if (e != null) {
                    }
                    break;
                case -567445985:
                    if (!c2.equals("contains")) {
                        return false;
                    }
                    return C10763xf2.n3(obj.toString(), obj2, false, 2, null);
                case -327990090:
                    if (!c2.equals("i_str_neq")) {
                        return false;
                    }
                    String obj4 = obj.toString();
                    if (obj4 != null) {
                        Locale locale2 = Locale.ROOT;
                        String lowerCase4 = obj4.toLowerCase(locale2);
                        C6562gT0.o(lowerCase4, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        if (obj2 != null) {
                            String lowerCase5 = obj2.toLowerCase(locale2);
                            C6562gT0.o(lowerCase5, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            if (C6562gT0.g(lowerCase4, lowerCase5)) {
                                return false;
                            }
                            return true;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                case -159812115:
                    if (!c2.equals("i_is_any")) {
                        return false;
                    }
                    if (e != null || e.isEmpty()) {
                        return false;
                    }
                    for (String str2 : e) {
                        if (str2 != null) {
                            Locale locale3 = Locale.ROOT;
                            String lowerCase6 = str2.toLowerCase(locale3);
                            C6562gT0.o(lowerCase6, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            String obj5 = obj.toString();
                            if (obj5 != null) {
                                String lowerCase7 = obj5.toLowerCase(locale3);
                                C6562gT0.o(lowerCase7, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                                if (C6562gT0.g(lowerCase6, lowerCase7)) {
                                    return true;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    return false;
                case -92753547:
                    if (!c2.equals("i_str_not_in")) {
                        return false;
                    }
                    if (e != null) {
                        return false;
                    }
                    if (e.isEmpty()) {
                        return true;
                    }
                    for (String str3 : e) {
                        if (str3 != null) {
                            Locale locale4 = Locale.ROOT;
                            String lowerCase8 = str3.toLowerCase(locale4);
                            C6562gT0.o(lowerCase8, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            String obj6 = obj.toString();
                            if (obj6 != null) {
                                String lowerCase9 = obj6.toLowerCase(locale4);
                                C6562gT0.o(lowerCase9, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                                if (C6562gT0.g(lowerCase8, lowerCase9)) {
                                    return false;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    return true;
                case 60:
                    if (!c2.equals("<")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                        return false;
                    }
                    return true;
                case 61:
                    if (!c2.equals("=")) {
                        return false;
                    }
                    return C6562gT0.g(obj.toString(), obj2);
                case 62:
                    if (!c2.equals(">")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                        return false;
                    }
                    return true;
                case 1084:
                    if (!c2.equals("!=")) {
                        return false;
                    }
                    if (C6562gT0.g(obj.toString(), obj2)) {
                        return false;
                    }
                    return true;
                case 1921:
                    if (!c2.equals("<=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                        return false;
                    }
                    return true;
                case 1952:
                    if (!c2.equals("==")) {
                        return false;
                    }
                    return C6562gT0.g(obj.toString(), obj2);
                case 1983:
                    if (!c2.equals(">=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                        return false;
                    }
                    return true;
                case 3244:
                    if (!c2.equals("eq")) {
                        return false;
                    }
                    return C6562gT0.g(obj.toString(), obj2);
                case 3294:
                    if (!c2.equals(com.facebook.appevents.Q.p)) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                    }
                    break;
                case 3309:
                    if (!c2.equals(C10928yK2.f915o)) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                    }
                    break;
                case 3365:
                    if (!c2.equals("in")) {
                        return false;
                    }
                    if (e != null) {
                    }
                    break;
                case 3449:
                    if (!c2.equals("le")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                    }
                    break;
                case 3464:
                    if (!c2.equals(C10928yK2.n)) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                    }
                    break;
                case 3511:
                    if (!c2.equals("ne")) {
                        return false;
                    }
                    if (C6562gT0.g(obj.toString(), obj2)) {
                    }
                    break;
                case 102680:
                    if (!c2.equals("gte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                    }
                    break;
                case 107485:
                    if (!c2.equals("lte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                    }
                    break;
                case 108954:
                    if (!c2.equals("neq")) {
                        return false;
                    }
                    if (C6562gT0.g(obj.toString(), obj2)) {
                    }
                    break;
                case 127966736:
                    if (!c2.equals("i_str_eq")) {
                        return false;
                    }
                    String obj7 = obj.toString();
                    if (obj7 != null) {
                        Locale locale5 = Locale.ROOT;
                        String lowerCase10 = obj7.toLowerCase(locale5);
                        C6562gT0.o(lowerCase10, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        if (obj2 != null) {
                            String lowerCase11 = obj2.toLowerCase(locale5);
                            C6562gT0.o(lowerCase11, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            return C6562gT0.g(lowerCase10, lowerCase11);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                case 127966857:
                    if (!c2.equals("i_str_in")) {
                        return false;
                    }
                    if (e != null) {
                        return false;
                    }
                    while (r9.hasNext()) {
                    }
                    return false;
                case 363990325:
                    if (!c2.equals("i_contains")) {
                        return false;
                    }
                    String obj8 = obj.toString();
                    if (obj8 != null) {
                        Locale locale6 = Locale.ROOT;
                        String lowerCase12 = obj8.toLowerCase(locale6);
                        C6562gT0.o(lowerCase12, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        if (obj2 != null) {
                            String lowerCase13 = obj2.toLowerCase(locale6);
                            C6562gT0.o(lowerCase13, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            return C10763xf2.n3(lowerCase12, lowerCase13, false, 2, null);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                case 1091487233:
                    if (!c2.equals("i_is_not_any")) {
                        return false;
                    }
                    if (e != null) {
                    }
                    break;
                case 1918401035:
                    if (!c2.equals("not_contains") || C10763xf2.n3(obj.toString(), obj2, false, 2, null)) {
                        return false;
                    }
                    return true;
                case 1961112862:
                    if (!c2.equals("i_starts_with")) {
                        return false;
                    }
                    String obj9 = obj.toString();
                    if (obj9 != null) {
                        Locale locale7 = Locale.ROOT;
                        String lowerCase14 = obj9.toLowerCase(locale7);
                        C6562gT0.o(lowerCase14, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        if (obj2 != null) {
                            String lowerCase15 = obj2.toLowerCase(locale7);
                            C6562gT0.o(lowerCase15, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            return C9545sf2.J2(lowerCase14, lowerCase15, false, 2, null);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                default:
                    return false;
            }
        } catch (Throwable th) {
            SQ.c(th, C6475g71.class);
            return false;
        }
    }

    public final void g() {
        if (!SQ.e(this)) {
            try {
                com.facebook.internal.C c2 = com.facebook.internal.C.a;
                com.facebook.M m = com.facebook.M.a;
                C2379y q = com.facebook.internal.C.q(com.facebook.M.o(), false);
                if (q == null) {
                    return;
                }
                c = q.i();
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }
}
